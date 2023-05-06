class vehicle {
   public void display() {
      System.out.println("accelerate");
   }
}
class brake extends vehicle {
   public void area() {
      System.out.println("break applied");
   }
}
class Cube extends brake {
   public void volume() {
      System.out.println("Inside volume");
   }
}

public class MultilevelInhritance {
	public static void main(String[] args) {
		Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	}

}
