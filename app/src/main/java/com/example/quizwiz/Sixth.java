package com.example.quizwiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sixth extends AppCompatActivity {
    secondScreen sec = new secondScreen();

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.sixth);
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        textView1 = findViewById(R.id.option1);
        textView2 = findViewById(R.id.option2);
        textView3 = findViewById(R.id.option3);
        textView4 = findViewById(R.id.option4);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sixth.this, "Generating your result", Toast.LENGTH_SHORT).show();
                get();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sixth.this, "Generating your result", Toast.LENGTH_SHORT).show();
                got();

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sixth.this, "Generating your result", Toast.LENGTH_SHORT).show();
                get();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Sixth.this, "Generating your result", Toast.LENGTH_SHORT).show();
                get();
            }
        });
    }
    public void got(){
        sec.sc+=2;
        Intent intent = new Intent(Sixth.this, last.class);
        startActivity(intent);
    }
    public void get(){
        sec.wr++;
        Intent intent = new Intent(Sixth.this, last.class);
        startActivity(intent);

    }
}
