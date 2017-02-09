package anonymous.quizapplication.BuyBooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import anonymous.quizapplication.PaymentOptions.PaymentOptions;
import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.Constants;

public class BuyBooks extends AppCompatActivity {

    private ImageButton imgBtnBook1, imgBtnBook2, imgBtnBook3,
                        imgBtnBook4,imgBtnBook5,imgBtnBook6,
                        imgBtnBook7,imgBtnBook8,imgBtnBook9,
                        imgBtnBook10,imgBtnBook11,imgBtnBook12,
                        imgBtnBook13,imgBtnBook14,imgBtnBook15;

    private String BUY = "Purchase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_books);

        imgBtnBook1 = (ImageButton) findViewById(R.id.imgBtnBook1);
        imgBtnBook2 = (ImageButton) findViewById(R.id.imgBtnBook2);
        imgBtnBook3 = (ImageButton) findViewById(R.id.imgBtnBook3);
        imgBtnBook4 = (ImageButton) findViewById(R.id.imgBtnBook4);
        imgBtnBook5 = (ImageButton) findViewById(R.id.imgBtnBook5);
        imgBtnBook6 = (ImageButton) findViewById(R.id.imgBtnBook6);
        imgBtnBook7 = (ImageButton) findViewById(R.id.imgBtnBook7);
        imgBtnBook8 = (ImageButton) findViewById(R.id.imgBtnBook8);
        imgBtnBook9 = (ImageButton) findViewById(R.id.imgBtnBook9);
        imgBtnBook10 = (ImageButton) findViewById(R.id.imgBtnBook10);
        imgBtnBook11 = (ImageButton) findViewById(R.id.imgBtnBook11);
        imgBtnBook12 = (ImageButton) findViewById(R.id.imgBtnBook12);
        imgBtnBook13 = (ImageButton) findViewById(R.id.imgBtnBook13);
        imgBtnBook14 = (ImageButton) findViewById(R.id.imgBtnBook14);
        imgBtnBook15 = (ImageButton) findViewById(R.id.imgBtnBook15);




        imgBtnBook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook1.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imgBtnBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook2.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook3.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook4.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imgBtnBook5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook5.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook6.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook7.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imgBtnBook8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook8.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook9.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);

            }
        });

        imgBtnBook10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook10.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);




            }
        });


        imgBtnBook11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook11.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook12.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook13.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });


        imgBtnBook14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook14.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });

        imgBtnBook15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(BuyBooks.this, PaymentOptions.class);
                intent.putExtra(Constants.BOOK_NAME, imgBtnBook15.getTag().toString());
                intent.putExtra(Constants.BOOK_PRICE, "50" +
                        "");
                intent.putExtra(Constants.FOR, BUY);
                startActivity(intent);


            }
        });





    }
}
