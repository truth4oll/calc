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

        TextView txt = (TextView) findViewById(R.id.text);
        TextView txtHistory = (TextView)findViewById(R.id.history);

         if (isCounted)
         {
             clearAction();
             isCounted=false;
         }

        switch (view.getId()) {
            case R.id.num1:
                txt.append("1");
                txtHistory.append("1");
                break;
            case R.id.num2:
                txt.append("2");
                txtHistory.append("2");
                break;
            case R.id.num3:
                txt.append("3");
                txtHistory.append("3");
                break;
            case R.id.num4:
                txt.append("4");
                txtHistory.append("4");
                break;
            case R.id.num5:
                txt.append("5");
                txtHistory.append("5");
                break;
            case R.id.num6:
                txt.append("6");
                txtHistory.append("6");
                break;
            case R.id.num7:
                txt.append("7");
                txtHistory.append("7");
                break;
            case R.id.num8:
                txt.append("8");
                txtHistory.append("8");
                break;
            case R.id.num9:
                txt.append("9");
                txtHistory.append("9");
                break;
            case R.id.num0:
                txt.append("0");
                txtHistory.append("0");
                break;
        }

    }

    public void actionButton(View view){

        String string, string1;

        TextView txtHistory = (TextView)findViewById(R.id.history);
        TextView txt = (TextView) findViewById(R.id.text);

        if (action == null)
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
