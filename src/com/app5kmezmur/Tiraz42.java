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

public class Tiraz42 extends Activity {
	
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("38.	ዮሐንስኒ ሀሎ ");
		ParentList.add("39.	በዮርዳኖስ ተጠምቀ");
		ParentList.add("40.	ርዕዩከ ማያት ");
		ParentList.add("41.	ልደቶ ትምቀቶ");
		ParentList.add("42.	ወቅድሳተ መንፈስ ");
		ParentList.add("43.	ተጠምቀ ሰማያዊ ");
		ParentList.add("44.	በበህቀ ልህቀ");
		ParentList.add("45.	ጥዒሞ አንከረ");
		ParentList.add("46.	እንዘ ስውር");
		ParentList.add("47.	አንከርዎ ለማይ ");

	}
	// Assign children list element using string array.

	String[] n38 = { "ዮሐንስኒ ሀሎ ያጠምቅ/፪/ በሄኖን\nያጠምቅ በሄኖን\n   አዝ...\nመንግሥተ ሰማያት ቀርባለች እያለ\nዮሐንስ ሲያሰተምር ማነው ያስተዋለ\nእንደ ተናገረ አዋጅ ነጋሪው\nተራራው ዝቅ ይበል ይሙላ ጎድጓዳው\n   አዝ...\nእድገቱ ምናኔ ትምህርቱ ንስሐ\nየጣዝማ ማር በልቶ ኖረ በበረሃ\nመጓዝ እንዲያስችለን በሕይወት ጎዳና\nላይ ታቹ ይደልደል ጎባጣውም ይቅና\n   አዝ...\nሲኖር በምናኔ በሄኖን በረሃ\nያጠምቅ ነበረ ዮሐንስ በውሃ\nበማየ ዮርዳኖስ በዮሐንስ እጅ\nጌታ ተጠመቀ ድኅነትን ሊያውጅ\n   አዝ...\nጌታውን አጥምቆ ለክብር የሚበቃ\nከእናቱ ማኅፀን ተገኘ ምርጥ ዕቃ\nኤልሳቤጥም ለክብር ሆና የታደለች\nመልካም የነፍስ አባት መጥምቁን ወለደች\nዮሐንስኒ ሃሎ ያጠምቅ/፪/ በሄኖን/፫/" },
			n39 = { "በዮርዳኖስ ተጠምቀ /፪/ በሠላሳ ክረምት /፪/\nከመ ይስዓር መርገማ ለሔዋን ዲበ/፪/ ዕፀ   መስቀል ተሰቅለ /፪/ \nትርጉም፡- በሠላሳ ዘመኑ በዮርዳኖስ ተጠመቀ  ሔዋንንም መርገም ይደመስስ ዘንድ በመስቀል ላይ ተሰቀለ፡፡" },
			n40 = { "ርዕዩከ ማያት እግዚኦ ርዕዩከ ማያት ወፈርሁ /፪/\nደንገጹ ቀላያተ ማያት ወደምጸ ማያቲሆሙ  /፬/ኧኸ \nአቤቱ ውኆች አዩህ ውኆችም አይተው ፈሩህ /፪/\nጥልቆችም ተነዋወጡ ውኆችም ጮሁ/፬/" },
			n41 = { "ልደቶ ጥምቀቶ አስተርእዮቶ ለመድኃኒነ /፪/\nእለ ቀደሙነ /፭/ መሃሩነ እለ ቀደሙነ /፪/\n\n ትርጉም፡- የቀደሙ አባቶቻችን የጌታችንን   ልደቱን፣ጥምቀቱን መታየቱን/መገለጡን/ አስተማሩን፡፡" },
			n42 = { "ወቅድሳተ መንፈስ  \nወሀበነ ማየ መንጽሔ ዚአነ\nቅድስት ትእዛዙን አፍርሰን\nወደ ምድረ ፋይድ ብንወርድ\nበኃጢአት ወጥመድ ተይዘን በሲኦል እሳት ስንነድ \nየምንዱባን ጡኸት ከደማይ ሆኖ ሰማና\nበደሙ እንዲቤዥ ዓለሙን አንድያ ልጁን ላከና \n   አዝ...\nየሐሰት አባት ሳጥናኤል የፍጥኝ አስሮን በዕዳ\nበዕብነ ሩካብ ጽፎብን የሞት ደብዳቤ የፍዳ\nነጻ እንዲያወጣን በጥምቀት ከሲኦል ኑሮ ጎዳና\nአበሳችንን ሊያስወግድ ወደ ዮርዳኖስ ወንዝ ተጠምቆ \n   አዝ...\nጸጋው ተገፎ የሰው ልጅ ሲኖር በምዉት ገዳም\nየጽድቅ ጎዳና ጠፍቶበት ሲናፍቅ ያን ዓለም\nበአምስተኛው ቀን ከመንፈቅ ብርሃን ከምስራቅ ፈንጥቆ\nአስወገደለት መርገሙን ከዮርዳኖስ ወንዝ ተጠምቆ \n   አዝ...\nአብ ከላይ ሆኖ አሰማ የምስራች ቃል ለሁሉ \nየዕዳ ደብዳቤ ስረዛ ተደርጓልና በሙሉ\nቀለም አበሳ ተፋቀ ዳግም ተሰጠን ልጅነት\nህፃኑ ኢየሱስ ክርስቶስ ከላይ ውሃ ደፍቶበት\n   አዝ..." },
			n43 = { "ተጠምቀ ሰማያዊ /፪/\nበእደ መሬታዊ /፪/\n\nየአምላኮች አምላክ የነገሥታት ንጉሥ /፪/\nየዓለም ሁሉ ፈጣሪ የሥጋና የነፍስ \n   አዝ...\nከባርነት አውጥቶ ነጻነትን ሊሰጠን /፪/\nሐዘናችን አጥፍቶ ሰላምን ሊመግበን \n        አዝ...  \nጠላታችን አፈረ አምላካችን ከበረ /፪/\nስለ ልጁ መጠመቅ እግዚአብሔር መሰከረ \n   አዝ... \nበአንድነት እናቅርብ ለአምላክ ምስጋና /፪/\nእልል እልል እንበል ነጻ ወጥተናልና \n     አዝ... \nጥቂት በጥቂት አደገ በዮርዳኖስ ተጠመቀ /፪/\nበዮርዳኖስ /4/ ተጠመቀ በቅዱስ ዮሐንስ /፪/" },
			n44 = { "በበህቀ ልህቀ /፪/\nበሠላሳ ክረምት በዮርዳኖስ ተጠምቀ /፪/\nጥቂት በጥቂት አደገ /፪/\nበሠላሳ ዘመን በዮርዳኖስ ተጠመቀ /፪/" },
			n45 = { "ጥዒሞ አንከረ ሊቀ ምርፋቅ /፪/\nበረከተ /፪/ ዘአምላክ ገብረ /፪/ ኧኸ\n\n ትርጉም፡- አምላክ ያደረገውን ተዓምር ተመልክቶ /አጣጥሞ/ የሠርግ ቤቱ አለቃ አደነቀ፡፡" },
			n46 = { "እንዘ ስውር እምኔነ ይእዜሰ ክሱተ ኮነ /፪/\nተአምረ ወመንክረ ገብረ መድኃኒነ በቃና ዘገሊላ            \nከብካብ ኮነ ማየ ረሰየ ወይነ /፪/ \n\nትርጉም፡-በእኛ ተሰውሮ የነበረው የጌታ አምላክነት በገሊላ ሠርግ ግልፅ ሆነ፡፡ በአምላክነቱ ኃይል ውሃን ወደ ወይን ሲለውጥ፡፡/የመጀመሪያው ተዓምር/" },
			n47 = { "አንከርዎ ለማይ አእኰትዎ ለኢየሱስ /፪/ \nበእንተ ማይ ዘኮነ ወይነ /፬/ ኧኸ\n\nትርጉም፡- ኢየሱስ ውሃን ወደ ወይን በመለወጡ አመሰገኑት ወይን የሆነውን ውሃውን አይተው አደነቁ፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("38.	ዮሐንስኒ ሀሎ ")) {
				loadChild(n38);
			} else if (HoldItem.equals("39.	በዮርዳኖስ ተጠምቀ")) {
				loadChild(n39);
			} else if (HoldItem.equals("40.	ርዕዩከ ማያት ")) {
				loadChild(n40);
			} else if (HoldItem.equals("41.	ልደቶ ትምቀቶ")) {
				loadChild(n41);
			} else if (HoldItem.equals("42.	ወቅድሳተ መንፈስ ")) {
				loadChild(n42);
			} else if (HoldItem.equals("43.	ተጠምቀ ሰማያዊ ")) {
				loadChild(n43);
			} else if (HoldItem.equals("44.	በበህቀ ልህቀ")) {
				loadChild(n44);
			} else if (HoldItem.equals("45.	ጥዒሞ አንከረ")) {
				loadChild(n45);
			} else if (HoldItem.equals("46.	እንዘ ስውር")) {
				loadChild(n46);
			} else if (HoldItem.equals("47.	አንከርዎ ለማይ ")) {
				loadChild(n47);
			}

			else
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

	public class T42 extends BaseExpandableListAdapter {

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
						+ "/mez/Tiraz4/38.Yohanisni Halo.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/39.BeYordanos Tetemike.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/40.Reeyuke.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/41.Lideto Timketo.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/42.Wekidisate Menfes.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/43.Tetemke semayawi.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/45.Tiemo Ankere.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/46.Enzde Siwer.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/47.Ankeriwo lemay.mp3");
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