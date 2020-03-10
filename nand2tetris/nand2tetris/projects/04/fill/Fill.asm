// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input.
// When a key is pressed (any key), the program blackens the screen,
// i.e. writes "black" in every pixel;
// the screen should remain fully black as long as the key is pressed. 
// When no key is pressed, the program clears the screen, i.e. writes
// "white" in every pixel;
// the screen should remain fully clear as long as no key is pressed.

// Put your code here.
(SCREEN)
@SCREEN 
D = A //get the address of screen 
@R0
M = D //put that in a register

//Keyboard
@KBD
D = M
//when not 0 go to Fill
@FILL
D;JNE
//when 0 go to Clear
@CLEAR
D;JEQ

(FILL)
//Filling screen with (1111111111111111 = -1)
@R1
M = -1
D = M
@R0 //get screen address and set it to D
A = M
M = D

//increment screen 32 words per 256 rows

@FILL
//so far it only reaches the first pixel
//it needs to be recursive
@KBD
//go back to keyboard, not on to clear


(CLEAR)
//or filling screen with 0
@R1
M = 0
/*
D = M
@R0 
A = M
M = D
*/ This is repeat so can be put into one block called by Fill and Clear

(END) //doesn't actually end - needs to loop back to Screen
@SCREEN
0;JMP
