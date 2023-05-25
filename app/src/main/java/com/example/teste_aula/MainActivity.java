package com.example.teste_aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*declaração de variável para somas*/

        btnsubtracao = (Button) findViewById(R.id.btnsub);
        btnsoma = (Button) findViewById(R.id.btnsoma);
        btnmultiplicacao = (Button) findViewById(R.id.btnmulti);
        btndivisao = (Button) findViewById(R.id.btndiv);
        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        result = (TextView) findViewById(R.id.txtresult);

        btnsoma = findViewById(R.id.btnsoma);
        btnsoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                /*Declarando as variáveis para os números que serão utilizados na soperação
                * juno com o método*/
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                soma();
            }
        });

        btndivisao = findViewById(R.id.btndiv);
        btndivisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                /*método de divisão*/
                divi();
            }
        });

        btnmultiplicacao = findViewById(R.id.btnmulti);
        btnmultiplicacao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                /*método de multiplicação*/
                multi();
            }
        });

        btnsubtracao = findViewById(R.id.btnsub);
        btnsubtracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                /*método de subtração*/
                sub();
            }
        });
    }

    EditText num1;
    EditText num2;
    TextView result;
    int n1;
    int n2;

    Button btnsoma;

    Button btnsubtracao;

    Button btnmultiplicacao;

    Button btndivisao;

    /*conta de adição*/
    public void soma(){
        int resultado = n1 + n2;
        result.setText(Integer.toString(resultado));
    }
    /*conta de subtração*/
    public void sub() {
        int resultado = n1 - n2;
        result.setText(Integer.toString(resultado));
    }
    /*conta de multiplicação*/
    public void multi(){
        int resultado = n1 * n2;
        result.setText(Integer.toString(resultado));
    }
    /*conta de divisãoo*/
    public void divi(){
        int resultado = n1 / n2;
        result.setText(Integer.toString(resultado));
    }
}