public class Test {
	public static void main(String[] args){
		System.out.println("Aalam world");
		
		for(; ;){          //for( initialization optional; condition optional(default value is true) ; increment/decrement optional) 
			System.out.println("This is for loop with no break, no condition no initialization i.e no increment/decrement for condition to become false");
	  //program will fall into infinite condition 
		}
	}
}