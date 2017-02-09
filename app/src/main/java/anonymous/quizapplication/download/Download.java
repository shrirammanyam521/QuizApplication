package anonymous.quizapplication.download;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;

import anonymous.quizapplication.R;
import anonymous.quizapplication.utilities.Constants;
import anonymous.quizapplication.utilities.RequestHandler;

public class Download extends AppCompatActivity {


    private WebView webViewDownload;
    private String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        Intent intent = getIntent();
        email = intent.getStringExtra(Constants.KEY_USER_EMAIL);


        webViewDownload = (WebView) findViewById(R.id.webViewDownlaod);
        webViewDownload.getSettings().setJavaScriptEnabled(true);
        webViewDownload.setWebViewClient(new myWebClient());
        webViewDownload.loadUrl(Constants.URL_DOWNLOAD+"?email="+email);




    }


    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {


            view.loadUrl(url);
            return true;

        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webViewDownload.canGoBack()) {
            webViewDownload.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }





}


