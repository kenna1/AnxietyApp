package com.example.anxietyapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TLPage extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    EditText email,password;
    ProgressBar progressBar2;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlpage);

        findViewById(R.id.signin).setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.username);
        password = findViewById(R.id.password);
        progressBar2 = findViewById(R.id.progressBar2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // User is signed in
            Intent i = new Intent(TLPage.this, HomePage.class);
            finish();
            startActivity(i);
        }}


    public void SignUpIntent(View view){
        Intent signup = new Intent(this, TherapistRegistration.class);
        startActivity(signup);
    }
    public void forgotpasswordIntent(View view){
        Intent forgotpassword = new Intent(this, Password.class);
        startActivity(forgotpassword);
    }

    public void  LogInIntent(View view){
        Intent login = new Intent(this, HomePage.class);
        startActivity(login);

    }
    private void userLogin(){
        String username1 = email.getText().toString().trim();
        String password1 = password.getText().toString().trim();

        if(username1.isEmpty()){
            email.setError("Email is required");
            email.requestFocus();
            return;

        }
        if(password1.isEmpty()){
            password.setError("password is required");
            password.requestFocus();
            return;

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(username1).matches()){
            email.setError("Invalid email");
            email.requestFocus();
            return;
        }
        if(password1.length()<6){
            password.setError("Password is less than 6");
            password.requestFocus();
            return;
        }

        progressBar2.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(username1,password1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar2.setVisibility(View.GONE);
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Login successful", Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(TLPage.this,HomePage.class);
                    startActivity(home);
                    finish();

                }
                else{
                    Log.i("Response","Failed to sign in user:"+task.getException().getMessage());
                    Toast.makeText(getApplicationContext(),"Login failed", Toast.LENGTH_SHORT).show();
                    progressBar2.setVisibility(View.GONE);

                }
            }
        });

    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.signin:
                userLogin();
                break;
        }
    }
}
