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

public class Tiraz311 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("151.	የድሆች መጠጊያ ");
		ParentList.add("152.	እንኳን ደኅና መጣችሁ ");
		ParentList.add("153.	ወደ ቤተ እግዚአብሔር");
		ParentList.add("154.	ሃሌ ሉያ አንጥላት");
		ParentList.add("155.	ሰማያት ዘመሩ ");

	}
	// Assign children list element using string array.

	String[] n151 = { "yDçC m-g!Ã b@tKRStEÃN ¼2¼\nXnç tdsC LíC> mÈN ¼2¼\n	s§M s§M yzl›lM b@t& ¼2¼  \n	kxNcE xLlYM XSk :lt ät& ..አዝ¼2¼\ns§M §NcE Yh#N b@t KRStEÃN ¼2¼\nbdÑ Ã]Â> x!ys#S mD~N ¼2¼\n	b@t KRStEÃN çY yx¥NÃN XÂT ¼2¼\n	wd xNcE qRbÂL XNDÂg\" ?YwT ¼2¼\nQrb# MXmÂN bxNDnT çÂCh# ¼2.\nXí–N zRG¬ Ltqb§ch#\ntn|¬lCÂ QDST XÂ¬Ch#\nአዝ........." },
			n152 = { "XNµ*N dHÂ mÈch# ¼2¼\nwd Xn@ wd XÂ¬Ch#\nXËN zRGc& S-B”Ch#\n	w§íÒCh#N XND¬kB„\n	xM§µCN mÂg„ ¼2¼\nXNDTf}Ñ T:²z#N\nእMb!t®C ÆlmçN ¼2¼\n	የዕWqT gbÃt®C XNdmçÂCh#\n	MNM g!z@ ÆYñ‰Ch# ¼2¼\nks® XSk ;RB Xy\\‰N\nXN-ÃyQ bsNbT qN ¼2¼\n	XNdz!H X÷ yM§Ch#\n	b@tKRStEÃን n\" XÂ¬Ch# ¼2¼\nSlmÈCh# XÂNT Líc&	\n¬†¾§Ch# tdSc& ¼2¼" },
			n153 = { "wd b@t XGz!xB/@R XN£D s!l#\" ¼2\nXNd ÄêET XNd Ng#\\# tdsTk#\" ¼2\nm§XKT bs¥Y y¸ÃmsGn#H ¼2\nxM§µCN f”DH Yh#N XNzMRLH ¼2\näTN x¹Næ ltnúW g@¬	¼2\nzM„lT tqß#lT bÈ*T b¥¬ ¼2\nbmSqL §Y úl s!wU ¯n#N ¼2\nW¦Â dM xND §Y çñ fssLN ¼2\nbW¦W t-MqN dÑN -_tN\nmNGሥt$N XNDNwRS S§drgN\nSÑ YKbR kF kF YbL yg@¬CN\nSÑ YKbR kF kF YbL yxM§µCN" },
			n154 = { "¦l@ l#Ã xN_§T xN‰”T\nb@t KRStEÃNN xN‰”T\nbdl¾ xÂDRUT\nbwLD Wl#D bKRSèS KRStEÃN\ntBlN yxM§KN LJnT\nXRú* ÂTÂ ÃgßNÆT\n²ÊM bHYwT úlN XRú*W ÂT m-g!ÃCN\n“ሏM bäT g!z@ kz!H ›lM SNlY\nXRú*W ÂT yh#§CN tqÆY" },
			n155 = { "ZÂ¥TM znÑ wNøCM ¯rû ¼2¼\nyxM§KN [U XÃTrfrû ¼2¼\ns¥ÃTም zm„ bL;#L ”l# ¼2¼\nyF_r¬T h#l# mUb! xNt nH XÃl# ¼2¼\ngbÊWM xrs fÈ¶WN xMñ ¼2¼\nzRNM btn bMDR §Y k¯t‰W zGñ ¼2¼\ndmÂTM ›lMN Yø‰l# ¼2¼\nbXGz!xB/@R T:²Z ZÂMN l!ÃDl# ¼2¼\nbLML» têb# :}êT xTKLቱ ¼2¼\nFÊN Ys-# zND xBZtW bg!z@W bwQt$ ¼2¼\nmÊTM kXRš xDRU Wl¬ ¼2¼\ny§b#N ywz#N kflC XNÄzz g@¬ ¼2¼\nDµÑN _rt$N xM§K tmLKè ¼2¼\nXNµ*N FÊ s-W xBZè xDR¯ mè ¼2¼\nZÂMN lzR lLM§» FÊ ¼2¼\nys-N xM§K YmSgN YKbR bZ¥Ê ¼2¼" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("151.	የድሆች መጠጊያ ")) {
				loadChild(n151);
			} else if (HoldItem.equals("152.	እንኳን ደኅና መጣችሁ ")) {
				loadChild(n152);
			} else if (HoldItem.equals("153.	ወደ ቤተ እግዚአብሔር")) {
				loadChild(n153);
			} else if (HoldItem.equals("154.	ሃሌ ሉያ አንጥላት")) {
				loadChild(n154);
			} else if (HoldItem.equals("155.	ሰማያት ዘመሩ ")) {
				loadChild(n155);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T311(this, ParentList,
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
		text.setText("በእንተ ቤተክርስቲያን | በእንተ ክረምት");
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

	public class T311 extends BaseExpandableListAdapter {

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

		public T311(Activity context, List<String> Items,
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
						+ "/mez/Tiraz3/151-Yedihoch metegiya.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/152-Enkuan dehna metachihu.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/153-Wede bete Egziabher.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/154-Hale Luya anitilat.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/155-Semayat zemeru.mp3");
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