package com.xsylsb.integrity.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;
import android.util.Log;

import com.xsylsb.integrity.R;

/**
 * 富文本设置圆角背景
 * Created by 70391 on 2017/10/18.
 */

public class RadiusBackgroundColorSpan extends ReplacementSpan {

    private int mSize;
    private int mColor;
    private int mRadius;

    /**
     * 构造方法
     *
     * @param color  背景颜色
     * @param radius 圆角半径
     */
    public RadiusBackgroundColorSpan(int color, int radius) {
        this.mColor = color;
        this.mRadius = radius;
    }

    @Override
    public int getSize(@NonNull Paint paint, CharSequence text, @IntRange(from = 0) int start, @IntRange(from = 0) int end, @Nullable Paint.FontMetricsInt fm) {
        mSize = (int) (paint.measureText(text, start, end) + 2 * mRadius);
        //mSize就是span的宽度，span有多宽，开发者可以在这里随便定义规则
        //我的规则：这里text传入的是SpannableString，start，end对应setSpan方法相关参数
        //可以根据传入起始截至位置获得截取文字的宽度，最后加上左右两个圆角的半径得到span宽度
        return mSize;
    }

    @Override
    public void draw(@NonNull Canvas canvas, CharSequence text, @IntRange(from = 0) int start, @IntRange(from = 0) int end, float x, int top, int y, int bottom, @NonNull Paint paint) {
        int color = Color.WHITE;//保存文字颜色

        int atextwidth=0;
        int atextHeight=0;
        Float se=paint.getTextSize();
        paint.setAntiAlias(true);// 设置画笔的锯齿效果

//        paint.setColor(Color.parseColor("#40999999"));//设置阴影效果颜色
//        RectF oval_1 = new RectF(x + 10, y + paint.ascent() + 5, x + mSize, y + paint.descent() + 5);
//        canvas.drawRoundRect(oval_1, mRadius, mRadius, paint);
        paint.setColor(mColor);//设置背景颜色
        RectF oval = new RectF(x + 5, y + paint.ascent(), x + mSize - 5, y + paint.descent());
        //设置文字背景矩形，x为span其实左上角相对整个TextView的x值，y为span左上角相对整个View的y值。
        // paint.ascent()获得文字上边缘，paint.descent()获得文字下边缘
        canvas.drawRoundRect(oval, mRadius, mRadius, paint);//绘制圆角矩形，第二个参数是x半径，第三个参数是y半径
        paint.setColor(color);//恢复画笔的文字颜色
        paint.setTextSize(se*0.7f);
        canvas.drawText(text, start, end, x+20 , y-2, paint);//绘制文字
    }


}
