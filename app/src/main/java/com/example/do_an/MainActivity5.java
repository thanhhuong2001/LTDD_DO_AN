package com.example.do_an;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list_page);
    }

    public void user(View view){
        Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
        startActivity(intent);
    }
    public void quanly(View view){
        Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
        startActivity(intent);
    }
    public void setting(View view){
        Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
        startActivity(intent);
    }
    public void logout(View view){
        Intent intent = new Intent(MainActivity5.this, MainActivity.class);
        startActivity(intent);
    }
}