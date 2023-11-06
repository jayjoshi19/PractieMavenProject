package exceptionHandling.customExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception{
	public CustomException(String msg) {
		super(msg);
	}
}

public class CustomExceptionHandling {
	
	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Python","C","C++","Pascal"));
	
	// checking exception condition here
	public void checkLanguage(String language) throws CustomException {
		
		// throw exception if the languages ArrayList already contains the passed language value
		if(languages.contains(language)) {
			throw new CustomException(language+" already exists");
		}
		else {
			languages.add(language);
			System.out.println(language + " added to the list !!!");
		}
	}
	
	public static void main(String[] args) {
		
		CustomExceptionHandling ceh = new CustomExceptionHandling();
		try {
			ceh.checkLanguage("Java");
			ceh.checkLanguage("Pascal");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("["+ e +"]"+ " Exception occured");
		}
	}
}
