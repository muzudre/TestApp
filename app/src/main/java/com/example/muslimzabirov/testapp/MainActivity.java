package com.example.muslimzabirov.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "http://webmuzudre.96.lt/";
        WebView view = (WebView)findViewById(R.id.web);
        view.loadUrl(url);
        view.getSettings().setJavaScriptEnabled(true);

        view.setWebViewClient(new MyBrowser());
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }
}
