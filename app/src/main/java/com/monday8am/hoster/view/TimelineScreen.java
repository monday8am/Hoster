package com.monday8am.hoster.view;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anton on 16/09/16.
 */
public class TimelineScreen implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static final Creator<TimelineScreen> CREATOR = new Creator<TimelineScreen>() {
        @Override
        public TimelineScreen createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public TimelineScreen[] newArray(int i) {
            return new TimelineScreen[0];
        }
    };

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof TimelineScreen;
    }
}

