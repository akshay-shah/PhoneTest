package com.knightdevs.phonetest.CustomViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by ashah on 11/8/17.
 */

public class ColorView extends View {
    private int tileSize;
    private Paint paint1, paint2;
    private boolean[][] map;
    private int x, y;

    public ColorView(Context context) {
        super(context);
        init();
    }

    public ColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Paint p = null;
                if (map[i][j]) {
                    p = paint1;
                } else {
                    p = paint2;
                }
                canvas.drawRect(i * tileSize, j * tileSize, tileSize, tileSize, p);
            }

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = (int) (event.getX() / tileSize);
        y = (int) (event.getY() / tileSize);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                map[x][y] = true;
                break;
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
        }
        return false;
    }

    void init() {
        tileSize = 10;
        paint1 = new Paint();
        paint1.setColor(Color.BLUE);
        paint1.setStrokeWidth(10);
        paint1.setStyle(Paint.Style.STROKE);

        paint2 = new Paint();
        paint2.setColor(Color.RED);
        paint2.setStrokeWidth(10);
        paint2.setStyle(Paint.Style.STROKE);
        x = getWidth();
        y = getHeight();

    }
}
