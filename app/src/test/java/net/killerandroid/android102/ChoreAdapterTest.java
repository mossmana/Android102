package net.killerandroid.android102;

import android.view.View;
import android.widget.TextView;

import net.killerandroid.android102.db.model.Chore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by amossman on 10/27/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ChoreAdapterTest {

    private ChoreAdapter adapter;

    public ChoreAdapterTest() {
        super();
    }

    @Test
    public void setUp() throws Exception {
        ArrayList<Chore> data = new ArrayList<>();

        data.add(new Chore("Chore 1"));
        data.add(new Chore("Chore 2"));
        data.add(new Chore("Chore 3"));

        adapter = new ChoreAdapter(RuntimeEnvironment.application, R.layout.chore_row, data);

        testGetItem();
        testGetItemId();
        testGetCount();
        testGetView();

    }


    public void testGetItem() {
        assertEquals("Chore 1", adapter.getItem(0).getChoreTitle());
    }

    public void testGetItemId() {
        assertFalse(adapter.getItemId(0) != 0);
    }

    public void testGetCount() {
        assertEquals("Chore amount incorrect.", 3, adapter.getCount());
    }

    // I have 3 views on my adapter, name, number and photo
    public void testGetView() {
        View view = adapter.getView(0, null, null);

        TextView name = (TextView) view.findViewById(R.id.textview_title);

        assertNotNull("View is null. ", view);
        assertNotNull("Name TextView is null. ", name);

        assertEquals("Names doesn't match.", adapter.getItem(0).getChoreTitle(), name.getText());
    }

}
