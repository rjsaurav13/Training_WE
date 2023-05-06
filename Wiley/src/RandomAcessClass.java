import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessClass {
	public static void main(String[] args) {
		try {
		RandomAccessFile file=new RandomAccessFile("wiley.txt","rw");
		file.writeBytes("Hello Wiley");
		file.seek(0);
		byte[] bytes = new byte[13];
		file.read(bytes);
		String data = new String(bytes);
		System.out.println(data);
		file.seek(7);
		file.writeBytes("Java");
		   file.seek(0);
           bytes = new byte[13];
           file.read(bytes);
           data = new String(bytes);

           System.out.println(data);

          
           file.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
	}
		}


