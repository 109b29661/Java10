class Caaa{
	private int num;
	public Caaa(int n) {
	 num=n;
	}
	public int get() {
		return num;
	}
}
class Cbbb extends Caaa{
	public Cbbb(int n) {
		 super(n);
		}
	public void show() {
		System.out.println("num="+get());
	}
}
public class hw10_5{
public static void main(String args[]) {
	Cbbb bb = new Cbbb(2);
	bb.show();
}
}
