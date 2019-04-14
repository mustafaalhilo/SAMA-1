package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginLogoutAdmin extends AppCompatActivity implements View.OnClickListener {
    private Button admin_button;
    private Button login_button;
    private Button createacc_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_logout_admin);
        admin_button = findViewById(R.id.adminbutton);
        admin_button.setOnClickListener(this);
        login_button = findViewById(R.id.loginbutton);
        login_button.setOnClickListener(this);
        createacc_button = findViewById(R.id.createaccbutton);
        createacc_button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            //start page area choices
            case R.id.adminbutton:
                //go to admin page
                startActivity(new Intent(this, AddDataPage.class));
                break;
            case R.id.createaccbutton:
                //go to create account page
                break;
            case R.id.loginbutton:
                //go to login, temporarily redirects to about page until login is dealt with
                startActivity(new Intent(this, AboutPage.class));
                break;

        }
    }
}
