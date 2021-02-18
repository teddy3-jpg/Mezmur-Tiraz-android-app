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

public class Tiraz35 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("59.	 በምን በምን እንመስላት ");
		ParentList.add("60.	 እመቤቴ ጥላ ከለላዬ");
		ParentList.add("61.	  ከደመና በታች እንዳይቀር ጸሎቴ");
		ParentList.add("62.	 ትውልድ ሁሉ ");
		ParentList.add("63.	 ትብል ማርያም");
		ParentList.add("64.	 በአምሳለ ዖፍ");
		ParentList.add("65.	  ይእቲ እሞሙ ለሰማዕት");
		ParentList.add("66.	  በጽሐ ሠናይ ");
		ParentList.add("67.	  ጽላት ዘሙሴ");
		ParentList.add("68.	 ዘየሀይድ ዓይነ");
		ParentList.add("69.	  እመ ብርሃን");
		ParentList.add("70.	  ለመኑ እነግር ኃዘነ ልብየ");
		ParentList.add("71.	  ሙሴኒ ርዕያ ");
		ParentList.add("72.	 ልዑል ሠምራ");
		ParentList.add("73.	 ኦ ማርያም ");
		ParentList.add("74.	 ኦ ድንግል");
		ParentList.add("75.	 እንዘ ዘልፈ ");
		ParentList.add("76.	 በሰላም ንዒ ");
		ParentList.add("77.	 አስተርእዮ በሰማይ ኮነ ");
		ParentList.add("78.	 ኪዳንኪ ኮነ");
		ParentList.add("79.	 ፀቃውዕ ");
		ParentList.add("80.	 ዕፀ ጳጦስ ዘሲና ");
		ParentList.add("81.	 ክብረ ቅዱሳን");
		ParentList.add("82.	 ዕፀ ጳጦስ ይእቲ");
		ParentList.add("83.	 ንጽሕት ቅድስት ");
		ParentList.add("84.	   ለሳውል ወኬፋ");
		ParentList.add("85.	 ትርሲተ ወልድ ");
		ParentList.add("86.	 የዓለም ንግሥት የሆንሽው");

	}
	// Assign children list element using string array.

	String[] n59 = { "bMN bMN XNmS§T DNGL ¥RÃMN\nMúl@ y§TM¼2.¼ KB…N y¸m_N ¼2¼\n	yÑs@ {§T n> yM?rT ”L k!ÄN\n	yÃ:öB ms§L yxBR¦M DNµ*N\n	yBR¦N mWÅ yñ~ DNQ mRkB\n	ym§XKT XHT y„~„`N RGB ¼2¼\nyslÖäN xKl!L yxéN bTR\ny:Z‰ msNö yg@ÁãN ]MR\nDNGL Xmb@T ÂT yÚD”ñC bR\nçÂ ytgßC yxM§K ¥~dR ¼2¼\n	yQÇúን XÂT y›lም NG|T\n	C§ t¹kmC ml÷T XúT\n	BR¦ን Th#nN =l¥N g§LÈ\n	x¥LÄ ¬SMrN kz!H ›lM ÈÈ ¼2¼\nk¥R YÈfÈL yDNGL m›²\nxM§Kን xQÍlC bh#lT X©* Y²\nዓlÑ h#l# yÄnW bLJ> nWÂ\nXÂ¬CN {×N YDrS> MSUÂ ¼2¼\nxZ((((((((( " },
			n60 = { "Xmb@t& _§ kl§ü rÄt& ygnT Ñ>‰ ¼2¼\nygnT Ñ>‰¼3¼ ¥RÃM yL;#L ¥d¶Ã ¼2¼" },
			n61 = { "kdmÂ b¬C XNÄYqR ጸlÖt&\nxúRg!W ¼2¼ DNGL Xmb@t& ¼4¼" },
			n62 = { "TWLD h#l# B}ዕÂ>N KBR>N h#Lg!z@ ÃdN”l# \nmmk!ÃCN m-g!ÃCN tSÍCN xNcE n> XÃl#¼2¼\nÃgn#šL ÃkB„šL F_r¬T bÑl# ¼4¼" },
			n63 = { "%, TBL ¼3¼ ¥RÃM xêLd x!y„úl@M\nÉx TRxÃ ¼3¼ ^b Ng#ሥKN ¼2¼ mD`n@ ›lM\nxKl!l xStq[Lã Ä!b X} sqLã ¼2¼\n\nTRg#MÝ( ¥RÃM yx!y„úl@M ¼yb@t KRStEÃN¼ LíC çY wd Ng#œCh# wd mD`n@›lM ¬†T zND W-# T§lC yXëH xKl!LN xqÄ°T bXN=TM §YM sql#T XÃlC" },
			n64 = { "bxMúl âF ¼2¼ ]xÄ RGB TmSL ¥RÃM DNGL ¼2¼YXtEk@ dmÂ ql!L ¥RÃM DNGL XÑ lXGz!xB/@R ¼2¼\n\nTRg#MÝ( DNGL ¥RÃM XNd n+ RGB ywF xMúÃ TmS§lC YHcEWM DNGL ¥RÃM fÈ*• dmÂ yXGz!xB/@R XÂT ÂT" },
			n65 = { "YXtE XäÑ ls¥:T wX~èÑ lm§XKT\n”Lk! xÄM Y_:mn! XMxSµl wYN\n\nTRg#MÝ( ys¥:¬T XÂ¬cW ym§XKTM X~¬cW Ã¥r ”L> kwYN FÊ YLQ YÈፍ-¾L" },
			n66 = { "bጽሐ \\Âይ wxL]q zmN ¼2¼ wb›§ lQDST ¥RÃM ¼2¼\nXNt b§:l@ሃ ተመርዓወ ”L xN[!‡ ሥጋሃ ላዕለሃ ኀደረ\n\nTRg#MÝ(  ”L |UêN xN{è ÃdrÆTÂ ytä¹rÆ yQDST ¥RÃM yKBr b›§* zmN wQT bs§M drs gÆÝÝ" },
			n67 = { "{§T zÑs@ :i ጳጦስ ዘs!ና ¼2¼\nጸናጽል ዘውስተ ልብሱ ለአሮን ካህን ¼2¼\n\nትርጉም፡- የሙሴ ጽላት ጳጦስ የተባለች የሲና ዕፅ በካህን አሮን ልብስ የነበረች ጸናጽል እርሷ ነች" },
			n68 = { "ዘየሀይድ ›Yn ¼2¼ Lbs KbR lb!î ÄêEት ¼2¼\nQDm ¬ït ?G ^ly QDm ¬ït ?G ¼2¼\n\nTRg#MÝ( ዳዊት ›YN y¸sWR ¼y¸ÃBrqRQ¼\nLBS lBî b¬ït ?G ¼¬ït {×N¼ ðT zmr" },
			n69 = { "Xm Bር¦N wXm ?YwT ¼2¼\n¥RÃM zbx¥N ¼4¼ %,\n\nTRg#MÝ( yBR¦N XÂT y?YwT bXWnT DNGL ¥RÃM ÂT" },
			n70 = { "ለመኑ XnGR ^zn LBy XNbl@k! ማRÃM XGZXTy ¼2¼\nwF-#n ¼2¼ SM:n! [lÖTy ¼4¼\n\nTRg#MÝ( Xmb@t& ¥RÃM çY yLb@N hzN kxNcE bqR l¥N XnG‰lh# f_n> [lÖt&N S¸ÝÝ" },
			n71 = { "Ñs@n! RXÃ ¼2¼ hgR QDST ¼2¼\nXZ‰n! tÂg‰ ¼2¼ zm‰ ÄêET ¼2¼\n\nTRg#MÝ( Ñs@ ÃÃT :Z‰ ytÂgr§T \nÄêET yzmr§T QDST hgRÝÝ" },
			n72 = { "L;#L ሠM‰ ÄêET zm‰ ¼2¼\nbb@t mQdS twKFê ¼4¼\nL;#L wdÄT ÄêETM zmr§T ¼2¼\nbb@t mQdS tqb§*T ¼4¼" },
			n73 = { "å ¥ርÃM bXNtZ ÂfQrk! wnxByk! ¼2¼\nXSm wlDk! ln mBL› {DQ zbx¥N wSt& ?YwT zbx¥N ¼2¼\n\nTRg#MÝ( ¥RÃM çY Slz!H XNwDšlN kF kFM XÂDRGšlNXWnt¾WN mBL XWnt¾WN  y?YwT መጠጥ wLd>LÂLÂ" },
			n74 = { "å DNGL x÷ bt§H× zLHqE km xêLd\n:B‰WÃN እl ÃgZÍ Kúìን ¼2¼\nx§ bQDSÂ wbN{ሕ Wst b@t mQdS nbRk! \nWst b@t mQdS ¼2¼\n\nTRg#MÝ DNGL çY xNg¬cWN XNd¸ÃgZû y:B‰WÃN s@èC LíC bê² bf²² ÃdG> xYdlM bN{?Â bQDSÂ bb@t mQdS ñR> XN©!ÝÝ" },
			n75 = { "XNz zLf TnBR WSt b@t XGz!xB/@R ¼2¼\nxStRxÃ mLxክ zx!÷n ¼2¼ kmqÄ!Ñ x!÷ነ ¼2¼\n\nTRg#MÝ( bXGz!xB/@R b@T WS_ zwTR STñR XNdðt¾W ÃLçn mL›K tgl-§T" },
			n76 = { "bs§M N›! ¼2¼ ¥ርÃM ¼2¼\nTÂZዘn! ¼2¼ ^zn Lby\nxZ((((((((((\nMSl ¸µx@L ¼2¼ wgBRx@L\nxZ((((((((((\nMSl s#‰ØL ¼2¼ wk!„b@L\nxZ((((((((((\nMSl ;#‰x@L ¼2¼ w„Íx@L\nxZ((((((((((\nMSለ k#lÖÑ 2/ QÇúን\nxZ((((((((((\nMSl wLDk! ¼2¼ x¥n#x@L\nxZ((((((((((¼2¼" },
			n77 = { "/êRÃT h#l# xzn# tkz#\nbSB/T b¥Hl@T |UêN gnz#\n	xStRX× bs¥Y ÷n xStRX×¼2¼\n	bKBR bSB/T m§XKT b‰¥\n	XÃmsg•T b_;#M z@¥\n	y¥TfQ©! DNGL yኃ_xNN äT\n	bx¥§JnT> xöዪN _qET\nyM¬MR RGB slÖäN xl>\n|U>N lmLbS wLD mr->\n	äTNS mäTN lh#l#M YgÆL\n	yDNGL mäT GN bÈM ÃSdN”L\nxZ(((((((¼2¼" },
			n78 = { "k!Äንk! ÷n ¼2¼ k!Än M?rT ¼4¼\nlኃ_xN tSÍn l`_xN b@²n k!ÄNk! ÷n ¼4¼\n\nTRg#MÝ( ”L k!ÄN> yM?rT ”L k!ÄN çn l`_xN tSÍcW çn" },
			n79 = { "]”W: ¼4¼\nYW~Z XMkÂF¶¦ ¼4¼\n\nTRg#MÝ( y¥R wl§ ¼ÈÍ+ ngR¼ kkÂFé– YfSúL ¼kXmb@¬CN" },
			n80 = { ":] ÔõS zs!Â ¥RÃM\nyñ~ DNQ mRkB tSÍW yxÄM\nxM§K ÃSqrLN N{ሕa yxÄM zR\nXÂwDSšlN XNDÂg\" ÆNcE KBR\n	wRQ t¯Âጽf> bL;#L q\" yMTö¸\n	Múl@ yl@l> x²\"ቱ X¾N S¸\nyxb@L yêHnT ys@T cRnT\nys@M b#‰k@W n> yxBR¦M XNGDnT\nyYስ/Q m›² yÃ:öB ms§L\nyxéN µHN LBS ywRቅ [Â{L\n	yúÑx@L ÑÄY yg@ÁãN ]MR\n	yx!Ãs# /WLT yxéN bTR\n	yslÖäN xKl!L yx¸ÂÄB \\rg§\n	yx@Lú: ¥sé y`_xN kl§" },
			n81 = { "ክብረ ቅዱሳን ይእቲ ¼2¼ ማርያም ¼2¼\nሙዳየ መና ግሩም ሙዳየ መና ¼2¼\n\nትርጉም፦ የቅዱሳን ክብር የመና ሙዳይ ማርያም አንቺ ነሽ" },
			n82 = { "ዕፀ ጳጦስ ይእቲ እንተ በአማን ይብልዋ ቅድስt ቅዱሳን ¼2¼\nሰxሊ ለነ ማርያም እም አምላክ አንቀ[ ብርሃን ¼2¼\n\nትርጉም፦ ቅድስt ቅዱሳን የሚሉሽ ዕi ጳጦስ በእውነት አንቺ ነሽ ይሏታል፡፡ ለምኝልን ማርያም የአምላክ እናት የብር¦ን መውጫ " },
			n83 = { "ንጽሕት ቅድስት የተመረጥሽ \nየመንፈስ ኃይል የጸለለሽ \nየእግዚአብሔር ቃል ያደረብሽ\nለእኛ ሕይወት መዲና ነሽ\n	ቅድስት ማርያም ክብርት ነሽ በጣም ¼፫¼\nምልዕተ ፀጋ እናታችን\nልዕልት ነሽ እመቤታችን\nየሕይወት አምባ መጠጊያችን\nየዘለዓለም አለኝታችን\nአዝ.......... \n{~ተ ም|ራቅ የአምላክ መንበር\nየ?ይወት ቤዛ ድንቅ ምስጢር \nየኃጥxን ተስፋ የአምላክ ሀገር \nቅድስት ነሽ የእኛ ክብር\nአዝ............ " },
			n84 = { "lúWL wk@Í ¼4¼\nxKl!lÖÑ ¼2¼ Tk#nn tSÍ ¼4¼\n\nTRg#MÝ( y’@_éSÂ yÔWlÖS xKl!§cW É”ÓM ማርያም tSÍ Th#nNÝÝ" },
			n85 = { "ትርሲተ ወልድ መለኮት ወፍቅር ኃደረ ላዕሌሃ ኃደረ¼2¼\nይቤላ ርግብየ ወይቤላ ሠናይትየ ማርያም ድንግል ¼2¼\n\nTRg#MÝ( ጠቢቡ ሰሎሞን ያማረች ርግብዬ ያላት እመቤታችን ድንግል ማርያም መለኮታዊ የሆነውና ይህንን ዓለም በፍቅሩ የወደደው በእርሷ ላይም ያደረው የወልድ ሽልማት ናት፡፡\n\n* ነሐሴ 16 የሚዘመር" },
			n86 = { "የዓlM NGሥT yçN>W\nDNGL ¥ርÃM XÂt&\n¬mSGN> xNcEN h#L g!z@ ሕYwt&\n¥ርÃM ÆRk!\" Xmb@t& XsGD lk!\nእንዳልንገላታ ጠብቂኝ በኃጢአት ዓለም ጎዳና\ndGäM XNDmgB s¥ÃêE mÂ\n¥ርÃM yxÄM -@Â xsGD lk!\nt>ጬ SñR LJ> በኃጢአት ›lM kt¥\ny¸ÃwÈ\" -Fè yXÂT LJ wNDM\nwÈh#\" bLJ> dM XsGD lk!\nyxNcE mNg§¬T h#l# g!z@ ÃúZÂ¾L s!w‰\n¥RÃM nFs@N xd‰ xsGD lk!" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("59.	 በምን በምን እንመስላት ")) {
				loadChild(n59);
			} else if (HoldItem.equals("60.	 እመቤቴ ጥላ ከለላዬ")) {
				loadChild(n60);
			} else if (HoldItem.equals("61.	  ከደመና በታች እንዳይቀር ጸሎቴ")) {
				loadChild(n61);
			} else if (HoldItem.equals("62.	 ትውልድ ሁሉ ")) {
				loadChild(n62);
			} else if (HoldItem.equals("63.	 ትብል ማርያም")) {
				loadChild(n63);
			} else if (HoldItem.equals("64.	 በአምሳለ ዖፍ")) {
				loadChild(n64);
			} else if (HoldItem.equals("65.	  ይእቲ እሞሙ ለሰማዕት")) {
				loadChild(n65);
			} else if (HoldItem.equals("66.	  በጽሐ ሠናይ ")) {
				loadChild(n66);
			} else if (HoldItem.equals("67.	  ጽላት ዘሙሴ")) {
				loadChild(n67);
			} else if (HoldItem.equals("68.	 ዘየሀይድ ዓይነ")) {
				loadChild(n68);
			} else if (HoldItem.equals("69.	  እመ ብርሃን")) {
				loadChild(n69);
			} else if (HoldItem.equals("70.	  ለመኑ እነግር ኃዘነ ልብየ")) {
				loadChild(n70);
			} else if (HoldItem.equals("71.	  ሙሴኒ ርዕያ ")) {
				loadChild(n71);
			} else if (HoldItem.equals("72.	 ልዑል ሠምራ")) {
				loadChild(n72);
			} else if (HoldItem.equals("73.	 ኦ ማርያም ")) {
				loadChild(n73);
			} else if (HoldItem.equals("74.	 ኦ ድንግል")) {
				loadChild(n74);
			} else if (HoldItem.equals("75.	 እንዘ ዘልፈ ")) {
				loadChild(n75);
			} else if (HoldItem.equals("76.	 በሰላም ንዒ ")) {
				loadChild(n76);
			} else if (HoldItem.equals("77.	 አስተርእዮ በሰማይ ኮነ ")) {
				loadChild(n77);
			} else if (HoldItem.equals("78.	 ኪዳንኪ ኮነ")) {
				loadChild(n78);
			} else if (HoldItem.equals("79.	 ፀቃውዕ ")) {
				loadChild(n79);
			} else if (HoldItem.equals("80.	 ዕፀ ጳጦስ ዘሲና ")) {
				loadChild(n80);
			} else if (HoldItem.equals("81.	 ክብረ ቅዱሳን")) {
				loadChild(n81);
			} else if (HoldItem.equals("82.	 ዕፀ ጳጦስ ይእቲ")) {
				loadChild(n82);
			} else if (HoldItem.equals("83.	 ንጽሕት ቅድስት ")) {
				loadChild(n83);
			} else if (HoldItem.equals("84.	   ለሳውል ወኬፋ")) {
				loadChild(n84);
			} else if (HoldItem.equals("85.	 ትርሲተ ወልድ ")) {
				loadChild(n85);
			} else if (HoldItem.equals("86.	 የዓለም ንግሥት የሆንሽው")) {
				loadChild(n86);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T35(this, ParentList,
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
		text.setText("መዝሙር ዘዘወትር ለድንግል ማርያም");
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

	public static class T35 extends BaseExpandableListAdapter {
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

		public T35(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/059-Bemin bemin enimesilat.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/060-Emebete tila kelelaye.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/061-Kedemena betach endayiker tselote.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/062-Tiwled hulu.wma");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/063-Tibl Maryam.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/064-Beamsale Of.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/065-Yieti Emomu lesemaet.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/066-Betseha Senay.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/067-Tselat zeMuse.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/068-Zeyehayid ayine.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/069- Emebrihane.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/070-Lemenu enegir hazene libye.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/071-Museni reeya.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/072-Leul semra.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/073-O Maryam.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/074-O Dingel.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/075-Enze zelfe-Diff.mp3");
							} else if (childPosition == 0
									&& groupPosition == 17) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/076-Beselam Nei.mp3");
							} else if (childPosition == 0
									&& groupPosition == 18) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/077-Astereyo besemay kone.mp3");
							} else if (childPosition == 0
									&& groupPosition == 19) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/078-Kidanki kone.mp3");
							} else if (childPosition == 0
									&& groupPosition == 20) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/079-Tsekawue.mp3");
							} else if (childPosition == 0
									&& groupPosition == 21) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/080-Etsepatos Zesina.mp3");
							} else if (childPosition == 0
									&& groupPosition == 22) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/081-Kibre Kidusan.mp3");
							} else if (childPosition == 0
									&& groupPosition == 23) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/082-Etse Patos yieti.mp3");
							} else if (childPosition == 0
									&& groupPosition == 24) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/083-Netsehet Kidist.mp3");
							} else if (childPosition == 0
									&& groupPosition == 25) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/084-LeSawl weKefa.mp3");
							} else if (childPosition == 0
									&& groupPosition == 26) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/085-Trsite wolde.mp3");
							} else if (childPosition == 0
									&& groupPosition == 26) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/086-Yealem Nigist yehonshiw.mp3");
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