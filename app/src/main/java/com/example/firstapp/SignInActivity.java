package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignInActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    FirebaseAuth auth;

    EditText name, username, email, password ;
    TextView loginRedirectText;
    MaterialButton regbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        name =  findViewById(R.id.name);
        username =  findViewById(R.id.username);
        email = findViewById(R.id.email);
        password =  findViewById(R.id.password);
        loginRedirectText = findViewById(R.id.redirectText);

        regbtn =  findViewById(R.id.signupbtn);


        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String userUsername = username.getText().toString();
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                HelperClass helperClass = new HelperClass(userName, userEmail, userUsername,userPassword);
                reference.child(userName).setValue(helperClass);

                Toast.makeText(SignInActivity.this, "You have signup successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignInActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    loginRedirectText.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(SignInActivity.this, LoginActivity.class);
            startActivity(intent);

        }
    });

    }
}