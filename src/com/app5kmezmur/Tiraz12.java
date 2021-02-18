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

public class Tiraz12 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("44. y›lM mD`n!T");
		ParentList.add("45. yDNGL L:LÂ");
		ParentList.add("46. b÷kB m}x#");
		ParentList.add("47. œR Q-l# \\RìW");
		ParentList.add("48. SB/T lXGz!xB/@R");
		ParentList.add("49. XNÄ!çnN b@²");
		ParentList.add("50. bgÖL skb");
		ParentList.add("51. y_bB sãC m-#");
		ParentList.add("52. Y,W twld");
		ParentList.add("53. lztwLd XMQDST");

	}
	// Assign children list element using string array.

	String[] n44 = { "	y›lM mD`n!T ytwldB>\n	xNcE b@tL/@M ytqdS> n>\nyx¥LKT xM§K Ng#\\ ng|T\n`Ã§N bÑl# y¸sGÇlT\nb=RQ t-QLlÖ t¾ bbrT\n	xZ½\ny_bB sãC bQN húÆcW\nwdxNcE tÙz# ÷kB s!mራcW¼2¼\nxZ½\nltk¬Y TWLD Múl@ lmçN\nsGdW gb„lT wRQ :ÈN kRb@N¼2¼\n	xZ½\ny¸ÃDlW g@¬ XWqT l?ÚÂT\ny¸msgnW bxf m§XKT\nkXNSúT Uራ xdr bbrT\n	xZ½\n|U lBî b!¬Y rqEQ ml÷T\nbxND §Y zm„ sWÂ m§XKT¼2¼" },
			n45 = { "xh#N tgl- yDNGL L:LÂ\nkXRú* twld s¥ÃêE mÂ\nxM§k x¥LKT qÄ¥êE ቃL\nbxNcE §Y xdr ¥RÃM DNGL\nks¥Y wd MDR xB b!mlkT\nMNMx§gßM XNd xNcE N{?T\nm§XKT bs¥Y X~¬CN Yl#šL\nbN{? bDNUl@ XnRs#N mSlšL" },
			n46 = { "b÷kB m};# m};# sBx sgL¼2¼\nlx¥n#x@L¼4¼ YSGÇ lx¥n#x@L¼2¼\n\nTRg#M½ Ý(y_bB sãC b÷kB Xytm„ m-#\nlx¥n#x@L YsGÇ zND " },
			n47 = { "œR Q-l# \\RìW \\Nbl@_ q&-¥W\nbz!ÃC wR bz!ÃC qN lMlM ynbrW\nbXLL¬ zm„ bdS¬ tW-W\ng@¬ mwlÇN yM|ራC sMtW\n	XLL bY b@tL/@M ¦l@ ¦l@ l#Ã\n	yFQR ys§M n>Â gbÃ¼2¼\ny¬dl# Xr®C Ãd„ bTUT\nBR¦N çn§cW b:k#l l@l!T\n_¶ tdR¯lT ks¥Y \\ራêET\nlmmLkT bቃ yg@¬WN LdT\n		xZ½\nXr\"nT TN> ywራÄ GBR\nBlÖ sW bL¥D dNG¯ nbR\nxM§K ymr-W mçn#N Xr¾\nKRSèS s!wlD trÄnW X¾\n	xZ½\nytnb†lT nb!ÃT bÑl#\ng@¬ twld yM|ራC bl#\nsWN bmWdÇ s¥ÃêEW Ng#|\nY,W twld X¾N lmqdS\n	xZ½\ny„Q M|ራQ sãC sBx sgL sMtW\nl!sGÇlT m-# b÷kB tmRtW\n:ÈNÂ kRb@ wRq$NM xm-#\nXNdy|R›t$ XJ mNšN s-#\n	xZ½\nSltwld mD~N y¾ tSÍ\nbdL twgd `-!xTM -Í\n	xZ" },
			n48 = { "SB/T lXGz!xB/@R bs¥ÃT¼2¼\nws§M bMDR |Mrt$ lsBX ¦l@ l#Ã\n¦l@ l#Ã ¼3¼ ¦l@ ¦l@ l#Ã\n\nTRg#MÝ( lXGz!xB/@R bs¥ÃT MSUÂ\nYgÆêL bMDR XRQ tjmrlsW\nG:²n#¼nÉnt$¼ l!s-W" },
			n49 = { "XMs¥ÃT wrd wXM ¥RÃM twLd\ntwLd¼2¼\nkmYk#N b@²¼2¼lkÖ#l# ÉlM wlBs |U\n¥RÃM¼2¼\nks¥ÃT wrd kDNGL ¥RÃM twld¼2¼\nXNÄ!çnN b@²¼2¼l›lÑ h#l# lbs y¥RÃMN |U¼2¼" },
			n50 = { "bgÖL skb bxIRQT t-Bll¼2¼\nb@² k¤l# ›lM¼2¼ ×M twLd¼4¼\nbbrT t¾ b=RQM t-qll¼2¼\ny›lM mD`n!T¼2¼ ²Ê twld¼4¼" },
			n51 = { "s¥YÂ MDR y¥YwSn#T\ntwSñ xynW b-ÆB drT\nz-Â z-ß#N m§XKt$N Tè\nxgßnW ²Ê bbrT t\"è\n	y_bB sãC m-#¼2¼sMtWT bz@Â\n	XÃbራ§cW ÷kB XNd ÍÂ¼2¼\nDNGL Xmb@t& s§M¬ YDrS>\nlxM§K wgñC mmk!ÃcW yçN>\nµNcE twld y›lM mD~N\nk#nn@N x_Fè ADQN l!ÃwRsN\n	xZ...\ng@¬CN s!wlD bb@tL/@M\n/zN tdMSî sfn s§M\nXN=èC xf„ FÊ brkT\nwNøC h#l# çn# ¥RÂ wtT\n	xZ..\nsBx sgL m-# l!sGÇ bÑl#\nyX|ራx@L Ng#| wÁT xl XÃl#\nXJ mNšWN s-#T XNdy|R›t$\n:Èn#N lKHnT wRq$N lmNG|t$\nkRb@WN lät\n	xZ..." },
			n52 = { "	Y,W twld y›lM mD`n!T¼3¼\n	XsY twld y›lM mD`n!T¼3¼\nTNb!T tÂg„ nb!Ãt$ bÑl#\nxM§K qÄ¥êE YwRÄL XÃl#\n	xZ½\nsBxsgL m-# l!sGÇ bÑl#\nyXSራx@L Ng#| têLÄ*L XÃl#\n	xZ½\nsBxsgL m-# XJ mNš YzW\nwRQ XÈN kRb@WN gb„lT sGdW\n	xZ½\n?ÉÂT XN£D kLdt$ b@T\nW` çኗLÂ ¥RÂ wtT\n	xZ½" },
			n53 = { "lztwLd XMQDST DNGL MNtNBlÖ\nÂSt¥SlÖ lmD`n!n\nxRê& gÄMn# xNbú w¸m¼2¼ kራD×N\n\nTRg#M½ kXmb@¬CN ytwldWN MN BlN XN-ራêlNÝÝ mD`n!¬CN x!ys#S KRSèSN bMN\nXNmSlêlN bÇR xNbú nW wYS kራD×N b¸ÆL wF nWÝÝ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("44. y›lM mD`n!T")) {
				loadChild(n44);
			} else if (HoldItem.equals("45. yDNGL L:LÂ")) {
				loadChild(n45);
			} else if (HoldItem.equals("46. b÷kB m}x#")) {
				loadChild(n46);
			} else if (HoldItem.equals("47. œR Q-l# \\RìW")) {
				loadChild(n47);
			} else if (HoldItem.equals("48. SB/T lXGz!xB/@R")) {
				loadChild(n48);
			} else if (HoldItem.equals("49. XNÄ!çnN b@²")) {
				loadChild(n49);
			} else if (HoldItem.equals("50. bgÖL skb")) {
				loadChild(n50);
			} else if (HoldItem.equals("51. y_bB sãC m-#")) {
				loadChild(n51);
			} else if (HoldItem.equals("52. Y,W twld")) {
				loadChild(n52);
			} else if (HoldItem.equals("53. lztwLd XMQDST")) {
				loadChild(n53);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T12(this, ParentList,
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
		text.setText("በእንተ ልደቱ ለእግዚእነ");
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

	public class T12 extends BaseExpandableListAdapter {

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

		private Map<String, List<String>> ParentListItems;
		private List<String> Items;
		private int oneTimeOnly = 0;

		public T12(Activity context, List<String> Items,
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
						+ "/mez/Tiraz1/044-Yealem Medhanit.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/045-Yedingel Lelena.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/046-Bekokeb Metseu.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/047-Sar Ketelu Serdow.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/048-Sebhat Legziabhear.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/049-Endihonen Beza.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/050-Begol Sekebe.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/051-Yetebeb Sewotch Metu.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/052-Yehew Tewelede.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/053-Lezetewelde Emkidit.mp3");
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
