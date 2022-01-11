package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWidget();
    }

    private void buttonWidget(){
        Button button = findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int rand_num = random.nextInt(6)+1;
                TextView rollResult = findViewById(R.id.rollResult);
                rollResult.setText(Integer.toString(rand_num));
                ImageView diceImage = findViewById(R.id.diceImage);
                switch (rand_num){
                    case 1:
                        diceImage.setImageResource(R.drawable.d1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.d2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.d3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.d4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.d5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.d6);
                        break;

                }
            }
        });
    }
}