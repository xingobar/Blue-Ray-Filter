package com.example.xingobar.bluelightfilter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by xingobar on 2017/10/1.
 * ref : https://developer.android.com/training/custom-views/custom-drawing.html
 */

public class FilterView extends View {

    private Paint paint;

    public FilterView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
