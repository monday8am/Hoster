package com.monday8am.hoster.timeline;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

import com.monday8am.hoster.model.entity.Booking;

import java.util.List;

/**
 * Created by anton on 12/09/16.
 */
public class TimelineView extends RelativeLayout implements TimelineContract.View {

    private TimelineContract.Presenter presenter;

    public TimelineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        //TimelineScreen screen = Flow.getKey(this);
        Log.e("flow", "aloha!!!!");
    }

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
