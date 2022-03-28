public class Test {
	public static void main(String[] args){
		System.out.println("Aalam world");
		
		for(int i=10;false;i++){          //for( initialization optional; condition optional(default value is true) ; increment/decrement optional) 
			System.out.println("This for loop has false condition program will become unreachable statement");
	  //program will give compilation error 
		}
	}
}