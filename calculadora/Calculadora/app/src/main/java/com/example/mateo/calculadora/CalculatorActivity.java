package com.example.mateo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;



public class CalculatorActivity extends AppCompatActivity {

    String num1 = "";
    String num2 = "";
    String smbl= "";
    boolean saber_num = false;
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


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"0";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"0";
                    num_edit.setText(num2);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"1";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"1";
                    num_edit.setText(num2);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"2";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"2";
                    num_edit.setText(num2);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"3";
                    num_edit.setText(num1);;
                }
                else{
                    num2 = num2+"3";
                    num_edit.setText(num2);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"4";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"4";
                    num_edit.setText(num2);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"5";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"5";
                    num_edit.setText(num2);;
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"6";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"6";
                    num_edit.setText(num2);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"7";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"7";
                    num_edit.setText(num2);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"8";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"8";
                    num_edit.setText(num2);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+"9";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+"9";
                    num_edit.setText(num2);
                }
            }
        });
        dec_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saber_num == false){
                    num1 = num1+".";
                    num_edit.setText(num1);
                }
                else{
                    num2 = num2+".";
                    num_edit.setText(num2);
                }
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smbl = "/";
                saber_num = true;
                num_edit.setText("");
            }
        });
        mlt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smbl = "*";
                saber_num = true;
                num_edit.setText("");
            }
        });
        sbs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smbl = "-";
                saber_num = true;
                num_edit.setText("");
            }
        });
        sum_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smbl = "+";
                saber_num = true;
                num_edit.setText("");
            }
        });
        eql_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.isEmpty() && num2.isEmpty()){
                    num_edit.setText("0");
                }
                else {

                    if (smbl.equals("/")){
                        float resultado = Float.parseFloat(num1)/Float.parseFloat(num2);
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                        num1 = result;
                        num2 ="";
                    }
                    else if (smbl.equals("*")){
                        num_edit.setText("");
                        float resultado = Float.parseFloat(num1)*Float.parseFloat(num2);
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                        num1 =  result;
                        num2 ="";
                    }
                    else if (smbl.equals("-")){
                        num_edit.setText("");
                        float resultado = Float.parseFloat(num1)- Float.parseFloat(num2);
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                        num1 = result;
                        num2 ="";
                    }
                    else if (smbl.equals("+")){
                        num_edit.setText("");
                        float resultado = Float.parseFloat(num1)+Float.parseFloat(num2);
                        String result = String.format("%f",resultado);
                        num_edit.setText(result);
                        num1 = result;
                        num2 ="";
                    }
                }
            }
        });
        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_edit.setText("");
                saber_num = false;
                num1 = "";
                num2 = "";
            }
        });

    }

}
