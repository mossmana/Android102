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
        // Create mock data here


        // Create adapter object here


        // Call test methods

    }


    public void testGetItem() {
    }

    public void testGetItemId() {
    }

    public void testGetCount() {
    }

    // We have a list with rows of views.  Let's test one of those views.
    public void testGetView() {
    }


}
