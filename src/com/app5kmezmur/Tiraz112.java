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

public class Tiraz112 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("174. QÇúN mSK„");
		ParentList.add("175. wYb@lÖÑ /#„");
		ParentList.add("176. m\\rt z@¥");
		ParentList.add("177. BR¦Ât ›lM");
		ParentList.add("178. dM w¥Y");
		ParentList.add("179. g!×Rg!S `ÃL");
		ParentList.add("180. ÷kB B„H");
		ParentList.add("181. bBz# xHg#R");
		ParentList.add("182. gBr mNfS QÇS");
		ParentList.add("183. tKl¦Y¥ñT");
		ParentList.add("184. o@Â xLÆs!h#");
		ParentList.add("185. xÆ xb#n");
		ParentList.add("186. ÚDቃNs x!ät$");
		ParentList.add("187. ÚDቃN b#„µN");
		ParentList.add("188. ÷kB B„H gBrmNfS QÇS");
		ParentList.add("189. Tê&Dî dBr l!ÆñS");
		ParentList.add("190. g!×Rg!S bz!ÃC qN");
		ParentList.add("191. XNd xÂNÃ");

	}
	// Assign children list element using string array.

	String[] n174 = { "txM„N ÃÃCh# QÇúN mSK„\nFQ„N cRnt$N l›lM Ng„¼2¼\n	byê? Lb#Â No#? msêTN\n	xb@L Gl_LN lADQ mäTN\n	ñ~M tÂgrW lxNt y¬yHN\n	²ÊN BÒ TtH ngN ¥sBHN\nxZ\n	tÂgR xBR¦M yxM§KN |ራ\n	XNÁT XNdnbR Ãn@ ST-ራ\n	LJHN Ã\\-H FQ„N Gl_LN\n	bXMnT m¬zZN lX¾M xStMrN\nxZ\n	Gl_LN ×s@F XNÁT XNdnbR\n	FTãTN DL n|è l¦Y¥ñT ¥dR\n	kራS tD§ YLQ lwgN mäTN\n	xStMrN Ñs@ FQRÂ AÂTN\nxZ\n	l-§T molY b¥DrG YQR¬\n	xúY XS-!ÍñS yFQRN XWn¬\n	bftÂ B²T XNÄÂmn¬\n	qERöS An# blN LÆCN YbR¬\nxZ" },
			n175 = { "wYb@lÖÑ /#„ wm/„ lzyxMN¼2¼\nwNg@l mNG|t s¥ÃT¼4¼\nb?Yw¬Ch# Sbk# bn#éxCh# kANF xSk\nANF\nb›lM z#¶Ã xÄRs# úTslc$ dmÂ\n-QúCh# XNdwF\n	wNg@l mNG|t s¥ÃT¼2¼\nb`-!xT gmD tYø l¬\\rW\nb›lM ALmT ltê-W\nyXWnt mNgD BR¦n# l-ÍbT\nbh#lNtÂW fN_q$bT\n	wNg@l mNG|t s¥ÃT¼2¼\nyADQ XNjራ b¥ÈT ltራbW\ny?YwTN W` lt-¥W\nqb!i tSÍ bLb# §rbT\nywNg@LN ¥XD xQRb#lT\n	wNg@l mNG|t s¥ÃT¼2¼\nxRD:t wNg@L µHÂT l!ቃWNT\nltL:÷ y-ራCh#\nkXWnt¾W MNu kg@¬ kÆ:l#\ny?YwTN W` y-ÈCh#\n	wNg@l mNG|t s¥ÃT¼2¼\nh#lNtÂCh# YnbB ðdL Yh#N\nbT:²z# ÿÄCh#\n|ራCh# YBራ b›lM XNdš¥\nb?Yw¬Ch# sBµCh#\n	wNg@l mNG|t s¥ÃT¼2¼\n	wYb@lÖÑ /#„ wm/„ lzyxMN¼2¼\n	wNg@l mNG|t s¥ÃT¼4¼" },
			n176 = { "m\\rt z@¥ w-n¼2¼ ÃÊD µHN¼2¼\nÃÊD ¼3¼ ÃÊD µHN _;#m LúN\nTRg#M( yz@¥ m\\rTN ÃÊD jmr\nµHn# ÃÊD xNdbt$ Ã¥r nW" },
			n177 = { "BR¦Ât ›lM ’@_éS wÔWlÖS\nÚDq$ xÆ¬CN¼2¼ gBrmNfS QÇS¼2¼\nymrÈCh# fÈ¶ÃCN xM§µCN\nXNDÂg\" s§MN x¥LÇN X¾N\nkfÈ¶ÃCN¼2¼" },
			n178 = { "dM w¥Y whl!B XMn KúÇ fLfl¼2¼\nîb tkll¼2¼ tkll QÇS g!×Rg!S ¼2¼\n\nTRg#M( QÇS g!×Rg!S bsYF xNgt$N\nbtsyf g!z@ dM W`Â wtT fss " },
			n179 = { "g!×Rg!S `ÃL¼2¼ mStUDL¼2¼\ngÆÊ txMR¼2¼ ÷kb KBR¼4¼\nTRg#M( g!×Rg!S xRb¾ `Yl¾ tUÄY nW\nxSdÂqE txMR y¸\\ራ tUÄY nW" },
			n180 = { "÷kB B„H QÇS ¥RöS z\\rq XM\nXSKNDRÃ\nb@tKRStEÃN zNsMÃ¼2¼\n÷ñÑ xb lsBx GBI wx!T×ùÃ\nbkm ÔWlÖS /êRÃ\n\nTRg#M( kXSKNDRÃ b@t KRStEÃN ytgßý B„H ÷kB yçnW QÇS ¥RöS XNd QÇS ÔýlÖS lx!T×ùÃÂ lGB} sãC xÆT çÂcW " },
			n181 = { "bBz# xHg#R yøRK yg@¬N wNg@L\nÃSt¥RK¼2¼\nyÄ!q$ÂN GBR bKBR yfiMK Bi#: nH\nBi#: nH XS-!ÍñS Bi#: nH " },
			n182 = { "gBrmNfS QÇS y›lM BR¦N ÂcW¼2¼\nY,W lz§lM ÃbራL |ራcW¼2¼" },
			n183 = { "tKl¦Y¥ñT y›lM BR¦N ÂcW¼2¼\nY,W lz§lM ÃbራL |ራcW¼2¼" },
			n184 = { "o@Â xLÆs!h#¼2¼ lgBrmNfS QÇS kmo@Â S/!N¼2¼\nxLÆs!h# z»§T¼2¼ zwrd WStgnT¼2¼\n\nTRg#M( ygBrmNfS QÇS LBúcW\nkgnT XNd wrd nu /R nW " },
			n185 = { "xÆ xb#n¼2¼ mMHRn xÆtKl¦Y¥ñT¼2¼\nXMxX§F ~„Y¼2¼ xÆ¼6¼ xb#n\ntKl¦Y¥ñT¼2¼\nTRg#M( mMHራCN xÆ tKl¦Y¥ñT\nkBz#ãc$ mµkL ytmr_K nH" },
			n186 = { "ÚDቃNs x!ät$ ~b XGz!åÑ ngÇ¼2¼\nbmNG|t s¥Y¼4¼ Yh#ïÑ zfqÇ¼2¼\n\nTRg#M( ÚDቃN xLät$M ngR GN wd\ng@¬cW ÿÇ XRs#M bs¥ÃêE b@t$ ywdÇTN sÈcW" },
			n187 = { "ÚDቃN b#„µN ›lMN NቃCh#\nyKRSèSN flG ytkt§Ch#\nbmNG|t s¥Y X_F nW êUCh#\nsxl# ln xstM?„ ln\nXSm b[lÖt ÚDቃN TD~N\nwx!T¥SN hgR\nqÄ» s¥:T XS-!ÍñS Ä!ÃöN\nwQÇS g!×Rg!S mKBb x¸N\nwx!yl#È wqERöS ?ÉN\n	xZ........\ngBrmNfS QDS zXMxQl@SÃ\nwtKl¦Y¥ñT zx!T×’Ã\nw¥RöS xB zXSKNDRÃ\n	xZ......." },
			n188 = { "÷kB B„H gBrmNfS QÇS z\\rq\nXMxQl@SÃ b@tKRStEÃN zN\\MÃ\n÷ñÑ xb lsBx GBI wx!T×ùÃ\nx¥N gBrmNfS QÇS /êRÃ\n\nTRg#M(b@tKRStEÃN BlN kMN-ራT kxQl@SÃ ywÈ B„H ÷kB nW lGBIÂ lx!T×’Ã sãC xÆT çÂcW bXWnT gBrmNfS QÇS /êRÃ nWÝÝ" },
			n189 = { "ltKl¦Y¥ñT ÚDQ m-n bZ` ?¥Ñ¼2¼\nTê&Dî dBr l!ÆñS gÄÑ¼4¼\nXSm bWSt&¬ tgBr Flst |Uh#\nwxIÑ¼2¼\n	xZ.......\nXMn xDÆራT k#lÖN ztl›lT bSÑ¼2¼\n	xZ......\nx!ys#S KRSèS XNt qdú bdÑ¼2¼\n	xZ......\n\nTRg#M( ÚÇq$ tKl¦Y¥ñT Bz# ?¥M\nytqblÆT y|UWÂ yxIÑ FLsT ytdrgÆT\nbSÑ ktsyÑ xDÆራT b§Y yçnC x!ys#S\nKRSèS bKb#R dÑ yqdúT dBrl!ÆñS\ntKl¦Y¥ñTN ¬msGÂlC" },
			n190 = { "g!×Rg!S bz!ÃC qN kftÂW xNÉR\nSl¦Y¥ñt$ y¬yW MN nbR\n	ÃmnWN xM§K x§WqWM XNÄ!L\n	b|LÈN bgNzB XRs#N lm¹NgL\n	yÇDÃñS uFéC ngR s!Ãs@„bT\n	Lb#ÂW MN xl s!qRB lm|ê:T\nxZ.....\n	SgD Æl#T g!z@ sW l\\ራW MSL	\n	TZ xlW g!×Rg!S yxM§k# ?ÃW ቃL\n	k\\lSt$ dqEQ kÄNx@L Uራ\n	bXúT nbLÆL WS_ txMR s!\\ራ\nxZ.....\n	qERöS x!yl#ÈN kmቃ-L êJè\n	ÃqzqzWN Fl#N W` x_Fè\n	xS¬Wú*L g!×Rg!S ÃNN `ÃL g@¬\n	mSqL m¹kÑN bz!ÃC gÖLgÖ¬\nxZ......\n	’@_éSÂ ÔWlÖS xÆèc$N mSlÖ\n	äTN x¹nf bXMnT tUDlÖ\n	XNDNoÂ bXMnT YHCN ›lM NqN\n	bs¥:t$ ML© xM§K Y-BqN\nxZ......." },
			n191 = { "XNd xÂNÃ XNd x²RÃ XNd ¸úx@L\nx{ÂN X¾N\nx{ÂN X¾N¼2¼ x{ÂN X¾NM bXMn¬CN¼2¼" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("174. QÇúN mSK„")) {
				loadChild(n174);
			} else if (HoldItem.equals("175. wYb@lÖÑ /#„")) {
				loadChild(n175);
			} else if (HoldItem.equals("176. m\\rt z@¥")) {
				loadChild(n176);
			} else if (HoldItem.equals("177. BR¦Ât ›lM")) {
				loadChild(n177);
			} else if (HoldItem.equals("178. dM w¥Y")) {
				loadChild(n178);
			} else if (HoldItem.equals("179. g!×Rg!S `ÃL")) {
				loadChild(n179);
			} else if (HoldItem.equals("180. ÷kB B„H")) {
				loadChild(n180);
			} else if (HoldItem.equals("181. bBz# xHg#R")) {
				loadChild(n181);
			} else if (HoldItem.equals("182. gBr mNfS QÇS")) {
				loadChild(n182);
			} else if (HoldItem.equals("183. tKl¦Y¥ñT")) {
				loadChild(n183);
			} else if (HoldItem.equals("184. o@Â xLÆs!h#")) {
				loadChild(n184);
			} else if (HoldItem.equals("185. xÆ xb#n")) {
				loadChild(n185);
			} else if (HoldItem.equals("186. ÚDቃNs x!ät$")) {
				loadChild(n186);
			} else if (HoldItem.equals("187. ÚDቃN b#„µN")) {
				loadChild(n187);
			} else if (HoldItem.equals("188. ÷kB B„H gBrmNfS QÇS")) {
				loadChild(n188);
			} else if (HoldItem.equals("189. Tê&Dî dBr l!ÆñS")) {
				loadChild(n189);
			} else if (HoldItem.equals("190. g!×Rg!S bz!ÃC qN")) {
				loadChild(n190);
			} else if (HoldItem.equals("191. XNd xÂNÃ")) {
				loadChild(n191);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T112(this, ParentList,
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
		text.setText("በእንተ ቅዱሳን");
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

	public class T112 extends BaseExpandableListAdapter {

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
		public int oneTimeOnly = 0;

		public T112(Activity context, List<String> Items,
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
						+ "/mez/174-Kidusan Meskeru.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/175-Weybelomu Huru.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/176-Meserete Zema.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/177-Birhanate Alem.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/178-Dem Wemay.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 6) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 7) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/182-Gebre Menfes Kidus.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/183-Teklehimanot.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/184-Tsena Albasihu.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/186-Tsadkanise Emotu.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/187-Tsadkan Birukan.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/189-Tewedeso Debre Libanso.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/190-Giyorgis Beziach Ken.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
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
