package anonymous.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {


    private WebView webView;
    private String URL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        webView = (WebView) findViewById(R.id.webView);

        Intent intent = getIntent();
        URL = intent.getStringExtra("URL");


        webView.loadUrl(URL);








    }
}
