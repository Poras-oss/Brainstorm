package com.example.projecy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.appwrite.Client;
import io.appwrite.ID;
import io.appwrite.coroutines.CoroutineCallback;
import io.appwrite.services.Account;

public class Login extends AppCompatActivity {

    Button btn;
    Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText phonefield = (EditText)findViewById(R.id.editTextPhone);
        EditText otpfield = (EditText)findViewById(R.id.editTextOtp);

         btn = (Button)findViewById(R.id.button);
         btnConfirm = (Button)findViewById(R.id.btn_confirm);



        Client client = new Client(this)
                .setEndpoint("https://cloud.appwrite.io/v1") // Your API Endpoint
                .setProject("64722d1bb0d7b159699f");

        Account account = new Account(client);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account.createPhoneSession(
                        "91"+phonefield.getText().toString(),
                        "+91"+phonefield.getText().toString(),
                        new CoroutineCallback<>((result, error) -> {
                            if (error != null) {
                                error.printStackTrace();
                                return;
                            }

                            Log.d("Appwrite", result.toString());
                        })
                );
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account.updatePhoneSession(
                        "91"+phonefield.getText().toString(),
                        otpfield.getText().toString(),
                new CoroutineCallback<>((result, error) -> {
                    if (error != null) {
                        error.printStackTrace();
                        return;
                    }

                    Log.d("Appwrite", result.toString());
                })
);
            }
        });

    }
}