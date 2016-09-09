package com.example.hp.serializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Contact contact;
    private Bundle bundle;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        button= (Button) findViewById(R.id.btn_switch);
        contact= new Contact("thao dep trai","001010101");
        bundle= new Bundle();
        bundle.putSerializable("key",contact);
        intent= new Intent(this,ResultActivity.class);
        intent.putExtra("mykey",bundle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
