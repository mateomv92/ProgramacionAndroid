package com.example.mateo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button clr_btn = (Button) findViewById(R.id.clr_btn);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button dec_btn = (Button) findViewById(R.id.dec_btn);
        Button div_btn = (Button) findViewById(R.id.div_btn);
        Button mlt_btn = (Button) findViewById(R.id.mlt_btn);
        Button sum_btn = (Button) findViewById(R.id.sum_btn);
        Button sbs_btn = (Button) findViewById(R.id.sbs_btn);
        Button eql_btn = (Button) findViewById(R.id.eql_btn);
        final EditText num_edit = (EditText) findViewById(R.id.num_edit);
        String[] partes;
        String num1 = "";
        String num2 = "";
        String smbl= "";


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "0";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "1";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "2";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "3";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "4";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "5";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "6";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "7";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "8";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmb = "9";
                String text = num_edit.getText().toString()+nmb;
                num_edit.setText(text);
            }
        });
        dec_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smbl = ".";
                String text = num_edit.getText().toString()+smbl;
                num_edit.setText(text);
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smbl = " / ";
                String text = num_edit.getText().toString()+smbl;
                num_edit.setText(text);
            }
        });
        mlt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smbl = " * ";
                String text = num_edit.getText().toString()+smbl;
                num_edit.setText(text);
            }
        });
        sbs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smbl = " - ";
                String text = num_edit.getText().toString()+smbl;
                num_edit.setText(text);
            }
        });
        sum_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smbl = " + ";
                String text = num_edit.getText().toString()+smbl;
                num_edit.setText(text);
            }
        });
        eql_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero = num_edit.getText().toString();
                if (strnumero.isEmpty()){
                    num_edit.setText("0");
                }
                else {
                    String partes[] = strnumero.split(" ");
                    float num1 = Float.parseFloat(partes[0]);
                    String simbolo = partes[1];
                    Log.i("clicks", partes[2]);
                    float num2 = Float.parseFloat(partes[2]);
                    if (simbolo == "/" ){
                        float resultado = num1/num2;
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                    }
                    else if (simbolo == " *"){
                        num_edit.setText("");
                        float resultado = num1*num2;
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                    }
                    else if (simbolo == " -"){
                        num_edit.setText("");
                        float resultado = num1-num2;
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                    }
                    else if (simbolo == " +"){
                        num_edit.setText("");
                        float resultado = num1+num2;
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                    }
                }
            }
        });
        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_edit.setText("");

            }
        });

    }

    /*private String clickplus(String num1) {

    }*/
}
