package net.killerandroid.android102;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import net.killerandroid.android102.db.model.Chore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmossman on 10/20/15.
 */
public class ChoreListFragment {

    public ChoreListFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // inflate and return a view for use.
        // This is the entry point into our fragment.

        View view = inflater.inflate(R.layout.fragment_chore, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Generate and/or get some chore objects.



        // Create a custom adapter.


        // set our custom adapter on this ListFragment.


        // set a click listener to do something useful when an item row is clicked.


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
    }

}
