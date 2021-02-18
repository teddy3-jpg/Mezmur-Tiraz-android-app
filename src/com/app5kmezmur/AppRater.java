package com.app5kmezmur;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AppRater {
	private final static String TITLE = "ያሬዳዊ መዝሙር";

	// Insert your Application Package Name
	private final static String PACKAGE_NAME = "com.app5kmezmur";

	// Day until the Rate Us Dialog Prompt(Default 2 Days)
	private final static int DAYS_UNTIL_PROMPT = 0;

	// App launches until Rate Us Dialog Prompt(Default 5 Launches)
	private final static int LAUNCHES_UNTIL_PROMPT = 2;

	public static void app_launched(Context mContext) {
		SharedPreferences prefs = mContext.getSharedPreferences("rateus", 0);
		if (prefs.getBoolean("dontshowagain", false)) {
			return;
		}

		SharedPreferences.Editor editor = prefs.edit();

		// Increment launch counter
		long launch_count = prefs.getLong("launch_count", 0) + 1;
		editor.putLong("launch_count", launch_count);

		// Get date of first launch
		Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
		if (date_firstLaunch == 0) {
			date_firstLaunch = System.currentTimeMillis();
			editor.putLong("date_firstlaunch", date_firstLaunch);
		}

		// Wait at least n days before opening
		if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
			if (System.currentTimeMillis() >= date_firstLaunch
					+ (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
				showRateDialog(mContext, editor);
			}
		}

		editor.commit();
	}

	public static void showRateDialog(final Context mContext,
			final SharedPreferences.Editor editor) {
		final Dialog dialog = new Dialog(mContext);
		// Set Dialog Title
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(
				new ColorDrawable(Color.TRANSPARENT));
		dialog.getWindow().setGravity(Gravity.CENTER);
		LinearLayout ll = new LinearLayout(mContext);
		LinearLayout l2 = new LinearLayout(mContext);

		ll.setOrientation(LinearLayout.VERTICAL);
		l2.setOrientation(LinearLayout.HORIZONTAL);
		l2.setGravity(Gravity.CENTER_HORIZONTAL);
		ll.setBackgroundResource(R.drawable.border4); 
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		Typeface face = Typeface.createFromAsset(mContext.getAssets(),
				"fonts/gfzemenu.ttf");

		TextView tv = new TextView(mContext);
		tv.setText(TITLE + " ነኝ ከወደዳችሁኝ ደረጃ ስጡኝ");

		tv.setPadding(4, 0, 4, 10);
		tv.setTypeface(face);
		ll.addView(tv);

		// First Button
		Button b1 = new Button(mContext);
		b1.setBackgroundResource(R.drawable.border4);
		b1.setText("ደረጃ ስጡኝ");
		b1.setTypeface(face);
		b1.setGravity(Gravity.CENTER);
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri
						.parse("market://details?id=" + PACKAGE_NAME)));
				dialog.dismiss();
			}
		});
		l2.addView(b1);
		TextView tv2 = new TextView(mContext);
		tv2.setText("       ");
		tv2.setGravity(Gravity.CENTER);
		l2.addView(tv2);
		// Second Button
		Button b2 = new Button(mContext);
		b2.setBackgroundResource(R.drawable.border4);
		b2.setText("አይ!ሌላ ጊዜ");
		b2.setTypeface(face);
		b2.setGravity(Gravity.CENTER);
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		l2.addView(b2);

		// Third Button
		/*
		 * Button b3 = new Button(mContext); b3.setText("Stop Bugging me");
		 * b3.setOnClickListener(new OnClickListener() { public void
		 * onClick(View v) { if (editor != null) {
		 * editor.putBoolean("dontshowagain", true); editor.commit(); }
		 * dialog.dismiss(); } }); ll.addView(b3);
		 */
		ll.addView(l2);

		dialog.setContentView(ll);

		// Show Dialog
		dialog.show();
	}

}