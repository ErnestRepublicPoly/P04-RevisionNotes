package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Note> Notes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lv = this.findViewById(R.id.lv);
        Notes = new ArrayList<>();
        DBHelper db = new DBHelper(SecondActivity.this);
        ArrayList<Note> data =  db.getAllNotes();
        for (int i = 0; i < data.size(); i++){
            Notes.add(data.get(i));
        }

        aa = new RevisionNotesArrayAdapter(this, R.layout.row, Notes);
        lv.setAdapter(aa);

	}

}
