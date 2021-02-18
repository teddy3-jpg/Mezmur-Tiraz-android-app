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

public class Tiraz210 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("118.	ጻድቃን ሰማዕታት በሙሉ ");
		ParentList.add("119.	ለምኑልን ");
		ParentList.add("120.	ወጽአ እምድረ ካራን");
		ParentList.add("121.	በጾም ወበጸሎት ");
		ParentList.add("122.	ካህን ወነቢይ");
		ParentList.add("123.	ሐዋርያት ተባበሩ ");
		ParentList.add("124.	ንዋይ ኅሩይ");
		ParentList.add("125.	ኦ ፍጡነ ረድኤት ");
		ParentList.add("126.	ደም ወማይ");
		ParentList.add("127.	ዮም ተጽሕፈ ");
		ParentList.add("128.	አርሴማ ቅድስት");
		ParentList.add("129.	ጊዜ ዕረፍታ ለሶልያና");
		ParentList.add("130.	ህፃን ወእሙ");
		ParentList.add("131.	አቁረርከ ቂርቆስ");
		ParentList.add("132.	ነፍስየ ትባርኮሙ");
		ParentList.add("133.	ዜኖኩ ጽድቀከ");
		ParentList.add("134.	አልቦ እምቅድሜሁ ");
		ParentList.add("135.	ብጹዕ ውእቱ  ");

	}
	// Assign children list element using string array.

	String[] n118 = { "ጻድቃን ሰማዕታት በሙሉ \nበአካለ ሥጋና በአካለ ነፍስ/2/እያሉ\nከፈጣሩ አማልድወ እኛን ያስምራሉ\n	የእግዚአብሔር አይኖቹ ጻድቃንን ከማየት \n	ጅሮቹም አይርቁም እነርሱን ከመስማት\n	የጻድቅ ሰው ጸሎት ኃይልን ታደርጋለች\n	በምጅቸው እንመን አናመንታ በአንዳች\nአዝ . . . \n	ጊዜያዊው ፈተና ሳያሰቅቃቸው \n	እሳትና ስለት ሳይስፈራራቸው \n	ሰማያዊው ተስፋ ስለሚታያቸው\n	በመከራ ሁሉጸኑ በእምነታቸው\nአዝ . . . \n	ኃጥኡ ነዌ እንኳ በሲኦል  እያለ\n	ስለወነድሞቹ ምህረት ከለመነ\n	እናንተማ ጻድቃን በገነት ያላችሁ \n	ምንኛ ትረዱን አምነን ስንጠራችሁ\nአዝ . . . \n	ቀዝቃዛ ውኃ  እንኳ በጻድቅ ሰው ስም \n	የሚያጠጣ ቢኖር ዋጋው አይጠፋም\n	ብሎ እንዳስተማረ ጌታ በወንጌል \n	አምነን እንፈጽመው ዋጋ ያሰጣል	\nአዝ . . .  " },
			n119 = { "ቅዱሳን ሰማዕታት ጻድቃን\nለምኑልን ለኛ ምህረትን\nግሩማን መላእክት ለዓይን \n	ሚካኤል ገብርኤል ሱራፌል ኪሩቤል\n	ካህናተ ሰማይ ዑራኤል ሩፋኤል\n	ሱርያኤል ፋኑኤል አፍኒን ራጉኤል\n	ቅርናኤል ናትናኤል ሱራኤል ፍናኤል\nአዝ ....\n	ለእስራኤል ነቢያት ሕዝቅኤል ዳንኤል\n	ዳዊት ሰሎሞን ኤርሚያስ ሳሙኤል \n	ኢሳይያስ አሞፅ ሐጌ ዘካርያስ \n	ዕንባቆም አብድዩድ ናሆም ሶፎንያስ\nአዝ ....\n	ጴጥሮስ ጳውሎስ ሐዋርያት \n	የተሰዋችሁ ለተዋሕዶ እምነት\nአዝ ....\n	እስጢፋኖስ ዲያቆን ቅዱስ ጊዮርጊስ\n	መጥምቁ ዮሐንስ መርቆሬዎስ\nአዝ ....\n	ተክለሃይማኖት ዜና ማርቆስ\n	ገብረ መንፈስቅዱስ ገብረ ክርስቶስ\nአዝ ....\n	ጻድቃን ሰማዕታት ቅዱሳን መላእክት \n	ምሕረት ለምኑላት ሆናችሁ በአንድነት \n	አምላክ ተለመናት ኢትዮጵያን \n	እጆችዋን ዘርግታ ስትማፀን\nአዝ ...." },
			n120 = { "ወጽአ እምድረ ካራን ወቦአ ብሔረ ከነዓን /2/\nተአመነ አብርሃም /2/ በእግዚአብሔር  /2/\n\nትርጉም፦ከካራን ምድር ወጥቶ ወደ ከነዓን ሀገር ገባ። አብርሃም በእግዚአብሔር ታመነ።" },
			n121 = { "ሃሌ ሃሌ ሉያ በጾም ወበጸሎት\nተመጠወ ሙሴ ኦሪተ አሥሮነ ቃላተ  /2/\nተመጠወ ሙሴ ኦሪተ አሥሮነ ቃላተ \n\nሃሌ ሃሌ ሉያ በጾምና በጸሎት\nተቀበለ ሙሴ ኦሪትን አሥርቱ ቃላትን/2/\nተቀበለ ሙሴ ኦሪትን አሥርቱ ቃላትን" },
			n122 = { "በመንፈስ የሐውር  እምኃይል ውስተ ኃይል/2/\nካህን/2/ ካህን ወነቢይ ዮሐንስ መጥምቅ/2/\n\nትርጉም፦ ካህና ነቢይ የሆነው መጥምቁ ዮሐንስ  በመንፈስ ቅዱስ ጸጋ ከኃይል ወደ ኃይል ይጓዛል:: በጸጋ መንፈሳዊ ሀብትእየጨመረ  ዕለት ዕለት እያደገ ይሄዳል::" },
			n123 = { "ሐዋርያት ተባበሩ\nበአዲስ ቋንቁ እይተናገሩ ቃሉን አስተማሩ\n	ከዐረገ በኋላ በአሥረኛው ቀን  \n	ወደ ዓለም ላከው ጵራቅሊጦስን\n	በዝግ ቤት ውስጥ ቆዩ ቀኑን ሲጠብቁ\n	የተሰጣቸውን ተስፋውን እስኪያውቁ\nአዝ ....\n	ቀኑም ደረሰና  ሃምሣኛው ዕለት \n	ተሰብስበው ሳሉ በአንድነት ጸሎት \n	መንፈስቅዱስ ታየ በነደ እሳት  \nአዝ ....\n	ያ የተነገረው\n	ወረደ ክከሰማይ በእሳት አምሳል \n	ጴጥሮስ አሳመነ ሦስት ሺ ነፍሳት \n	ያንጊዜ ገሊላ በሰጠው ትምህርት\nአዝ ....\n	ከሦስት አካል አንዱ መንፈስ ቅዱስን \n	ልኮ አናገራቸው ሁሉን በልሳን /2/\nአዝ ...." },
			n124 = { "መልእክተ ወንጌልን በደሙ የጻፈ \nስቃዩን ታግሶ ችሎ ያስለፈ \nበረሀብ በግርፋት በግዞት አብዝቶ\nበገድል በትሩፋት ጠላትን ድል ነስቶ\n\n	ንዋይ ኅሩይ ነው ለዓለም ያበራ\n	ሐዋርያው ጳውሎስ ለጽድቅ የተጠራ\n\nእንቅልፉን እያጣ ሌት ተቀን ሳይታክት\nይኋላውን ትቶ ተጓዘ ወደፊት\nበድካም ተጠምዶ በገድል እያረሰ \nከደማስቆ እስከ ሮም ቃሉን አዳረሰ\n	አዝ . . .\n	እውነት ለመናገር ከቶ ያላፈረ\n	ሕዝብ ከአሕዛብ በአንድ ያስተባበረ\n	አምላኩ እንዳይናቅ ከልቡ የተጋ\n	ጸንቶ የተጓዘ ለምትበልጠው ጸጋ\n	አዝ . . .\n	በሮም አደባባይ ሰማዕት የሆነ \nየተዋሕዶ አርነኛ ለአምላኩ የታመነ\nበጣዕመ ስብከቱ ዓለምን አጣፍጦ \nአክሊል ተቀዳጀ ሳይታክት ሮጦ" },
			n125 = { "ኦ ፍጡነ ረድኤት /2/ \nየእግዚአብሔር አገልጋይ ቅዱስ ሰማዕት\n	ሰላም ላንተ ይሁን -  ፍጡነ ረድኤት  \n	የልዳው ፀሐይ -  ፍጡነ ረድኤት\n	በጨካኝ ንጉሥ ፊት ቆምክ አደባባይ\n	ታማኝ አገልጋይ ነህ -  ፍጡነ ረድኤት \n	ስቃይ ያልበገረህ -  ፍጡነ ረድኤት\n	አክሊልን አገኘህ መከራን ታግሰህ\nአዝ . . .\n	ለእምነቱ ተጋዳይ -  ፍጡነ ረድኤት\n	ታማኝ  ወታደር -  ፍጡነ ረድኤት\n	ቢነገር አያልቅም ይተሰጠህ ክብር\n	ስቃይ ሲያደርሱብህ -  ፍጡነ ረድኤት\n	በመታገስህ -  ፍጡነ ረድኤት\n	 ሲወራ ይኖራል ዘለዓለም ስምህ \nአዝ . . .\n	የፈጣሪውን ስም -  ፍጡነ ረድኤት\n	ስለመሰከረ -  ፍጡነ ረድኤት\n	ጊዮርጊስ ሰማዕት በሰይፍ ተመተረ\n	የስቃይ መሳሪያ -  ፍጡነ ረድኤት\n	ያላዘናጋህ -  ፍጡነ ረድኤት\n	መንፈሳዊ አርበኛ ጊዮርጊስ አንተ ነህ\nአዝ . . .\n	ለሰማው ይደንቅል -  ፍጡነ ረድኤት\n	የአንተ ሰማዕትነት -  ፍጡነ ረድኤት\n	ምሳሌ ይሆናል ለሁሉም ፍጥረት \n	ገድልህ ይነገራል -  ፍጡነ ረድኤት\n	ክብር እንደተሰጠህ -  ፍጡነ ረድኤት\n	ጊዜ የማይሽረው ምግባር ሃይማኖት\nአዝ . . ." },
			n126 = { "ደም ወማይ ወሓሊብ እምነ ክሳዱ ፈልፈለ /2/\nሶበ ተከለለ  /2/ ተከለለ ጊዮርጊስ ሰማዕት \n\nትርጉም፦ ሰማዕቱ ጊዮርጊስ በተከለለ (አንገቱን በሰይፍ በተቆረጠ ጊዜ) ደም ውኃ ወተትም ከአንገቱ ፈለቀ::" },
			n127 = { "ዮም ተጽሕፈ እምነገስት ክላሌሁ \nለጊዮርጊስ በመጥባዕት   	    /2/\nጸለየ ጊዮርጊስ ወአውዓዮሙ \nበነበልባል አማን ገባሬ ኃያል  /2/\nዛሬ ጊዮርጊስ በሰይፍ መከለሉ ከነገሥት ተጻፈ /2/\nጊዮርጊስ ጸለየ በነበልባል አቃጠላቸው\nእውነት ነው ገባሬ ኃይል 	         /2/\n\n	ገባሬ ኃይል- ማለት ኃይልን የሚያደርግ (ተዓምረኛ) ማለት ነው::" },
			n128 = { "አርሴማ ቅድስት /2/ ወሰማዕት/2/\nወሰማዕት /5/ አርሴማ ቅድስት /2/\n\nትርጉም፦  ቅድስት አርሴማ ሰማዕት (ምስክር) ናት። " },
			n129 = { "ጊዜ ዕረፍታ ስለሶልያና ወረደ ወልድ እምዲበ ልዕልና/2/\nእምዲበ ልዕልና/6/ ወረደ እምዲበ ልዕልና /2/	\n\nትርጉም፦ ሶልያና(እመቤታችን ) ባረፈች ጊዜ ወልድ ነፍሷንን ለመቀበል ወረደ። " },
			n130 = { "ህፃን ወእሙ /3/\nክልኤሆሙ ፈፀሙ ገድሎሙ /2/\nሕፃን ንዑስ/3/ \nዘኢፈርኃ ትእዛዘ ንጉሥ/2/\n\nትርጉም፦ ሕፃን እና እናቱ(ቂርሮስ እና ኢየሉጣ) ሁለቱም ገድላቸውን ፈፀሙ። ታናቹ ሕፃን(ቂርቆስ) የንጉሡን ትእዛዝ አልፈራም። " },
			n131 = { "አቁረርከ ቂርቆስ ነበልባሎ ለእቶነ እሳት ምውቅ /2/\nከመ ነደ እሳት አቁረሩ /2/ አቁረሩ ሠለስቱ ደቂቅ ኧኸ/3/\n\nትርጉም፦ ቂርቆስ ሆይ የሚያቃጥለውን የእሳቱን ነበልባል አቀዘቀዝህ ሠለስቱ ደቂቅ እንዳቀዘቀዙ። " },
			n132 = { "ነፍስየ ትባርኮሙ ወታስተበፅዖሙ ነያ/2/\n ተክለሃይማኖት  ወጸጋ ዘአብ ወእግዚእ ኀረያ/2/\n\nትርጉም፦ ነፍሴ ታመሰግናቸዋለች ታከብራቸዋለችም ። ተክለሃይማኖትን ጸጋ ዘአብን እና  እግዚእ ኀረያን።" },
			n133 = { "ዜኖኩ ጽድቀከ ወነገርኩ አድኅኖተከ \nከሰትኩ ቃላቲከ ለሕዝብከ ኢትዮጵያ /2/\nበጸጋሁ ለመንፈስ ቅዱስ ወመሀርክዎሙ \nአነ ይቤ ያሬድ ካህን /2/\n\nጽድቅህን ነገርኩ አዳኝነትህን አስተማርኩ \n ቃላትህን ለኢትዮጵያ ህዝብህ ገለጥኩ/2/\nእኔም በመንፈስ ቅዱስ  ጸጋ \nአስትማርኳቸው አለ ያሬድ ካህን/2/" },
			n134 = { "አልቦ እምቅድሜሁ ወአልቦ እምድኅሬሁ\nማኅሌታይ ሰብእ ዘከማሁ  /2/\nያሬድ ካህን ይኬልህ ትንሣኤሁ ኢያዓዱ \n እንስሳ ወሰብእ እምነ ሥላሰ ዜናሁ/2/\n\nከእርሱ በፊት ከእርሱም በኋላ\nእንደእርሱ ማኅሌታይ ሰው የለም  /2/\nያሬድ ካህን ትንሣኤውን ይናገራል \nሰው ወይም እንስሳ ከሦስት ዜማወቹ አይወጣም /2/" },
			n135 = { "ብጹዕ ውእቱ  ዘገብረ ተዝካርከ \nወዘጸሐፈ መጽሐፈ ገድልከ_/2/ /2/\nአነ እሁቦ ሕይወተ ዘለዓለም \nወአወርሶ መንበረ ክብር \nይቤሎ እግዚአብሔር ለያሬድ ካህን/2/\nንዑድ ነው ክቡር ነው ያደእገ ተዝካርህን\nየጻፈ ገድልህን ይስጻፈ ገድልህን/2/\nእኔ እሰጠዋለሁ የዘለዓለም ሕይወትን\nአወርሰዋለሁ መንግሥተ ሰማያትን \nብሎታል እግዚአብሔር ለያሬድ ካህን/2/" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("118.	ጻድቃን ሰማዕታት በሙሉ ")) {
				loadChild(n118);
			} else if (HoldItem.equals("119.	ለምኑልን ")) {
				loadChild(n119);
			} else if (HoldItem.equals("120.	ወጽአ እምድረ ካራን")) {
				loadChild(n120);
			} else if (HoldItem.equals("121.	በጾም ወበጸሎት ")) {
				loadChild(n121);
			} else if (HoldItem.equals("122.	ካህን ወነቢይ")) {
				loadChild(n122);
			} else if (HoldItem.equals("123.	ሐዋርያት ተባበሩ ")) {
				loadChild(n123);
			} else if (HoldItem.equals("124.	ንዋይ ኅሩይ")) {
				loadChild(n124);
			} else if (HoldItem.equals("125.	ኦ ፍጡነ ረድኤት ")) {
				loadChild(n125);
			} else if (HoldItem.equals("126.	ደም ወማይ")) {
				loadChild(n126);
			} else if (HoldItem.equals("127.	ዮም ተጽሕፈ ")) {
				loadChild(n127);
			} else if (HoldItem.equals("128.	አርሴማ ቅድስት")) {
				loadChild(n128);
			} else if (HoldItem.equals("129.	ጊዜ ዕረፍታ ለሶልያና")) {
				loadChild(n129);
			} else if (HoldItem.equals("130.	ህፃን ወእሙ")) {
				loadChild(n130);
			} else if (HoldItem.equals("131.	አቁረርከ ቂርቆስ")) {
				loadChild(n131);
			} else if (HoldItem.equals("132.	ነፍስየ ትባርኮሙ")) {
				loadChild(n132);
			} else if (HoldItem.equals("133.	ዜኖኩ ጽድቀከ")) {
				loadChild(n133);
			} else if (HoldItem.equals("134.	አልቦ እምቅድሜሁ ")) {
				loadChild(n134);
			} else if (HoldItem.equals("135.	ብጹዕ ውእቱ  ")) {
				loadChild(n135);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T210(this, ParentList,
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

	public class T210 extends BaseExpandableListAdapter {

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

		public T210(Activity context, List<String> Items,
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

						private void data(int childPosition, int groupPosition) {
							// TODO Auto-generated method stub

							if (childPosition == 0 && groupPosition == 0) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/118-Tsadkan Sematat Bemulu.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/120-Wetsa Emedre Karan.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/121-Betsom Webetselot.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/122-Kahen Wenebiy.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/123-Hawariyat Tebaberu.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/124-Neway Heruy.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/125-O Fetune Rediet.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/126-Dem Wemay.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/127-Yom Tetsefe.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/128-Arsema Kidist.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/129-Gize Erefta Lesoliyana.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/130-Hitsan WeEmu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/131-Akurerke Kirkos.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/132-Nefsiye Tebarikomu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/133-Zenoku Tsedkeke.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/134-Albo Emkidmehu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 17) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/135-Betsu Wetu.mp3");
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