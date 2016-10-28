package com.example.mateo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculatorActivity extends AppCompatActivity {


    private boolean editant = false;
    private boolean puntMarcat = false;
    private TextView numView;
    private Calculadora calculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        numView = (TextView)findViewById(R.id.textView);
        calculadora = new Calculadora();
    }

    public void numeros (View view){
        Button b = (Button) view;
        if(editant){
            numView.setText(numView.getText().toString()+b.getText().toString());
        }else{
            numView.setText(b.getText().toString());
            if(!b.getText().toString().equals("0")) {
                editant = true;
            }
        }
    }

    public void punt (View view){
        if(!puntMarcat){
            puntMarcat = true;
            if(editant) {
                numView.setText(numView.getText().toString()+'.');
            }
            else {
                numView.setText("0.");
                editant = true;
            }
        }
    }

    public void operadors(View view){
        Button b = (Button)view;
        if(editant) {
            editant=false;
            puntMarcat = false;
            calculadora.nouOperand(Double.parseDouble(numView.getText().toString()));
        }
        calculadora.nouOperador(b.getText().charAt(0));
        numView.setText(Double.toString(calculadora.getResultat()));
    }

    public void igual(View view){
        if(editant) {
            editant=false;
            puntMarcat = false;
            calculadora.nouOperand(Double.parseDouble(numView.getText().toString()));
        }
        numView.setText(Double.toString(calculadora.getResultat()));
    }

    public void clear (View view){
        calculadora.clear();
        editant = false;
        puntMarcat = false;
        numView.setText("");
    }


}
