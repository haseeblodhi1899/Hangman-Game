# Java Hangman Game

A **terminal-based Hangman game** written in Java, featuring multiple difficulty levels, score tracking, and an interactive gameplay experience.

## About This Project

I initially learned the basics of Java from Bro Code's YouTube channel and built this Hangman game as part of that learning process. However, I applied Object-Oriented Programming (OOP) concepts and added new features to enhance my understanding of Java and improve the gameplay experience.

## Features

- **Terminal-based Game**: Fully playable in the command line.
- **Multiple Difficulty Levels**: Easy, Medium, and Hard modes.
- **Random Word Selection**: Words are randomly selected from predefined lists.
- **Score Tracking**: Keeps track of total games played and wins.
- **ASCII Hangman Art**: A visual representation of the hangman as you play.
- **User-Friendly Menu**:
  - Start a new game
  - View scores
  - Read instructions
  - Change difficulty settings
  - Quit the game

## How to Play

1. The game randomly selects a word based on the chosen difficulty.
2. You guess one letter at a time.
3. Correct guesses reveal the letter's position in the word.
4. Incorrect guesses add parts to the hangman drawing.
5. You have a maximum of **6 wrong guesses** before the game is over.
6. Guess the word before the hangman is fully drawn to win!

## Folder Structure
```
│── src/
│   │── StartGame.java       # Entry point
│   │── Game.java            # Main game logic
│   │── WordManager.java     # Handles word selection & difficulty
│   │── HangmanArt.java      # ASCII art for Hangman stages
│   │── ScoreManager.java    # Tracks scores
│
│── resources/
│   │── easy_words.txt       # Word list for easy mode
│   │── medium_words.txt     # Word list for medium mode
│   │── hard_words.txt       # Word list for hard mode
│
│── README.md                # Game instructions & info
```

## Contributing
Contributions to this project are welcome! Please feel free to submit pull requests or open issues for bug fixes, feature additions, or improvements to the existing code. Be sure to follow the project's coding style and guidelines.

## Contact
If you have any questions or feedback, please feel free to contact me at haseeblodhi1899@gmail.com