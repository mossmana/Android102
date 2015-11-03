package net.killerandroid.android102;

import android.view.View;
import android.widget.TextView;

import net.killerandroid.android102.db.model.Chore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import static org.junit.Assert.*;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amossman on 10/27/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ChoreAdapterTest {

    private ChoreAdapter adapter;
    private List<Chore> choreList;

    @Test
    public void setUp() throws Exception {
        // Create mock data here
        choreList = new ArrayList<>();

        choreList.add(new Chore("Chore 1"));
        choreList.add(new Chore("Chore 2"));
        choreList.add(new Chore("Chore 3"));
        choreList.add(new Chore("Chore 4"));
        choreList.add(new Chore("Chore 5"));

        // Create adapter object here
        adapter = new ChoreAdapter(RuntimeEnvironment.application, R.layout.chore_row, choreList);


        // Call test methods
        testGetItem();
        testGetItemId();
        testGetCount();

    }


    public void testGetItem() {
        assertEquals(adapter.getItem(0), choreList.get(0));
    }

    public void testGetItemId() {
        long item = adapter.getItemId(0);
        boolean isCreatedSuccessfully = item == 0;
        assertTrue(isCreatedSuccessfully);
    }

    public void testGetCount() {
        assertEquals(adapter.getCount(), 5);
    }

    // We have a list with rows of views.  Let's test one of those views.
    public void testGetView() {
        View view = adapter.getView(0, null, null);

        TextView name = (TextView) view.findViewById(R.id.textview_title);

        assertNotNull("View is null. ", view);
        assertNotNull("Name TextView is null. ", name);

        assertEquals("Names doesn't match.", adapter.getItem(0).getChoreTitle(), name.getText());

    }


}
