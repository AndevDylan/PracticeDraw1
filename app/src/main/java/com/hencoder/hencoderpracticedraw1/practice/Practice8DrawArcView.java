package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice8DrawArcView extends View {
    private Paint paint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(getWidth() / 4, getHeight() / 3, getWidth() * 3 / 4, getHeight() * 2 / 3, 250, 90, true, paint);
        canvas.drawArc(getWidth() / 4, getHeight() / 3, getWidth() * 3 / 4, getHeight() * 2 / 3, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(getWidth() / 4, getHeight() / 3, getWidth() * 3 / 4, getHeight() * 2 / 3, 180, 60, false, paint);
    }
}
