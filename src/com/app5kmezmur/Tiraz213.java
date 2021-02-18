package com.app5kmezmur;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import android.R.drawable;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import com.app5kmezmur.R;

public class Tiraz213 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("155.	የክርስቲያን ደሴት");
		ParentList.add("156.	ኢኮነ ነግደ");
		ParentList.add("157.	ሰላም ለኪ");
		ParentList.add("158.	ናሁ ሠናይ");
		ParentList.add("159.	ባርክ ለዝ ጉባዔ");

	}
	// Assign children list element using string array.

	String[] n155 = { "የክርስቲያን ደሴት የአበው ሃይማኖት \nሐዋርያዊት ሀገር ጥንታዊት እናት \nየቅዱሳን መንደር የጸሎት ቤታችን \nኢትዮጵያ አንቺ ነሽ ቅድስት ሀገራችን  /2/\n\nትነሻለሽ ለፍርድ ወንጌሉን ይዘሽ \nለሰሎሞን አምላክ ምስክር የሆንሽ \nሠልጥነሻልና በሃይማኖት ምሥጢር\nኢትዮጵያ መስክሪ የሥላሴን ከብር/2/\n\nከእስራኤል ቀጥለሽ አምልኮ ያለሽ \nየሃይማኖት ሀገር ኢትዮጵያ አንቺ ነሽ \nበወንጌሉ ብርሃን ዳግም የተወለድሽ  \nበሥጋ በደሙ ሕይወት የገበየሽ      /2/\n\nጥበብን ለማየት እሥራኤል የሄድሽ \nበወንጌል ተጽፏል ቀናው እምነትሽ \nአይዞሽ ኢትዮጵያ ዘርጊ እጆችሽን \nጌታ ይቀበለዋል ንጹሕ አምልኮሽን /2/\n\nሳታይ ያመንሽ ቅድስት ኢትዮጵያ \nመስቀል ተሸክመሽ አብሪ በዓለም ዙርያ \nየተዋሕዶን ነገር መስክሪ ለዓለም\nጉልበትሽ እኮ ነው ቸሩ መድኃኔዓለም  /2/ " },
			n156 = { "ኢኮነ ነግደ ወፈላሴ ሀገሪቶሙ /2/\nሀገሪቶሙ ለቅዱሳን ኢትዮጵያ/4/\n\nትርጉም፦ ስደተኛ እና መጻተኞች አይደለንም። ኢትዮጵያ የቅዱሳን ሀገራቸው ናት። " },
			n157 = { "ሰላም ለኪ ኦ ሀገረ ኣባይ ሀገር ቅድስት  ኢትዮጵያ ሀገረ እግዚአብሔር /2/\nለምድርኪ ምድረ ገነት እምአርባዕቱ አፍላጋት ግዮን አስተይኪ/2/ \nግዮን ፈለገ ሕይወት ውሉድኪ ፈረዩ ፍሬ ሃይማኖት /2/\n\nሰላም ላንቺ ታላቅ ሀገር ልዩም ሀገር  ኢትዮጵያ የእግዚአብሔር ሀገር /2/\nምድርሽ የገነት ምድርን ከአራቱ ወንዞች ዓባይ አጠጣሽ _/2/የዓባይ የሕይወት ምንጭ ልጆችሽ አፈሩ የሃይማኖት ፍሬ ....... /2/\n\nዘፍ 2 ' 13" },
			n158 = { "ናሁ ሠናይ ወናሁ አዳም /2/\nሶበ ይሄልዉ /2/ አኃው  ህቡረ  /2/ ኧኸ\n\nትርጉም፦እነሆ መልካም ነው እነሆ ያማረ ነው ወንድሞች በህብረት (በአንድነት ) ቢኖሩ (ቢቀመጡ)" },
			n159 = { "ባርክ ለዝ ጉባዔ /2/\nንጉሠ ስብሐት/2/  ባርክ ለዝ ጉባዔ\n\nትርጉም፦የምስጋና ንጉሥ ሆይ ይህንን ጉባዔ  ባርክ " };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("155.	የክርስቲያን ደሴት")) {
				loadChild(n155);
			} else if (HoldItem.equals("156.	ኢኮነ ነግደ")) {
				loadChild(n156);
			} else if (HoldItem.equals("157.	ሰላም ለኪ")) {
				loadChild(n157);
			} else if (HoldItem.equals("158.	ናሁ ሠናይ")) {
				loadChild(n158);
			} else if (HoldItem.equals("159.	ባርክ ለዝ ጉባዔ")) {
				loadChild(n159);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T213(this, ParentList,
				ParentListItems);
		expandablelistView.setAdapter(expListAdapter);
		expandablelistView.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				return true;
			}
		});
		TextView text = new TextView(this);
		text.setText("በእንተ ሀገሪትነ ኢትዮጵያ| በእንተ ጉባኤ");
		text.setTextSize(14);
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf"));
		text.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text);
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		expandablelistView
				.setOnGroupExpandListener(new OnGroupExpandListener() {

					@Override
					public void onGroupExpand(int groupPosition) {
						// TODO Auto-generated method stub
						for (int i = 0; i < expListAdapter.getGroupCount(); i++) {

							if (i != groupPosition) {
								expandablelistView.collapseGroup(i);

							}
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

	private void loadChild(String[] ParentElementsName) {
		ChildList = new ArrayList<String>();
		for (String model : ParentElementsName)
			ChildList.add(model);
	}

	public class T213 extends BaseExpandableListAdapter {

		TextView duratio;
		private Activity context;
		Button play, playpause;
		SeekBar seekBar;
		Handler mHandler = new Handler();
		TextView currentduration, totalduration;
		private MediaPlayer mp = new MediaPlayer();
		SeekBar seekbarProgress;
		private int duration;
		private final Handler handler = new Handler();
		private double timeElapsed = 0, finalTime = 0;
		public int oneTimeOnly = 0;
		private Map<String, List<String>> ParentListItems;
		private List<String> Items;

		public T213(Activity context, List<String> Items,
				Map<String, List<String>> ParentListItems) {
			this.context = context;
			this.ParentListItems = ParentListItems;
			this.Items = Items;
		}

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			return ParentListItems.get(Items.get(groupPosition)).get(
					childPosition);
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		@Override
		public View getChildView(final int groupPosition,
				final int childPosition, boolean isLastChild, View ListView,
				ViewGroup parent) {
			final String child = (String) getChild(groupPosition, childPosition);
			LayoutInflater inflater = context.getLayoutInflater();
			if (ListView == null) {
				ListView = inflater.inflate(R.layout.child_list_item2, null);
			}
			TextView item = (TextView) ListView.findViewById(R.id.textView2);
			item.setText(child);
			Typeface face1 = Typeface.createFromAsset(context.getAssets(),
					"fonts/gfzemenu.ttf");
			item.setTypeface(face1);
			mp = new MediaPlayer();
			play = (Button) ListView.findViewById(R.id.play);
			play.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {

					final Dialog dialog = new Dialog(context);
					dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
					dialog.setContentView(R.layout.popup_player);
					dialog.getWindow().setGravity(Gravity.BOTTOM);
					dialog.getWindow().setBackgroundDrawable(
							new ColorDrawable(Color.TRANSPARENT));

					playpause = (Button) dialog.findViewById(R.id.playpause);
					seekbarProgress = (SeekBar) dialog
							.findViewById(R.id.seekBar);
					duratio = (TextView) dialog.findViewById(R.id.songDuration);
					seekbarProgress.setVisibility(View.GONE);
					duratio.setVisibility(View.GONE);
					seekbarProgress.setProgress(0);
					seekbarProgress.setMax(100);
					dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {

						@Override
						public void onDismiss(DialogInterface arg0) {
							// TODO Auto-generated method stub
							mp.pause();
							mp.release();
							mp = new MediaPlayer();
							playpause
									.setBackgroundResource(drawable.ic_media_play);

							play.setBackgroundResource(drawable.ic_media_play);
						}
					});
					playpause.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							try {
								data(childPosition, groupPosition);

							} catch (Exception e) {
								e.printStackTrace();
							}

						}

						private void data(int childPosition, int groupPosition) {
							// TODO Auto-generated method stub
							if (childPosition == 0 && groupPosition == 0) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 1) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 2) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 3) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 4) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							}
						}
					});
					seekbarProgress
							.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

								@Override
								public void onStopTrackingTouch(SeekBar seek) {
									if (mp != null && mp.isPlaying()) {
										mp.seekTo(seek.getProgress());
									}
								}

								@Override
								public void onStartTrackingTouch(SeekBar arg0) {
									// TODO Auto-generated method stub

								}

								@Override
								public void onProgressChanged(SeekBar seekBar,
										int progress, boolean fromTouch) {

								}
							});

					dialog.show();
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
				ListView = infalInflater.inflate(R.layout.parent_list_item2,
						null);
			}
			TextView item = (TextView) ListView.findViewById(R.id.textView2);
			item.setText(CoursesFull);
			Typeface face = Typeface.createFromAsset(context.getAssets(),
					"fonts/gfzemenu.ttf");
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
								- TimeUnit.MINUTES
										.toSeconds(TimeUnit.MILLISECONDS
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

		private Runnable UpdateSongTime = new Runnable() {
			public void run() {
				timeElapsed = mp.getCurrentPosition();
				duratio.setText(String.format(
						"%d min, %d sec",
						TimeUnit.MILLISECONDS.toMinutes((long) timeElapsed),
						TimeUnit.MILLISECONDS.toSeconds((long) timeElapsed)
								- TimeUnit.MINUTES
										.toSeconds(TimeUnit.MILLISECONDS
												.toMinutes((long) timeElapsed))));
				seekbarProgress.setProgress((int) timeElapsed);
				handler.postDelayed(this, 100);
			}
		};

	}
}