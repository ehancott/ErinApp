package com.ehancott.erinapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Final extends Activity {

    TextView finalScore;

    EditText userInput;
    EditText score;
    TextView recordsTextView;
    MyDBHandler dbHandler;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_Dark_NoActionBar);
        setContentView(R.layout.activity_final);
        startAgain();

        Intent i = getIntent();

        int number = i.getIntExtra("int", 0);


        userInput = (EditText) findViewById(R.id.enterName);
        score = (EditText) findViewById(R.id.score);
        recordsTextView = (TextView) findViewById(R.id.records_TextView);
        finalScore = (TextView) findViewById(R.id.finalScore);
        dbHandler = new MyDBHandler(this, null, null, 1);

        finalScore.setText("Your final score is: " + number);
        score.setText(" " + number);


        printDatabase();
    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        recordsTextView.setText(dbString);
        userInput.setText("Enter name");
    }


    public void addButtonClicked(View view){
        Users user = new Users(userInput.getText().toString());
        dbHandler.addUser(user);
        printDatabase();
    }


    public void deleteButtonClicked(View view){
        String inputText = userInput.getText().toString();
        dbHandler.deleteUser(inputText);
        printDatabase();
    }

    public Button replay;

    public void startAgain(){
        replay = (Button)findViewById(R.id.replay);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent quiz = new Intent(Final.this,Quiz.class);

                startActivity(quiz);
            }
        });







}}