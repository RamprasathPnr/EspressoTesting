package com.espressotesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input_name;
    private EditText input_password;
    private Button btn_login;
    private TextView link_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        input_name = (EditText) findViewById(R.id.input_name);
        input_password = (EditText) findViewById(R.id.input_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        link_signup = (TextView) findViewById(R.id.link_signup);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String name = input_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "Name is Empty", Toast.LENGTH_SHORT).show();
            return;
        }

        String password = input_password.getText().toString().trim();
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Password is Empty ", Toast.LENGTH_SHORT).show();
            return;
        }


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("input", input_name.getText().toString());
        startActivity(intent);
        // TODO validate success, do something




    }
}
