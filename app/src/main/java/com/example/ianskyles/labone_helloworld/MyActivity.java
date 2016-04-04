package com.example.ianskyles.labone_helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Get the intent and assign it to a local variable.
        Intent intent = getIntent();
        //Extract the message delivered by MyActivity with the getStringExtra() method.
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        // create an Intent to start an activity called DisplayMessageActivity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
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
