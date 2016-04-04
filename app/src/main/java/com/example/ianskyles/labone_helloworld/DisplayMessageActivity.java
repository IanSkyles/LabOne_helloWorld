package com.example.ianskyles.labone_helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private static final String TAG = "DisplayMessageActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Get the intent and assign it to a local variable.
        Intent intent = getIntent();
        //Extract the message delivered by MyActivity with the getStringExtra() method.
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "index=" + 0);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "index=" + 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "index=" + 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "index=" + 0);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "index=" + 0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
