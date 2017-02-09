package anonymous.quizapplication.login;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.Constants;
import anonymous.quizapplication.utilities.RequestHandler;

public class ForgotPassword extends AppCompatActivity {

    private TextView tvMessage;
    private EditText etEmail;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


        tvMessage = (TextView) findViewById(R.id.tvMessage);
        etEmail = (EditText) findViewById(R.id.etEmailForgotPassword);
        btnSubmit = (Button) findViewById(R.id.btnForgotPassSubmit);




        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new SendPassword().execute();

            }
        });




    }


    class SendPassword extends AsyncTask<Object, Object, String> {

        ProgressDialog dialog;
        String email;

        @Override
        protected void onPreExecute() {

            dialog = ProgressDialog.show(ForgotPassword.this,"Sending Email","Wait..");
            email = etEmail.getText().toString().trim();

            super.onPreExecute();
        }


        @Override
        protected void onPostExecute(String aVoid) {
            super.onPostExecute(aVoid);

            if (dialog.isShowing()) {

                dialog.dismiss();
            }


                tvMessage.setText(aVoid);

            etEmail.setText("");
            Toast.makeText(ForgotPassword.this, aVoid, Toast.LENGTH_SHORT).show();

        }

        @Override
        protected String doInBackground(Object... params) {


            HashMap<String, String> map = new HashMap<>();
            map.put(Constants.KEY_USER_EMAIL, email);
            RequestHandler requestHandler = new RequestHandler();
            String res = requestHandler.sendPostRequest(Constants.URL_FORGOT_PASSWORD, map);



            return res;
        }




    }


}
