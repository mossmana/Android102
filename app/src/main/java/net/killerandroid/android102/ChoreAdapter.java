package net.killerandroid.android102;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.killerandroid.android102.db.model.Chore;

import java.util.List;

public class ChoreAdapter extends ArrayAdapter<Chore> {

    public ChoreAdapter(Context context, int resource, List<Chore> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.chore_row, null, false);

        }
        Chore chore = getItem(position);

        if (chore != null){
            TextView choreTitle = (TextView)v.findViewById(R.id.textview_title);

            if(choreTitle != null){
                choreTitle.setText(chore.getChoreTitle());
            }
        }
        return v;

    }

}
