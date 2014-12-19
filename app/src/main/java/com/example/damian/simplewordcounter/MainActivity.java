package com.example.damian.simplewordcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MainActivity extends ActionBarActivity {

    List<String> arrayList;
    EditText text_input;
    TextView result_area;
    String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void countWords(View v)
    {
        text_input = (EditText) findViewById(R.id.text_input);
        result_area = (TextView) findViewById(R.id.result_area);

        arrayList = new ArrayList<String>(Arrays.asList(text_input.getText().toString().split(",")));

        Set<String> uniqueSet = new HashSet<String>(arrayList);
        resultado = "";
        for (String identificador : uniqueSet) {
            resultado += identificador + ": " + Collections.frequency(arrayList, identificador) + "\n";
        }
        result_area.setText(resultado);
    }
}
