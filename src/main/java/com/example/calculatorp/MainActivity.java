package com.example.calculatorp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Button pa1btn, btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,addbtn,subbtn,multbtn,divbtn,clearbtn,dotbtn,eqalbtn,cbtn;
        TextView txt,anstxt;
        pa1btn=findViewById(R.id.pa1btn);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        addbtn=findViewById(R.id.addbtn);
        subbtn=findViewById(R.id.subbtn);
        multbtn=findViewById(R.id.multbtn);
        divbtn=findViewById(R.id.divbtn);
        clearbtn=findViewById(R.id.clearbtn);
        eqalbtn=findViewById(R.id.eqalbtn);
        dotbtn=findViewById(R.id.dotbtn);
        cbtn=findViewById(R.id.cbtn);
        txt=findViewById(R.id.txt);
        anstxt=findViewById(R.id.anstxt);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 data = txt.getText().toString();
                txt.setText( data +"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 data = txt.getText().toString();
                txt.setText( data +"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               data = txt.getText().toString();
                txt.setText( data +"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              data = txt.getText().toString();
                txt.setText( data +"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"9");
            }
        });
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         data = txt.getText().toString();
                txt.setText(data +"+");
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 data = txt.getText().toString();
                txt.setText( data +"-");
            }
        });
        multbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 data = txt.getText().toString();
                txt.setText( data +"*");
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               data = txt.getText().toString();
                txt.setText( data +"/");
            }
        });

        pa1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +"%");
            }
        });
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(" ");
                anstxt.setText(" ");
            }
        });
        dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                txt.setText( data +".");
            }
        });
        eqalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt.getText().toString();
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResult=" ";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResult=  rhino.evaluateString(scriptable,data,"javascripts",1,null).toString();
                anstxt.setText(finalResult);
            }
        });
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(" ");
                anstxt.setText(" ");
            }
        });
    }
}