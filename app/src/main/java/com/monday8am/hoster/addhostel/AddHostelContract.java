package com.monday8am.hoster.addhostel;

import com.monday8am.hoster.BasePresenter;
import com.monday8am.hoster.BaseView;

/**
 * Created by anton on 13/09/16.
 */
public interface AddHostelContract {

    interface View extends BaseView<Presenter>
    {

    }

    interface Presenter extends BasePresenter
    {
        void addHostel(String name, String address, float pricePerNight);
    }
}
