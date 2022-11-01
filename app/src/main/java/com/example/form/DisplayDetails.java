package com.example.form;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayDetails extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_details);

        TextView txtFirstName =  (TextView) findViewById(R.id.txtFirstName);
        TextView txtEmail =(TextView) findViewById(R.id.txtEmailId);
        TextView txtPhone =(TextView) findViewById(R.id.txtPhoneNumber);

        txtFirstName.setText(getIntent().getStringExtra("name"));
        txtEmail.setText(getIntent().getStringExtra("email"));
        txtPhone.setText(getIntent().getStringExtra("phone"));
    }
}
