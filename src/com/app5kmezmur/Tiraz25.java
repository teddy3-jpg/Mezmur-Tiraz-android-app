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

public class Tiraz25 extends Activity {

	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("74.	ሰማይና መሬት");
		ParentList.add("75.	አምላክ ሰው ለመሆን");
		ParentList.add("76.	ገብርኤል አወፈየኒ");
		ParentList.add("77.	አንፈርዓፁ ሰብአ ሰገል");
		ParentList.add("78.	ዘነቢያት ሰበከ");
		ParentList.add("79.	አንፈርዓፁ");
		ParentList.add("80.	በኮከብ መጽኡ");
		ParentList.add("81.	መጽአ ከመ ይቤዙ ዓለመ");
		ParentList.add("82.	የጥበብ ሀገሯ ወዴት ነው");
		ParentList.add("83.	መጽአ ወልድ");
		ParentList.add("84.	ዘድንግል መናሥግተ}");

	}
	// Assign children list element using string array.

	String[] n74 = { "ሰማይና መሬት የማይወስኑት /2/\nሥጋን ተዋህዶ ታየ በልደት  /2/\nመለኮት ከትስብዕት ይለያል ለሚሉ/2/\nቃል ሥጋ ሆነ ሲል ያስረዳል ወንጌሉ/2/\nቀድሞ በነቢያት ሁሉን ያናገረ/2/\nከሰማያት ወርዶ በድንግል አደረ/2/\nሰማይና ምድር የማይወስንኑት\nሥጋን ተዋህዶ ታየ በልደት/2/\nበጌታችን ልደት ሞት ከጠፋልን /2/\nበእልልታ እንግለጸው መደሰታችንን/2/\nጌታችን ሲወለድ ለዓለሙ ሁሉ/2/\nእንኳን የሰው ልጆች እንስሳት ዘለሉ/2/\nበኮከብ ተመርተው  ሰብአ ሰገል ሄዱ/2/\nእጣንና ከርቤ ወርቅ ይዘው ሰገዱ/2/\nሰማይና መሬት የማይወስኑት/2/\nሥጋን ተዋሕዶ ታየ በልደት/2/ " },
			n75 = { "አምላክ ሰው ለመሆን ስለአፈቀረ /2/\nበነቢያት አድሮ /2/ ትንቢት አናገረ\nበአዋጅ ተነግሮ ትንቢቱ ሲፈጸም /2/ \nአምላክ ተወለደ/2/ ከድንግል ማርያም\nከድንግል  ማርያም በለበሰው /2/\nእኛን ወገኖቹን አለበሰን ጸጋ/2/\nነቢያት በትንቢት ጻድቃን በውዳሴ/2/\nይነጋገራሉ ከድንግለ ሙሴ/2/ \nንጽህናዋን አይቶ ነውር እንደሌለባት/2/\nመልአኩ ገብርኤል /2/ ትፀንሻለሽ አላት\n\nድንግለ ሙሴ (የሙሴ ድንግል ) እመቤታችን ናት።" },
			n76 = { "ገብርኤል አወፈየኒ ህፃነ ማርያም ድንግል /2/ \nወበቤተልሔም/2/ተወልደ አማኑኤል/2/" },
			n77 = { "አንፈርዓፁ ሰብአ ሰገል  /2/\nረኪቦሙ ህፃነ ዘተወልደ ለነ/2/		\n\nትርጉም፦ የተወለደልንን ሕፃን ክርስቶስን አግኝተው ሰብአ ሰገል  ዘለሉ /ሰገዱ/" },
			n78 = { "ዘነቢያት ሰበከ/2/ \nወአስተርአየ ገሀደ/2/		\n\nትርጉም፦ ነቢያት የሰበኩት በገሀድ(በግልጽ)  ታየ።" },
			n79 = { "አንፈርዓፁ ሰብአ ሰገል  /2/\nአምኃሆሙ አምጽኡ መድምመ\nትርጉም፦ ሰብአ ሰገል ዘለሉ ሰገዱ የሚአይስደንቅ እጅ መንሻንም አመጡ።" },
			n80 = { "በኮከድ መጽኡ ሰብአ ሰገል /2/\nኧኸ ይስግዱ ለአማኑኤል /2/\n\nትርጉም፦ ሰብአ ሰገል ኮከብ አየመራቸው ለአማኑኤል ሊሰግዱ መጡ::" },
			n81 = { "መጽአ ከመ ይቤዙ ዓለመ /2/\nየሀበነ ሰላመ ጋዳ ያበውኡ ቁርባነ/2/\n\nትርጉም፦ ዓለምን ያድን ዘንድ መጣ። ሰላምንም ይሰጠን ዘንድ። እጅ መንሻን እንደ ቁርባን ያስገባሉ። " },
			n82 = { "የጥበብ ሀገሯ ወዴት /2/\nማደሪያዋስ ወዴት ነው	\n	ቦታ ጐዳናዋ ከወዴት ተቃኘ\n	ዝናና ወሬዋ ከወዴት ተገኘ\n	ፈልጎ የገዛት ማነው በቀይ ወርቅ \n	ባሕሩን ተሻግሮ ስሟን በማወቅ\nማነው ያወረዳት ከደመና በላይ \nድምጿንስ የሰማ ከላይ ከሰማይ\nእርሷን የሚጠሉ ናቸውና ከንቱ\nአይቀርላቸውም ኋላ የሞት ሞቱ\n	ሁሉን የሚያውቅ እርሱ እርሱ ያውቅላታል \n	ቦታ ጐዳናዋን ያሳምርላታል\n	በክርስቶስ ፈቅድ በምድር ላይ ታየች\n	እነሆ ቤት ሠራች ሰባት ዓምድ አቆመች\nጥበብ ኝ እርሱ ነው መድኃኒታችን\nበሥጋ ተገልጦ እኛን አዳነን \nበደሙ ፈውሶ የትወዳጀን\nለእርሱ የመረጠን ይክበር ይመስገን/2/" },
			n83 = { "ሃሌ ሉያ መጽአ ወልድ ወስተ ዓለም ሃሌ ሉያ ውስተ/2/\nወለብሰ ሥጋነ ሰብአ ኮነ በአርአያ ዚአነ\n\nትርጉም፦ ከዓለም አስቀድሞ የነበረ ዛሬም ያለ ዓለምንም አሳልፎ የሚኖር ወልድ ወደ ዓለም መጣ። ሥጋችንን ለበሰ። በእኛ አርአያ ሰው ኾነ። " },
			n84 = { "ዘድንግል መናሥግተ ኢያርኅዎ /2/\nኢያርኅዎ ዘኪሩቤል ኢርዕዮኧኸ /4/ \n\nትርጉም፦ የእመቤታችንን የድንግልናዋን ማኅተም አልለወጠም(አልፈታም) ኪሩቤልም አላየውም አልመረመረውም።" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("74.	ሰማይና መሬት")) {
				loadChild(n74);
			} else if (HoldItem.equals("75.	አምላክ ሰው ለመሆን")) {
				loadChild(n75);
			} else if (HoldItem.equals("76.	ገብርኤል አወፈየኒ")) {
				loadChild(n76);
			} else if (HoldItem.equals("77.	አንፈርዓፁ ሰብአ ሰገል")) {
				loadChild(n77);
			} else if (HoldItem.equals("78.	ዘነቢያት ሰበከ")) {
				loadChild(n78);
			} else if (HoldItem.equals("79.	አንፈርዓፁ")) {
				loadChild(n79);
			} else if (HoldItem.equals("80.	በኮከብ መጽኡ")) {
				loadChild(n80);
			} else if (HoldItem.equals("81.	መጽአ ከመ ይቤዙ ዓለመ")) {
				loadChild(n81);
			} else if (HoldItem.equals("82.	የጥበብ ሀገሯ ወዴት ነው")) {
				loadChild(n82);
			} else if (HoldItem.equals("83.	መጽአ ወልድ")) {
				loadChild(n83);
			} else if (HoldItem.equals("84.	ዘድንግል መናሥግተ}")) {
				loadChild(n84);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T42(this, ParentList,
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
		text.setText("በእንተ ጥምቀቱ ለእግዚእነ");
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

	public class T42 extends BaseExpandableListAdapter {

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

		public T42(Activity context, List<String> Items,
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
						+ "/mez/Tiraz2/074-Semayina Meret.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/075-Amlak Sew Lemehon.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/076-Gebriel Awefeyeni.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/077-Amferatsu Seba Segel.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/078-Zenebiyat Sebekewo.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/079-Anferatsu.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/080-Bekokeb Metsu.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/081-Metsa Keme Yibezu Alem.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/082-Yetibeb Hagerua Wedet New.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/083-Metsa Weld.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz2/084-Zedingel Menasgete.mp3");
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