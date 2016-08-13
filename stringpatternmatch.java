public class patternMatch {

	public static void main(String[] args) {
		patternMatch pM = new patternMatch();
		String sourceString = "aaaa";
		String pattern = "*aa*";
		System.out.println(pM.isMatch(sourceString, pattern));
	}

	boolean isMatch(String sourceString, String pattern) {

		int counter = 0;

		for (int i=0; i<sourceString.length(); i++){
			String ch = "" + sourceString.charAt(i);
			String patternCh = "" + pattern.charAt(counter);
			System.out.println("ch->"+ch+" patternCh: "+patternCh);
			if(ch.equals(patternCh)|| patternCh.equals("?") || patternCh.equals("*")  ){
				counter++;
				if (counter == pattern.length()){
					break;
				}
			}
			else{
				counter = 0;
			}
		}
		if (counter == pattern.length()){
			return true;
		}
		return false;

	}

}