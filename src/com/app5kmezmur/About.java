package com.app5kmezmur;

import java.io.File;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class About extends Activity {
	Button button4, button5, button6;
	CheckBox ch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		TextView text = (TextView) findViewById(R.id.textView1);
		TextView version = (TextView) findViewById(R.id.version);
		TextView t11 = (TextView) findViewById(R.id.t11);
		TextView t12 = (TextView) findViewById(R.id.t12);
		TextView t2 = (TextView) findViewById(R.id.t2);
		TextView t13 = (TextView) findViewById(R.id.t13);
		TextView t3 = (TextView) findViewById(R.id.t3);

		Typeface face = Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf");
		text.setTypeface(face);
		version.setTypeface(face);
		t11.setTypeface(face);
		t12.setTypeface(face);
		t13.setTypeface(face);
		t2.setTypeface(face);
		t3.setTypeface(face);
		setTitle("ስለኛ");
		getActionBar().setSubtitle("በስመአብ ወወልድ ወመንፈስ ቅዱስ አሐዱ አምላክ አሜን።");
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// API 5+ solution
			onBackPressed();
			return true;
			/*
			 * case R.id.call: Toast.makeText(getApplicationContext(),
			 * "አስተያየትዎን በዚህ ስልክ ያድርሱ", Toast.LENGTH_SHORT).show(); call();
			 * return true;
			 */
		case R.id.share:
			shareApplication();
			return true;
		case R.id.email:
			toEmail();
			return true;
		case R.id.rate:
			AppRater.app_launched(About.this);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

	public void shareApplication() {
		ApplicationInfo app = getApplicationContext().getApplicationInfo();
		String filePath = app.sourceDir;
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("*/*");
		intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
		startActivity(intent.createChooser(intent, "Share app via"));
	}

	protected void call() {
		String number = "0935267869";
		Intent callIntent = new Intent(Intent.ACTION_CALL);
		callIntent.setData(Uri.parse("tel:" + number));
		startActivity(callIntent);
	}

	protected void toEmail() {
		
		Intent email=new Intent(Intent.ACTION_SENDTO);
		email.setData(Uri.parse("mailto:teddy3bewunetu@gmail.com"));
		startActivity(email); 
	}

	public void setTitle(String title) {
		getActionBar().setHomeButtonEnabled(true);

		TextView text = new TextView(this);
		text.setText(title);
		text.setTextSize(16);

		text.setTypeface(Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf"));
		text.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text);

	}

}