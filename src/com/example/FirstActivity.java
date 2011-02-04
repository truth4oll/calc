package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Integer.*;

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
        CharSequence value = "0";

        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);

         if (isCounted)
         {
             clearAction();
             isCounted=false;
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

    public void actionButton(View view){

        String string, string1;

        TextView txtHistory = (TextView)findViewById(R.id.history);
        TextView txt = (TextView) findViewById(R.id.text);

        if (action == null)
        if (txt.getText().length()!=0){
        arg1 = parseInt(txt.getText().toString());

        switch (view.getId()){
            case R.id.sum:
                if (action == null)
                {
                    action = Action.SUM;
                    string = "+";
                    txt.setText(null);
                    txtHistory.setText(txtHistory.getText() + string);
                }
                else
                {
                    action = Action.SUM;
                    string = "+";
                    string1 = txtHistory.getText().toString();
                    txtHistory.setText(string1.substring(0, string1.length()-1) + string);
                }
                break;
            case R.id.minus:
                if (action == null)
                {
                    action = Action.MINUS;
                    string = "-";
                    txt.setText(null);
                    txtHistory.setText(txtHistory.getText() + string);
                }
                else
                {
                    action = Action.MINUS;
                    string = "-";
                    string1 = txtHistory.getText().toString();
                    txtHistory.setText(string1.substring(0, string1.length()-1) + string);
                }
                break;
            case R.id.multiply:
                if (action == null)
                {
                    action = Action.MULTIPLY;
                    string = "×";
                    txt.setText(null);
                    txtHistory.setText(txtHistory.getText() + string);
                }
                else
                {
                    action = Action.MULTIPLY;
                    string = "×";
                    string1 = txtHistory.getText().toString();
                    txtHistory.setText(string1.substring(0, string1.length()-1) + string);
                }
                break;
            case R.id.division:
                if (action == null)
                {
                    action = Action.DIVISION;
                    string = "/";
                    txt.setText(null);
                    txtHistory.setText(txtHistory.getText() + string);
                }
                else
                {
                    action = Action.DIVISION;
                    string = "/";
                    string1 = txtHistory.getText().toString();
                    txtHistory.setText(string1.substring(0, string1.length()-1) + string);

                }
                break;
        }
        }
    }

    public void summaryButton(View view){

        String sResult;
        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);


        if (action == Action.SUM && !isCounted)
        {
            sResult =  Integer.toString(arg1 + parseInt(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MINUS && !isCounted)
        {
            sResult =  Integer.toString(arg1 - parseInt(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MULTIPLY && !isCounted)
        {
            sResult =  Integer.toString(arg1 * parseInt(txt.getText().toString()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.DIVISION && !isCounted)
        {
            sResult =  Double.toString((double) arg1 / parseInt(txt.getText().toString()));
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
