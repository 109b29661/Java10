class Caaa{
	private int num;
	public Caaa(int n) {
	 num=n;
	}
	public int get() {
		return num;
	}
	public void display(){
	   System.out.println("printed from Caaa class");
}
}
class Cbbb extends Caaa{
	public Cbbb(int n) {
		 super(n);
		}
	public void show() {
	   System.out.println("num="+get());
	}
	public void display(){
	   System.out.println("printed from Cbbb class");
	   }
}
public class hw10_09{
public static void main(String args[]) {
	Caaa bb = new Cbbb(2);
	bb.display();
}
}
