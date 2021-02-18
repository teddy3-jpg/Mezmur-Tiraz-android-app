package com.app5kmezmur;

import com.app5kmezmur.R;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
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

public class Tiraz110 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("148. mR? lFñT");
		ParentList.add("149. mSqL BR¦N");
		ParentList.add("150. mSqLk");
		ParentList.add("151. YTqdS SMk");
		ParentList.add("152. bmSql# wbቃl#");
		ParentList.add("153. bwNg@l# ÃmÂCh#");
		ParentList.add("154. `YLn wowNn");
		ParentList.add("155. _LN bmSql# gdl");
		ParentList.add("156. mSqL `YLn");
		ParentList.add("157. ~b qራN×");
		ParentList.add("158. bmSql# b@zwn");
		ParentList.add("159. Xl@n! NG|T");
		ParentList.add("160. BR¦N wÈ");
		ParentList.add("161. w¶ì XMmSql#");
		ParentList.add("162. ×Ms lXl!xy");

	}
	// Assign children list element using string array.

	String[] n148 = { "¦l@ l#Ã mR? lFñT ägîÑ lÚDቃN\nägS¼2¼\nZNt$ mSqL lxÄM zxGBå WSt gnT¼2¼\n¦l@ l#Ã m¶ nW bmNgD ägúcW\nlÚDቃN ägS¼2¼\nY, msqL nW xÄMN ymlsW wd gnT¼2¼" },
			n149 = { "mSqL BR¦N kÖ#l# ›lM m\\rt b@tKRStEÃN¼2¼\nwhb@ s§M mD`n@›lM mSqL mD~N\nlXl nxMN¼2¼\nmSqL BR¦N nW lm§W ›lM m\rT nW lb@tKRStEÃN¼2¼\ns§MN sÀ nW mD`n@›lM mSqL xÄ\" nW l¾ lMÂMN¼2¼" },
			n150 = { "mSqLk Yk#nn b@²¼2¼\nYk#nn b@² ¼4¼ mSqLk Yk#nn b@²¼2¼" },
			n151 = { "YTqdS SMk b`Yl mSqLk b:i mSqLk\nKb#R zxXbY÷ lSMk¼2¼\nSB/T lk lÆ?tETk L;#L¼4¼" },
			n152 = { "bmSql# wbቃl#¼2¼\nx:b×Ñ lxbêEn¼4¼" },
			n153 = { "bwNg@l# ÃmÂCh#¼2¼\nXNµ*N lBR¦n mSql# xdrúCh#¼2¼" },
			n154 = { "`YLn wowNn wägS mägSn¼2¼\nZNt$ WXt$ mSqL¼2¼ " },
			n155 = { "_LN bmSql# gdl¼2¼\nbmSql# lsW LJ s§MN xdl¼4¼" },
			n156 = { "mSqL `YLn mSqL ANXn mSqL\nb@²n¼2¼\nmD`n!Tn lXl xmn¼4¼ " },
			n157 = { "~b qራN× dBr mD`n!T¼2¼\nqራN×¼2¼ ~b qራN×¼2¼\nymSql# ቃL lX¾ yXGz!xB/@R `YL\nnW¼4¼\nl¥ÃMn#T ä\"nT nW lX¾ GN ?YwT\nnW¼2¼\nXNmsKራlN fÈ¶ÃCN xl¼4¼\nXNmnW xNµdW fÈ¶ÃCN cR nW¼2¼\nXNmsKራlN DNGL x¥§J ÂT¼4¼\nXNmsKራlN ¥RÃM x¥§J ÂT ¼4¼\nXNmÂT xNµÄT yxM§K XÂT ÂT¼2¼\n~b _bÆT ~b LúÂT¼4¼\n×/NS¼2¼ wNg@l SBkT¼2¼" },
			n158 = { "bmSql# b@zwn wbdÑ ts¦ln¼2¼\nxM§k M?rT WXt$ mD`n!n\nxM§k M?rT WXt$\nbmSql# b@² çnN äTN >é käT xÄnN¼2¼\nyM?rT g@¬ nWÂ YQR xlN\nyM?rT g@¬ nWÂ" },
			n159 = { "Xl@n! NG|T /\\\\T mSql#¼2¼\n:NÆöM nb!Y zxNkr KB„¼2¼" },
			n160 = { "	BR¦N wÈ kmSql# y¸ÃN[ÆRQ\n	yxM§KÂ ysW LíC XWnt¾ XRQ\n	dS YblN bmSql# BR¦N\n	XLL XNbL bxNDnT çnN\n	tnúLN mD`n!¬CN\nkðT lðT bmúl# ymSql# ngR\ny¸wdW /êRÃ ywNg@L mMHR\n×/NSM SQlt$N b¥yt$\ns!ÃZN ñr bMDራêE ?Ywt$\nb!ÃsQqW ät$ GRÍt$\n	xZ\nä\"nT nW l¸-ûT msÂkÃcW\nb›lM _bB l¸ñ„T XWnT tSኗcW\nl-b!B sW bmNfS l¸ñrW\nymÄN qN XWnt¾ ›R¥ nW\nkghnM XúT y¸ÃDN nW\n	xZ\nXSkmSqL §LtlyW QÇS /êRÃ\nl×/NS ywNg@L sW yFQR ÆläÃ\nMSUÂCN kMDR YDrsW\nXNDÂlN bs-W Múl@W\nsãC h#l# XNktlW" },
			n161 = { "w¶ì XMmSql#¼2¼\nXMmSql# xBR¦ lkÖ#l#\nXMmSql# lk#l# xBRH" },
			n162 = { "×Ms lXl!xy¼2¼\nxbRH bmSqLü¼2¼" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);

		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("148. mR? lFñT")) {
				loadChild(n148);
			} else if (HoldItem.equals("149. mSqL BR¦N")) {
				loadChild(n149);
			} else if (HoldItem.equals("150. mSqLk")) {
				loadChild(n150);
			} else if (HoldItem.equals("151. YTqdS SMk")) {
				loadChild(n151);
			} else if (HoldItem.equals("152. bmSql# wbቃl#")) {
				loadChild(n152);
			} else if (HoldItem.equals("153. bwNg@l# ÃmÂCh#")) {
				loadChild(n153);
			} else if (HoldItem.equals("154. `YLn wowNn")) {
				loadChild(n154);
			} else if (HoldItem.equals("155. _LN bmSql# gdl")) {
				loadChild(n155);
			} else if (HoldItem.equals("156. mSqL `YLn")) {
				loadChild(n156);
			} else if (HoldItem.equals("157. ~b qራN×")) {
				loadChild(n157);
			} else if (HoldItem.equals("158. bmSql# b@zwn")) {
				loadChild(n158);
			} else if (HoldItem.equals("159. Xl@n! NG|T")) {
				loadChild(n159);
			} else if (HoldItem.equals("160. BR¦N wÈ")) {
				loadChild(n160);
			} else if (HoldItem.equals("161. w¶ì XMmSql#")) {
				loadChild(n161);
			} else if (HoldItem.equals("162. ×Ms lXl!xy")) {
				loadChild(n162);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T110(this, ParentList,
				ParentListItems);
		expandablelistView.setAdapter(expListAdapter);
		expandablelistView.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				return true;
			}
		});
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

	public class T110 extends BaseExpandableListAdapter {

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

		public T110(Activity context, List<String> Items,
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

		private void data(int childPosition, int groupPosition) {
			if (childPosition == 0 && groupPosition == 0) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/148-Merih Lefenot.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/149-Meskel Birhan.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/150-Meskeleke.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/151-Yetkedes Semeke.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/152-Bemeskelu Webekalu.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/153-Bewengelu Yamenachehu.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/154-Hailene Wetswenine.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/155-Telen Bemeskelu Gedele.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/156-Meskel Haylene.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/157-Habe Keraniyo.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/158-Bemeskelu Bezewene.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/159-Eleni Nigist.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/160-Birhan Weta.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/161-Werido Emeskelu.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/162-Yomese Leliaye.mp3");
			}

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
