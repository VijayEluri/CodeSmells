package com.mlevison.codesmells.movie;

//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private final String title;
	private int priceCode;

	public Movie(String inTitle, int inPriceCode) {
		title = inTitle;
		priceCode = inPriceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int arg) {
		priceCode = arg;
	}

	public String getTitle() {
		return title;
	}
}
