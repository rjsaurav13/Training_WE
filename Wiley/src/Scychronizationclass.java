class sheet{
	public void writeln(int k) {
		synchronized(this) {
			for(int i=1;i<=2;i++) {
				System.out.println(i+k);
			}
		}
	}
}
public class Scychronizationclass {
	

}
