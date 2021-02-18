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

public class Tiraz41 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("28.	አስተርአያ ገብርኤል ");
		ParentList.add("29.	ክንፎ ጸለላ");
		ParentList.add("30.	ባሰማት ጊዜ");
		ParentList.add("31.	ተቀደሰት ዓለም");
		ParentList.add("32.	ስብሐት ለእግዚአብሔር ");
		ParentList.add("33.	በጐለ እንስሳ");
		ParentList.add("34.	አጽነነ ሰማያተ");
		ParentList.add("35.	አንቺ ቤተልሔም");
		ParentList.add("36.	ዙፋኑ ነበልባል  ");
		ParentList.add("37.	አንፈርአፁ");

	}
	// Assign children list element using string array.

	String[] n28 = { "አስተርአያ ገብርኤል ግብተ /፪/\nወእንዘ ትፈትል /፬/ ወርቀ ወሜላተ\n   አዝ...\nከአዳም ልጅ መካከል ከእነዳዊት ዘር\nመርጦ ተወለደ ከድንግል በክብር\nዘጠና ዘጠኙን መላእክቱን ትቶ\nአዳምን ሊያድነው ስላየው ተራቁቶ\n   አዝ...\nሐር እየፈተለች ቤተ መቅደስ ሆና\nገብርኤል ነገራት ሰማያዊ ዜና\nትፀንሲ እያለ በድንቅ ሰላምታ\nበትኅትና ሆኖ ሲታጠቅ ሲፈታ\n   አዝ...\nከክቡር ዙፋኑ ከመንበሩ ወርዶ\nአዳነን ከፍዳ ከማርያም ተወልዶ\nየነገሥታት ንጉሥ ቤዛ ኩሉ ዓለም\nሥጋዋን ለበሰ መድኃኔ ዓለም\n   አዝ...\nንጉሥ መወለዱን ሰብአ ሰገል ሰምተው\nአምኃ አቀረቡ ከሩቅ ምሥራቅ መጥተው\nየዳዊት ትንቢቱ ተፈጸመለት\nየሳባ ነገሥታት ወርቅ አመጡለት/፪/" },
			n29 = { "ክንፎ ጸለላ /፮/\nተፈስሒ ለድንግል ይቤላ /፬/ ኧኸ\n\nትርጉም፡- መልአኩ ገብርኤል በክንፉ ከልሎ እመቤታችንን ደስ ይበልሽ አላት::" },
			n30 = { "ስሙ ገብርኤል የተባለ ለድንግል ነገራት መልካም ዜና \nእንደምትወልደው ወልድን በድንግልና /2/\n	ባሰማት ጊዜ ቃሉን ቅዱስ ገብርኤል በለዛ \n	ድንግል ቀረበች ወደ እርሱ ፍጹም ትኅትናን ይዛ\nትጸንሻለሽ ሲላት መላአኩ ፍጹም በልቧ ሳትመካ\nእንደ ቃልህ ይሁን አለችው በቅሉ ተማርካ /2/\n	አዝ.... \nየዓለም መድኃኒት ነውና ከአንቺ የሚወለደው በመንፈስ ቅዱስ\nጸሚዋለች ስሙንም ብለሽ ኢየሱስ/2/\n	አዝ......\nዕፁብ ድንቅ ነው ሁልጊዜ ለድንግል ማርያም የተሠጣት ክብር\nየአምላክ እናት ሆኖ መመረጥ ከሴቶች መካከል/2/\n	አዝ....\nጸጋን የተመላሽ ድንግል ሆይ ይገባሻል ለአንቺ ከብርና ምስጋና\nየፍጥረታት ጌታ ሁል ጊዜም ከአንቺ ጋር ነውና/2/\n	አዝ...." },
			n31 = { "ተቀደሰት ዓለም በእንተ ልደቱ	ተቀደሰት ዓለም/፪/ ኢትዮጵያ   /፪/ \nተወልደ እምድንግል ሠያሜ ካህናት ወረደ \nክርስቶስ አክሊለ ሰማዕት                    /፪/\n  ትርጉም፡- የካህናት ሿምያቸው የሰማዕታት አክሊላቸው ክርስቶስ ከድንግል ማርያም ተወለደ:: በልደቱም ዓለም/ኢትዮጵያ/ ተቀደሰች፡፡" },
			n32 = { "ስብሐት ለእግዚአብሔር በሰማያት /፪/  \nወሰላም በምድር/፫/ ሥምረቱ ለሰብእ /፪/\n   አዝ...\nበኀጢአት የወደቀ አዳምን ሊያነሣ\nአምላክ ተወለደ በጎለ እንስሳ\nሕዝቡ ሲኖር  ሳለ ጨለማ ውጦት\nአየ ብርሃንን በአምላኩ ልደት\n   አዝ...\nበዳዊት ከተማ በከብቶች በረት\nይኸው ተወለደ የዓለም መድኅኒት\nጠፍቶ እንዳይቀርበት ርቆ ከመንጋ\nአምላክ ተወለደ አዳምን ፍለጋ\n   አዝ...\nሰግደው ገበሩለት ወርቅ ዕጣን ከርቤን\nሰው ለሆነው አምላክ አዳምን ሊያድን\nምነው ባደረገን እኛን እንደ እረኞች\nእንደ ሰብአ ሰገል እንደ ጥበብ ሰዎች\n   አዝ..." },
			n33 = { "በጐለ እንስሳ /፬/\nበጐለ እንስሳ ተወልደ አማኑኤል /፬/ ኧኸ\nበእንስሳት በረት /፬/\nበእንስሳት በረት ተወለደ አማኑኤል /፬/ ኧኸ" },
			n34 = { "አጽነነ ሰማያተ ወወረደ እግዚአብሔር /፪/\nእምድንግል ቃል ሥጋ ዚአነ ለብሰ ወኀብሩ ትስብእት ወመለኮት/፪/\n\n  ትርጉም፡- እግዚአብሔር በትህትና ራሱን ዝቅ በማድረግ ከሰማይ ወረደ ከድንግልም ሥጋችንን ለበሰ መለኮትና ሰውም/ሥጋም/ አንድ ሆኑ፡፡" },
			n35 = { "አንቺ ቤተልሔም የይሁዳ መሬት \nባንቺ ተወለደ የዓለም መድኃኒት       /፪/ \n\nየአዳምን ክብር ሲሻ ቤተልሔም \nለሁሉም ሰላም ቤተልሔም 	\nጌታ ተወለደ ቤተልሔም \nከድንግል ማርያም ቤተልሔም\n   አዝ.... \nሕፃኑና እናቱን ቤተልሔም \nበበረት አግኝተው ቤተልሔም \nየምስራቅ ነገሥታት ቤተልሔም \nእጅ መንሻ አቀረቡ ቤተልሔም \n   አዝ.... \nቅዱሳን መላእክት ቤተልሔም \nአሸበሸቡለት ቤተልሔም \nስብሐት ለእግዚአብሔር ቤተልሔም \nብለው ዘመሩለት ቤተልሔም\n   አዝ.... " },
			n36 = { "	ዙፋኑ ነበልባል መንበሩ ኪሩቤል\n	የተመሰገነ ስሙ ነው አማኑኤል\n	ከኛ ጋር ሆነ ሰላምን ሰጠን\n	ስብሐት በአርያም በምድርም ይሁን\nአንቺ ቤተልሔም የኤፍራታ ምድር\nከፍ ከፍ አረገሽ  አምላክሽ እግዚአብሔር\nተነሽ ተቀበይው እጅሽን ዘርግተሸ\nአማኑኤል ተወልዷል መድኅን ሊሆንሽ\n   አዝ...\nዛሬ በኤፍራታ ሕፃኑን አገኘን\nሥጋን ተዋሕዶ መድኃኒት ሊሆነን\nለዚህ ታላቅ ምሥጢር ስለተመረጠች\nድንግልም ጠራችው አማኑኤል አለች\n   አዝ...\nርቀን የነበርን በደሙ ቀርበናል\nባርነት ቀርቶልን ልጆች ተብለናል\nክርስቶስ ተብሎ ክርስቲያን ላሰኘን\nበመላእክት ሥርዓት ቅዱስ ቅዱስ ቅዱስ እንበል" },
			n37 = { "አንፈርአፁ ሰብአ ሰገል ረኪቦሙ ሕፃነ /፪/\nዘተወልደ ለነ /፬/ ሕፃን ዘተወልደ ለነ /፪/\n\n  ትርጉም፡- ለእኛ ብሎ የተወለደውን ሕፃኑን አግኝተው ሰብአ ሰገል በደስታ ዘለሉ/ሰገዱ/፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("28.	አስተርአያ ገብርኤል ")) {
				loadChild(n28);
			} else if (HoldItem.equals("29.	ክንፎ ጸለላ")) {
				loadChild(n29);
			} else if (HoldItem.equals("30.	ባሰማት ጊዜ")) {
				loadChild(n30);
			} else if (HoldItem.equals("31.	ተቀደሰት ዓለም")) {
				loadChild(n31);
			} else if (HoldItem.equals("32.	ስብሐት ለእግዚአብሔር ")) {
				loadChild(n32);
			} else if (HoldItem.equals("33.	በጐለ እንስሳ")) {
				loadChild(n33);
			} else if (HoldItem.equals("34.	አጽነነ ሰማያተ")) {
				loadChild(n34);
			} else if (HoldItem.equals("35.	አንቺ ቤተልሔም")) {
				loadChild(n35);
			} else if (HoldItem.equals("36.	ዙፋኑ ነበልባል  ")) {
				loadChild(n36);
			} else if (HoldItem.equals("37.	አንፈርአፁ")) {
				loadChild(n37);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T41(this, ParentList,
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
		text.setText("በእንተ  ብስራት| በእንተ ልደቱ ለእግዚእነ");
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

	public class T41 extends BaseExpandableListAdapter {

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

		public T41(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/28.Asteraya Gediriel.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/29.Kinfo Tselela.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/30.Basemat Gize.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/31.Tekedeset Alem.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/32.Sibhat LeEgziabher.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/33.Begole Ensisa.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/34.Astinene Semayate.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/36.Zufanu Nebelbal.wma");
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
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