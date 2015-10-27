package net.killerandroid.android102;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import net.killerandroid.android102.db.model.Chore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmossman on 10/20/15.
 */
public class ChoreListFragment extends ListFragment implements AdapterView.OnItemClickListener {

    List<Chore> choreList = new ArrayList<>();

    public ChoreListFragment() {
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
        choreList.add(new Chore("Chore One"));
        choreList.add(new Chore("Chore Two"));
        choreList.add(new Chore("Chore Three"));
        choreList.add(new Chore("Chore Four"));
        choreList.add(new Chore("Chore Five"));
        choreList.add(new Chore("Chore Six"));
        choreList.add(new Chore("Chore Seven"));
        choreList.add(new Chore("Chore Eight"));
        choreList.add(new Chore("Chore Nine"));
        choreList.add(new Chore("Chore Ten"));


        // Create a custom adapter.
        ChoreAdapter choreAdapter = new ChoreAdapter(getActivity(), R.layout.chore_row, choreList);

        // set our custom adapter on this ListFragment.
        setListAdapter(choreAdapter);

        // set a click listener to do something useful when an item row is clicked.
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();

    }

}
