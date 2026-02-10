import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
class L4P2{
	public static void main(String...args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader s = new BufferedReader(isr);
		//try{
			int x = Integer.parseInt(s.readLine());
			int y = Integer.parseInt(s.readLine());
			System.out.println(x/y);
	}
}