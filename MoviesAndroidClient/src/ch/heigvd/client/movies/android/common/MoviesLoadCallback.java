package ch.heigvd.client.movies.android.common;

import ch.heigvd.movies.data.MovieList;

public interface MoviesLoadCallback {
    public void onMoviesListLoaded(MovieList movies);    
}

