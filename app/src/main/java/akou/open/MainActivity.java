package akou.open;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    private ImageButton mOpenButton;
    private ImageButton mWhatButton;
    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView fafa = (TextView) findViewById(R.id.textView);
        String fact = mFactBook.getFact();
        // Update the label with our dynamic fact
        fafa.setText(fact);



        mOpenButton = (ImageButton) findViewById(R.id.openButton);
        mOpenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenStory();
            }
        });

        mWhatButton = (ImageButton) findViewById(R.id.whatButton);
        mWhatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatStory();
            }
        });

    }

private void OpenStory() {
    Intent intent = new Intent(this, OpenActivity.class);
    startActivity(intent);
}
    private void WhatStory() {
        Intent intent = new Intent(this, WhatActivity.class);
        startActivity(intent);
    }


}
