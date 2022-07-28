package com.geektech.geekhw6;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =findViewById(R.id.button);
        EditText editText = findViewById((R.id.editText));


        button.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(android.view.View view) {
                if (editText.getText().toString().equals("")) {
                    button.setBackgroundColor(Color.parseColor("#FF9800"));
                }
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались!",Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Неправильный логин или пароль",Toast.LENGTH_SHORT).show();
            }
        });
        LinearLayout container = findViewById(R.id.container);
        if (editText.getText().toString().equals("admin")){
            Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались!",Toast.LENGTH_SHORT).show();

        }
    }
}