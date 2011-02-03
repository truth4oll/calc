package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends Activity
{
    private int arg1;
    private boolean isCounted = false;
    private enum Action { SUM, MINUS, MULTIPLY, DIVISION};
    private Action action;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void numButton(View view) {

        String string, historyString;
        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);

         if (isCounted)
         {
             clearAction();
             isCounted=false;
         }

        switch (view.getId()) {
            case R.id.num1:
                string = txt.getText() + Integer.toString(1);
                historyString =  txtHistory.getText() + Integer.toString(1);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num2:
                string = txt.getText() + Integer.toString(2);
                historyString =  txtHistory.getText() + Integer.toString(2);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num3:
                string = txt.getText() + Integer.toString(3);
                historyString =  txtHistory.getText() + Integer.toString(3);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num4:
                string = txt.getText() + Integer.toString(4);
                historyString =  txtHistory.getText() + Integer.toString(4);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num5:
                string = txt.getText() + Integer.toString(5);
                historyString =  txtHistory.getText() + Integer.toString(5);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num6:
                string =  txt.getText() + Integer.toString(6);
                historyString =  txtHistory.getText() + Integer.toString(6);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num7:
                string = txt.getText() + Integer.toString(7);
                historyString =  txtHistory.getText() + Integer.toString(7);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num8:
                string = txt.getText() + Integer.toString(8);
                historyString =  txtHistory.getText() + Integer.toString(8);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num9:
                string = txt.getText() + Integer.toString(9);
                historyString =  txtHistory.getText() + Integer.toString(9);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
            case R.id.num0:
                string = txt.getText() + Integer.toString(0);
                historyString =  txtHistory.getText() + Integer.toString(0);
                txt.setText(string);
                txtHistory.setText(historyString);
                break;
        }

    }

    public void actionButton(View view){

        String string;

        TextView txtHistory = (TextView)findViewById(R.id.history);
        TextView txt = (TextView) findViewById(R.id.text);

        arg1 = Integer.parseInt((String) txt.getText());

        switch (view.getId()){
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

    public void summaryButton(View view){

        String sResult;
        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);


        if (action == Action.SUM && !isCounted)
        {
            sResult =  Integer.toString(arg1+Integer.parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MINUS && !isCounted)
        {
            sResult =  Integer.toString(arg1-Integer.parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MULTIPLY && !isCounted)
        {
            sResult =  Integer.toString(arg1*Integer.parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.DIVISION && !isCounted)
        {
            sResult =  Integer.toString(arg1/Integer.parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        isCounted = true;
        action = null;

    }

    public void clearButton(View view){
          clearAction();
    }


    private void clearAction(){

        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);

        arg1 = 0;
        action = null;

        txt.setText(null);
        txtHistory.setText(null);
    }

}
