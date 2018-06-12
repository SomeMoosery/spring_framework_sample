package com.tutorialspoint;

public class TextEditor{
	private SpellChecker spellChecker;
	
	//A setter method to inject the dependency of SpellChecker. Use setter-based DI for optional dependencies
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	//A getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}