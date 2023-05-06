import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class StudentRecord {
	DataInputStream dataInput;
	public void StudentRecordReader(String inputFile)throws FileNotFoundException{
		dataInput= new DataInputStream(new FileInputStream(inputFile));
	}
	public List<Student> realAll()throws IOException{
		
	}
}
