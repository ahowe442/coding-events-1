package org.launchcode.codingevents.models;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//I'm not sure why the @Override notation is above the toString method?
    @Override
    public String toString() {
        return name;
    }

}
