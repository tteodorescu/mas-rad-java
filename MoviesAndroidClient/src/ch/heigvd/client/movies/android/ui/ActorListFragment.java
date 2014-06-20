package ch.heigvd.client.movies.android.ui;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

public class ActorListFragment extends ListFragment 
{
    public ActorListFragment() {}
        	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (savedInstanceState != null) {

        }
        
//        setListAdapter(new ActorsArrayAdapter(
//                getActivity(),
//                android.R.layout.simple_list_item_activated_1,
//                android.R.id.text1, actors));        
    }

    @Override
    public void onSaveInstanceState(Bundle outState) 
    {
        super.onSaveInstanceState(outState);
    }

    public void setActivateOnItemClick(boolean activateOnItemClick) 
    {
        getListView().setChoiceMode(activateOnItemClick
                ? ListView.CHOICE_MODE_SINGLE
                : ListView.CHOICE_MODE_NONE);
    }
}
