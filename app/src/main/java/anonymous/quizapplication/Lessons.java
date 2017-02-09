package anonymous.quizapplication;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import anonymous.quizapplication.utilities.Constants;

public class Lessons extends AppCompatActivity {


    private TextView tvL1,tvL2,tvL3,tvL4,tvL5,tvL6,tvL7,tvL8,tvL9,tvL10,
                     tvL1Q1,tvL2Q2,tvL3Q3,tvL4Q4,tvL5Q5,tvL6Q6,tvL7Q7,tvL8Q8,tvL9Q9,tvL10Q10;


    private String Subject,URL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);


        tvL1 = (TextView) findViewById(R.id.tvL1);
        tvL2 = (TextView) findViewById(R.id.tvL2);
        tvL3 = (TextView) findViewById(R.id.tvL3);
        tvL4 = (TextView) findViewById(R.id.tvL4);
        tvL5 = (TextView) findViewById(R.id.tvL5);
        tvL6 = (TextView) findViewById(R.id.tvL6);
        tvL7 = (TextView) findViewById(R.id.tvL7);
        tvL8 = (TextView) findViewById(R.id.tvL8);
        tvL9 = (TextView) findViewById(R.id.tvL9);
        tvL10 = (TextView) findViewById(R.id.tvL10);

        tvL1Q1 = (TextView) findViewById(R.id.tvL1Q1);
        tvL2Q2 = (TextView) findViewById(R.id.tvL2Q2);
        tvL3Q3 = (TextView) findViewById(R.id.tvL3Q3);
        tvL4Q4 = (TextView) findViewById(R.id.tvL4Q4);
        tvL5Q5 = (TextView) findViewById(R.id.tvL5Q5);
        tvL6Q6 = (TextView) findViewById(R.id.tvL6Q6);
        tvL7Q7 = (TextView) findViewById(R.id.tvL7Q7);
        tvL8Q8 = (TextView) findViewById(R.id.tvL8Q8);
        tvL9Q9 = (TextView) findViewById(R.id.tvL9Q9);
        tvL10Q10 = (TextView) findViewById(R.id.tvL10Q10);


        Intent intent = getIntent();
        Subject = intent.getStringExtra("Subject");




        tvL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson1.html";
                Intent tvL1Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL1Intent.putExtra("URL", URL);
                startActivity(tvL1Intent);



            }
        });


        tvL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson2.html";
                Intent tvL2Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL2Intent.putExtra("URL", URL);
                startActivity(tvL2Intent);



            }
        });



        tvL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson3.html";
                Intent tvL3Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL3Intent.putExtra("URL", URL);
                startActivity(tvL3Intent);


            }
        });




        tvL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson4.html";
                Intent tvL4Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL4Intent.putExtra("URL", URL);
                startActivity(tvL4Intent);



            }
        });



        tvL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson5.html";
                Intent tvL5Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL5Intent.putExtra("URL", URL);
                startActivity(tvL5Intent);


            }
        });



        tvL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                URL = Constants.LESSONS_URL+Subject+"_lesson6.html";
                Intent tvL6Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL6Intent.putExtra("URL", URL);
                startActivity(tvL6Intent);


            }
        });



        tvL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson7.html";
                Intent tvL7Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL7Intent.putExtra("URL", URL);
                startActivity(tvL7Intent);


            }
        });



        tvL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson8.html";
                Intent tvL8Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL8Intent.putExtra("URL", URL);
                startActivity(tvL8Intent);


            }
        });




        tvL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson9.html";
                Intent tvL9Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL9Intent.putExtra("URL", URL);
                startActivity(tvL9Intent);


            }
        });




        tvL10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.LESSONS_URL+Subject+"_lesson10.html";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });




        tvL1Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz1.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });


        tvL2Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz2.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });



        tvL3Q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz3.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);



            }
        });




        tvL4Q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz4.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);



            }
        });



        tvL5Q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                URL = Constants.QUIZ_URL+Subject+"_quiz5.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);



            }
        });



        tvL6Q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                URL = Constants.QUIZ_URL+Subject+"_quiz6.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });



        tvL7Q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz7.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);

            }
        });



        tvL8Q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz8.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });




        tvL9Q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                URL = Constants.QUIZ_URL+Subject+"_quiz9.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);

            }
        });




        tvL10Q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                URL = Constants.QUIZ_URL+Subject+"_quiz10.php";
                Intent tvL10Intent = new Intent(Lessons.this, WebViewActivity.class);
                tvL10Intent.putExtra("URL", URL);
                startActivity(tvL10Intent);


            }
        });













    }
}
