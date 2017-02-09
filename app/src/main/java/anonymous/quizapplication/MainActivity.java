package anonymous.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


//    private ListView subjListView;

    private ImageButton cobol,cpp,c,cs,java,js,objc,perl,php,python,ruby,sql,swift;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        subjListView = (ListView) findViewById(R.id.subj_list);


        cobol = (ImageButton) findViewById(R.id.imgBtnCobol);
        cpp = (ImageButton) findViewById(R.id.imgBtnCpp);
        c = (ImageButton) findViewById(R.id.imgBtnC);
        cs = (ImageButton) findViewById(R.id.imgBtnCS);
        java = (ImageButton) findViewById(R.id.imgBtnJava);
        js = (ImageButton) findViewById(R.id.imgBtnJS);
        objc = (ImageButton) findViewById(R.id.imgBtnObjC);
        perl = (ImageButton) findViewById(R.id.imgBtnPerl);
        php = (ImageButton) findViewById(R.id.imgBtnPhp);
        python = (ImageButton) findViewById(R.id.imgBtnPython);
        ruby = (ImageButton) findViewById(R.id.imgBtnRuby);
        sql = (ImageButton) findViewById(R.id.imgBtnSql);




        cobol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "cobol");
                startActivity(intent);



            }
        });


        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "cpp");
                startActivity(intent);


            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "c");
                startActivity(intent);


            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "cs");
                startActivity(intent);
            }
        });


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "java");
                startActivity(intent);

            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "js");
                startActivity(intent);

            }
        });

        objc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "objc");
                startActivity(intent);

            }
        });

        perl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "perl");
                startActivity(intent);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "php");
                startActivity(intent);

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "python");
                startActivity(intent);
            }
        });


        ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "ruby");
                startActivity(intent);
            }
        });


        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Lessons.class);
                intent.putExtra("Subject", "sql");
                startActivity(intent);

            }
        });


    }
}
