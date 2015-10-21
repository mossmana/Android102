package net.killerandroid.android102.db.model;

/**
 * Created by davidpos on 10/6/15.
 */
public class Chore {

    private String choreTitle;

    public Chore(String title) {
        setChoreTitle(title);
    }

    public String getChoreTitle() {
        return choreTitle;
    }

    public void setChoreTitle(String title) {
        this.choreTitle = title;
    }

}
