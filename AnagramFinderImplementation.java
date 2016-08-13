import java.util.HashMap;

interface AnagramFinder {
 /**
 * Determines if two strings are anagrams. Whitespace is ignored, but all other
characters
 * (including punctuation) count.
 * @param s1 first string to compare
 * @param s2 second string to compare
 * @return true if s1 and s2 are anagrams, false otherwise
 */
 boolean areAnagrams(String s1, String s2);
}

class AnagramFinderImplementation implements AnagramFinder{
	public boolean areAnagrams(String s1, String s2){
		HashMap<String, Integer> table = new HashMap<String, Integer>();
		for(int i=0; i < s1.length(); i++){
			String ch = "" + s1.charAt(i);
			if(!ch.equals(" ")){
				int counter = (table.get(ch) == null) ? 0 : table.get(ch);
				counter++;
				System.out.println("for ch: "+ch+" counter: "+counter);
				table.put(ch, counter);
			}	
		}
		for(int i=0; i<s2.length();i++){
			String ch = ""+s2.charAt(i);
			if(!ch.equals(" ")){
				int counter = (table.get(ch) == null) ? -1 : table.get(ch);
				if(counter <= 0){
					return false;
				}
				counter--;
				System.out.println("for ch: "+ch+" counter: "+counter);
				table.put(ch, counter);
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new AnagramFinderImplementation().areAnagrams("q","a"));
	}
}
