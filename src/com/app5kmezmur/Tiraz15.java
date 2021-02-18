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
import com.app5kmezmur.R;

public class Tiraz15 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("67. ät¦LÂ SlXn@");
		ParentList.add("68. yxBR¦M xM§K");
		ParentList.add("69. Sl¾ BlÖ");
		ParentList.add("70. Ñ¬NN ÃDN zND");
		ParentList.add("71. sql# Msl@h#");
		ParentList.add("72. bg@t& s@¥n");
		ParentList.add("73. g@¬ çY");
		ParentList.add("74. mSK¶ qራN×");
		ParentList.add("75. zxLbSã");
		ParentList.add("76. Xæ sql#k");
		ParentList.add("77. XSm l›lM M?rt$");
		ParentList.add("78. ät SlX¾");
		ParentList.add("79. xznC XÂt$");

	}
	// Assign children list element using string array.

	String[] n67 = { "ät¦LÂ SlXn@ MNM úYñRBH _ÍT\ntksH twQsH bጲ!§õS ðT\nx!ys#S xM§k M?rT SB/T lk\n	yxNt mNg§¬T h#L g!z@ ÃúZn¾L s!wራ\n	bmSqL §Y çnH Ãy<W mkራ\n	x!ys#S y?YwT XNjራ SB/T lk\nkL;#L ï¬ wRdH fÈÊ F-#ራN xM§K\nbsW ðT têRdH Sl sW yäTK\nbmSqL §Y t-¥h# XÃLK SB/T lk\n	m/¶ g@¬ xh#NM XNdcRnTH B²T\n	yX¾N bdL h#l# úTmlkT\n	xDnN kÄGM äT SB/T lk" },
			n68 = { "yxBR¦M xM§K yYS/QM b@²¼2¼\nwgñc$N h#l# bራs# dM g²¼2¼\ny/sT MSKR xq$mW kss#T¼2¼\nbäT XNÄ!qÈ h#l#M frÇbT¼2¼\n’!§õS grfW bsNslT x|é¼2¼\nké¥êEW mNG|T XNÄ!ñR tÆBé¼2¼\nDNGL xLÒlCM XNÆêN LTg¬¼2¼\nXÃyC bmSqL L©* s!Ng§¬¼2¼\nbBR¦N z#ÍN §Y yöÑT XGéc$¼2¼\nbCNµR §Y çnW MNM xLslc$ ¼2¼\nyBR¦N xKl!LN ls¥:T Ãdl¼2¼\nyXëH xKl!L dFè qራN× êl¼2¼" },
			n69 = { "Sl¾ BlÖ LJ> tsQlÖ\nLB> b~zN twGè öSlÖ¼2¼\nkmSql# xWRdWT\n×s@F n!öÄ!äS dGfWT\nÃlqS>W y:NÆ> B²T\nY-BLN yX¾N `-!xT" },
			n70 = { "	Ñ¬NN ÃDN zND yäTäTN >é¼2¼\n	wLd xM§K ÿd wd ኋ§ ¬|é¼2¼\nGR¥N lk!„b@L ÃgÖÂoÍcW\nzWDN ls#ራØL y¸ÃqÄ©cW\nkl»Ä lBî êl kð¬cW\n	xZ\nQÇúN Xíc$ xÄMN y\\„T\nQÇúN XGéc$ bgnT yø„T\ntcNKrW êl# b-Nµራ BrT\n	xZ\nMN bbdl nW MN Ædrg nW ¼2¼\nwLD XNd q¥¾ s!grF yêlW\n	xZ\nxÄM bbdl yGF GF b\\ራ\nc„ wLd xM§K êl bmkራ\n	xZ\nh#l#NM ¬gs h#l#N Òl çDH\nTLq$M TN¹#M s!zÆbTBH" },
			n71 = { "sql# MSl@h# KLx@t fÃt¼2¼by¥n#\nwbiUÑ¼2¼\nwb¥:klÖÑ¼2¼ x!ys#S¼2¼ wb¥:klÖÑ\nx!ys#S¼2¼\n\nTRg#M½ kRs# Uራ xNÇN bqß# xNÇN\nbGራW xDRgW h#lT>FèCN sql#ÝÝ\nx!ys#SNM bm/L " },
			n72 = { "bg@t& s@¥n! bxTKLt$ ï¬¼2¼\nlX¾ s!L g@¬CN b›lM tNg§¬¼2¼\nxÄMÂ /@êN Æ-ûT _ÍT¼2¼\nlX¾M nbrBN yzl›lM äT¼2¼\nmSqL t¹Kä s!wÈ tራራ¼2¼\nYgRûT nbr h#l#M bytራ¼2¼\nDNGL xLÒlCM :NÆêN LTg¬¼2¼\nXÃyC bmSqL L©* s!Ng§¬¼2¼\nbxM§Knt$ úYfRDÆcW ¼2¼\nXNÄ!H s!L [ly xÆT ¥ራcW¼2¼\nbrqEQ |LÈn# h#l#N yf-r¼2¼\nbsãC tgRæ äè tqbr¼2¼\nFQ„N ygloW twLì b|U¼2¼\nx!ys#S g@¬ nW xLÍÂ â»U¼2" },
			n73 = { "g@¬ çY xYh#D x¥AÃN sql#H wY\ny›lM mD`n!T y›lM s!úY sql#H wY¼2¼\nyxÄM bdL xdrsH xNtN lmsqL\ny/@êN SHtT xbቃH läT c„ xÆT¼2¼\nNo#? KRSèS çNK wNjl¾ BlH Sl¾\nmSqL x¹KmW x|rW grûH XÃÄûH¼2¼\nXJÂ XGRH bBrT tm¬ y›lM g@¬\nyXëH xKl!L dFtH gÖNHM twU xLÍ\nâ»U¼2¼\nGBøC XNdራúcW mSlÖxcW\nMራQ Xytû bðTH qlÇ xNtN l!gÖÇ¼2¼\nbmSqL §Y t-¥h# STL ¬§Q bdL\n/äTÂ kRb@ s-#H q§QlW -È BlW¼2¼\nYQR ÆY bd§CNN h#l#N S¬Y\nxNt YQR blN bX¾ úTkÍ XNÄN-Í¼2¼" },
			n74 = { "	mSK¶ qራN× Ng¶N gÖLgÖ¬\n	µœ XNdçnLN XNd xÄnN g@¬\nbxM§Knt$ f_é ›l¥TN\n|UN mê/ÇN sãCN l¥ÄN\nKB„N ZQ xDR¯ b¬§Q T~TÂ\näTN l!Ã-ÍLN ÃyWN ftÂ\n	xZ\nlFRD s!wSÇT l!qbL mkራ\nmSqL t¹Kä s!wÈ tራራ\nxYh#D bytራ s!gRûT s!ÃÄûT\nXNd¬gúcW bF]#M cRnT\n	xZ\nMNM úÃ-Í bdL úYñRbT\nbmSqL XNÄ!äT QÈT tfRìbT\nwd ኋ§ ¬|é tgRæ tmTè\nÃyWN mkራ yëH xKl!L dFè\n	xZ\nbät$ Ñ¬NN kmቃBR -Rè\nbXRs# WRdT KBRN lsW LíC s_è\nb?YwT XNDNñR ÄGM XNÄNäT\nTNœx@N mSbk#N bkbrC sNbT\n	xZ" },
			n75 = { "zxLbSã xYh#D kl»Ä zlY¼2¼\nX< kl»Ä zlY¼2¼ kl»Ä¼2¼\n\nTRg#M½ xYh#D g@¬CNN qY GM© xlbs#T" },
			n76 = { "Xæ sql#k µHÂt Yh#Ä wl@êE ¼2¼\nmD`n@›lM ÂZራêE¼4¼\nmD`n@›lM ÂZራêE¼2¼mD`n@›lM ÂZራêE\n\nTRg#M½ ÂZራêE mD`n@›lM çY\nyYh#dÂ yl@êE µHÂT XNÁT sql#H" },
			n77 = { "	XSm l›lM M?rt$¼2\n	xÃLQM Bz# nW yxM§K cRnt$\nxmSGn#T g@¬N h#§Ch# bxNDnT\nm/¶ nWÂ lsW LíC ?YwT\n	xZ\ny¥YätW äè ytqbrW¼2\nkg¦nM XúT X¾N l!ÃDN nW¼2¼\n	xZ \nk¥RÃM ynœW Ã QÇS |UW\nqራN× s!WL y¸ÃúZN nW\n	xZ\nbf-rW F_rT XJG tsቃYè\nnFúTN xwÈ ks!åL lYè¼2¼\n	xZ " },
			n78 = { "ät SlX¾\nyng|¬T Ng#| y`Ã§N Ä¾\n	ät Sl¾¼2¼\ngÖlgÖ¬ XSk!dRS SቃY tqbl\n|UW tÄkm bmkራ ²l\nbJራF tgRæ dM n-b g§W\n	ät Sl¾¼2¼\n¸µx@L ZM xl tgRä xStêl\ngBRx@L sYûN wd MDR Èl\nkêKBT dNG-W rgû ²Ê\nm§XKT xlqs# qrÂ Z¥Ê\n	ät Sl¾¼2¼\n;#ራx@L xM§k#N bmsqL §Y xy\nbBR¦N {ê dÑN tqbl\n:NÆW x§ömM g@¬W s!Ng§¬\ntgRä xStêl b_ð s!m¬\n	ät Sl¾¼2¼" },
			n79 = { "	xznC¼2¼ XÂt$M =nቃT\n	XÃyCW L©*N bmSqL §Y sQlWT\nX†T tmLkt$T yxM§KN |ራ\nbmsqL §Y çñ l›lM s!Ãbራ\nxYh#D wNbÁãC YzW xsቃ†T\nyëH xKl!L \\RtW b§† dûbT\n	xZ½\nyDNGLN `zN :IêTM xYtW\nÃlQs# jmr kmÊT rGfW\nmC XnRs# BÒ i/YM =lmC\nyg@¬üN XRቃN x§úYM xlC\n	xZ½\nys¥Y kêKBT yxM§KN äT sMtW\nwyW¼2¼xl# kmÊT tdFtW\nd¥Ì =rቃ XRR KSL xlC\nYHNN STs¥ mLµ*N x-örC\n	xZ½\nMDRM xZÂ nbR bÈM tcGራ\ns!gRûT XÃyC jRÆWN bwYራ\nwyW m=kn# ysW LJ tf_é\n’!§õS grfW bsNslT xSé\n	xZ½\n¥RÂ wtt$N y¸mGB g@¬\nx_è tcgr yW` -B¬\n	xZ½" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("67. ät¦LÂ SlXn@")) {
				loadChild(n67);
			} else if (HoldItem.equals("68. yxBR¦M xM§K")) {
				loadChild(n68);
			} else if (HoldItem.equals("69. Sl¾ BlÖ")) {
				loadChild(n69);
			} else if (HoldItem.equals("70. Ñ¬NN ÃDN zND")) {
				loadChild(n70);
			} else if (HoldItem.equals("71. sql# Msl@h#")) {
				loadChild(n71);
			} else if (HoldItem.equals("72. bg@t& s@¥n")) {
				loadChild(n72);
			} else if (HoldItem.equals("73. g@¬ çY")) {
				loadChild(n73);
			} else if (HoldItem.equals("74. mSK¶ qራN×")) {
				loadChild(n74);
			} else if (HoldItem.equals("75. zxLbSã")) {
				loadChild(n75);
			} else if (HoldItem.equals("76. Xæ sql#k")) {
				loadChild(n76);
			} else if (HoldItem.equals("77. XSm l›lM M?rt$")) {
				loadChild(n77);
			} else if (HoldItem.equals("78. ät SlX¾")) {
				loadChild(n78);
			} else if (HoldItem.equals("79. xznC XÂt$")) {
				loadChild(n79);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T15(this, ParentList,
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

	public class T15 extends BaseExpandableListAdapter {

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

		public T15(Activity context, List<String> Items,
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
						+ "/mez/Tiraz1/067-Motehalena Selene.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/068-Yabraham Amlak.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/070-Mutanen Yaden Zend.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/071-Sekeluh Mesleahu.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/073-Geta Hoy.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 8) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/076-Efo Sekeluke.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/077-Esme Lealem Mihretu.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/078-Mote Selegna.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
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
