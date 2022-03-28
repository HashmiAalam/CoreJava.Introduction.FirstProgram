public class Test {
	public static void main(String[] args){
		System.out.println("Aalam world");
		
		for(int i=10;true;i++){          //for( initialization optional; condition optional(default value is true) ; increment/decrement optional) 
			System.out.println("This is for loop has no break,  condition will not become false");
	  //program will give compilation error 
		}
		System.out.println("Rest of the program will become unreachable statement");
	}
}