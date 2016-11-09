package com.monday8am.hoster.model;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.util.Log;

import com.monday8am.hoster.model.entity.Booking;
import com.monday8am.hoster.model.entity.Hostel;

import java.io.Closeable;
import java.io.IOException;
import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;
import rx.Observable;

/**
 * Class for handling loading and saving data.
 *
 * A repository is a potentially expensive resource to have in memory, so should be closed when no longer needed/used.
 *
 * @see <a href="http://martinfowler.com/eaaCatalog/repository.html">Repository pattern</a>
 */

class Repository implements Closeable {

    private final Realm realm;

    @UiThread
    Repository() {
        realm = Realm.getDefaultInstance();
    }

    /**
     * Add new booking.
     *
     * @param booking to add
     */
    @UiThread
    void addNewBooking (@NonNull final Booking booking) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(booking);
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.d(Repository.class.getName(), error.getMessage());
            }
        });
    }

    /**
     * Remove booking.
     *
     * @param booking to remove
     */
    @UiThread
    void removeBooking (@NonNull final Booking booking) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                booking.deleteFromRealm();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.d(Repository.class.getName(), error.getMessage());
            }
        });
    }


    /**
     * Add new hostel.
     *
     * @param hostel to add to Realm.
     */
    @UiThread
    void addNewHostel (@NonNull final Hostel hostel) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(hostel);
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.d(Repository.class.getName(), error.getMessage());
            }
        });
    }

    /**
     * Remove hostel
     *
     * @param hostel to remove.
     */
    @UiThread
    void removeHostel (@NonNull final Hostel hostel) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                hostel.deleteFromRealm();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.d(Repository.class.getName(), error.getMessage());
            }
        });
    }


    @UiThread
    Observable<RealmResults<Booking>> loadBookingList (@NonNull Date fromDate, @NonNull Date untilDate)
    {
        return realm.where (Booking.class).findAll().asObservable();
    }

    /**
     * Closes all underlying resources used by the Repository.
     */
    @UiThread
    @Override
    public void close() throws IOException {
        realm.close();
    }
}
