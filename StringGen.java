import java.util.Scanner;

public class StringGen {
	public static void main(String[] args){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		Integer length = 0;
		if(args.length != 0){
			length = Integer.valueOf(args[0]);
		}else{
			Scanner ui = new Scanner(System.in);
			System.out.print("Length [7]: ");
			String temp = ui.nextLine();
			
			if(temp.length() < 1)
				length = 7;
			else
				length = Integer.valueOf(temp);
		}
		
		
		String output = "";
		for(int i = 0; i < length; i++){
			String letter = String.valueOf(alphabet.charAt((int)((Math.random()*25)+1)));
			System.out.print(letter);
			try {
			    Thread.sleep(300);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			// from http://stackoverflow.com/questions/24591491/autoboxing-cant-convert-an-int-to-an-integer
		}
	}
}
