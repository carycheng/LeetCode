import java.util.HashMap;


public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s){
		int i =0;
		int j =0;
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		while(j < s.length()){
			char c = s.charAt(j);
			Integer index = map.get(c);
			
			//keep entering this loop if there is repeated characters
			if(index != null && index >= 1){
				if(j - i > max){
					max = j - i;
				}
				//i starts counting after the char has been entered the first time
				i = index + 1;
			}
			//first encounter with the character, put into HashMap
			map.put(c, j);
			j++;
		}
		if(j - i > max){
			max = j - i;
		}
		return max; 
	}
//	
//	public static void main(String[] args){
//		int sum = lengthOfLongestSubstring("bbbbbbbbb");
//		System.out.println(sum);
//		System.out.println(lengthOfLongestSubstring("abc"));
//	}
	
}
