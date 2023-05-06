import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileStreams {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.in);
		Writer fw=new FileWriter("C:\\Users\\amani\\eclipse-workspace\\Java_Wiley\\src");
		bw.write("Wiley project");
		byte[] b =str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
	}
}
