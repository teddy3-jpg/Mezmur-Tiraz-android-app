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

public class Tiraz27 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("92.	የማይሞተው ሞተ ");
		ParentList.add("93.	ወጸሐፈ ጲላጦስ");
		ParentList.add("94.	ምድረ ቀራንዮ");
		ParentList.add("95.	ዘጠኝ ሰዓት ሲሆን");
		ParentList.add("96.	ምድር ፀዳች");
		ParentList.add("97.	ክርስቶስ ተንስአ");
		ParentList.add("98.	እንዘምር ሁላችን");
		ParentList.add("99.	በትንሳኤከ");
		ParentList.add("100.	ሰላም ሰላም");
		ParentList.add("101.	የትንሳኤው ብርሃን ");

	}
	// Assign children list element using string array.

	String[] n92 = { "ኦ የማይሞተው ሞተ/2/\nሄደ ቀራንዮ  እየተጎተተ\nወድቆ እየተነሳ እንዲያ  እየቃተተ\nሞትን ይሽረው ዘንድ የማይሞተው ሞተ/2/\n	 እጅና እግሩን ታስሮ ሄደ አደባባይ  \n	እየተገረፈ ታግሶ ስቃይ\n	 አለቀሰች ቆማ ድንግል ማርያም\n	\nአዝ ....\n	በአይሁድ አደባባይ ፍርድ ተንጋደደ\n	ወንበዴ ተለቆ ንፁህ በግ ታረደ\n	የማይሞተው ሞተ  ለሰው ፍቅር ብሎ  \n	ዋለ ቀራንዮ በእንጨት ላይ ተሰቅሎ\nአዝ ....\n	ዮሴፍ ኒቆዲሞስ ሥጋውን ለመኑ \n	እንዲፈቅድላቸው ሄደው ከመስፍኑ \n	ገንዘው ቀበሩት በአዲስ መቃብር\n	ቅዱስ ቅዱስ ኃያል እያሉ በክብር       /2/\nአዝ .... " },
			n93 = { "ወጸሐፈ ጲላጦስ መጽሐፈ ዘይብል /2/ \nወይብል መጽሐፉ ኢየሱስ ናዝራዊ ንጉሠ አይሁድ/2/ 	\n\nትርጉም፦  ጲላጦስ ኢየሱስ ያይሁድ ንጉሥ የሚል ጽሁፍ ጻፈ::" },
			n94 = { "ምድረ ቀራንዮ  ምድረ ጎልጎታ /2/ \nመድኃኒት ክርስቶስ በአንቺ ተንገላታ\nየዓለም መድኃኒት በአንቺ ተንገላታ  \n	መስክሪ አንቺ ምድር ግዑዚቷ ስፍራ	/2/\n	መድኃኒት ክርስቶስ ያየብሽ መከራ /2/ \n	ደሙ እንደውሃ ሲወርድ በመስቀሉ ላይ /2/\n መከራን ሲቀበል በዚያች በምድር ላይ /2/ \nአዝ..... \n	ፀሐይ ከለከለች ከመስጠት ብርሃን ለመሸፈን ብላ የአምላክን እርቃን 	/2/ \n	ሁሉን ማድረግ ሲችል ስልጣን ሲኖረው /2/ \n	በቀራንዮ መስቀል ፍቅሩ አዋለው /2/ \nአዝ . . . \n	በመስቀል ላይ ሆኖ ተጠማሁ እያለ /2/\n	ተገርፎ ተሰቅሎ ቀራንዮ ዋለ 	/2/\n	እጆቹና እግሮቹ በችንካር ተመተው/2/\n	ይቅርታን አድርጎ ለዚያ ኃጢአታቸው/2/\nአዝ . . . \n	 ቸሩ መድኃኔ ዓለም እባክህ ማረን  /2/\n	ደካሞች ነንና እንዳንቀር ወድቀን  /2/\n	በቆረስከው ሥጋ ባፈሰስከው ደም /2/ \n	አቤቱ ተራዳን እስከ ዘለዓለም   /2/\nአዝ . . . " },
			n95 = { "ዘጠኝ ሰዓት ሲሆን አባት ሆይ\nበመስቀል ሆነህ  >>\nድምጽህን በመስማት 	>>	\nነፍስህን ሰጠህ 	>>	\n	ከዋክብተ ሰማይ በሙሉ ረገፉ \n	ጨርቃና ፀሐይ ደምን አጎረፉ \n	ብርሃናት ጨውለሙ ጠፍተው ተለያዩ \n	ሥጋህን በመስቀል ተጋልጦ ስላዩ\nአዝ ....\n	ጌታችን ክርስቶስ በመስቀል ላይ ሳለ  \n	አሰምቶ ጮኸ ተጠማሁ እያለ\n	ማርና ወተትን ለሚመግበው\n	ሐሞት አመጡለት ይቅመሰው ብለው\nአዝ ....\n	አካሉ ሲወጋ ውኃ ደም ፈሰሰ \n	በምድር ተረጭቶ ዓለምን ቀደሰ \n	የእሥራኤል ሴቶች ዋይ ዋይ ሲሉልህ \n	ለእነርሱ አሰብክ እንጂ ለአንተስ አላሰብህ \nአዝ ....\n	እናትህ ስታለቅስ ከመስቀል ሥር ሆና \n	ዮሐንስን ሰጠህ ጠብቆ እንዲያፅናና \n	መላእክትም ታዩ አጋንንትም ሸሹ \n	የአይሁድ ሠራዊት  ፈርተው ተረበሹ\nአዝ ...." },
			n96 = { "ምድር ፀዳች ሐሴት አረገች \nምድር ፀዳች ከእድፍ ነፃች \nበክርስቶስ ደም በውነት ታጠበች/2/\n	ሴቶች ትንሳኤውን ሲያወሩ በደስታ /2/ \n	ጮኻ ስትመሰክር ምድር አፏን ከፍታ/2/\n	የተዘጋው አለት ሲገለባበጥ/2/\n	ምን ተናገሩ አይሁድ ከፍርድ ለማምለጥ\n	አያልቅባቸውም የእነርሱ ፈሊጥ /2/\nአዝ ....\n	መግነዙ ተገኘ ከመቃብር ወድቆ /2/\n	ምልክት እንዲሆን ተወላቸው አውቆ/2/\n	እሑድ በማለዳ መቃብሩ መከነ /2/\n	ሁሉም ተለውጦ ለቅሶው ደስታ ሆነ/2/\nአዝ ....\n	ሁለቱ መላእክት ብርሃን የለበሱ/2/\n	ተነስቷል አላቸው ሴቶች ሲደርሱ /2/\n	ሐዋርያት ሰምተው ዜና ትንሳኤውን /2/\n	አላቸው በድንገት ሰላም ለእናንተ ይሁን  /2/\nአዝ ....\n\nመቃብሩ መከነ፦ መቃብሩ ባዶ ሆነ ማለት ነው።" },
			n97 = { "ክርስቶስ ተንሥአ እሙታን በአቢይ ኃይል ወስልጣን/2/\nአሠሮ ለሰይጣን አግዓዞ ለአዳም \nሰላም/3/ እምይእዜሰ  ይኩን ሰላም/2/\n\nክርቶስ ተነሣ ከሙታን በታላቅ ኃይልና ሥልጣን \nሰይጣንን አስሮ ነፃ አወጣው አድምን \nሰላም/3/ ከእንግዲህ ሰላም ይሁን /2/" },
			n98 = { "እንዘምር ሁላችን ለቸሩ ፈጣሪ /2/\nበትንሣኤው ኃይሉ ሞትን አሣፋሪ/2/ሞትን አሣፋሪ\nእሰይ አገኘውነው ሕይወታችንን /2/ ደስ ይበለን \nአዝ...\n	ትጉህ የማይተኛ ጊዜውን አክብሮ /2/\n	ነፍሳት አወጣ ከሲኦል በርብሮ/2/ \nአዝ ....\n	አረገ በስብሐት አረገ በዕልልታ/2/\n	ሞትን ድላ አድርጎ የሰራዊት ጌታ /2/የሠራዊት ጌታ\nአዝ ....\n	ሞት ሆይ ወዴት አለ ከቶ ማሸነፍህ /2/\n	ኃይልህ ተዋረደ አንተም ድል ተመታህ /2/ አንተም ድል ተመታህ\nአዝ ...." },
			n99 = { "በትንሳኤከ እግዚኦ ተዘከረነ \nአመ ትመጽእ በመንግስትከ/2/ \nምስለ ኩሎሙ ቅዱሳኒከ\nወምስለ አዕላፍ መላእክቲከ /2/\n\nትርጉም፦ ከቅዱሳንህ ሁሉ ጋር ከአዕላፍ መላእክትህም ጋር በመንግስትህ በመጣህ ጊዜ አቤቱ በትንሳኤህ አስበን።  " },
			n100 = { "ሰላም ሰላም/2/\nኧኸ እምይእዜሰ ይኩን ሰላም /2/\n\nሰላም ሰላም/2/\nኧኸ እንግዲህስ ይሁን ሰላም /2/ " },
			n101 = { "የትንሳኤው ብርሃን የሰው ልጅ ሕይወት /2/\nአድማን መለሰው ከወጣበት ቤት /2/\n	እሰይ የምስራች ደስ ይበላችሁ \n	ሞትን ድል አድርጎ ተነሳላችሁ /2/...አዝ\nያ በሙሴ ኦሪት የተነገረው  /2/ \nሞትን ዛሬ አጥፍቶ የተነሳው ነው/2/ \n	አዝ ....\nማርያም መግደላዊት ምንኛ ታደልሽ /2/\nከሰው ሁሉ በፊት ትንሳኤን አየሽ /2/\n	አዝ ....\nብርሃን ያሳየዋል የጽድቅንም ፋና /2/ \nለሚገዛለቱ በእዉነት ጎዳና  /2/ \n	አዝ ....\nስምህን ተናገርኩ ሁሉም ተቀበለ /2/\nከጥፋት ልጅ በቀር ማንም አልታጎለ /2/\n	አዝ ....\nአምላክ ሆይ ባርከህ ቀድሳቸው	/2/ \nከጥፋት ልጅ በቀር ሁሉም ያንተው ናቸው /2/ \n	አዝ ....\nአንድ ይሁኑ እነርሱም በሰላም በፍቅር /2/\nእኔም አንድ እንደሆንኩ ከቸሩ አባቴ ጋር/2/\n	አዝ ...." };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("92.	የማይሞተው ሞተ ")) {
				loadChild(n92);
			} else if (HoldItem.equals("93.	ወጸሐፈ ጲላጦስ")) {
				loadChild(n93);
			} else if (HoldItem.equals("94.	ምድረ ቀራንዮ")) {
				loadChild(n94);
			} else if (HoldItem.equals("95.	ዘጠኝ ሰዓት ሲሆን")) {
				loadChild(n95);
			} else if (HoldItem.equals("96.	ምድር ፀዳች")) {
				loadChild(n96);
			} else if (HoldItem.equals("97.	ክርስቶስ ተንስአ")) {
				loadChild(n97);
			} else if (HoldItem.equals("98.	እንዘምር ሁላችን")) {
				loadChild(n98);
			} else if (HoldItem.equals("99.	በትንሳኤከ")) {
				loadChild(n99);
			} else if (HoldItem.equals("100.	ሰላም ሰላም")) {
				loadChild(n100);
			} else if (HoldItem.equals("101.	የትንሳኤው ብርሃን ")) {
				loadChild(n101);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T27(this, ParentList,
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
		text.setText("በእንተ ስቅለቱ ለእግዚእነ");
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

	public class T27 extends BaseExpandableListAdapter {

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

		public T27(Activity context, List<String> Items,
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
										+ "/mez/Tiraz2/092-Yemaymotew Mote.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/093-Wetsehafe Pilatos.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/094-Medre Keraniyo.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/095-Zetegn Seat Sihon.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/096-Medir Tsedach.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/097-Krstos Tensa Emutan.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/098-Enzemir Holachin.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/099-Betinsaeke.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/100-Selam Selam.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/101-Yetinsaew Birhan.mp3");
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