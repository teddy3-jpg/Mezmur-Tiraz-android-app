package com.app5kmezmur;

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
import com.app5kmezmur.R;

public class Tiraz111 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("163. gBRx@L ML;n!");
		ParentList.add("164. sxl# xStM?„ ln");
		ParentList.add("165. Æ?ራNn!");
		ParentList.add("166. WXt$ l!öÑ");
		ParentList.add("167. L;#L WXt$");
		ParentList.add("168. ¸µx@L l!Q");
		ParentList.add("169. ¸µx@L x¥LdN");
		ParentList.add("170. qêMÃN lnFúT");
		ParentList.add("171. xM§k X|ራx@L");
		ParentList.add("172. mLxk s§Mn");
		ParentList.add("173. XLF xX§ÍT");

	}
	// Assign children list element using string array.

	String[] n163 = { "gBRx@L ML;n! mNfs LúN\nltÂBï mNfs LúN\näÈ?t BR¦N¼2¼ zYTglBï äÈ?t\nBR¦N¼2¼\n\nTRg#M(gBRx@L lmÂgR _„ LúN S-\"\nxNdbT S-\" ¼mNfS QÇSN xúDRB\"¼\nyBR¦N m¯ÂoðÃ XND¯ÂoF xDRg\" bML©H tራÄ\"" },
			n164 = { "¸µx@L wgBRx@L s#ራØL wk!„b@L\n;#ራx@L w„Íx@L BRÂx@L xQÂx@L s#Æx@L\nwFÂx@L s§¬x@L sÄ¬x@L x@LÂx@L\nm§XKt M?rT Xl DLê lúHL\nsxl# xStMH„ ln XSm bolÖt\nTNBLÂKÑ TD~N wx!T¥sN hgR" },
			n165 = { "Æ?ራNn! Yb@ zngd Æ?R ¼2¼\nRx!Kã l¸µx@L wsxNk# -Yöt$ zYBL¼2¼\n\nTRg#M( Æ?RN xÌRõ y/@d Æ?ራN\n¸µx@LN xYc& mrÄT tún\" xl" },
			n166 = { "WXt$ l!öÑ lm§XKT wmLx÷Ñ SÑ ¸µx@L\nLBs# zmBrQ ›Yn# zRGB l!qm§XKT¼2¼\n\nTRg#M( ym§XKT xlቃcW QÇS ¸µx@L\nLBs# ymBrQ ›Yn#M yRGB nW" },
			n167 = { "L;#L WXt$ L;#l mNbR¼4¼\n¸µx@L¼2¼ L;#l mNbR¼2¼\n\nTRg#M( kF kF ÃlnW mqmÅWM\nkF kF ÃlnW ¸µx@L mqmÅW\nkF kF ÃlnW" },
			n168 = { "¸µx@L l!Q LBs# zmBrQ¼2¼\n›Yn# zRGB ›Yn#¼4¼ ¸µx@L /mL¥l\nwRQ¼2¼\n\nTRg#M( xlቃ yçnW ¸µx@L LBs#mBrQ nW ›Yñc$M yRGB ›YN YmS§l# ¸µx@L ywRQ /mL¥L nW" },
			n169 = { "¸µx@L x¥LdN kxM§µCN¼2¼\nXNÄN-Í XNÄNäT bnFúCN¼4¼" },
			n170 = { "qêMÃN lnFúT XÑNt$ l!ቃÂT\n;#ራx@L w„Íx@L\nYTØnW lú?L¼2¼ XM ~b L;#L\nlnFúT yöÑ Xnz!H m§XKT\n;#ራx@LÂ „Íx@L\nkL;#L zND lYQR¬¼2¼ Y§µl# kL;#L¼2¼" },
			n171 = { "xM§k X|ራx@L ¬¥\" g@¬CN\nlX|ራx@L lÑs@ yçNkW mD~N\nfRâN b![Â bT:b!T b!gN\nlX|ራx@L xRb¾ mr_kW Ñs@N\n	x¥§J nW ¸µx@L¼2¼ yxM§K ÆlàL\n	lnÑs@ l?Zb XSራx@L\nfRâN XNdgÂ Lb# toAè\nb!kt§cWM õ„N xSkTè\nYmራcW nbR ¸µx@L bÍÂ\nl@l!t$N bBR¦N qn#N bdmÂ\n	xZ½....\nÑs@ XNd¬zzW xnœ bT„N\nXíc$N zrU kflW Æ?„N\nXNd GNB öm Æ?r x@RTራ\nbdrQ xlû X|ራx@L btራ\n	xZ½...." },
			n172 = { "mLxk s§Mn l!qm§XKT ;#ራxL¼2¼\nsxL woLY bXNtExn x:RG olÖtn\nQDm mNb„ lmD`n@›lM\n\nTRg#M( ys§M mLxK QÇS ;#ራx@L\nSl X¾ lMNLN [lÖ¬CNNM\nbmD`n@›lM ðT xúRGLN " },
			n173 = { "XLF xX§ÍT wTXLðT\nQÇúN No#/N m§XKT\nöÑ lxgLGlÖT iNtW bxNDnT\nQÇS¼3¼ xM§K b¥lT\n	x!×R ራ¥ x@rR ym§XKT xgR\n	y¦Y¥ñT yFQR yXMnT MSKR\n	XWnT y¬yB> ym§XKT KBR\nxZ½.....\n	XNAÂ s!L gBRx@L ÆlNbT ï¬\n	bú_Âx@L ngD nbr h#µ¬\n	G¥¹# Xyµd q¶W s!Ãmn¬\nxZ½.....\n	yú_Âx@L M®T XNdxbÆ rGæ\n	¸µx@L tëm bXMnT tdGæ\n	ú_Âx@L wdq oUWN tgæ\nxZ½....\n	QÇúN m§XKT bXMnT yoÂCh#\n	b¬§Q xKBéT s§M XNb§Ch#\n	SGdT zboU XNSgD§Ch#" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);

		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("163. gBRx@L ML;n!")) {
				loadChild(n163);
			} else if (HoldItem.equals("164. sxl# xStM?„ ln")) {
				loadChild(n164);
			} else if (HoldItem.equals("165. Æ?ራNn!")) {
				loadChild(n165);
			} else if (HoldItem.equals("166. WXt$ l!öÑ")) {
				loadChild(n166);
			} else if (HoldItem.equals("167. L;#L WXt$")) {
				loadChild(n167);
			} else if (HoldItem.equals("168. ¸µx@L l!Q")) {
				loadChild(n168);
			} else if (HoldItem.equals("169. ¸µx@L x¥LdN")) {
				loadChild(n169);
			} else if (HoldItem.equals("170. qêMÃN lnFúT")) {
				loadChild(n170);
			} else if (HoldItem.equals("171. xM§k X|ራx@L")) {
				loadChild(n171);
			} else if (HoldItem.equals("172. mLxk s§Mn")) {
				loadChild(n172);
			} else if (HoldItem.equals("173. XLF xX§ÍT")) {
				loadChild(n173);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T111(this, ParentList,
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

	public class T111 extends BaseExpandableListAdapter {

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

		public T111(Activity context, List<String> Items,
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
			// TODO Auto-generated method stub
			if (childPosition == 0 && groupPosition == 0) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/163-Gebriel Melani.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/164-Sealu Astemehru Lene.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/166-Wetu Likomu.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 5) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/169-Michael Amalden.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/170-Kewamiyan Lenefsat.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/171-Amlake Esrael.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/173-Elf Alaft.mp3");
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
