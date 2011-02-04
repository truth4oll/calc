package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Long.parseLong;


public class FirstActivity extends Activity {
    private long arg1;
    private boolean isCounted = false;


    private enum Action {SUM, MINUS, MULTIPLY, DIVISION}

    private Action action;
    private TextView txt, txtHistory;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txt = (TextView) findViewById(R.id.text);
        txtHistory = (TextView) findViewById(R.id.history);

    }


    public void numButton(View view) {
        CharSequence value = null;

        if (isCounted) {
            clearAction();
            isCounted = false;
        }

        switch (view.getId()) {
            case R.id.num1:
                value = "1";
                break;
            case R.id.num2:
                value = "2";
                break;
            case R.id.num3:
                value = "3";
                break;
            case R.id.num4:
                value = "4";
                break;
            case R.id.num5:
                value = "5";
                break;
            case R.id.num6:
                value = "6";
                break;
            case R.id.num7:
                value = "7";
                break;
            case R.id.num8:
                value = "8";
                break;
            case R.id.num9:
                value = "9";
                break;
            case R.id.num0:
                value = "0";
                break;
        }
        txt.append(value);
        txtHistory.append(value);

    }

    public void actionButton(View view) {

        String string;


        if (action == null)
            if (txt.getText().length() != 0) {
                arg1 = parseLong(txt.getText().toString());

                switch (view.getId()) {
                    case R.id.sum:
                        action = Action.SUM;
                        string = "+";
                        txt.setText(null);
                        txtHistory.setText(txtHistory.getText() + string);
                        break;
                    case R.id.minus:
                        action = Action.MINUS;
                        string = "-";
                        txt.setText(null);
                        txtHistory.setText(txtHistory.getText() + string);
                        break;
                    case R.id.multiply:
                        action = Action.MULTIPLY;
                        string = "×";
                        txt.setText(null);
                        txtHistory.setText(txtHistory.getText() + string);
                        break;
                    case R.id.division:
                        action = Action.DIVISION;
                        string = "/";
                        txt.setText(null);
                        txtHistory.setText(txtHistory.getText() + string);
                        break;
                }
            }
    }

    public void summaryButton(View view) {

        String sResult;

        if (action == Action.SUM && !isCounted) {
            sResult = Long.toString(arg1 + parseLong(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MINUS && !isCounted) {
            sResult = Long.toString(arg1 - parseLong(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MULTIPLY && !isCounted) {
            sResult = Long.toString(arg1 * parseLong(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.DIVISION && !isCounted) {
            sResult = Double.toString((double) arg1 / parseLong(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        isCounted = true;
        action = null;

    }

    public void clearButton(View view) {
        clearAction();
    }


    private void clearAction() {
        arg1 = 0;
        action = null;

        txt.setText(null);
        txtHistory.setText(null);
    }

}
