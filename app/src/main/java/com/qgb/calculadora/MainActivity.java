package com.qgb.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDiv, btnVezes, btnMais,
            btnMenos, btnIgual;
    String guarda = "", sinal = "";
    double resultado = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = findViewById(R.id.tvResultado);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        btnVezes = findViewById(R.id.btnVezes);
        btnDiv = findViewById(R.id.btnDiv);
        btnIgual = findViewById(R.id.btnIgual);

    }

    public void Mostrar(View view) {
        if(view ==btn9){
            guarda += "9";
            imprime(guarda);
        }
        if(view ==btn8){
            guarda += "8";
            imprime(guarda);
        }
        if(view ==btn7){
            guarda += "7";
            imprime(guarda);
        }
        if(view ==btn6){
            guarda += "6";
            imprime(guarda);
        }
        if(view ==btn5){
            guarda += "5";
            imprime(guarda);
        }
        if(view ==btn4){
            guarda += "4";
            imprime(guarda);
        }
        if(view ==btn3){
            guarda += "3";
            imprime(guarda);
        }
        if(view ==btn2){
            guarda += "2";
            imprime(guarda);
        }
        if(view ==btn1){
            guarda += "1";
            imprime(guarda);
        }
        if(view ==btn0){
            guarda += "0";
            imprime(guarda);
        }
        if(view ==btnMenos){
            converterGuardar(guarda);
            sinal = "-";
            imprime(sinal);
        }
        if(view ==btnMais){
            converterGuardar(guarda);
            sinal = "+";
            imprime(sinal);
        }
        if(view ==btnDiv){
            converterGuardar(guarda);
            sinal = "/";
            imprime(sinal);
        }
        if(view ==btnVezes){
            converterGuardar(guarda);
            sinal = "*";
            imprime(sinal);
        }
        if(view ==btnIgual){
            calcular();
            sinal = "";

        }
    }

    private void calcular() {
        switch (sinal){
            case "-" :
                resultado-=Double.parseDouble(guarda);
                imprime(Double.toString(resultado));
        }

    }

    private void converterGuardar(String guarda) {
        resultado+= Double.parseDouble(guarda);
    }

    private void imprime(String s) {
        tvResultado.setText(s);
    }
}
