package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.ask_Button);
        final ImageView image8Ball = findViewById(R.id.image_8Ball);

        final int[] ballArray =  {
                    R.drawable.ball1,
                    R.drawable.ball2,
                    R.drawable.ball3,
                    R.drawable.ball4,
                    R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);

                Log.d("Magic8Ball", "The Random Number Is:" + number);

                image8Ball.setImageResource(ballArray[number]);


            }
        });

    }
}
