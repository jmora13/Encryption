import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decryption {
	public static void Decrypt(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		String s = "";
		StringBuilder sb = new StringBuilder();
		while(inputFile.hasNext()){
			s += inputFile.nextLine();
			}
		sb.append(s);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i) == '1') {
				sb.setCharAt(i, ' ');
			}
		}
		PrintWriter pw = new PrintWriter("DecryptedMessage.txt");
		pw.println(sb);
		pw.close();
	}
	public static void main(String[] args) throws FileNotFoundException{
		Decrypt("EncryptedMessage.txt");
	}

}
