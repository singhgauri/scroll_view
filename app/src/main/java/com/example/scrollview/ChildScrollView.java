package com.example.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ChildScrollView extends android.widget.ScrollView {
    private int parent_id;

    public ChildScrollView(Context context) {
        super(context);
    }

    public ChildScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChildScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }
}

