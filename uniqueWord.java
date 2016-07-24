/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhaval
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class uniqueWord {
	static HashMap<String,Integer> uniqueWords ;

	public static void main(String[] args) {
		uniqueWord uW = new uniqueWord();
		uniqueWords = new HashMap<String,Integer>();
		String[] line = null;
		

		try (BufferedReader br = new BufferedReader(new FileReader("words.txt")))
		{

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {

				line = sCurrentLine.split("[\\W]+");

				for (int i = 0; i < line.length; i++){                         
					String word = line[i]; //picking up one word at a time.
					if (uniqueWords.containsKey(word))
						uW.updateCounter(word);
					else
						uW.addNew(word);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		uW.displayOutput();

	}
	
	void updateCounter(String key){
		int counter = uniqueWords.get(key);
		uniqueWords.put(key,++counter);
	}
	
	void addNew(String key){
		uniqueWords.put(key,1);
	}
	
	void displayOutput(){
		Set<String> keys = uniqueWords.keySet();
		for( String i : keys){
			System.out.println(i + ": " + uniqueWords.get(i));
		}
	}
	
}

