  class Calculator{
		public static int add(){
			int a=7;
			int b=3;
			int sum=0;
			sum=a+b;
			System.out.println("addation of two num is"+sum);
			return sum;
		}
		
		public static int sub(){
			int a=7;
			int b=3;
			int diff=0;
			diff=a-b;
			System.out.println("sub of two num is"+diff);
		return diff;
		}
	
		public static int mul(){
			int a=10;
			int b=2;
			int mul=0;
			mul=a*b;
			System.out.println("mul of two num is"+mul);
			return mul;
		}
	
		public static double div(){
			double a=20;
			double b=2;
			double div=0;
			div=a/b;
			System.out.println("div of two num is"+div);
			return div;
		}
		
		public static void main(String args[]){
			int sum=Calculator.add();
			int diff=Calculator.sub();
			int mul=Calculator.mul();
			double div=Calculator.div();	
		} 

}
