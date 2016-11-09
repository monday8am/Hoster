package com.monday8am.hoster.model.entity;

import io.realm.RealmObject;

/**
 * Created by anton on 11/09/16.
 */
public class Hostel extends RealmObject {

    public String hostelName;
    public String address;
    public float pricePerNight;
    public int color;
}
