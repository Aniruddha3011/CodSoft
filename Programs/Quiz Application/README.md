This Quiz Application is a Java Swing-based GUI program designed to simulate an interactive quiz game. Below is the detailed description of the application in a structured manner:


---

Project Overview

This project consists of four main components:

1. Login Page: Allows users to enter their name and navigate to the rules section.


2. Rules Page: Displays the quiz rules in an interactive and humorous way.


3. Quiz Page: The core functionality where users answer a set of questions under a timer.


4. Score Page: Displays the user's final score after completing the quiz.




---

Features

Fully interactive GUI using Java Swing.

Dynamic question rendering with multiple-choice options.

Timer-based questions to increase the challenge.

A 50-50 lifeline to remove two incorrect options.

Real-time feedback on score and user input.



---

Code Descriptions

1. Login Page (Login.java):

  Users input their name to begin the quiz.
  
  Buttons:
  
  Rules: Navigates to the rules section.
  
  Back: Closes the application.
  
  
  Background image and customized fonts are used for a visually appealing design.



2. Rules Page (Rules.java):

  Displays the rules for the quiz in a styled, readable format using JLabel.
  
  Buttons:
  
  Start: Proceeds to the quiz.
  
  Back: Returns to the login page.




3. Quiz Page (Quiz.java):

  Displays 10 multiple-choice questions.
  
  Features include:
  
  Timer: Users have 15 seconds per question.
  
  Next Button: Moves to the next question.
  
  50-50 Lifeline: Removes two incorrect options.
  
  Submit Button: Finalizes the answers and calculates the score.
  
  
  Score is calculated based on correct answers.



4. Score Page (Score.java):

  Displays the final score with a thank-you message.
  
  Buttons:
  
  Play Again: Restarts the quiz from the login page.
  
  Exit: Closes the application.






---

Workflow

The application follows this flow:

  1. User starts at the Login Page and enters their name.
  
  
  2. They proceed to the Rules Page to read the instructions.
  
  
  3. After reading the rules, they begin the quiz on the Quiz Page:
  
  Answer questions within a 15-second timer.
  
  Use a lifeline if needed.
  
  
  
  4. After completing all questions or submitting early, the Score Page displays the results.
  
  
  5. Users can either replay the quiz or exit the application.




---

Below is a flowchart representing the workflow of the Quiz Application:


+------------------+
|   Login Page     |
| (Enter Name)     |
+------------------+
         |
         v
+------------------+
|   Rules Page     |
| (Read Rules)     |
+------------------+
         |
         v
+------------------+
|   Quiz Page      |
| (10 Questions)   |
| Timer & Lifeline |
+------------------+
         |
         v
+------------------+
|   Score Page     |
| (View Results)   |
| Play Again/Exit  |
+------------------+



Future Improvements

  Add a database to save user scores for analysis.
  
  Implement dynamic question fetching from an external source (e.g., a JSON file).
  
  Create a more advanced lifeline system
