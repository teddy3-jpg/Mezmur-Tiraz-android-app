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

public class Tiraz18 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("89. xM§K çY ¥rN");
		ParentList.add("90. xM§K çY wd¾ ÆTmÈ");
		ParentList.add("91. iNtN XN-BQ");
		ParentList.add("92. xND qN xl");
		ParentList.add("93. xb@T yz!ÃN g!z@");

	}
	// Assign children list element using string array.

	String[] n89 = { "XWnt¾W Ng#| lFRD s!mÈ\nÚDq$N l!ÃkBR `_x#N l!qÈ\nmlkT s!nÍ ngÖDÙD s!s¥\nKRSèS s!gl_ b¸ÃSdNQ GR¥\nxM§K çY ¥rN\n¥rN xM§K YQR blN\nynbrW h#l# s!çN XNÄLnbR\ntn|tW s!öÑ Ñ¬N kmቃBR\ni/Y ST=LM s¥ÃTM s!ÃLû\nMDR qW-! STçN q§ÃT s!-û\nxZ\nF_rT s!ÂD s!RD GR¥W XÃSfራW\nyxÄM zR bÑl# s!öM kn|ራW\n¥nW y¸gßW bgÖ MGÆR \\Rè\nQÇúNN mSlÖ b¦Y¥ñT oNè\n	xZ\nbMDራêE ?YwT T„ÍT y\\„\nÚDቃN s!dst$ tGtW s!zM„\n`_xN s!-ÍcW y¸sw„bT\nX¾S kyT YçN yMNg\"bT\n	xZ" },
			n90 = { "xM§K çY wd¾ ÆTmÈ\nlBsH y¥RÃMN |U¼2¼\nÆKñ ynbrW yxÄM LJ\nW-@t$ nbR y¸ÃsU¼2¼\nbz!Ã ›mT bz!ÃC wR bz!ÃC\nqN D~nTN lsW LJ STs_¼2¼\nMN yb² nbR T~TÂH T:G|TH y¥Ylw_¼2¼\nyëH xKl!L dFtW bራSH\ngÖNHN s!wg#H bõR¼2¼\nxNt GN lXnRs# kxÆTH\nM?rTN TlMN nbR¼2¼\nGN mc& xwq$H XnRs# b`-!xT\ndNDñ LÆcW¼2¼\nmD`n!¬cWN grûH sql#H\nxNtM äTK§cW¼2¼\nÄGM STmÈ lFRD k›lM FÉ» bኋ§¼2¼\n%r XNÁT XDl®C ÂcW bðTH y¸Ãgß#\ntD§¼2¼\nbz!ÃC bdBrzYT ï¬ dS¬Â lQî s!fLQ¼2¼\nkè wÁT YçN XÈü ÃNg!z@ yXn@ xwÄdQ¼2¼\nyiiT Xéé bðTH XNÄÃቃ_l\" Xn@N¼2¼\nXRÄ\" fÈ¶ü kxh#n# xDsW y²gW Lb@N¼2¼" },
			n91 = { "km§XKT UR s!gl_ bs¥Y\niNtN XN-BqW KB„N h#l# XNDÂY\nbGR ¥ s!mÈ bxSdNUu h#n@¬\nw×L> nFs@ çY wyW y²N l¬\n	%< M|UÂ YDrSH h#Lg!z@ -êT ¥¬\n	¦l@ ¦l@l#Ã y\\ራêET g@¬¼2¼\ns¥YÂ MDR kðt$ s!¹¹#\nmGb!Ã x_è Yô¦L TLq$M TN¹#\nÚDቃN s!dst$ y`_xN ÍN¬\nçñ -bቃcW lQîÂ êY¬\n	XZ\nSl¥Y¬wQ xM§K xmÈ_H\nb¦Y¥ñT xIÂN tGtN XN-BQH\n-§T XNÄYg²N bXRs# XNÄNr¬\nXGz!xB/@R xDnN h#NLN mk¬\n	xZ " },
			n92 = { "xND qN xl y¸ÃSfራ\nlÚDቃN y¸Ãbራ¼2¼\ng@¬ bz!ÃC qN YmÈL\nbGR¥ YglÈL ¼2¼\nyFRD xêJ Y¬w©L\nnFS h#l# Y=nቃL\n`_xN ÃlQúl#\nbGራH Yö¥l#¼2¼\nQÇS ቃl#N sMtW Ãmn#\nyin# bk!Än# ¼2¼\ntkBrW bqß# Yö¥l#\nk`zN Yswራl#\nm/¶ g@¬ fÈ¶ÃCN\nYDrSH LmÂCN ¼2¼\nbz!ÃC G„M qN XÆKH\nxq$mN bq\"H¼2¼" },
			n93 = { "	xb@T yz!ÃN g!z@ KRSèS s!mÈ\n	TN¹#M TLq$M¼3¼ mDršWN s!ÃÈ\nkM|ራQ kM:ራB ks»N kdb#B\nnÍúT s!§k#¼3¼ m›TN l¥ZnB\ns¥YÂ MDR bxND s!ê/Ç\nyT YçN mDršW¼3¼ yT YçN mNgÇ\n	xZ\nÚDቃN bq\" bk#L `_xN bGራ\ns!nÍ mlkT¼3¼ s!dlQ XNz!ራ\nMDR qW-! STçN xIM s!sbsB\nF_rT YYzêL¼3¼ sW lFRD s!qRB\n	xZ\nŒ,T s!br¬ y¥Y-QM LQî¼2¼\nXNd q$ራ -q$é¼3¼ ILmTN t§Bî\ngnTN s!Ãgß# ÚDቃN b|ራcW\n`_xN wds!åL¼3¼ tfrdÆcW\n	xZ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("89. xM§K çY ¥rN")) {
				loadChild(n89);
			} else if (HoldItem.equals("90. xM§K çY wd¾ ÆTmÈ")) {
				loadChild(n90);
			} else if (HoldItem.equals("91. iNtN XN-BQ")) {
				loadChild(n91);
			} else if (HoldItem.equals("92. xND qN xl")) {
				loadChild(n92);
			} else if (HoldItem.equals("93. xb@T yz!ÃN g!z@")) {
				loadChild(n93);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T18(this, ParentList,
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
		text.setText("በእንተ ምጽአቱ ለእግዚእነ");
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

	public class T18 extends BaseExpandableListAdapter {

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

		public T18(Activity context, List<String> Items,
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
						+ "/mez/Tiraz1/089-Amlak Hoy Maren.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/090-Amlak Hoy Wedegna Batmeta.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/091-Tsenten Entebik.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/092-And Ken Ale.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/093-Abet Yeziyan Gize.mp3");
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
