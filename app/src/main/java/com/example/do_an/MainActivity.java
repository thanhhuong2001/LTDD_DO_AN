package com.example.do_an;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;
    EditText editPassword;
    boolean isEnable;

    public static final String EXTRA_MESSAGE = "com.example.do_an.MESSAGE";
    private AppBarConfiguration appBarConfiguration;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_page);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        editPassword = findViewById(R.id.editPassword);
        imageView2.setVisibility(View.INVISIBLE);
        imageView1.setOnClickListener(v ->{
            if(!isEnable){
                isEnable = true;
                /*imageView1.setSelected(isEnable);*/
                editPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                imageView2.setVisibility(View.INVISIBLE);
            }else{
                isEnable = false;
                /*imageView1.setSelected(isEnable);*/
                editPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                imageView2.setVisibility(View.VISIBLE);
            }
        });
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editUser = (EditText) findViewById(R.id.editUser);
        EditText editPassword = (EditText) findViewById(R.id.editPassword);
        String message1 = editUser.getText().toString();
        String message2 = editPassword.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message1);
        intent.putExtra(EXTRA_MESSAGE, message2);
        Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent1);

    }

    public void dangky(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }


}