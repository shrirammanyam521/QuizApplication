package anonymous.quizapplication.register;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.regex.Pattern;

import anonymous.quizapplication.utilities.Constants;
import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.RequestHandler;


public class Register extends AppCompatActivity implements View.OnClickListener {


    //Defining views
    private EditText etFname,etMname,etLname,etEmail,etPassword,etConfPassword,etMno;
    private RadioGroup radio_group;
    private RadioButton r_gender;
    private String gender;
    private int selId;
    private String password,fname,mname,lname,email,mno;
    String possibleEmail="";



    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        InputFilter[] Textfilters = new InputFilter[1];
        Textfilters[0] = new InputFilter(){
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                if (end > start) {

                    char[] acceptedChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',' '};

                    for (int index = start; index < end; index++) {
                        if (!new String(acceptedChars).contains(String.valueOf(source.charAt(index)))) {
                            return "";
                        }
                    }
                }
                return null;
            }

        };

        InputFilter[] Textfilters1 = new InputFilter[1];
        Textfilters1[0] = new InputFilter(){
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                if (end > start) {

                    char[] acceptedChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','1','2','3','4','5','6','7','8','9','0','!','@','#','$','%','&','*','(',')','_','-'};

                    for (int index = start; index < end; index++) {
                        if (!new String(acceptedChars).contains(String.valueOf(source.charAt(index)))) {
                            return "";
                        }
                    }
                }
                return null;
            }

        };


        //Initializing views
        etFname = (EditText) findViewById(R.id.etFname);
        etFname.setFilters(Textfilters);
        etMname = (EditText) findViewById(R.id.etMname);
        etMname.setFilters(Textfilters);
        etLname = (EditText) findViewById(R.id.etLname);
        etLname.setFilters(Textfilters);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword.setFilters(Textfilters1);
        etConfPassword = (EditText) findViewById(R.id.etConfPass);
        etConfPassword.setFilters(Textfilters1);
        etMno = (EditText) findViewById(R.id.etMobNumber);
        buttonSubmit = (Button) findViewById(R.id.submit);




        radio_group = (RadioGroup) findViewById(R.id.radio_group);








        etEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b){
                    Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
                    Account[] accounts = AccountManager.get(Register.this).getAccounts();
                    for (Account account : accounts) {
                        if (emailPattern.matcher(account.name).matches()) {
                            possibleEmail = account.name;
                            etEmail.setText(possibleEmail);
                        }
                    }



                }
            }
        });










        buttonSubmit.setOnClickListener(this);
    }


    //Adding an employee
    private void addUser(){


        class AddUser extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Register.this,"Registering...","Please Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Register.this, s, Toast.LENGTH_SHORT).show();

                if (s.contentEquals("Registration Successful")){

                    setContentView(R.layout.result);

                    TextView tvresult = (TextView) findViewById(R.id.tvResult);
                    tvresult.setText(s);
                }else if (s.contentEquals("Email Already Registered")){

                    setContentView(R.layout.result);

                    TextView tvresult = (TextView) findViewById(R.id.tvResult);
                    tvresult.setText(s);

                }


            }

            @Override
            protected String doInBackground(Void... v) {

                HashMap<String,String> params = new HashMap<>();
                params.put(Constants.KEY_USER_FNAME,fname);
                params.put(Constants.KEY_USER_MNAME,mname);
                params.put(Constants.KEY_USER_LNAME,lname);
                params.put(Constants.KEY_USER_EMAIL,email);
                params.put(Constants.KEY_USER_PASSWORD,password);
                params.put(Constants.KEY_USER_MNO,mno);
                params.put(Constants.KEY_USER_GENDER,gender);
                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Constants.URL_REGISTER, params);
                return res;
            }
        }

        AddUser addUser = new AddUser();
        addUser.execute();
    }

    @Override
    public void onClick(View v) {

        ConnectivityManager connMgr =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();

        final String confPass = etConfPassword.getText().toString().trim();


        fname = etFname.getText().toString().trim();
        mname = etMname.getText().toString().trim();
        lname = etLname.getText().toString().trim();
        email = etEmail.getText().toString().trim();
        password = etPassword.getText().toString().trim();
        mno = etMno.getText().toString().trim();

        if(radio_group.getCheckedRadioButtonId()!=-1){
            selId= radio_group.getCheckedRadioButtonId();
            r_gender = (RadioButton) findViewById(selId);
            gender = r_gender.getText().toString().trim();

        }





        if (TextUtils.isEmpty(etFname.getText().toString().trim())){
            etFname.setError(Html.fromHtml("<font color='red'>Enter First name!</font>"));
            etFname.requestFocus();

        }
        else if (TextUtils.isEmpty(etLname.getText().toString().trim())){
            etLname.setError(Html.fromHtml("<font color='red'>Enter Last Name!</font>"));
            etLname.requestFocus();

        }
        else if (TextUtils.isEmpty(etEmail.getText().toString().trim())){
            etEmail.setError(Html.fromHtml("<font color='red'>Enter Email!</font>"));
            etEmail.requestFocus();

        }
        else if (TextUtils.isEmpty(etPassword.getText().toString().trim())){
            etPassword.setError(Html.fromHtml("<font color='red'>Enter Password!</font>"));
            etPassword.requestFocus();

        }
        else if (TextUtils.isEmpty(etConfPassword.getText().toString().trim())){
            etConfPassword.setError(Html.fromHtml("<font color='red'>Enter Confirm Password!</font>"));
            etConfPassword.requestFocus();

        }
        else if(TextUtils.isEmpty(gender)){
            Toast.makeText(Register.this, "Select Gender", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(etMno.getText().toString().trim())){
            etMno.setError(Html.fromHtml("<font color='red'>Enter Mobile Number</font>"));
            etMno.requestFocus();

        }
        else if(mno.length()!=10){
            Toast.makeText(Register.this, "Mobile Number Should be 10 digits", Toast.LENGTH_SHORT).show();
        }
        else if (!confPass.contentEquals(password)) {

            Toast.makeText(Register.this, "Passwords Do Not Match", Toast.LENGTH_SHORT).show();

        }
        else if (!isValidEmail(email)){

            Toast.makeText(Register.this, "Enter a Valid Email", Toast.LENGTH_SHORT).show();

        }
//        else if (!activeInfo.isConnected()){
//            Toast.makeText(Register.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
//        }
        else{
            addUser();
        }


    }



    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
