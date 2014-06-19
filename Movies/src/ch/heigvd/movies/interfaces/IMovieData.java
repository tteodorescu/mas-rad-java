package ch.heigvd.movies.interfaces;

import ch.heigvd.movies.data.ActorList;

public interface IMovieData {
	int getID();
	String getTitle();
	int getYear();
	ActorList getActors();
}
