package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnClear,btnDivide,btnMultiply,btnSubtract,btnDecimal,btnEquals,btnAdd;
    EditText edittext1;
    float mv,mvt;
    boolean add,sub,mul,div,rem;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnZero= (Button) findViewById(R.id.btn0);
        btnOne= (Button) findViewById(R.id.btn1);
        btnTwo= (Button) findViewById(R.id.btn2);
        btnThree= (Button) findViewById(R.id.btn3);
        btnFour= (Button) findViewById(R.id.btn4);
        btnFive= (Button) findViewById(R.id.btn5);
        btnSix= (Button) findViewById(R.id.btn6);
        btnSeven= (Button) findViewById(R.id.btn7);
        btnEight= (Button) findViewById(R.id.btn8);
        btnNine= (Button) findViewById(R.id.btn9);
        btnClear= (Button) findViewById(R.id.btnclear);
        btnDivide= (Button) findViewById(R.id.btndiv);
        btnMultiply= (Button) findViewById(R.id.btnmul);
        btnSubtract= (Button) findViewById(R.id.btnminus);
        btnDecimal= (Button) findViewById(R.id.btnpoint);
        btnEquals= (Button) findViewById(R.id.btnequal);
        btnAdd= (Button) findViewById(R.id.btnsum);
        edittext = (EditText) findViewById(R.id.editTextTextPersonName);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "9");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText( "");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext == null) {
                    edittext.setText("");
                } else {
                    mv = Float.parseFloat(edittext.getText() + "");
                    add = true;
                    edittext.setText(null);
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mv = Float.parseFloat(edittext.getText() + "");
                sub = true;
                edittext.setText(null);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mv = Float.parseFloat(edittext.getText() + "");
                mul = true;
                edittext.setText(null);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mv = Float.parseFloat(edittext.getText() + "");
                div = true;
                edittext.setText(null);
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvt = Float.parseFloat((edittext.getText() + ""));
                if (add == true) {
                    edittext.setText(mv + mvt + "");
                    add = false;
                }
                if (sub == true) {
                    edittext.setText(mv - mvt + "");
                    sub = false;
                }
                if (mul == true) {
                    edittext.setText(mv * mvt + "");
                    mul = false;
                }
                if (div == true) {
                    edittext.setText(mv / mvt + "");
                    div = false;
                }
            }
        });
    }

}