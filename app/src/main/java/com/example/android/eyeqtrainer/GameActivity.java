package com.example.android.eyeqtrainer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    int attempt = 1000;
    int randomAndroidColor;
    int colored;
    int score;
    int highScore;

    Random rnd = new Random();
    int color;
    String s = Integer.toHexString(color);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        nextLevel();
        Intent intent = getIntent();
        highScore = intent.getIntExtra("highScore", highScore);
        ((TextView) findViewById(R.id.highscore)).setText("High Score: " + highScore);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.button1: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case R.id.button2: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button3: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button4: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button5: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button6: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button7: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button8: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }case  R.id.button9: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button10: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button11: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button12: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button13: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button14: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button15: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            }
            case  R.id.button16: {
                if (colored == ((ColorDrawable) v.getBackground()).getColor()) {
                    score++;
                    checkScore();
                    nextLevel();
                } else {
                    attempt--;
                    showAttempt();
                }
                break;
            } default: {
                if (v.getId() == 0) {
                    return;
                }
            }
        }
        if (attempt == 0) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Game Over! Play Again?");
            alertDialogBuilder.setPositiveButton("YES",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            score = 0;
                            ((TextView) findViewById(R.id.score)).setText("Score: " + score);
                            attempt = 3;
                            nextLevel();
                        }
                    });

            alertDialogBuilder.setNegativeButton("NO",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    onBackPressed();
                    finish();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    public void nextLevel() {
        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        color = Color.argb(255, rnd.nextInt(156) + 50, rnd.nextInt(156) + 50, rnd.nextInt(156) + 50);
        findViewById(R.id.button1).setBackgroundColor(color);
        findViewById(R.id.button2).setBackgroundColor(color);
        findViewById(R.id.button3).setBackgroundColor(color);
        findViewById(R.id.button4).setBackgroundColor(color);
        findViewById(R.id.button5).setBackgroundColor(color);
        findViewById(R.id.button6).setBackgroundColor(color);
        findViewById(R.id.button7).setBackgroundColor(color);
        findViewById(R.id.button8).setBackgroundColor(color);
        findViewById(R.id.button9).setBackgroundColor(color);
        findViewById(R.id.button10).setBackgroundColor(color);
        findViewById(R.id.button11).setBackgroundColor(color);
        findViewById(R.id.button12).setBackgroundColor(color);
        findViewById(R.id.button13).setBackgroundColor(color);
        findViewById(R.id.button14).setBackgroundColor(color);
        findViewById(R.id.button15).setBackgroundColor(color);
        findViewById(R.id.button16).setBackgroundColor(color);

        colored = color;
        int button = rnd.nextInt(16);
        int[] all = new int[]{R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
                R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10, R.id.button11,
                R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16};
        int hue = rnd.nextInt(2);
        if ((color & 0xFF0000) == 0x000000) {
            colored += 0b001100100000000000000000;
        } else if ((color & 0xFF0000) == 0xFF0000) {
            colored -= 0b001100100000000000000000;
        } else {
            colored = hue == 0? color + 0b001100100000000000000000: color - 0b001100100000000000000000;
        }
        if ((color & 0x00FF00) == 0x000000) {
            colored += 0b000000000011001000000000;
        } else if ((color & 0x00FF00) == 0x00FF00) {
            colored -= 0b000000000011001000000000;
        } else {
            colored = hue == 0? color + 0b000000000011001000000000: color - 0b000000000011001000000000;
        }
        if ((color & 0x0000FF) == 0x000000) {
            colored += 0b000000000000000000110010;
        } else if ((color & 0x0000FF) == 0x0000FF){
            colored -= 0b000000000000000000110010;
        } else {
            colored = hue == 0? color + 0b000000000000000000110010: color - 0b000000000000000000110010;
        }

        findViewById(all[button]).setBackgroundColor(colored);
    }

    public void showAttempt() {
        if (attempt > 0) {
            final Toast toast = Toast.makeText(getApplicationContext(),
                    "Attempts Remaining: " + attempt,
                    Toast.LENGTH_SHORT);

            toast.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            }, 600);
        }
    }

    public void checkScore() {
        if (score > highScore) {
            highScore = score;
            TextView highScoreText = findViewById(R.id.highscore);
            highScoreText.setText("High Score: " + highScore);
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText("Score: " + score);
        } else {
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText("Score: " + score);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("highScore", highScore);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
