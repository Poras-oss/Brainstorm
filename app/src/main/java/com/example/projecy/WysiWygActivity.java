package com.example.projecy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class WysiWygActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wysi_wyg);

        editText = (EditText) findViewById(R.id.editTextTextMultiLine);
        btn = (Button)findViewById(R.id.button2);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* int cursorPositionEnd = editText.getSelectionEnd();
                editText.setSelection(cursorPositionEnd);
                editText.append("**");

                int cursorPositionStart = editText.getSelectionStart();
                editText.setSelection(cursorPositionStart);
                editText.append("**");*/

                editText.append("****");
                int cursorPosition = editText.getSelectionEnd();
                editText.setSelection(cursorPosition-2);
            }
        });

    }
}