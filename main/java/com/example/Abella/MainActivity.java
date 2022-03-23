package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result1;
    double numHold1, numHold2;
    String str1, str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean numbers()
    {
        num1 = findViewById(R.id.text1);
        num2 = findViewById(R.id.text2);
        result1 = findViewById(R.id.resultBox);

        str1 = num1.getText().toString();
        str2 = num2.getText().toString();
        if ((str1.equals(null) && str2.equals(null))
                || (str1.equals("") && str2.equals("")))
        //if(str1.equals(null) && str2.equals(null))
        {
            String result = "Syntax Error";
            result1.setText(result);
            return false;
        }
        else
        {
            numHold1 = Double.parseDouble(str1);
            numHold2 = Double.parseDouble(str2);
        }
        return true;
    }
    public void add(View v)
    {
        // get the input numbers
        if (numbers()) {
            double sum = numHold1 + numHold2;
            result1.setText(Double.toString(sum));
        }
    }
    public void sub(View v)
    {
        if(numbers())
        {
            double sub = numHold1 - numHold2;
            result1.setText(Double.toString(sub));
        }
    }
    public void mul(View v)
    {
        if(numbers())
        {
            double mul = numHold1 * numHold2;
            result1.setText(Double.toString(mul));
        }
    }
    public void div(View v)
    {
        if(numbers())
        {
            double div = numHold1 / numHold2;
            result1.setText(Double.toString(div));
        }
    }
    public void mod(View v)
    {
        if(numbers())
        {
            double mod = numHold1 % numHold2;
            result1.setText(Double.toString(mod));
        }
    }
    public void clr(View v){
        num1.getText().clear();
        num2.getText().clear();
    }

}