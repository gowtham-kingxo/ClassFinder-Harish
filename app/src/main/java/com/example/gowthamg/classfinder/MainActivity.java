package com.example.gowthamg.classfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button search, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (Button) findViewById(R.id.search_btn);
        register = (Button) findViewById(R.id.register_btn);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "search clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, SearchActivity.class);

                startActivity(intent);


            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "register clicked", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,Register.class);

                startActivity(i);


            }
        });


    }




}
