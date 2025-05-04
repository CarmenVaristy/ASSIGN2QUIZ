package com.example.myassignment2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val score = intent.getIntExtra("score", 0)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val scoreFeedback = findViewById<TextView>(R.id.scoreFeedback)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        scoreText.text = "You scored $score out of 5"

        scoreFeedback.text = if (score >= 3) {
            "Great job!"
        } else {
            "Keep practicing!"
        }

        exitButton.setOnClickListener {
            finishAffinity() // closes the whole app
        }
        val questions = arrayOf(
            "Nelson Mandela was president in 1994.",
            "The Eiffel Tower is in Italy.",
            "World War I ended in 1945.",
            "The Great Wall is in China.",
            "The moon landing happened in 1969."
        )
        val correctAnswers = arrayOf("True", "False", "False", "True", "True")


        val reviewBox = findViewById<TextView>(R.id.reviewTextBox)


        // Build the full review text
        var reviewText = ""
        for (i in questions.indices) {
            reviewText += "${i + 1}. ${questions[i]}\nAnswer: ${correctAnswers[i]}\n\n"
        }

        // Show all questions and answers in one box
        reviewBox.text = reviewText


    //Reference list entry:
    //Gupta, T., 2023. Quiz App in Kotlin [Source code].
    // GitHub. Available at: https://github.com/tanyagupta0201/Quiz-App [Accessed 4 May 2025].

    // Reference list entry:
    // OpenAI, 2025. Kotlin code for score and review display in an Android quiz app.
    // Generated in response to a user prompt on ChatGPT, 4 May. Available at: https://chat.openai.com/ [Accessed 4 May 2025].
}
        }



