YOUTUBE LINK : https://youtu.be/C-j37TmPI44

Overview
This Android game features a really fun and very educational True or False Quiz based on the historical facts.  The app, built in Android Studio with Kotlin, is divided into three screens: a Welcome screen, a Quiz screen, and a Score + Review screen.  It allows users to test and learn fundamental historical knowledge using interactive UI components and real-time feedback. 
 Screen 1: Welcome Screen

<img width="174" alt="image" src="https://github.com/user-attachments/assets/8915b888-12ce-4e67-9b9b-bdd7a3c3f072" />


 <img width="286" alt="image" src="https://github.com/user-attachments/assets/3c4122ac-ce93-44fe-993e-910e62f61e7a" />


What it Does
The Welcome screen is the user’s first interaction with the app. Also it includes a very simple layout with a Start button that transitions to the quiz screen using an Intent.

val startButton = findViewById<Button>(R.id.startButton)
startButton.setOnClickListener {
val intent = Intent(this, QuizActivity::class.java)
startActivity(intent)
}

 GUI Elements
Button (Start button)
ConstraintLayout (overall layout)
Styling includes padding via ViewCompat.setOnApplyWindowInsetsListener for proper display on various devices.
Explanation
This screen will show the use of the event listeners and the explicit Intents to handle the navigation — foundational skills in Android development (Hardy, 2020).


Screen 2: Quiz Screen


<img width="191" alt="image" src="https://github.com/user-attachments/assets/9d16fd3a-3889-4d6c-8703-d8e72c74f587" />


<img width="265" alt="image" src="https://github.com/user-attachments/assets/3973109b-52ec-42a2-9566-e1ee25effa85" />



<img width="228" alt="image" src="https://github.com/user-attachments/assets/13990418-f631-40da-b619-53d377b758ff" />



<img width="316" alt="image" src="https://github.com/user-attachments/assets/606a75cf-64c3-407e-a466-b2ddc56f0f54" />



What it Does
The Quiz screen displays each question, has True/False buttons for selecting an answer, and delivers fast response.  It keeps track of the score and advances to the next question when the Next button is pushed.
Loops and Logic

A for loop is not used here, but logic is controlled through an index (currentIndex) that progresses with nextButton.setOnClickListener. Score tracking is updated using score++ if the answer is correct.
GUI Elements
TextView for questions and feedback
Button widgets for "True", "False", and "Next"
Data Types and Variables
questions: Array<String>
answers: BooleanArray
currentIndex, score: Int

These basic data types allow efficient question handling and scoring logic (Android Developers, 2023).


Screen 3: Score + Review Screen


<img width="161" alt="image" src="https://github.com/user-attachments/assets/9257abd9-3686-444f-b002-cf29201e6b4d" />



<img width="261" alt="image" src="https://github.com/user-attachments/assets/ab00266e-720b-4ee9-bd8a-598f7b76f64f" />



<img width="285" alt="image" src="https://github.com/user-attachments/assets/375efb7a-c93d-423a-84d2-6c4bee1b863c" />


<img width="415" alt="image" src="https://github.com/user-attachments/assets/a315fbed-24dc-4025-a15c-36c301f17db2" />


What it Does
After finishing the quiz, users are shown:
Their score out of 5.
A motivational message.
A full review of each question and its correct answer.
A button to exit the app.
val score = intent.getIntExtra("score", 0)
scoreText.text = "You got $score out of 5"

// Looping through questions for review:for (i in questions.indices) {
reviewText += "${i + 1}. ${questions[i]}\nAnswer: ${correctAnswers[i]}\n\n"
}
Loops and Logic:

This page creates the review summary using a for loop, allowing the users to reflect on what they did correctly or incorrectly.
GUI Elements:

TextView for scoring and the feedback.
For a complete evaluation, use TextView.
Button for "Exit".
Data Types and Techniques.
Uses getIntExtra() to get the previous screen's score.
String concatenation is used in a loop to compile all the review data.
Uses conditional logic (if) to convey motivational messages.
This layout encourages for user learning through feedback, a well-known feature of quiz-based apps (Sharples et al., 2015).


Summary

This True/False History Quiz app is a very quick and really fun way to mix Kotlin logic, Android Studio GUI design, and educational participation. It explains key ideas like:

Activity navigation using Intents.
Event-driven UI with setOnClickListener.
Loops and conditionals.
Passing data between the screens.
Basic data types and arrays.
By integrating learning with fun, the app really supports user retention and engagement.

References (Harvard Style)
Android Developers (2023) Intents and Intent Filters. Available at: https://developer.android.com/guide/components/intents-filters (Accessed: 4 May 2025).
Hardy, M. (2020) Mastering Android Development with Kotlin. 2nd edn. Birmingham: Packt Publishing.
Sharples, M., de Roock, R., Ferguson, R., Gaved, M., Herodotou, C., Koh, E., Kukulska-Hulme, A., Looi, C.-K., McAndrew, P., Rienties, B., Weller, M. and Wong, L.H. (2015) Innovating Pedagogy 2015: Open University Innovation Report 4. Milton Keynes: The Open University.








