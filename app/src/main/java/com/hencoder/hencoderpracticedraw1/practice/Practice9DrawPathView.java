package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice9DrawPathView extends View {
    private Paint paint = new Paint();
    private Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        float centerX = getWidth() / 2f;
        float centerY = getHeight() / 2f;
        float arcR = 100;
        path.addArc(centerX - arcR, centerY - (arcR - 10), centerX, centerY + (arcR - 10), 150, 210);
        path.arcTo(centerX, centerY - (arcR - 10), centerX + arcR, centerY + (arcR - 10), 180, 210, false);
        path.lineTo(centerX, centerY + arcR * 3f / 2);

        canvas.drawPath(path, paint);

    }
}
