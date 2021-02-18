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

public class Tiraz113 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("192. yTYçN mGb!Ãü");
		ParentList.add("193. xLtw\"M g@¬");
		ParentList.add("194. brqqW FQRH");
		ParentList.add("195. xb@t$ xNtN X-ራlh#");
		ParentList.add("196. xb@t$ fÈ¶ÃCN");
		ParentList.add("197. xM§k@ çY");
		ParentList.add("198. g!z@ü XSk!dRS");
		ParentList.add("199. dµ¥W LJHN");
		ParentList.add("200. xb@t$ bmNG|TH xSb\"");
		ParentList.add("201. g@¬ ÃlW");
		ParentList.add("202. Ns/ XNGÆ");
		ParentList.add("203. M?rTH yb²");
		ParentList.add("204. n# XNQrB");
		ParentList.add("205. xD~nn");
		ParentList.add("206. xND g!z@ yxGz!xB/@R ç¾lh#");
		ParentList.add("207. xYdlM MDራê");
		ParentList.add("208. wd ?YwT mNgD");
		ParentList.add("209. c„ mD`n@›lM");
		ParentList.add("210. wÄNt XsGÄlh#");
		ParentList.add("211. §YqR mäT");
		ParentList.add("212. mmk!Ãü xNt nH");
		ParentList.add("213. xl\"¬CN");
		ParentList.add("214. Á¥S çY tmlS");
		ParentList.add("215. ÆRkN");
		ParentList.add("216. Lb@ xb@T bL XNJ");
		ParentList.add("217. ¥r\"");
		ParentList.add("218. M?rTN XNlMN");
		ParentList.add("219. ›lMN øÊ");
		ParentList.add("220. bäT _§ wDqN");
		ParentList.add("221. x¬Wk!\" nFs@");
		ParentList.add("222. XN¥LD¦lN");
		ParentList.add("223. XNd bdl@¥");
		ParentList.add("224. XNdcRnTH");
		ParentList.add("225. XÃlf nW zmn@");
		ParentList.add("226. xÆ¬CN çY");
		ParentList.add("227. ysW LJ h#Lg!z");
		ParentList.add("228. ysW LíC h#§CN XN¥R");
		ParentList.add("229. yxêJ nU¶ ቃL");
		ParentList.add("230. QÇúN bÑl#");
		ParentList.add("231. MGÆRM xL\\ራh#");
		ParentList.add("232. yQÇúN xM§K");
		ParentList.add("233. mNgDHN xúy\"");
		ParentList.add("234. xÆ¬CN çY");

	}
	// Assign children list element using string array.

	String[] n192 = { "b|ራü yTYçN mGb!Ãü¼4¼\n=nq\" -bb\" nFs@ wÄ!ÃL\"¼2¼\n	t¹K» y`-!xT KMR¼2¼\n	YmšL YnUL bkNt$ SøR¼2¼\n	gsgs qn# =lmB\"¼2¼\n	ê lnFs@ MNM SNQ xLÃZk#\"\nxZ½.........\n	bDÃlh# wd xNt Xôhlh#¼2¼\n	YQR bl\" X¥iN¦lh#\n	C§ xTbl\" kðTH ö»xlh#\nxZ½......\n	xlfB\" bkNt$ g!z@ü¼2¼\n	XyÙÙh# lz!C l|Uü¼2¼\n	bNS/ ú§_bW XDØN¼2¼\n	LTdRS nW ÃC yftÂ qN¼2¼\nxZ½....." },
			n193 = { "	xLtw\"M g@¬ lµS Ywd¾L¼2¼\n	²ÊM SbDlW LË nH Yl¾L\n	²ÊM SbDlW LË n> Yl¾L\nbbdL g#ራNg#R b`-!xT Åµ\nB-ÍbT XNµ*N xLtw\"M lµ\n²ÊM LË BlÖ ÄGM Y-ራ¾L\nlµS xL-§\"M g@¬ Ywd¾L\n	xZ ....\nlSLÈN lKBR Bü SKdW\nlgNzB xDLc& Xn@ BrúW\nlXn@ ÃlW FQR xLqnsB\"M\n²ÊM Ywd¾L g@¬ xL-§\"M\n	xZ .....\n¬Ä!Ã lz!H FQ„ ll@lW wsN\nkuNÅ mቃBR §wÈ\" Xn@N\nb?Ywt& h#l# Fo#M lmራ\"\nKBRÂ MSUÂ xqRÆlh#\"\n	xZ ...." },
			n194 = { "brqqW FQRH xNt BT-ራ\" ²Ê\nY,W ÄGm¾ mÈh# b`-!xT ›lM ñÊ¼2¼\nkb@TH XRq& BÿD l›lM tg²h#\nxNt YQR Tl\" zND XNdgÂ mÈh#¼2¼\nbörSkW |UH ÆfsSkW dMH\nk›lM GøT xW_tH xn#r\" bb@TH¼2¼\nÄGm¾ XNÄLbDLH b›lM t¬Lü\nbQÇúNH ML© -Bq\" g@¬ü¼2¼\nb›lM y\\ራh#TN ÃúzNk#HN h#l#\nYQR bl\" xM§k@ Sl XGZXTn k¤l#¼2¼" },
			n195 = { "xb@t$ xNtN X-ራlh#\nnFs@N wd xNt xnúlh#\n	ZM xTbl\" Xô¦lh#¼2¼\n	y`-!xt& ¹KM kBì¾L\n	y|U w_mDM xSé¾L\n	y\\YÈN F§Ú x_Qè¾L¼2¼\nxZ½....\n	dµ¥ n\" bÈM CGr¾\n	MSk!N tSÍ b!S xnSt¾\n	kmNUW yራQh#\" Bc¾¼2¼\nxZ½....\n	yb@TH ÂFöT xቃ-l\"\n	yቃLH brkT Xራb\"\n	XÆKH g@¬ YQR bl\"¼2¼\nxZ½....\n	kxNt kÖBLü tNkራtTk#\n	MNM §YrÆ\" kNt$ ÆkNk#\n	lbSÆ> |Uü tg²h#¼2¼\nxZ½.....\n	`-!xt&N h#l# YQR bl\"\n	yNS/N bR KfTL\"\n	mÈh#\" g@¬ tqbl\"¼2¼\nxZ½...." },
			n196 = { "xb@t$ fÈ¶ÃCN mD`n!¬CN xM§µCN xÆ¬CN\nbxNt §Y nW zl›lM tSÍCN\n	qNÂ l@l!t$N yM¬fራRQ\n	xM§K xNt BÒ |ራH y¸ÃSdNQ\nxZ½....\n	m›TH yራq M?rTH yb²\n	brqEQ |LÈNH h#l#N yMTg²\nxZ½.....\n	bbdLnW bdL b\\ራnW |ራ\n	Sl¾ tqbLK ÃN h#l# mkራ\nxZ½....\n	sYÈN btNkÖl# XNÄÃ-MdN\n	b?YwT gÖÄÂ wdxNt MራN\nxZ½....\n	yz§lM xM§K yFQR ys§M\n	xb@t$ tmSgN XSkzl›lM\nxZ½...." },
			n197 = { "	xM§k@ çY xTtw\" fÈ¶ü 	tmLkt\"¼2¼\n	MNM BbDLH yXíCH |ራ n\"\nb›lM F§gÖT ¬|Ê XNÄL-Í\nxWÈ\" kftÂ xNtW h#n\" tSÍ\n	|UêE fራÁ tbr¬è nFs@ X°g#N\n	tÄK¥lC¼2¼\n	yXíCHN ¥ÄN tSÍ ¬dRUlC\nxZ\n	yäTKL\" xM§K mD`n!T çnH\n	mD`n!T xNt ln@¼2¼\n	xNÄY\\l_n#B\" FÄÂ k#nn@\nxZ\n	b|UH bdMH yg²,\"¼2¼ yêj,\" g@¬¼2¼\n	`YL yl\"MÂ h#NL\" mk¬\nxZ" },
			n198 = { "g!z@ü XSk!dRS wdxNt mMÅü\nlNS/ xBቃ\" xb@t$ g@¬ü¼2¼\n	BR¦n@ mD`n!t& tSÍH YmLs\"\n	_Ít&N dMSsH YQR¬ xDRGL\"\n	tSÍü rÄt& xNt xTÈl\"\n	xM§k@ x¬_Í\" ks!åL xDn\"\nxZ½...\n	m•¶ YQR ÆY M?rTH YgÖBß\"\n	k`-!xT F§Ú oUH Y¬dg\"\n	xÄß@ mD`n!t& s§MN §KL\"\n	yD~nT díCHN bFQR KfTL\"\nxZ½...\n	xb@t$ MHrTH bXn@ §Y Yh#N\n	t=nk# g@¬ü S-\" s§MN\n	kKû XND¹> xDn\" Xn@N\n	b¯ XND\\ራ Mራ\" mNgÇN\nxZ½...\n	ybdl@ B²t$ y¸ÃSkÍM b!çN\n	b|U bdMH X-B `-!xt&N\n	wd xNt XmÈlh# xdራ nFs@N\n	bs¥ÃêE b@T xn#R ?Ywt&N" },
			n199 = { "dµ¥W LJHN úTNq\" -Rt,¾LÂ\nXGz!xB/@R çY YDrSH M|UÂ\nxmi¾ nbRk# y¹fTk#\" kxNt tlYc&\n²Ê tmlSk#\" bNS/ _¶HN sMc&\nBc¾ n\" nbr ¦úb@\nlµ xNt xlH zwTR kx-gb@\nybdl@ B²T úÃGDH fIä úTNq\"\nb›lM SNkራtT SQbzbZ bM?rT xYt,\"\ntkTl, wd xNt -ራ,\"\núYgÆ\" bb@TH xñRk\"\n`-!xT ¹KM çñ bmkራ SñR t=Nq&\ny¸Ãnú\" -Fè trSc& kTb!Ã wDq&\nxN|t,\" oUHN s-,\"\nLË BlH lKBR xbራ,\"\nyM?rT XNjራ l?Ywt& ÆRkH STs-\"\n›Yn@ tgl- BR¦N bራ mNgDHM ¬y\"\nrJM nW yb²W ftÂ\ny-ራ,\" XRÄ\" XNDoÂ" },
			n200 = { "xb@t$ bmNG|TH xSb\"¼2¼\nbbdl@ B²T xYtH xTÈl\"¼2¼\n	úSbW bdl@ Bz# nW¼2¼\n	b=l¥ nFs@N b§T WD¥¼2¼\n	çÁ ÆÆ xfSúlh# XNÆ¼2¼\n	XRቃn@N qrh#\" tgff LBs@\n	mDršW -ÍB\" t=nqC nFs@\n	yBR¦N oÄl@ k›Yn@ tgff\n	kðTH lmöM g#Lbt& ¬-f\nxZ½....\n	xLÒLk#M dGf\" XNDöM¼2¼\n	lgnT ÃbቃH ÃN q¥¾ >F¬\n	Xn@NM dGf\" xWÈ\" y²Nl¬" },
			n201 = { "g@¬ ÃlW h#l#M xlW\nyz§lM ?YwT Ælb@T nW\n	Xmn# bg@¬ YH BÒ YbቃL\n	yqrWN XRs# bFQ„ YsÈL\nxZ½...\n	s§M §-# s§M FQRN §-# FQRN\n	l¬rz# LBSN ltራb# XNjራN\nxZ...\n	lt-Ñ W`N l¬mÑ fWSN\n	tSÍ §-# tSÍN ldµäC `YLN " },
			n202 = { "Ns/ XNGÆ `-!xT m|ራT YQR¼2¼\nyxM§K ÆlàlÖC XNh#N bMGÆR¼2¼" },
			n203 = { "m›TH yራq M?rTH yb²\nXWnt¾W xM§K y›lM h#l# b@²\nkራS ig#Ê YLQ `-!xt&M b!b²\nb›lM tQbZB¢& XNÄLqR bê²\n	_ራ\" LË BlH DMIHN xs¥\"\n	Bc¾ n\"Â xlh#LH bl\"\n	XNdXn@¥ b!çN XNd m÷Bll@\n	xYgÆM nbR LJH nW mÆl@\nBR¬T çn\"Â FQRÂ Wl¬H\nmÈh#\"xM§k@ YQR bl\" LLH\nNS/N y\\ራH gÂ kJM„\nlÚD\\ቃN xYdlM b?GH lñ„\n	Xn@ bdl¾W m_Òlh#Â\n	xNœ\" bM?rTH xJHN zRUÂ\n	y›lM FQR Sï\" ÄGM XNÄL-Í\n	kb@TH úLwÈ XNDñR btSÍ\nbM?rT XíCH dGf\" g@¬ü\nkQÇúN Uራ XNÄ!çN n#éü" },
			n204 = { "n# XNQrB m-ራT úYmÈ¼2¼\n|UWN XNB§¼3¼ dÑNM XN-È\n	yqራN× bG yxM§K |UW\n	tsWèLÂL XNmgbW\n	XDûN `-!x¬CN bNS/ xNAtN\n	XNqbL xMnN bLJn¬CN\n	mQrB wd g@¬ bXWnT y¸gÆW\n	bStRJÂ xYdlM bwÈTnT nW\nxZ½...\n	=rቃÂ i/Y dM ylbs#lT\nkêKBt s¥Y ytn-ûlT\n	Y,W tftt Xút ml÷T\nxZ½...\n	QDST XÂ¬CN b@tKRStEÃN\n	TUBzÂlC |UÂ dÑN\n	yx¥n#x@L |U Y,W tzUj\n	lGBÏW t-ራN xê° ¬wj\n	m_q$ tdwl XNQrB bXLL¬\n	bኋ§ xYrÆNM êY¬Â ÅÅ¬\nxZ½...\n	Y<N XDL f_nN XN-qMbT\n	›lMN xLÃZNM Bz# LNöYÆT\n	kxh#n# Qrb# ¬W©*L xê°\n	yYlF dBÄb@ SNQN xzU°\n	Y< ›lM -ð nW b¦BT xTmk#\n	B§*L xM§µCN tSÍCh#N XNk#" },
			n205 = { "xD~nn XGz!å xD~nn xM§Kn¼2¼\nzxD`Nµ lnnê& hgR bTNBLÂ TNBLÂ\nœ?LK¼2¼\nxDnN g@¬ çY xDnN xM§µCN¼2¼\nÃÄNµT hgr nnê&N bYQR¬H bxM§µêE\nYQR¬H¼2¼" },
			n206 = { "xND g!z@ yXGz!xB/@R ç¾lh#\nbFQ„ tSb@ bdÑ D¾lh#\n›lM tY\" Nq& Tc&šlh#\n	_bb¾W sYÈN bmÈW b!mÈ\n	ÄGM tmL¹@ kXGz!xB/@R §LwÈ\n	kmSql# GRg@ xRØ Xñራlh#\n	›lM tY\" Nq& Tc&šlh#\nxZ½....\n	b!ÃÑ\" b!ÃNÌ>¹#\" b!úlq$B\"\n	WRdTM tNkÖLM b!¹Rb#B\"\n	ln@ XNdW dS¬ nW `zNM yl\"\n	sYÈN XfR yKRSèS n\"\nxZ½.....\n	Ùd®c&M -l#\" tlW˜ÆcW\n	y_Nt$N -ÆüN Slnfµ*cW\n	BÒüN yçNk#\" b!mSl\"M ln@\n	g@¬ XNdçN xlL\" kgÖn@\nxZ½....." },
			n207 = { "YH q$RÆN Kb#R nW Fo#M s¥ÃêE¼2¼\nXNÄYmSlN tራ xYdlM MDራêE¼2¼\n	xM§µCN çY xNt YQR ÆY\n	XNdcRnTH bdLN xTY¼2¼\n	x»N x»N BlN tqBlÂL\n	bDFrTM úYçN bFR¦T qRbÂL¼2¼\nxZ½...\n	¥KbR YgÆÂL bT~TÂ çnN\n	dFrN xÂQlW XNÄÃቃ_lN¼2¼\n	XNdM¬†T YH q$RÆN fራJ nW\n	XNdl@§W úYçN ytqds nW¼2¼\nxZ½...\n	s#ራØL k!„b@L owRt mNbR\n	lmÃZ ÃLÒl#T fRtWT bKBR¼2¼\n	X¾ tmgBnW xgßN D~nT\n	lnFS l|UCN çnLN ?YwT¼2¼\nxZ½..." },
			n208 = { "wd ?YwT mNgD Ymራ¾L g@¬\nb=l¥W mNgD XNÄLNg§¬¼2¼\nfÈ¶ BÒ nW ?Ywt&Â KBÊ\nlRs# dS Yl¾L úqRB Z¥Ê¼2¼\ng#LbT h#l# §Nt bFR¦T YsGÄL\nM?rTN xDlN fÈ¶ cL xTbL¼2¼\ny?YwTN W` yt-Ñ h#l#\nk`Ãl# g@¬ kxNt Yrµl#¼2¼\nbM?rTH ¥rN xb@t$ fÈ¶\nlF_r¬T h#l# nHÂ m/¶¼2¼\ns§MN xD§T lx!T×ùÃ¼2¼\nXí”N zRG¬ STL ¦l@ l#Ã¼2¼" },
			n209 = { "c„ mD`n@›lM yxÄM LíC b@²\nxTbl\" C§ bdl@M b!b²¼2¼\nXmµB¦lh# qNM çn ¥¬\nxNt nH g#Lbt& yD~nt& xl\"¬¼2¼\n	ÃlxNt ¥N xl\" c„ fÈ¶ü\n	y?Ywt& tSÍ xMÆ m-g!Ãü\n	LmÂüN S¥ Œ,t&NM xDM_\nXÆKH g@¬ü xWÈ\" k`-!xT ¥_\nxZ\n	gÖSÌ§ n\" XÂ `-!xT Ãúdf\"\nwdb@TH -RtH bNs/ X-b\"\nFQRÂ T~TÂN ADQN rSc&\n	xúZß@¦lh# xM§k@ xNtN Tc&\nxZ\n	bz!ÃC bFRD qN bq\" y¸Ãöm\"\n	gDLÂ T„ÍT MNM Sll@l\"\n	XNÄLÈL kXúT lz§lM SቃY\n	bQÇúN olÖT ¥r\" g@¬ü çY" },
			n210 = { "wÄNt XsGÄlh# úlh# b?Ywt&\n§NtM Xg²lh# XSk :lt ät&\nxNt nHÂ mD`n!t& yzl›lM b@t&¼2¼\núYm>B\" qn# úY=LM DNgT\nbADQH gÖÄÂ LÙZ wdðT\nMራ\" mNgÇN xúy\" XNÄLúúT¼2¼\nynFS y|Uü y?Ywt& b@²\nxTbl\" C§ bdl@ b!b\nxNtN xMß@ Xñራlh# wÁT XÿÄlh#\nxNtN xMß@ Xñራlh# wÁT XdRúlh" },
			n211 = { "§YqR mäT xfR mLbS mGÆT kmቃBR\nmSlÖ\" Ì¸ YH |Uü lXRs# BÒ S_R\nGN lnFs@ qr ¥S¬ws@¼2¼\nzmN mq$-R :lT wራT KrMTÂ bU\nl@TÂ qN s!fራrQ s!=LM s!nU\nb¥yt& YçN mdst&¼2¼\nXr wÄ!Ã wÄ!ÃL\" ê YB§\" lnFs@\nxDRgÖ¾L y`-!xT MNu dµ¥W mNfs@\n§LñR b›lM ö» lzl›lM¼2¼\nm/¶ xM§K lUS g@¬ c„ fÈ¶ü\nxNt X÷ nH lzl›lM yn@ mmk!Ãü\nYQR bl\" M?rTH xYራq\"¼2¼" },
			n212 = { "mmk!Ãü xNt nH ynFs@ mÄ¾\ntmLkT wd Xn@ xTS-\" lÄ¾\n	?Ywt&N §Nt¼2¼ BÃlh#\n	xM§K yn@ g@¬ yT xg\"¦lh#\nkbdl@M xNÉ\" dGäM k`-!xt&\nbmNfS Y¬dS m§W sWnt&\n	xZ...\nxqbt$ Lb@ buNÅ T:b!T\nx¹BRö nbR xLfRSM mSlÖT\n	xZ½ ...\nyKBR Ng#| mMÈT Sltngr\nmdLdL xlbT Xytsbr\n	xZ½..." },
			n213 = { "xl\"¬CN¼2¼ Yh#N ¼2¼ wd fÈ¶ÃCN¼2¼\nXRs# Slçn ¼2¼ y?YwT tSÍCN¼2¼\nx!ys#S¼2¼ tsQlÖ¼2¼ bQÇS mSql#\nÑl# tSÍ çn¼2¼ lxÄM LJ h#l#¼2¼\nlM¬LfW ¼2¼ ›lM¼2¼ m=nQ YQRBN\ntSÍCNM h#l# ¼2¼ bKRSèS Yh#N¼2¼" },
			n214 = { "yYh#Ä g#ø xÃêÈMÂ\nÁ¥S wd ?YwT XÆKH èlÖ Â¼2¼\n	kwNg@L gb¬ mmgB jMrH\n	wND» tmlS wÁT TÿÄlH\n	Y-ራ¦LÂ mSql#N tmLkT\n	ywNg@L b#ቃÃ XWnt¾ ?YwT¼2¼\nxZ½...\n	Bz# KRStEÃñC mNgÇN jMrW\n	y›lM x¹NK¬B DMqT s!-ራcW\n	ftÂ s!mÈ wNg@l#N wRWrW\n	äTN YmRÈl# ?YwTN sRzW¼2¼\nxZ½...\n	ymSql# ~TmT kLBH úY-Í\n	bXGz!xB/@R g#Æx@ mSKrH bYÍ\n	L° ytÆLkW b_MqT qlbT\n	XNÁT TÿÄlH tnDtH wd äT¼2¼\nxZ½...\n	yKBR xKl!l# tzUJèL¦L\n	xM§K l>L¥T Á¥S çY YL¦L\n	wÁT TÿÄlH XÆKH tmlS\n	KBRHN xTtW kÅû STdRS¼2¼\nxZ½....." },
			n215 = { "	ÆRkN¼2¼ LíCHN ÆRkN¼2\n	bQÇS mNfSH xND /úB xDRgN¼2¼\n	ÆRk!N ¼2¼LíC>N ÆRk!N¼2¼\n	DNGL çY bML©> xND /úB xDRg!N\n	DNGL çY bML©> kLJ> xS¬RqEN\n_¶HN SNs¥ wÄNt XNDNmÈ\nb?GH LNñR kb@TH úNwÈ\nb?YwT SNdKM XNÄN-Í b›lM\nXRÄN fÈ¶ÃCN c„ mD`n@›lM\n	ÆRkN...\nktfrdBN yÆRnT ?YwT\nkmÈBN mRgM bmBL MKNÃT\nks!åL X|ራT X¾ yÄNB>\nDNGL çY MNg!z@M xYlyN ML©>\n	ÆRk!N...\nxNDnT SÂÈ FQR STmnMN\nbMGÆR SNdKM s!gÖDL XMn¬CN\nb|UCN fቃD wDqN XNÄN-Í\nbM?rTH gÖBßN xNt h#nN tSÍ\n	ÆRkN...\nR~R~t ~l!Â QDST XÂ¬CN\nxúSb! h#Lg!z@ Sl`-!x¬CN\nl!ÃDnN nWÂ KRSèS mät$\nx|M¶N XxM§K DNGL w§Ä!t$\n	ÆRk!N..." },
			n216 = { "Lb@ xb@T bL XNJ xM§k@ s!Èራ\n`-!xTN tWÂ mLµM MGÆR |ራ\nbdl@N xWq& YQR¬ L-YQ\nh#l#N ÒY nHÂ F_rTN y¥TNQ\n	xlQúlh# zwTR xnÆlh#\n	xWqalh# xM§k@ Bz# bDÃlh#\n	lQîÂ Œ,t&N tqbl\"\n	gÖSÌ§ ç¾lh# `-!xT Ãdkm\"\nmNgD t§LØ fÈ¶ xSqyMk#H\nb¸-Í NBrT xM§k@ lw_k#H\nxh#N GN xMß@ Bz# XNdbdLk#H\nM?rTN XNÄg\" YQR¬ lmNk#H\n	xZ½....\ny`-!xT mUr© ðt&N ¹Fñ¬L\n`Yl@ kn@ Rö möM tSñ¾L\nn>Â bðt$ KBR ägS Ãl>\nDNGL LmÂüN xDR> kLJ>\n	xZ½.......\ng#LbT xNt h#n\" mt¥m¾ü\nbdl@N x_ÍL\" h#N xSt¥¶ü\nkbdL XNDRQ XJHN zRUÂ\nÄGM XNÄLbDL x{Â\" bMSUÂ\n	xZ½...." },
			n217 = { "¥r\" YQR bl\" ¥r\"¼2¼\nb`-!xt& B²T wDq&xlh#Â\n	nFs@M l|Uü tgZ¬lCÂ\n	LïÂü ZlÖ bbdL wDq&\n	XNDmlS XRÄ\" FQRHN xWq&\nxZ½....\n	n#éü b›lM fቃD tgNø\n	NS/N XMb! xl bKÍT dNZø\n	xNtW µLmlSkW Lb@N b`YLH\n	`-!xt& Bz# nW xLCLM §YH\nxZ½....\n	l›lM mg²t&N Dµ»N XYÂ\n	¯Bß\" bM?rTH bXMnT XND[Â\n	MGÆÊN xDsH FQR x¯Â{fH\n	xN{tH ?Ywt&N Ln#R bb@TH" },
			n218 = { "b|UCN fቃD y¬\\RN h#§CN¼2¼\nM?rTN XNlMN¼2¼ kc„ xM§µCN¼2¼\nb`-!xT MKNÃT mgÖSöLN xYè¼2¼\nxY=KNM g@¬ ¼2¼ YMrÂL ራRè¼2¼\nMNM BNbDlW `-!xT b!b²BN¼2¼\n¬¥\" nW g@¬CN¼2¼ h#l#N YQR l!lN¼2¼\nSlz!H wgñC KRStEÃñC h#l#¼2¼\nNS/ lmGÆT¼2¼ ²Ê ng xTbl#¼2¼\nl›lM fቃD mñR XNGÄ!H YBቃÂ¼2¼\nlxM§K XNg² ¼2¼ XNmlSÂ¼2¼" },
			n219 = { "›lMN øÊ xyh#T\nh#l#N btራ qmSk#T\nfAä ylM¼2¼ s§M XNdLJ> b@T\nhBT NBrt&N =rSk#Â\ng#Lbt& h#l# dkmÂ\ngÖSÌ§ çNk#\" ¼2¼ dµ¥ yl@lW -@Â\nSቃ xúSቃ tqB§\nmLµ*N xSWÆ tµ*k#§\n²Ê ÈlC\"¼2¼ YHC ›lM xYrÆM B§\nyTÂNTÂ wÄíc&\n²Ê s!çn#\" -§èc&\nÆKß@ qrh#¼2¼ b›lM §Y tNkራTc&\nyxÆt& b@T s!ÂFq\"\nFQ„ M?rt$ TZ s!l\"\nh#l#NM Tc&¼2¼ DNGL çY ²Ê mÈh#\"\nL°M XNDÆL ÆYgÆ\"\nÆRÃW XçN zND b!fQDL\"\ngÖSÌ§W L° dµ¥W L° DNGL çY ²Ê mÈh#\"\nXÂt& xNcEN Nq& Tc&\nyxÆt&N b@T XrSc&\ntsቃyh#\" tNkራtTk#\" LdsT b›lM gBc&\nxÆt& s!Ãy\" tdSè\ngÖrb@èc$N h#l# -Rè\n\\Rg#N dgs¼2¼ ybdLk#TN rSè\nxSk xh#N DrS bDÃlh#\n›lM dHÂ h#\" xBQÒlh#\nwd xÆt& b@T¼2¼ ÄGm¾ tmLšlh#¼3¼" },
			n220 = { "bäT _§ wDqN SNkራtT¼2¼\nbrqqW FQ„ êjN k_ÍT¼2¼\nbgÖLgÖ¬ y¬yW Fo#M mD`n!T\n	¦l@ ¦l@ l#Ã lxNt l`Ãl# g@¬¼2¼\n	Sl¾ têrDK bgÖLgÖ¬\nyäT ¹KM kBìN bÈR SNÆZN¼2¼\nwrd ks¥Y mÈ l!ÃDnN¼2¼\nkÆRnT ¹KM nÉ l!ÃwÈN\n	xZ ......\nMNM ÆLbdlW MNM Æ§-ÍW¼2¼\nh#l#N ¥DrG s!CL dµ¥ yçnW¼2\n?YwTN l!ÃDlN SlwddN nW\n	xZ .....\nXStE xStWl# yFQ„N B²T¼2¼\nbmSqL tsQlÖ X¾N ÃÄnbT¼2¼\nMNM xÒ ylW yg@¬ cRnT" },
			n221 = { "	x¬Wk!\" nFs@ x¬S=nqE\"\n	b›lM mD`n!T bXGz!xB/@R ¬m\"\nêLÃ XNd ¸ÂFQ wd W` MNôC¼2¼\nxb@t$ wd xNt nFs@ ÂfqC¼2¼\n	xZ...\nmc& tnSc& mc& XdRúlh#\nyxM§k@N ðt$N mc& xyêlh#\n	xZ...\ny?YwTN W` XÃS¬wsC\nnFs@ wd ?ÃW xM§K t-¥C¼2¼\n	xZ..." },
			n222 = { "XN¥LD¦lN g@¬ çY\nbxid b@tKRStEÃN tsBsbN\n|ራCNM XNÄ!ቃÂ tg\" b¥:kL b¥:k§CN\n	ynFúcN b@² y›lM mD`n!T\n	lXWnt®C oU lxÄM ?YwT\n	fቃDH TMÈLN b²Êê :lT\n	jMrÂLÂ bSMH olÖT\nxZ...\n	SMHN lmqdS brqEQ M|-!R\n	xNDnT bmçN bmtÆbR\n	XWnTN xg#LtN XNDNÂgR\n	xDlN lh#l#M xM§K yxNtN KBR\nxZ..\n	fቃDH çñLN NbR kX¾ Uራ\n	yjmRnW olÖT FÊN XNÄ!Ãfራ\n	olÖ¬CNNM S¥N g@¬CN çY\n	b?GH tmRtN KBRHN XNDÂY" },
			n223 = { "XNd bdl@¥ kçn QÈt&\nxÃLQM tnGé Bz# nW _Ít&\nXN©L\" fራh#\" xü sWnt&\nXmlúlh#\" XÃLk#\" -êT ¥¬\nzmn@N =rSk#T úSB úmn¬\nMN XmLS YçN yt-ራh# l¬\nb§ü s!ÃNÏBB äT X°N zRGè\n|UüN s!W-W mቃBR tkFè\nynFs@ ¥rðÃ wÁT YçN kè\nYQR ÆY nHÂ ybdl#HN\nxb@t$ g@¬ çY Xn@N Æ¶ÃHN\nYQR bl\"Â LyW ðTHN¼2¼" },
			n224 = { "XNdcRnTH xb@t$ ¥r\"¼2¼\nxNd M?rTHM YQR¬N S-\"¼2¼\nk`-!xt&M xNÉ\" kBz# bdl@¼2¼\nlz!ÃC Kû `-!xT XNÄLçÂT lÖl@@¼2¼\nXn@M xmÉüN bdl@N úWqW¼2¼\nkè y¸ÃDn\" cRntH nW¼2¼\nxNtN BÒ bdLh# KûM xdrGh#¼2¼\nxh#N YQR bl\" kðTH wdQh#¼2¼\nkðTH wDq& SlMN xNtN¼2¼\nmWdq&N tmLkT xM§K BR¦N¼2¼" },
			n225 = { "XÃlf nW zmn@ T:²z#N úLfAM wyW\nln@¼2¼\nb-ራ\" g!z@ MN X§lh# Â BlÖ wd Xn@¼2¼\nbwÈTnt& úL\\ራ XÃyh# xlf\" Bz#\nxZmራ¼2¼\nkXNGÄ!H bm|ራT g@¬ çY Ln#R kxNt\nUራ¼2¼\ny¥SBbT by:lt$ No#? LBN S-\" xb@t$¼2¼\nkT:²ZH Wu bmçN XNÄLqR bkNt$¼2¼\nXNdy|ራW lmKfL bGR¥ mNG|t$\ns!mÈ¼2¼\n¥N YçN y¸öM kðt$ ftÂN ywÈ¼2¼\nXNÄÃSaCh# t-Nqq$ Xyt¥ራCh# kቃl#¼2¼\nYmÈl#Â bXRs# SM xM§K nN y¸l#¼2¼\nT:G|TN bmÃZ h#§Ch# XSk m=ršW -NK„¼2¼\nÃN g!z@ YçÂL bXRs# zND y¥ÄN tGÆ„¼2¼" },
			n226 = { "xÆ¬CN çY yMTñR bs¥Y\nmNG|TH TMÈLN KBRHN XNDÂY¼2¼\nfቃDH bs¥Y ?YwT XNdçn\nXNÄ!h#M bMDR s§MN S-n¼2¼\nS-N l²Ê y:lT MGÆCNN\nbd§CNNM YQR XNDTlN¼2¼\ng@¬ çY x¬GÆN kKÍ ftÂ\nxNt µLrÄ<N `YL ylNMÂ¼2¼\n`YLÂ MSUÂ mNG|TM yxNtW ÂT\nx»N lz§lM Yh#NLN XrFT¼2¼" },
			n227 = { "ysW LJ h#Lg!z@ bÈM dS b!lW¼2¼\ndGäM yuNq$N qN ¥sB tgb! nW¼2¼\nMNM b!dst$ b!b² MÓT¼2¼\nxYqRM bኋ§ mwsD bäT\nCGR b!fራrQ ~zN b!kbN¼2\nkKRSèS FQR ¥NM xYlyN¼2¼\núÂWqW Ä!ÃBlÖS XNÄYnÈ_lN¼2¼\nnQtN XN-BqW yXMnTN sYF YzN" },
			n228 = { "ysW LíC h#§CN XN¥R\nxStÆBrN ¦Y¥ñT kMGÆR\n	ysW LíC h#§CN XN¥R\n	mLµM |ራ bm|ራT XNn#R\n	ysYÈN DL mNš yKBR mWrš\n	¦Y¥ñT ÂTÂ XWnt¾ Uš\nxZ ....\n	lXWnt¾ |ራ h#§CN XNbR¬\n	ÚDቃN s¥:¬TN xDRgN mk¬\nxZ ....\n	FÄ ›lMN xLfN XNDNÿD h#§CN\n	iNtN mg\"T nW b¦Y¥ñ¬CN\nxZ.....\n	XMn¬CN h#l# Yh#N bfÈ¶\n	YQR ÆY nWÂ fAä m/¶\nxZ..." },
			n229 = { "yxêJ nU¶ ቃL bbr¦ xyl\nyXGz!xB/@RN mNgD xStµKl# XÃl\nMSKRnt$N ×/NS µSrÄN\nLÆCN lg@¬ mLµM mNgD Yh#N\n	ydÂGL mmk!Ã ynb!ÃT gÄM\n	;Wd ›mt$N ÆRk!LN DNGL ¥RÃM\ntራራW ZQ YbL -¥¥WM YQÂ\nµltStµkl mNgD ylMÂ\nyXGz!xB/@RN mNgD XNm|RT h#§CN\n¥lðÃ XNÄ!çnN lmuW hB¬CN\n	xZ ....\nKÍTÂ tN÷L kLÆCN Y_Í\nADQÂ R~ራÿ b¾ §Y YSÍÍ\n|UÂ dMHN bKBR xG\"tÂL\n?YwT XNÄ!çnN xM§K t¥AnÂL\n	xZ ....\nh#lT LBîC Ãl#T k¥B²T LBSN\nll@lW ÃDlW h#lt¾WN\nkbd§CNM xNÉN xdራHN\nbKû XNÄN-Í X¾ ÆéCHN\n	xZ ...." },
			n230 = { "QÇúN bÑl# kxM§K x¥LÇN\nLN-Í nWÂ bZè bd§CN¼4¼\nÚDቃN s¥:¬T No#/N h#§Ch#\nSl XGz!xB/@R mNG|T ›lMN\nNቃCh#¼4¼\nls¥ÃêE KBR lxKl!L ybቃCh#\nwd xM§K xQRb# bAn# ML©Ch#¼4¼\nDNGL XÂ¬CN k!Än M?rT\nQDSt QÇúN yÚDቃN XÂT¼4¼\nR~R~t ~l!Â xúSb! kLJ>\nYQR¬ XNDÂg\" bFo#M LmÂ>¼4¼" },
			n231 = { "MGÆRM xL\\ራh# XMnTM gÖdl\"\nbቃLH xNiH b?YwT xq$m\"\n`-!xT yUrd\" dµ¥ n\"Â\nxSb\" xM§K çY b¦Y¥ñT LIÂ\nxNú\" bM?rTH fI» XNÄL-Í\nb|UêE DµM bqb!I tSÍ\nbQÇúN m§XKT ðTH b¸öÑ\nbDNGL XÂTH bxKÆ¶t k¤l#\nbQÇúNÂ bÉDቃN s¥:¬T\nbቃL k!ÄÂcW xDn\" k_ÍT\nlqdÑT xbW bgÆ,W k!ÄN\nxq$m\" bq\"H bm=ršW qN\nMNM BbDLH `-!xT b!nG|B\"\nSlwÄíCH xM§K YQR bl\"\nLïÂüN xNÉW ?Ywt&M T¬dS\nxq$m\" bq\"H FQRHN XNDqMS\nb|UH bdMH yçNKL\" b@²\nTh#T sW xDRg\" lxNt yMg²" },
			n232 = { "xBR¦MN kµራN y-ራ<W g@¬\nlÑs@ bs!Â yçNkW mk¬\nL-Í nWÂ b|U F§gÖT\nyYS/QM b@² ?Ywt&N ¬dUT¼2¼\nyx@RTራN Æ?R b`YLH ykfLK\nbs!Â br¦ ?ZBHN ymgBK\nñ~ k_ÍT W` yÄnBH xM§K\nlÖ_N XNÄÄNkW Fo#M M?rTHN §K¼2¼\nytnb†LH nb!ÃT bÑl#\nxM§K sW YçÂL YwlÄL s!l#\nk›œ xNb¶ çD ×ÂSN ÃwÈH\n›lM LTW-\" nW xYly\" oUH¼2¼\n|UN tê?dH bwsNKW s›T\nyäTKL\" xM§K ÃÄNk\" käT äT\nXNdwNg@LH ?G yMñR xDRg\"\nbm=ršW qN bq\"H XNDg\"¼2¼\nxLÒLk#\"MÂ LfIM ?GHN\ny/êRÃT xIÂ\" S-\" BR¬THN\nMGÆr gÖdlÖ ç¾lh#\"Â\nyQÇúN xM§K XRÄ\" XNDiÂ¼2¼" },
			n233 = { "mNgDHN xúy\" XktL¦lh#\nYHN kNt$ ›lM Sl xNt Xtêlh#\nbXWnT YQR bl\"¼2¼ Bz# bDÃlh#\n	`-!xt& XJG bZè ¥yT tSñ¾L\n	BR¦n@ -FèB\" =l¥W kï¾L\n	kራS ig#Ê bZè yn@¥ bdL\n	Lb@ T¬\" ÿdC xlm¬dL\nxZ...\n	=l¥ z#¶Ãü BR¦N yl@lbT\n	y›lM Gøt¾ xdrg\" `-!xT\n	Lb@ ¬|é qRaL bM®T gmD\n	nFs@M tSኗ¬L mWÈT kw_mD\nxZ...\n	|Uü x¹Næ\" kmNgÁ xW_è\"\n	XGÊ XNÄYራmD g#Lbt& dKäB\"\n	kDµÑ B²T |Uü xNq§Í\n	nFs@ çY tml> xTq$rÀ tSÍ\nxZ...\n	`-!xt& tuñ\" ¹KÑ kBìB¾L\n	bbdL mñÊ xh#N oAè¾L\n	b›lM SÆZN xM§K xG\"è¾L\n	ራSHN lµHN xúY BlÖ¾L" },
			n234 = { "xÆ¬CN çY yh#§CN g@¬¼2¼\nQÇS mNfSH xYራqN È*T ¥¬¼2¼\nwdxNt mLsW ysWN Lb#Â¼2¼\nÆ§wqW mNgD xRs# ÿÄ*LÂ\nXZn Lb#ÂHN wd X¾ xzNBL¼2¼\nYQR¬ LN-YQ kðTH ömÂL\nYQR¬ LN-YQ kðtH yömnW¼2¼\nm/¶ mçNKN SlMÂWQ nW\nT:GSTH sð nW xÃLQM M?rTH¼2¼\nyFQR Ælb@T YQR ÆY xNt nH\nxYè XNÄ§y ¬LfêlH h#l#N¼2¼\nm›t$M M?rt$M h#l#M ÃNtW s!çN\n|LÈNH rqEQ nW xYmrmRM¼2¼\nzmNÂ wራT l!>„T xYCl#M\nyFQR Ælb@T c„ xM§µCN¼2¼\nxD»N lNs/ S-N lh#§CN\nXN¥LDhlN blQî b`zN¼2¼\nyYQR¬H B²T k¾ UR xNÄ!çN" };

	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("192. yTYçN mGb!Ãü")) {
				loadChild(n192);
			} else if (HoldItem.equals("193. xLtw\"M g@¬")) {
				loadChild(n193);
			} else if (HoldItem.equals("194. brqqW FQRH")) {
				loadChild(n194);
			} else if (HoldItem.equals("195. xb@t$ xNtN X-ራlh#")) {
				loadChild(n195);
			} else if (HoldItem.equals("196. xb@t$ fÈ¶ÃCN")) {
				loadChild(n196);
			} else if (HoldItem.equals("197. xM§k@ çY")) {
				loadChild(n197);
			} else if (HoldItem.equals("198. g!z@ü XSk!dRS")) {
				loadChild(n198);
			} else if (HoldItem.equals("199. dµ¥W LJHN")) {
				loadChild(n199);
			} else if (HoldItem.equals("200. xb@t$ bmNG|TH xSb\"")) {
				loadChild(n200);
			} else if (HoldItem.equals("201. g@¬ ÃlW")) {
				loadChild(n201);
			} else if (HoldItem.equals("202. Ns/ XNGÆ")) {
				loadChild(n202);
			} else if (HoldItem.equals("203. M?rTH yb²")) {
				loadChild(n203);
			} else if (HoldItem.equals("204. n# XNQrB")) {
				loadChild(n204);
			} else if (HoldItem.equals("205. xD~nn")) {
				loadChild(n205);
			} else if (HoldItem.equals("206. xND g!z@ yxGz!xB/@R ç¾lh#")) {
				loadChild(n206);
			} else if (HoldItem.equals("207. xYdlM MDራê")) {
				loadChild(n207);
			} else if (HoldItem.equals("208. wd ?YwT mNgD")) {
				loadChild(n208);
			} else if (HoldItem.equals("209. c„ mD`n@›lM")) {
				loadChild(n209);
			} else if (HoldItem.equals("210. wÄNt XsGÄlh#")) {
				loadChild(n210);
			} else if (HoldItem.equals("211. §YqR mäT")) {
				loadChild(n211);
			} else if (HoldItem.equals("212. mmk!Ãü xNt nH")) {
				loadChild(n212);
			} else if (HoldItem.equals("213. xl\"¬CN")) {
				loadChild(n213);
			} else if (HoldItem.equals("214. Á¥S çY tmlS")) {
				loadChild(n214);
			} else if (HoldItem.equals("215. ÆRkN")) {
				loadChild(n215);
			} else if (HoldItem.equals("216. Lb@ xb@T bL XNJ")) {
				loadChild(n216);
			} else if (HoldItem.equals("217. ¥r\"")) {
				loadChild(n217);
			} else if (HoldItem.equals("218. M?rTN XNlMN")) {
				loadChild(n218);
			} else if (HoldItem.equals("219. ›lMN øÊ")) {
				loadChild(n219);
			} else if (HoldItem.equals("220. bäT _§ wDqN")) {
				loadChild(n220);
			} else if (HoldItem.equals("221. x¬Wk!\" nFs@")) {
				loadChild(n221);
			} else if (HoldItem.equals("222. XN¥LD¦lN")) {
				loadChild(n222);
			} else if (HoldItem.equals("223. XNd bdl@¥")) {
				loadChild(n223);
			} else if (HoldItem.equals("224. XNdcRnTH")) {
				loadChild(n224);
			} else if (HoldItem.equals("225. XÃlf nW zmn@")) {
				loadChild(n225);
			} else if (HoldItem.equals("226. xÆ¬CN çY")) {
				loadChild(n226);
			} else if (HoldItem.equals("227. ysW LJ h#Lg!z")) {
				loadChild(n227);
			} else if (HoldItem.equals("228. ysW LíC h#§CN XN¥R")) {
				loadChild(n228);
			} else if (HoldItem.equals("229. yxêJ nU¶ ቃL")) {
				loadChild(n229);
			} else if (HoldItem.equals("230. QÇúN bÑl#")) {
				loadChild(n230);
			} else if (HoldItem.equals("231. MGÆRM xL\\ራh#")) {
				loadChild(n231);
			} else if (HoldItem.equals("232. yQÇúN xM§K")) {
				loadChild(n232);
			} else if (HoldItem.equals("233. mNgDHN xúy\"")) {
				loadChild(n233);
			} else if (HoldItem.equals("234. xÆ¬CN çY")) {
				loadChild(n234);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T113(this, ParentList,
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
		text.setText("መዝሙረ ንስሐ");
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

	public void shareApplication() {
		ApplicationInfo app = getApplicationContext().getApplicationInfo();
		String filePath = app.sourceDir;
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("*/*");
		intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
		startActivity(intent.createChooser(intent, "Share app via"));
	}

	private void loadChild(String[] ParentElementsName) {
		ChildList = new ArrayList<String>();
		for (String model : ParentElementsName)
			ChildList.add(model);
	}

	public class T113 extends BaseExpandableListAdapter {

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

		public T113(Activity context, List<String> Items,
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

				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 1) {

				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/194-Berekekew Fikreh.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/195-Abetu Anten Eteralehu.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {

				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/197-Amlake Hoy.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/198-Gizeye Eskiders.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/199-Dekamaw Lejehen.mp3");

			} else if (childPosition == 0 && groupPosition == 8) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 10) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/205-Adhenene.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/206-And Gize Yeziabhear Hognalehu.mp3");
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/207-Aydelem Medrawi.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/208-Wede Hiwot Menged.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/209-Cheru MedhaneAlem.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/210-Wedante Esegdalehu.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/211-Layker Memote.mp3");
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/212-Memekiye Ante Neh.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/213-Alegntachen.mp3");
			} else if (childPosition == 0 && groupPosition == 22) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/215-Barken.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 25) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/217-Maregn.mp3");
			} else if (childPosition == 0 && groupPosition == 26) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 27) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 28) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/220-Bemot Tela Wedken.mp3");
			} else if (childPosition == 0 && groupPosition == 29) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/221-Atawekign Nefse.mp3");
			} else if (childPosition == 0 && groupPosition == 30) {
				Toast.makeText(context, "መዝሙር የለዉም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 31) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/223-Ende Bedelema.mp3");
			} else if (childPosition == 0 && groupPosition == 32) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/224-Endecherneteh.mp3");
			} else if (childPosition == 0 && groupPosition == 33) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/225-Eyalefe New Zemene.mp3");
			} else if (childPosition == 0 && groupPosition == 34) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/226-Abatachin Hoy.mp3");
			} else if (childPosition == 0 && groupPosition == 35) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/227-Yesew Lej Hulgize.mp3");
			} else if (childPosition == 0 && groupPosition == 36) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/228-Yesew Lejoch Hulachen Enemar.mp3");
			} else if (childPosition == 0 && groupPosition == 37) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/229-Yawaj Negari Kal.mp3");
			} else if (childPosition == 0 && groupPosition == 38) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/230-Kidusan Bemulu.mp3");
			} else if (childPosition == 0 && groupPosition == 39) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/231-Megbarem Alserahu.mp3");
			} else if (childPosition == 0 && groupPosition == 40) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/232-Yekidusan Amlak.mp3");
			} else if (childPosition == 0 && groupPosition == 41) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz1/233-Mengedhen Asayegn.mp3");
			} else if (childPosition == 0 && groupPosition == 42) {
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
