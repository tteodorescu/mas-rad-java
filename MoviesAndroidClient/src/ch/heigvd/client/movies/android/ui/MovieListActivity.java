package ch.heigvd.client.movies.android.ui;

import ch.heigvd.client.movies.android.R;

import ch.heigvd.movies.data.Movie;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link MovieListFragment} and the item details
 * (if present) is a {@link MovieDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link MovieListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class MovieListActivity extends FragmentActivity
        implements MovieListFragment.Callbacks
{
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.activity_movie_list);
    }
    
    @Override
    public void onItemSelected(Movie movie) 
    {
        Intent detailIntent = new Intent(this, MovieDetailActivity.class);
        detailIntent.putExtra(MovieDetailFragment.ARG_ITEM_ID, movie);
        
        startActivity(detailIntent);
    }
}
