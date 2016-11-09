package com.monday8am.hoster.model;

/**
 * Created by anton on 15/10/16.
 */

import android.support.annotation.NonNull;

import com.monday8am.hoster.model.entity.Booking;
import com.monday8am.hoster.model.entity.Hostel;

import java.util.Date;

import io.realm.RealmResults;
import rx.Observable;

/**
 * Model class for handling the business rules of the app.
 */

public class Model {

    private static Model instance = null;
    private final Repository repository;

    // This could be replaced by Dependency Injection for easier testing
    public static synchronized Model getInstance() {
        if (instance == null) {
            Repository repository = new Repository();
            instance = new Model(repository);
        }
        return instance;
    }

    // Private constructor!
    private Model(Repository repository) {
        this.repository = repository;
    }

    /**
     * Returns the booking feed.
     */
    public Observable<RealmResults<Booking>> getBookingList(@NonNull Date fromDate, @NonNull Date untilDate) {
        return repository.loadBookingList(fromDate, untilDate);
    }

    /**
     * Add new booking.
     */
    public void AddNewBooking (@NonNull Booking newBooking) {
        repository.addNewBooking(newBooking);
    }

    /**
     * Remove booking.
     */
    public void RemoveBooking (@NonNull Booking booking) {
        repository.removeBooking(booking);
    }

    /**
     * Add new hostel.
     */
    public void AddHostel (@NonNull Hostel hostel) {
        repository.addNewHostel(hostel);
    }

    /**
     * Remove hostel.
     */
    public void RemoveHostel (@NonNull Hostel hostel) {
        repository.removeHostel(hostel);
    }



}
