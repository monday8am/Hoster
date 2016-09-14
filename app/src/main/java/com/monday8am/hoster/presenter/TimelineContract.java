package com.monday8am.hoster.presenter;

import com.monday8am.hoster.BasePresenter;
import com.monday8am.hoster.BaseView;
import com.monday8am.hoster.model.Booking;

import java.util.List;

/**
 * Created by anton on 13/09/16.
 */
public interface TimelineContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showBookingList(List<Booking> bookingList);

        boolean isActive();
    }

    interface Presenter extends BasePresenter {

        void addHostel ();

        void addBooking();

        void editBooking();
    }
}
