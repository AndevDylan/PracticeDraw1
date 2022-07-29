package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice11PieChartView extends View {
    // 画饼所用paint
    private Paint arcPaint = new Paint();
    // 写文字所用paint
    private Paint textPaint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        // 圆心
        Point originPoint = new Point(getWidth() / 2, getHeight() / 2);
        // 半径
        int radius = getWidth() / 4;

        // 圆的方程：（x-a）^2 + (y-b)^2 = R^2

        // 画标题
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(40);
        canvas.drawText("饼图", originPoint.x - 40, originPoint.y + radius * 3f / 2, textPaint);

        // 红色饼块
        arcPaint.setColor(Color.RED);
        canvas.drawArc(originPoint.x - radius - 15, originPoint.y - radius - 15, originPoint.x + radius - 15, originPoint.y + radius - 15, 180, 120, true, arcPaint);
        // 折线
        


        arcPaint.setColor(Color.YELLOW);
        canvas.drawArc(originPoint.x - radius, originPoint.y - radius, originPoint.x + radius, originPoint.y + radius, 300, 58, true, arcPaint);

        arcPaint.setColor(Color.parseColor("#673AB7"));
        canvas.drawArc(originPoint.x - radius, originPoint.y - radius, originPoint.x + radius, originPoint.y + radius, 0, 8, true, arcPaint);

        arcPaint.setColor(Color.DKGRAY);
        canvas.drawArc(originPoint.x - radius, originPoint.y - radius, originPoint.x + radius, originPoint.y + radius, 10, 6, true, arcPaint);

        arcPaint.setColor(Color.GREEN);
        canvas.drawArc(originPoint.x - radius, originPoint.y - radius, originPoint.x + radius, originPoint.y + radius, 18, 60, true, arcPaint);

        arcPaint.setColor(Color.BLUE);
        canvas.drawArc(originPoint.x - radius, originPoint.y - radius, originPoint.x + radius, originPoint.y + radius, 80, 100, true, arcPaint);

    }
}
