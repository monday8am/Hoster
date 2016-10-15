package com.monday8am.hoster.addhostel;

import android.os.Parcel;
import android.os.Parcelable;

import com.monday8am.hoster.timeline.TimelineScreen;

/**
 * Created by anton on 16/09/16.
 */
public class AddHostelScreen implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static final Creator<AddHostelScreen> CREATOR = new Creator<AddHostelScreen>() {
        @Override
        public AddHostelScreen createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public AddHostelScreen[] newArray(int i) {
            return new AddHostelScreen[0];
        }
    };

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof TimelineScreen;
    }
}
