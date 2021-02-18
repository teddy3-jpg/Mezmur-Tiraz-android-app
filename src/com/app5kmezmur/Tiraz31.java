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

public class Tiraz31 extends Activity {

	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("1. ተነሡ እንዘምር");
		ParentList.add("2. የሕይወቴ መታመኛ");
		ParentList.add("3. ዝማሬ ዳዊትን");
		ParentList.add("4. ኑ እናመስግን");
		ParentList.add("5. ቃልህ ሲነገር ልስማ");
		ParentList.add("6. እልል ደስ ይበለን");
		ParentList.add("7. ንሴብሖ ለእግዚአብሕር");
		ParentList.add("8. ንጉሥ ውእቱ");
		ParentList.add("9. ሠራዊተ መላእክቲሁ");
		ParentList.add("10. እምኵሉ ይኄይስ");
		ParentList.add("11. ታቦተ ሕጉ");
		ParentList.add("12. አልቦ ዘከማየ");
		ParentList.add("13. ድውይ ነን አንተ አድነን");
		ParentList.add("14. ኵሉ ይሰግድ");
		ParentList.add("15. ሰላም ዘአብ");
		ParentList.add("16. ስብሐት ለአብ");
		ParentList.add("17. የቅዱሳን አበው");
		ParentList.add("18. በማስተዋል እንዘምር");
		ParentList.add("19. ይትባረክ");
		ParentList.add("20. የእውነት ብርሃን (አራራይ");

	}
	// Assign children list element using string array.

	String[] n1 = { "tn\\# XNzMR¼2¼\nbxNDnT çnN bXLL¬¼2¼ %, ¼3¼\nMSUÂ bs¥Y MSUÂ bMDR ¼2¼\nለኃÃl# g@¬ lL;#L XGz!xB/@R\nxሥf¶ nW ÃLnW Bz# ngR nbR\nh#l#NM xlFnW XGz!xB/@R YmSgN\nሕዝቦች ደስ ይበለን ?ይወታችን ድኗል\nሰይጣን ጠላታችን አፍሮ ተመልሷል\nሰማይ ዙፋንህ ነው ምድር መረገጫህ\nበዚህም በዚያም ቢሆን በሁለም አንተው ነህ\nበሄድንበት ሁለ ትከተለናለህ\nከዕንቅፋት ከድንጋይ ትሠውረናለህ\nlmLµM |‰H xlBN Wl¬\nl¥YngrW y¥ÄN Sõ¬\nተመሥገን እንበልህ ከጧት እሰከ ማታ\nሌላ ምንም የለም የምንከፍልህ ጌታ\nxM§K çY SMHN BN-‰W BN-‰W\nxL-gB xlN MN¾ ÈÍ+ nW\nአቤት ያንተ ሥራ ያንተ ልግስና\nቢነገር አያልቅም ስምህ ነው ገናና\nmLS XNDÂzUJ èlÖ úN-‰\núl xNdb¬CN MSUÂHN ÃW‰\nምስጋና በሰማይ ምስጋና በምድር\nእሰከ ዘለዓለም ለስምህ እንዘምር" },
			n2 = { "y?Yወt& m¬m¾ ynFs@ tSÍ b@²ü xM§k@\nmD`n@›lM §mSGNH XtUlh# lWÄs@H ¼2¼%,\nm§XKt$ bs¥ÃT QÇS ¼3¼ xNt nH XÃl# \nbKNÍcW x¹B>bW Y-„hL bZ¥ÊÃcW ¼2¼ %,\nQÇS ÄêET bbgÂ bX|‰x@L hgR ¼2¼\nbtmsõ wd xRÃM zLö zmrLH xNtnTHN xWö ¼2¼ %,\n?ÉÂTM xNt” xMnW bxHÃ tqM-H STmÈ ¼2\nxF xW_tW xmsgኑህ çúXÂ bxRÃM xl#¼2¼ %,\nHl@ xl QÇS ÃÊD ጸÂጽL mÌ¸Ã xNSè ¼2¼\nMSUÂHN ከልb# >è bmNfSH ÆNt tmRè ¼2¼ %,\nflg#NM tkTlW µHÂT bÑl# ömW ¼2¼\nYq¾l# lQÇS SMH b¥ኅl@T bmmsg¾H¼2¼ %,\nXSTNÍSM ÃlW h#l# ÃmSGNH xNtN bXWnT ¼2¼\nkLB çñ bN]#? XMnT XNd XZ‰ XNd ÄêET ¼2¼ %," },
			n3 = { "Z¥Ê ÄêETN tL:÷ xRDXTN QÄs@ m§XKTN¼2¼\nytqbLK xM§K ¼4¼ yX¾NM Z¥Ê tqbL ¼2¼" },
			n4 = { "n# XÂmSGN bZ¥Ê bXLL¬\n-§T Ä!ÃBlÖSN bät$ yr¬\nkX¾ UR nWÂ y\\‰êET g@¬\n	=l¥W n#é ySdT QYwT\n	bXGz!xB/@R FQR BRhN b‰bT\nÆRnT qRè nÉnT wÈN\nLmÂCNN XGz!xB/@R s¥N\n	m\\ÂKl#N KûWN ftÂ\n	xLfnW mÈN bxM§K ¯ÄÂ\n	xM§K kX¾ UR Slnbr\n	Ä!ÃBlÖS xFé têRì qr\ny¸ÃS=NqN ²Ê tf¬\nyHZb#N °”v xbs g@¬\nbMHrt$ Sl¯bßN\nxM§µCNN n# XÂmSGN" },
			n5 = { "”LH s!ngR LS¥ g@¬ çY XÆKH ¼2¼\nLb@N KftW ¼4¼ yLDÃN LB XNdkfTkW ¼2¼" },
			n6 = { "XLL XLL dS YblN LmÂCNN xM§K s¥N¼2¼\nXÂmSGnW¼4¼ YgÆêL h#l#N fÉ¸ nW %, ¼3¼" },
			n7 = { "Ns@B‡ ¼2¼ lXGz!xB/@R ¼2¼\nSb#/ ztsB/ ¼4¼\nXÂmSGnW ¼2¼ XGz!xB/@RN ¼2¼\nMSg#N nW ytm\\gn ¼4¼" },
			n8 = { "Ng#| WXt$ Ng#\\ \\§M ¼4¼\nxM§Kn ¼2¼ mD`n@›lM ¼2¼\nNG|T YXtE NG|t s§M ¼4¼\n¥RÃM ¼2¼ k!Än MQrT ¼2¼\n\nTRg#MÝ( xM§µCN mD`n@ ›lM\nyXWnTÂ ys§M Ng#| nW\nyMHrT ”L k!ÄN DNGL ¥RÃM\nys§M NG|T ÂT" },
			n9 = { "ሠራዊተ ¼2¼ መላእክቲሁ ¼2¼ \nኧኸ ለመድኃኔዓለም ¼2¼ ይቀውሙ ¼4¼\n\nTRg#MÝ( የመድኃኔዓለም የመላእክት ሠራዊት በፊቱ ይቆማሉ" },
			n10 = { "XMk¤l# Y^@YS b|§s@k txMñ ¼2¼\nbw§Ä!Tk ¼2¼ wb w§Ä!Tk ተማኅፅኖ ¼2¼\nkh#l#M ¼2¼ |§s@N nW ¥mN ¥mSgN ¼2¼\nwLDN bwldC ¼2¼ DNGL x¥§©CN bXRSê XN¥]N ¼2¼" },
			n11 = { "¬ït ?g# lXGz!xB/@R bµHÂT H}RT \nwbmNfS QÇS KLLT ¼2¼\nNg#ሥk! {×N x!YTmê: l]R ወኢየኀድጋ lhgR¼2¼\ny?G {§t$ ለእግዚአብሔር bµHÂT y¬-rC bmNfS QÇSM ytkllC ¼2¼\nNg#|> {×N xY¹nFM l-§T hg¶t$NM xYtêTM ¼2¼\n\nTRg#MÝ( 1. sÑÝ l{×N lX|‰x@L z|U\n       wRq$Ý {×N b@t(KRStEÃN Ng#|> KRSቶS STftß! b!ÃYM mNG|t s¥ÃTN kmS-T xYtWM\n2. አማናዊት ጽዮን ማ~ደረ መለኮት ድንግል ማርያም ና" },
			n12 = { "xLï zk¥y ¼2¼ xbú `-!xT gÆ¶ ¼2¼\nwxLï zk¥k ¼3¼ XGz!xB/@R m/¶ ¼2¼\nmD`n@ ›lM KRSèS ›l¥t kºl# fÈ¶ ¼2¼\nbdm gïk ¼3¼ `-!xTy xSt|¶ ¼2¼\n\nTRg#MÝ( XNd Xn@ Ãl `-!xTN bdLN y¸\\‰ ylMÝÝ XNd xNtU XGz!xB/@R YQR ÆY ylMÝÝ ›lMN h#l# yf-RK mD`n@ ›lM KRSèS çY k¯NH bfssW dMH `-!xt&N xSt|RY" },
			n13 = { "DWY nN xNt xDnN          ¼2¼\nመጻጉዕን yfwSK bL† |LÈNH  \ny|U b>¬ bxNt XNd tr¬ ¼2¼\nX¾M tYzÂL bnFS b>¬         ¼2¼\nxDnN y\\‰êET g@¬" },
			n14 = { "kºl# YsGD l|§s@ ¼2¼ kºl# YsGD ¼2\nwYTqnY kºl# lmNGሥt |§s@ l|§s@ kºl# YsGD ¼2¼\n\nTRg#MÝ( F_rT h#l# l|§s@ YsGÄL ለሥላሴ መንግሥት ፍጥረት ሁሉ ይገዛልÝÝ" },
			n15 = { "¦l@ l#Ã ¼2¼ s§M zxB wFQR zwLD ሃY¥ñT zmNfS QÇS ¼2¼\nY~DR ¥:kl@KÑ xM§k s§M s§M ¼2¼ የhl# MSl@KÑ\n¦l@ l#Ã ¼2¼ yxB s§M ywLD FQR ሃY¥ñT ymNfS QÇS\nYdR bmµk§Ch# ys§Ñ xM§K s§M ¼2¼ kXÂNt UR Yh#N ¼2¼" },
			n16 = { "	SB/T lxB SB/T lwLD\n	sB/T lmNfS QዱS\nlxBÂ lwLD lmNfS QÇSM\nMSUÂ k¥QrB kè xNwsNM ¼2¼\n²ÊM wd ðTM dGäM lzlዓlM\n	kz!H k¥‰k!W kxS=ÂqEW ›lM\n	y-‰ YDÂL yfÈ¶WN SM ¼2¼\n	bXWnT Ãl hsT Ãl _R_R\nkè mD`n!t$N y¸-§ ylM\nn#éxCN XNÄ!ÃMR xNDn¬CNM ¼2¼\nl!ñrN YgÆL FQRÂ s§M\n	ÃLkWN xSbH XÂNt h#§Ch#\n	h#lT ƒST çÂCh# bS» µ§Ch# ¼2¼\n	Xn@M Xg¾lh# bmµk§Ch#\nxb@t$ xM§K çY XNlMN¦lN\nXNDTg\"LN bmµk§CN ¼2¼\nY,W tg\"tÂL h#lT ƒST çnN" },
			n17 = { "yQÇúN xbW x\\r FñT\ny{DQ xKl!§cW ys¥:¬T\ntê?ì yqÂC ¦Y¥ñT\nxNcE n> ynbR> k_NT\n	¸-T yl@lB> W§-@ ኅድrT\n	TDMRT y¥T‘ t$úÿ FL-T\n	tê?ì yq&RlÖS TMHRT\n	bXWnT N{?T ¦Y¥ñT\nkt‰‰ ÅF §Y yt\\‰C mNdR\nXNÁT YÒ§¬L k\\W LT\\wR\ntê?ì kF kF ÃL> n>\nbXWnT xÒ yl@l>\n	wLd xB wLd ¥RÃM x!ys#S KRSèS\n	Bl> xSt¥¶ q_t¾ mNgD\n	tê?ì XWnt¾ ¦Y¥ñT\n	bXWnT mNgD yD~nT" },
			n18 = { "XGz!xB/@R lMDR h#l# Ng#| nWÂ\nb¥StêL XNzMR XÂQRBለት MSUÂ ¼2¼\n	QÇS ÄêET btmSõ s!zMR\n	búåL §Y zwTR y¸ÃDR\n	Rk#S mNfS YlqW nbR\nQÇS ÔWlÖS bxdÆÆY m\\kr\nbXSR b@TM çñ b¥stêL zmr\nkLB b¥mSgn#ም yw~n!W bR tsbr\n	xStWlÖ የ¸zMR QÇS ÃÊDN xNzNU\n	xL¬wqWM dÑ s!fS bõR XG„ s!wU\n	btmSõ dRú*LÂ ከአልፋና âሜጋ\nkfÈ¶ zND XNÄ!dRS [lÖ¬CN\nb¥StêL እናመስግን yXWnT Yh#N Z¥ÊxCN\nበማSተዋል እንዘምር ከልብ ይሁን ምስጋናችን\nአዝ.................." },
			n19 = { "YTÆrK XGz!xB/@R xM§k X|‰x@L\nzgBr ;b!y wmNKr Æ?tEt$ \nwYትÆrK Sm SብሐቲEh# QÇS \nwYMላ: SB/tEh# k¤lÖ MDr lYk#N lYk#N\n\nTRg#MÝ( yX|‰x@L xM§K XGz!xB/@R YÆrK ¬§Q DNQ |‰ BÒWN y\\‰ QÇS SÑ YÆrK MSUÂW MDRN h#l# YM§ §Y Yh#N Yh#N" },
			n20 = { "BR¦N yXWnT BR¦N =l¥N Ã-Í\nät nFSN yšr KRSèS y›lM tsÍ\nSl ሰW FQR Sl ሰW LJ KBR\nሥUN lBî ሰW çn kxÄM LJ zR\nምን :]#B DNQ nW §sbW\nምን G„M DNQ nW yfÈ¶ |‰W\nXRs# አM§K s!çN y›lM mDኅN\ntqB§*LÂ FÄÂ äTN ›lMN h#l# l¥ÄN" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1. ተነሡ እንዘምር")) {
				loadChild(n1);
			} else if (HoldItem.equals("2. የሕይወቴ መታመኛ")) {
				loadChild(n2);
			} else if (HoldItem.equals("3. ዝማሬ ዳዊትን")) {
				loadChild(n3);
			} else if (HoldItem.equals("4. ኑ እናመስግን")) {
				loadChild(n4);
			} else if (HoldItem.equals("5. ቃልህ ሲነገር ልስማ")) {
				loadChild(n5);
			} else if (HoldItem.equals("6. እልል ደስ ይበለን")) {
				loadChild(n6);
			} else if (HoldItem.equals("7. ንሴብሖ ለእግዚአብሕር")) {
				loadChild(n7);
			} else if (HoldItem.equals("8. ንጉሥ ውእቱ")) {
				loadChild(n8);
			} else if (HoldItem.equals("9. ሠራዊተ መላእክቲሁ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10. እምኵሉ ይኄይስ")) {
				loadChild(n10);
			} else if (HoldItem.equals("11. ታቦተ ሕጉ")) {
				loadChild(n11);
			} else if (HoldItem.equals("12. አልቦ ዘከማየ")) {
				loadChild(n12);
			} else if (HoldItem.equals("13. ድውይ ነን አንተ አድነን")) {
				loadChild(n13);
			} else if (HoldItem.equals("14. ኵሉ ይሰግድ")) {
				loadChild(n14);
			} else if (HoldItem.equals("15. ሰላም ዘአብ")) {
				loadChild(n15);
			} else if (HoldItem.equals("16. ስብሐት ለአብ")) {
				loadChild(n16);
			} else if (HoldItem.equals("17. የቅዱሳን አበው")) {
				loadChild(n17);
			} else if (HoldItem.equals("18. በማስተዋል እንዘምር")) {
				loadChild(n18);
			} else if (HoldItem.equals("19. ይትባረክ")) {
				loadChild(n19);
			} else if (HoldItem.equals("20. የእውነት ብርሃን (አራራይ")) {
				loadChild(n20);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T31(this, ParentList,
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
		text.setText("መዝሙር ዘዘወትር");
		text.setTextSize(14);
		
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),"fonts/gfzemenu.ttf"));
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

	public static class T31 extends BaseExpandableListAdapter {
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

		public T31(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/001-Tenesu Enizemir.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/002-Yehiwote Metamegna.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/003-Zimare Dawitin.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/004-Nu Enamesgin.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/005-Kalih sineger lisma.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/006-Elil des yibelen.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/007-Nisebho leEgziabher.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/008-Nigus wuetu.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/009-Serawite Melaektihu.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/010-Emkulu yiheyis.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/011-Tabote higu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/012-Albo zekemaye.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/013-Dewuy nen Ante adinen.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/014-Kulu yisegid.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/015-Selam zeAb.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/016-Sibhat leAb.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/017-Yekidusan Abew.mp3");
							} else if (childPosition == 0
									&& groupPosition == 17) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/018-Bemastewal Enzemir.mp3");
							} else if (childPosition == 0
									&& groupPosition == 18) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 19) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();

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