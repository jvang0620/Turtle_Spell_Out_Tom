# Java Turtle Graphics: Spell Out "TOM"

This project demonstrates Tom the Turtle's ability to spell out the name "TOM" using turtle graphics. It involves a series of movements and turns to form the letters 'T', 'O', and 'M' on a 1000x1000 pixel canvas.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Setup](#setup)
- [Code Explanation](#code-explanation)
- [Future Enhancements](#future-enhancements)
- [License](#license)

## Overview

In this Java program, Tom the Turtle spells out the name "TOM" by drawing each letter sequentially. The program uses basic turtle commands like `forward()`, `turn()`, `penUp()`, and `penDown()` to control the turtle’s movements and create each letter shape.

## Features

- Uses turtle graphics to spell out the name "TOM" on a canvas.
- Demonstrates control over the turtle's movement and pen state.
- Uses precise angles and distances to form straight lines and curves for each letter.

## Setup

To run this project, you need to have Java installed on your system. Follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files:
   ```bash
   javac src/Main.java
   ```
3. Run the program:
   ```bash
   java src.Main
   ```

The program will open a 1000x1000 window where Tom the Turtle will spell out the name "TOM".

## Code Explanation

Here's a breakdown of how each letter is drawn:

### Drawing the Letter "T"

- **`tom.forward(100);`**: Draws the vertical stem of the "T".
- **`tom.turn(270);`**: Rotates the turtle to the left to draw the horizontal top of the "T".
- **`tom.penUp(); tom.forward(50);`**: Moves the turtle into position for the next letter.

### Drawing the Letter "O"

- **`tom.forward(100);`**: Draws the left side of the "O".
- **`tom.turnRight(); tom.forward(100);`**: Draws the top side.
- **`tom.turnRight(); tom.forward(100);`**: Draws the right side.
- **`tom.turnRight(); tom.forward(100);`**: Draws the bottom side, completing the "O".

### Drawing the Letter "M"

- **`tom.forward(100);`**: Draws the left side of the "M".
- **`tom.turn(140); tom.forward(80);`**: Draws the first diagonal of the "M".
- **`tom.turn(-100); tom.forward(80);`**: Draws the second diagonal.
- **`tom.turn(140); tom.forward(100);`**: Completes the "M" by drawing the right side.

## Future Enhancements

Potential improvements for this project include:

- Implementing different font styles and sizes for the letters.
- Adding user input to spell out custom words or phrases.
- Animating the turtle's movements to show each letter being drawn in real-time.

## License

This project is open-source and available under the [MIT License](LICENSE).
