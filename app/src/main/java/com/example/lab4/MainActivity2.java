package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView receiver_msg = findViewById(R.id.received_value_id);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        receiver_msg.setText("hello,"+str);


    }
}