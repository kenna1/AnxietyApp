package com.example.anzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

// Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse("https://www.fitbit.com/oauth2/authorize?"+"response_type=code&client_id="+clientid+"&redirect_uri="+redirecturl+"&scope=activity%20heartrate%20location%20nutrition%20profile%20settings%20sleep%20social%20weight&expires_in=604800"));
// https://www.fitbit.com/oauth2/authorize?response_type=code&client_id=XXXXX&redirect_uri=https%3A%2F%2Fqa05.power2patient.net%2Fapp%2Fpatienthomepage.fitbitconnect%3AcompleteAuthorization&scope=activity%20nutrition%20profile%20settings%20sleep%20social%20weight

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private String clientId= "22DJR7";
    private String clientSecret= "8f738f2197230a8cf833ce49486421d9";
    private String redirectUri= "htt://google.com";

    //Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.fitbit.com/oauth2/authorize?"+"response_type=token&client_id="+clientId+"&redirect_uri="+redirectUri+"&scope=activity%20heartrate%20location%20nutrition%20profile%20settings%20sleep%20social%20weight&expires_in=604800"));

        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Uri uri = getIntent().getData();

        if(uri != null)
        {
            Toast.makeText(this, "yay",Toast.LENGTH_SHORT).show();
        }
    }
}
