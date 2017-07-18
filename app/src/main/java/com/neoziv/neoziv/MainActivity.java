package com.neoziv.neoziv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebURL(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://neoziv.com"));
        startActivity(browserIntent);
    }
    public void openWebURLContact(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://neoziv.com/page/contactus"));
        startActivity(browserIntent);
    }
}
