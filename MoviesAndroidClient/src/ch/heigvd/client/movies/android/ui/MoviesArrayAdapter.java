package ch.heigvd.client.movies.android.ui;

import java.util.List;

import ch.heigvd.client.movies.android.R;
import ch.heigvd.movies.data.Movie;
import ch.heigvd.movies.interfaces.IMovieData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MoviesArrayAdapter extends ArrayAdapter<Movie> 
{		
	private List<Movie> movies;
	
	public MoviesArrayAdapter(Context context, int resource,
			int textViewResourceId, List<Movie> movies) 
	{
		super(context, resource, textViewResourceId, movies);
		
		this.movies = movies;
	}

	 @Override
	 public View getView(int position, View convertView, ViewGroup parent) 
	 {
	    LayoutInflater inflater = (LayoutInflater) getContext().
	        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    View rowView = inflater.inflate(
	    		R.layout.movie_listitem_layout, parent, false);
	    
	    TextView titleView = (TextView) rowView.findViewById(R.id.movieTitle);
	    TextView yearView = (TextView) rowView.findViewById(R.id.movieYear);
	    
	    IMovieData movie = (IMovieData)movies.get(position);
	    
	    titleView.setText(movie.getTitle());
	    yearView.setText(String.format("%d", movie.getYear()));

	    return rowView;
	 }
}
