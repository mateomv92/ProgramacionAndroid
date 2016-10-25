package com.example.mateo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculatorActivity extends AppCompatActivity {

    private String num1 = "";
    private String num2 = "";
    private String simbol = "";
    private String operador = "";
    private boolean SaberNum = false;
    private boolean puntMarcat = false;
    private TextView numView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        numView = (TextView)findViewById(R.id.textView);

    }

    public void numeros (View view){
        Button b = (Button) view;
        if(SaberNum == false){
            num1 += b.getText();
            numView.setText(num1);
        }else{
            num2 += b.getText();
            numView.setText(num2);
        }
    }

    public void punt (View view){
        Button b = (Button) view;
        if(puntMarcat == false){
            if(SaberNum == false){
                num1 += b.getText();
                numView.setText(num1);
            }else{
                num2 += b.getText();
                numView.setText(num2);
            }
            puntMarcat = true;
        }

    }

    public void simbols (View view){
        DecimalFormat formater = new DecimalFormat("#.##");
        Button b = (Button) view;
        simbol = b.getText().toString();
        if(b.getText().toString().equals("=")){
            if(num1.isEmpty() && num2.isEmpty()){
                numView.setText("0");
            }else if(num1.isEmpty() || num2.isEmpty()){
                numView.setText("Error");
            }else{
                if(operador.equals("+")){
                    float res = Float.parseFloat(num1)+Float.parseFloat(num2);
                    num1 = formater.format(res);
                    numView.setText(num1);
                    //num1 = numView.getText().toString();
                }else if(operador.equals("-")){
                    float res = Float.parseFloat(num1)-Float.parseFloat(num2);
                    num1 = formater.format(res);
                    numView.setText(num1);
                    //num1 = numView.getText().toString();
                }else if(operador.equals("X")){
                    float res = Float.parseFloat(num1)*Float.parseFloat(num2);
                    num1 = formater.format(res);
                    numView.setText(num1);
                    //num1 = numView.getText().toString();
                }else if(operador.equals("/")){
                    if(num1.equals("0") && num2.equals("0")){
                        numView.setText("Indet");
                    }else if(!num1.equals("0") && num2.equals("0")){
                        numView.setText("Infinity");
                    }else{
                        float res = Float.parseFloat(num1)/Float.parseFloat(num2);
                        num1 = formater.format(res);
                        numView.setText(num1);
                        //num1 = numView.getText().toString();
                    }
                }
            }
            SaberNum = false;
            num2 = "";
            simbol = "";
            operador = "";
        }else {
            operador = simbol;
            SaberNum = true;
        }
    }

    public void clear (View view){
        Button b = (Button) view;
        num1 = "";
        num2 = "";
        simbol = "";
        operador = "";
        SaberNum = false;
        puntMarcat = false;
        numView.setText("");

    }


}
