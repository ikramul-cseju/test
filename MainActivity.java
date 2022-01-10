package com.example.androidlab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreview;
    private TextView mQuestionView;
    private Button mButtonChoice1 ;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreview = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mQuit = findViewById(R.id.quit);

        updateQuestion();

        //button lisenar

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (mButtonChoice1.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();

                }

            }
        });//eof button listenar 1



        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (mButtonChoice2.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();

                }

            }
        });//eof button listenar 2



        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (mButtonChoice3.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();

                }
                finally {

                }

            }
        });//eof button listenar 3

        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getmCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

    }
    private void updateScore(int point){
        mScoreview.setText("Score: " + mScore);
    }


}