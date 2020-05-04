import java.io*;
import java.util.HashMap;

public class Assembler {
	
	private String file;
	private int n = 16;
	
	public static void main(String[] args){
		Parser firstParse = new Parser(file);
		Parser secondParse = new Parser(file);

		//Index of Pre-defined Symbols
		HashMap<String,String> index = new HashMap<String,String>();
		index.put( "R0", "0" ); index.put( "R1", "1" ); index.put( "R2", "2" );
		index.put( "R3", "3" ); index.put( "R4", "4" ); index.put( "R5", "5" ); 
		index.put( "R6", "6" ); index.put( "R7", "7" ); index.put( "R8", "8" ); 
		index.put( "R9", "9" ); index.put( "R10", "10" ); index.put( "R11", "11" );
		index.put( "R12", "12" ); index.put( "R13", "13" ); index.put( "R14", "14" ); index.put( "R15", "15" );
        index.put( "SCREEN", "16384" ); index.put( "KBD", "24576" ); 
		index.put( "SP", "0" ); index.put( "LCL", "1" ); index.put( "ARG", "2" ); 
		index.put( "THIS", "3" ); index.put( "THAT", "4" );
		
		//Index of Label Symbols
		index.put("LOOP", "4"); index.put("STOP", "18"); index.put("END", "22");
		
		//Index of Variable Symbols
			//if seen for the first time, assign a unique memory address starting at 16
		firstParse.readFile();
		if(firstParse.findCommandType.equals("L"))
		//Translating A-instructions
			//decimal value --> binary value
			//symbol
			
		//Translating C-instructions
			//Parse it 
			//put each section into binary
			//reassemble
			
			HashMap<String,String> cIndex = new HashMap<String,String>();
			HashMap<String,String> dIndex = new HashMap<String,String>();
			HashMap<String,String> jIndex = new HashMap<String,String>();
	
			 cIndex.put( "0", "0101010" ); cIndex.put( "1", "0111111" ); cIndex.put( "-1", "0111010" ); 
			 cIndex.put( "D", "0001100" ); cIndex.put( "A", "0110000" ); cIndex.put( "M", "1110000" ); 
			 cIndex.put( "!D", "0001101" ); cIndex.put( "!A", "0110001" ); cIndex.put( "!M", "1110001" );
			 cIndex.put( "-D", "0001111" ); cIndex.put( "-A", "0110011" ); cIndex.put( "-M", "1110011" ); 
			 cIndex.put( "D+1", "0011111" ); cIndex.put( "A+1", "0110111" ); cIndex.put( "M+1", "1110111" );
			 cIndex.put( "D-1", "0001110" ); cIndex.put( "A-1", "0110010" ); cIndex.put( "M-1", "1110010" );
			 cIndex.put( "D+A", "0000010" ); cIndex.put( "D+M", "1000010" ); cIndex.put( "D-A", "0010011" );
			 cIndex.put( "D-M", "1010011" ); cIndex.put( "A-D", "0000111" ); cIndex.put( "M-D", "1000111" );
			 cIndex.put( "D&A", "0000000" ); cIndex.put( "D&M", "1000000" ); cIndex.put( "D|A", "0010101" ); cIndex.put( "D|M", "1010101" );

			 dIndex.put( "", "000" ); dIndex.put( "M", "001" ); dIndex.put( "D", "010" );
			 dIndex.put( "MD", "011" ); dIndex.put( "A", "100" ); dIndex.put( "AM", "101" );
			 dIndex.put( "AD", "110" ); dIndex.put( "AMD", "111" );
			 
			 jIndex.put( "", "000" ); jIndex.put( "JGT", "001" ); jIndex.put( "JEQ", "010" );
			 jIndex.put( "JGE", "011" ); jIndex.put( "JLT", "100" ); jIndex.put( "JNE", "101" );
			 jIndex.put( "JLE", "110" ); jIndex.put( "JMP", "111" );
	
}
	public String dest(String d){
		return dIndex.get(d);
	}
	public String comp(String c){
		return cIndex.get(c);
	}
	public String jump(String j){
		return jIndex.get(j);
	}
	
	
