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

        String string, string1;

        TextView txtHistory = (TextView)findViewById(R.id.history);
        TextView txt = (TextView) findViewById(R.id.text);

        if (action == null)
        arg1 = parseInt((String) txt.getText());

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

    public void summaryButton(View view){

        String sResult;
        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);


        if (action == Action.SUM && !isCounted)
        {
            sResult =  Integer.toString(arg1 + parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MINUS && !isCounted)
        {
            sResult =  Integer.toString(arg1 - parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.MULTIPLY && !isCounted)
        {
            sResult =  Integer.toString(arg1 * parseInt((String) txt.getText()));
            txtHistory.setText(txtHistory.getText() + "=" + sResult);
            txt.setText(sResult);
        }

        if (action == Action.DIVISION && !isCounted)
        {
            sResult =  Double.toString((double) arg1 / parseInt((String) txt.getText()));
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
