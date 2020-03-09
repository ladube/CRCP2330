// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Mult.asm

// Multiplies R0 and R1 and stores the result in R2.
// (R0, R1, R2 refer to RAM[0], RAM[1], and RAM[2], respectively.)

// Put your code here.

//(LOOP) to add R0 R1 times

//R2 = 0
@R2
M = 0


(LOOP)
	//Get R2
	@R2
	D = M
	//ADD R2,R2,R0
	@R0
	D = D + M
	@R2
	M = D
	//SUB R1,R1,#1 
	@R1
	D = M - 1
	M = D
	
		//@END
		//R1;JEQ //if R1 = 0 , Jump to End
	@LOOP
	D;JGT //loops back if R1 > 0
	
	
(END) 
	@End
	0;JMP //infinite loop
	