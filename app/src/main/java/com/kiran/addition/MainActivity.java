package com.kiran.addition;

import android.os.Bundle;
import android.app.Activity;
import com.kiran.arithmatic.*;
import android.widget.*;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition addition = new Addition();

        TextView textView = findViewById(R.id.name);

        textView.setText(addition.sum(1,5)+"");


    }

}