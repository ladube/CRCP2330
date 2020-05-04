import java.io*;
import java.util.HashMap;
public class Parser{
	private BufferedReader br;
	String line;

	public Parser(String file){

		br = new BufferedReader(new FileReader(file));
	}

	public void readFile(){
		line = br.readLine();
		if(line.length() != 0){
			
		}
	}

	public enum findCommandType(){
		if(line.charAt(0) == '('){
				//it is a Label Command
				return L;
			}else if(line.charAt(0) == '@'){
				//it is a A Command
				return A;
			}else{
				//it is a C Command
				return C;
			}
	}
	
}