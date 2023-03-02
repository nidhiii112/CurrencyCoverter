package com.nidhi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, rial, lira, ruble, france, won;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        won = findViewById(R.id.won);
        ruble = findViewById(R.id.ruble);
        rial = findViewById(R.id.rial);
        france = findViewById(R.id.france);
        lira = findViewById(R.id.lira);
 
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.011;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.010;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.65;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        won.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 15.83;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        lira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.23;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.91;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        rial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 519.35;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.36;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
    }
}
