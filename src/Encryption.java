import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Encryption {
	public static void Encrypt(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		String s = "";
		StringBuilder sb = new StringBuilder();
		while(inputFile.hasNext()){
			s += inputFile.nextLine();
			}
		String[] tokens = s.split(" ");
		for(int i =0;i<tokens.length;i++){
			sb.append(tokens[i] + "1");
		} inputFile.close();
		//System.out.println(sb);
		PrintWriter outFile = new PrintWriter("EncryptedMessage.txt");
		outFile.println(sb);
		outFile.close();
	}
	public static void main(String[] args) throws FileNotFoundException{
		Encrypt("Pledge.txt");
	}
}



