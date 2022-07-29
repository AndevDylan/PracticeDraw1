package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Practice10HistogramView extends View {
    private Paint paint = new Paint();
    // 矩形高度
    private ArrayList<Integer> rectangleHeightList = new ArrayList<>();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 坐标原点
        Point originalPoint = new Point(150, getHeight() * 8 / 10);
        // 矩形间隔
        int rectangleInterval = 20;
        // 矩形宽度
        int rectangleWidth = 100;

        // 配置矩形高度
        rectangleHeightList.add(2);
        rectangleHeightList.add(10);
        rectangleHeightList.add(10);
        rectangleHeightList.add(300);
        rectangleHeightList.add(450);
        rectangleHeightList.add(500);
        rectangleHeightList.add(280);

        // xLength
        int xLength = rectangleInterval * 8 + rectangleWidth * 7;
        // yLength
        int yLength = 500;

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(3);
        // 画x轴
        canvas.drawLine(originalPoint.x, originalPoint.y, originalPoint.x + xLength, originalPoint.y, paint);
        // 画y轴
        canvas.drawLine(originalPoint.x, originalPoint.y, originalPoint.x, originalPoint.y - yLength, paint);

        // 画矩形
        paint.setColor(Color.GREEN);
        int rectMidPoint = originalPoint.x + rectangleInterval + rectangleWidth / 2;
        paint.setStrokeWidth(rectangleWidth);
        for (int i = 0; i < rectangleHeightList.size(); i++) {
            canvas.drawLine(rectMidPoint, originalPoint.y, rectMidPoint, originalPoint.y - rectangleHeightList.get(i), paint);
            rectMidPoint += rectangleInterval + rectangleWidth;
        }

        // 画标题
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setTextSize(36);
        canvas.drawText("直方图", originalPoint.x + xLength / 2 - 90, originalPoint.y + 90, paint);
    }
}
