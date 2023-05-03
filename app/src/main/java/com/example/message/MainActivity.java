package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ednum;
EditText msg;
Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednum=findViewById(R.id.editTextTextPersonName2);
        msg=findViewById(R.id.editTextTextPersonName);
        a=findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(ednum.getText().toString(),null,ednum.getText().toString(),null,null);
            }
        });
    }

}