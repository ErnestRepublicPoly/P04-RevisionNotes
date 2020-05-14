package com.myapplicationdev.android.p04_revisionnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etContent;
    RadioGroup rgStars;
    Button buttonInsertNote, buttonShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etContent = findViewById(R.id.editTextNote);
        rgStars = findViewById(R.id.radioGroupStars);
        buttonInsertNote = findViewById(R.id.buttonInsertNote);
        buttonShowList = findViewById(R.id.buttonShowList);

        buttonInsertNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = etContent.getText().toString();
                int b = rgStars.getCheckedRadioButtonId();
                int c = 0;
                switch (b) {
                    case R.id.radio1:
                        c = 1;
                        break;
                    case R.id.radio2:
                        c = 2;
                        break;
                    case R.id.radio3:
                        c = 3;
                        break;
                    case R.id.radio4:
                        c = 4;
                        break;
                    case R.id.radio5:
                        c = 5;
                        break;
                    case -1:
                        break;
                }

                DBHelper db = new DBHelper(MainActivity.this);
                db.insertNote(a, c);
                db.close();
            }
        });

        buttonShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }
}
