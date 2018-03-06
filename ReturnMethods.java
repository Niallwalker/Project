public class ReturnMethods{
		public static void main(String[] args){
			ReturnMethods methods = new ReturnMethods();
			System.out.println("Value returned: "+methods.method1());
			//Index.main(null);
		}

		public int method1(){
			System.out.println("No problem. Method 2, can you ask Method 3 for a number and return it to me");
			return method2();
		}
		public int method2(){
			System.out.println("Of course I can method1. Method3, can you please send me a number?");
			return method3();
		}
		public int method3(){
			System.out.println("Hi Method2. from Method3, Tell Method1 I said hello");
			return 5;
	}//end method3
}
