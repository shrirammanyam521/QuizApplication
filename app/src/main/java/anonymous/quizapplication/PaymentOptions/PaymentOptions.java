package anonymous.quizapplication.PaymentOptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.Constants;

public class PaymentOptions extends AppCompatActivity {

    String BookName,BookPrice,For;

    private TextView tvBookName,tvBookPrice,tvFor;
    private Button btnCard,btnBanking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_options);

        final Intent intent = getIntent();
        BookName = intent.getStringExtra(Constants.BOOK_NAME);
        BookPrice = intent.getStringExtra(Constants.BOOK_PRICE);
        For = intent.getStringExtra(Constants.FOR);

        tvBookName = (TextView) findViewById(R.id.tvBookName);
        tvBookPrice = (TextView) findViewById(R.id.tvPrice);
        tvFor = (TextView) findViewById(R.id.tvFor);
        btnCard = (Button) findViewById(R.id.btnCard);
        btnBanking = (Button) findViewById(R.id.btnNetBanking);


        tvFor.setText(For);
        tvBookPrice.setText(BookPrice);
        tvBookName.setText(BookName);


        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent1 = new Intent(PaymentOptions.this, CardTransaction.class);

                startActivity(intent1);



            }
        });


        btnBanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });



    }
}
