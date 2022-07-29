package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice2DrawCircleView extends View {
    private Paint paint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        int radius = 200;
        // 左上实心圆
        int leftTopCenter = getWidth() / 4;
        canvas.drawCircle(leftTopCenter, leftTopCenter, radius, paint);
        // 右上空心圆
        int rightTopCenter = getWidth() * 3 / 4;
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(rightTopCenter, leftTopCenter, radius, paint);

        // 左下实心圆
        int leftBottomCenter = getHeight() * 3 / 4;
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(leftTopCenter, leftBottomCenter, radius, paint);

        // 右下空心圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(50);
        canvas.drawCircle(rightTopCenter, leftBottomCenter, radius, paint);
    }
}
