package com.app5kmezmur;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.app5kmezmur.R;

public class Yezema_mesaria extends Activity {
	Button button4, button5, button6;
	CheckBox ch;

	private String countryNames[] = { "የዜማ መሳሪያዎች በኢትዮጵያ ኦርቶዶክስ ተዋህዶ ቤተክርስቲያን",
			"ከበሮ", "በገና", "መሰንቆ", "ጸናጽል", "መለከት", "መቋሚያ", "እምቢልታ", "ዋሽንት" };

	private Integer imageid[]; /*= { R.drawable.mesqel, R.drawable.kebero1,
			R.drawable.bege, R.drawable.masinko, R.drawable.ts,
			R.drawable.meleket, R.drawable.meku, R.drawable.embilta,
			R.drawable.washint };*/

	public void setTitle(String title) {
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		TextView text = new TextView(this);
		text.setText(title);
		text.setTextSize(20);
		text.setGravity(Gravity.CENTER);
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),"fonts/gfzemenu.ttf"));
		text.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text);
		

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yezema_mesaria);

		setTitle("የዜማ መሣሪያዎች");
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
		ListView listView = (ListView) findViewById(android.R.id.list);
		// For populating list data
		ListAdapt list = new ListAdapt(this, countryNames, imageid);
		listView.setAdapter(list);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view,
					int position, long l) {
				if (position == 0) {
					Intent intent = new Intent(Yezema_mesaria.this, Zema.class);
					startActivity(intent);
				} else if (position == 1) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Kebero.class);
					startActivity(intent);
				} else if (position == 2) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Begena2.class);
					startActivity(intent);
				} else if (position == 3) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Masinko.class);
					startActivity(intent);
				} else if (position == 4) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Tsnatsl.class);
					startActivity(intent);
				} else if (position == 5) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Meleket.class);
					startActivity(intent);
				} else if (position == 6) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Mekuamia.class);
					startActivity(intent);
				} else if (position == 7) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Embilta.class);
					startActivity(intent);
				} else if (position == 8) {
					Intent intent = new Intent(Yezema_mesaria.this,
							Washnt.class);
					startActivity(intent);
				}
			}
		});

		

	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// API 5+ solution
			onBackPressed();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.yezema_mesaria, menu);
		return true;
	}

}
