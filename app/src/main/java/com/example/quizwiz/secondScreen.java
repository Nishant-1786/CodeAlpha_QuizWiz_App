package com.example.quizwiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;




public class secondScreen extends AppCompatActivity {
      public static int sc = 0;
      public static int wr = 0;

    // TextVie text = findViewById(R.id.ques);
    MainActivity main = new MainActivity();

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView textView;
        textView = findViewById(R.id.viewtext);
        textView.setText("1. When was the first election held in India ?");
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
                got();
                //main.wrong++;

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                get();


            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(secondScreen.this, third.class);
                got();

            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(secondScreen.this, third.class);
                got();

            }
        });
    }

    public void got() {
        wr++;
        Intent intent = new Intent(secondScreen.this, third.class);
        startActivity(intent);
    }

    public void get() {
        sc += 2;
        Intent intent = new Intent(secondScreen.this, third.class);
        startActivity(intent);
    }
}



