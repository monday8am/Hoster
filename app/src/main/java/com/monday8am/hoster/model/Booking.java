package com.monday8am.hoster.model;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by anton on 11/09/16.
 */
public class Booking extends RealmObject {

    public Date startDate;
    public Date endDate;
    public Hostel house;
}
