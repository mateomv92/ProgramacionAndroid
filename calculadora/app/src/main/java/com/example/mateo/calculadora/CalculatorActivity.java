package com.example.mateo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculatorActivity extends AppCompatActivity {

//    private String num1 = "";
//    private String num2 = "";
//    private String simbol = "";
//    private String operador = "";
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

    public void igual(View view) {

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
//        DecimalFormat formater = new DecimalFormat("#.##");
//        Button b = (Button) view;
//        simbol = b.getText().toString();
//        if(b.getText().toString().equals("=")){
//            if(num1.isEmpty() && num2.isEmpty()){
//                numView.setText("0");
//            }else if(num1.isEmpty() || num2.isEmpty()){
//                numView.setText("Error");
//            }else{
//                if(operador.equals("+")){
//                    float res = Float.parseFloat(num1)+Float.parseFloat(num2);
//                    num1 = formater.format(res);
//                    numView.setText(num1);
//                    //num1 = numView.getText().toString();
//                }else if(operador.equals("-")){
//                    float res = Float.parseFloat(num1)-Float.parseFloat(num2);
//                    num1 = formater.format(res);
//                    numView.setText(num1);
//                    //num1 = numView.getText().toString();
//                }else if(operador.equals("X")){
//                    float res = Float.parseFloat(num1)*Float.parseFloat(num2);
//                    num1 = formater.format(res);
//                    numView.setText(num1);
//                    //num1 = numView.getText().toString();
//                }else if(operador.equals("/")){
//                    if(num1.equals("0") && num2.equals("0")){
//                        numView.setText("Indet");
//                    }else if(!num1.equals("0") && num2.equals("0")){
//                        numView.setText("Infinity");
//                    }else{
//                        float res = Float.parseFloat(num1)/Float.parseFloat(num2);
//                        num1 = formater.format(res);
//                        numView.setText(num1);
//                        //num1 = numView.getText().toString();
//                    }
//                }
//            }
//            SaberNum = false;
//            num2 = "";
//            simbol = "";
//            operador = "";
//        }else {
//            operador = simbol;
//            SaberNum = true;
//        }
    }

    public void clear (View view){
        calculadora.clear();
        editant = false;
        puntMarcat = false;
        numView.setText("");
    }


}
