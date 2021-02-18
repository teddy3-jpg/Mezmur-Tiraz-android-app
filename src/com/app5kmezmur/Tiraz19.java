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

public class Tiraz19 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("94. i/Yn# NBlk");
		ParentList.add("95. XNbl MGÆR");
		ParentList.add("96. å R~R~t ~l!Â");
		ParentList.add("97. lM\"LN ¥RÃM");
		ParentList.add("98. nY nY");
		ParentList.add("99. XNt bMDR");
		ParentList.add("100. bMDራêE ?YwT");
		ParentList.add("101. k!Än M?rT");
		ParentList.add("102. s§M lk! ¥RÃM");
		ParentList.add("103. bZÂm NA?k!");
		ParentList.add("104. ¥RÃM DNGL");
		ParentList.add("105. ywRQ m\\§L n>");
		ParentList.add("106. ¥RÃM ðdL ÂT");
		ParentList.add("107. /mL¥§êET :I");
		ParentList.add("108. N›! ¥RÃM");
		ParentList.add("109. m\\rt ?YwT");
		ParentList.add("110. A§T");
		ParentList.add("111. DNGL çY S§Nc");
		ParentList.add("112. Yê&DSê");
		ParentList.add("113. RGBü");
		ParentList.add("114. Xmb@t& ¥RÃM");
		ParentList.add("115. yBR¦N mWÅ");
		ParentList.add("116. sxl!ln QDST");
		ParentList.add("117. x!Ãq&M w/Â");
		ParentList.add("118. yx¥n#x@L XÂT");
		ParentList.add("119. xNqi BR¦N");
		ParentList.add("120. ¥~dr ml÷T");
		ParentList.add("121. x²\" XÂ¬CN");
		ParentList.add("122. MKçN ldÂGL");
		ParentList.add("123. XmxM§K Ñ>ራ n>");
		ParentList.add("124. îbs k!ÄNk!");
		ParentList.add("125. ÄG¸T xRÃM");
		ParentList.add("126. xTlYN");
		ParentList.add("127. NA?t No#/N");
		ParentList.add("128. bxÆèC LmÂ");
		ParentList.add("129. x!Ãq&M wlÄ");
		ParentList.add("130. M|ራq M|ራቃT");
		ParentList.add("131. bmn#");
		ParentList.add("132. twLÄlCÂ");
		ParentList.add("133. Xmb@¬CN ¥RÃM");
		ParentList.add("134. lXÂ¬CN QDST");
		ParentList.add("135. Xmb@¬CN");
		ParentList.add("136. ¥RÃM Xmb@t");
		ParentList.add("137. ¥RÃM `zn LïÂ");
		ParentList.add("138. ys!Â /mL¥L");
		ParentList.add("139. Xmb@¬CN lxNc");
		ParentList.add("140. m\\rt ?YwT");
		ParentList.add("141. yX¾ Xmb@T");
		ParentList.add("142. ¥RÃMs");
		ParentList.add("143. s§M lk! XMn A×N");
		ParentList.add("144. ¥RÃM ~zn LïÂ");
		ParentList.add("145. x¥ÂêET k!ÄN");
		ParentList.add("146. DNGL çY");
		ParentList.add("147. yxRÃM NG|T");
	}
	// Assign children list element using string array.

	String[] n94 = { "i/Yn# NBlk¼2¼ wLd ¥RÃM NBlk¼2¼\nbmn# bxMúl mn# ÂSt¥Slk¼4¼\n]/Yn# NBlk! ¼2¼ w§Ä!t ”L NBlk! ¼2¼\nbmn# bxMúl mn# ÂSt¥Slk!¼4¼" },
			n95 = { "XNbl MGÆR Æ?t$ Xm x!YiDQ xn¼2¼\nïn# lkNt$ k!ÄNk! ÷n ïn# lkNt$ k!ÄNk! ÷n¼2¼\nTRg#M½ MNM XNµ* |ራü lz!Ã y¸Ãb” ÆYçN\nmNG|t s¥ÃTN yMwRúT µLçn\nXmb@t& çY ”L k!ÄN> lkNt$ nWNÝÝ" },
			n96 = { "å R~R~t ~l!Â xFQét sBX L¥Ä¼2¼\nlXlg@sÑ¼4¼ TmSL¼3¼XNGÄ¼2¼\n\nTRg#MÝ( sWN ¥FqR L¥Ä* yçn Xmb@TCN\nbyg!z@W ¼wTR¼ xÄ!S TMSL nbR" },
			n97 = { "lM\"LN¼2¼ ¥RÃM lM\"LN¼2¼\nyNi#/N xKl!L¼2¼ yQÇúN BR¦N¼2¼" },
			n98 = { "nY nY ¥RÃM w§Ä!t xM§K\nyÉD”N Xmb@T ym§XKT X~T	¼2¼\nh#§Ch# XmኗT kLB x¥§J ÂTÂ bXWnT\nXÂmSGÂT XÂwDúT x¥§J k!Än M?rT" },
			n99 = { "XNt bMDR |rêE¦ wbs¥Y x:i#qE¦¼2¼\n/rg wYN¼2¼ DNGL /rg wYN¼2¼\n\nTRg#MÝ( Xmb@¬CN |… bMDR QRNÅÐ\nbs¥Y yçn ywYN /rG ÂT" },
			n100 = { "bMDራêE ?YwT¼2¼ bftÂ ï¬¼2¼\n¥RÃM T-BqN Xí”N zRG¬\nDNGL T-BqN Xí”N zRG¬¼2¼" },
			n101 = { "k!Än M?rT Xmb@T\nl›lM h#l# mD`n!T\nQDSt QÇúN BI:T\nxNcE n> lxM§µCN XÂT\ng@¬CN f-r> L† xDRgÖ\nb¸ÃSdNQ M|-!„ ltê?ì\nlL;#L ¥d¶ÃnT ytmr_>\nÃl ?¥M wlD>W DNGL çn>\nXÂTnT DNGLÂ\nxStÆBr> YzšLÂ\nDNGLM XÂTM XmBR¦N\nNA?t No#/N X¾N x¥LJN" },
			n102 = { "s§M lk! ¥RÃM Xm xM§K¼2¼\nwLDk! Yo@Wxk! WSt ?YwT\nwmNG|t KBR ¼2¼\n\nTRg#M½ yxM§K XÂT ¥RÃM s§M XLšlh#\nwd ?YwTÂ KBR wÄlW g@TnT LJ> Y-ራšL" },
			n103 = { "	bZÂm NA?k! /rg wYN ogy¼2¼\n	wé¥N wé¥N¼2¼ wé¥N /êz fry\nlxÄM tSÍ yçN>W ¥RÃM Xmb@t&¼2¼\nx¥L©!\" èlÖ Bl>¼3¼ úL-ÍB> LJ>\nyÄêET msNö n> yx!Ãs#M /WLT¼2¼\nbMN LmSL>¼3¼ wdRM yl>\nXmb@t& _§ü h#\"L\" kl§ü¼2¼\nÃl xNcE ¥N xl\"¼3¼ xlh#>¼H¼ bY\"\n	xZ\nbxNÇ bLJ> t¥Aß@šlh#\nbቃL k!ÄN> t¥Aß@šlh#\nDNGL çY -BqE\" Kû XNÄLÂgR\nkMSUÂ> kbgÖ bStqR\n	xZ\nbxMSt$ `zñC> t¥Iß@šlh#\nbr¦B b_M> t¥Iß@šlh#\nb`zN bSdT> t¥Iß@šlh#\nkLJ> xS¬RqE\" DNGL Büšlh#\n	xZ\nkFQR> xTlY\" dGäM k¦Y¥ñT\n?g#NM -Bq& XNDñR b|R›T\nkl§ü h#\"L\" -BqE\" k-§T\nkz!Ã kÄ!Ãb!lÖS k`-!xT xÆT " },
			n104 = { "¥RÃM ¥RÃM DNGL ¥RÃM¼2¼\nR~R~t ~l!Â¼4¼ ¥RÃM¼2¼" },
			n105 = { "	DNGL ¥RÃM ywRQ ms§L n>\n	ms§L n> ywRQ ms§L n>\n	sWÂ xM§KN ÃgÂß>\nxÆ¬CN Ã:öB bFñt lÖ²¼2¼\nx¹LïT XNQLF t\"è k-@²\nkMDR XSk s¥Y yMTdRS ms§L\nMúl@>N xy ¥RÃM DNGL\n	xZ½\nm§XKT s!w-# s!wRÇ ks¥Y¼2¼\nXNÄy Ã:öB t\"è mNgD §Y\ntSÍ xDRgÖ s!ñR ys§ÑN zmN\nY,W tfom bxNcE bXÂ¬CN\n	xZ½....\nbxNcEÂ bLJ> çnLN s§M¼2¼\nbxNcE tfom yÃ:öB ?LM\nsWÂ m§XKT tlÃYtW s!ñ„\nbLJ> mwlD bxNDnT zm„\n	xZ½...." },
			n106 = { "¥RÃM ðdL ÂT yh#l#M m¥¶Ã¼2¼\nbNA?Â bNA?Â tAÍlCÂ¼4¼" },
			n107 = { "Ñs@ zRXy¼2¼ bdBr s!Â¼2¼\n/mL¥§êET :I /mL¥§êET¼2¼\n\nTRg#MÝ( ylmlmC :I ÂT ylmlmC Ñs@\nÃÃT bdBrs!Â ylmlmC :I ÂT\nylmlmC " },
			n108 = { "MSl wLDk! x¥n#x@L Xm xM§K N›! ¥RÃM\nN›! N›! N›!¼4¼ Xm xM§K N›! ¥RÃM \nMSl ¸µx@L wgBRx@L Xm xM§K N›! ¥RÃM\n	xZ½\nMSl ራg#x@L w„Íx@L Xm xM§K N›!	¥RÃM\n	xZ½\nMSl Ín#x@L wúq$x@L Xm xM§K N›!	¥RÃM\n	xZ½\nMSl s#ራØL wk!„b@L Xm xM§K N›! ¥RÃM\n	xZ½\nMSl wLDk! x¥n#x@L Xm xM§K N›!	¥RÃM" },
			n109 = { "m\\rt ?YwT ¥RÃM w_Nt mD`n!T\nzXMqÄ!Ñ¼2¼\nlwLDk!¼2¼ xMúl dÑ¼2¼\n\nTRg#MÝ( QDm ›lM ynbr mD`n!T k¸ÆL\nytgß> yHYwT m\\rT ¥RÃM xNcE n>\nm\\rTnT>M yLJ> ydÑ Múl@ nWÝÝ" },
			n110 = { "A§T zÑs@ A§T¼2¼ ?G w|R›T¼2¼\nÑs@ kfÈ¶ ytqb§T\nx|Rt$ T:²²T ytÚfÆT\nA§T zÑs@ A§T" },
			n111 = { "	DNGL çY S§NcE nWÂ m/¶\n	x¥L©!\" kxNÇ LJ> kfÈ¶\nSÑN XNÄL-ራ xNdbTM yl\"\nðt$NM XNÄ§Y |ራü xúfr\"\n¬Wö¾L _Ít& Bz# XNdbdLk#\"\nT:²z#N XNdšRk# ?g#N XNdÈSk#\"\nxZ½\nxNt Kb#R mLxK Ldt$N xBú¶\nx¥Ld\" kg@¬ü kfÈ¶\nbðt$ XNÄ§FR yt-ራh# l¬\nXlMnêlh# kxh#n# YQR¬\n	xZ½\nÚDቃN s¥:¬T XÂNt h#§Ch#\nx¥LÇ\" kg@¬ü kxM§µCh#\n	xZ½" },
			n112 = { "Yê&DSê m§XKT¼2¼l¥RÃM ¼2¼\nbWSt Wú-@ mNõ§:T wYBLê\nb/k! ¥RÃM /ÄS† È:ê\n\nTRg#M(bmUr© WS_ m§XKT ¥RÃMN\nÃmsGኗ¬L s§M¬ YgÆšL ¥RÃM xÄ!Sa\nXNïú Y§*¬LÝÝ" },
			n113 = { "	RGBü¼2¼ ¥RÃM XÑ lXGz!Xy\n	bqlmwRQ oxð SMü\n	b›MdBR¦N oxð SMü\n	bqlmwRQ oxð SMü\nytmr_> g@-@ fR-@ >L¥t&\nyKBÊ xKl!L n> ln@ Xmb@t& RGBü\nwdxNcE Xô¦lh# bCGÊ g!z@\nXND¬RqEL\" yLb@N Tµz@ RGBü\n	xZ\ny¥TfR¹! mQdS NI?T xÄራ>\nyml÷T XúT b¥?iN> yÃZ> RGBü\nyD~nt& MKNÃT y?Ywt& ÍÂ\nyCGÊ dራ> R~R~t ~l!Â RGBü\n	xZ\nS-ራ SM>N kÈ*T XSk ¥¬\nf_n> Dr>L\" XNÄLNg§¬ RGBü\nynb!ÃT TNb!T ys¥:¬T xKl!L\nM:ራg olÖT ywRQ ms§L RGBü\n	xZ\nMRk#Z mdgðÃ y¦Y¥ñT bTR\nçn> ytgß> y?YwT ¥~dR RGBy\nmNgÁ =Lä wDq& XNÄLqR\ndGf> xšG¶\" ÃN y`-!xT Æ?R RGBü\n	xZ" },
			n114 = { "Xmb@t& ¥RÃM XlMNšh#\nblQî bêY¬ ðT> wDq&xlh#\nXmb@t& S¸\" XlMNšlh#¼2¼\n`zn@N uNqt&N l¥N XnGራlh#\nCGÊN g#Ät&N l¥N xêÃlh#\nXmb@t& S¸\" t¥Iß@šlh#¼2¼\n`zn#M b²B\" ftÂW kbd\"\nXNdMN LÒlW Xn@ dµ¥ n\"\nyx¥n#x@L XÂT f_n> Dr¹!L\"¼2¼\nbÈM tNgÄgDk# LwDQ nW Xn@\nXm xM§K dGð\" q$¸L\" kgÖn@\nMNM xUR yl\" kxNcE bqR ln@¼2¼" },
			n115 = { "yBR¦N mWÅ y?YwT ms§L\nytnby§T nb!† ?ZQx@L¼2¼\nyslÖäN xKl!L yxéN bTR\nçÂ ytgßC yxM§K ¥~dR¼2¼\nyÄêET msNö yg@ÁãN oMR\nxFR¬LÂlC Ãl wND zR¼2¼\nXSk! XÂmSGÂT XNÄ!H b¥lT\nQDST XÂ¬CN SB?T wb#RKT\nxNqi BR¦N M:ራg ?YwT\nxzK¶ DNGL lLJ> bXWnT\nbd~Â XNÄ!ÃdRsN lmÀW ›mT¼2¼" },
			n116 = { "	sxl!ln QDST XNLšlN¼2¼\n	XNd x@FÊM XNdxÆ¬CN\n	lM\"LN Xmb@¬CN\ntSÍcW n>Â lF_rT ›lM\nXytmk#B> XSkz§lM\n`-!x¬cW tdMSî§cW\nbxNcE olÖT ÄnC ?Yw¬cW\n	xZ\nSM>M |L-#N nW bXGz!xB/@R mNbR\nቃLk!ÄN gÆL> ›lÑN l!MR\nbxNcE olÖT Yt¥mÂl#\n-êT ¥¬ QDST çY Y§l#\n	xZ\n›lM STêUN bM®T SlT\nnFúCN STZL s!kBÄT `-!xT\n=LäBN Gራ s!gÆN\nBR¦ÂCN nY XÂ¬CN\n	xZ\nyLÆCN ~zN XJg#N kBìÂL\n`-!x¬CN bZè möM tSñÂL\nxNd x@Lúb@_ xNdzmD>\ndS xs\"N Ys¥ DMI>\n	xZ" },
			n117 = { "!Ãq&M w/Â XÂT xÆT>\nb@t XGz!xB/@R wSdW S:lT ys-#>\nmÂ ks¥ÃT ywrdL¹\nFo#M DNGL yçN> ¥RÃM xNcE n¹!\nå¼4¼ Xm KRSèS ¥RÃM xNcE n¹!¼2¼" },
			n118 = { "yx¥n#x@L XÂT olyC\nx!T×ùÃN xDÂT g@¬çY xDÂT XÃlC\nyg@¬ü XÂT olyC\nx!T×ùÃN xDÂT g@¬ çY xDÂT XÃlC\nyMwdW ?Zb@ x|ራT ys-,\"\nbr¦B bXR²T MnW tgÖÄB\"\nyFQR r¦B ys§M _¥t$\nMnW mNg§¬T MnW mêtt$\nçÂ t\\R¬lC mNfúêET bxT\nyDNGL x|ራa ቃL ytgÆ§T\n/st$ Q_ft$ Sl¥YS¥¥T\nkXNGÄ!H wgn@ mmlS xlbT" },
			n119 = { "xNqi BR¦N DNGL ¥RÃM¼2¼\ns¥ÃêE z#ÍN ymD`n@›lM\ns¥YÂ MDR y¥YCl#TN\n%r XNdMN ÒL>W ml÷TN\nyXúT mUr© wÁT tUrd\nL;#L b_bb# kxNcE tê/d\ns¥ÃêE Ng#| yktmB>\nyml÷T z#ÍN DNGL xNcE n>\n¸µx@L gBRx@L sGdW zm„L>\n„Íx@L ራg#x@L sGdW zm„L>" },
			n120 = { "¥~dr ml÷T ¼2¼\n¥RÃM XmBz#`N¼4¼\n\nTRg#M(yml÷T ¥d¶Ã yçN¹\nXmb@¬CN ¥RÃM yBz#`N XÂT n>" },
			n121 = { "x²\" XÂ¬CN b@²êEt k¤l#\nSàN l¸-„ xDß!N l¸l#\nyM?rT x¥§J fÈኗ dmÂ\nxYøH LË xlC\" R~R~T ÂTÂ¼2¼\nLb@ Xyxmn¬ bqb!o tSÍ\nmkራ oNèB\" fAä úL-Í\nDNGL B¬nœ\" Xí”N zRG¬\nbML©ê ÄNk#\" xgßh# YQR¬¼2¼\nxÆ ?RÃöS YftN XWqt$\nMn#N YqDœL BlW s!zBt$\nbMSUÂ MS-!R Lb#N yቃßCW\nbBR¦N iÄL b@t&N xbራCW¼2¼\nyLb@N yWS-@N mÂgR fRc&\nZM ÆLk#\" g!z@ xNgt&N dFc&\nMS-!ÊN nGÊ S¥iN bd©*\nlKBR xbቃC\" x¥LÄ kL©*¼2¼" },
			n122 = { "¥RÃM DNGL MKçN ldÂGL\nYXtEk@ b@t MSxL zxStxob# ¬qLL\nlk#l# F_rT TtnBL bxKÂf m§XKT\nTTk@lL\nYXtE t;b! XMk!„b@L wTfdFD XMs#ራØL\n¥RÃM DNGL mmk!ÃcW ydÂGL XRú*M\nX÷ yML© b@T ÂT y¸ÃS=NqWN yM¬qLL\nlF_rT h#l# T¥LÄlC bm§XKT KNæCM\nTUrÄlC XRú* TbLÈlC kk!„b@L dGäM\nTLቃlC ks#ራØL" },
			n123 = { "XmxM§K Ñ>ራ n>\nlቃL ¥d¶Ã lmçN ybቃ> X,¼2¼\nx|ራh#lT ›mT b@tmQdS yñR>\nymmr_ oU kg@¬ Ãgß>\nbxBœ¶W mLxK Xo#B DNQ z@Â\nks¥Y mÈL> xÌRõ dmÂ\nbSDSt¾W wR tL÷ gBRx@L\nb@tmQdS gÆ l!Ãb|ራT lDNGL\nbL† s§M¬ s§M lk! Ãl>\nyKRSèS XÂT bÈM dS YbL>\nm§XKT bs¥Y ÃmsGn#šL\nKBR lxM§K XÂT YDrúT Yl#šL\nb¥~iN> b!ÃDR y\\ራêET g@¬\nlmçN tmr_> yxM§K QÇS ï¬\nyfÈ¶ XÂT mçN>N trDè\ns§M §NcE Yh#N xl> XJ n|è\nkF-#ራN h#l# xNcE TbLÅl>\ngBRx@L tL÷ dS¬N xbsr>\nMN¾ DNQ nW DNGL yxNcE B|ራT\ng@¬N TwL©l> y¸L ቃLN mS¥T\nYh#NL\" Bl> ቃl#N ytqbL>\nDNGL çY XÂt& XJG L† X÷n>" },
			n124 = { "îbs k!ÄNk! MKNÃt D~!N x!hlÖ\nflg XúT wdYN XMxS-m k¤lÖ\nflg XúT wdYN¼2¼ XMxS-m k¤lÖ\n\nTRg#M(ymÄN MKNÃT yçn ቃL k!ÄN>\nÆYñR ñé yXúT ¥:bL h#l#N Æs-m nbRÝÝ" },
			n125 = { "yxÆ ?RÃöS DRún QÄs@W\nyXn xÆ x@FÊMM `Yl olÖ¬cW\n¥RÃM DNGL n> yXMnT ÑÄÃcW\nwYn ?YwT KRSèS ytm§B>\nAê; mD`n!T nWR yl@lB>\ny¥YÒlWN b¥~iN yÒL>\nMN¾ DNQ nW mQdSnT>\n	xZ\nxRØM xLt¾ z#Ín@N TÒlh#\nyÃ:öBN xM§K ¥d¶Ã µ§yh#\nBlÖ yÂfq> ÄêET xÆT>\nx!Ãq&M w/Â gÂ úYwLÇ>\n	xZ\nXNdMN ¬dl# /ÂÂ x!Ãq&M\nyXnRs# ÂTÂ ÄG¸T xRÃM\nb|UêE fቃD l!ÃSgß#> ÃLÒl#\nyXGz!xB/@R Sõ¬ mD`n!t k#l#\n	xZ\nyD~nT MLKT yMXmÂN ›R¥\ntÂU¶ gnT yÚDቃN kt¥\n¥~dr ml÷T yxB ቃL mg¾\ny?YwT W` MNu yxÄM zR mÄ¾\n	xZ" },
			n126 = { "xTlYN ¼2¼ DNGL çY Dr>LN¼2¼\nkÄ!ÃBlÖS XJ xNcE xD\"N\nM?rT kLJ> lM\"LN" },
			n127 = { "NA?t No#/N kêEÂ km¬ïT zìR zs!Â\nWSt b@t mQdS nbrT bDNGLÂ nbrT\ns!úÃ ~BSt mÂ WSt&¦n! St& AÑÂ¼2¼\n\nTRg#M( kN[#/N No#? çÂ bs!Â XNd\nnbrCW ¬ïT bDNGLÂ bb@tmQdS WS_\nñrC MGÆ* ~BSt mÂ m-È*M yi_¬ m-_\nnbRÝÝ" },
			n128 = { "	bxÆèC LmÂ XSk! LlMN>\n	Xn@¥ GBR yl\" lmöM bðT>\n	R¦B>N xúSb! DNGL çY XÆK>\nGBÊN ;Wqêlh# MNM MN ADQ yl\"¼2¼\nW` ÃL¯bßW xÄÍ LBS n\"\nxZ... _M>N\nlB¹@ s!ÃMRB\" ÚDQ XmS§lh#¼2¼\nDNGL çY ¬WqEÃl> WS-@N gÖSq$Ãlh#\n	xZ... LQî>N\nb`-!xt& úlQS kÈ*T XSk¥¬¼2¼\nDNGL çY xTR¹!\" h#\"LN xl\"¬\n	xZ... SdT>N\nµ-È>W Wš ÃN g!z@ t-Mè¼2¼\nXn@M bMGÆÊ xLšLM kè\n	xZ... `zN>N" },
			n129 = { "x!Ãq&M wlÄ x!Ãq&M¼2¼\nÄêET zmÄ x!Ãq&M wlÄ¼4¼\n\nTRg#MÝ(yx!Ãq&M LJ yÄêET zmD ÂT " },
			n130 = { "M|ራq M|ራቃT ÑWI; i/Y¼2¼\nXGZXTy zmÂ ÑÄY¼2¼\nzmÂ ÑÄY ¥RÃM zmÂ ÑÄY ¼4¼\n\nTRg#M( y~BST KR&SèS mg¾ ywRQ mîB\nki/Y mWÅãC h#l# yMTbL_ yi/Y\nmWÅ ¼M|ራQ¼ xNcE n>ÝÝ" },
			n131 = { "bmn# bxMúl mn# xSt¥Slk!¼2¼\nXmb@t& yn@ x¥§J x²\"a å DNGL ML:t WÄs@\n\nTRg#MÝ( ¥N btmslW Múl@ XmSLšlh#\nXmb@t& yn@ x¥§J x²\"a MSUÂN ytm§>\nn>ÝÝ" },
			n132 = { "twLÄlCÂ yg@¬ XÂT yX¾ mD`n!T¼2¼\nXÂmSGÂT XÂwDúT XNWdÄT\nXÂmSGÂT XÂwDúT XRú* ÂT XÂ\nyxÄM ?YwT" },
			n133 = { "Xmb@¬CN ¥RÃM ¥~bራCNN\n-BqELN bML©>\nkmÂFቃN kk¦DÃN k-§T sYÈN sWr>\nXNDT-BqEN bML©>" },
			n134 = { "lXÂ¬CN QDST y›lM R~R~T¼2¼\nXNSgD§T¼2¼ XNSgD¼2¼ bXWnT lxM§K\nXÂT¼2¼" },
			n135 = { "Xmb@¬CN lxNcE XÂqRÆlN MSUÂ\nxNcE ywlD>W KRSèS y›lM mD`n!T çኗLÂ\nMXmÂN Slxwq$ dGnT>N bÑl#\nwd xNcE h#L g!z@ Y¥LÄl#\nkfÈ¶> x¥L©!N XÃl#¼2¼" },
			n136 = { "¥RÃM Xmb@t& yxM§K XÂT\n¥d¶Ã yçN>W z#ÍN lml÷T\nks@èc$ h#l# xNcE n> ytÆrK> ynÉ>\nbXWnT\nkè XNdMN ÒL>W mD`n@›lMN\ns¥YÂ MDR y¥YCl#TN\nDNGL XÂ¬CN lz!H ytmr_>\nlM\"LN l¾ M?rTN kLJ> ¼2¼\n	xZ\nynb!ÃT ägS y/êRÃT\nys¥:¬T xKl!L yÚDቃN XÂT\nyX¾ mmk!ÃCN y`_xN tSÍ\nwLDN bmWlD> `zÂCN -Í ¼2¼\n	xZ\nQÇúN bgnT s!ÃmsGn#>\nm§XKT bs¥Y s!ÃglGl#>\nX¾M yxÄM LíC kmÊT çnN\nsxl!ln QDST XNLšlN ¼2¼" },
			n137 = { "¥RÃM `zn Lb#Â ¬qLL¼2¼\n`zn LïÂ ¼4¼ ¬qLL ¼2¼\n¥RÃM yLBN `zN ¬q§lC¼2¼\nyLBN `zN ¼4¼ ¬q§lC¼2¼" },
			n138 = { "ys!Â /mL¥L yÑs@ A§T¼2¼\nys!lÖNÄ!S _bB :i mD`n!T¼2¼\n	xh#N bMN bMN XNmSLšlN\n	:i#B DNQ XÃLN XÂwDSšlN\nxZ\n	Ãr° F_r¬T y¬ds#B> ¼2¼\n	y?YwT ms§L ¥RÃM xNcE n>¼2\nxZ\n	ynb!ÃT TNb!T yLÆCN tSÍ¼2¼\n	bxNcE mmk!ÃnT ¥~bራCN YSÍ¼2¼\nxZ " },
			n139 = { "Xmb@¬CN lxNcE s§M¬ YgÆšL¼2¼\nks@èC h#l#¼3¼ tmR-šL\n	/RÂ wRq$N XÃS¥¥C STfTL\n	tbsr§T¼3¼ ymmr_ KBR\nxZ\n	XÃrÙÙT ys¥Y m§XKT¼2¼\n	b@tmQdS ñrC¼3¼ x|ራ h#lT ›mT\nxZ\n	mNfS QÇSM XNdqrÆT xWö¼2¼\n	sgÄ§T¼3¼ zµRÃS ¬_ö" },
			n140 = { "m\\rt ?YwT ¥RÃM brDx@T nY¼2¼\nM?rT cRntN Yz> ks¥Y¼2¼\nM?rT cRntN Yz> ks¥Y\n¥RÃM DNGL brDx@T nY" },
			n141 = { "nY nY yX¾ Xmb@T nY nY\ny›lM mD`n!T ÑÄY\nyxÄM zR h#l# s!úY\nnY nY ¥RÃM nY nY\n	xM§K ks¥Y Ãy>\n	ywgñC> KBR n>\n	yx?²B h#l# D~nT\n	kxNcE tgß bXWnT\nxZ\n	KBR> tgLÈ*L bLJ>\n	mNfS QÇSM qds>\n	yቃl# ?NÉ çnšL\n	xB ks¥ÃT mRõšL\nxZ\n	i/Y wÈLN kXQF>\n	s¥:¬T h#l# kbb#>\n	MKNÃT çn> l!Dn#\n	bLJ> |ራ Ãmn#" },
			n142 = { "¥RÃMs t`t$ XMTµT WSt kRs# lxÄM\nkmÆ?RY o;Ä\nXSm bXNtEx¦ wbXNt xZ¥Ä!¦ tsqLk#\nÄ!b :I Yb@ mD`n@›lM\n¥RÃM¥ ¬bራlC k_NT jMé bxÄM\nÆ?RY WS_ XNd nu :Nq$ bxÄM Æ?RY WS_\nXRú*N dS Yb§T BlÖ Sl wgñ”\ntsqLk# xl bXN=T mSqL §Y mD`n@›lM" },
			n143 = { "s§M lk! XMn A×N\n¥RÃM WDST y?YwT BR¦N\ns§M lk! XMn A×N\n	DNGL yxBR¦M DNµ*N\n	s§M s§M /rg wYN\n	Ã:öB Ãy> ms§L\n	yslÖäN KBR xKl!L\nxZ\n	A§t Ñs@ yå¶T\n	yxéN bTR mD`n!T\n	yêH RGB yx!Ãq&M\n	ynb!ÃT tSÍ yxÄM\nxZ\n	Xút ml÷TN yÃZ>\n	Ml#: xM§KN ywsN>\n	b@tmQdS yL;#L\n	s§M lk! XM wDNGL" },
			n144 = { "¥RÃM ~zn LïÂ ¬qLL¼2¼\n~zn LïÂ ¼4¼~zn LïÂ ¬qLL\n	?Yw¬CN xNCN ÆyC q$-R TfµlC\n	B„H ÍÂ ymÄN ms§L ›R¥CN n>\n	§zn# mAÂ¾ ldkÑ BR¬T¼2¼\n	µNcE tgßLN yz§lM ?YwT\nxZ\n	RST>N x!T×ùÃN xSb!ÃT bolÖT\n	¬lQúlC s§MN B¬È úT¬KT\n	ÆNcE m¬mኗ SM>N m_ራa¼2¼\n	SlçN>§T nW rÄa\nxZ\n	¥RÃM yLïÂN ~zN ¬q§lC\n	yLBN ~zN¼2¼ ¬q§lC\n	BNkÍ bx¥§JnT> tAÂÂN\n	k_§> |R s§MÂ FQRN xgßN\n	ADQN yt-Ñ ytራb# h#l#¼2¼\n	bSM> t¥AnW Yrµl#" },
			n145 = { "x¥ÂêET k!ÄN ysW LíC tSÍ\nDNGLçY x¥LJN bäT XNÄN-Í\n	yxÆèC nb!ÃT tSÍ TNb!¬cW\n	y/êRÃTM È:m SBk¬cW\n	ys¥:¬T XÂT yÚDቃN Xmb@T\ndGäM X~¬cW ls¥Y m§XKT\nxZ\n	ynQÇS x@FÊM DNQ DRs¬cW\n	yn QÇS ÃÊD DÙ Z¥ÊÃcW\n	yXMn¬cW QmM xNcE n> bXWnt$\n	yxÆ g!×Rg!SM olÖt s›¬t$\nxZ\n	yxÆ ?RÃöS M|-!r QÄs@\n	ymn÷úT SNQ yx@FÊM WÄs@\n	yl!ቃWNT xbW yM|-!R ÌNÌcW\n	ydÂGL tSÍ yADQ xKl!§cW\nxZ\n	h#\"LN mmk!Ã bäT XÄNsU\n	bz!C ›lM fቃD kè XNÄNwU\n	Sll@lN tSÍ bz!H ›lM SNñR\n	xS¬RqEN XmxM§K kc„ LJ> UR " },
			n146 = { "w§Ä!t xM§K yh#l# Xmb@T\nlM\"LN l¾ kLJ> M?rT\nbxNC x¥§JnT bXRs# cRnT\nXNÄ!ÃwÈN nÉ kFRD QÈT\nDNGL çY lM\"LN¼2¼\nbbdL tÄKä fቃd nFúCN\nbMDራêE M®T ÂWø Lb#ÂCN\nFQRÂ T~TÂ -Fè kð¬CN\nläT XNÄYs-N YH Kû |ራCN\n	xZ\nyMSk!ñC tSÍ ydµäCM `YL\n-WLgÂLÂ _§ h#\"N DNGL\nXMnT =M¶LN Lb#ÂCN YAÂ\nXmxM§K xB¶LN ymÄNN ÍÂ\n	xZ\nFi#M XNÄÂZN XNÄÂFR ኋ§\ntn_qN XNÄNqR kz§lM tD§\nbFQR> mL>N ks!xL gÖÄÂ\nDNGL mmk!ÃCN tSÍCN n>Â\n	xZ" },
			n147 = { "ys¥Y yMDR yxRÃM NG|T\nxNcE n> Xmb@T yxM§K XÂT\n	%,¼2¼ DNGL x¥LJN\n	%,¼2¼ QDST tራJN\ny/@êN tSÍê lxÄM zR ?YwT\nyD~nt$ MKNÃT xNcE n> NA?T\nyå¶T mAÂ¾ yxÄ!S k!ÄN bR\nywNg@L m\\rT yxM§K ¥~dR\n	xZ\nyxBR¦M XRš yM|-!R êšW\nXÂTÂ DNGL h#lt$N çN>W\nyx@FÊM WÄs@ yÃÊD WB z@¥\ny¥T-LqE i/Y y¦Y¥ñT š¥\n	xZ \nys¥Y yMDR yxRÃM NG|T\nxNcE n> Xmb@T yxM§K XÂT\n xZ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("94. i/Yn# NBlk")) {
				loadChild(n94);
			} else if (HoldItem.equals("95. XNbl MGÆR")) {
				loadChild(n95);
			} else if (HoldItem.equals("96. å R~R~t ~l!Â")) {
				loadChild(n96);
			} else if (HoldItem.equals("97. lM\"LN ¥RÃM")) {
				loadChild(n97);
			} else if (HoldItem.equals("98. nY nY")) {
				loadChild(n98);
			} else if (HoldItem.equals("99. XNt bMDR")) {
				loadChild(n99);
			} else if (HoldItem.equals("100. bMDራêE ?YwT")) {
				loadChild(n100);
			} else if (HoldItem.equals("101. k!Än M?rT")) {
				loadChild(n101);
			} else if (HoldItem.equals("102. s§M lk! ¥RÃM")) {
				loadChild(n102);
			} else if (HoldItem.equals("103. bZÂm NA?k!")) {
				loadChild(n103);
			} else if (HoldItem.equals("104. ¥RÃM DNGL")) {
				loadChild(n104);
			} else if (HoldItem.equals("105. ywRQ m\\§L n>")) {
				loadChild(n105);
			} else if (HoldItem.equals("106. ¥RÃM ðdL ÂT")) {
				loadChild(n106);
			} else if (HoldItem.equals("107. /mL¥§êET :I")) {
				loadChild(n107);
			} else if (HoldItem.equals("108. N›! ¥RÃM")) {
				loadChild(n108);
			} else if (HoldItem.equals("109. m\\rt ?YwT")) {
				loadChild(n109);
			} else if (HoldItem.equals("110. A§T")) {
				loadChild(n110);
			} else if (HoldItem.equals("111. DNGL çY S§Nc")) {
				loadChild(n111);
			} else if (HoldItem.equals("112. Yê&DSê")) {
				loadChild(n112);
			} else if (HoldItem.equals("113. RGBü")) {
				loadChild(n113);
			} else if (HoldItem.equals("114. Xmb@t& ¥RÃM")) {
				loadChild(n114);
			} else if (HoldItem.equals("115. yBR¦N mWÅ")) {
				loadChild(n115);
			} else if (HoldItem.equals("116. sxl!ln QDST")) {
				loadChild(n116);
			} else if (HoldItem.equals("117. x!Ãq&M w/Â")) {
				loadChild(n117);
			} else if (HoldItem.equals("118. yx¥n#x@L XÂT")) {
				loadChild(n118);
			} else if (HoldItem.equals("119. xNqi BR¦N")) {
				loadChild(n119);
			} else if (HoldItem.equals("120. ¥~dr ml÷T")) {
				loadChild(n120);
			} else if (HoldItem.equals("121. x²\" XÂ¬CN")) {
				loadChild(n121);
			} else if (HoldItem.equals("122. MKçN ldÂGL")) {
				loadChild(n122);
			} else if (HoldItem.equals("123. XmxM§K Ñ>ራ n>")) {
				loadChild(n123);
			} else if (HoldItem.equals("124. îbs k!ÄNk!")) {
				loadChild(n124);
			} else if (HoldItem.equals("125. ÄG¸T xRÃM")) {
				loadChild(n125);
			} else if (HoldItem.equals("126. xTlYN")) {
				loadChild(n126);
			} else if (HoldItem.equals("127. NA?t No#/N")) {
				loadChild(n127);
			} else if (HoldItem.equals("128. bxÆèC LmÂ")) {
				loadChild(n128);
			} else if (HoldItem.equals("129. x!Ãq&M wlÄ")) {
				loadChild(n129);
			} else if (HoldItem.equals("130. M|ራq M|ራቃT")) {
				loadChild(n130);
			} else if (HoldItem.equals("131. bmn#")) {
				loadChild(n131);
			} else if (HoldItem.equals("130. twLÄlCÂ")) {
				loadChild(n132);
			} else if (HoldItem.equals("133. Xmb@¬CN ¥RÃM")) {
				loadChild(n133);
			} else if (HoldItem.equals("134. lXÂ¬CN QDST")) {
				loadChild(n134);
			} else if (HoldItem.equals("135. Xmb@¬CN")) {
				loadChild(n135);
			} else if (HoldItem.equals("136. ¥RÃM Xmb@t")) {
				loadChild(n136);
			} else if (HoldItem.equals("137. ¥RÃM `zn LïÂ")) {
				loadChild(n137);
			} else if (HoldItem.equals("138. ys!Â /mL¥L")) {
				loadChild(n138);
			} else if (HoldItem.equals("139. Xmb@¬CN lxNc")) {
				loadChild(n139);
			} else if (HoldItem.equals("140. m\\rt ?YwT")) {
				loadChild(n140);
			} else if (HoldItem.equals("141. yX¾ Xmb@T")) {
				loadChild(n141);
			} else if (HoldItem.equals("142. ¥RÃMs")) {
				loadChild(n142);
			} else if (HoldItem.equals("143. s§M lk! XMn A×N")) {
				loadChild(n143);
			} else if (HoldItem.equals("144. ¥RÃM ~zn LïÂ")) {
				loadChild(n144);
			} else if (HoldItem.equals("145. x¥ÂêET k!ÄN")) {
				loadChild(n145);

			} else if (HoldItem.equals("146. DNGL çY")) {
				loadChild(n146);
			} else if (HoldItem.equals("147. yxRÃM NG|T")) {
				loadChild(n147);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T19(this, ParentList,
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

	public class T19 extends BaseExpandableListAdapter {

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

		public T19(Activity context, List<String> Items,
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
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/095-Enbele Megbar.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/097-Lemegnlen Mariam.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/098-Ney Ney.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/099-Ente Bemeder.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/100-Bemedrawi Hiwot.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/101-Kidane Mihret.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/102-Selam Leki Mariam.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/103-Bezename Netshki.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/104-Mariam Dingel.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/105-Yewerk Meselal Nesh.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/106-Mariam Fidel Nat.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/107-Hamelmalawit Ets.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/109-Meserete Hiwot.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/110-Tselat.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/111-Dingel Hoy Selanchi.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/112-Yewedesewa.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/114-Emebete Mariam.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/115-Yebirhan Mewcha.mp3");
			} else if (childPosition == 0 && groupPosition == 22) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/117-Eyakem Wehana.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 25) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 26) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 27) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/121-Azagn Enatachen.mp3");
			} else if (childPosition == 0 && groupPosition == 28) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/122-Mikhon Ledenagel.mp3");
			} else if (childPosition == 0 && groupPosition == 29) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 30) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/124-Sobese Kidaneki.mp3");
			} else if (childPosition == 0 && groupPosition == 31) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/125-Dagimit Ariyam.mp3");
			} else if (childPosition == 0 && groupPosition == 32) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 33) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/127-Nitsheyte Netsuhan.mp3");
			} else if (childPosition == 0 && groupPosition == 34) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/128-Babatoch Lemena.mp3");
			} else if (childPosition == 0 && groupPosition == 35) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/129-Eyakem Weleda.mp3");
			} else if (childPosition == 0 && groupPosition == 36) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 37) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/131-Bemenu.mp3");
			} else if (childPosition == 0 && groupPosition == 38) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/132-Teweldalechena.mp3");
			} else if (childPosition == 0 && groupPosition == 39) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/133-Emebetachen Mariam.mp3");
			} else if (childPosition == 0 && groupPosition == 40) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/134-Lenatachen Kidist.mp3");
			} else if (childPosition == 0 && groupPosition == 41) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/135-Emebetachen.mp3");
			} else if (childPosition == 0 && groupPosition == 42) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/136-Mariam Emebete.mp3");
			} else if (childPosition == 0 && groupPosition == 43) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/137-Mariam Hazene Lebona.mp3");
			} else if (childPosition == 0 && groupPosition == 44) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/138-Yesina Hamelmal.mp3");
			} else if (childPosition == 0 && groupPosition == 45) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/139-Emebetachen Lanchi.mp3");
			} else if (childPosition == 0 && groupPosition == 46) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/140-Meserete Hiwot.mp3");
			} else if (childPosition == 0 && groupPosition == 47) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/141-Yegna Emebet.mp3");
			} else if (childPosition == 0 && groupPosition == 48) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/142-Mariamse.mp3");
			} else if (childPosition == 0 && groupPosition == 49) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/143-Selam Leki Emene Tsion.mp3");
			} else if (childPosition == 0 && groupPosition == 50) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/144-Mariam Hazene Lebona.mp3");
			} else if (childPosition == 0 && groupPosition == 51) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/145-Amanawit Kidan.mp3");
			} else if (childPosition == 0 && groupPosition == 52) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/146-Dingel Hoy.mp3");
			} else if (childPosition == 0 && groupPosition == 53) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
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
