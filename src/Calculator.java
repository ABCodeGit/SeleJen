
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		add(2,3);
		sub(10,5);
		multi(4,5);
		divide(8,2);
		
		int x=add1(2,3);
		System.out.println(x);

		
	}
	
	public static void add(int a, int b){
		
		int sum = a+b;
		System.out.println(sum);
		
	}
	
public static int add1 (int a, int b){
		
		int sum1 = a+b;
		return sum1;
		
	}
	
	
	public static void sub(int a, int b){
		
		int sub = a-b;
		System.out.println(sub);
		
	}
	
	public static void multi(int a, int b){
		
		int multi1 = a*b;
		System.out.println(multi1);
		
	}
	
	public static void divide(int a, int b){
		
		int div = a/b;
		System.out.println(div);
		
	}

}
