public class Test {
	public static void main(String[] args){
		System.out.println("Aalam world");
		
		for(int i=10;i<=12 ;System.out.println("Hi increment/decrement in for loop")){          //for( initialization optional; condition optional(default value is true) ; increment/decrement optional) 
			System.out.println("This is for loop with no break i.e no increment/decrement for condition to become false");
	i++;   //program will not fall into infinite condition i++ will work as break to loop
		}
	}
}