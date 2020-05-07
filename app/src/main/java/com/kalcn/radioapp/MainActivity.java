package com.kalcn.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        TextView textView2 = findViewById(R.id.textView2);
        RadioGroup Group = (RadioGroup)findViewById(R.id.Group);

        int id = Group.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton)findViewById(id);

        textView2.setText("我喜歡的是："+selected.getText());

    }
}
