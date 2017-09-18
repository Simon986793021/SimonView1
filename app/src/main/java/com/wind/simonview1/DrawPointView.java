package com.wind.simonview1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/18.
 */

public class DrawPointView extends View {
    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(50,50,paint);

        Paint paint1=new Paint();
        paint1.setStrokeWidth(20);
        paint1.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(100,50,paint1);

        Paint paint2 =new Paint();
        paint2.setStrokeWidth(20);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(150,50,paint2);

        Paint paint3= new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(10);
        canvas.drawPoint(200,50,paint3);

    }

}
