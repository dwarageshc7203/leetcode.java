import java.util.Set;
import java.util.HashSet;

public class CountResiduePrefix {
	public static int residuePrefix (String s) {
		
		int count = 0;		
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			int length = i + 1;
			int distinct = set.size();
			
			if(distinct == length % 3)
				count ++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String s = "bbbb";
		
		System.out.println(residuePrefix(s));
	}
}
