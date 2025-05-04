package com.example.myassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



        class QuizActivity : AppCompatActivity() {

            // Questions and their correct answers
            private val questions = arrayOf(
                "Nelson Mandela was president in 1994.",
                "The Eiffel Tower is in Italy.",
                "World War I ended in 1945.",
                "The Great Wall is in China.",
                "The moon landing happened in 1969."
            )
            private val answers = booleanArrayOf(true, false, false, true, true)

            private var currentIndex = 0
            private var score = 0

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_quiz)

                val questionText = findViewById<TextView>(R.id.questionText)
                val feedbackText = findViewById<TextView>(R.id.answerFeedback)
                val trueButton = findViewById<Button>(R.id.trueButton)
                val falseButton = findViewById<Button>(R.id.falseButton)
                val nextButton = findViewById<Button>(R.id.nextButton)

                // Show the first question
                questionText.text = questions[currentIndex]

                fun checkAnswer(userAnswer: Boolean) {
                    val correctAnswer = answers[currentIndex]
                    if (userAnswer == correctAnswer) {
                        feedbackText.text = "Correct!"
                        score++
                    } else {
                        feedbackText.text = "Incorrect!"
                    }
                    // Disable True/False buttons after answering
                    trueButton.isEnabled = false
                    falseButton.isEnabled = false
                }

                trueButton.setOnClickListener { checkAnswer(true) }
                falseButton.setOnClickListener { checkAnswer(false) }

                nextButton.setOnClickListener {
                    currentIndex++
                    if (currentIndex < questions.size) {
                        // Move to next question
                        questionText.text = questions[currentIndex]
                        feedbackText.text = ""
                        trueButton.isEnabled = true
                        falseButton.isEnabled = true
                    } else {
                        // Go to Score screen
                        val intent = Intent(this, ScoreActivity::class.java)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }

