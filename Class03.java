class Caaa{
   public  int num1;
   public int num2;
   Caaa(){
	   num1 = 1;
	   num2 = 1;
  }
   Caaa(int a,int b){
	   num1 = a;
	   num2 = b;
   }
}

class Cbbb extends Caaa{
	Cbbb(){
		
	}
	Cbbb(int a,int b){
		super(a,b);
	}
    void set_num(int a,int b){
      num1=a;
      num2=b;
   }
   
    void show(){
      System.out.println("num1="+num1);
      System.out.println("num2="+num2);
   }
}

public class hw10_1{
   public static void main(String args[]){
	   Cbbb x=new Cbbb();
      Cbbb y=new Cbbb(3,9);
      
       x.show();
       y.show();
   }
}
