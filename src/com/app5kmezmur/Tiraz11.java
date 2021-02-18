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

public class Tiraz11 extends Activity {
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
		ParentList.add("1. tÂg„");
		ParentList.add("2. L;#L XGz!xB/@R");
		ParentList.add("3. XSm xLBn rÄx!");
		ParentList.add("4. rDè¾L XÂ XGz!xB/@R YmSgN");
		ParentList.add("5. SB/T lxM§Kn");
		ParentList.add("6. k¤lÖ zfqd ");
		ParentList.add("7. kKRSèS FQR");
		ParentList.add("8. ñ§êE Tg#H");
		ParentList.add("9. å xÆ QÇS :qïÑ");
		ParentList.add("10. nxMN bxB");
		ParentList.add("11. XGz!xB/@R BR¦n@Â mD`n!t& nW");
		ParentList.add("12. mD`n@›lM xÄnN");
		ParentList.add("13. xDRgHL¾LÂ");
		ParentList.add("14. lz!H qN §bቃW¼T¼");
		ParentList.add("15. bs§M §mÈ");
		ParentList.add("16. MSUÂ YgÆL");
		ParentList.add("17. x¥N bx¥N");
		ParentList.add("18. y`Ã§N `ÃL");
		ParentList.add("19. FQR s/ï");
		ParentList.add("20. Ns@B‡");
		ParentList.add("21. oU nú:n");
		ParentList.add("22. s§M lZKr SMk");
		ParentList.add("23. mD`n@›lM");
		ParentList.add("24. ys¥Y MSUÂ");
		ParentList.add("25. bKNf rDx@TH");
		ParentList.add("26. `YL yXGz!xB/@R nW");
		ParentList.add("27. zs¥y gBr");
		ParentList.add("28. XÂmSGN");
		ParentList.add("29. XNzYBl#");
		ParentList.add("30. n# tmLkt$L\"");
		ParentList.add("31. XsY XsY");
		ParentList.add("32. Ns/ XNGÆ");
		ParentList.add("33. s§MHN SÈT");
		ParentList.add("34. hbn XGz!å");
		ParentList.add("35. Ns@B‡");
		ParentList.add("36. yzmÂT g@¬");
		ParentList.add("37. x!T×’Ã ¬bAH XdêE¦");
		ParentList.add("38. lg@¬ü lXGz!xB/@R");
		ParentList.add("39. XÂmSGN x¥n#x@LN");
		ParentList.add("40. xM§µCN tmSgN");
		ParentList.add("41. ÃkbRê lsNbT");
		ParentList.add("42. XGz!xB/@R çY XRÄ\"");
		ParentList.add("43. M|UÂ jmr");

	}

	String[] n1 = { "tÂg„ DNQ |‰WNM mSK„¼2¼\ntxM„N l›lM Ng„¼2¼\nDNQ |‰WN mSK„  " },
			n2 = { "L;#L XGz!xB/@R¼2¼ MSUÂ YgÆ¦L¼2¼\nlz!C :lT lz!C s›T bs§M \nb-@Â xdrSkN" },
			n3 = { "XSm xLBn rÄx! bg!z@ MNÄb@ w`zN¼2¼\nXSm zXNbl@k Æ:d x!nxMR¼4¼\n\nTRg#M½ bCGRÂ b/zN g!z@ y¸rÄN ylM\nX¾ kxNt bqR l@§ xÂWQMÂ" },
			n4 = { "bwjB b;WlÖ WS_ bmk‰ü qN¼2¼\nrDè¾LÂ XGz!xB/@R YmSgN\nxDñ¾LÂ XGz!xB/@R YmSgN" },
			n5 = { "SB/T lxM§Kn wmD`n!n¼2¼\nwxD`Nk ~l!Ân¼4¼" },
			n6 = { "k¤lÖ zfqd gBr XGz!xB/@R¼2¼ \nbs¥Yn! wbMDRn! wbÆ?Rn!wbk¤l# q§ÃT¼4¼\n\nTRg#M½ XGz!xB/R bs¥YÂ bMDR bÆRM bfúëCM h#l# ywddWN xdrg" },
			n7 = { "kKRSèS FQR y¸ly\" ¥nW¼2¼\nmk‰ CGR S”Y wYS m‰öT nW¼2¼\nxNf‰M xNsUM xN-‰-RM¼2¼\nXGz!xB/@R k¾ U‰ Yñ‰L lzl›lM¼2¼\nbTUT tራMdN XNGÆ b-êT¼2¼\nbdÑ m|Rè k\\ራLN b@T¼2¼\nkè yT Yg¾L XNÄ!H Ãl b@T¼2¼\nyW` GDGÄ ydM m\rT¼2¼\nyW` GDGÄ ydM m\rT¼2¼\nY,W Xz!H xl yx¥n#x@L b@T¼2¼" },
			n8 = { "ñ§êE Tg#~ zx!TnWM¼2¼\n¥~brn¼2¼ :qB b\\§M¼4¼\ny¥¬Nq§Í tg#h Xr\"CN¼2¼\n-BQLN bs§M ¥~b‰CNN¼2¼" },
			n9 = { "å xÆ QÇS :qïÑ¼2¼\nbSMk  wb`YLk :qïÑ\nkmYk#n# x/dBn k¥n¼2¼ kmYk#n#¼2¼\n\nTRg#M½ QÇS xÆT çY Xnz!HN ys-,\"N XNd X¾ xND XNÄ!çn# bSMH -B”cW\n" },
			n10 = { "nxMN bxB wnxMN bwLD bwLD¼2¼\nwnxMN¼4¼ nxMN bmNfS QÇS¼2¼\nXÂMÂlN bxB XNMÂlN bwLD¼2¼ ¼2¼\n XÂMÂlN¼5¼ bmNfSQÇS¼2¼\n" },
			n11 = { "XGz!xB/@R BR¦n@Â mD`n!t& nW¼2¼\ny¸ÃSdnG-\" y¸ÃSf‰\" ¥N nW¼2¼\nxM§k@ mmk!Ãü nW\n" },
			n12 = { "mD`n@›lM xÄnN b¥YšR ”l#¼2¼\ndS YblN¼2¼ XLL bl#¼2¼xÄnN b¥YšR ”l#" },
			n13 = { "xDRgHL¾LÂ bcRntH xmsGN¦lh# XLL¼2¼\nl›lm ›lM x¥n#x@L Xg²L¦lh# \nmD`n@›lM¼2¼\n	qn# =LäB\" z#¶ÃW gdL çñ\n	yCGR xrNÌ ðt& tdQñ \n	rÄT ÃÈh#\" bmsl\" g!z\n	fAä xራQHL\" yLb@N Tµz@\nxZ\n	xM§k@ g#Lbt& `Yl@ mmk!Ãü\n	-§T ¥úf¶Ã yXMnT Ušü\n	XNd¥Ttw\" xh#N xWq&xlh#\n	µl\" ngR YLQ bxNt ¬M¾lh#\nxZ\n	_qEaN xBZtH lMTmGB g@¬	\n	yMmLSLH Æ§g\" |õ¬\n	bqNM bl@l!TM h#l@ l¸Ãbራ\n	mNKR lÆ?RYH :[#B lxNt |ራ\nxZ\n	xM§K çY MSUÂ lxNt YgÆ¦L\n	lMSk!ኗ ¯í brkT s_t¦L\n	D¦ n\" xLLM hBt& xNt nHÂ\n	¥séü äLaL §Y¯DL XNdgÂ" },
			n14 = { "lz!H qN §bቃW¼T wND¥CNN¼X~¬CNN¼2¼\nXÂQRB¼3¼ MSUÂ lfÈ¶ÃCN¼2¼" },
			n15 = { "bs§M §mÈ XNGìÒCNN¼2¼\nXÂQRB¼3¼ MSUÂ lfÈ¶ÃCN¼2¼" },
			n16 = { "MSUÂ YgÆL lxB ›lMN h#l# lÃz\nMSUÂ YgÆL lwLD ›lMN h#l# lf-r\nMSUÂ YgÆL lmNfS QÇS\nby›mt$ KrMTN l¸kFT " },
			n17 = { "x¥N bx¥N¼4¼\nmNG|t |§s@ zl›lM¼4¼\n\nTRg#M½ XWnT bXWnT\n	y|§s@ mNG|T zl›l¥êE nWÝÝ" },
			n18 = { "y`Ã§N `ÃL¼3¼ L;#L XGz!xB/@R¼2¼\ntxMራTH Bz# bs¥Y¼2¼ bMDR\ntxMራTH Bz# bs¥Y¼3¼ bMDR" },
			n19 = { "FQR s/ï lwLD `ÃL XMmNb„¼2¼\nwxBA‡¼3¼ XSkläT¼2¼\n\nTRg#M½ FQR `ÃL wLDN kL;#L mNb„ úbW XSk äTM xdrsWÝÝ" },
			n20 = { "Ns@B‡¼2¼ lXGz!xB/@R¼2¼\nSb#ሓ ztsBሓ¼4¼\nXÂmSGnW ¼2¼ XGz!xB/@RN¼2¼\nMSg#N nW ytmsgn¼4¼" },
			n21 = { "oU nú:n w?Ywt rkBn b`Yl\nmSql# lx!ys#S KRSèS b`Yl mSql#\nk!Ãk XGz!å nxk#T wNs@Bሓk\nXGz!xB/@R¼2¼" },
			n22 = { "s§M¼3¼ lZKr SMk¼2¼\n_;#m z@Â ¼4¼ mD`n@›lM _;#m z@Â¼2¼" },
			n23 = { "mD`n@›lM KRSèS bqራN× Sq$L¼2¼\nbln! m¦Rk#k ¼bln! m¦Rk#k!¼ bXNt\n¥RÃM DNGL XSm /@R xLï XNbl@k ቃL\n\nTRg#M bqራN× ytsqLK mD`n@›lM\nKRSèS çY Sl DNGL ¥RÃM BlH YQR\nxLk#H¼>¼ bl\" Ãl xNt YQR ÆY ylMÂ" },
			n24 = { "ys¥Y MSUÂ ¦l@ l#Ã\nÃÊD ys¥W ym§XKT z@¥\nQÇS¼3¼ XGz!xB/@R y¥YäT ?ÃW\nQÇS¼3¼ bk!„b@L xDé ytqdsW\nQÇS¼3¼ mNb„ bXúT ytkbbW\n¸µx@L gBRx@L kðt$ ömW\nÃmsGn#¬L bxND ቃL çnW\nQÇS¼3¼ BlW" },
			n25 = { "XNd ›YN Bl@N xM§K çY -Bq\"¼2¼\nbKNf rDx@TH km›TM URd\"¼4¼" },
			n26 = { "`YL yXGz!xB/@R nW\n¥ÄN yXGz!xB/@R _bB yXGz!xB/@R\nxNmµM bg#Lb¬CN\nXGz!xB/@R nW y¾ `Y§CN" },
			n27 = { "zs¥y gBr s¥y gBr wMDr œrr¼2¼\nxLï zYmSlÖ lxM§Kn¼4¼\ns¥YN yzrU mÊTN ÃoÂ¼2¼\n`ÃL g@¬ ?ÃW xM§K Ãl XRs# ¥N\nxlÂ¼2¼" },
			n28 = { "XÂmSGN xM§µCNN \nXÂmSGN fÈ¶ÃCNN\nlz!H ÃdrsNN\n=l¥WN gæ BR¦NN ls-N\nMSUÂ lXRs# Yh#N l`Ãl# Ng#œCN\nzmÂTN bzmÂT ÃfራRቃL\nSlh#l#M h#l#N ÃWቃL\núNlMnW ywdDnWN Ys-ÂL\nkfቃÇM Ys¥ÂL\n	WÄs@WN xzU° Ãl:rFT\n	bxÄ!S Qn@ tqß#lT\n	bxÄ!S mZÑR zM„lT\n	XNd wÄ° XNd ÄêET\nZÂ¥TN Ys-ÂL bg!z@Ãt$\nF_rt$NM YmGÆL by:lt$\n~LfT ylW bmNG|t$\n	WÄs@WN...\nSÑ ¬§Q `ÃL Ng#|\ny¸l#lT QÇS¼3¼ m§XKt$ bs¥ÃT\nMSUÂWN ÃqRÆl# Ãl:rFT\nytb@¢H F_rTHN\nKBR MSUÂ lxNt Yh#N\n	WÄs@WN..." },
			n29 = { "XNzYBl# Yz@M„ bLúN zx!ÃrMM¼2¼\nmNG|t |§s@ zl›lM¼4¼\n\nTRg#M½ b¥ÃÌR_ xNdbT XNÄ!H XÃl#\n	ÃmsGÂl# y|§s@ mNGST z§l¥êE nW" },
			n30 = { "n# tmLkt$L\" yxM§k@N cRnT\nxNdbT yl\"M |ራWN l¥WራT\n\\§MÂ FQR bLb@ täLaL\nbMN ÌNÌ §Wራ ቃ§T x_rW¾L\ns¥Y g#M b!mSL q§ÃT b!Âg#\n	y_ÍT xUNNT XJg#N b!tg#\n	Xn@N y¸-BQ `Yl#N xY\\WRM\n	Xr¾ü kXn@ zwTR xYRQM\n		xZ½...\nFR`T kXn@ ቃQ =l¥ twgD\nbg@¬ü TMKHT XNdLb@ L£D\nyäT xbUøC tSÍCh# =LàL\nXGz!xB/@R l!ÃDn\" kx-gb@ öàL\n		xZ½...\nQÇúN bÑl# lXn@ zB ömêL\nwd XnRs# ~BrT l!Sb#\" Ùg#têL\nzwTR wd Xn@ DNGL TmÈlC\nbBR¦N Xí” TÆRk¾lC" },
			n31 = { "XsY¼5¼\nxM§K kXn@ UR nW XsY¼2¼\nÃÈ sW BmSL XsY¼2¼\nNBrT ÆYñr\"M XsY¼2¼\nyxM§k@ FQR XsY¼2¼\nTè\"S xÃWQM XsY¼2¼\nxZ½\nbDHnT SñR XsY¼2¼\nxµl@ tራq$è XsY¼2¼\\dS BlÖ\" Xñራlh# XsY¼2¼\n~l!Âü rKè XsY¼2¼\nxM§K Sl-ቃ\" XsY¼2¼\nl¬§Q dS¬ XsY¼2¼\nkðt& xYlYM XsY¼2¼\nzwTR fgG¬ XsY¼2¼\nxZ½\nDNb!õCN XNµ*N XsY¼2¼\nÃLtêcW g@¬ XsY¼2¼\nYmSgN zwTR XsY¼2¼\nbXWnT -êT ¥¬ XsY¼2¼\n\\Rc& brkT XsY¼2¼\nzwTR x§ÈM XsY¼2¼\nXGz!xB/@R YmSgN XsY¼2¼\nx§úfr\"M XsY¼2¼ " },
			n32 = { "Ns/ XNGÆ `-!xT m|ራT YQR¼2¼\nyxM§K ÆlàlÖC XNh#N bMGÆR\nyxM§K ÆlàlÖC XNh#N" },
			n33 = { "¦l@ ¦l@ ¦l@l#Ã¼2¼\nhÆ s§Mk lx!T×ùÃ¼4¼\n¦l@ ¦l@ ¦l@ l#Ã¼2¼\ns§MHN SÈT lx!T×ùÃ¼4¼" },
			n34 = { "hbn XGz!å xXMé ›:YNt xXMé wTr k!Ãk\nYRxÃ¼2¼\nwxX²Nn£ ቃl zÆHtETk YSM›¼2¼" },
			n35 = { "	Ns@B‡¼2¼ lxM§k :Zራ¼2¼\n	Ns@B‡ lxM§k :Zራ\nlMSUÂ qsqSk\" bXk#l l@l!T\nbtmSõ SlFQRH LjMR ¥~l@T\nNs@B‡ lxM§k :Zራ\n	xZ\nSmlkT wd s¥Y b=rቃ BR¦N\nxSgrm\" kêKBt$ s!Ãw„ |ራHN\nNs@B‡ lxM§k :Zራ\n	xZ\nxXêû b¥lÄ mZÑR s!zM„\nbÌNÌcW yxNtN KBR bM|-!R s!Ãw„\nNs@B‡ lxM§k :Zራ\n	xZ\nkbé çY [Â{L çY lMSUÂ tnS\nb¥lÄ lg@¬CN MSUÂ XÂDRS\nNs@B‡ lxM§k :Zራ\n	xZ\nn# bXGz!xB/@R dS YblN bmNfS XNzMR\nXLL XNbL bMSUÂ Slh#l#M ngR\nNs@B‡ lxM§k :Zራ\n	xZ" },
			n36 = { "y:lT y›mT yzmÂT g@¬\nlz!H §drSk\" zmn@N úTg¬\nxqRBL¦lh# yKBR s§M¬¼2¼\nn# XÂmSGN kLÆCN ys¥†N xÆ¬CNN\nlz!H :lT lz!H ›mT §drsN h#§CNN\nysW LíC XD» _Nt$NM s!jmR\nMN b!wÈ b!wRD b!b² b!dmR\nxND qN xYä§M XNd xNt xöÈ-R¼2¼\n	xZ\nSlz!H xM§K çY N;#D nW Kb#R nW\nwdxNt XNÄ!mlS qN ys-,W sW\ndµ¥ nWÂ sW XD» kራbW¼2¼\n	xZ\nXJG xdNቃlh# yxM§KN _bB\nMDRN bxbÆ s¥†N b÷kB\nXNÄ¹brq xStWü úSB¼2¼\n	xZ\nkNt$ µúlFk#T g!z@üN bê²\nMN ÃdRGL¾L zmn@ b!b²\ndGäM b-Q§§W ›lMN Bg²¼2¼\n	xZ\nwR` KrMT xLæ mSkrM s!-Æ\nMDR bLM§» S¬g@_ bxbÆ\nXÂMÂlN lxNt MSUÂ XNÄ!gÆ¼2¼\n	xZ" },
			n37 = { "x!T×ùÃ ¬bAH XdêE¦ `b \nXGz!xB/@R¼2¼\nXNzTBL xM§k!ü¼2¼ nArn! wxD~nn!\nXM`Yl o§x! wiR\n\nTRg#M½ bM?rT ›YN tmLktN k-§T `YL xDnN XÃlC x!T×ùÃ Xí”N wd xGz!xB/@R TzrlC " },
			n38 = { "lg@¬ü lXGz!xB/@R S§drgL\" MN\nXkFlêlh#¼2¼\ntmSgN nW XN©!¼2¼ l@§ MN X§lh#¼4¼" },
			n39 = { "XÂmSGN x¥n#x@LN yätLNN g@¬¼2¼\nbät$ äTN šrLN XNÄNr¬¼4¼ " },
			n40 = { "xM§µCN tmSgN¼2¼ l²Ê ÃdrSkN\nxM§µCN tmSgN ¼2¼ lz!H qN\nÃdrSkN\nb`-!xT SN¥QQ bM?rTH -ራ,N\nb›lM SNÆZN nbR bYQR¬H mራ,N\nxM§K çY tmSgN\nTXGSTH Bz# nW xÃLQM R~ራ~@H\nyMkFLH MN YçN Bz# nW Wl¬H\nxM§K çY tmSgN\n	xZ\nkè y¥TfLG ksW LíC wr¬\ncR fÈ¶ nHÂ |ራH DNQ nW g@¬\nxM§K çY tmSgN\nYQR ÆY xM§µCN çY xNtN XÂmLµlN\nkm›TH ¬GsH h#l#NM YQR xLkN\nxM§K çY tmSgN\n	xZ\n`-!x¬CN =l¥ b!ÃdRgW n#éxCNN\nbxNt tgÖÂAfÂL y¥ÄNN BR¦N\nxM§K çY tmSgN\nSlxdrKLN h#l# Sl G„M |ራH\nyራSHN XNS_H tmSgN XNbLH\n	xZ" },
			n41 = { "ÃkBRê lsNbT m§XKT bs¥ÃT\nÚDቃN bWSt gnT\nwk#l# F_rT ›œT wxÂBRT\nXl WSt dYN Ã:rû ÆtE\nXSmÆtE x:rf XMk¤l# GB„\nÃkB…¬L sNbTN m§XKT bs¥ÃT\nÚDቃNM bgnT\nF_r¬T bÑl# ›œãCÂ xNb¶ãC\nbmቃBR Ãl# ÃkB…¬L\nxM§K bXRú* XNÄrf k|ራW h#l#" },
			n42 = { "	XGz!xB/@R çY XRÄ\" cRnT xDRgH\n	XD» lNs/ XNd ?ZQÃS s_tH\n	-¥¥WN Lb@N bቃLH xቃNtH\nx§WqWM BlÖ s!-yQ ÃmiW\nìé XSk!ôH DrS ƒST g!z@ yµdW\nyJrT wNZ nW ys-,W XNÆ\n’@_éS tiIè NS/ XNÄ!gÆ\n	xZ\nAêW XNÄYdRs\" yYh#Ä XDL\nLJH çñ WlÖ ¥¬ m÷BlL\n’@_éS XDl¾ xLQî t¥r\nbT:b!t$ Yh#Ä XNdwÈ qr\n	xZ\nzmኗN bÑl# bZÑT xቃ_§\nlNS/ -ራT g@¬ bgl!§\n¬Dú tnúC bXNÆê B²T\nbXG„ |R tdF¬ ¥RÃM XNtXFrT" },
			n43 = { "M|UÂ jmr BlÖ ¦l@ l#Ã\n¥~l@¬Y ÃÊD zx!T×’Ã\nM|UÂ jmr BlÖ ¦l@ l#Ã\n	YbL¼3¼ ¦l@ l#Ã\n	_;#m LúN ÃÊD¼3¼ zx!T×ùÃ\nBl#YN k/Ä!S /Ä!SN kBl#Y\nxStÆBé Yø ÃÊD ¥~l@¬Y\nM|-!R tgLÛlT kMDR XSk s¥Y\n	xZ\nbmNfS QÇS `YL M|-!R XÃS¥¥\nM|UÂ jmr bnz!H kt¥\nlQDST |§s@ bƒST ›YnT z@¥\n	xZ\nbgÂ oÂIL s!m¬ kbé\nz@¥W s!NöröR bsW LíC íé\nyÃÊD Z¥Ê ÃDúL xXMé\n	xZ\nMXmÂN XÂQRB lxM§K M|UÂ\nbXZራ msNö bÄêET bgÂ\nz@¥WN kÃÊD tMrÂLÂ " };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		setTitle("መዝሙር ዘዘወትር");
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1. tÂg„")) {
				loadChild(n1);
			} else if (HoldItem.equals("2. L;#L XGz!xB/@R")) {
				loadChild(n2);
			} else if (HoldItem.equals("3. XSm xLBn rÄx!")) {
				loadChild(n3);
			} else if (HoldItem.equals("4. rDè¾L XÂ XGz!xB/@R YmSgN")) {
				loadChild(n4);
			} else if (HoldItem.equals("5. SB/T lxM§Kn")) {
				loadChild(n5);
			} else if (HoldItem.equals("6. k¤lÖ zfqd ")) {
				loadChild(n6);
			} else if (HoldItem.equals("7. kKRSèS FQR")) {
				loadChild(n7);
			} else if (HoldItem.equals("8. ñ§êE Tg#H")) {
				loadChild(n8);
			} else if (HoldItem.equals("9. å xÆ QÇS :qïÑ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10. nxMN bxB")) {
				loadChild(n10);
			} else if (HoldItem.equals("11. XGz!xB/@R BR¦n@Â mD`n!t& nW")) {
				loadChild(n11);
			} else if (HoldItem.equals("12. mD`n@›lM xÄnN")) {
				loadChild(n12);
			} else if (HoldItem.equals("13. xDRgHL¾LÂ")) {
				loadChild(n13);
			} else if (HoldItem.equals("14. lz!H qN §bቃW¼T¼")) {
				loadChild(n14);
			} else if (HoldItem.equals("15. bs§M §mÈ")) {
				loadChild(n15);
			} else if (HoldItem.equals("16. MSUÂ YgÆL")) {
				loadChild(n16);
			} else if (HoldItem.equals("17. x¥N bx¥N")) {
				loadChild(n17);
			} else if (HoldItem.equals("18. y`Ã§N `ÃL")) {
				loadChild(n18);
			} else if (HoldItem.equals("19. FQR s/ï")) {
				loadChild(n19);
			} else if (HoldItem.equals("20. Ns@B‡")) {
				loadChild(n20);
			} else if (HoldItem.equals("21. oU nú:n")) {
				loadChild(n21);
			} else if (HoldItem.equals("22. s§M lZKr SMk")) {
				loadChild(n22);
			} else if (HoldItem.equals("23. mD`n@›lM")) {
				loadChild(n23);
			} else if (HoldItem.equals("24. ys¥Y MSUÂ")) {
				loadChild(n24);
			} else if (HoldItem.equals("25. bKNf rDx@TH")) {
				loadChild(n25);
			} else if (HoldItem.equals("26. `YL yXGz!xB/@R nW")) {
				loadChild(n26);
			} else if (HoldItem.equals("27. zs¥y gBr")) {
				loadChild(n27);
			} else if (HoldItem.equals("28. XÂmSGN")) {
				loadChild(n28);
			} else if (HoldItem.equals("29. XNzYBl#")) {
				loadChild(n29);
			} else if (HoldItem.equals("30. n# tmLkt$L\"")) {
				loadChild(n30);
			} else if (HoldItem.equals("31. XsY XsY")) {
				loadChild(n31);
			} else if (HoldItem.equals("32. Ns/ XNGÆ")) {
				loadChild(n32);
			} else if (HoldItem.equals("33. s§MHN SÈT")) {
				loadChild(n33);
			} else if (HoldItem.equals("34. hbn XGz!å")) {
				loadChild(n34);
			} else if (HoldItem.equals("35. Ns@B‡")) {
				loadChild(n35);
			} else if (HoldItem.equals("36. yzmÂT g@¬")) {
				loadChild(n36);
			} else if (HoldItem.equals("37. x!T×’Ã ¬bAH XdêE¦")) {
				loadChild(n37);
			} else if (HoldItem.equals("38. lg@¬ü lXGz!xB/@R")) {
				loadChild(n38);
			} else if (HoldItem.equals("39. XÂmSGN x¥n#x@LN")) {
				loadChild(n39);
			} else if (HoldItem.equals("40. xM§µCN tmSgN")) {
				loadChild(n40);
			} else if (HoldItem.equals("41. ÃkbRê lsNbT")) {
				loadChild(n41);
			} else if (HoldItem.equals("42. XGz!xB/@R çY XRÄ\"")) {
				loadChild(n42);
			} else if (HoldItem.equals("43. M|UÂ jmr")) {
				loadChild(n43);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T11(this, ParentList,
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

	public class T11 extends BaseExpandableListAdapter {

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

		public T11(Activity context, List<String> Items,
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

		public void data(int childPosition, int groupPosition) {
			if (childPosition == 0 && groupPosition == 0) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/001-Tenageru.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/002-Leul Egziabhear.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/003-Esme Albene Redani.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/004-Redtognal Ena Egziabhear Yemesgen.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/005-Sebhat LeAmlakene.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/006-Kulu Zefekede.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/007-Kekirstos Fikir.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/008-Nolawi Teguh.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/009-O Aba Kidus Ekebomu.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/011-Egziabhear Birhanena Medhanite New.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/012-MedhaneAlem Adanen.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/013-Adergehelegnalena.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/014-Lezih Ken Labekaw-t.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/015-Beselam Lameta.mp3");
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/016-Mesgana Yegebal.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/017-Aman Beaman.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/018-Yehayalan Hayal.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/019-Fikir Sehabo.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/020-Nesebeho.mp3");
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/021-Tsega Nesane.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/022-Selam Lezekre Semeke.mp3");
			} else if (childPosition == 0 && groupPosition == 22) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/023-MedhaneAlem.mp3");
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/024-Yesemay Mesgana.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/025-Bekinfe Redeateh.mp3");
			} else if (childPosition == 0 && groupPosition == 25) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/026-Hayl Yeziabhear New.mp3");
			} else if (childPosition == 0 && groupPosition == 26) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/027-Zesemaye Gebre.mp3");
			} else if (childPosition == 0 && groupPosition == 27) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/028-Enamesgen.mp3");
			} else if (childPosition == 0 && groupPosition == 28) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/029-Enzeyeblu.mp3");
			} else if (childPosition == 0 && groupPosition == 29) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/030-Nu Temelketulegn.mp3");
			} else if (childPosition == 0 && groupPosition == 30) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/031-Esay Esay.mp3");
			} else if (childPosition == 0 && groupPosition == 31) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 32) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/033-Selamehen Setat.mp3");
			} else if (childPosition == 0 && groupPosition == 33) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/034-Habene Egzio.mp3");
			} else if (childPosition == 0 && groupPosition == 34) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/035-Nesebeho.mp3");
			} else if (childPosition == 0 && groupPosition == 35) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/036-Yezemenat Geta.mp3");
			} else if (childPosition == 0 && groupPosition == 36) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/037-Ethiopia Tabetseh Edewiha.mp3");
			} else if (childPosition == 0 && groupPosition == 37) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/038-Legetaye Legziabhear.mp3");
			} else if (childPosition == 0 && groupPosition == 38) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/039-Enamesgen Amanuelen.mp3");
			} else if (childPosition == 0 && groupPosition == 39) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/040-Amlakachen Temesgen.mp3");
			} else if (childPosition == 0 && groupPosition == 40) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/041-Yakebirewa Lesenbet.mp3");
			} else if (childPosition == 0 && groupPosition == 41) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/042-Ezgiabhear Hoy Erdagn.mp3");
			} else if (childPosition == 0 && groupPosition == 42) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/043-Misgana Jemere.mp3");
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
