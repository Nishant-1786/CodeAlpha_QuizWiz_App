package com.example.quizwiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class last extends AppCompatActivity {
    TextView textView ;
    TextView textView1;
    TextView textView2;
    secondScreen ft = new secondScreen();



    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.last);
        textView1 = findViewById(R.id.scores);
        textView2 = findViewById(R.id.wrong);

        textView1.setText(" You have scored " + ft.sc + " out of 10 ");
        textView2.setText(" wrong answer :- " + ft.wr + " ");


        textView = findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   gotourl("https://www.linkedin.com/pulse/top-50-gk-questions-answers-english-all-competitive-exams-kushwaha/");
            }
        });
    }
    private void gotourl(String url) {
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
