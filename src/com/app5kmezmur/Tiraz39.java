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

public class Tiraz39 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("119.	የምእመናን አባት");
		ParentList.add("120.	ጸለዩ ባስልዮስ ወጎርጎርዮስ ");
		ParentList.add("121.	ይቤሎ ጴጥሮስ");
		ParentList.add("122.	ተክለ ሃይማኖት ተወለዱ");
		ParentList.add("123.	አረጋዊ ምሉዓ ፍቅር");
		ParentList.add("124.	ደምፀ ወተሰብከ");
		ParentList.add("125.	ሰላም ለክሙ");
		ParentList.add("126.	እስጢፋኖስ ሰማዕት");
		ParentList.add("127.	ሰአለ ሥርየተ ኃጢአት");
		ParentList.add("128.	እንዘ ይነብር በየማኑ ");
		ParentList.add("129.	ግሩማን መላእክት ");
		ParentList.add("130.	ዘአጽናእኮሙ");
		ParentList.add("131.	ኀዲጎ ብእሲቶ");
		ParentList.add("132.	ጥምቀተ አምጽአ ");
		ParentList.add("133.	ለባርኮትነ ንኡ");
		ParentList.add("134.	 በመንፈስ የሐውር");
		ParentList.add("135.	ያሬድ ካህን (ዕዝል ዜማ)");
		ParentList.add("136.	በጽድቅ የሚያምኑብህ (ዕዝል ዜማ)");

	}
	// Assign children list element using string array.

	String[] n119 = { "yMXmÂN xÆT xgLUY yxM§K ÆlàL mRöÊãS ¼2 ¼\ntqbl ²Ê ¼4¼ xKl!l s¥:¬T ¼2 ¼ %ኸ " },
			n120 = { "[l† ÆSL×S w¯R¯R×S ^b |:l# lQÇS mRöÊãS ¼2¼\ndnn |:L ¼2¼ zmRöÊãS km åç zYBL \nwtf|ሑ ÆSL×S w¯R¯R×S ¼2¼\n[l† ÆSL×SÂ ¯R¯R×S wd |:l# lQÇS mRöÊãS ¼2¼\nZQ xl |:L ¼2¼ ymRöÊãs xb@T XNd¸L \ntdst$ ÆSL×S ¯R¯R×SM ¼2¼" },
			n121 = { "Yb@lÖ ’@_éS lÔWlÖS _Æ:k@ Xኁy ÔWlÖS ¼2¼\nwx!TÂFQ x!NmWT ÄGm XMZ ÄGm ¼2¼\n\nTRg#MÝ( ’@_éS ÔWlÖSN wND» ÔWlÖS çY =KN xT-‰-R kXNግÄ!h ÄGm¾ xNäTMÂ xlW" },
			n122 = { "tKl ሃY¥ñT twlዱ XsY XsY ¼2¼\ny›lM BR¦N ¼2¼ y{DQ ]/Y ¼2¼ Ælàl# yxM§K xgLUY ¼2¼" },
			n123 = { "xrUêE Ml#› FQR km {g@rÄ zYw}X XM xûh# ዕÈn QDSÂ ¼2¼\nlgb!r \\ÂY zYw{: km ¥Y MSl gBr KRSèS ¼2¼\n\nTRg#MÝ( kxNdbt$ XNd {g@ÊÄ yQDSÂ mLµM >¬ ¼”L¼ y¸wÈ FQRN ytm§ xrUêE kgBrKRSèS UR lb¯ |‰ XNd W` YwÈLÝÝ" },
			n124 = { "dM] wtsBk ¼2¼ WSt ›lM ¼2¼\nz@Â MGÆ„ T„F lxrUêE ¼4¼\n\nTRg#MÝ( T„ÍTN y¸\\‰ yxrUêE yMGÆ„ \nygDl# z@Â b›lM ts¥ tsbkÝÝ" },
			n125 = { "s§M lKÑ ÚD”N ወs¥:¬T Xl xXrFKÑ bሃY¥ñT ¼2¼\nmê:Ãn ›lM xNTÑ XSm bBዙ~ T:GST \nsxl# QDm fÈ¶ bk#l# s›T               ¼2¼\n\nTRg#MÝ( b¦Y¥ñT çÂCh# ÃrÍCh# ÚD”N s¥:¬T FQR s§M¬ ይgÆC“L ›lMን bBz# T:GST DL ynœch# XÂNt ,#L g!z@ bfÈ¶ ðT lMn#LNÝÝ" },
			n126 = { "XS-!ÍñS s¥:T l!q Ä!ÃöÂT bMXmÂN ytëMK ¼2¼\nyxM§KHN T:²Z b|‰ yf]MK ¼4¼" },
			n127 = { "ሰxለ ሥርየተ ኃጢአት ለእለ ወገርዎ ¼2¼\nወይቤ ሥረይ ሎሙ ዘንተ ኃጢአቶሙ ¼4¼\n\nትርጉምÝ( ለወገኖቹ የኃጢአት ስርየት ለመነ ኃጢአታቸውንም ይቅር በላቸው አለ ¼ቅ.እሰጢፋኖስ¼" },
			n128 = { "XNz YnBR lxB by¥n# wYrFQ WSt H}n# y¥n# lxB ¼2¼\nR:y wLd R:y b›Yn# XS-!ÍñS ¼2¼Ml#› _bB¼2¼\n\nTRg#MÝ( _bBN ytä§ XS-!ÍñS wLDN bxB q\" tqMõ bxB XQF ¼:¶Â¼ s!msgN b›Yn# xyW" },
			n129 = { "ሃl@ l#Ã G„¥N m§XKT s#‰ØL wk!„b@L Xl xKÂðçÑ nbLÆL ¼2¼\nwrÇ ×M YTqbl#k bB£L x¥N ገብረ መንፈስ ቅዱስ gÆÊ `YL ¼2¼\n\nTRg#MÝ( KNæÒcW nbLÆL yçn# y¸ÃSf„ m§XKT s#‰ØLÂ k!„b@L ገብረ መንፈስ ቅዱስ bXWnT txMr¾ ¼gÆÊ `YL¼ nH XÃl# l!qbl#H wrÇÝÝ" },
			n130 = { "zx{ÂX÷Ñ lXÑNt$ xbêEn lÿñK wx@LÃS ¼2¼\nxNt x{Nxn bmNfS QÇS ¼2¼\nÃ]ÂhcW lXnRs# xÆèÒCNN lÿñKÂ x@LÃS¼2¼\nxNt x{ÂN bmNfS QÇS ¼2¼" },
			n131 = { "^ዲጎ ብእሲቶ መኒኖ መንግ|ቶ ¼2¼\nዘፈለሰ¼3¼ መኒኖ መንግ|ቶ ¼2¼ãኸ\n\nትርጉምÝ( ሚስቱን ትቶ መንግ|ቱን ትቶ መነነ ¼ገብረ ክርስቶስ¼" },
			n132 = { "_Mqt xM{x ?}w NG|T lእl!xh#\nXM^b ðl!ÕS D~r t-Mq ll!h#\ns§¥ xb#n አM{x ln b:D»h# lmD`n!n \nMS-!r dÑ w|Uh#\n\nTRg#MÝ( yNG|tEt$ ©NdrÆ bðLÕS zND ‰s# kt-mq b“§ _MqTN xmÈLN¿ xÆ¬CN xb#n s§¥M bzmn# ymD`n!¬CNN ydÑNÂ y|UWN MS-!R xmÈLNÝÝ" },
			n133 = { "s§M lKሙ እንጦንስ ወመቃርስ xቢብ ሲኖዳ ገብረ መንፈስ ቅዱስ ¼2¼\nለባርኮትነ ንኡ ውስተ ጽር/ ዛቲ መቅደስ \nተክለ ¦ይማኖት አኖሬዎስ ኤዎስጣt&ዎስ   2\nሳሙኤል ተክለ አልፋ በብኑዳ ኪሮስ " },
			n134 = { "bmNfS y/WR XM `YL WSt `YL ¼2¼\nµHN ¼2¼ wnb!Y ¼2¼ ×/NS m_MQ ¼2¼\n\nTRg#MÝ( ከኃይል ወደ `ይል በመNፈስ ሄደ ካህንና ነቢይ ዮሐንስ መጥምቅ" },
			n135 = { "ያሬድ ካህን አንደበተ ማር\nእውነተኛ መምህር\nበጣፈጠ ዜማ በጠለቀ ምስጢር\nለአምላኩ ሲዘምር\nመላእክት በሰማይ ላይ\nቅዱሳንም በምድር\nይታዩት ነበር ሲዘምሩ በክብር ¼2¼" },
			n136 = { "በጽድቅ የሚያምኑብህ ቅዱሳን በሙሉ\nካንተ ባገኙት ኃይል ሁሉን ያደርጋሉ\nእስራኤልን መርቶ ሙሴ ከግብፅ ሲያወጣ\nቢከታተላቸው ፈርዖንም በቁጣ\nባሕሩን ከፍሎ ሙሴ ሕዝቡን አሻገረ\nከሠራዊቱ ጋር ፈርዖን ሰጥሞ ቀረ\nአዝ...\n	ጎልያድ ሲፎክር ተማምኖ በኃይሉ\n	የሚገጥመው ጠፍቶ ሁሉም ፈርተው ሳሉ\n	ብላቴናው ዳዊት ከእረኝነት መጥቶ\n	በአንድ ጠጠር ጣለው በአምላኩ ስም ወጥቶ\nአዝ...\nየእግዚአብሔርን መንፈስ ደፍረው ሊያታልሉ\nሐናንያና ሚስቱ በሐሰት ሲምሉ\nልባቸውን አውቆ ጴጥሮስ ገሠጻቸው\nበሞት ተቀሰፉ አንድ ሆነ ቀብራቸው\nአዝ...\n	ጳውሎስና ሲላስ በእስር ቤት ተጥለው\n	ሲዘምሩ ሳለ መከራውን ችለው\n	ተናወጠ ወሕኒው እስከ መሠረቱ\n	በጸሎታቸው ኃይል ከእስራት ተፈቱ\nአዝ..." };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("119.	የምእመናን አባት")) {
				loadChild(n119);
			} else if (HoldItem.equals("120.	ጸለዩ ባስልዮስ ወጎርጎርዮስ ")) {
				loadChild(n120);
			} else if (HoldItem.equals("121.	ይቤሎ ጴጥሮስ")) {
				loadChild(n121);
			} else if (HoldItem.equals("122.	ተክለ ሃይማኖት ተወለዱ")) {
				loadChild(n122);
			} else if (HoldItem.equals("123.	አረጋዊ ምሉዓ ፍቅር")) {
				loadChild(n123);
			} else if (HoldItem.equals("124.	ደምፀ ወተሰብከ")) {
				loadChild(n124);
			} else if (HoldItem.equals("125.	ሰላም ለክሙ")) {
				loadChild(n125);
			} else if (HoldItem.equals("126.	እስጢፋኖስ ሰማዕት")) {
				loadChild(n126);
			} else if (HoldItem.equals("127.	ሰአለ ሥርየተ ኃጢአት")) {
				loadChild(n127);
			} else if (HoldItem.equals("128.	እንዘ ይነብር በየማኑ ")) {
				loadChild(n128);
			} else if (HoldItem.equals("129.	ግሩማን መላእክት ")) {
				loadChild(n129);
			} else if (HoldItem.equals("130.	ዘአጽናእኮሙ")) {
				loadChild(n130);
			} else if (HoldItem.equals("131.	ኀዲጎ ብእሲቶ")) {
				loadChild(n131);
			} else if (HoldItem.equals("132.	ጥምቀተ አምጽአ ")) {
				loadChild(n132);
			} else if (HoldItem.equals("133.	ለባርኮትነ ንኡ")) {
				loadChild(n133);
			} else if (HoldItem.equals("134.	 በመንፈስ የሐውር")) {
				loadChild(n134);
			} else if (HoldItem.equals("135.	ያሬድ ካህን (ዕዝል ዜማ)")) {
				loadChild(n135);
			} else if (HoldItem.equals("136.	በጽድቅ የሚያምኑብህ (ዕዝል ዜማ)")) {
				loadChild(n136);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T39(this, ParentList,
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

	public static class T39 extends BaseExpandableListAdapter {
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

		public T39(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/119-Yememenan Abat.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/120-Tseleyu Basleyos weGorgoryos.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/121-Yibelo Petros.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/122-Tekle Hayimanot teweledu.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/123-Aregawi milua fikir.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/124-Demtse wetesebke.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/126-Estifanos Semaet.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/127-Se'ale siryete hatiat.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/128-Enze yinebir beyemanu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/130-Zeatsenaekomu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/131-Hadigo besito.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/132-Timkete amtse'a.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/133-Lebarikotine ne'u.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/134-Bemenfes yehawur.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/135-Yader kahin.mp3");
							} else if (childPosition == 0
									&& groupPosition == 17) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/136-Betsedik yemiyamnubih.wma");
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