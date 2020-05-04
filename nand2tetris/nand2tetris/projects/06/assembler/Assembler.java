import java.io*;
import java.util.HashMap;

public class Assembler {
	
	private String file;
	
	public static void main(String[] args){
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

}
