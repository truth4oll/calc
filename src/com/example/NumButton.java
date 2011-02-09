package com.example;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public class NumButton extends Button {

    private int value;

    public NumButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }


    private void init(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.NumButton);
        this.value = a.getInt(R.styleable.NumButton_value, 0);
    }


    public int getValue() {
        return this.value;
    }
}
