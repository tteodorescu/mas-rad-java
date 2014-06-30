package ch.heigvd.client.movies.android.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import ch.heigvd.client.movies.android.R;
import ch.heigvd.client.movies.android.ws.MovieService;

public class MovieDetailWebFragment extends Fragment 
{	  
	  public static final String ARG_ITEM_ID = "url";	
	
	  WebView moviesWebView;
	  String mTitle;
	  
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	    	Bundle bundle = getArguments();        
	        if (bundle.containsKey(ARG_ITEM_ID)) {
	            // Load the dummy content specified by the fragment
	            // arguments. In a real-world scenario, use a Loader
	            // to load content from a content provider.
	            mTitle = (String)bundle.getSerializable(ARG_ITEM_ID);
	        }
	    }
	  	  
	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	  {
		   View view = inflater.inflate(R.layout.fragment_movie_web, container, false);
		   
		   moviesWebView = (WebView)view.findViewById(R.id.movie_web_view);	

		   //gives more freedom but could lead to security problems
//		   moviesWebView.getSettings().setJavaScriptEnabled(true);                
		   moviesWebView.setWebViewClient(new MovieDetailWebClient());		   		   
		   moviesWebView.loadUrl(MovieService.IMDB_SEARCH_URL+ MovieService.IMDB_SEARCH_URI + mTitle);
		       
		  return view;		
	  }
}