package CoreJavaPgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersDemo {

	public static void main(String[] args) {
		String st="Ranga reddy mulagundla";
		char char1[]=st.toCharArray();
		Map< Character,Integer> chmap=new HashMap();
		for(Character ch1:char1) {
			if (chmap.containsKey(ch1)) {
				chmap.put(ch1,chmap.get(ch1)+1);				
				
			}
			else
			{
				chmap.put(ch1, 1);
			}
		}
		
		Set<Character>keys =chmap.keySet();
		
		for(Character ch:keys) {
			if(chmap.get(ch)>1) {
				
				System.out.println("Chracter  "+ ch +  "  repeating "  + chmap.get(ch) + "   Times");
			}
					
		}

	}

}
