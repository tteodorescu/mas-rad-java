package ch.heigvd.client.movies.android.ui;

import java.util.List;

import ch.heigvd.client.movies.android.R;
import ch.heigvd.movies.data.Actor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ActorsArrayAdapter extends ArrayAdapter<Actor> 
{		
	private List<Actor> actors;
	
	public ActorsArrayAdapter(Context context, int resource,
			int textViewResourceId, List<Actor> actors) 
	{
		super(context, resource, textViewResourceId, actors);
		
		this.actors = actors;
	}

	 @Override
	 public View getView(int position, View convertView, ViewGroup parent) 
	 {
	    LayoutInflater inflater = (LayoutInflater) getContext().
	        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    View rowView = inflater.inflate(
	    		R.layout.actor_listitem_layout, parent, false);
	    
	    TextView firstNameView = (TextView) rowView.findViewById(R.id.actorFirstName);
	    TextView lastNameView = (TextView) rowView.findViewById(R.id.actorLastName);
	    
	    Actor actor = actors.get(position);
	    
	    firstNameView.setText(actor.getFirstName());
	    lastNameView.setText(actor.getLastName());

	    return rowView;
	 }
}
