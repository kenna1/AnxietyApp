package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    private static String clientSecrect ="02718e0d2086f47702ab1e61559d6365";
    private static String clientid ="22dbzn"; //it needs to know who is talking to
    private static String redirecturl="https://finished"; //how can the server can send you back the information

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //scope is what do you want to do
        //Your response type (what format do you expect for the answer)
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fitbit.com/oauth2/authorize" + "?response_type=code&client_id=" + clientid + "C&redirect_uri=" + redirecturl + "2Ffitbit_auth&scope=heartrate"));
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        // when the user is authorized and you want to hanlde the view

        super.onResume();
        Uri uri = getIntent().getData();
        if(uri!=null){
            Toast.makeText(this, "wow great!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "nah bro!", Toast.LENGTH_SHORT).show();
        }
    }
}
