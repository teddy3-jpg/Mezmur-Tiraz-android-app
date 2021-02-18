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

public class Tiraz43 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("48.	ቡሩክ ዘይመጽእ");
		ParentList.add("49.	ድንግል የዚያን ጊዜ");
		ParentList.add("50.	በዕፀ መስቀል ላይ ");
		ParentList.add("51.	ከሔሮድስ ወደ ጲላጦስ ");
		ParentList.add("52.	ለእኛ ብሎ ");
		ParentList.add("53.	ሕሙም ስላዳነ ");
		ParentList.add("54.	ግሩም ነው ");
		ParentList.add("55.	ምድረ ቀራንዮ ");
		ParentList.add("56.	ምንኛ ድንቅ ነው ");
		ParentList.add("57.	ሕማም የማታውቀው ");
		ParentList.add("58.	ዓለምን ለማዳን");

	}
	// Assign children list element using string array.

	String[] n48 = { "ቡሩክ ዘይመጽእ በስመ እግዚአብሔር/፪/ \nሆሳዕና /፫/በአርያም /፪/\n  ትርጉም፦ በእግዚአብሔር ስም የሚመጣ ሆሳዕና የተባረከ ነው ሆሳዕና በአርያም።" },
			n49 = { "ድንግል የዚያን ጊዜ/2/ ሐዘንሽ በረታ /2/\nበመስቀል ላይ ሆኖ ልጅሽ ሲንገላታ /2/\n   አዝ...\nሴቶች ሲያባርሩት የዚያን ጊዜ ራርቶ ሆድሽ\nለፍጡር በማዘን ውሃ ያጠጣሽ /2/\n   አዝ...\nተጠማሁ እያለ የዚያን ጊዜ ሲናገር ልጅሽ\nታድያ እንደምን ቻለ ድንግል አንጀትሽ /2/\n   አዝ...\nእንደዚያ ስታለቅሽ የዚያን ጊዜ ሐዘን ሲውጥሽ\nእነማን ነበሩ ያስተዛዘኑሽ /2/\n   አዝ...\nስታለቅሽ በማየት የዚያን ጊዜ ራርቶ ልጅሽ\nዮሐንስን አጽናኝ እንደ ልጅ ሰጠሽ /2/\n   አዝ..." },
			n50 = { "በዕፀ መስቀል ላይ በዚያ አደባባይ /2/\nአምላክ ሆይ  ጌታ ሆይ መከራ አየህ ወይ\nአምላክ ሆይ  ጌታ ሆይ ተንገላታህ  ወይ\nመስቀል አስይዘው   ኪርያላይሶን\nወደ ጎልጎታ            >>\nሲገርፉህ ሲያዳፉህ       >>\nስትንገላታ              >>\n   አዝ...\nያንን አቀበት        ኪርያላይሶን\nያንን ዳገት              >>\nጀርባህ ተገርፎ           >>\nስትቃትት               >>\n   አዝ...              \nመስቀል አስይዘው    ኪርያላይሶን\nእንዲያ ሲያዳፉህ         >>\nየቀሬናው ሰዉ            >>\nስምዖን አገዘህ            >>" },
			n51 = { "ከሔሮድስ ወደ ጲላጦስ   \nተንገላታህ ላብህ እስኪፈስ  /2/\n\nአመላለሱህ አስረው ገረፉህ\nፊትህን ሸፍነው በበትር መቱህ\n   አዝ...\nእንደ ተራ ሰው እንደ ቀጣፊ\nእጅሀን አስረው መቱህ በጥፊ\n   አዝ...\nከመሳፍንቱ ከመኳንንቱ\nአደባባይ ዋልክ ደርሶ ትንቢቱ\n   አዝ...\nመስፍኑ ቆሞ ምን ላድርገው ቢል\nሁሉም በጩኸት አሉህ ይሰቀል      \nሁሉም ከሰሱህ ሁሉም ጮኹብህ    /2/ \nየነገሥታት ንጉሥ ተፈረደብህ\n   አዝ..." },
			n52 = { "ለእኛ ብሎ ተንገላታ የሁላችን ጌታ /2/\nአዳም ዕፅን በልቶ ባመጣው በሽታ /2/\nአምላክ ዋለ ቀራንዮ ለብሶ ከለሜዳ /2/\nአዳም ሕግ አፍርሶ በጎተተው ዕዳ /2/\nለመስቀሉ ተሰለፈ እየተገረፈ /2/\nበዕፅ ሊፈውሰው በዕፅ ላይ አረፈ /2/\nበመስቀል ላይ የዋለውን እናመስግነው /2/\nበዕፅ የሞተውን በዕፅ አዳነው /2/\nምንም በደል ሳይኖርበት የዓለም መድኃኒት /2/\nፍዳ ተቀበለ ለሰው ልጆች ድኅነት /2/\nበመሬት ላይ ተንገላታ ርኅሩኅ ጌታ /2/\nአዳም ሕግ አፍርሶ ባመጣው በሽታ /2/\nለእኛ ብሎ ተንገላታ የሁላችን ጌታ /2/\nአዳም ሕግ አፍርሶ ባመጣው በሽታ /2/" },
			n53 = { "ሕሙም ስላዳነ በእጆቹ ዳስሶ\nሙትን ስላስነሣ በእጆቹ ዳስሶ\nይህም በደል ሆኖበት ለአምላክ ኖላዊ ሔር\nበዕፀ መስቀሉ ላይ ዘርግቶ በፍቅር\nቀኝ እጁን በሳዶር ግራውን በአላዶር\nተቸነከረልን ጌታ በሁለት ችንካር\n		አምንስቲቲ ሙኬርያ አንቲ ፋሲልያሱ\nቤተ መቅደስ ምኩራብ በተመላለሱ\nባሕር ላይ በሔዱ ልክ እንደ በየብሱ\nለአምላክ ቤዛ ኵሉ ይህ ወንጀል ሆኖበት\nበዕፀ መስቀሉ ላይ ተላልፎ ለመሞት\nሁለቱን በአንድ ላይ እግሮቹን በዳናት\nተቸነከረልን አምላክ የእኛ ሕይወት\n		አምንስቲቲ ሙዓግያ አንቲ ፋሲልያሱ\nበልቡ አስቦ ድኅነት የሚያመጣ\nከበጎ ልቦናው በጎ የሚያወጣ\nይህ ወንጀል ሆኖበት ለአምላክ መድኅን ዓለም\nበዕፀ መስቀሉ ላይ ተዘርግቶ ለዓለም\nልቡን በአዴራ ደረቱን በሮዳስ\nተቸነከረልን ወልደ አምላክ ክርስቶስ\n		አምንስቲቲ ሙዳሱጣ አንቲ ፋሲልያሱ" },
			n54 = { "ግሩም ነው ግሩም/2/ የአምላክ ሥራ ግሩም ነው         \nዕፁብ ድንቅ አዳምን ለማዳን ያደረገው እርቅ /2/\n\nለጊዜያዊ ጥቅም ልቡ ስለሳሳ\nይሁዳ ሕይወቱን ሸጠው በሠላሳ\nጠላትህን ውደድ ብሎ እንዳስተማረው\nያስያዘውን ይሁዳ ወዳጄ ሆይ አለው\n   አዝ.....\nእውነተኛ ፍቅር ነውና እስከ ሞት\nመስቀል ተሸክሞ ሄደ ወደ ስቅለት\nአንቺ ቀራንዮ የመስቀል ተራራ\nለዓለም መስክሪ የወልድን መከራ\n   አዝ...\nየመድኃኔዓለም ደም የፈሰሰበት\nመስቀል ኃይላችን ነው ከሞት የዳንበት\nአምላክ ከሠራቸው ድንቅ ዕፁብ ሥራዎች\nይበልጣል ያሳየው ፍቅርን ለሰው ልጆች\n   አዝ...\nቀድሞ የገባለት ቃል ኪዳን ስላለ\nዐርብ ለፈጠረው ዐርብ ተሰቀለ" },
			n55 = { "ምድረ ቀራንዮ ከጠዋት እስከ ሰርክ /2/\nየእሾህ አክሊል ደፍተህ በመስቀል ላይ ዋልክ   አዝ\n\nበቀራንዮ ጎልጎታ ጌታ በችንካር ተመታህ\nለዓለም ቤዛ ልትሆን ራስህን ለሞት ሰጠህ\n   አዝ...\nእንደ ወንበዴ ታስረህ ሲቸንክሩህ እጅህና እግርህን\nለጠላቶችህ ክፉ አላሰብክም ይቅር በላቸው ነው ያልህ\n   አዝ...\nይሁዳ ሞኙ ተላላ ጌታውን ሽጦ ሊበላ\nገንዘብን ብቻ በመውደድ ገመድ ሆነችው ዘመድ\n   አዝ...\nበዕለተ ዓርብ ስድስት ሰዓት ጌታን በመስቀል አውለውት\nበግራ በቀኝ ፈያት መካከል እሱን ሰቀሉት\n   አዝ...\nበኪሩቤል ላይ የሚኖር በቀራንዮ ተሰቀለ ለአዳም ክብር\nእንደ ወንበዴ ተገረፈ ሥጋው አለቀ ተገፈፈ\n   አዝ...\nአገኘን ብለው ልዩ ልብስ ተከፋፍለዋል ቀሚስህን\nእሱን ሲሰቅሉት ጎልጎታ ወንበዴው በርባን ተፈታ\n   አዝ..." },
			n56 = { "ምንኛ ድንቅ ነው የአምላክ ሥራው \nዙፋኑን ትቶ /2/ ቀራንዮ /2/ የዋለው/2/  አዝ\n\nፈራጅ አምላክ ሲሆን ሊፈረድበት\nበአደባባይ አቆሙት ሊሳለቁበት\nበጅራፍ አካሉን ሲገርፉት\nዝም ማለቱ እንደሌለው አንደበት\n   አዝ...\nመስቀል አሸክመው እስከ ቀራንዮ\nሲስቡት ሲገርፉት ሲጮሁ ሲሉ ወዮ\nሲጥሉት ሲያዳፉት  እየገፈተሩ\nይህ ሁሉ ትዕግስት ምን ይሆን ምሥጢሩ\n   አዝ...\nእርቃነ ሥጋውን ከመስቀል አስተኝተው\nበአምስቱ ችንካሮች አካሉን ቸንክረው\nያለ ርኅራሄ ደሙን ሲያፈሱት\nየእሾህ አክሊል ሰርተው እያቀዳጁት\n   አዝ...\nየግፍ ግፍ ሲሠሩ በገዛ ግዛቱ\nኧረ ለምን ይሆን ዝም ብሎ ማየቱ\nአዳምን ሊያወጣው ከባርነቱ\nሊመልሰው ወዶ ከገነት ከቤቱ" },
			n57 = { "	ሕማም የማታውቀው ድካም የሌለብህ\n	ስለኛ ተራብህ ደከምህ በእውነት\n   የደም ላብ አላበህ ብዙም አስጨነቁህ\n   እጅና እግርህን አስረውት አይሁድ አንገላቱህ/፪/\nበቀርክሃ በጅራፍ አምላኬ ገረፉህ\nበፈጠርከው ፍጥረት መወጋት መድማትህ \nምን ይሆን ምሥጢሩ ያንተ መንገላታት /፪/\n     መንፈሳዊ አርበኛ ማርያም መግደላዊት\n     ያንተ ሕማም ሞት ያንተ ስቃይ ጨንቋት\n     በእኩለ ሌሊት ፅልመቱን ሳትፈራ     \n     አመጣት ጎትቶ የፍቅርህ አሻራ /፪/     \nያ ሁሉ መከራ እንዴት ይግባ ልቤ\nአልበጠስ አለኝ የኃጢአት መረቤ\nመቼ ይሆን ፍቅርህ ለእኔ የሚገባኝ\nሕማም ጉስቁልናህ ልቤን የሚነካኝ /፪/\n     ቃሉን ተናጋሪ ምግባር የሌለኝ     \n     ተገርፏል ተሰቅሏል የምል ብቻ ሆንኩኝ /፫/\nተው ልቤን ስበረው ልመንህ አጥብቄ\nመቼ ሕይወት ሆነኝ ሕግህን ማወቄ\nእባክህ የኔ ጌታ መንፈሴን ስበረው\nየመስቀሉን ፍቅር በልቤ ላይ ሳለው /፪/" },
			n58 = { "ዓለምን ለማዳን የተሰቀለው            \nኢየሱስ ክርስቶስ እግዚአብሔር ነው   /፪/ አዝ\nጌታችን ተሰቅሎ ቢያዩት መላእክት \nበዝማሬ ፈንታ አለቀሱለት\nሚካኤል ዝም አለ ገብርኤል ገረመው \nአምላኩ እርቃኑን ተሰቅሎ ስላየው /፪/ \n   አዝ... \nነፍሱን ለወዳጁ የሚሰጥ ቢገኝም \nለጠላት የሚሞት በጭራሽ አይኖርም \nጠላቶቹ ስንሆን ለኛ የሞተው \nክርስቶስ ልዩ ነው ወደርም የለው /፪/ \n   አዝ... \nእውርን ቢያበራ የሞተን ቢያስነሣ \nበመመስገን ፈንታ ሆነበት አበሳ \nሰማያዊው ዳኛ ሊፈረድበት \nተከሶ ቀረበ በጲላጦስ ፊት /፪/ \n   አዝ... \nዐርብ በመስቀል ላይ የተሰቀለው \nሥጋና ደሙን ለእኛ የሰጠው\nፍቅር አስገድዶት ለኛ የሞተው \nመልካሙ እረኛችን መድኃኔ ዓለም ነው /፪/" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("48.	ቡሩክ ዘይመጽእ")) {
				loadChild(n48);
			} else if (HoldItem.equals("49.	ድንግል የዚያን ጊዜ")) {
				loadChild(n49);
			} else if (HoldItem.equals("50.	በዕፀ መስቀል ላይ ")) {
				loadChild(n50);
			} else if (HoldItem.equals("51.	ከሔሮድስ ወደ ጲላጦስ ")) {
				loadChild(n51);
			} else if (HoldItem.equals("52.	ለእኛ ብሎ ")) {
				loadChild(n52);
			} else if (HoldItem.equals("53.	ሕሙም ስላዳነ ")) {
				loadChild(n53);
			} else if (HoldItem.equals("54.	ግሩም ነው ")) {
				loadChild(n54);
			} else if (HoldItem.equals("55.	ምድረ ቀራንዮ ")) {
				loadChild(n55);
			} else if (HoldItem.equals("56.	ምንኛ ድንቅ ነው ")) {
				loadChild(n56);
			} else if (HoldItem.equals("57.	ሕማም የማታውቀው ")) {
				loadChild(n57);
			} else if (HoldItem.equals("58.	ዓለምን ለማዳን")) {
				loadChild(n58);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T43(this, ParentList,
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
		text.setText("በእንተ በዓለ ሆሳዕና |በእንተ ስቅለቱ ለእግዚእነ");
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

	public class T43 extends BaseExpandableListAdapter {

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

		public T43(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/48.Buruk Zeymitsie.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/49.Dingil yeziyan Gize.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/50.BeEtse Meskel Lay.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/51.KeHerodis Wede Pilatos.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/52.Legna Bilo.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/53.Himum Siladane.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/54.Girum Newu.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/55.Midre Keraniyo.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/56.Minigna Dink newu.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/57.Himam Yematawkew.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/58.Alemin lemadan.mp3");
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