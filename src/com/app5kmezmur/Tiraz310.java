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

public class Tiraz310 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("137.	አምላካችን ጾመልን");
		ParentList.add("138.	ዘጾመ ወጸለየ");
		ParentList.add("139.	አምላክ ሆይ ጠብቀኝ ");
		ParentList.add("140.	ልመናዬን ስማኝ ");
		ParentList.add("141.	ተነሡ እንዘምር ");
		ParentList.add("142.	ስምዓኒ እግዚኦ ጸሎትየ ");
		ParentList.add("143.	እንሂድ እንገስግስ  ");
		ParentList.add("144.	አማን በአማን ");
		ParentList.add("145.	ታዛዥህ ልሁን ");
		ParentList.add("146.	አትራቀን ");
		ParentList.add("147.	ደካማ ነኝ እኔ ...አራራይ");
		ParentList.add("148.	በሰማይ የምትኖር አባታችን ");
		ParentList.add("149.	ሃሌ ሉያ ሕያው ሆነህ የምትኖር");
		ParentList.add("150.	እስመ ለዓለም ምሕረቱ");

	}
	// Assign children list element using string array.

	String[] n137 = { "xM§µCN ጾmLN xRÆWN qN ¼2¼\nMœl@WN l!\\-N Mœl@WN ¼4¼" },
			n138 = { "ዘጾm wጸly w\\›l ¼2¼\nXÑn YnYX :s@è ¼4¼\nየጾm yጸly ylmn ¼2¼\nXWnT nW êUWN Yqb§L ¼4¼" },
			n139 = { "xM§K çY -Bq\"\ng@¬ çY -Bq\" k_ÍT xDn\"\nytqdsWN µl|F‰W _ü\nfጽ» úL-Í bMGÆR ¯Sq$ü\nb|Uü DµM nFs@ úTZLB\"\nwd Xn@ tmLkT KNDHN zRUL\"\nxZ((((((((((((((((((((((((((((((((((((\nmNgÄgD bZè XNÄLqR wDq&\nk?ÃW ¥:DH XNÄልÿD Rq&\nxM§k@ Xr¾ü DM{HN xs¥\"\nï¬üN ú§WqW tk#§ XNÄYb§\"\nxZ((((((((((((((((((((((((((((((((((((\nbNS/ W¦ ?Ywt&N xNጽc&\ns§» XNÄ!mlS ”LHN sMc&\nxND xDRg@ Y¢& MGÆR k¦Y¥ñT \nxLÅW ?Ywt& Yh#N ÈÍ+ ?Ywት\nxZ((((((((((((((((((((((((((((((((((((" },
			n140 = { "LmÂüN S¥\" ”l@NM xDM_\nXWnt¾W xM§K s§MHN S_\n	KRStEÃñC h#l# TX²z#N xKB„\n	MSUÂN xQRb# SgÇ zM„\n	yg@¬N xmÈ_ l›lM Ng„\n	dq m²ÑRt$ wNg@L xStM„\nbmLµM y¸ÿD {DQN y¸\\‰\nyfÈ¶WN ስM bkNt$ y¥Y-‰\nY¯b¾L bMDR bs¥†M |F‰\nbq\" YqmÈL kQÇúN UR\n	Sl -§èc& b{DQH M‰\"\n	b_L ”L kbb#\" tslûB\"\n	m/¶ YQR ÆY m-g!Ã h#n\"\n	xNt bcRnT YQR¬N S-\"" },
			n141 = { "tn\\# XNzMR ¼3¼ lxM§K ÆND ”L\nh#§CNM XN©! wND s@T xNbL\ntn\\# XNzMR lxM§K ÆND ”L\nyxM§K MSUÂ MN ÃúFrÂL\nXNµ*NS XRs#Â cW YmsgÂL\nl¸ÃwRDLN ZÂm M?rTN\ndGäM l¸s-N XKl brkTN\nh#l#NM bg!z@W l¸\\-N g@¬\nmzmR xlBN h#§CN bXLL¬" },
			n142 = { "SM›n! XGz!å [lÖTy\nwYBጻ? QD»k g›Ry   ¼2¼\nwx!T¸_ g[k XMn@y\nb:lt MንÄb@y xጽM: XZnk `b@y\nxm :lt X[@W›k F-#n SM›n!    ¼2¼\nxb@t$ S¥\" [lÖt&N\nŒ,t&M YDrS kðTH zND  ¼2¼\nxTmLS ðTHN kXn@ zND\nbmk‰ü qN xDM_ íéHN wd Xn@\nb-‰h#H :lTM bF_nT S¥\"       ¼2¼" },
			n143 = { "	XN£D XNgSGS wd xÆ¬CN\n	-RèÂLÂ RSt$N l!ÃwRsN\n	yzl›lM ?YwT XNÄYqRBN\nhB¬CN b@¬CN YH xYdlMÂ\nXNÙZ wd XRs# bqÂW ¯ÄÂ\n›lMN DL n|tN wd Xs# XNDNÿD\nf_nN XNlfW -Æb#N mNgD\nአዝ............\nbmNgD §Y úlN bmgSgS §Y\nk-§T |R wDqN kxNt XNÄNlY\nxb@t$ g@¬ çY `YLHN S-N\nDL nSè XNÄYg²N i‰CN sYÈN\nአዝ.......................\nbw_mD tYzN መሄጃው ጠፍቶብን\nወድቀን እንዳንቀር እርዳን አምላካችን\nቤታችን ተዘግቶ መግቢያ አጥተን እንዳንቀር\nእንለምንሃለን እንድትለን ይቅር" },
			n144 = { "x¥N bx¥N ¼4¼ \nx¥n#x@L tmSgN\nlz!H FQRH MN LKfLH\n	DBq$N `-!xT xNt BTgL-W\n	YQR Bl,\" ÆT¹ÍFnW\n	XNd sW bqL b!ñRH g@¬\n	lXn@ `-!xTS ylWM ï¬\nbydqE”W `-!xT S\\‰\nSsRQ SbDL xNtN úLf‰\nxNt GN ðTH MNM b!qyM\nbq$È bTR xLgrFk\"M\n	M?rTHN LkH xDn\" ²Ê\n	¬Kè¾LÂ b`-!xT mñÊ\n	›lM b`-!xT XyúbC\"\n	b{DQH dS¬ mñR x”t\"\ny`-!xT g#ø ÈÍ+ b!mSLM\nW-@t$ mRé F]#M xY_MM\nXNd bdl@ S§LkfLk\"\ntmSgN XN©! l@§ MN xl\"" },
			n145 = { "	l”LH yMg² Th#T \\W XNDçN\n	lq¶W ሕYwt& M‰\" mNgDHN\n	ዓlMÂ Wba ¥RkW XNÄYgz#\"\n	g#Lbt&M XNÄYdKM ኃYLHN x¯Â}f\"\núT¯sq$L nFs@ úTZLB\"\n|UüN ¯SmH mNfs@N xQÂL\"\nየዓይኔ BR¦N fø ¥yT tsñ¾L\ny›lM =l¥ ðt&N kLlÖ¾L\nbmSqLH BR¦N k=l¥ xWÈ\"\ng[ M?rTHN f_nH GL_L\"\n	FQRHN xWq& lXn@ ÃlHN\n	f”DHN Lf}M ¬²™H Lh#N\n	h#l# ÆY\\MRL\" XNd Xn@ M®T\n	lb¯ nW LbL lXn@ dኅNnT\n_Ít&N y¥TwD YQR Tl¾lH\nwd xNt XSKmlS T¬gs¾lH\nm/¶ nHÂ xìÂY xÆt&\nkbdl@ xNÚ\" dGäM kኃ-!xt&\nxZ(((((((((((((((((((" },
			n146 = { "xT‰qN XNÄNqR wDqN\nxÆ¬CN çY m/¶ YQR ÆY\nxWÈN kስ”Y\ndµäC nN XÂ\nyጽDq$M ¯ÄÂ -FèብÂLÂ xT‰qN ((((((\nኃ-!x¬CN bZè\nbd§CNM bRKè\nb!ÃSkÍHM kè\nS‰CNN xYtH\nbd§CNN xSbH\nbX¾ tö_tH xT‰qN(((((((\nYQR ÆY nHÂ\ny`_x#N ät$N xTfLGMÂ\nxTtwN X¾N\nbs!âLM _LQ WS_ xTbqlN xT‰qN((((((\nyxBR¦M yYS/Q\nጽD”cWN xSbH\n¥rN XÆKH\nmNUãCH  X¾N\nXNÄNqR -FtN\nበጽድቅህ ¯BßN xT‰qN((((" },
			n147 = { "xb@t$ fÈ¶ y`_xN tSÍ\nXNÄLwDQ dGf\" b›lM XNÄL-Í\ny\\‰êET g@¬ s¥\" Œ,t&N\nbMህrTH ብ²T dMSS bdl@N\n	dµ¥ n\" Xn@ mÙZ ytún\"\n	-§T bz#¶Ãü kï y¸ÃS=Nq\"\n	b?GH lmñR Xn@ xLÒLk#MÂ\n	f¬ß@N ÈLL\" `Yል yxንt nWÂ\nxNtN ¥úzn@ bdl@M b!b²\nÆ¬g\"M kXn@ y{DQ m›²\nbMህrTH B²T xNt YQR bl\"\n|‰üN xTyW Xn@ dµ¥ n\"\n	zwTR xlQúlh# Dµ»N xWq&\n	mñÊ s!s¥\" k”LH XRq&\n	bmNgDH M‰\" ðTHN XNÄY\n	Sl XÂTH BLH kXn@ xTlY" },
			n148 = { "bs¥Y yMTñR xÆ¬CN SMH YqdS YmSgN\nmNGሥTHM TMÈLN f”DHM Yh#N\nbs¥Y XNdçn XNÄ!h#M bMDR\ny:lT XNj‰CNN ²Ê S-N\nybdl#NN YQR XNDNL bd§CNN YQR blN\nYQR bl# YQR XNDTÆl#\ny¸lWN ”L k!ÄNHN xS¬WsH wd ftÂ x¬GÆN\nkKû ngR xDnN kKû sHtT\nÃNt ÂTÂ mNGሥTM ኃYLM KBRM lzl›lM x»N" },
			n149 = { "¦l@ l#Ã ¦l@ l#Ã ህÃW çnH yMTñR\näTN Ã¹nFK b|LÈNH\nKRSèS yX¾ g@¬ lÄêET bXWnT y¥LH\nxb@t$ wÁT nW MሕrTH\nyt‰bC nFS T-Æb”lCÂ ktSÍH\nlSMH MSUÂN b¥QrB\nXWnTHNM b¥\\B \nyሰWN ðT xYtH y¥¬Ä§ \nመ¥l© y¥Tb§\nእWnt¾ Ng#| xNt nHÂ KRSèS" },
			n150 = { "እስመ ለዓለም ምሕረቱ ምን ያደርግልኛል ብከብር\nመልካም ካልሠራሁ ለእግዚአብሔር\nመልካም ሥራ ነበር የሚያገናኘኝ ከፈጣሪዬ ጋር\nእንቢ አለ ልቦናዬ እያደላ ለሥጋዬ እንዳልገናኝ ከጌታዬ\nእባክህ አርመው ልቦናዬን ክፉ መሥራቱን እንዲመንን\nምን ያደርግለታል ቢከብር ነፍሱንስ ቢያከስር\nእስከዚህ ነው ወይ ልፋቱ\nየዚህ ዓለም ሰው በከንቱ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("137.	አምላካችን ጾመልን")) {
				loadChild(n137);
			} else if (HoldItem.equals("138.	ዘጾመ ወጸለየ")) {
				loadChild(n138);
			} else if (HoldItem.equals("139.	አምላክ ሆይ ጠብቀኝ ")) {
				loadChild(n139);
			} else if (HoldItem.equals("140.	ልመናዬን ስማኝ ")) {
				loadChild(n140);
			} else if (HoldItem.equals("141.	ተነሡ እንዘምር ")) {
				loadChild(n141);
			} else if (HoldItem.equals("142.	ስምዓኒ እግዚኦ ጸሎትየ ")) {
				loadChild(n142);
			} else if (HoldItem.equals("143.	እንሂድ እንገስግስ  ")) {
				loadChild(n143);
			} else if (HoldItem.equals("144.	አማን በአማን ")) {
				loadChild(n144);
			} else if (HoldItem.equals("145.	ታዛዥህ ልሁን ")) {
				loadChild(n145);
			} else if (HoldItem.equals("146.	አትራቀን ")) {
				loadChild(n146);
			} else if (HoldItem.equals("147.	ደካማ ነኝ እኔ ...አራራይ")) {
				loadChild(n147);
			} else if (HoldItem.equals("148.	በሰማይ የምትኖር አባታችን ")) {
				loadChild(n148);
			} else if (HoldItem.equals("149.	ሃሌ ሉያ ሕያው ሆነህ የምትኖር")) {
				loadChild(n149);
			} else if (HoldItem.equals("150.	እስመ ለዓለም ምሕረቱ")) {
				loadChild(n150);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T310(this, ParentList,
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
		text.setText("በእንተ ጾም | መዝሙረ ንስሐ");
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

	public class T310 extends BaseExpandableListAdapter {

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

		public T310(Activity context, List<String> Items,
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
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/138-Zetsome wetseleye.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/139-Amalak hoy tebikegn.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/140-Limenayen Simagn.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/141-Tenesu Enzemir.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/142-Sem'ani Egzio tselotye.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/143-Enihid engesgis.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/144-Aman beAman.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/145-Tazazhih lihun.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/146-Atiraken.wma");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/147-Dekama negn ene.wma");
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz3/150-Esme lealem mihretu.mp3");
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
