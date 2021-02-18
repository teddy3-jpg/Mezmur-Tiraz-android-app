package com.app5kmezmur;

import java.io.File;
import java.util.concurrent.TimeUnit;

import android.R.drawable;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MezmurPlayer {
	Activity context;
	TextView duratio;
	Button play, playpause;
	SeekBar seekBar;
	Handler mHandler = new Handler();
	TextView currentduration, totalduration;
	public MediaPlayer mp = new MediaPlayer();
	SeekBar seekbarProgress;
	public int duration;
	public final Handler handler = new Handler();
	public double timeElapsed = 0, finalTime = 0;
	public int oneTimeOnly = 0;

	public MezmurPlayer() {
		String path = "";
		mezmurPlay(path);
	}

	public void playerDialog(Context mContext) {
		final Dialog dialog = new Dialog(mContext);
		// Set Dialog No Title
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(
				new ColorDrawable(Color.TRANSPARENT));
		dialog.getWindow().setGravity(Gravity.BOTTOM);

		// create linear layouts
		LinearLayout ll = new LinearLayout(mContext);
		LinearLayout l2 = new LinearLayout(mContext);
		LinearLayout l3 = new LinearLayout(mContext);
		// set their orientations
		ll.setOrientation(LinearLayout.VERTICAL);
		l2.setOrientation(LinearLayout.HORIZONTAL);
		l3.setOrientation(LinearLayout.HORIZONTAL);

		l2.setGravity(Gravity.CENTER_HORIZONTAL);
		ll.setBackgroundResource(R.drawable.border4);
		Typeface face = Typeface.createFromAsset(mContext.getAssets(),
				"fonts/gfzemenu.ttf");
		// create and add linear 2 components

		SeekBar seekbar = new SeekBar(mContext); // to show the seekbar progress
		TextView currentDuration = new TextView(mContext);// shows the current
															// time value of
															// mezmur

		seekbar.setProgress(0);
		seekbar.setMax(100);

		l2.addView(seekbar);
		l2.addView(currentDuration);

		// create linear 3 components and add them to linear3
		final Button b1 = new Button(mContext);
		b1.setBackgroundResource(drawable.ic_media_pause);
		b1.setTypeface(face);
		b1.setGravity(Gravity.CENTER);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try {
					// data(childPosition, groupPosition);

				} catch (Exception e) {
					e.printStackTrace();
				}
				duration = mp.getDuration();

			}
		});

		l3.addView(b1);
		TextView tv2 = new TextView(mContext);
		tv2.setText("       ");
		tv2.setGravity(Gravity.CENTER);
		l3.addView(tv2);
		// Second Button
		Button b2 = new Button(mContext);
		b2.setBackgroundResource(drawable.ic_media_play);
		b2.setTypeface(face);
		b2.setGravity(Gravity.CENTER);
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

			}
		});

		l3.addView(b2);

		// add linear two and three to linear one
		ll.addView(l2);
		ll.addView(l3);

		dialog.setContentView(ll);
		dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {

			@Override
			public void onDismiss(DialogInterface arg0) {
				// TODO Auto-generated method stub
				mp.pause();
				b1.setBackgroundResource(drawable.ic_media_play);

			}
		});
		// Show Dialog
		dialog.show();
	}

	public void mezmurPlay(String path) {
		File file = new File(path);
		if (!file.exists()) {
			Toast.makeText(context,
					"መዝሙሩ ስልክዎ ውስጥ የለም! እባክዎ 'እርዳታ' ወደ ሚለው ገጽ ይሒዱ!",
					Toast.LENGTH_SHORT).show();
		}
		try {
			mp.reset();
			mp.setDataSource(path);
			mp.prepare();
			mp.setVolume(1f, 1f);
			mp.start();
			finalTime = mp.getDuration();
			timeElapsed = mp.getCurrentPosition();

			if (oneTimeOnly == 0) {
				seekbarProgress.setMax((int) finalTime);
				oneTimeOnly = 0;
			}

			duratio.setText(String.format(
					"%d min, %d sec",
					TimeUnit.MILLISECONDS.toMinutes((long) timeElapsed),
					TimeUnit.MILLISECONDS.toSeconds((long) timeElapsed)
							- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
									.toMinutes((long) timeElapsed))));

			seekbarProgress.setProgress((int) timeElapsed);
			handler.postDelayed(UpdateSongTime, 100);
			seekbarProgress.setVisibility(View.VISIBLE);
			duratio.setVisibility(View.VISIBLE);
			playpause.setBackgroundResource(drawable.ic_media_pause);
			play.setBackgroundResource(drawable.ic_media_pause);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Runnable UpdateSongTime = new Runnable() {
		public void run() {
			timeElapsed = mp.getCurrentPosition();
			duratio.setText(String.format(
					"%d min, %d sec",
					TimeUnit.MILLISECONDS.toMinutes((long) timeElapsed),
					TimeUnit.MILLISECONDS.toSeconds((long) timeElapsed)
							- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
									.toMinutes((long) timeElapsed))));
			seekbarProgress.setProgress((int) timeElapsed);
			handler.postDelayed(this, 100);
		}
	};
}
