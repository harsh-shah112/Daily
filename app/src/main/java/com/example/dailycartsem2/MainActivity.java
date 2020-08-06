package com.example.dailycartsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout username, regemail, regusername, regnumber, PasswordLayout, etPasswordLayout;
    TextView textlogin, textsignup, fpw;
    Button signup, login;
    EditText name, email, password, number, emaillogin, etpassword;
    LinearLayout l1, l2, open, llorder;
    CheckBox loginyes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button Login and Signup
        signup = findViewById(R.id.signup);
        login = findViewById(R.id.login);

        //textview login and signuo
        textlogin = findViewById(R.id.textlogin);
        textsignup = findViewById(R.id.textsignup);

        //linear layout id to hide and visible dynamic
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);

        //textinputlayout for login side
        username = findViewById(R.id.loginemail);
        etPasswordLayout = findViewById(R.id.loginpassword);

        //edittext of login side
        emaillogin = findViewById(R.id.loginemailedittext);
        etpassword = findViewById(R.id.loginpasswordedittext);

        //edittext of signup side
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        number=findViewById(R.id.number);

        //textinput layout for signupside
        regemail =findViewById(R.id.emailL);
        regusername=findViewById(R.id.nameL);
        regnumber=findViewById(R.id.numberL);
        PasswordLayout=findViewById(R.id.passwordL);


        textsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textlogin.setAlpha((float) 0.7);
                textsignup.setAlpha(1);

                l2.setVisibility(View.VISIBLE);

                Animation animation = new AlphaAnimation(1.0f, 0.5f);
                animation.setDuration(100);
                l1.startAnimation(animation);

                Animation animation1 = new AlphaAnimation(0.5f, 1.0f);
                animation1.setDuration(100);
                l2.startAnimation(animation1);

                l1.setVisibility(View.GONE);

            }
        });

        textlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textlogin.setAlpha(1);
                textsignup.setAlpha((float) 0.7);
                l1.setVisibility(View.VISIBLE);

                Animation animation = new AlphaAnimation(1.0f, 0.5f);
                animation.setDuration(100);
                l2.startAnimation(animation);

                Animation animation1 = new AlphaAnimation(0.5f, 1.0f);
                animation1.setDuration(100);
                l1.startAnimation(animation1);

                l2.setVisibility(View.GONE);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emaillogin.getText().toString().equals("")) {
                    username.setError("Plz Enter your Email Or userName");
                } else if (etpassword.getText().toString().equals("")) {
                    etPasswordLayout.setError("Enter your password");
                    username.setError("");
                } else {
                    if(emaillogin.getText().toString().equalsIgnoreCase("admin") && etpassword.getText().toString().equalsIgnoreCase("admin"))
                    {
                        Intent intent = new Intent(getApplicationContext(),home.class);
                        startActivity(intent);
                    }
                    else
                    {
                        etPasswordLayout.setError("Password Username is Not correct");

                    }
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals(""))
                {
                    regusername.setError("Plz.. Enter Name");
                }
                else if (email.getText().toString().equals(""))
                {
                    regemail.setError("Plz.. Enter Email ");
                }
                else if (number.getText().toString().equals(""))
                {
                    regnumber.setError("Plz.. Enter Number");
                }
                else if (password.getText().toString().equals(""))
                {
                    PasswordLayout.setError("Plz.. Enter Password ");
                }
                else {

                }
            }
        });

    }
}
