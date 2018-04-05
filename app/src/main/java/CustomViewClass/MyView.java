package CustomViewClass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lenovo on 05.04.2018.
 * Edited by Karpovich Dmitry.
 */

public class MyView extends View {

    private int SQUARE_SIZE = 200;
    private Rect mRectSquare;
    private Paint mPaintSquare;

    public MyView(Context context) {
        super(context);
        init(null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){

        mRectSquare = new Rect();                               // create object square
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);        // object for painting and in brackets smoothing
        mPaintSquare.setColor(Color.GREEN);                     // selected color for painting
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.GRAY);       // set background
                                           // set coordinates
                                           // left top angle and right bottom angle
        mRectSquare.left = 50;
        mRectSquare.top = 50;
        mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;
        mRectSquare.right = mRectSquare.left + SQUARE_SIZE;

        canvas.drawRect(mRectSquare,mPaintSquare);       // apply settings paint and dimension for create square
    }

    public void swap_color(){

        // change color depending on color

        mPaintSquare.setColor(mPaintSquare.getColor() == Color.GREEN ? Color.RED : Color.GREEN);
        postInvalidate();
    }
}