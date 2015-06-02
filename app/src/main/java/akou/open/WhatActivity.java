package akou.open;


        import android.app.Activity;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.ImageView;

        import com.koushikdutta.ion.Ion;

        import java.io.IOException;
        import java.io.InputStream;
        import java.net.HttpURLConnection;
        import java.net.URL;

public class WhatActivity extends Activity {

    private ImageView imageView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);
        imageView = (ImageView) findViewById(R.id.imageView2);
        Ion.with(imageView).load("http://akoutest.webuda.com/programme2.png");




    }


}





