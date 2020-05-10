package com.phoenix.magic_8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton=findViewById(R.id.askButton);
        final ImageView imageView=findViewById(R.id.imageViewDisplay);
        final int drawableArray[]=new int[]{R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber=new Random();
                int number= randomNumber.nextInt(5);
                imageView.setImageResource(drawableArray[number]);
            }
        });


    }
}
