package com.monday8am.hoster.views;

import android.support.annotation.NonNull;

import com.monday8am.hoster.model.Booking;
import com.monday8am.hoster.presenter.TimelineContract;

import java.util.List;

/**
 * Created by anton on 12/09/16.
 */
public class TimelineView implements TimelineContract.View {

    private TimelineContract.Presenter presenter;

    @Override
    public void setPresenter(@NonNull TimelineContract.Presenter presenter) {

    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showBookingList(List<Booking> bookingList) {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
