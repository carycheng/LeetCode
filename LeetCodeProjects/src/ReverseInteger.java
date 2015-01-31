import java.util.Stack;


public class ReverseInteger {
	public static void reverse(int x){
		String number = Integer.toString(x);
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i<number.length(); i++){
			stack.push(number.charAt(i));
		}
		for(int j=0; j<number.length(); j++){
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args){
		reverse(-12345);
	}
}
