package ch.heigvd.movies.interfaces;

import ch.heigvd.movies.data.ActorList;

public interface IMovieData {
	String getTitle();
	int getYear();
	ActorList getActors();
}
