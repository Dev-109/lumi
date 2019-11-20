package com.example.lumi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adjustlighting_settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjustlighting_settings);

        Button btn_return = (Button)findViewById(R.id.back);
        btn_return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}
