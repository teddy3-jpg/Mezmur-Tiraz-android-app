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

public class Tiraz48 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("112.	መፅናኛ መመኪያ ");
		ParentList.add("113.	ለዕፀ መስቀል");
		ParentList.add("114.	ርእዩ ዕበዮ");
		ParentList.add("115.	ዮም መስቀል");
		ParentList.add("116.	ወበእንተዝ");
		ParentList.add("117.	ትቤሎ እሌኒ");
		ParentList.add("118.	ሀብሩ ቃለ");
		ParentList.add("119.	መስቀል አብርሃ");
		ParentList.add("120.	ዝንቱ መስቀል ");
		ParentList.add("121.	ብከ ንወግዖሙ");

	}
	// Assign children list element using string array.

	String[] n112 = { "መፅናኛ መመኪያ ኃይል ነው መስቀሉ\nለሚያምኑበትና ለሚያከብሩት ሁሉ\n   አዝ...\nየማዳን ሥራውን አምላክ የፈጸመው\nበቀራንዮ ምድር በመስቀሉ ላይ ነው/፪/\n   አዝ...\nየመርገም ምልክት የነበረው መስቀል\nበክርስቶስ ከብሮ የድል ዐርማ ሆኗል/፪/\n   አዝ...\nለተዋረድን ሁሉ በአዳም በደል ምክንያት\nመክበሪያ ተስፋችን መስቀል ነው መድኃኒት/፪/\n   አዝ...\nበርኩስ መንፈስ ላይ በአጋንንት በሙሉ\nድልን የሚያቀዳጅ ኃይል አለው መስቀሉ /፪/\n   አዝ...\nለዘለዓለም ሕይወት ለድል የበቃበት\nመስቀል ነው የሰው ልጅ ከሞት የዳነበት/፪/ " },
			n113 = { "ርእዩ ዕበዮ ለዕፀ መስቀል /፪/\nዘመጠነዝ /፪/ ትርሢተ ክብር ትህትና ወፍቅር /፪/\n\nትርጉም፡-የዕፀ መስቀሉን ክብሩን ትህትናውን ፍቅሩን ሽልማቱን ምን ህል እንደሆነ እዩና አድንቁ ወይም ከፍ ከፍ አድርጉት፡፡" },
			n114 = { "ርእዩ ዕበዮ ለቅዱስ ዕፀ መስቀል /፪/\nዕውራን ይሬእዩ ወጽሙማን ይሰምዑ እለ ለምጽ  \nይነጽሑ እለ መጽኡ ኀቤሁ /፪/\nኑ እዩ የመስቀሉን ተአምራት /፪/\nእውሮች ያያሉ ደንቆሮዎች ይሰማሉ ለምጻሞችም \nይነጻሉ ወደ እርሱ የመጡ ሁሉ /፪/" },
			n115 = { "ዮም መስቀል አስተርአየ እለ ማሰነ ፍጥረተ አሠነየ /፪/\nዮም መስቀል ተኬነወ ወዘተጼወወ ሕዝበ በደሙ ቤዘወ /፪/\n\nትርጉም፡-ዛሬ መስቀል ተገለጠ የጠፉትን ሰዎች አዳነ ዛሬ መስቀልብልሃተኛ ሆነ ምርኮኞች ወገኖቹንም በክርስቶስ ደም አዳነ፡፡" },
			n116 = { "ወበእንተዝ አዘዙነ መምህራነ ቅዱስ ወንጌል /፪/\nንስግድ ለመስቀል ወለማርያም ድንግል /፬/\nትርጉም፡- ቅዱስ ወንጌልን የሚያስተምሩ መምህራን ለመስቀልና  ለድንግል ማርያም እንድንሰግድ ያዝዙናል፡፡" },
			n117 = { "ትቤሎ እሌኒ ለኪራኮስ ንግረኒ አፍጥን /፪/\nኀበ ሀሎ መስቀሉ ለኢየሱስ /፪/ ክርስቶስ /፬/\n\nትርጉም፡- ዕሌኒ ኪራኮስን የኢየሱስ ክርስቶስ መስቀል የት እንዳለ ፈጥነህ  ንገረኝ አለችው፡፡" },
			n118 = { "ሀብሩ ቃለ ነቢያተ /፪/\nወይቤሉ መስቀል ብርሃን /፪/ ለኵሉ ዓለም /፪/\n\nትርጉም፡-ነቢያት መስቀል ለዓለም ሁሉ ብርሃን ነው ብለው በአንድ ቃል  ሆነው  ተናገሩ፡፡" },
			n119 = { "መስቀል አብርሃ በከዋክብት አሰርገወ ኢትዮጵያ/፪/\nእምኩሉሰ ፀሐየ አርአየ ዕፀ መስቀል /፪/\n\n ትርጉም፡- መስቀል አበራ ኢትዮጵያንም  በከዋክብት ሸለመ ከሁሉ ይልቅ መስቀል እንደ ፀሐይ ደምቆ/በርቶ/ ታየ፡፡" },
			n120 = { "ዝንቱ መስቀል ረድኤት ወኃይል /፪/\nለእለ ነአምን/፪/ መራሔ ሕይወትነ /፪/\n\n ትርጉም፡- ይህ መስቀል ለምናምን ሕይወታችንን የሚመራ ረድኤትና ኃይላችን ነው፡፡" },
			n121 = { "ብከ ንወግዖሙ ለኵሎሙ ፀርነ /፪/ ይቤ ዳዊት በመንፈሰ ትንቢት /፪/\nበእንተ ዝንቱ ዕፀ መስቀል ዘተሰቅለ ዲቤሁ ቃለ አብ /፪/\n\nትርጉም፡- ቅዱስ ዳዊት በትንቢት መንፈስ እንዲህ አለ፣ በአንተ ጠላቶቻችንን እንወጋቸዋለን፤ በዚህ የእግዚአብሔር ቃል/ኢየሱስ ክርስቶስ/ በተሰቀለበት፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("112.	መፅናኛ መመኪያ ")) {
				loadChild(n112);
			} else if (HoldItem.equals("113.	ለዕፀ መስቀል")) {
				loadChild(n113);
			} else if (HoldItem.equals("114.	ርእዩ ዕበዮ")) {
				loadChild(n114);
			} else if (HoldItem.equals("115.	ዮም መስቀል")) {
				loadChild(n115);
			} else if (HoldItem.equals("116.	ወበእንተዝ")) {
				loadChild(n116);
			} else if (HoldItem.equals("117.	ትቤሎ እሌኒ")) {
				loadChild(n117);
			} else if (HoldItem.equals("118.	ሀብሩ ቃለ")) {
				loadChild(n118);
			} else if (HoldItem.equals("119.	መስቀል አብርሃ")) {
				loadChild(n119);
			} else if (HoldItem.equals("120.	ዝንቱ መስቀል ")) {
				loadChild(n120);
			} else if (HoldItem.equals("121.	ብከ ንወግዖሙ")) {
				loadChild(n121);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T48(this, ParentList,
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
		text.setText("መዝሙረ ንስሐ");
		text.setTextSize(14);
		
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),"fonts/gfzemenu.ttf"));
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

	public class T48 extends BaseExpandableListAdapter {

		TextView duratio;
		private Activity context;
		Button play, playpause;
		SeekBar seekBar;
		Handler mHandler = new Handler();
		TextView currentduration, totalduration;
		private MediaPlayer mp = new MediaPlayer();
		SeekBar seekbarProgress;
		public int oneTimeOnly = 0;
		private final Handler handler = new Handler();
		private double timeElapsed = 0, finalTime = 0;

		private Map<String, List<String>> ParentListItems;
		private List<String> Items;

		public T48(Activity context, List<String> Items,
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
		public void onGroupCollapsed(int groupPosition) {
			super.onGroupCollapsed(groupPosition);
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

		public void data(int childPosition, int groupPosition) {
			if (childPosition == 0 && groupPosition == 0) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/112.Metsinagna Memekiya.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/113.Letse Meskel.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/114.Rieyu Ebeeyo.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/115.Yome Meskel.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/116.Webe Entezi Azezune.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/117.Tibelo Eleni.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/118.Haberu Kale.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/119.Meskel Abriha.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/120.Zintu Meskel.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/121.Bike Niwegiomu.mp3");
			}
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