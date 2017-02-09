package anonymous.quizapplication.NavigationDrawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import anonymous.quizapplication.AudioCapture.AudioCapture;
import anonymous.quizapplication.BuyBooks.BuyBooks;
import anonymous.quizapplication.Lessons;
import anonymous.quizapplication.MainActivity;
import anonymous.quizapplication.R;
import anonymous.quizapplication.RentBooks.RentBooks;
import anonymous.quizapplication.VideoCapture.VIdeoCapture;
import anonymous.quizapplication.download.Download;
import anonymous.quizapplication.upload.upload_home;
import anonymous.quizapplication.utilities.Constants;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private ImageButton cobol,cpp,c,cs,java,js,objc,perl,php,python,ruby,sql,swift;
    private Intent intent;
    private TextView tv_header_email;
    private String user;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close){
            public void onDrawerSlide(View drawerView,float v) {
                super.onDrawerSlide(drawerView,0);
                // Do whatever you want here

                tv_header_email = (TextView) findViewById(R.id.tv_header_email);
                tv_header_email.setText(user);
            }
        };
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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



        sharedPreferences = getSharedPreferences(Constants.SHARED_PREFS, MODE_PRIVATE);

        user = sharedPreferences.getString(Constants.PREFS_USER, "");




        cobol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "cobol");
                startActivity(intent);



            }
        });


        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "cpp");
                startActivity(intent);


            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "c");
                startActivity(intent);


            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "cs");
                startActivity(intent);
            }
        });


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "java");
                startActivity(intent);

            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "js");
                startActivity(intent);

            }
        });

        objc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "objc");
                startActivity(intent);

            }
        });

        perl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "perl");
                startActivity(intent);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "php");
                startActivity(intent);

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "python");
                startActivity(intent);
            }
        });


        ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "ruby");
                startActivity(intent);
            }
        });


        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Home.this,Lessons.class);
                intent.putExtra("Subject", "sql");
                startActivity(intent);

            }
        });






    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
            builder.setTitle("Logout");
            builder.setMessage("Are You Sure you Want to Logout?");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Home.this.finish();

                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                }
            });

            builder.show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_buy_books) {
            // Handle the camera action

            startActivity(new Intent(Home.this, BuyBooks.class));

        } else if (id == R.id.nav_rent_books) {

            startActivity(new Intent(Home.this, RentBooks.class));

        } else if (id == R.id.nav_download) {

            Intent intent = new Intent(Home.this, Download.class);
            intent.putExtra(Constants.KEY_USER_EMAIL, user);
            startActivity(intent);


        } else if (id == R.id.nav_record_audio) {

            startActivity(new Intent(Home.this, AudioCapture.class));

        } else if (id == R.id.nav_record_video) {

            startActivity(new Intent(Home.this, VIdeoCapture.class));
        }else if (id == R.id.nav_upload){

            startActivity(new Intent(Home.this, upload_home.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
