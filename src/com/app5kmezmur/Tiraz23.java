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
import android.os.Environment;
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

public class Tiraz23 extends Activity {

	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("35. ወእንዘ ትፈትል ");
		ParentList.add("36. አመ ኀደረ");
		ParentList.add("37. አስተርአያ");
		ParentList.add("38. ገብርኤል አብሠራ");
		ParentList.add("39. ለድንግል ገብርኤል አብሠራ");
		ParentList.add("40. መልአክ በሰላም ");
		ParentList.add("41.	ዕርገታ ተሰምዓ ");
		ParentList.add("42.	ወላዲተ ቃል ");

	}
	// Assign children list element using string array.

	String[] n35 = { "ወእንዘ ትፈትል/2/ ወርቅ ወሜላት  /2/\nአስተርአያ ገብርኤል ግብተ \nወይቤላ/2/ እስመ ረከብኪ ሞገሰ   /2/\nበኀብ እግዚአብሔር  \n\nትርጉም፦ ሐርና ወርቅን አስማምታ ስትፈትል በድንገት መልአኩ ገብርኤል ታያት። በእግዚአብሔር ዘንድ ባለሟልነትን አግኝተሻል አላት። የሚዘመርበት ቀብ ታህሳስ 22 ፣ መጋቢት 29 " },
			n36 = { "አመ ኀደረ ላዕሌኪ ፀሐየ ቅዱሳን ዘራማ/2/\nበመንክር ግርማ /2/ጸለልኪ/4/ ኧኸ\n ሰማያዊው የቅዱሳን ፀሐይ ባደረ  ጊዜ በማኅፀንሽ /2/\nበሚያስደንቅ ግርማ /2/ከለለሽ/4/ ኧኸ\n\nየሚዘመርበት ወቅት ፡ታህሳስ 22 	" },
			n37 = { "አስተርአያ  ገብርኤል ለማርያም/2/ \nወእንዘ ትፈትል/4/ ትፈትል ወርቀ ወሜላተ /2/	\n\nትርጉም፦ ወርቅና ሐርን ስትፈትል ገብርኤል ለማርያም ታያት።" },
			n38 = { "ገብርኤል አብሠራ/4/\nለማርያም ወይቤላ ትወልዲ ወልድ/4/ ኧኸ\n\nትርጉም፦ ድንግል ማርያምን ገብርኤል አበሰራት ወልድንም ትወልጃለሽ አላት። የሚዘመርበት ወቅት፦ ታህሳስ  22" },
			n39 = { "ለድንግል ገብርኤል አብሠራ /2/ \nሚካኤል /2/ በክነፍ ፆራ\nመንጦላዕተ ደምና ሠወራ/2/\n\nትርጉም፦ ድንግልን ገብርኤል አንበሠራት ሚካኤል በክንፉ ተሸከማት የደምና ምጋረጃ ሰውራት/ጋረዳት/\n	የሚዘመርበት ወቅት: ታኅሳስ 22" },
			n40 = { "መልአክ በሰላም ተናገራ መልአክ በሰላም /2/ \nቡርክት አንቲ እምአንስት  ቡርጅት አንቲ/2/\nመልአክ በሰላም ድንግልን መልአክ ተናገራት  /2/\nከሴቶች ሁሉ ተለይተሽ የተባረክሽ ነሽ አሏት/2/\n\n	የሚዘመርበት ወቅት: ታኅሳስ 22" },
			n41 = { "ዕርገታ ተሰምዓ ውስተ ሰማያት /2/\nወበዓታ/2/ውስተ ገነት/4/ ኧኸ\nገነዝዋ ሐዋርያት/2/ \nገነዝዋ /2/ በስብሀት/4/ ኧኸ\n\nትርጉም፦ ወደ ሰማይ ማረጓ ወደ ገነት መግባቷ ተሰማ። ሐዋርያት በክብር ገነዝዋት\n\n	የሚዘመርበት ወቅት ነሐሴ 16" },
			n42 = { "ድንግል/2/ ወላዲተ ቃል /2/\nአሟሟትሽ በጥር ነሐሴ መቃብር ድንግል \nያንችስ የብቻው ነው ትንሳኤሽ ሲነገር >> \nሥጋሽ በምድር ላይ የታለ እንደፍጡር >> \nአርጓል ወደ ሰማይ ከክርስቶስ መንበር  >>\nአዝ ...\nሥጋሽን ሊያሳርጉ መላእክተ ሰማይ ድንግል\nቶማስ በደመና ሲመጣ መንገድ ላይ  >>\nመግነዝ ተረከበ ለሐዋርያት ሊያሳይ  >>\nአዝ ...\nትንሳኤሽን ሽተው ግራ ሲገባቸው   >>\nሐዋርያት ጾመው ተገለጥሽላቸው   >>\nተቀብራ አልቀረችም ከምድር ከደጇ     >>\nወደ ላይ አረገች እሷም እንደ ልጇ     >>\nአዝ ...\nለማየት ሲጓጉ የድንግልን ትንሳኤ     >>\nዕርገቷን አወቁ በንጹሕ ሱባኤ        >>\nእኛም እንጸልይ ደጃችን እንዝጋ       >>\nከወላክዲት አምላክ እንድናገኝ ዋጋ      >>\nአዝ ...\n\n	የሚዘምርበት ወቅት  ነሐሴ 1-16" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("35. ወእንዘ ትፈትል ")) {
				loadChild(n35);
			} else if (HoldItem.equals("36. አመ ኀደረ")) {
				loadChild(n36);
			} else if (HoldItem.equals("37. አስተርአያ")) {
				loadChild(n37);
			} else if (HoldItem.equals("38. ገብርኤል አብሠራ")) {
				loadChild(n38);
			} else if (HoldItem.equals("39. ለድንግል ገብርኤል አብሠራ")) {
				loadChild(n39);
			} else if (HoldItem.equals("40. መልአክ በሰላም ")) {
				loadChild(n40);
			} else if (HoldItem.equals("41.	ዕርገታ ተሰምዓ ")) {
				loadChild(n41);
			} else if (HoldItem.equals("42.	ወላዲተ ቃል ")) {
				loadChild(n42);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T23(this, ParentList,
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
		text.setText("በእንተ ብስራት ወ ዕርገታ ለድንግል ማርያም ");
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

	public class T23 extends BaseExpandableListAdapter {

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

		public T23(Activity context, List<String> Items,
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
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/035-WeEnze Tifetil.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/036-Ame Hadere.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/037-Asteraya.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/038-Gebriel Absera.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/039-Ledingel Gebreil Absera.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/040-Melak Beselam.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/041-Ergeta Tesema.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/042-Weladite Kal.mp3");
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