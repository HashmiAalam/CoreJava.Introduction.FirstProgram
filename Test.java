public class Test {
	public static void main(String[] args){
		int i=1;
		do{
		System.out.println("This is do while");
		i++;
		}while(true);
		System.out.println("Rest of the program");   // If this line is not present then code compiles fine but fall into infinte loop
		//because of rest of program after do while loop we will get compile time error unreachable statment on line no 8
	}
}