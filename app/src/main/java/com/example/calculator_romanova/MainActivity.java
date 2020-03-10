package com.example.calculator_romanova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDecimal, buttonC, buttonEqual,buttonMod;
    EditText caculate;
    float mValueOne, mValueTwo;
    boolean addition, subtract, multiplication, division,log,mod ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        buttonDecimal=(Button)findViewById(R.id.decimal);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.minus);
        buttonMul = (Button) findViewById(R.id.multiply);
        buttonDivision = (Button) findViewById(R.id.div);
        buttonC = (Button) findViewById(R.id.clear);
        buttonEqual = (Button) findViewById(R.id.equals);
        buttonMod=(Button)findViewById(R.id.mod) ;
        caculate = (EditText) findViewById(R.id.answer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText(caculate.getText() + "0");
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caculate.setText(caculate.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    mValueOne = Float.parseFloat(caculate.getText() + "");
                    addition = true;
                    caculate.setText(null);

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(caculate.getText() + "");
                subtract = true;
                caculate.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(caculate.getText() + "");
                multiplication = true;
                caculate.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(caculate.getText() + "");
                division = true;
                caculate.setText(null);
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(caculate.getText()+"");
                mod=true;
                caculate.setText(null);
            }
        });



        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(caculate.getText() + "");

                if (addition == true) {
                    caculate.setText(mValueOne + mValueTwo + "");
                    multiplication = false;
                }

                if (subtract == true) {
                    caculate.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    caculate.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    caculate.setText(mValueOne / mValueTwo + "");
                    division = false;
                }

                if(mod==true){
                    caculate.setText((int) (mValueOne % mValueTwo)+"");
                    mod=false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate.setText("");
            }
        });


    }
}
