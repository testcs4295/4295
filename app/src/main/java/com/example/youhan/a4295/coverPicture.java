package com.example.youhan.a4295;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by youhan on 11/14/16.
 */

public class coverPicture extends ImageView {

    public coverPicture(final Context context) {
        super(context);
    }

    public coverPicture(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public coverPicture(final Context context, final AttributeSet attrs,
                final int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int width, int height) {
        super.onMeasure(width, height);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            setMeasuredDimension(measuredHeight, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredWidth);

        }

    }

}
