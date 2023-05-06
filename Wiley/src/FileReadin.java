import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadin {

	public static void main(String[] args) {
	File file=new File("NewAtm.java");
		try {
		FileReader reads;
		BufferedReader read2=new BufferedReader(new FileReader(file));
		
		}catch(FileNotFoundException e) {
			System.out.println(file.toString());
		} catch(IOException e) {
			System.out.println("unable to read");
		}
		
	}

}