package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity
{
    private int arg1, action; // action: sum=1, minus=2, multiply=3, division=4
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void numButton(View view) {
        String string;
        TextView txt = (TextView) findViewById(R.id.text);

        switch (view.getId()) {
            case R.id.num1:
                string = txt.getText() + Integer.toString(1);
                txt.setText(string);
                break;
            case R.id.num2:
                string = txt.getText() + Integer.toString(2);
                txt.setText(string);
                break;
            case R.id.num3:
                string = txt.getText() + Integer.toString(3);
                txt.setText(string);
                break;
            case R.id.num4:
                string = txt.getText() + Integer.toString(4);
                txt.setText(string);
                break;
            case R.id.num5:
                string = txt.getText() + Integer.toString(5);
                txt.setText(string);
                break;
            case R.id.num6:
                string = txt.getText() + Integer.toString(6);
                txt.setText(string);
                break;
            case R.id.num7:
                string = txt.getText() + Integer.toString(7);
                txt.setText(string);
                break;
            case R.id.num8:
                string = txt.getText() + Integer.toString(8);
                txt.setText(string);
                break;
            case R.id.num9:
                string = txt.getText() + Integer.toString(9);
                txt.setText(string);
                break;
            case R.id.num0:
                string = txt.getText() + Integer.toString(0);
                txt.setText(string);
                break;
        }
    }

    public void actionButton(View view){
        TextView txt = (TextView) findViewById(R.id.text);
        arg1 = Integer.parseInt((String) txt.getText());
        switch (view.getId()){
            case R.id.sum:
                action = 1;
                txt.setText("");
                break;
            case R.id.minus:
                action = 2;
                txt.setText("");
                break;
            case R.id.multiply:
                action = 3;
                txt.setText("");
                break;
            case R.id.division:
                action = 4;
                txt.setText("");
                break;
        }
    }

    public void summaryButton(View view){
        TextView txt = (TextView) findViewById(R.id.text);

        if (action == 1) {
         //   sum = arg1+Integer.parseInt((String) txt.getText());
            txt.setText(Integer.toString(arg1+Integer.parseInt((String) txt.getText())));
            action = 0;
        }
        if (action == 2) {
       //     sum = arg1-Integer.parseInt((String) txt.getText());
            txt.setText(Integer.toString(arg1-Integer.parseInt((String) txt.getText())));
            action = 0;
        }
        if (action == 3) {
     //       sum = arg1*Integer.parseInt((String) txt.getText());
            txt.setText(Integer.toString(arg1*Integer.parseInt((String) txt.getText())));
            action = 0;
        }
        if (action == 4) {
   //         sum = arg1/Integer.parseInt((String) txt.getText());
            txt.setText(Integer.toString(arg1/Integer.parseInt((String) txt.getText())));
            action = 0;
        }
    }

    public void clearButton(View view){
        TextView txt = (TextView) findViewById(R.id.text);
        arg1 = action = 0;
        txt.setText("");
    }

}
