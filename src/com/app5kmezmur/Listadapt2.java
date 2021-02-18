package com.app5kmezmur;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Listadapt2 extends ArrayAdapter<String> {
	private String[] countryNames;
	private Activity context;

	public Listadapt2(Activity context, String[] countryNames) {
		super(context, R.layout.row_item, countryNames);
		this.context = context;
		this.countryNames = countryNames;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		LayoutInflater inflater = context.getLayoutInflater();
		if (convertView == null)
			row = inflater.inflate(R.layout.row_item, null, true);
		TextView textViewCountry = (TextView) row
				.findViewById(R.id.textViewCountry);

		textViewCountry.setText(countryNames[position]);
		return row;
	}
}
