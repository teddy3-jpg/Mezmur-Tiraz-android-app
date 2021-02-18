package com.app5kmezmur;

import com.app5kmezmur.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.R.color;
import android.R.drawable;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
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
import android.widget.SeekBar;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ListView;

public class Yemesqel1 extends Activity {
	Button button4, button5;
	View lay;
	CheckBox ch;
	MediaPlayer mp = new MediaPlayer();
	Integer id[];
	List<String> ChildList;
	int lastexpandedpos = -1;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("1. መስቀሉሰ");
		ParentList.add("2. ቤተ ክርስቲያን ርእየቶ ");
		ParentList.add("3. መድኀኒት ");
		ParentList.add("4. ዝንቱ መስቀል");
		ParentList.add("5. እንተ ተሐንጸት በስሙ");
		ParentList.add("6. ኧኸ በመስቀልከ");
		ParentList.add("7. ዘዕጣን አንጸረ");
		ParentList.add("8. በመስቀልከ ርድአነ");
		ParentList.add("9. ርእዩ ዕበዮ");
		ParentList.add("10. ኀበ ቀራንዮ");
		ParentList.add("11. ይቤሎሙ ኢየሱስ");
		ParentList.add("12. መርሕ ለፍኖት");
		ParentList.add("13. መስቀል ብርሃን");
		ParentList.add("14. ይትቀደስ ስምከ");
		ParentList.add("15. እሌኒ ንግሥት");
		ParentList.add("16. በወንጌሉ ያመናችሁ");
		ParentList.add("17. መስቀል ኃይልነ");
		ParentList.add("18. ዮምሰ ለእሊአየ");
		ParentList.add("19. በመስቀሉ ቤዘወነ");
		ParentList.add("20. ብርሃን ወጣ");
		ParentList.add("21. ወሪዶ እምመስቀሉ");
		ParentList.add("22. በመስቀሉ ወበቃሉ");
		ParentList.add("23. ጥልን በመስቀሉ ገደለ");
		ParentList.add("24. በኃይለ መስቀሉ");
		ParentList.add("25. መስቀል ቤዛ ብዙኃን");
		ParentList.add("26. ዮም በዓለ መስቀሉ");
		ParentList.add("27. ትቤሎ እሌኒ");
		ParentList.add("28. ሀብሩ ቃለ");
		ParentList.add("29. መስቀል አብርሃ");
		ParentList.add("30. ጸጋ ነሳዕነ");
		ParentList.add("31. ብከ ንወግኦሙ");
		ParentList.add("32. ባርክ ለነ");
		ParentList.add("33. ኃይልነ ወጸወንነ");
		ParentList.add("34. ለዕፀ መስቀል");
		ParentList.add("35. መስቀልከ(ዕፀ መድኃኒት)");
		ParentList.add("36. ዝንቱ መስቀል");
		ParentList.add("37. ዮም መስቀል");
		ParentList.add("38. ወበእንተዝ");
		ParentList.add("39. መስቀልከ(ይኩነነ ቤዛ)");

	}

	String[] n1 = { "mSql#s lKRSès BR¦N lእl nአMN TBL b@t KRStEÃN ¼2¼\n²Hn# ለÆ?R wmRî lxሕ¥R ZNt$ WXt$ mስqL ¼2¼\n\nTRg#MÝ( yKRSèS mSqL lMÂMን sãC BR¦N nW mSqL yÆ?R ]_¬W የመርከቦች ወደብ nW T§lC b@t KRStEÃN " },
			n2 = { "ቤተ ክርስቲያን ርእይቶ Qንw lzበ¯L¯¬ dÑ tK:w¼2¼\nkm XGr ]/Y |n# ^tw በዓለ መስቀል ዘዮም ትገብር ህልወ ¼2¼\n\nTRg#MÝ( b¯L¯¬ dÑ yfssWን xM§K b@t KRStEÃN xyCW dM GÆt$M XNd ]/Y xW¬R ¼ጮራ¼ xb‰ y²ÊW ymSqL b›LM lzl›lM ¬b‰lC" },
			n3 = { "መድኃኒት ዕፀ ሕይወት¼፪¼\nዝንቱ ውእቱ ¼፪¼መስቀል¼፬¼\n\nትርጉም፦ መድኃኒት የሕይወት ተክል ይኽ መስቀል ነው።" },
			n4 = { "ZNt$ mSqL ~BSt ?YwT xFry አውኀz ln dm w¥y አውኀz ln ¼2¼\nkm g@‰ wRQ ጽ„Y ሥRGW bÆHRY mSqL \nnb!é ÃStRኢ §ዕለ Rዕስየ ¼2¼\n\nTRg#MÝ( ይህ መሰቀል የሕይወት ኅብስትን ¼አስገኘልን¼ ደምና ውኃንም አመነጨልን በዕንቁ እንደ ተሸለመ እንደ ንጹሕ የወርቅ አክሊል ¼ዘውድ¼ መስቀል በራሴ ላይ ሆኖ ያበራል፡፡ ¼ሥጋውን ደሙን በመስቀል ተሰቅሎ እንደሰጠን ለመናገር ነው¼" },
			n5 = { "XNt tሐNፀT bSÑ wtqdsT bdÑ b@tKRStEÃN ¼2¼\nwtxTበT bዕፀ mSql# Xስm ኃYl XGz!xB/@R §:l@ሃ ¼2¼\n\nTRg#MÝ( በስሙ የታነፀች ¼ያመነች¼ በደሙም የተቀደሰች ¼የከበረች¼ በመስቀሉም የታተመች ቤተ ክርስቲያን ¼ምXመን¼ የእግዚአብሔር ኃይል በራሷ ላይ አለ፡፡" },
			n6 = { "%< bmSqLk %< {Lmt xB‰Hk\n%, bmSqLk %ኸ Ñ¬n xNœXk   ¼2¼\nX, ወዘተኃጉለ rÄXk bmSqLk¼2¼\n\nTRg#MÝ( በmሰቀልህ ጨለማን አበራሀ ሙታንንም አነœሀ የጠፋውንM በመስቀልህ ረዳኸው¼አዳን,ው¼" },
			n7 = { "ዘዕጣን አንጸረ¼4¼\nb¯L¯¬ trKb :] mSqL ¼4¼ \n\nTRg#MÝ( ዕጣኑ አመለከተ መSቀሉ በጎልጎታ ተገኘ፡፡" },
			n8 = { "በመስቀልከ ርድአነ¼፪¼\nወበኃይልከ ተማህፀነ¼፬¼\n\nትርጉም፦ በመስቀልህ እርዳን በኃይልህም ጠብቀን።" },
			n9 = { "ርእዩ ዕበዮ ለቅዱስ ዕፀ መስቀል ¼፪¼\nዕውራን ይሬእዩ ወጽሙማን ይሰምዑ እለ ለምጽ  \nይነጽሑ እለ መጽኡ ኀቤሁ ¼፪¼\nኑ እዩ የመስቀሉን ተአምራት ¼፪¼\nእውሮች ያያሉ ደንቆሮዎች ይሰማሉ ለምጻሞችም \nይነጻሉ ወደ እርሱ የመጡ ሁሉ ¼፪¼" },
			n10 = { "~b qራN× dBr mD`n!T¼2¼\nqራN×¼2¼ ~b qራN×¼2¼\nymSql# ቃL lX¾ yXGz!xB/@R `YL nW¼4¼\nl¥ÃMn#T ä\"nT nW lX¾ GN ?YwT nW¼2¼\nXNmsKራlN fÈ¶ÃCN xl¼4¼\nXNmnW xNµdW fÈ¶ÃCN cR nW¼2¼\nXNmsKራlN DNGL x¥§J ÂT¼4¼\nXNmsKራlN ¥RÃM x¥§J ÂT ¼4¼\nXNmÂT xNµÄT yxM§K XÂT ÂT¼2¼\n~b _bÆT ~b LúÂT¼4¼\n×/NS¼2¼ wNg@l SBkT¼2¼" },
			n11 = { "Yb@lÖÑ ኢys#S ለxYh#D Xmn# By ¼2¼\nwXmn# bxb#y xበRህ ¼2¼ bmSqLy ¼2¼\n\n ትርጉምÝ(ጌታ ኢየሱስ አይሁድን በእኔ እመኑ በአባቴ ዕመኑ ላመኑብኝ በመስቀሌ አበራለሁ አላቸው" },
			n12 = { "¦l@ l#Ã mR? lFñT ägîÑ lÚDቃN ägS¼2¼\nZNt$ mSqL lxÄM zxGBå WSt gnT¼2¼\n¦l@ l#Ã m¶ nW bmNgD ägúcW\nlÚDቃN ägS¼2¼\nY, msqL nW xÄMN ymlsW wd gnT¼2¼" },
			n13 = { "mSqL BR¦N kÖ#l# ›lM m\\rt b@tKRStEÃN¼2¼\nwhb@ s§M mD`n@›lM mSqL mD~N lXl nxMN¼2¼\nmSqL BR¦N nW lm§W ›lM m\rT nW lb@tKRStEÃN¼2¼\ns§MN sÀ nW mD`n@›lM mSqL xÄ\" nW l¾ lMÂMN¼2¼" },
			n14 = { "YTqdS SMk b`Yl mSqLk b:i mSqLk\nKb#R zxXbY÷ lSMk¼2¼\nSB/T lk lÆ?tETk L;#L¼4¼" },
			n15 = { "Xl@n! NG|T /\\\\T mSql#¼2¼\n:NÆöM nb!Y zxNkr KB„¼2¼" },
			n16 = { "bwNg@l# ÃmÂCh#¼2¼\nXNµ*N lBR¦n mSql# xdrúCh#¼2¼" },
			n17 = { "mSqL `YLn mSqL ANXn mSqL b@²n¼2¼\nmD`n!Tn lXl xmn¼4¼ " },
			n18 = { "×Ms lXl!xy¼2¼\nxbRH bmSqLü¼2¼" },
			n19 = { "bmSql# b@zwn wbdÑ ts¦ln¼2¼\nxM§k M?rT WXt$ mD`n!n\nxM§k M?rT WXt$\nbmSql# b@² çnN äTN >é käT xÄnN¼2¼\nyM?rT g@¬ nWÂ YQR xlN\nyM?rT g@¬ nWÂ" },
			n20 = { "	BR¦N wÈ kmSql# y¸ÃN[ÆRQ\n	yxM§KÂ ysW LíC XWnt¾ XRQ\n	dS YblN bmSql# BR¦N\n	XLL XNbL bxNDnT çnN\n	tnúLN mD`n!¬CN\nkðT lðT bmúl# ymSql# ngR\ny¸wdW /êRÃ ywNg@L mMHR\n×/NSM SQlt$N b¥yt$\ns!ÃZN ñr bMDራêE ?Ywt$\nb!ÃsQqW ät$ GRÍt$\n	xZ\nä\"nT nW l¸-ûT msÂkÃcW\nb›lM _bB l¸ñ„T XWnT tSኗcW\nl-b!B sW bmNfS l¸ñrW\nymÄN qN XWnt¾ ›R¥ nW\nkghnM XúT y¸ÃDN nW\n	xZ\nXSkmSqL §LtlyW QÇS /êRÃ\nl×/NS ywNg@L sW yFQR ÆläÃ\nMSUÂCN kMDR YDrsW\nXNDÂlN bs-W Múl@W\nsãC h#l# XNktlW" },
			n21 = { "w¶ì XMmSql#¼2¼\nXMmSql# xBR¦ lkÖ#l#\nXMmSql# lk#l# xBRH" },
			n22 = { "bmSql# wbቃl#¼2¼\nx:b×Ñ lxbêEn¼4¼" },
			n23 = { "_LN bmSql# gdl¼2¼\nbmSql# lsW LJ s§MN xdl¼4¼" },
			n24 = { "በኃይለ መስቀሉ¼፪¼ ይዕቀበነ¼፪¼\nበኃይለ መስቀሉ¼፫¼ ይዕቀበነ¼፪¼\n\nትርጉም፦ በመስቀሉ ኃይል ይጠብቀን።" },
			n25 = { "መስቀል ቤዛ ብዙኃን ሕይወተ ኮነ ለኩሉ ዓለም¼2¼ ፍስሐነ ወሰላምነ ለእለ አመነ መሠረተ ቤተክርስቲያን¼2¼\n\nትርጉምÝ(የብዙኃን ቤዛ መስቀል ለዓለም ኹሉ መድኃኒት ኾነ፡፡ለምናምን ደስታችን ሰላማችን የቤተ ክርስቲያን መሠረት ነው፡፡" },
			n26 = { "ዮም በዓለ መስቀሉ በሰማያት በላዕሉ ¼2¼\nወዘነግሠ በምድር ¼2¼ ለአሕዛብ ¼4¼ ኧኸ\n\nትርጉምÝ(ዛሬ በላይ በሰማያት የመሰቀል በዓል ነው¿ \nለአሕዛብም በምድር ነገሠ፡፡" },
			n27 = { "ትቤሎ እሌኒ ለኪራኮስ ንግረኒ አፍጥን ¼፪¼\nኀበ ሀሎ መስቀሉ ለኢየሱስ ¼፪¼ ክርስቶስ ¼፬¼\n\nትርጉም፡ ዕሌኒ ኪራኮስን የኢየሱስ ክርስቶስ መስቀል የት እንዳለ ፈጥነህ  ንገረኝ አለችው፡፡" },
			n28 = { "ሀብሩ ቃለ ነቢያተ ¼፪¼\nወይቤሉ መስቀል ብርሃን ¼፪¼ ለኵሉ ዓለም ¼፪¼\n\nትርጉም፡-ነቢያት መስቀል ለዓለም ሁሉ ብርሃን ነው ብለው በአንድ ቃል  ሆነው  ተናገሩ፡፡" },
			n29 = { "መስቀል አብርሃ በከዋክብት አሰርገወ ኢትዮጵያ¼፪¼\nእምኩሉሰ ፀሐየ አርአየ ዕፀ መስቀል ¼፪¼\n\n ትርጉም፡ መስቀል አበራ ኢትዮጵያንም  በከዋክብት ሸለመ ከሁሉ ይልቅ መስቀል እንደ ፀሐይ ደምቆ/በርቶ/ ታየ፡፡" },
			n30 = { "ጸጋ ነሣዕነ ወሕይወተ ረከብነ በኃይለ\nመስቀሉ ለኢየሱስ ክርስቶስ በኃይለ መስቀሉ ¼፪¼\nኪያከ እግዚኦ ነአኩት ወንሴብሐከ እግዚአብሔር¼፪¼\n\nጸጋን ተቀበልን ሕይወትንም አገኘን በመስቀሉ\nኃይል በኢየሱስ ክርስቶስ በመስቀሉ ኃይል    ¼፪¼\nአቤቱ አንተን¼፪¼ እናመሰግንሃለን እግዚአብሔር¼፪¼" },
			n31 = { "ብከ ንወግዖሙ ለኵሎሙ ፀርነ ¼፪¼ ይቤ ዳዊት በመንፈሰ ትንቢት ¼፪¼\nበእንተ ዝንቱ ዕፀ መስቀል ዘተሰቅለ ዲቤሁ ቃለ አብ ¼፪¼\n\nትርጉም፡ ቅዱስ ዳዊት በትንቢት መንፈስ እንዲህ አለ፣ በአንተ ጠላቶቻችንን እንወጋቸዋለን፤ በዚህ የእግዚአብሔር ቃል ¼ኢየሱስ ክርስቶስ¼ በተሰቀለበት፡፡" },
			n32 = { "ባርክ ለነ እግዚኦ ዘንተ ዓመተ ምሕረትነ\nበብዝኃ ኂሩትከ ለሕዝብከ \nኢትዮጵያ ¼አፍሪቃዊያን¼    ¼፪¼ \nከመ ንግነይ ለስምከ ቅዱስ  \nወከመ ይኩን ንበረተነ በሰላም \nወበዳኅና በዝንቱ ዓመት ¼ዓለም¼         ¼፪¼ \n\nባርክልን አቤቱ ይህንን የምሕረት ዓመታችን\nበቸርነትህ ብዛት ለሕዝቦችህ \nኢትዮጵያን ¼አፍሪቃዊያን¼ 	 	¼፪¼\nእንድንገዛ ለቅዱስ ስምህ\nእንዲሆንልን ኑሮአችን የሰላም \nየደኅና በዚህ ዓመት ¼ዓለም¼            ¼፪¼" },
			n33 = { "`YLn wowNn wägS mägSn¼2¼\nZNt$ WXt$ mSqL¼2¼ " },
			n34 = { "ርእዩ ዕበዮ ለዕፀ መስቀል ¼፪¼\nዘመጠነዝ ¼፪¼ ትርሢተ ክብር ትህትና ወፍቅር ¼፪¼\n\nትርጉም፡ የዕፀ መስቀሉን ክብሩን ትህትናውን ፍቅሩን ሽልማቱን ምን ህል እንደሆነ እዩና አድንቁ ወይም ከፍ ከፍ አድርጉት፡፡" },
			n35 = { "መስቀልከ ኧኸ ዕፅ መድኃኒት¼፪¼\nዕፀ መድኃኒት¼፬¼ መስቀልከ¼፪¼" },
			n36 = { "ዝንቱ መስቀል ረድኤት ወኃይል ¼፪¼\nለእለ ነአምን¼፪¼ መራሔ ሕይወትነ ¼፪¼\n\n ትርጉም፡ ይህ መስቀል ለምናምን ሕይወታችንን የሚመራ ረድኤትና ኃይላችን ነው፡፡" },
			n37 = { "ዮም መስቀል አስተርአየ እለ ማሰነ ፍጥረተ አሠነየ ¼፪¼\nዮም መስቀል ተኬነወ ወዘተጼወወ ሕዝበ በደሙ ቤዘወ ¼፪¼\n\nትርጉም፡ዛሬ መስቀል ተገለጠ የጠፉትን ሰዎች አዳነ ዛሬ መስቀልብልሃተኛ ሆነ ምርኮኞች ወገኖቹንም በክርስቶስ ደም አዳነ፡፡" },
			n38 = { "ወበእንተዝ አዘዙነ መምህራነ ቅዱስ ወንጌል ¼፪¼\nንስግድ ለመስቀል ወለማርያም ድንግል ¼፬¼\nትርጉም፡ ቅዱስ ወንጌልን የሚያስተምሩ መምህራን ለመስቀልና  ለድንግል ማርያም እንድንሰግድ ያዝዙናል፡" },
			n39 = { "mSqLk Yk#nn b@²¼2¼\nYk#nn b@² ¼4¼ mSqLk Yk#nn b@²¼2¼" };
	String[] ByDefalutMessage = { "በመጫን ላይ ነው። እባክዎትን ትንሽ ይጠብቁ!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		setTitle("የመስቀል መዝሙራት");
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1. መስቀሉሰ")) {
				loadChild(n1);
			} else if (HoldItem.equals("2. ቤተ ክርስቲያን ርእየቶ ")) {
				loadChild(n2);
			} else if (HoldItem.equals("3. መድኀኒት ")) {
				loadChild(n3);
			} else if (HoldItem.equals("4. ዝንቱ መስቀል")) {
				loadChild(n4);
			} else if (HoldItem.equals("5. እንተ ተሐንጸት በስሙ")) {
				loadChild(n5);
			} else if (HoldItem.equals("6. ኧኸ በመስቀልከ")) {
				loadChild(n6);
			} else if (HoldItem.equals("7. ዘዕጣን አንጸረ")) {
				loadChild(n7);
			} else if (HoldItem.equals("8. በመስቀልከ ርድአነ")) {
				loadChild(n8);
			} else if (HoldItem.equals("9. ርእዩ ዕበዮ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10. ኀበ ቀራንዮ")) {
				loadChild(n10);
			} else if (HoldItem.equals("11. ይቤሎሙ ኢየሱስ")) {
				loadChild(n11);
			} else if (HoldItem.equals("12. መርሕ ለፍኖት")) {
				loadChild(n12);
			} else if (HoldItem.equals("13. መስቀል ብርሃን")) {
				loadChild(n13);
			} else if (HoldItem.equals("14. ይትቀደስ ስምከ")) {
				loadChild(n14);
			} else if (HoldItem.equals("15. እሌኒ ንግሥት")) {
				loadChild(n15);
			} else if (HoldItem.equals("16. በወንጌሉ ያመናችሁ")) {
				loadChild(n16);
			} else if (HoldItem.equals("17. መስቀል ኃይልነ")) {
				loadChild(n17);
			} else if (HoldItem.equals("18. ዮምሰ ለእሊአየ")) {
				loadChild(n18);
			} else if (HoldItem.equals("19. በመስቀሉ ቤዘወነ")) {
				loadChild(n19);
			} else if (HoldItem.equals("20. ብርሃን ወጣ")) {
				loadChild(n20);
			} else if (HoldItem.equals("21. ወሪዶ እምመስቀሉ")) {
				loadChild(n21);
			} else if (HoldItem.equals("22. በመስቀሉ ወበቃሉ")) {
				loadChild(n22);
			} else if (HoldItem.equals("23. ጥልን በመስቀሉ ገደለ")) {
				loadChild(n23);
			} else if (HoldItem.equals("24. በኃይለ መስቀሉ")) {
				loadChild(n24);
			} else if (HoldItem.equals("25. መስቀል ቤዛ ብዙኃን")) {
				loadChild(n25);
			} else if (HoldItem.equals("26. ዮም በዓለ መስቀሉ")) {
				loadChild(n26);
			} else if (HoldItem.equals("27. ትቤሎ እሌኒ")) {
				loadChild(n27);
			} else if (HoldItem.equals("28. ሀብሩ ቃለ")) {
				loadChild(n28);
			} else if (HoldItem.equals("29. መስቀል አብርሃ")) {
				loadChild(n29);
			} else if (HoldItem.equals("30. ጸጋ ነሳዕነ")) {
				loadChild(n30);
			} else if (HoldItem.equals("31. ብከ ንወግኦሙ")) {
				loadChild(n31);
			} else if (HoldItem.equals("32. ባርክ ለነ")) {
				loadChild(n32);
			} else if (HoldItem.equals("33. ኃይልነ ወጸወንነ")) {
				loadChild(n33);
			} else if (HoldItem.equals("34. ለዕፀ መስቀል")) {
				loadChild(n34);
			} else if (HoldItem.equals("35. መስቀልከ(ዕፀ መድኃኒት)")) {
				loadChild(n35);
			} else if (HoldItem.equals("36. ዝንቱ መስቀል")) {
				loadChild(n36);
			} else if (HoldItem.equals("37. ዮም መስቀል")) {
				loadChild(n37);
			} else if (HoldItem.equals("38. ወበእንተዝ")) {
				loadChild(n38);
			} else if (HoldItem.equals("39. መስቀልከ(ይኩነነ ቤዛ)")) {
				loadChild(n39);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new Mesqel(this,
				ParentList, ParentListItems);
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

	public void setTitle(String title) {
		TextView text = new TextView(this);
		text.setText(title);
		text.setTextSize(14);
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf"));
		text.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text);

	}

	public class Mesqel extends BaseExpandableListAdapter {

		TextView duratio;
		private Activity context;
		Button play, playpause;
		SeekBar seekBar;
		Handler mHandler = new Handler();
		TextView currentduration, totalduration;
		private MediaPlayer mp = new MediaPlayer();
		SeekBar seekbarProgress;
		public int oneTimeOnly = 0;
		private final Handler handler = new Handler();
		private double timeElapsed = 0, finalTime = 0;

		private Map<String, List<String>> ParentListItems;
		private List<String> Items;

		public Mesqel(Activity context, List<String> Items,
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

				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 2) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 3) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 4) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 5) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 6) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 7) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 8) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 10) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 13) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 14) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 15) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 16) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 17) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 18) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 19) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 20) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 21) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 22) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 23) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 25) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 26) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 27) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 28) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 29) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 30) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 31) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 32) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 33) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 34) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 35) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 36) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 37) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 38) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 39) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 40) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 41) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 42) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
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
