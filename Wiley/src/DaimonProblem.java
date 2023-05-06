import java.sql.Statement;

interface  Person{
	public void getRole();
}
interface student extends Person{
	
}
class Teacher implements Person{

	
	public void getRole() {
		System.out.println("Teaching");
		
	}
	
}
class ClassRoom extends Teacher implements Statement{
	public void getRole() {
		System.out.println("Studying");
		
	}
	
}
public class DaimonProblem {

}
