package com.app5kmezmur;

import java.util.List;
import java.util.Map;

import android.R.drawable;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class ListAdapter2 extends BaseExpandableListAdapter {

	private Activity context;
	Button play;
	SeekBar seekBar;
	Handler mHandler = new Handler();
	TextView currentduration, totalduration;
	MediaPlayer mp;

	private Map<String, List<String>> ParentListItems;
	private List<String> Items;

	public ListAdapter2(Activity context, List<String> Items,
			Map<String, List<String>> ParentListItems) {
		this.context = context;
		this.ParentListItems = ParentListItems;
		this.Items = Items;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return ParentListItems.get(Items.get(groupPosition)).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(final int groupPosition, final int childPosition,
			boolean isLastChild, View ListView, ViewGroup parent) {
		final String child = (String) getChild(groupPosition, childPosition);
		LayoutInflater inflater = context.getLayoutInflater();
		if (ListView == null) {
			ListView = inflater.inflate(R.layout.child_list_item2, null);
		}
		TextView item = (TextView) ListView.findViewById(R.id.textView2);
		item.setText(child);
		Typeface face1 = Typeface.createFromAsset(context.getAssets(),
				"fonts/VG2_Main.ttf");
		item.setTypeface(face1);
		

		mp = new MediaPlayer();

		play = (Button) ListView.findViewById(R.id.play);
		play.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (childPosition == 0 && groupPosition == 0) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 1) {

					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 2) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 3) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 4) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 5) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 6) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 7) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 8) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 9) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 10) {
					mezmurPlay("");
				} else if (childPosition == 0 && groupPosition == 11) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 12) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 13) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 14) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 15) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 16) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 17) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 18) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 19) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 20) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 21) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 22) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 23) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 24) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 25) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 26) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 27) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 28) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 29) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 30) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 31) {
					Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT)
							.show();
				} else if (childPosition == 0 && groupPosition == 32) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 33) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 34) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 35) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 36) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 37) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 38) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 39) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 40) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 41) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				} else if (childPosition == 0 && groupPosition == 42) {
					mezmurPlay(Environment.getExternalStorageDirectory()
							.getPath() + "/mez/");
				}
				play.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						mp.stop();
						play.setBackgroundResource(drawable.ic_media_play);
					}
				});
				mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

					@Override
					public void onCompletion(MediaPlayer arg0) {
						// TODO Auto-generated method stub
						mp.release();
						play.setBackgroundResource(drawable.ic_media_play);
					}
				});
			}
		});

		return ListView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return ParentListItems.get(Items.get(groupPosition)).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return Items.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return Items.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View ListView, ViewGroup parent) {
		String CoursesFull = (String) getGroup(groupPosition);
		if (ListView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			ListView = infalInflater.inflate(R.layout.parent_list_item2, null);
		}
		TextView item = (TextView) ListView.findViewById(R.id.textView2);
		item.setText(CoursesFull);
		Typeface face = Typeface.createFromAsset(context.getAssets(),
				"fonts/VG2_Main.ttf");
		item.setTypeface(face);
		return ListView;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	private void mezmurPlay(String path) {
		try {
			mp.reset();
			mp.setDataSource(path);
			mp.prepare();
			if (mp.isPlaying() && mp != null) {

				mp.pause();
				play.setBackgroundResource(drawable.ic_media_play);

			} else {
				if (mp != null) {
					mp.start();
					play.setBackgroundResource(drawable.ic_media_pause);
					currentduration.setVisibility(View.VISIBLE);
					totalduration.setVisibility(View.VISIBLE);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String miliSecondsToTimer(long milisec) {
		String finalTimer = "";
		String seconds = "";
		int hours = (int) (milisec / (1000 * 60 * 60));
		int minutes = (int) (milisec % (1000 * 60 * 60)) / (1000 * 60);
		int second = (int) ((milisec % (1000 * 60 * 60)) % (1000 * 60) / 1000);
		if (hours > 0) {
			finalTimer = hours + ":";
		}
		if (second < 10) {
			seconds = "0" + second;
		} else {
			seconds = "" + second;
		}
		finalTimer = finalTimer + minutes + ":" + seconds;

		return finalTimer;
	}

	public int progressToTimer(int progress, int totalduration) {
		int currentDuration = 0;
		totalduration = (int) (totalduration / 1000);
		currentDuration = (int) ((((double) progress) / 100) * totalduration);
		return currentDuration;
	}

	public int getPercentage(long currentduration, long totalduration) {
		Double percentage = (double) 0;
		long currentseconds = (int) (currentduration / 1000);
		long totalseconds = (int) (totalduration / 1000);
		percentage = (((double) currentseconds) / totalseconds) * 100;
		return percentage.intValue();

	}

	private Runnable mUpdateTimeTask = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			long totalDuration = mp.getDuration();
			long currentDuration = mp.getCurrentPosition();
			totalduration.setText("" + miliSecondsToTimer(totalDuration));
			currentduration.setText("" + miliSecondsToTimer(currentDuration));
			int progress = (int) (getPercentage(currentDuration, totalDuration));
			seekBar.setProgress(progress);
			mHandler.postDelayed(this, 100);
		}
	};

}