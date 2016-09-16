package com.monday8am.hoster.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.monday8am.hoster.presenter.AddHostelContract;

import flow.Flow;

/**
 * Created by anton on 13/09/16.
 */
public class AddHostelView extends RelativeLayout implements AddHostelContract.View {

    public AddHostelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AddHostelScreen screen = Flow.getKey(this);
    }

    @Override
    public void setPresenter(AddHostelContract.Presenter presenter) {

    }
}
