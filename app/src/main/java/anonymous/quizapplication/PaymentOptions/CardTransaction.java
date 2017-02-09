package anonymous.quizapplication.PaymentOptions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import anonymous.quizapplication.R;

public class CardTransaction extends AppCompatActivity {

    private EditText etCardNo,etCardName,etCVV,etCardExpMonth,etCardExpYear;
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_transaction);

        etCardNo = (EditText) findViewById(R.id.etCardNo);
        etCardName = (EditText) findViewById(R.id.etCardName);
        etCVV = (EditText) findViewById(R.id.etCVV);
        etCardExpMonth = (EditText) findViewById(R.id.etCardExpMonth);
        etCardExpYear = (EditText) findViewById(R.id.etCardExpYear);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);







        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });





    }
}
