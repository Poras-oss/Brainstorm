package com.example.projecy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import io.appwrite.Client;
import io.appwrite.ID;
import io.appwrite.coroutines.CoroutineCallback;
import io.appwrite.services.Account;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Client client = new Client(this)
                .setEndpoint("https://cloud.appwrite.io/v1") // Your API Endpoint
                .setProject("64722d1bb0d7b159699f");

        Account account = new Account(client);


        account.createPhoneSession(
                "[USER_ID]",
                "+918305882913",
        new CoroutineCallback<>((result, error) -> {
            if (error != null) {
                error.printStackTrace();
                return;
            }

            Log.d("Appwrite", result.toString());
        })
);
    }
}