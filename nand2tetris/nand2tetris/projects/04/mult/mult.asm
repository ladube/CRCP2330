// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Mult.asm

// Multiplies R0 and R1 and stores the result in R2.
// (R0, R1, R2 refer to RAM[0], RAM[1], and RAM[2], respectively.)

// Put your code here.

//(LOOP) to add R0 R1 times
(LOOP)
	ADD R2,R2,R0
	SUB R1,R1,#1 
	@END
	R1;JEQ //if R1 = 0 , Jump to End
	@LOOP
	0;JMP //loops back
(END) 
	@End
	0;JMP //infinite loop
	