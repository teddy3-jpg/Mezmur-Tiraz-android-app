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

public class Tiraz411 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("188.	እንተ ተሐንፀት በስሙ");
		ParentList.add("189.	ሕንፄሃ አዳም");
		ParentList.add("190.	ለዛቲ ቤት");
		ParentList.add("191.	 በደምህ ዋጅተህ ");
		ParentList.add("192.	ተዋሕዶ");
		ParentList.add("193.	ሃሌ ሉያ (ቁም ዜማ) ");
		ParentList.add("194.	ንዑ ንሑር ");
		ParentList.add("195.	ጥንታዊቷ መጀመሪያይቷ ");
		ParentList.add("196.	ንዑ ንስግድ");
		ParentList.add("197.	ሐዋርያት የሰበኩሽ ");
		ParentList.add("198.	ቤተ ክርስቲያን ባሕረ ጥበባት");
		ParentList.add("199.	ሰላም ለኪ ");
		ParentList.add("200.	ትሴብሃከ");
		ParentList.add("201.	አፍላገ ግዮን");
		ParentList.add("202.	ያርሁ ክረምተ");

	}
	// Assign children list element using string array.

	String[] n188 = { "እንተ ተሐንፀት በስሙ ወተቀደሰት በደሙ ቤተ ክርስቲያን /፪/\nወተአትበት/፪/ በዕፀ መስቀሉ እስመ ኃይለ እግዚአብሔር ላዕሌሃ /፪/\n\nትርጉም ፡- በስሙ የታነፀች በደሙም የተቀደሰች በመስቀሉም የተባረከች ቤተ ክርስቲያን ነች የእግዚአብሔርም ኃይል በላይዋ አለ፡፡\n\n    የሚዘመርበት ቀን: ሰኔ 21 ሕንፀታ" },
			n189 = { "ሕንፄሃ አዳም/፪/ ሕንፃሃ ለቤተ ክርስቲያን /፪/\nሐመልማለ ወርቅ /፪/ገበዋቲሃ ሐመልማለ ወርቅ/፪/\n\nትርጉም፡- የቤተ ክርስቲያን ሕንፃዋ የሚያምር ዙሪያዋም የወርቅ ሐመልማል ነው፡፡\n\n     የሚዘመርበት ቀን: ሰኔ 21 ሕንፀታ" },
			n190 = { "ለዛቲ ቤት ሣረራ አብ ለዛቲ ቤት ሐነፃ ወልድ /፪/\nወፈጸማ መንፈስ ቅዱስ /፬/ ኧኸ \n\nትርጉም፡-ይህችን ቤት አብ መሠረታት  ወልድም አነፃት፡ መንፈስ ቅዱስም ፈፀማት/አፀናት/፡፡\n    የሚዘመርበት ቀን: ሰኔ 21 ሕንፀታ " },
			n191 = { "በደምህ ዋጅተህ ያፀናሃትን\nጠብቅልን ቤተ ክርስቲያንን 	/፪/\n   አዝ...\nጽዮንን ክበቧት ደጆቿንም ዙሩ\nሲል ያመሰገናት ዳዊት በመዝሙሩ /፪/\n   አዝ...\nወልድ ዋሕድ ብሎ ዼጥሮስ ሲመሰክር\nመሠረት ነህ ብለህ ሰጥተኸዋልና ክብር /፪/\n   አዝ...\nእመሠርታለው በአንተ መሠረት \nየሲኦል አበጋዝ አይችልም ለማጥፋት /፪/\n   አዝ...\nየቅዱሳን ሀገር የአምላክ ማደሪያ \nምዕራገ ጸሎት የኃጢአት ማስተሰሪያ /፪/\n   አዝ..." },
			n192 = { "ተዋሕዶ ተዋሕዶ ሰማያዊት\nየፀናች እምነት የፀናች እምነት ሃሌ ሉያ\nተዋሕዶ ተዋሕዶ መንፈሳዊት\nየመንፈስ መብራት የመንፈስ መብራት ሃሌ ሉያ	\nተዋሕዶ ተዋሕዶ መለኮት\nንጽሕት እምነት ንጽሕት እምነት ሃሌሉያ\nበአንቺ ቢያምኑ በአንቺ ቢያምኑ ቅዱሳን\nድል ነሱት ሰይጣንን ድል ነሱት ሰይጣንን ሃሌሉያ\nበአንቺ ቢያምኑ በአንቺ ቢያምኑ ሰማዕታት\nተፈተኑ በእሳት ተፈተኑ በእሳት ሃሌሉያ\nእንደ ወርቅ እንደ ወርቅ ተፈትነው\nአበራ ገድላቸው አበራ ገድላቸው ሃሌሉያ\nእንኑር እንኑር በእምነታችን \nበተዋሕዶ መክበሪያችን በተዋሕዶ መክበሪያችን ሃሌ ሉያ" },
			n193 = { "ሃሌ ሉያ /፬/ ኢትስግቡ ለክሙ መዝገብ ዘበምድር\nሃበ ይበሊ  ወይማስኑ  አላ ስግቡ ለክሙ ዘሀለውክሙ\nበምድር መዝገበ ዘበሰማይ  ሃበ ኢይበሊ ወኢይማስን\nሃሌ ሉያ /፬/ አታዘጋጁ ሁላችሁም የምድር ገንዘብን\nየሚለወጠውን የሚጠፋውን አዘጋጁ ሁላችሁ \nያላችሁ በምድር የሰማይ ገንዘብን\nየማይለወጠውን የማይጠፋውን" },
			n194 = { "ንዑ ንሑር ዘልፈ ሀበ ቤተ ክርስቲያን ዘሀለውክሙ ውስተ \nጽልመት እስመ ወአካ ይእቲ ወብርሃን ቤተ ክርስቲያን ዘሐነፃ \nልዑል በቃሉ ከመ ትኩን መድኃኒት ለዓለም\nኑ እና እንሂድ ወደ ቤተ ክርስቲያን ያላችሁ በኃጢአት መብራት \nናትናብርሃንም ናትና ቤተ ክርስቲያን ያነፃትም ክርስቶስ በቃሉ \nእንድትሆን መድኃኒት ለዓለም\nኑ  እንሂድ ቤተ ክርስቲያን /፪/\nመብራትና ብርሃን ነችና /፪/\n   አዝ...\nጌታ በቃሉ ያነፃት/፪/\nእንድትሆን ቤዛ ለሁሉ ዓለም /፬/\n   አዝ..." },
			n195 = { "ጥንታዊቷ መጀመሪያይቷ\nየነቢያት የሐዋርያት\nየጻድቃን የሰማዕታት\nእምነታችን እንከን የሌላት\nተዋሕዶ ነሽ እምነቲቱ እንከን አልባይቱ\nየተስፋው ቃል ኪዳን ዘመኑ ሲፈፀም\nአምኖ የዳነብሽ ቀዳማዊው አዳም\nእምነቲቷ እንከን አልባይቷ\nበሊቃውንቶችሽ ችሎታና ሙያ\nድል የተጎናፀፍሽ በቁስጥንጥንያ\nእንደ ዲዮስቆሮስ እንደ አትናቴዎስ\nደጋግመሽ ውለጂ እናት ኦርቶዶክስ\nኃይልና ጥበብን አምላክ ያሳየብሽ\nየማዳን ሥልጣኑ በዓለም ያወጀብሽ\nጉባዔ ኒቅያ ጉባዔ ኤፌሶን\nአወጁ በዓለም ላይ ተዋሕዶ እምነትን\nመጽሐፉ እንደሚለው ሃይማኖት እንዲት ናት\nዋጋ የምታሰጥ የቅዱሳን እናት" },
			n196 = { "ንዑ /፪/ ንስግድ ኩልነ /፪/\nማኅደረ ሰላምነ ቤተ ክርስቲያን/ኢትዮዽያ /፬/\n\nትርጉም፡- ኑ የሰላማችን መገኛ ወደ ሆነች ወደ ቤተ ክርስቲያን ሁላችንም እንስገድ፡፡" },
			n197 = { "ሐዋርያት የሰበኩሽ ሰማዕታት የሞቱልሽ\nጻድቃንም የከበሩብሽ ተዋሕዶ ርትዕት ነሽ  /፪/\nመንፈስ ቅዱስ ወዶ ፈቅዶ\nፊልጶስን ጋዛ ሰዶ\nለጃንደረባው ያሰበከሽ\nተዋሕዶ ሃይማኖት ነሽ /፪/\nየቀደመች ጽኑ መንገድ\nየሰማዕታት የጽድቅ እምነት\nበሰማይና በምድር ያለሽ	\nየቅዱሳን ሃይማኖት ነሽ   /፪/\nጠላት ዲያብሎስ ቢቃወምም\nቀስቱን ቢጨርስ ቢፋለምም\nየጸናሽውን በጌታ ደም\nየሚረታሽ ማንም የለም /፪/\nየአትናትዮስ ልዩ ግርማ\nየቄርሎስ የሰላማ\nየአበው ቅርስ የሊቃውንት	 \nተዋሕዶ ቅድስት እምነት  /፪/\nየቅዱስ ያሬድ ጥዑም ዜማ\nየተክለ ሃይማኖት የገሪማ\nየአባ ጊዮርጊስ ዘጋስጫ    /፪/\nየጽድቅ የሰላም ነሽ እንግጫ\nበቅዱስ ጴጥሮስ መሠረት ላይ\nመሥርቶሻል አዶናይ\nየኑፋቄ ጦር ቢከፈትም	     \nየገሃነም ደጆች አይችሉሽም  /፪/	 \nአንድ ሃይማኖት አንዲት ጥምቀት\nወልድ ዋሕድ ሁለት ልደት\nቤተ ክርስቲያን ተሕዋዶ	  	\nየሠራልን አምላክ ፈቅዶ  /፪/\nየሰው ልጅ ሁሉ በአንቺ አምኖ	\nዘለዓለም ኑሪ ግርማሽ ገኖ      /፪/" },
			n198 = { "ቤተ ክርስቲያን ባሕረ ጥበባት  /፪/\nአትመረመርም እጅግ ጥልቅ ናት /፪/ ኧኸ\nበሥጋዊ ጥበብ ለማወቅ ቢቃጣ \nየእምነት መነጽሩን ይዞ ስላልመጣ  /፪/ \nአንዳንዱ በክህደት /፪/ ፈጣሪውን አጣ /፪/\nእንመሰክራለን ፈጣሪያችን አለ \nእንመሰክራለን አማኑኤል አለ	/፪/\nእንመነው አንካደው አማኑኤል ቸር ነው /፪/\nእንመሰክራለን ድንግል አማላጅ ናት\nእንመሰክራለን ማርያም አምላጅ ናት     /፪/\nእንመናት አንካዳት የአምላክ እናት ናት/፪/" },
			n199 = { "ስላም ለኪ በሰጊድ ቤተ ክርስቲያን ሰማይ \nተገለጠ ባንቺ ብርሀነ ፀሐይ\nነሽና ዕንቁ ባሕርይ ሰላም ለኪ\n\nበደመ መለኮት ክቡር የተዋጀሽ የመንግስተ ሰማይ መዝገብ ተምስጧል በአንቺ የብፁዓን ልብ \nቤተ ክርስቲያን ማኅደረ ጥበብ ሰላም ለኪ \n\nለቅዱስ ጴጥሮስ በአደራ የተሰጠሽ በበጎች መንጋ ምሳሌ አማኑኤል ያለሽ በቅሉ አካሌ \nቤትክርስቲይን የምዕመናን ሎሌ ሰላም ለኪ\n\nአመሰገኑሽ ተመስጠው በዝማሬ ሐዋርያተ ሕግ በሙሉ በማዕድሽ ዙሪያ ተሰይመው ሳሉ\nየሕይወትን በግ አርደው ስለ በሉ ሰላም ለኪ\n\nማህሌታይ ያሬድ ዘመረልሽ በመንፈስ ቅዱስ ተቅኝቶ\nበሥጋ በደሙ ዐይነ ልቡ በርቶ \nድንቅ ምሥጢርን ባንቺ አይቶ ሰላም ለኪ\n\nመጠተናልና እኛ ወደ አንቺ ወደ አንቺ ሰልቺቶን የኃጢአት ዓለም አልጫው ታሳትፊን ዘንድ ከደምና ሥጋው\n ቤተክርስቲያን የነፍስ የሥጋ ጨው ሰላም ለኪ" },
			n200 = { "ትሴብሃከ ኢትዮዽያ ወታሌእለከ ስመከ ውስተ ዓለም /፪/\nበእንተ ማርያም ወላዲትከ ዕቀብ ብሔራ ለኢትዮዽያ /፪/\nትርጉም፡- ጌታ ሆይ ስምህን በዓለም ሁሉ እያነሳች የምታመሰግንህን ኢትዮጵያን ስለ እናትህ ስለ ማርያም ብለህ ጠብቃት፡፡" },
			n201 = { "አፍላገ ግዮን ወጤግሮስ ይውኅዙ በወንጌል ሐዲስ/፪/\nእም የማና ወእም ጸጋማ ኤፌሶን ወይን ኤፍራጥስ \nኢትዮጵያ ሀገረ ክርስቶስ /፪/\n\n  ትርጉም፡- አራቱ አፍላጋት/ወንዞች/ ግዮን፣ ጤግሮስ ኤፌሶንና ኤፍራጥስ በ4ቱ መአዘንሽ የሚፈሱብሽ የ4ቱ ወንጌላውያን ቃል የሚነገርብሽ ኢትዮጵያ የእግዚአብሔር ሀገር ነሽ፡፡" },
			n202 = { "ያርሁ ክረምተ በበዓመት /፪/\nይሰምዑ ቃሎ ደመናት /፬/\n\n ትርጉም ፡- ክረምትን በየዓመቱ ይከፍታል ደመናትም ቃሉን ይሰማሉ፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("188.	እንተ ተሐንፀት በስሙ")) {
				loadChild(n188);
			} else if (HoldItem.equals("189.	ሕንፄሃ አዳም")) {
				loadChild(n189);
			} else if (HoldItem.equals("190.	ለዛቲ ቤት")) {
				loadChild(n190);
			} else if (HoldItem.equals("191.	 በደምህ ዋጅተህ ")) {
				loadChild(n191);
			} else if (HoldItem.equals("192.	ተዋሕዶ")) {
				loadChild(n192);
			} else if (HoldItem.equals("193.	ሃሌ ሉያ (ቁም ዜማ) ")) {
				loadChild(n193);
			} else if (HoldItem.equals("194.	ንዑ ንሑር ")) {
				loadChild(n194);
			} else if (HoldItem.equals("195.	ጥንታዊቷ መጀመሪያይቷ ")) {
				loadChild(n195);
			} else if (HoldItem.equals("196.	ንዑ ንስግድ")) {
				loadChild(n196);
			} else if (HoldItem.equals("197.	ሐዋርያት የሰበኩሽ ")) {
				loadChild(n197);
			} else if (HoldItem.equals("198.	ቤተ ክርስቲያን ባሕረ ጥበባት")) {
				loadChild(n198);
			} else if (HoldItem.equals("199.	ሰላም ለኪ ")) {
				loadChild(n199);
			} else if (HoldItem.equals("200.	ትሴብሃከ")) {
				loadChild(n200);
			} else if (HoldItem.equals("201.	አፍላገ ግዮን")) {
				loadChild(n201);
			} else if (HoldItem.equals("202.	ያርሁ ክረምተ")) {
				loadChild(n202);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T411(this, ParentList,
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
		text.setText("በእንተ ቤተክርስቲያን ወሀገሪትነ ኢትዮጵያ| በእንተ ክርስቲያን");
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

	public class T411 extends BaseExpandableListAdapter {

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

		public T411(Activity context, List<String> Items,
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
					"fonts/gfzemenu.ttf");
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
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/188.Ente tehantset.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/189.Hentseha Adam.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/190.Lezati bet.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/191.Bedemeh wajteh.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/192.tewahido.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/193.Hale Luya itzgebu.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/194.Neeu Nehure.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/195.Tintawitua.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/196.Neu Nesged.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/197.Hawareyat yesebekush.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/198.Bete Kirsitiyan Bahire Tibebat.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/199.Selem Leki.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/200.Tesebehake.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/201.Aflage Gion.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/202.Yarehu kiremte.mp3");
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