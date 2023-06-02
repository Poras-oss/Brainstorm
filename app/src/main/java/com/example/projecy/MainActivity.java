package com.example.projecy;

import androidx.appcompat.app.AppCompatActivity;
import io.appwrite.Client;
import io.appwrite.ID;
import io.appwrite.coroutines.CoroutineCallback;
import io.appwrite.exceptions.AppwriteException;
import io.appwrite.services.Account;
import io.appwrite.services.Databases;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, Login.class));

     /*   Client client = new Client(this)
                .setEndpoint("https://cloud.appwrite.io/v1")
                .setProject("64722d1bb0d7b159699f")
                .setSelfSigned(true);// For self signed certificates, only use for development

        Databases databases = new Databases(client);

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("key", "holy");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        try {
            databases.createDocument(
                    "6473364e65f9110839ac",
                    "6473365c89e857eabd4d",
                    ID.Companion.unique(),
                   "{\"title\":\"con\",\"key\":\"sec\",\"new\":\"mew\"}",
                    new CoroutineCallback<>((result, error) -> {
                        if (error != null) {
                            error.printStackTrace();
                            return;
                        }

                        Log.d("Appwrite", result.toString());
                    })
            );
        } catch (AppwriteException e) {

            throw new RuntimeException(e);
        }

*/


    }
}