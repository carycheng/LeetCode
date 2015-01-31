import java.util.HashMap;
import java.util.Map;


public class TwoSum {
	public static int[] twoSum(int[] numbers, int target){
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<numbers.length;i++){
			if(map.containsKey(target-numbers[i])){
				result[1] = i + 1;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i+1);
		}
		return result;
	}
	
//	public static void main(String[] args){
//		int[] numbers = {2, 7, 11, 15};
//		int[] answer = new int[2];
//		answer = twoSum(numbers, 9);
//		
//		for(int i = 0; i<answer.length; i++){
//			System.out.print(answer[i] + " ");
//		}
//	}
}
