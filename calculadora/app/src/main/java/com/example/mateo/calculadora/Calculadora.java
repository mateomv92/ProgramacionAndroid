package com.example.mateo.calculadora;

import java.sql.ResultSet;

/**
 * Created by alexplanasobany on 25/10/16.
 */

public class Calculadora {
    private double resultat;
    private char operador;

    public Calculadora() {
        resultat = 0.;
        operador = ' ';
    }

    public void nouOperador(char operador) {
        if(operador=='+' || operador=='-' || operador=='*' || operador =='/') {
            this.operador = operador;
        }
    }

    public void nouOperand(double operand) {
        if(this.operador==' ') {
            this.resultat = operand;
        }
        else if(this.operador=='+') {
            this.resultat = this.resultat + operand;
        }
        else if(this.operador=='-') {
            this.resultat = this.resultat - operand;
        }
        else if(this.operador=='*') {
            this.resultat = this.resultat * operand;
        }
        else if(this.operador=='/') {
            if(operand == 0){
                this.resultat = Double.NaN;
            }else{
                this.resultat = this.resultat / operand;
            }
        }
        this.operador = ' ';
    }

    public void clear() {
        resultat = 0.;
        operador = ' ';
    }

    public double getResultat() {
        return resultat;
    }

}
