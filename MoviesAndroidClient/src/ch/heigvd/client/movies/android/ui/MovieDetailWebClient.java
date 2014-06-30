package ch.heigvd.client.movies.android.ui;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MovieDetailWebClient extends WebViewClient 
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) 
    {
        view.loadUrl(url);
        return true;
    }
}
