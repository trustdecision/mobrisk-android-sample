package cn.tongdun.mobrisk.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mButton = findViewById(R.id.agree);
        mWebView = findViewById(R.id.webView);
        mButton.setOnClickListener(this);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);//Setting js can directly open the window, such as window.open(), the default is false
        webSettings.setJavaScriptEnabled(true);//Whether to allow js execution, the default is false. When set to true, it will remind you that it may cause XSS vulnerabilities
        webSettings.setSupportZoom(true);//Whether it can be zoomed, the default is true
        webSettings.setBuiltInZoomControls(true);//Whether to display the zoom button, the default is false
        webSettings.setUseWideViewPort(true);//Set this property to scale at any scale. big view mode
        webSettings.setLoadWithOverviewMode(true);//Solve the web page adaptation problem together with setUseWideViewPort(true)
        webSettings.setDomStorageEnabled(true);//DOM Storage
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Toast.makeText(SplashActivity.this, "error!!!", Toast.LENGTH_SHORT).show();
            }
        });
        mWebView.loadUrl("https://www.trustdecision.com/legal/privacy-policy");
    }

    @Override
    public void onClick(View view) {
        if (view==mButton){
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }
}