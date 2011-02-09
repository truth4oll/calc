package com.example;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by IntelliJ IDEA.
 * User: truth4oll
 * Date: 09.02.11
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
public class NumButton extends Button {

    private int value;

    public NumButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }


    private void init(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.NumButton);
        this.value = a.getInt(R.styleable.NumButton_value, 1);
    }


    public int getValue() {
        return this.value;
    }
}
