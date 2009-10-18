package com.mlevison.codesmells.movie;

//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {
	private final Movie movie;
	private final int daysRented;

	public Rental(Movie inMovie, int inDaysRented) {
		movie = inMovie;
		daysRented = inDaysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}
}
