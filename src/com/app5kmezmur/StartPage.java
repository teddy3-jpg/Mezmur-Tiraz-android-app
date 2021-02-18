package com.app5kmezmur;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import com.app5kmezmur.R;

public class StartPage extends Activity {
	int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_page);
		TextView textv = (TextView) findViewById(R.id.textv);
		TextView text = (TextView) findViewById(R.id.text);
		Typeface face = Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf");
		textv.setTypeface(face);
		text.setTypeface(face);
		ProgressBar image = (ProgressBar) findViewById(R.id.progressBar1);
		Animation animation1 = AnimationUtils.loadAnimation(
				getApplicationContext(), R.drawable.clockwise);
		image.startAnimation(animation1);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				Intent i = new Intent(StartPage.this, MainActivity.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}