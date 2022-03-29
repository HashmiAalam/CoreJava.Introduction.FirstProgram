public class Test {
	public static void main(String[] args){
		System.out.println("Aalam world");
		int i=1;
		while(true){            //if condition is give false manually then while loop will become unreachable statement
		System.out.println("Hi there");  //since the condition is no true in the progaram loop will fall into infinte condition and we have rest of code so we get error
		i++;
		}
		System.out.println("Rest of application");
	}
}
//error:-on line 9 unreachable statement