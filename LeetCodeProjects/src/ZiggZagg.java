
public class ZiggZagg {
	public String convert(String s, int nRows){
		int len = s.length();
		if(len <= nRows || nRows <= 1){
			return s;
		}
		
		StringBuilder[] result = new StringBuilder[nRows];
		
		for(int i = 0; i<result.length; i++){
			result[i] = new StringBuilder();
		}
		int chunk = nRows*2-2;  
		
		for(int i = 0; i<len; i++){
			int group = i%chunk;
			
			if(group<nRows){
				result[group].append(s.charAt(i));
			} else{
				result[chunk-group].append(s.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<nRows; i++){
			sb.append(result[i].toString());
		}
		return sb.toString();
	}
}
