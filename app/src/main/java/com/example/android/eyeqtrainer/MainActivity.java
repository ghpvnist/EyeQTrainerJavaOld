package com.example.android.eyeqtrainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int highScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void startButton(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
        intent.putExtra("highScore", highScore);
        startActivityForResult(intent, 0);
    }

    // This method is called when the second activity finishes
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Check that it is the SecondActivity with an OK result
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                if (data.hasExtra("highScore")) {
                    int newScore = data.getIntExtra("highScore", -1);
                    if (newScore > highScore) {
                        highScore = newScore;
                        TextView scoreText = findViewById(R.id.score);
                        scoreText.setText("High Score: " + highScore);
                    }
                }
            }
        }
    }
}
