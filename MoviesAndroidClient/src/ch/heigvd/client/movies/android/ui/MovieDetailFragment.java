package ch.heigvd.client.movies.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import ch.heigvd.client.movies.android.R;
import ch.heigvd.movies.data.Movie;
import ch.heigvd.client.movies.android.ui.ActorsArrayAdapter;

/**
 * A fragment representing a single Movie detail screen.
 * This fragment is either contained in a {@link MovieListActivity}
 * in two-pane mode (on tablets) or a {@link MovieDetailActivity}
 * on handsets.
 */
public class MovieDetailFragment extends Fragment 
{
    public static final String ARG_ITEM_ID = "movie";
    private Movie mMovie;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MovieDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    	Bundle bundle = getArguments();        
        if (bundle.containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mMovie = (Movie)bundle.getSerializable(ARG_ITEM_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        if (mMovie != null) 
        {        	
            ((TextView) rootView.findViewById(R.id.movieDetailText)).setText(mMovie.getTitle());
            ((TextView) rootView.findViewById(R.id.movieDetailYear)).setText(String.format("%d",mMovie.getYear()));
                        
            ((ListView) rootView.findViewById(R.id.actorsListView)).
	        	setAdapter(new ActorsArrayAdapter(
	                getActivity(),
	                android.R.layout.simple_list_item_activated_1,
	                android.R.id.text1, mMovie.actors));;            
        }

        return rootView;
    }
}