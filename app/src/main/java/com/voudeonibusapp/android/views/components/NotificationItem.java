package com.voudeonibusapp.android.views.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.voudeonibusapp.android.R;
import com.voudeonibusapp.android.views.activity.BaseActivity;
import com.voudeonibusapp.android.views.base.ViewGeneric;

public class NotificationItem  extends ViewGeneric {

    private BaseActivity activity;
    private Context context;
    private View notification;

    private TextView notificationTitleText;
    private LinearLayout notificationContent;

    public NotificationItem(Context context, ViewGroup parent) {
        super(context, parent, R.layout.sidebar_category_item);
        this.context = context;
        this.activity = (BaseActivity) context;

        setLayoutElements();
    }

    @Override
    public void setLayoutElements() {
        this.notificationTitleText = (TextView) this.activity.findViewById(R.id.notificationTitleText);
        this.notificationContent = (LinearLayout) this.activity.findViewById(R.id.notificationContent);
    }

}
