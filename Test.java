public class Test {
	public static void main(String[] args){
		for(int i=10;i<20;i++){
			if(i==15)
				continue;   //in output we will not get 15
		System.out.println(i);   //Whenever continue statement is executed it skip rest of the code of current loop
		}
	}
}