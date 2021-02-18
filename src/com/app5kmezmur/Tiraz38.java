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

public class Tiraz38 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("112.	እግዚኡ ረሰዮ");
		ParentList.add("113.	ሊቃነ መላእክት ");
		ParentList.add("114.	የራማው ልዑል ");
		ParentList.add("115.	ገብርኤል ግሩም");
		ParentList.add("116.	ገብርኤል መልአክ");
		ParentList.add("117.	ፍቁራኒሁ");
		ParentList.add("118.	ሱራፌል በግርማሆሙ");

	}
	// Assign children list element using string array.

	String[] n112 = { "XGz!x# rs× lWXt$ ¸µx@L ¼2¼\nXMk#lÖÑ m§XKT ¼2¼ YTl@;L mNb„\n\nTRg#MÝ( g@¬W ¸µx@LN km§XKT h#l# mNb„N kF kF xdrgWÝÝ " },
			n113 = { "l!q m§XKT QÇS ¸µx@L\nsYÈNN DL ÃደrGH bfÈ¶ `YL\nየኃY§T xl” yT~TÂ mLxK\nXÂmSGN xNtN xæMÃN ÃÄNK\n	ኃÃl# mLአK QÇS gBRx@L\n	LdTN Ãb\\RK l¥RÃM DNGL\n	mLአk B|‰T mLአk B|‰T\n	mLአk B|‰T QÇS gBRx@L\nf¬N? ¥~]N QÇS „Íx@L\nysãCN CGR f_nH yM¬qL\nbxNt x¥§JnT fÈ¶N SNlMN\nèlÖ DrSÂ rDx@THN S-N\n	mUb@ BR¦ÂT QÇS ‰g#x@L\n	lMSUÂ Tg#H qN l@l!T úTL\n	|:LH ðT ömN  xNtN SN¥]N\n	XzNLNÂ g{HN xB‰LN\n\nQÇS ;#‰x@L l!q m§XKT\nx!T×ùÃN yÆrKH bDNGL SdT\nmLአk s§M nH mLxk s§M\nbmSqLH ÆRµT YHCN ›lM\n	QÇS Ín#x@L BR¦ÂêE mLአK\n	s¥ÃêE ~BST lDNGL ymgBK\n	bnFS b|U rኀB -WLgN XNÄNdRQ\n	ML©H xYlyN bs!âL XNÄNwDQ\nÆ?RÂ wNZ bLK XNÄ!äl#\nZÂB yM¬s_ l›lM bÑl#\nb`-!አT XNÄNwDQ FÊ úÂf‰\nQÇS úq$x@L çY -BqN xd‰" },
			n114 = { "y‰¥W L;#L gBRx@L ¼2¼\ntm§lS mN§CN SMHN -RtN Â SNLH ¼2¼ \nBR¦N LBs# Xú¬êEW mLአK\nxNt x¥LdN km/¶W xM§K ¼2¼\nyM|‰C nU¶ DNቅ LdT xBœ¶\ny{DQ ÍÂ yDኅnT ¯ÄÂ ¼2¼\n§mn#BH lt¥]n#BH\nf_ñ d‰> xl\"¬cW nH ¼2¼\nyxÂNÃ yx²RÃ y¸úx@L kl§cW\nkXúT nbLÆL ÃÄNµcW ¼2¼\nMሰሶ ዓMÄCN m-g!ÃCN\nQÇS gBRx@L -ÆqEÃCN ¼2¼" },
			n115 = { "gBRx@L G„M bmNfS QÇS ~t$M ¼2¼\nn› ¼4¼ ¥:kl@n q$M bb›Lk ÆRkn ×M\n\nTRg#MÝ( bmNfS QÇS y¬tMH `ÃL gBRx@L çY bb›LH qN TÆRkN zND Â bmµklCN q$M" },
			n116 = { "gBRx@L mLxK wrd ^b qERöS wXÑ x!yl#È ¼2¼ QDST\nzx_Få lnbLÆl XúT ዘአድኀኖሙ ls¥:T ¼2¼\n\nTRg#MÝ( ሰማዕታትን ያዳናቸውና የእሳቱን ነበልባል ያጠፋው ገብርኤል ወደ ቂርቆስና እናቱ ቅድስት x!የሉጣ ወረደ፡፡" },
			n117 = { "Fq$‰n!h# lxB /@‰N mtNB§ን ¼2¼\nXl YSXl# M?rt lWl#d sBX s#‰ØL wk!„b@L ¼2¼\n\nTRg#MÝ( x¥§íC wÄíC R~„^ÖC Kçn# KsW LíC M?rTN y¸lMn# yxB wÄíC s#‰ØLÂ k!„b@L ÂcWÝÝ" },
			n118 = { "s#‰ØL bGR¥çÑ wk!„b@L bWÄs@ሆሙ ¼2¼\n^b አንጻረ qÄ¥êE የሐW„ b\rg§ YrW[# ¼2¼\n\nTRg#MÝ( s#‰ØL bGR¥cW k!„b@L bMSUÂcW በቀዳማዊው ፊት xNÉR b\rg§ YéÈl# /ይመላለሳሉ/፡፡  ቀዳማዊ የሚቀድመው የሌለ ማለት ነው፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("112.	እግዚኡ ረሰዮ")) {
				loadChild(n112);
			} else if (HoldItem.equals("113.	ሊቃነ መላእክት ")) {
				loadChild(n113);
			} else if (HoldItem.equals("114.	የራማው ልዑል ")) {
				loadChild(n114);
			} else if (HoldItem.equals("115.	ገብርኤል ግሩም")) {
				loadChild(n115);
			} else if (HoldItem.equals("116.	ገብርኤል መልአክ")) {
				loadChild(n116);
			} else if (HoldItem.equals("117.	ፍቁራኒሁ")) {
				loadChild(n117);
			} else if (HoldItem.equals("118.	ሱራፌል በግርማሆሙ")) {
				loadChild(n118);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T38(this, ParentList,
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
		text.setText("በእንተ ቅዱሳን መላእክት");
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

	public static class T38 extends BaseExpandableListAdapter {
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

		public T38(Activity context, List<String> Items,
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

						private void data(int childPosition, int groupPosition) {
							// TODO Auto-generated method stub
							if (childPosition == 0 && groupPosition == 0) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/112-Egzio reseyo.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/113-Likane Melaekt.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/114-Yeramaw Leul.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/115-Gebriel Girum.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/116-Gebriel Mel'ak.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/117-Fikuranihu.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/118-Surafel beGirmahomu.mp3");
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