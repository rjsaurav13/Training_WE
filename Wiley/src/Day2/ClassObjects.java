package Day2;

public class ClassObjects implements Cloneable{
	int a = 10;

	public void add() {
		System.out.println("Number adding");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {

		// Create object with the new keyboard
		ClassObjects co = new ClassObjects();
		co.add();
		System.out.println(co);
		// create object with new instance
		try {
			Class c = Class.forName("Day2.ClassObjects");
			ClassObjects ci = (ClassObjects) c.newInstance();
			ci.add();
			System.out.println(ci);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ClassObjects obj= (ClassObjects) co.clone();
		obj.add();
		System.out.println(obj);
	}
}
