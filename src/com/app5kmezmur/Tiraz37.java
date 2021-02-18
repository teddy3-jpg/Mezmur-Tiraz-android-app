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

public class Tiraz37 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("103.	መስቀሉሰ");
		ParentList.add("104.	ቤተ ክርስቲያን ርዕየቶ");
		ParentList.add("105.	ዝንቱ መስቀል");
		ParentList.add("106.	እንተ ተሐንፀት በስሙ");
		ParentList.add("107.	ኧኸ በመስቀልከ");
		ParentList.add("108.	ዘዕጣን አንጸረ");
		ParentList.add("109.	ይቤሎሙ ኢየሱስ");
		ParentList.add("110.	መስቀል ቤዛ ብዙኃን");
		ParentList.add("111.	ዮም በዓለ መስቀሉ");

	}
	// Assign children list element using string array.

	String[] n103 = { "mSql#s lKRSès BR¦N lእl nአMN TBL b@t KRStEÃN ¼2¼\n²Hn# ለÆ?R wmRî lxሕ¥R ZNt$ WXt$ mስqL ¼2¼\n\nTRg#MÝ( yKRSèS mSqL lMÂMን sãC BR¦N nW mSqL yÆ?R ]_¬W የመርከቦች ወደብ nW T§lC b@t KRStEÃN " },
			n104 = { "ቤተ ክርስቲያን ርእይቶ Qንw lzበ¯L¯¬ dÑ tK:w¼2¼\nkm XGr ]/Y |n# ^tw በዓለ መስቀል ዘዮም ትገብር ህልወ ¼2¼\n\nTRg#MÝ( b¯L¯¬ dÑ yfssWን xM§K b@t KRStEÃN xyCW dM GÆt$M XNd ]/Y xW¬R /ጮራ/ xb‰ y²ÊW ymSqL b›LM lzl›lM ¬b‰lC" },
			n105 = { "ZNt$ mSqL ~BSt ?YwT xFry አውኀz ln dm w¥y አውኀz ln ¼2¼\nkm g@‰ wRQ ጽ„Y ሥRGW bÆHRY mSqL \nnb!é ÃStRኢ §ዕለ Rዕስየ ¼2¼\n\nTRg#MÝ( ይህ መሰቀል የሕይወት ኅብስትን ¼አስገኘልን¼ ደምና ውኃንም አመነጨልን በዕንቁ እንደ ተሸለመ እንደ ንጹሕ የወርቅ አክሊል ¼ዘውድ¼ መስቀል በራሴ ላይ ሆኖ ያበራል፡፡ ¼ሥጋውን ደሙን በመስቀል ተሰቅሎ እንደሰጠን ለመናገር ነው¼" },
			n106 = { "XNt tሐNፀT bSÑ wtqdsT bdÑ b@tKRStEÃN ¼2¼\nwtxTበT bዕፀ mSql# Xስm ኃYl XGz!xB/@R §:l@ሃ ¼2¼\n\nTRg#MÝ( በስሙ የታነፀች ¼ያመነች¼ በደሙም የተቀደሰች ¼የከበረች¼ በመስቀሉም የታተመች ቤተ ክርስቲያን ¼ምXመን¼ የእግዚአብሔር ኃይል በራሷ ላይ አለ፡፡" },
			n107 = { "%< bmSqLk %< {Lmt xB‰Hk\n%, bmSqLk %ኸ Ñ¬n xNœXk   ¼2¼\nX, ወዘተኃጉለ rÄXk bmSqLk¼2¼\n\nTRg#MÝ( በmሰቀልህ ጨለማን አበራሀ ሙታንንም አነœሀ የጠፋውንM በመስቀልህ ረዳኸው¼አዳን,ው¼" },
			n108 = { "ዘዕጣን አንጸረ¼4¼\nb¯L¯¬ trKb :] mSqL ¼4¼ \n\nTRg#MÝ( ዕጣኑ አመለከተ መSቀሉ በጎልጎታ ተገኘ፡፡" },
			n109 = { "Yb@lÖÑ ኢys#S ለxYh#D Xmn# By ¼2¼\nwXmn# bxb#y xበRህ ¼2¼ bmSqLy ¼2¼\n\n ትርጉምÝ(ጌታ ኢየሱስ አይሁድን በእኔ እመኑ በአባቴ ዕመኑ ላመኑብኝ በመስቀሌ አበራለሁ አላቸው::" },
			n110 = { "መስቀል ቤዛ ብዙኃን ሕይወተ ኮነ ለኩሉ ዓለም¼2¼ ፍስ/ነ ወሰላምነ ለእለ አመነ መሠረተ ቤተክርስቲያን¼2¼\n\nትርጉምÝ(የብዙኃን ቤዛ መስቀል ለዓለም ኹሉ መድኃኒት ኾነ፡፡ለምናምን ደስታችን ሰላማችን የቤተ ክርስቲያን መሠረት ነው፡፡" },
			n111 = { "ዮም በዓለ መSቀሉ በcማያት በላዕሉ ¼2¼\nወዘነግሠ በምድር ¼2¼ ለአሕዛብ ¼4¼ %ኸ\n\nትርጉምÝ(ዛሬ በላይ በሰማያት የመሰቀል በዓል ነው¿ \nለአሕዛብም በምድር ነገሠ፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("103.	መስቀሉሰ")) {
				loadChild(n103);
			} else if (HoldItem.equals("104.	ቤተ ክርስቲያን ርዕየቶ")) {
				loadChild(n104);
			} else if (HoldItem.equals("105.	ዝንቱ መስቀል")) {
				loadChild(n105);
			} else if (HoldItem.equals("106.	እንተ ተሐንፀት በስሙ")) {
				loadChild(n106);
			} else if (HoldItem.equals("107.	ኧኸ በመስቀልከ")) {
				loadChild(n107);
			} else if (HoldItem.equals("108.	ዘዕጣን አንጸረ")) {
				loadChild(n108);
			} else if (HoldItem.equals("109.	ይቤሎሙ ኢየሱስ")) {
				loadChild(n109);
			} else if (HoldItem.equals("110.	መስቀል ቤዛ ብዙኃን")) {
				loadChild(n110);
			} else if (HoldItem.equals("111.	ዮም በዓለ መስቀሉ")) {
				loadChild(n111);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T37(this, ParentList,
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
		text.setText("በእንተ መስቀሉ ለእግዚእነ");
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

	public static class T37 extends BaseExpandableListAdapter {
		TextView duratio;
		private Activity context;
		Button play, playpause;

		private MediaPlayer mp = new MediaPlayer();
		SeekBar seekbarProgress;
		private int duration;
		private final Handler handler = new Handler();
		private double timeElapsed = 0, finalTime = 0;
		public int oneTimeOnly = 0;
		private Map<String, List<String>> ParentListItems;
		private List<String> Items;

		public T37(Activity context, List<String> Items,
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
					"fonts/VG2_Main.ttf");
			item.setTypeface(face1);
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
										+ "/mez/Tiraz3/103-Meskeluse.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/104-Bete Kristiyan r'eyeto.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/105-Zintu Meskel.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/106-Ente tehantset beSimu.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/107-Ehe beMeskelike.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/108-Ze'etan antsere.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/109-Yibelomu Iyesus.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/110-Meskel beza bizuhan.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/111-Yom be'ale Meskelu.mp3");
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