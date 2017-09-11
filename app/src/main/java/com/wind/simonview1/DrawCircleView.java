package com.wind.simonview1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/11.
 */

public class DrawCircleView extends View {
    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawCircle(200,200,100,paint);
        canvas.drawText("ss",500,200,paint);
        /*
         *setStyle(Style style) 这个方法设置的是绘制的 Style 。
         * Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
         * FILL 是填充模式，
         * STROKE 是画线模式（即勾边模式），
         * FILL_AND_STROKE 是两种模式一并使用：既画线又填充。它的默认值是 FILL，填充模式。
         */
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500,200,100,paint);

        paint.setStrokeWidth(20);
        canvas.drawCircle(200,500,100,paint);

        Paint paint1= new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setColor(Color.GREEN);
        paint1.setStyle(Paint.Style.FILL_AND_STROKE);
        paint1.setStrokeWidth(20);
        canvas.drawCircle(500,500,100,paint1);
        Paint paint2= new Paint();
        paint2.setTextSize(24);
        paint2.setColor(Color.RED);
        paint2.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("开启抗锯齿",500,500,paint2);
    }
}
