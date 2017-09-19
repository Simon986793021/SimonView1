package com.wind.simonview1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/19.
 */

public class DrawArcView extends View {
    public DrawArcView(Context context) {
        super(context);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint  paint=new Paint();
        canvas.drawArc(50,50,500,350,0,120,true,paint);

        canvas.drawArc(50,50,500,350,130,120,false,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(50,50,500,350,260,90,false,paint);
    }
}
