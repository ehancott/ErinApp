package com.ehancott.erinapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions qQuestions = new Questions();

    private String qAnswer;
    private int qScore = 0;
    private int qQuestionsLength = qQuestions.questions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_Dark_NoActionBar);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);


        score.setText("Score : " + qScore);


        updateQuestion(r.nextInt(qQuestionsLength));



        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == qAnswer){
                    qScore++;
                    score.setText("Score : " + qScore);
                    updateQuestion(r.nextInt(qQuestionsLength));
                } else {
                    gameOver();
                        /*score.setText("Score : " + qScore);
                        updateQuestion(r.nextInt(qQuestionsLength));*/                                     ;
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == qAnswer){
                    qScore++;
                    score.setText("Score : " + qScore);
                    updateQuestion(r.nextInt(qQuestionsLength));
                } else {
                    gameOver();
                       /* score.setText("Score : " + qScore);
                        updateQuestion(r.nextInt(qQuestionsLength)); */                                    ;
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == qAnswer){
                    qScore++;
                    score.setText("Score : " + qScore);
                    updateQuestion(r.nextInt(qQuestionsLength));
                } else {
                    gameOver();
                        /*score.setText("Score : " + qScore);
                        updateQuestion(r.nextInt(qQuestionsLength)); */                                   ;
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == qAnswer){
                    qScore++;
                    score.setText("Score : " + qScore);
                    updateQuestion(r.nextInt(qQuestionsLength));
                } else {
                    gameOver();
                        /*score.setText("Score : " + qScore);
                        updateQuestion(r.nextInt(qQuestionsLength));     */                               ;
                }

            }
        });


    }

    private void updateQuestion(int num) {
        question.setText(qQuestions.getQuestion(num));
        answer1.setText(qQuestions.getChoice1(num));
        answer2.setText(qQuestions.getChoice2(num));
        answer3.setText(qQuestions.getChoice3(num));
        answer4.setText(qQuestions.getChoice4(num));

        qAnswer = qQuestions.getCorrectAnswer(num);
    }








    private void gameOver (){
        Intent i = new Intent( this, Final.class );
        i.putExtra( "int", qScore);
        startActivity(i);

        /*
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + qScore + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), Quiz.class));

                    }

                })
                .setNegativeButton("GO TO SCORE BOARD",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                startActivity(new Intent(getApplicationContext(), Final.class));
                            }

                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();*/
    }

}