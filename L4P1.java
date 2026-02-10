import java.util.InputMismatchException;
import FilenotFoundException;
import java.util.Scanner;

class ExDemo{
	public static void main(String...args){
		Scanner s = new Scanner(Sysrem.in);
		try{
		     int x = s.nextInt();
		     int y = s.nextInt();
		     System.out.println(x/y);
		}catch{InputMimsmatchException ime){
			System.out.println(ime.getMessage());
		}catch{ArithmeticException ame){
			System.out.println(ame.gteMessage());
		}
		finally{
			System.out.println("Exception handled.");
}

	}
}