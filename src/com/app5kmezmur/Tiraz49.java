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

public class Tiraz49 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("122.	እምልማደ ሳህልከ");
		ParentList.add("123.	ሞገሰ ክብሩ");
		ParentList.add("124.	የአርባብ አለቃ ");
		ParentList.add("125.	ክብሮሙ ለመላእክት ");
		ParentList.add("126.	መዐዛሆሙ ለቅዱሳን");
		ParentList.add("127.	ገባሬ መንክራት");
		ParentList.add("128.	ልቡና የሚመስጥ ");
		ParentList.add("129.	አማን በአማን");
		ParentList.add("130.	ሰአሉ ለነ ");
		ParentList.add("131.	የሕይወትን መዝገብ ");
		ParentList.add("132.	ይቤላ ሕፃን ");
		ParentList.add("133.	ያሬድ ሐዋርያ");
		ParentList.add("134.	ትክበር ነፍስየ");
		ParentList.add("135.	አባ አቡነ ");
		ParentList.add("136.	ከመ ጸበል ዘነፋስ");
		ParentList.add("137.	ፍጡነ ረድኤት");
		ParentList.add("138.	ይቤለኪ ያሬድ");
		ParentList.add("139.	ሰባኬ ወንጌል");
		ParentList.add("140.	ይትፌሥሑ ጻድቃን");
		ParentList.add("141.	ዘረከቡኪ ጻድቃን");
		ParentList.add("142.	ወዐቀቦሙ ");
		ParentList.add("143.	ዮሐንስ ክቡር ነቢየ ልዑል");
		ParentList.add("144.	ሐዋርያት አበው ");
		ParentList.add("145.	ይቤሎ መንፈስ ቅዱስ");
		ParentList.add("146.	ጊዮርጊስ ግሩም");
		ParentList.add("147.	አክሊሎሙ ");
		ParentList.add("148.	ሰአል ለነ ");
		ParentList.add("149.	ከመ ጸበል");
		ParentList.add("150.	በበግማድ ");
		ParentList.add("151.	ዘረዉ ሥጋሁ");
		ParentList.add("152.	መክብበ ሰማዕት ");
		ParentList.add("153.	በፍቅረ አምላኩ");
		ParentList.add("154.	ገድልከ ግሩም");
		ParentList.add("155.	ነዋ ጊዮርጊስ");
		ParentList.add("156.	እም ኢትዮጵያ");
		ParentList.add("157.	መዓልተ ምስሌነ");
		ParentList.add("158.	ገሃደ ቀዊሞ");
		ParentList.add("159.	ጸለየ");
		ParentList.add("160.	መጽአት");
		ParentList.add("161.	ዘእምደብረ ደናግል");
		ParentList.add("162.	ዛ አንቀጽ");
		ParentList.add("163.	እም ገዳመ መንበሩ");
		ParentList.add("164.	ከመ ኖኅ ");
		ParentList.add("165.	በስመ አብ ");
		ParentList.add("166.	መጽሐፈ ዜናሁ ");
		ParentList.add("167.	ዘንተ ሀለየ ");
		ParentList.add("168.	አሰርገዋ");
		ParentList.add("169.	አምላኮሙ");
		ParentList.add("170.	ቅዱሳን ጻድቃን ");
		ParentList.add("171.	በየገዳማቱ");
		ParentList.add("172.	ከሠተ አፉሁ");
		ParentList.add("173.	ማርቆስ ሐዋርያ");
		ParentList.add("174.	ጸሎትክሙ");
		ParentList.add("175.	ደብሩሰ");
		ParentList.add("176.	እመ ድንግል ");
		ParentList.add("177.	ክቡራነ ስም");
		ParentList.add("178.	ጊዜ ዕረፍታ");
		ParentList.add("179.	አሀዊከ ሰማዕታት");
		ParentList.add("180.	ቅድስተ ቅዱሳን ");

	}
	// Assign children list element using string array.

	String[] n122 = { "እምልማደ ሣህልከ ለነ ግበር ሣህል ገብርኤል ነደ ወነበልባለ/፪/\nከመ ለአናንያ ወአዛርያ ወሚሳኤል ዘአቁረርከ ነደ /፪/\n\nትርጉም- ለአናንያ ለአዛርያ እና ሚሳኤል ነበልባሉን ያበረድክ ቅዱስ ገብርኤል ሆይ የተለመደ ምሕረትህን ለእኛም አድርግልን፡፡	 " },
			n123 = { "ሞገሰ ክብሩ ሚካኤል ለተላፊኖስ /፪/\nበልማደ ምሕረት ወሣህል ዘይትማሰለከ      \nአልቦ እንበለ ባህቲታ እኅትከ ማርያም ድንግል  /፪/\n\nትርጉም፡- ሚካኤል ለተላፊኖስ የክብሩ ሞገስ ነህ በምሕረትና በማስታረቅ በማማለድ /በልመና/ እኅትህ ከሆነችው ከድንግል ማርያም  በስተቀር የሚመስልህ የለም፡፡" },
			n124 = { "የአርባብ አለቃ ቅዱስ ገብርኤል \nአብሳሪ ትስብዕቱ ለቀዳሚ ቃሉ\nምሕረት አሰጠን ከአምላክ ከልዑል \n   አዝ...\nበሦስቱ ሰማያት በመላእክት ከተማ\nሳጥናኤል ተነሥቶ ክህደትን ሲያሰማ\nጽኑ ብለህ ያቆምክ መላዕክትን በዕምነት\nእኛንም አድነን አጽናን በሃይማኖት\n   አዝ...\nቂርቆስ ኢየሉጣን ከመቃጠል ያዳንክ\nበመልካሙ ዜና ድንግልን ያበሰርክ \nተስፋ በቆረትን በተከፋን ጊዜ  \nአንተ ድረስልን አውጣን ከትካዜ\n   አዝ...\nከምግባር ለይቶ በዓለም ፍቅር ስቦ\nየመስቀሉ ተስፋ ከልባችን ሰልቦ\nዲያቢሎስ በምኞት ሊጥለን ነውና \nጠብቀን ገብርኤል ክስህተት ጎዳና\n   አዝ...\nሥልጣንህን አምነን የምልጃህን ጸጋ\nአስታርቀን ስንልህ ዘወትር ስንተጋ \nፈቅደህ ተለመነን ድምጻችንን ስማ \nየአርባብ አለቃ መልአክ ዘራማ\n   አዝ..." },
			n125 = { "ክብሮሙ ለመላእክት ከመ መንኩራኩር ወረደ መልአከ እግዚአብሔር/፪/\nኀበ ማርያም ድንግል ለተናግሮ ለሙሴ በኀበ ዕፀ ጳጦስ /፪/\nእንዳንተ ማንም የለም ከቶ የሚመስልህ\nአምላክ ሆይ ድንቅ ነው ሥራህ	              \nአዳምን ከነ ልጆቹ ልታድን በገባኸው ቃል   /፪/አዝ\nአዳንከው እንደ ቃልህ ተወልደህ ከድንግል\n\n	ቅድመ ዓለም የነበርህ ያለህና የምትኖር\n	ልዑለ ባሕርይ ሕያው እግዚአብሔር\n	ብስራታዊ መልአክ ቅዱስ ገብርኤልን\n	ላከው የመምጣትህን ዜና እንዲሰብክልን\n   አዝ....\nሙሴን የተናገረው በእሳቱ ነበልባል\nየመላእክት ፍቅር የሰማዕታት አክሊል\nከሰማያት ወረድህ እንደ መንኩራኩር\nዓለምን ለማዳን ከድንግል ተወልደህ በረቀቀ ምሥጢር\n   አዝ...\n	በፍጡራን ኅሊና የማትመረመር\n	ድንቅ ነው በእውነት የልደትህ ነገር\n	የአዳም ተስፋ ነህ የድኅነት መገኛ\n	ክርስቶስ ሥጋችንን ለብሰህ ተወለድክልን ለኛ" },
			n126 = { "መዐዛሆሙ ለቅዱሳን ከመ ጽጌ ደንጎላት ዘውስተ ቆላት /2/\nጸገዩ ቀንሞስ ምስለ ናርዶስ /4/\n\n  ትርጉም- የቅዱሳን መዐዛቸው/ሃይማኖታቸው/ በቆላ እንዳለ እንደ ሱፍ አበባ ነው እንደ ቀንሞስና ናርዶስ አፈሩ አበቡ፡፡" },
			n127 = { "ገባሬ መንክራት ጊዮርጊስ በአቁፅሎ ይቡስ ዓምድ/፪/\nተራድአነ /፫/ ጊዮርጊስ ተራድአነ /፪/\n\n ትርጉም- ደረቁን ምሰሶ ያለመለምክ ተአምር ሰሪ ሰማዕቱ ቅዱስ ጊዮርጊስ ሆይ እኛንም ተራዳን፡፡" },
			n128 = { "ልቡና የሚመስጥ አጥንት አለምላሚ\nምድራዊ አይደለም ምንጩ ሰማያዊ\nሄደህ የሰማኸው ከመላእክት ከተማ\nምንኛ ጥዑም ነው ያሬድ ያንተ ዜማ\n   አዝ...\n	ከትንሽ አንስቶ እስከ ግዙፎቹ\n	አምላክ እንደ ሠራው በሥነ ፍጥረቱ\n	ያልነገርከው የለም በዜማ ድርሰትህ\n	በመንፈስ ቅዱስ ቃል ነውና እውቀትህ\n   አዝ...\nኢየሱስ ክርስቶስ ለእኛ የሆነውን\nመገረፍ መሰቀል መሞት መነሣቱን\nእናስታውሰው ዘንድ አመልክተህ ጽፈህ\nአበረከትክልን ከዜማ አስማምተህ\n	   አዝ...\n	ለፀሐይ እናቱ ለብርሃን መውጫ\n	ለድንግል ማርያም ውዳሴ እንዲገባ\n	በምልአት በስፋት በምሥጢር በአንክሮ  \n	ያቀረብከው  ዜማ ዛሬም አለ ከብሮ\n   አዝ...\nጸጋ በረከትህ ይደር በሁላችን\nሊቀ ተዋሕዶ ያሬድ አባታችን\nጠፍተው እንዳንባክን ያንተን ዜማ ዐዋቂ\nአምላክ ያስነሣልን ሊቃውንት ጠባቂ" },
			n129 = { "አማን በአማን /፬/ \nፀሐየ ልዳ ኮከበ ፋርስ /፬/ ኧኸ\n\nትርጉም- እውነት በእውነት  የልዳ ፀሐይ የፋርስ ኮከብ ነህ፡፡" },
			n130 = { "ሰአሉ ለነ ቅዱሳን መላአእክት /፪/\nሰአሉ ለነ ጻድቃን ሰማዕታት \nኀበ አምላከ ምሕረት ሰአሉ ለነ\nለምኑልን ቅዱሳን መላእክት/፪/\nለምኑልን ጻድቃን ሰማዕታት\nወደ አምላከ ምሕረት ለምኑልን\n   አዝ...\nአንተ የመረጥከውን ማን ይከሳል\nያጸደቅከውን ማን ይወቅሳል\nለሚገባው ክብርን መስጠት ይዟልና በመጽሕፍት\nያከበርካእውን ባርያዎችህን እናከብራለን ቅዱሳንህን    /፪/\nአዝ....  \nሁሉ መዳንን እንዲያገኙ  \nየሚላኩ የሚያግዙ ሰርክ በፊትህ የሚቆሙ \nጥዑም ቅዳሴህን የሚያሰሙ \nበምስጋናቸው የሚያከብሩህን \nእናከብራለን መላእክትህን/፪/\n   አዝ...\nጤዛ ልሰው ዳዋ ጥሰው\nዋዕይ ቁሩንም ታግሰው\nበየፍርክታው በየዱሩ \nሌጦ ለብሰው እየዞሩ\nበጽናጽላቸው ያከበሩህን \nእናከብራለን ጻድቃንህን /፪/\n   አዝ...\nእንደሚታረዱ በጎች ሆነው \nአንገታቸውን ለሰይፍ ሰጥተው\nስለ ስምህ እየተጠሉ\nከአንበሳ ጋር እየታገሉ	\nበተጋድሏቸው ያከበሩህን \nእናከብራለን ሰማዕታትህን  /፪/\n   አዝ...\nከህያው ቃልህ እየጠቀሱ\nመናፍቃንን ድል የነሱ\nበገዛ ደምህ የዋጃሃትን \nቤተ ክርስቲያንን የጠበቋትን \nበሕይወታቸው ያስደሰቱህን\nእናከብራለን ቅዱሳንህን /፪/\n   አዝ..." },
			n131 = { "የሕይወትን መዝገብ ቃሉን ያስነበቡህ\nየተዋሕዶ አርበኞች ቅዱሳን ዋኖችህ\nየድካም ዋጋእው የእምነታቸው ፍሬ \nያማረ ነውና ምሰላቸው ዛሬ\n   አዝ...\nምሥጢሩ ምንድን ነው ድል የማድረጋቸው \nለሰማያዊ ክብር ለአክሊል ያበቃቸው \nየሕይወታቸውን መዝገብ ግለጥና አንብበው\nመፍትሔ አለውና ገድላቸው የአበው\n   አዝ...\nድካም ሲበረታ በመንፈስ ስትዝል\nዙሪያህን ሲከብህ የኃጢአት ማዕበል\nጽናት ትዕግስት አጥተህብእንዳትሰናከል\nበጾም ጸሎት በርታ አባቶችን ምሰል\n   አዝ...\nዓለም ኢያሪኮ ቢፈትንህ ሥጋ\nዲያቢሎስም ቢያሴር ከመንገድ ሊያርቅህ\nልትወቅድ አትችልም ምን ቢያይል ፈተና\nካሰብክ የጸኑትን የተዋሕዶን ፋና\n   አዝ..." },
			n132 = { "ይቤላ ሕፃን ለእሙ ጥብዒኬ እም ወኢትናፍቂ /፪/\nእምዝ ዳግመ አልቦቱ ኩነኔ አልቦ /፪/\nይላታል ሕፃን እናቱን ጨክኚ እናቴ አትጠራጠሪ /፪/\nከዚህ በኋላ የለብንምና ኩነኔ የለም /፪/\n\n *ሕፃን ያለው ሰማዕቱን ቅዱስ ቂርቆስን ሲሆን እናቱም ቅድስት ኢየሉጣ ናት፡፡" },
			n133 = { "ያሬድ ሐዋርያ /፮/\nዘአብርሃ ለኢትዮዽያ /፬/\n\n ትርጉም- ያሬድ ሐዋርያ ለኢትዮዽያ አበራ፡፡" },
			n134 = { "ትክበር ነፍስየ በቅድሜከ ዮም /፪/\nባርከኒ አባ /፬/ ባርከኒ ተክለ ሃይማኖት /፪/\n\n  ትርጉም- ነፍሴ እነሆ በአንተ ዘንድ ትክበር ተክለ ሃይማኖት ሆይ ባርከኝ፡፡" },
			n135 = { "አባ አቡነ አባ መምህርነ/፪/አባ ተክለ ሃይማኖት/፪/\nእም አእላፍ /፪/ ኅሩይ እም አእላፍ ኅሩይ/፪/\n   አዝ...\nአምላክ የጠራህ ለታላቅ ክብር\nተክለ ሃይማኖት ትጉ መምህር\nሐዋርያ ነህ በዚች በምድር/፪/\nጸሎት ምህላህ በእውነት ተሰማ\nክብርህ ታወቀ በላይ በራማ/፪/\n   አዝ...\nደብረ ሊባኖስ ተቀደሰች \nበእጅህ መስቀል ተባረከች/፪/\nኤልሳዕ ልበልህ ቅዱስ ዮሐንስ\nተክለ ሃይማኖት ጻድቅ ነህ ቅዱስ/፪/\n   አዝ...\nተክለ አብ ተክለ ወልድ ተክለ መንፈስ ቅዱስ\nጸሎትህ ሆኖናል መድኃኒትና ፈውስ/፪/\nዛሬም ስንጠራህ ቃል ኪዳንህን አምነን\nጠለ በረከትህ ለሁላችን ይሁን/፪/" },
			n136 = { "ከመ ጸበል ዘነፋስ ዘረውዎ ደብረ ይድራስ /፪/\nወወገርዎ /፮/ ለጊዮርጊስ /፪/\n\n   ትርጉም- ይድራስ በሚባል ተራራ አፅሙን ለነፋስ እንደ ትቢያ በተኑት ቅዱስ ጊዮርጊስን ወገሩት፡፡" },
			n137 = { "ፍጡነ ረድኤት ጊዮርጊስ ተራድአኒ    \nሶበ ለገብርከ/ለአመትከ/ ኀዘን አኀዘኒ  /፪/\nወጸሎትየ /፫/ ፍጡነ ስምዐኒ /፪/\n ትርጉም- ፈጥኖ ደራሽ ጊዮርጊስ ባርያህን/አገልጋይህን/ ሐዘን በያዘኝ ጊዜ ጸሎቴን ፈጥነህ ስማኝ፡፡" },
			n138 = { "ይቤለኪ ያሬድ በሃሌ ሉያ /፪/\nብሔረ አግዐዚ ቅድስት ኢትዮዽያ /፬/ \n\n  ትርጉም- ያሬድ በመዝሙር የነጻነት ሀገር ቅድስት ኢትዮዽያ ናት ይልሻል፡፡" },
			n139 = { "ሰባኬ ወንጌል መጋቤ ሃይማኖት ለቤተ ክርስቲያን ዘይደምፅ  \nቀርን ነባቤ ለቤተ ክርስቲያን                                   /፪/\nያሬድ ፀሐያ ለኢትዮዽያ ዓምደ ብርሃን ለቤተ ክርስቲያን  \nመልአክ ዘበምድር/፪/ መልአክ                              /፪/\n\n ትርጉም፡- ቅዱስ ያሬድ ሰባኬ ወንጌል መጋቤ ሃይማኖት ለቤተ ክርስቲያንም የሚመሰክር መለከት ነው፡፡ የኢትዮጵያ ፀሐይ የብርሃንም ምሰሶ በምድር ላይ ያለ መልአክ ነው፡፡" },
			n140 = { "ይትፌሥሑ ጻድቃን የዋሃን ውሉደ ብርሃን /፪/\nበትፍሥሕት ዔሉ ውስተ አድባር /፬/ ኧኸ\n\nትርጉም፡- የብርሃን  ልጆች ጻድቃን ደስ ይሰኛሉ\nበደስታም ከተራራ ወደ ተራራ ዞሩ/ገዳም ገቡ/፡፡" },
			n141 = { "ዘረከቡኪ ጻድቃን ማርያም ድንግል /፬/\nመንግሥተ ሰማያት /፫/ ማርያም /፪/\n\nትርጉም፡- ጻድቃን ያገኙሽ የሰማይ መንግሥት ማርያም አንቺ ነሽ፡፡" },
			n142 = { "ወዐቀቦሙ ከመ ብንተ ዓይን ለጻድቃን /፪/\nእለ ሎቱ ተቀንዩ በሕይወቶሙ /፬/\n\nትርጉም፡- ጻድቃንን እነደ ዓይን ብሌን ጠብቃቸው እነርሱንም በሕይወታቸው ዘመን ሁሉ ተገዝተውለታልና፡፡" },
			n143 = { "ዮሐንስ ክቡር ነቢየ ልዑል /፪/\nብእሴ ሰላም/፬/ ዘንብረቱ /፪/ ገዳም /፪/ ኧኸ\n\nትርጉም፡- ክቡር ዮሐንስ የእግዚአብሔር ነቢይ የሰላም ሰው ኑሮው በዱር የሆነ/ሰውነቱን ለገዳም ያዘጋጀ/፡፡" },
			n144 = { "ሐዋርያት አበው እንዳስተማሩን \nስለ ሰው ልጅ ድኅነት አምላክ ሰው መሆኑን\nበስሙ የተጠራን እኛ እናምናለን \nመለኮት ከስጋ ተዋህዷል ብለን\n      እናምናለን እኛ ሁለት ልደታትን      \n      የአብ ልጅ ከድንግል ዳግም መወለዱን	 /፪/\nስግደት የሚገባው የአብ አካላዊ ቃል \nከክቡር ዙፋኑ ከሦስትነት ሳይጎድል\nበዚህ ዓለም መጥቶ ሰው ሆኗል ከድንግል \nከአብ አንድነቱ ከቶም ሳይከፈል\n   አዝ...\nቃልም ሥጋ ሆኖ በእኛ ላይ አድሮ\nወልደ አብ ወልደ ማርያም በተዋህዶ ከብሮ \nፍጹም ሰውነቱ \nተገልጧል በድንግል በዳግም ልደቱ\n   አዝ..." },
			n145 = { "ይቤሎ መንፈስ ቅዱስ ለፊልጶስ ሑር ወትልዎ ለዝንቱ ሠረገላ ዘአፍራስ /፪/\nፊልጶስ መሀሮ ለባኮስ በእንተ ክርስቶስ ወአጥመቆ በማየ ጥምቀት ሐዲስ /፪/\nአለው መንፈስ ቅዱስ ፊልጶስን ሂድና ተከተለው ይህንን የአፍራስ ሠረገላ /፪/\nፊልጶስ አስተማረ ለባኮስ ስለ ክርስቶስ አጠመቀውም በማየ ጥምቀት ሐዲስ /፪/" },
			n146 = { "ሃሌ ሉያ ጊዮርጊስ ግሩም በመንፈስ ቅዱስ ኅቱም \nመዓዛ ቅዳሴከ ጥዑም/፪/ ከመ ጽጌ ገዳም /፪/\nነዐ /፪/ ማዕከሌነ ቁም በበዓልከ ባርከነ ዮም \nቅዱስ ጊዮርጊስ ግሩም ኧኸ ሊቀ ሰማዕት   /፪/\n\nትርጉም፡- በመንፈስ ቅዱስ የታተምህ ጊዮርጊስ ሆይ ግሩም ነህ፤ የምስጋናህ መዓዛ እንደ ገዳም አበባ የጣፈጠ ነው፡፡ የሰማዕታት አለቃ ቅዱስ ጊዮርጊስ ሆይ በበዓልህ ቀን በመሀከላችን ቆመህ ባርከን፡፡\n\n    (የሚዘመርበት ወቅት ህዳር 7)  " },
			n147 = { "አክሊሎሙ አንተ ለሰማዕት /፪/\nወአስተርአየ ገሃደ ከመ ሰብእ /፬/ ኧኸ\n\nትርጉም፡-ለሰማእታት አክሊላቸው አንተ ነህ፡፡ \nእንደ ሰው በግልፅ ታየህ /ተመላለሰ/ ተገለጥህ፡፡\n\n  (የሚዘመርበት ወቅት ጥር 8)  " },
			n148 = { "ሰአል ለነ ጊዮርጊስ/፪/ ኀበ እግዚእነ /፪/\nወጸሊ በእንቲአነ ሀረድዎ ወገመድዎ ወዘረዎ ሥጋሆ ከመ ሐመድ /፪/\n\nትርጉም፡- ሥጋህን ቆራርጠው እንደ አመድም የበተኑህ ቅዱስ ጊዮርጊስ ሆይ ለእኛ ከእግዚአብሔር ዘንድ ለምንልን፡፡" },
			n149 = { "ከመ ጸበል ዘነፋስ ዘረውዎ ደብረ ይድራስ /፪/\nለብጹዕ ወለቅዱስ/፫/ ጊዮርጊስ ሰማዕት /፪/  \nእንደ ነፋስ ትቢያ በተኑት በይድራስ ተራራ /፪/\nብፁዕንና ምስጉንን/፫/ ጊዮርጊስ ሰማዕት /፪/" },
			n150 = { "በበግማድ ሥጋሁ መተሩ/፫/ \nቅዱስ /፫/ ጊዮርጊስ ሞዖሙ ለጸሩ /፪/\n\nትርጉም፡- በየጥቂቱ ሥጋውን ቆራረጡት ቅዱስ ጊዮርጊስ ጠላቶቹን አሸነፋቸው፡፡" },
			n151 = { "ዘረዉ ሥጋሁ /፬/\nኧኸ /፬/ አባ ጊዮርጊስ መንግሥተ ክብር/፪/ ወረሰ በሰላም /፪/\n\nትርጉም፡- ለጌታ ክብር ብሎ ሥጋውን የዘሩት ቅዱስ ጊዮርጊስ አባታችን የመንግስተ ሰማያትን ክብር ወረሰ፡፡" },
			n152 = { "መክብበ ሰማዕት ጊዮርጊስ ፍጡነ ረድኤት ቅዱስ/፪/\nኃያል /፬/ መዋዔ ደራጐን ኃያል ገባሬ ኃይል /፪/\n\nትርጉም፡- የሰማዕታት አለቃ ሹም የሆንከው ፍጡነ ረድኤት ቅዱስ ጊዮርጊስ ደራጐንን የሚያሸንፍ  ኃይልን የሚያደርግ ነው፡፡" },
			n153 = { "በፍቅረ አምላኩ ጊዮርጊስ /፪/\nተጋደለ /፬/ ወፈጸመ ገድሎ /፪/\n\nትርጉም፡- በአምላኩ ፍቅር ቅዱስ ጊዮርጊስ ተጋድሎውን ፈጸመ፡፡" },
			n154 = { "ገድልከ ግሩም ነገርከ ጥዑም /፪/\nጊዮርጊስ ኃያል እንቍ ስም ቅረበነ/፫/ በሠላም /፪/\n\nትርጉም፡- ገድልህ ግሩም አስደናቂ ኃያሉ ጊዮርጊስ ስምህ እንቁ የከበረ ነው፡፡ በሰላም ቅረበን፡፡" },
			n155 = { "ነዋ ጊዮርጊስ አሐዱ እምቅዱሳን ሰማዕት/፪/ \nመጽአ ይርድአኒ/ ይቤ ምኒል ንጉሥ፪/\n\nትርጉም፦ ንጉሥ ምኒልክ አለ እነሆ ከቅዱሳን ሰማዕት አንዱ የሆነ ጊዮርጊስ ሊረዳኝ መጣ።\n/የካቲት 23 የሚዘመር/ " },
			n156 = { "እም ኢትዮጵያ እም አጽናፈ ምድር/፪/\nእም ትውልደ አንስት ትትነሳእ ንግሥተ አዜብ /፬/\n\nትርጉም ፦ ከኢትዮጵያ ከምድር ዳርቻ ከሴቶች ወገን እነሆ ንግሥተ አዜብ ትነሣለች።" },
			n157 = { "መዓልተ ምስሌነ ሌሊተ ምስሌነ/፪/\nዝንቱ ሰማዕት /፪/ ቅዱስ ጊዮርጊስ /፬/ ኧኸ \nቀንም ከእኛ ጋር ነው ሌሊትም ከእኛ ጋር  /፪/\nይህ ሰማዕት /፪/ ቅዱስ ጊዮርጊስ /፬/ ኧኸ" },
			n158 = { "ገሃደ ቀዊሞ በውስተ አውድ ቀዊሞ ውስተ አውድ/፪/\nጊዮርጊስ ሰበከ ትንሣኤ ሞቱ ለወልድ /፪/\n\nትርጉም፦ ቅዱስ ጊዮርጊስ በግልጽ አደባባይ ቆሞ የወልድን ትንሣኤውንና ሞቱን አስተማረ። " },
			n159 = { "ጸለየ ቅዱስ ጊዮርጊስ እንዘ ይብል /፪/\nኢትግድፋ ለነፍስየ ኢየሱስ ክርስቶስ /፬/ ኧኸ\n\n  ትርጉም:- ቅዱስ ጊዮርጊስእንዲህ ሲል ለመነ ጌታዬ ኢየሱስ ክርስቶስ ሆይ ነፍሴን አትተዋት::" },
			n160 = { "መጽአት ወለታ ለሔሮድያዳ ኀበ ንጉሥ ወትቤሎ ሀበኒ በፃህል /፪/ \nሀበኒ በፃህል ርእሰ ዮሐንስ ባህታዊ/፪/ ክቡር /፪/ \n\nትርጉም፡- የሔሮድያዳ ልጅ ወደ ንጉሥ መጣች የክቡር ወንጌላዊውን/መጥምቁን/ የዮሐንስንም ራስ ስጠኝ አለችው፡፡\n\n    /የመስከረም ፬ ዚቅ ይመልከቱ/" },
			n161 = { "ዘእምደብረ/፪/ ደናግል /፪/ አባ አረጋዊ /፪/\n አረጋዊ ዘውገ ሙሴ ወገብረ ክርስቶስ አማን ቀደሶሙ መንፈስ ቅዱስ/፪/\n\n  ትርጉም፡- ከደናግል ተራራ አባ አረጋዊ ሙሴ ገብረ ክርስቶስ ጓደኛሞች ናቸው፤በሥራቸው በምግባራቸው አንድ የሆኑ በእውነት መንፈስ ቅዱስ የቀደሳቸው ናቸው፡፡" },
			n162 = { "ዛ አንቀጽ እንተ እግዚአብሔር አንቀጸ አድኅኖ/፪/\nጻድቃን ይበውኡ ውስቴታ አረጋዊ ወገብረ ክርስቶስ /፪/\n\nትርጉም፡- ይህች የእግዚአብሔር ደጅ ናት የድኅነት በር ናት ጻድቃን ወደሷ ይገባሉ አረጋዊና ገብረክርስቶስ፡፡" },
			n163 = { "እም ገዳመ መንበሩ /፪/ ደብረ ዝቋላ ማኅደሩ /፪/\nለመካነ ሕይወት /፫/ ይዕቲ ማኅደሩ /፪/\n\nትርጉም፡- ከገዳም/ከበረሃ/ መቀመጫው በበረሃ ማደሪያው የዝቋላ ተራራ ነው፡፡ይቺም የሕይወት ቦታ ናት፡፡" },
			n164 = { "ከመ ኖኅ በየውሀቱ ወከመ ኢዮብ በትዕግስቱ ገብረ ክርስቶስ /፪/\nወከመ ኤልያስ /፪/ ይመስል ሕይወቱ ለአረጋዊ/፪/\n    እንደ ኖኅ ነው በየውሐቱ እንደ ኢዮብም ነው \nበትዕግስቱ ገብረ ክርስቶስ /፪/\nእንደ ኤልያስም /፪/ይመስላል ሕይወቱ የአረጋዊ/፪/" },
			n165 = { "በስመ አበ ወወልድ ወመንፈስ ቅዱስ\nተግባረ ተክለ አበ ብእሴ ሞገስ /፪/\nይነገር ይሰማ እስከ አጽናፍ ድረስ\nየሚሆን ነውና ለሕሙማን ፈውስ /፪/\n    በቃል ኪዳኑ አምነሽ ለሰጠው ፈጣሪ\n      ለምግባረ ሠናይ ነፍሴ ተጣጣሪ        /፪/ አዝ\nጋሻና ጦር ይዞ ከማደን አራዊት\nየሰው ልጅ እንዲያድን ሥላሴ መረጡት /፪/\nእግዚአ አጋእዝት ጸጋን የሚሰጡ\nተክለ ሃይማኖት ብለው ስሙንም ለወጡ /፪/\n   አዝ....\nበኪደተ እግሩ ኢትዮጵያን ቀድሶ\nመጣ ደብረ አስቦ በመንፈስ ገስግሶ /፪/\nእግሩ እንኳን ቢሰበር በመቆም ብዛት\nለሰባት ዓመታት ጸና በጸሎት /፪/" },
			n166 = { "መጽሐፈ ዜናሁ ለቂርቆስ መንፈሳዊ ወዘመልክዑ ሰላመ /፪/\nኧኸ ጸሐፍ ውስተ ልብየ /፪/ እንዘ ትገብር ቀለመ    \nደመከ አምላካዌ በመስቀል ዘዘንመ /፪/             /፪/\n\nትርጉም- ጌታዬ ኢየሱስ ክርስቶስ ሆይ የመንፈሳዊው ቂርቆስ የዜናውን መጽሐፍና የመልኩን ሰላምታ በመስቀል ላይ የዘነመውን አምላካዊ ደምህን ቀለም አድርገህ በልቤ ጻፍልኝ፡፡ (መልክዐ ቂርቆስ)" },
			n167 = { "ዘንተ ሀለየ ወይቤ ምንተኑ ዘረብሁ አቡየ ወእምየ \nዘኢረከቡ በቁዔተ በሲመተ ዓለም ሐላፊ /፪/\nወይቤ ቅዱስ ማር ጊዮርጊስ አንሰ አኃድግ እምኔየ ክብረ \nዝንቱ ዓለም ዘየሀልፍ ፍጡነ አጥሪ ሊተ መንግሥተ ሰማያት /፪/\n  ትርጉም፡- ቅዱስ ጊዮርጊስ እንዲህ ሲል አሰበ አለም አባትና እናቴ ከዚህ ሐላፊ ዓለም ሹመት ምን አገኙ ለእኔስ ጌታ ሆይ የዚህ ሐላፊ ዓለም ክብር ቀርቶብኝ መንግሥተ ሰማያትን ገንዘብ አድርግልኝ፡፡ " },
			n168 = { "አሰርገዋ ለኢትዮጵያ በስብሐት ወበ ሃሌ ሉያ /፪/ \nያሬድ ካህን ጥዑመ ልሳን ለቤተክርስቲያን ፀሐያ/፪/\nአሸበረቃት ኢትዮጵያን በምስጋና ወበ ሃሌ ሉያ/፪/ \nካህኑ ያሬድ ልሳኑ ጣፋጭ ለቤተ ክርስቲያን ብርሃኗ /፪/ " },
			n169 = { "አምላኮሙ ለክርስቲያን ተመሲሎ ሰብአ መጽአ               \nኅቤየ ወይቤላ ቅዱስ ጊዮርጊስ /፪/\nአንሰ ኢኮንኩ አምላክ አላ ገብረ አምላክ አነ /፪/\nየክርስቲያን አምላካቸው ሰውን ተመስሎ መጣ ወደ እኔ\nቅዱስ ጊዮርጊስ አላት /፪/\nእኔስ አምላክ አይደለሁም የአምላክ አገልጋይ ነኝ እንጂ /፪/" },
			n170 = { "ቅዱሳን ጻድቃን ነቢያት ሐዋርያት /፪/\nይለመኑናል ይታደጉናል ያማልዱናል ያስታርቁናል /፪/ \nየእግዚአብሔር ዓይኖቹ ከቅዱሳኖቹ \nየእግዚአብሔር ጆሮዎቹ ወደ ጻድቃኖቹ \nሁልጊዜ ነውና ሳይለይ ከእነርሱ \nጻድቃን ሰማዕታት ስለ እኛ ሲያለቅሱ \n	ቃል ኪዳን አላቸው ከመድኃኔ ዓለም \n	መታሰቢያቸውም በረከት ነው ለዓለም \n	እኛን ለማማለድ በቀኙ ቆመዋል \nለማግኘት ከፈለግን የቅዱሳን ዋጋ \nከልብም ከሻትን የጻድቃንን ጸጋ \nበወዳጆቹ ስም በቅዱሳን ሁላ \nድሆችን እናስብ የተራበ እናብላ " },
			n171 = { "በየገዳማቱ በየበረሃው ውስጥ\nስለተሰደዱ ፍቅርህን በመምረጥ\nየዓለም ውዳቂ ምናምንቴ ሆነው\nስለፍቅርህ ሲሉ ክብራቸውን ትተው\nእግዚአብሔር ሆይ ማረን /፪/\nየዓለም ውዳቂ ጉድፍ በተባሉት\nበምድር እየኖሩ በጽድቅ ሕይወት ባሉት\nዓለምንና አምሮቷን ትተው በመነኑት\nእግዚአብሔር ሆይ ማረን እግዚአብሔር ሆይ ማረን /፪/\nሕያዋን በሆኑት እስከ ዘለዓለም\nከኢየሱስ ጋራ ሞተው በመስቀል ዓለም\nዓለም በናቃቸው እነሱም በናቁት\nአምላክ ራራልን አትጨክን በእውነት /፪/" },
			n172 = { "ከሠተ አፉሁ ወልሳኑ ነበበ አእኮቶ ወባርኮ ለእግዚአብሔር /፪/\nመልአ መንፈስ ቅዱስ ላዕለ ተክለ ሃይማኖት /፪/\n\n    ትርጉም፡- አባታችን አቡነ ተክለ ሃይማኖት በመንፈስ ቅዱስ ተሞልቶ አፉን ከፈተ በቃሉም እግዚአብሔርን አመሰገነ ባረከውም፡፡\n\n     የሚዘመርበት ወቅት፡- ታኅሳስ 26" },
			n173 = { "ማርቆስ ሐዋርያ ወንጌላዊ ሰማዕት /፪/ \nሰበከ በሮም በመላው ዓለም \nሰበከ በእስክድንርያ በመላው ግብፅ  /፪/" },
			n174 = { "ጸሎትክሙ ጽንዕት/፪/ ሃይማኖትክሙ ርትዕት ሃይማኖትክሙ /፪/\nእንተ በኩሉ ትረድዕ በምግባረ ጽድቅ አግአዚያን አንትሙ \nበምግባረ ጽድቅ /፪/\n\n   ትርጉም፡- የጽድቅን ሥራ በመሥራት ነፃ የምታወጡ በሁሉ ነገር የምትረዱ ብፁዓን ሊቃነ ጳጳሳት ጸሎታችሁ የጸናች ሃይማኖታችሁ የቀናች ናት ፡፡" },
			n175 = { "ደብሩሰ ለአባ አረጋዊ ትመስል ደብረ ሲና ትመስል ደብረ ሲና /፪/\nዘኃደረ በላእሌሃ እግዚአብሔር ሐፁረ የአውዳ ወጽጌረዳ \nበትዕምርተ መስቀል /፪/\n\nትርጉም፡- የአባ አረጋዊ ደብር እግዚአብሔር በላዩ ያደረ ደብረ ሲናን ትመስላለች እነሆ በጽጌረዳ ትዕምርተ መስቀል ተከብባለች፡፡" },
			n176 = { "እመ ድንግል ሐና ወሕይወተ ኩሉ/፪/ ኩሉ ዓለም/፪/\nሐና ቅድስት /፭/ እመ ማርያም /፪/ ኧኸ \n\nትርጉም፡- የቅድስት ድንግል ማርያም እናት ቅድስት ሐና የዓለም ሁሉ እናት፡\n\nየሚዘመርበት ወቅት ኅዳር 11 እና መስከረም 7" },
			n177 = { "ሐና ወኢያቄም ክቡራነ ስም /፪/\nዘወለድዋ /፬/ ወለድዋ ለማርያም /፪/ ኧኸ/፫/\n\n     ትርጉም፡- ቅድስት ድንግል ማርያምን የወለዱ ሐናና ኢያቄም ስማቸው የከበረ ነው፡፡" },
			n178 = { "ጊዜ እረፍታ ለቅድስት ሐና /፪/\nእም ልዕልና ወረደ እግዚአብሔር /፬/ ኧኸ\n\nትርጉም፡- ቅድስት ሐና ባረፈች ጊዜ                     እግዚአብሔር ከልዑል መንበሩ ወረደ፡፡ " },
			n179 = { "አሀዊከ ሰማዕታት ቆላተ ሕማማት ወረዱ/፪/ /፪/\nወጻድቃኒከ /፬/ ጻድቃኒከ ገዳማተ ኦዱ /፪/ ኧኸ/፫/ \n\nትርጉም:- ወንድሞችህ ሰማዕታት መከራውን ታገሱ ጻድቃኖችህም በረሃውን ዞሩ፡፡" },
			n180 = { "ቅድስተ ቅዱሳን ማርያም ድንግል ማርያም\nንጽሕተ ንጹሐን ማርያም ድንግል ማርያም\nታማልዳለች ከልጇ ከመድኃኔ ዓለም /፪/\nታማልዳለች /፬/ ልጄ ሆይ ይቅር በል እያለች\nአባቶቻችን ነቢያት ወሐዋርያት ጻድቃን ወሰማዕታት /፪/\nያማልዳሉ በእውነት/፪/ ያማልዳሉ /፪/\nያማልዳሉ /፬/ አምላክ ሆይ ይቅር በል እያሉ\nሰባቱ ሊቃነ መላእክት ሚካኤል ወገብርኤል\nሩፋኤልና ፋኑኤል ሠራዊቶቻቸውም  ሁሉ\nሰባቱ ሊቃነ መላእክት አፊኒን ራጉኤልና ሳቁኤል\nሠራዊቶቻቸውም ሁሉ ያማልዳሉ ከክፉም ይጠብቃሉ/፪/\nያማልዳሉ /፬/ ከክፉም ይጠብቃሉ\nበዱር በገደል በበረሃ በዋሻም ያሉ/፪/\nያማልዳሉ በእውነት ያማልዳሉ/፪/\nያማልዳሉ /፬/ አምላክ ሆይ ይቅር በል እያሉ /፪/" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("122.	እምልማደ ሳህልከ")) {
				loadChild(n122);
			} else if (HoldItem.equals("123.	ሞገሰ ክብሩ")) {
				loadChild(n123);
			} else if (HoldItem.equals("124.	የአርባብ አለቃ ")) {
				loadChild(n124);
			} else if (HoldItem.equals("125.	ክብሮሙ ለመላእክት ")) {
				loadChild(n125);
			} else if (HoldItem.equals("126.	መዐዛሆሙ ለቅዱሳን")) {
				loadChild(n126);
			} else if (HoldItem.equals("127.	ገባሬ መንክራት")) {
				loadChild(n127);
			} else if (HoldItem.equals("128.	ልቡና የሚመስጥ ")) {
				loadChild(n128);
			} else if (HoldItem.equals("129.	አማን በአማን")) {
				loadChild(n129);
			} else if (HoldItem.equals("130.	ሰአሉ ለነ ")) {
				loadChild(n130);
			} else if (HoldItem.equals("131.	የሕይወትን መዝገብ ")) {
				loadChild(n131);
			} else if (HoldItem.equals("132.	ይቤላ ሕፃን ")) {
				loadChild(n132);
			} else if (HoldItem.equals("133.	ያሬድ ሐዋርያ")) {
				loadChild(n133);
			} else if (HoldItem.equals("134.	ትክበር ነፍስየ")) {
				loadChild(n134);
			} else if (HoldItem.equals("135.	አባ አቡነ ")) {
				loadChild(n135);
			} else if (HoldItem.equals("136.	ከመ ጸበል ዘነፋስ")) {
				loadChild(n136);
			} else if (HoldItem.equals("137.	ፍጡነ ረድኤት")) {
				loadChild(n137);
			} else if (HoldItem.equals("138.	ይቤለኪ ያሬድ")) {
				loadChild(n138);
			} else if (HoldItem.equals("139.	ሰባኬ ወንጌል")) {
				loadChild(n139);
			} else if (HoldItem.equals("140.	ይትፌሥሑ ጻድቃን")) {
				loadChild(n140);
			} else if (HoldItem.equals("141.	ዘረከቡኪ ጻድቃን")) {
				loadChild(n141);
			} else if (HoldItem.equals("142.	ወዐቀቦሙ ")) {
				loadChild(n142);
			} else if (HoldItem.equals("143.	ዮሐንስ ክቡር ነቢየ ልዑል")) {
				loadChild(n143);
			} else if (HoldItem.equals("144.	ሐዋርያት አበው ")) {
				loadChild(n144);
			} else if (HoldItem.equals("145.	ይቤሎ መንፈስ ቅዱስ")) {
				loadChild(n145);
			} else if (HoldItem.equals("146.	ጊዮርጊስ ግሩም")) {
				loadChild(n146);
			} else if (HoldItem.equals("147.	አክሊሎሙ ")) {
				loadChild(n147);
			} else if (HoldItem.equals("148.	ሰአል ለነ ")) {
				loadChild(n148);
			} else if (HoldItem.equals("149.	ከመ ጸበል")) {
				loadChild(n149);
			} else if (HoldItem.equals("150.	በበግማድ ")) {
				loadChild(n150);
			} else if (HoldItem.equals("151.	ዘረዉ ሥጋሁ")) {
				loadChild(n151);
			} else if (HoldItem.equals("152.	መክብበ ሰማዕት ")) {
				loadChild(n152);
			} else if (HoldItem.equals("153.	በፍቅረ አምላኩ")) {
				loadChild(n153);
			} else if (HoldItem.equals("154.	ገድልከ ግሩም")) {
				loadChild(n154);
			} else if (HoldItem.equals("155.	ነዋ ጊዮርጊስ")) {
				loadChild(n155);
			} else if (HoldItem.equals("156.	እም ኢትዮጵያ")) {
				loadChild(n156);
			} else if (HoldItem.equals("157.	መዓልተ ምስሌነ")) {
				loadChild(n157);
			} else if (HoldItem.equals("158.	ገሃደ ቀዊሞ")) {
				loadChild(n158);
			} else if (HoldItem.equals("159.	ጸለየ")) {
				loadChild(n159);
			} else if (HoldItem.equals("160.	መጽአት")) {
				loadChild(n160);
			} else if (HoldItem.equals("161.	ዘእምደብረ ደናግል")) {
				loadChild(n161);
			} else if (HoldItem.equals("162.	ዛ አንቀጽ")) {
				loadChild(n162);
			} else if (HoldItem.equals("163.	እም ገዳመ መንበሩ")) {
				loadChild(n163);
			} else if (HoldItem.equals("164.	ከመ ኖኅ ")) {
				loadChild(n164);
			} else if (HoldItem.equals("165.	በስመ አብ ")) {
				loadChild(n165);
			} else if (HoldItem.equals("166.	መጽሐፈ ዜናሁ ")) {
				loadChild(n166);
			} else if (HoldItem.equals("167.	ዘንተ ሀለየ ")) {
				loadChild(n167);
			} else if (HoldItem.equals("168.	አሰርገዋ")) {
				loadChild(n168);
			} else if (HoldItem.equals("169.	አምላኮሙ")) {
				loadChild(n169);
			} else if (HoldItem.equals("170.	ቅዱሳን ጻድቃን ")) {
				loadChild(n170);
			} else if (HoldItem.equals("171.	በየገዳማቱ")) {
				loadChild(n171);
			} else if (HoldItem.equals("172.	ከሠተ አፉሁ")) {
				loadChild(n172);
			} else if (HoldItem.equals("173.	ማርቆስ ሐዋርያ")) {
				loadChild(n173);
			} else if (HoldItem.equals("174.	ጸሎትክሙ")) {
				loadChild(n174);
			} else if (HoldItem.equals("175.	ደብሩሰ")) {
				loadChild(n175);
			} else if (HoldItem.equals("176.	እመ ድንግል ")) {
				loadChild(n176);
			} else if (HoldItem.equals("177.	ክቡራነ ስም")) {
				loadChild(n177);
			} else if (HoldItem.equals("178.	ጊዜ ዕረፍታ")) {
				loadChild(n178);
			} else if (HoldItem.equals("179.	አሀዊከ ሰማዕታት")) {
				loadChild(n179);
			} else if (HoldItem.equals("180.	ቅድስተ ቅዱሳን ")) {
				loadChild(n180);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T49(this, ParentList,
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
		text.setText("በእንተ ቅዱሳን መላእክት |በእንተ ቅዱሳን");
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

	public class T49 extends BaseExpandableListAdapter {

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

		public T49(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/122.EmLimade Sahilike.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/123.Mogese Kibiru.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/124.Yearbab Aleka.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/125.Kebromu.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/126.MEAZAHOMU.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/127.Gebare Menkirat.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/129.Aman Beaman.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/130.Sealulen Kidusan.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/131.yehyiwetin mezgeb.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/132.Yibela Hitsan.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/133.Yared Hawariya.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/134.Tikber Nefisiye.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/135.Aba Abune.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/136.Keme Tsebel.mp3");
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/137.Fitune Rediet.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/138.Yibeleki Yared.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/139.Bebe Leheqe.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/140.Yitfesihu Tsadikan.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/141.Zerekebuki Tsadikan.mp3");
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/142.Weakebomu.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/143.Yohanis Kibur.mp3");
			} else if (childPosition == 0 && groupPosition == 22) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/144.hawareyat abew.mp3");
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/145.Yibelo Menfes Kidus.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/146.Giyorgis Girum.mp3");
			} else if (childPosition == 0 && groupPosition == 25) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/147.Akililomu ante.mp3");
			} else if (childPosition == 0 && groupPosition == 26) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/148.Seal lene Giyorgis.mp3");
			} else if (childPosition == 0 && groupPosition == 27) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/149.Keme Tsebel.mp3");
			} else if (childPosition == 0 && groupPosition == 28) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/150.Bebegimad.mp3");
			} else if (childPosition == 0 && groupPosition == 29) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/151.Zerewu sigahu.mp3");
			} else if (childPosition == 0 && groupPosition == 30) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/152.Mekibibe Semaet.mp3");
			} else if (childPosition == 0 && groupPosition == 31) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/153.Befikire Amlaku.mp3");
			} else if (childPosition == 0 && groupPosition == 32) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/154.Gedilike Girum.mp3");
			} else if (childPosition == 0 && groupPosition == 33) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/155.Newa Giyorgis.mp3");
			} else if (childPosition == 0 && groupPosition == 34) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/156.Em Ethiopia.mp3");
			} else if (childPosition == 0 && groupPosition == 35) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/157.Mealite misilene.mp3");
			} else if (childPosition == 0 && groupPosition == 36) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/158.Gehade Kewimo.mp3");
			} else if (childPosition == 0 && groupPosition == 37) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/159.Tseleye Kidus Giyorgis.mp3");
			} else if (childPosition == 0 && groupPosition == 38) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/160.Metsat weleta.mp3");
			} else if (childPosition == 0 && groupPosition == 39) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/161.ZeEmdebre Debre.mp3");
			} else if (childPosition == 0 && groupPosition == 40) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/162.Za Ankets.mp3");
			} else if (childPosition == 0 && groupPosition == 41) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/163.Emgedame menberu.mp3");
			} else if (childPosition == 0 && groupPosition == 42) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/164.Keme noh.mp3");
			} else if (childPosition == 0 && groupPosition == 43) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/165.Beseme Ab Weweld.mp3");
			} else if (childPosition == 0 && groupPosition == 44) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/166.Metshafe zenahu.mp3");
			} else if (childPosition == 0 && groupPosition == 45) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/167. zente haleye.wma");
			} else if (childPosition == 0 && groupPosition == 46) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/168.Asergewa - kum zema.mp3");
			} else if (childPosition == 0 && groupPosition == 47) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/169.Amlakomu lekrestian.mp3");
			} else if (childPosition == 0 && groupPosition == 48) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/170.Kidusan Tsadkan.mp3");
			} else if (childPosition == 0 && groupPosition == 49) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/171.Beyegedamatu.mp3");
			} else if (childPosition == 0 && groupPosition == 50) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/172.Kesete Afehu.mp3");
			} else if (childPosition == 0 && groupPosition == 51) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/173.Markos Hawariya.mp3");
			} else if (childPosition == 0 && groupPosition == 52) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/174.Tselotekmu tseneyet.mp3");
			} else if (childPosition == 0 && groupPosition == 53) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/175.Debruse le Aba.mp3");
			} else if (childPosition == 0 && groupPosition == 54) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/176.Eme Dingle Hana.mp3");
			} else if (childPosition == 0 && groupPosition == 55) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/177.Kiburane Sim.mp3");
			} else if (childPosition == 0 && groupPosition == 56) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/178.Gize Erfta Lekidist Hana.mp3");
			} else if (childPosition == 0 && groupPosition == 57) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/179.Ahawike semaetat.mp3");
			} else if (childPosition == 0 && groupPosition == 58) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/180.kidiste kidusan.mp3");
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