package anonymous.quizapplication.RentBooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import anonymous.quizapplication.BuyBooks.BuyBooks;
import anonymous.quizapplication.PaymentOptions.PaymentOptions;
import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.Constants;

public class RentBooks extends AppCompatActivity {


    private ImageButton imageButton1,imageButton2,imageButton3,imageButton4,
                        imageButton5,imageButton6,imageButton7,imageButton8,
                        imageButton9,imageButton10,imageButton11,imageButton12,
                        imageButton13,imageButton14,imageButton15;
    private String BUY = "Rent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_books);


        imageButton1 = (ImageButton) findViewById(R.id.imgBtn_R_Book1);
        imageButton2 = (ImageButton) findViewById(R.id.imgBtn_R_Book2);
        imageButton3 = (ImageButton) findViewById(R.id.imgBtn_R_Book3);
        imageButton4 = (ImageButton) findViewById(R.id.imgBtn_R_Book4);
        imageButton5 = (ImageButton) findViewById(R.id.imgBtn_R_Book5);
        imageButton6 = (ImageButton) findViewById(R.id.imgBtn_R_Book6);
        imageButton7 = (ImageButton) findViewById(R.id.imgBtn_R_Book7);
        imageButton8 = (ImageButton) findViewById(R.id.imgBtn_R_Book8);
        imageButton9 = (ImageButton) findViewById(R.id.imgBtn_R_Book9);
        imageButton10 = (ImageButton) findViewById(R.id.imgBtn_R_Book10);
        imageButton11 = (ImageButton) findViewById(R.id.imgBtn_R_Book11);
        imageButton12 = (ImageButton) findViewById(R.id.imgBtn_R_Book12);
        imageButton13 = (ImageButton) findViewById(R.id.imgBtn_R_Book13);
        imageButton14 = (ImageButton) findViewById(R.id.imgBtn_R_Book14);
        imageButton15 = (ImageButton) findViewById(R.id.imgBtn_R_Book15);






        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton1.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);



            }
        });


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton2.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton3.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton4.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton5.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton6.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton7.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton8.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton9.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);

            }
        });


        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton10.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);

            }
        });


        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton11.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton12.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton13.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton14.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RentBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imageButton15.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "10");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });






    }
}
