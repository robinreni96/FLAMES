package com.flames.flames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mDisplayflames,name1,name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mDisplayflames=(TextView)findViewById(R.id.ans);
        name1=(TextView)findViewById(R.id.text1) ;
        name2=(TextView)findViewById(R.id.text2);
        Intent intentstartactivity=getIntent();
        String n1=intentstartactivity.getStringExtra("n1");
        String n2=intentstartactivity.getStringExtra("n2");
        String res=intentstartactivity.getStringExtra("res");
        mDisplayflames.setText(res);
        name1.setText(n1);
        name2.setText(n2);

    }
}
