package com.example.hp.serializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private Intent intent;
    private Bundle bundle;
    private Contact contact;
    private TextView name,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();
    }
    private void init(){
        name= (TextView) findViewById(R.id.txt_name);
        phone  = (TextView) findViewById(R.id.txt_phone);
        intent = getIntent();
        bundle= intent.getBundleExtra("mykey");
        contact= (Contact) bundle.getSerializable("key");
        name.setText(contact.getName());
        phone.setText(contact.getPhone_number());
    }
}
