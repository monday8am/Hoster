package com.monday8am.hoster.model;

import io.realm.RealmObject;

/**
 * Created by anton on 11/09/16.
 */
public class House extends RealmObject {

    public String houseName;
    public String address;
    public float pricePerNight;
    public int color;
}
