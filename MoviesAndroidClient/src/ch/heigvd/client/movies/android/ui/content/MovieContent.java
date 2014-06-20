package ch.heigvd.client.movies.android.ui.content;

import android.util.SparseArray;
import ch.heigvd.movies.data.Movie;

public class MovieContent 
{
    public static SparseArray<Movie> MOVIES = new SparseArray<Movie>();
    
    public static class MovieToDisplay{
        public Integer id;
        public Movie content;

        public MovieToDisplay(Integer id, Movie movie) {
            this.id = id;
            this.content = movie;
        }

        @Override
        public String toString() {
            return content.toString();
        }
    }    
}
