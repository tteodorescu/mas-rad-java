package ch.heigvd.client.movies.android.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import ch.heigvd.movies.data.Movie;
import ch.heigvd.movies.data.MovieList;
import ch.heigvd.movies.interfaces.*;
import ch.heigvd.client.movies.android.R;
import ch.heigvd.client.movies.android.common.IWSMovieRepository;
import ch.heigvd.client.movies.android.common.MovieAsyncTaskInfo;
import ch.heigvd.client.movies.android.common.MoviesLoadCallback;
import ch.heigvd.client.movies.android.ws.MovieService;

public class MovieListFragment extends ListFragment
{		
    private Callbacks mCallbacks = sDummyCallbacks;
    private MovieList mMovies;
    private Button btnSearch; 
    private EditText editSearch;
    private EditText editIPAddress;    

    /**
     * A callback interface that all activities containing this fragment must
     * implement. This mechanism allows activities to be notified of item
     * selections.
     */
    public interface Callbacks 
    {
        public void onItemSelected(Movie movie); 
    }

    OnClickListener searchListener = new OnClickListener()
    {
    	@Override
    	public void onClick(View v)
    	{    		
    	   MovieService.CUSTOM_ADDRESS = editIPAddress.getText().toString();
    		
	       IWSMovieRepository repo = (IWSMovieRepository) RepositoryFactory.
	        		getRepository(ServerMovieRepositories.WS_REPOSITORY);        

	        MovieAsyncTaskInfo taskInfo = 
	        		new MovieAsyncTaskInfo(
	        				sMoviesLoadCallback, true, editSearch.getText().toString());
	        
	        repo.getMoviesAsync(taskInfo);
    	}
    };
    
    private static Callbacks sDummyCallbacks = new Callbacks() {
        @Override
        public void onItemSelected(Movie movie) {}
    };
    
    public MovieListFragment() {}
        
    private MoviesLoadCallback sMoviesLoadCallback = new MoviesLoadCallback() {
		
		@Override
		public void onMoviesListLoaded(MovieList movies) 
		{			
			if (movies.isEmpty())
			{ 
				Toast.makeText(getActivity(), 
					"No results returned", 
					Toast.LENGTH_SHORT).show(); 
			}
			
	        setListAdapter(new MoviesArrayAdapter(
	                getActivity(),
	                android.R.layout.simple_list_item_activated_1,
	                android.R.id.text1, movies));
	        
	        mMovies = movies;
		}			
	};
    	
    private MoviesLoadCallback sMovieLoadCallback = new MoviesLoadCallback() 
    {
		@Override
		public void onMoviesListLoaded(MovieList movies)
		{ mCallbacks.onItemSelected(movies.get(0)); }
	};
			
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	return inflater.inflate(R.layout.fragment_movies_list, container, false);
    }
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) 
    {
        super.onViewCreated(view, savedInstanceState);

        editSearch = (EditText) view.findViewById(R.id.searchMovieText);
 	    editIPAddress= (EditText) view.findViewById(R.id.moviesServiceIPAddress);
 	    
        btnSearch = (Button) view.findViewById(R.id.button_search);               
        btnSearch.setOnClickListener(searchListener);
    }
        
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Activities containing this fragment must implement its callbacks.
        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() 
    {
        super.onDetach();
        mCallbacks = sDummyCallbacks;
    }
           
    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        
        IWSMovieRepository repo = (IWSMovieRepository) RepositoryFactory.
        		getRepository(ServerMovieRepositories.WS_REPOSITORY);
        
        Movie movie = mMovies.get(position); 
 	   	MovieService.CUSTOM_ADDRESS = editIPAddress.getText().toString();        
        
        MovieAsyncTaskInfo taskInfo = 
        		new MovieAsyncTaskInfo(sMovieLoadCallback, true, movie.getID());
        
        repo.getMoviesAsync(taskInfo);
    }
}
