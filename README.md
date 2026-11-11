✊✋✌️ Rock, Paper, Scissors

A console Rock, Paper, Scissors game written in Java. You face off against the computer, round after round, for as long as you want.

This is the first game I've ever built. It's simple, but it was fun and fast to make, and a great way to practice the Java basics.

🎮 Features
Personalized welcome: the game asks for your name and uses it throughout
Case-insensitive input: rock, Rock and ROCK all work
Input validation: typing something that isn't Rock, Paper or Scissors gets you a friendly reminder of the valid moves
A random opponent: the computer picks its move at random every round
Live scoreboard: player and computer wins are shown after every round
Win and loss streaks: win 3 or more rounds in a row and the game hypes you up. Lose 3 or more in a row and it lets you know you're down bad 😅
Play as long as you like: after each round, answer yes to keep going or no to stop

🕹️ How to Play
Run the game
Enter your name
Choose your move: Rock, Paper or Scissors
See what the computer picked and who won
Type yes to play another round, or no to quit

The rules:

🪨 Rock beats ✂️ Scissors
✂️ Scissors beats 📄 Paper
📄 Paper beats 🪨 Rock
Same move = tie

Streaks: a win adds to your streak and resets the computer's. A loss does the opposite. A tie resets both.

🚀 How to Run

Requirement: Java 17 or newer. Check you have it by running java -version in a terminal.

⚠️ This is a console game, so run it from a terminal.

Option 1: Run the ready-made .jar (easiest)
Download RockPaperScissors.jar from this repository
Open a terminal in the folder where you saved it
Run:

bash
java -jar RockPaperScissors.jar


Option 2: Compile and run from source

Clone the repository and, from the project root:

Windows (PowerShell):

powershell
javac -d build src\*.java
java -cp build Main

Linux / macOS:

bash
javac -d build src/*.java
java -cp build Main


Option 3: IntelliJ IDEA

Open the project and run Main.java with the green ▶️ button.


📁 Project Structure
RockPaperScissors/
└── src/
    ├── Main.java       # Game loop, input handling, scoring and streaks
    └── MoveType.java   # Enum with the three possible moves


🧠 What I Practiced
Reading user input with Scanner
Generating random choices with Random
Using an enum to represent the possible moves
do-while loops for the "play again?" flow
Conditional logic with if / else if / else and combined conditions (&&, ||)
Tracking game state with counters (scores and streaks)
