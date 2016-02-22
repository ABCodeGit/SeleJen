
public class FirstTry {
	
	public int add(int a, int b){
		
		int sum = a+b;
		return sum;
		
		
	}
	
	
	public int multiply(int a, int b){
		
		int multi = a*b;
		return multi;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstTry a = new FirstTry();
		int Total = a.add(3,5);
		System.out.println(Total);
		
		FirstTry m = new FirstTry();
		int MTotal = m.multiply(2, 3);
		System.out.println(MTotal);
		
		int GrSum = Total + MTotal;
		System.out.println(GrSum);
		
		
	}

}
