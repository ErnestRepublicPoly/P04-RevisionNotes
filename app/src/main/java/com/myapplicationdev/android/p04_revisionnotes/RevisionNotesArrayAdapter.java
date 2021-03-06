package com.myapplicationdev.android.p04_revisionnotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RevisionNotesArrayAdapter extends ArrayAdapter<Note> {
	Context context;
	ArrayList<Note> notes;
	int resource;
	ImageView iv1, iv2, iv3, iv4, iv5;
	TextView noteContent;

	public RevisionNotesArrayAdapter(Context context, int resource, ArrayList<Note> notes) {
		super(context, resource, notes);
		this.context = context;
		this.notes = notes;
		this.resource = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.row, parent, false);
		noteContent = rowView.findViewById(R.id.textViewNote);
		iv1 = rowView.findViewById(R.id.imageView1star);
		iv2 = rowView.findViewById(R.id.imageView2star);
		iv3 = rowView.findViewById(R.id.imageView3star);
		iv4 = rowView.findViewById(R.id.imageView4star);
		iv5 = rowView.findViewById(R.id.imageView5star);

		Note currNote = notes.get(position);
		noteContent.setText(currNote.getNotContent());
		int stars = currNote.getStars();

		if (stars >= 1) {
			iv1.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (stars >= 2) {
			iv2.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (stars >= 3) {
			iv3.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (stars >= 4) {
			iv4.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (stars >= 5) {
			iv5.setImageResource(android.R.drawable.btn_star_big_on);
		}

		return rowView;
	}



}
