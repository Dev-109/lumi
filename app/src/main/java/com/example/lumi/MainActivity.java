package com.example.lumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    private static Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu1();
            }
        });

        Button signup = (Button) findViewById(R.id.sign_up);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, sign_up.class));

            }
        });

        CheckBox forgot_psswd = (CheckBox) findViewById(R.id.forgot_password);
        forgot_psswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, password_reset.class));

            }
        });
    }

    public void openMenu1(){
        Intent intent = new Intent(this, Menu1.class);
        startActivity(intent);
    }

}