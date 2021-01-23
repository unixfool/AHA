package aha.ircayuda.org;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String target_url="https://aha.ircayuda.org";
    private WebView myWebView;
    ProgressBar progressBar;

    private static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBar2);

        myWebView = findViewById(R.id.activity_main_webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.getSettings().setSupportMultipleWindows(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        myWebView.getSettings().setAllowFileAccess(false);
        myWebView.getSettings().setSaveFormData(true);
        myWebView.getSettings().setAllowContentAccess(true);
        myWebView.getSettings().setUserAgentString(USER_AGENT);
        myWebView.loadUrl(target_url);

        ///POPUP Login
        myWebView.setWebChromeClient(new WebChromeClient());

        myWebView.setWebViewClient(new myWebClient());



        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);


        myWebView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);


            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.contains("whatsapp")) {

                    try {
                        view.getContext().startActivity(
                                new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        return true;

                    } catch (android.content.ActivityNotFoundException e) {
                        Toast.makeText(getApplicationContext(), "WHATSAPP no instalado.",
                                Toast.LENGTH_LONG).show();
                    }

                }
                return super.shouldOverrideUrlLoading(view, url);
            }


            public void onReceivedError(WebView webView, int errorCode, String description, String failingUrl) {
                try {
                    webView.stopLoading();
                } catch (Exception ignored) {
                }

                if (webView.canGoBack()) {
                    webView.goBack();
                }

                webView.loadUrl("about:blank");
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("ERROR");
                alertDialog.setMessage(Html.fromHtml(("<p><strong>Dispositivo sin conexión.</strong> <br/>Conecte el dispositivo a internet.</p>")));

                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Inténtalo de nuevo", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        startActivity(getIntent());
                    }
                });

                alertDialog.show();
                super.onReceivedError(webView, errorCode, description, failingUrl);
            }
        });


        myWebView.setWebChromeClient(new WebChromeClient() {

          private static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";

            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {

                final WebView newWebView = new WebView(MainActivity.this);
                newWebView.getSettings().setUserAgentString(USER_AGENT);
                newWebView.setWebViewClient(new WebViewClient());
                newWebView.setWebChromeClient(this);
                newWebView.setWebChromeClient(new WebChromeClient());
                newWebView.getSettings().setSupportZoom(true);
                newWebView.getSettings().setBuiltInZoomControls(true);
                newWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                newWebView.getSettings().setSupportMultipleWindows(true);
                newWebView.getSettings().setDomStorageEnabled(true);
                newWebView.getSettings().setUseWideViewPort(true);
                newWebView.getSettings().setAllowFileAccess(false);
                newWebView.getSettings().setJavaScriptEnabled(true);
                newWebView.getSettings().setDisplayZoomControls(false);
                newWebView.setOverScrollMode(View.OVER_SCROLL_NEVER);
                newWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
                WebView.WebViewTransport transport = (WebView.WebViewTransport) resultMsg.obj;
                view.addView(newWebView);
                transport.setWebView(newWebView);
                resultMsg.sendToTarget();

                newWebView.setWebViewClient(new WebViewClient() {

                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {

                        if (url.contains("whatsapp")) {

                            try {
                                view.getContext().startActivity(
                                        new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                                return true;

                            } catch (android.content.ActivityNotFoundException e) {
                                Toast.makeText(getApplicationContext(), "WHATSAPP NOT INSTALLED.",
                                        Toast.LENGTH_LONG).show();
                            }

                        }

                        if (url.contains("Your-Google-CallBack-URL")) {return false; }
                        if (url.contains("Your-Facebook-CallBack-URL")) {return false;}
                        view.loadUrl(url);
                        return false;

                    }


                });

                return true;

            }


        });

    }

    public class myWebClient extends WebViewClient    {


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url){
            view.scrollTo(0, 0);
            supportFinishAfterTransition();
            super.onPageFinished(view, url);

        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return  super.shouldOverrideUrlLoading(view, url);

        }
    }

    @Override
    // This method is used to detect back button
    public void onBackPressed() {
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}