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

public class Tiraz40 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("1.	ይትባረክ እግዚአብሔር");
		ParentList.add("2.	እምነት ተስፋ ፍቅር  ");
		ParentList.add("3.	ደምረነ");
		ParentList.add("4.	ድንቅ ነው ");
		ParentList.add("5.	አንትሙሰ");
		ParentList.add("6.	መድኃኔ ዓለም ");
		ParentList.add("7.	እጼውዐከ እግዚእየ ");
		ParentList.add("8.	ቅዱስ እግዚአብሔር");
		ParentList.add("9.	ድንቅ ነው ጥበብህ");
		ParentList.add("10.	መድኃኔ ዓለም");
		ParentList.add("11.	ሰላም ወሰናይ");
		ParentList.add("12.	ናቀድም አእኵቶቶ");
		ParentList.add("13.	እግዚአብሔር ሆይ እወድሃለሁ ");
		ParentList.add("14.	 ባርክ ለነ ");
		ParentList.add("15.	ኢይምሰልክሙ (ቁም ዜማ)");
		ParentList.add("16.	በለኒ መሐርኩከ ");
		ParentList.add("17.	ሠርዓ ለነ ");
		ParentList.add("18.	አምላካችን ሆይ ");
		ParentList.add("19.	አኮቴት");
		ParentList.add("20.	ተይ ተመከሪ ");
		ParentList.add("21.	ከወገኔ ጋራ");
		ParentList.add("22.	ሥላሴን አመስግኑ ");
		ParentList.add("23.	አማን በአማን ");
		ParentList.add("24.	ለሰሚዕ ዕፁብ ግብር");
		ParentList.add("25.	ኢየሱስ ክርስቶስ");
		ParentList.add("26.	ለመላው ዓለም");
		ParentList.add("27.	እሳተ ጽርሑ");

	}
	// Assign children list element using string array.

	String[] n1 = { "ይትባረክ እግዚአብሔር አምላኮሙ ለአበዊነ  /፪/\nዘገብረ ዐቢየ ወመንክረ\nዘገብረ ዐቢየ/፪/ እግዚአብሔር  /፪/\n\nትርጉም- ድንቅና ታላቅ ነገርን ያደረገ የአባቶቻችን አምላክ እግዚአብሔር ይመስገን፡፡" },
			n2 = { "እምነት ተስፋ ፍቅር ከሌለኝ ለእኔ በምድር\nመሥራት ከንቱ ነው ምግባር ትንቢት መናገር ምሥጢር /፪/\nእምነት ከሥራ ቢኖረኝ ፍቅር ከሌለኝ ከንቱ ነኝ\nእንደ ሚጮህ ናስ ሆኛለሁ ባዶ ዕቃ ሆኜ እቀራለሁ /፪/\nያስታግሳል ፍቅር ያስተዛዝናል ፍቅር\nአያቀናናም ፍቅር አያስመካም ፍቅር\nአያስታብይም ፍቅር  ክፉ አያሠራም ፍቅር\nእውነት ይወዳል ፍቅር ዐመፅ ይጠላል ፍቅር /፪/\nያለኝን ሁሉ ባካፍል ሥጋዬን  ከእሳት ብጥል\nፍቅር ከሌለኝ አይጠቅምም ከዳግም ጥፋት አልድንም /፪/\nትንቢትም ቢሆን ይቀራል\nልሳንም ቢሆን ይሻራል\nዕውቀትም ቢሆን ይጠፋል\nጉልበትም ቢሆን ይደክማል  /፪/\nእምነት ተስፋ ፍቅር የእነዚህ ሦስቱ ነገር\nፀንተው ይኖራሉ በምድር ከሁሉ በላይ ፍቅር/፫/ " },
			n3 = { "ደምረነ ምስለ ኵሎሙ ቅዱሳን ምስለ እለ ገብሩ  ፈቃድከ እለ እምዓለም አስመሩከ          /፪/\nእለ ዐቀቡ በንጽሕ ሥርዓተ ቤትከ ወእለ ሰበኩ በሠናይ/፪/በሠናይ ዜናከ /፪/\n\nትርጉም፡- ፈቃድህን ከፈጸሙና በዓለም እያሉ አንተን ደስ ካሰኙ ከሁሉ ቅዱሳን ጋር ደምረን በንጽሕና ሆነው የቤትህን ሥርዓት ከጠበቁ እና በመልካም የመንግሥትህን ወንጌል ከሰበኩ ሁሉ ጋር ፡፡" },
			n4 = { "ድንቅ ነው ልዩ ነው ልዑል የእኛ ጌታ\nምስጋና ይድረሰው ከጠዋት እስከ ማታ(2)\n	አዝ....\nየማይመረመር በሰው ልጅ ኅሊና\nረቂቅ ባሕርይ ገናና ነውና \nያለ የነበረ ከዘመናት በፊት \nለዘለዓለም ኗሪ ፈጣሪ ዓለማት \n	አዝ....\nበፍጥረታት ሁሉ የሚመሰገነው \nኃያሉ ጌታችን በእውነት ልዩ ነው \nበፍጹም ልዩ ነው የእርሱ ጌትነቱ \nአልፋና ዖሜጋ ጽኑ ነው መንግሥቱ\n	አዝ.... \nአዳምን ለማዳን ፍጹም በመውደዱ \nየማይሞተው አምላክ ሞተ በፈቅዱ\nምሥጢሩ ረቂቅ ነው ለሰዎች አእምሮ \nፍቅሩ ያስደንቃል ስናየው በአንክሮ\n	አዝ...." },
			n5 = { "ኧኸ አንትሙሰ ኧኸ አኀዊነ /፪/\nኧኸ ባረክናክሙ ውስተ ቤተ እግዚአብሔር /፪/\n\nትርጉም፡- እናንተ ወንድሞች ሆይ ከእግዚአብሔር ቤት መረቅናችሁ፡፡\n\n   የሚዘመርበት ወቅት- ለምረቃ(ለሠርግ)" },
			n6 = { "መድኃኔ ዓለም እግዚአብሔር ኀደረ ላዕሌሃ /፪/\nኪያሃ ዘሠምረ ሀገረ /፬/ ኧኸ\n\nትርጉም፡- የዓለም መድኃኒት  እግዚአብሔር እርሷን መርጧልና በርሷ ላይ አደረ፡፡" },
			n7 = { "እጼውዐከ እግዚእየ ኢየሱስ ክርስቶስ /፪/\nጸግወኒ ስእለትየ /፬/ ኧኸ\nእጠራሃለሁ ጌታዬ ሆይ ኢየሱስ ክርስቶስ/፪/\nእንድታድለኝ ጸጋ ነፍስ /፬/ ኧኸ" },
			n8 = { "ቅዱስ /፫/ እግዚአብሔር\nለአማልክት አምላክ እናቅርብለት ምስጋና\nምሕረቱ ለዘለዓለም ነውና\nለነገሥታት ንጉሥ እናቅርብለት ምስጋና\nየእስራኤል  አምላክ ቅዱስ/፫/\nበጠራንህ ጊዜ ፈጥነህ ድረስ/፫/\n   አዝ...\nተገዙ ለእግዚአብሔር ስሙንም ጥሩ\nድንቅ ሥራውንም ለአሕዛብ ንገሩ \nየእስራኤል  አምላክ ቅዱስ/፫/\nበጠራንህ ጊዜ ፈጥነህ ድረስ/፫/\n   አዝ...\nበዝናብ አብቅሎ በፀሐይ አብስሎ\nይመግባልና ሁሉን አስተካክሎ\nየእስራኤል  አምላክ ቅዱስ/፫/\nበጠራንህ ጊዜ ፈጥነህ ድረስ/፫/\n   አዝ...	\nአትወድምና በእውነት የሰው ልጆችን ጥፋት\nየእስራኤል  አምላክ ቅዱስ/፫/\nበጠራንህ ጊዜ ፈጥነህ ድረስ/፫/\n   አዝ...\nአቤቱ ጸሎቴን ስማ በያሬዳዊ ዜማ\nየእስራኤል  አምላክ ቅዱስ/፫/\nበጠራንህ ጊዜ ፈጥነህ ድረስ/፫/\n   አዝ..." },
			n9 = { "ኦ አምላክ ዘለዓለም /፪/\nቀዳሚ ወደኃሪ ዘአልብከ ጥንት\nቀዳሚ ወደኃሪ ወኢተፍጻሚት\nመጀመሪያ የለህ አይታወቅም\nመጨረሻ የለህ አይታወቅም\nአይደረስበት አመጣጥህ ድንቅ ነው ጥበብህ /፪/\n   አዝ...\nወሰን የለህ ኃያል ጌታ\nየመላህ ነህ ሁሉም ቦታ\nአይታይም ስትወረውር\nሲመታ  እንጂ ያንተ በትር /፪" },
			n10 = { "መድኃኔዓለም ወሃቤ ሠላም /፪/\nይክበር ይመስገን ዘለዓለም /4/\n\n ....ወሃቤ ሰላም - ሰላምን ሰጪ ማለት ነው፡፡" },
			n11 = { "ሰላም ወሰናይ /፪/ ለኩልክሙ ይኩን ሰላም ለኩልክሙ /፪/\nሰላም ለእናንተ /፪/ ለሁላችሁም ይሁን ሰላም ለሁላችሁም/፪/" },
			n12 = { "ናቀድም አእኩቶቶ ለእግዚአብሄር /2/\nከመ ያስምዐነ /3/ ቃለ ሕይወት /2/\n\n	ትርጉም፦ በመጀመሪያ ምስጋናን ለእግዚአብሔር እናቀርባለን የሕይወትን ቃል ያሰማን ዘንድ።" },
			n13 = { "እግዚአብሔር ሆይ እወድሃለሁ \nስለስምህ እዘምራለሁ \nፍቅርህ እኔን ይመስጠኛል 	\nእንደ እግዚአብሔር ከየት ይገኛል /፪/\n	ዓለም ሁሉ በጠላኝ ጊዜ \n	ስንገላታ ይዞኝ ትካዜ \n	አንተ ከኔ አልተለየህም \n	እግዚአብሔር ሆይ ወደር የለህም /፪/\nአዝ...\n	ሞቷል ብለው ቀብረውኝ ሰዎች \n	ምስኪን ሆኜ ሳይኖረኝ አንዳች \n	ከመቃብር ቆፍሮ አወጣኝ \n	አይዞህ ብሎ አምላኬ አጽናናኝ /፪/ \nአዝ" },
			n14 = { "ባርክ ለነ እግዚኦ ዘንተ ዓመተ ምሕረትነ በብዝኃ ኂሩትከ     \nለሕዝብከ ኢትዮጵያ/አፍሪካዊያን/ ከመ ንግነይ ለስምከ ቅዱስ \nወከመ ይኩን ንበረተነ በሰላም ወበዳኅና በዝንቱ ዓመት /፪/\nባርክልን አቤቱ ይህንን የምሕረት ዓመታችን በቸርነትህ ብዛት    \nለሕዝቦችህ ኢትዮጵያን(አፍሪቃዊያን) እንድንገዛ ለቅዱስ ስምህ  \nእንዲሆንልን ኑሮአችን የሠላም የደህና በዚህ ዓመት /፪/" },
			n15 = { "ኢይምሰልክሙ ዘመጻእኩ እሳሮሙ ለኦሪት ወለነቢያት \nወኢከመ እንስቶሙ አላ ዳእሙ ዘእንበለ ከመ እፈጽሞሙ \nይቤ እግዚእ በወንጌለ ሰላሙ አማኑኤል ስሙ ማርያም እሙ፡፡\n\nአማኑኤል የተባለ በሥጋ ከእመቤታችን ማርያም የተወለደ ጌታ የሠላሙ ቃል በሆነች ወንጌል ኦሪትንና ነቢያትን ልፈጽማቸው እንጂ ለመሻር የመጣሁ አይምሰላችሁ አለ፡፡" },
			n16 = { "በለኒ መሐርኩከ በለኒ መሐርኩኪ በእንተ ማርያም /፪/\nእስመ አልቦ ዘእንበሌከ ዘይሜሕር ቃለ መድኃኔዓለም /፪/\nበለኝ ምሬሐለሁ በለኝ ምሬሻለሁ ስለ ማርያም /፪/\nየለምና የሚምር ቃል ያለአንተ መድኃኔ ዓለም /፪/" },
			n17 = { "ሠርዓ ለነ ሰንበተ ለዕረፍተ ዚአነ /፪/ \nሠርዓ ለነ ሰንበተ ለዕረፍተ ዚአነ /፪/ ኧኸ\nሠራልን ሰንበትን ለዕረፍታችን /፪/\nሠራልን ሰንበትን ለዕረፍታችን /፪/ ኧኸ \n	በስድስቱ ቀናት ሁሉን ነገር ሠርቶ \n	ሰባተኛዋን ቀን ለዕረፍት አዘጋጅቶ \n	ለሁላችን ሰጠን ከቀናት ለይቶ \n	ሠርዓ ለነ ሰንበተ ለእረፍተ ዚአነ \nከዕለታት መርጦ አርፎባታልና \nየሞትንም ስልጣን ሽሮባታልና \nይህቺ ቅድስት ዕለት ክብርት ናት ገናና \nሠራልን ሰንበትን ለዕረፍታችን " },
			n18 = { "አምላካችን ሆይ /፪/ ልጆችህን አስበን /፪/\nበፍቅረ ረድኤትህ በረከትን ስጠን \nበምሕረት እጆችህ ጸጋህን አብዛልን  /፪/\n	ዓለም በወጥመዷ አምላክ ሆይ \n	ስባ እንዳትጥለን አምላክ ሆይ \n	ምራን ጌታችን ሆይ አምላክ ሆይ \n	ከኀጢአት አድነን አምላክ ሆይ \n	የሰይጣን ምርኮኛ አምላክ ሆይ \n	ሆነን እንዳንቀር አምላክ ሆይ \n	በሕይወታችን ኑር አምላክ ሆይ \nእኛ ኀጥአን ነን አምላክ ሆይ \nአንተን የበደልን አምላክ ሆይ \nመብራት እና ዘይት አምላክ ሆይ \nየሌለን በእጃችን አምላክ ሆይ \nእባክህ ጌታ ሆይ       << \nከደጅ አታስቀረን        << \nየእጅህ ሥራዎች ነን    << \nአቤቱ ራራልን              << \n	ምንም ብዙ ቢሆን አምላክ ሆይ \n	እዳ በደላችን             << \n	ከፊትህ ለመቆም        << \n	መልካም ግብር ባይኖረን   << \n	ስለተመረጡት                  << \n	ከጥፋት አድነን                << \n	ሰውረን ከእሳት               " },
			n19 = { "	አኮቴት ለአንተ ይገባል\n	ስብሐት ለአንተ ይገባል\n	አምልኮ ለአንተ ይገባል\n	ስግደትም ለአንተ ይገባል\nቅድመ ዓለም የነበር በታላቅ ሥልጣኑ\nለኩነተ ሥጋ የመጣው በፍቅሩ\nደግሞም ይህን ዓለም የሚያሳልፍ ጌታ\nኢየሱስ ክርስቶስ ኃያል የኛ አለኝታ\n   አዝ...\nበሥጋው ሲታመም ሊሞት በመስቀል\nበአብ ቀኝ የነበረ በሰማይ ሳይጎድል\nየአዳምን ባሕርይ ተዋሕዶ ሲያከብር\nበዚህ ይገለጣል የጌታችን ፍቅር\n   አዝ...\nከቅድስት ሥላሴ የማይለይ ምክሩ\nጉድለት የለበትም ትክክል ነው ክብሩ\nየአብ ቃል ጥበቡ ክንዱ ስለሆነ\nዓለምን ፈጠረ አዳምን አዳነ\n   አዝ...\nሊቃነ መላእክት ኃይላቸው ነውና\nያመሰግኑታል በታላቅ ትህትና\nዘውዳቸው ክብራቸው ስለሆነ እርሱ\nይኖራሉ ወልድን ስሙን ሲያወድሱ\n   አዝ..." },
			n20 = { "ተይ ተመከሪ ነፍሴ ሆይ ተይ ተመከሪ /፪/ \nበዓለም መድኃኒት ነፍሴ ሆይ በእግዚአብሔር ታመኚ /፪/\n	ለሥጋ መገዛት ነፍሴ ሆይ ምነው ቢቀርብሽ \n	ውርደት ነው ፍጻሜው ነፍሴ ሆይ የሚከያናንብሸ \n	መልካም የሆነውን ነፍሴ ሆይ ጽድቁን ተከተይ     \n	ክርሰቶስን መስለሽ ነፍሴ ሆይ ቸርነትን ሥሪ \nሞትን ማን ይመርጣል ነፍሴ ሆይ ሕይወትን በመጥላት \nከእንግዲህ መራቅ ነው ነፍሴ ሆይ ከስርቆት ከዝሙት     \nጸጋ እንዲበዛልሽ ነፍሴ ሆይ የቃሉ በረከት        \nከቤቱ አትጥፊ ነፍሴ ሆይ ፍቅር ከሞላበት \n	ለአንቺ ነበር ጌታ ነፍሴ ሆይ ደሙን ያፈሰሰው \n	ተሰቅሎ ሞቶ ነው ነፍሴ ሆይ ፍቅሩን የገለጸው \n	በፍቅሩ ለሳበኝ ነፍሴ ሆይ ላፈቀረኝ ጌታ \n	ምስጋና አቀርባለሁ ነፍሴ ሆይ ዘወትር ጠዋት ማታ \nብወድቅ ምርኩዝ ድጋፍ ነፍሴ ሆይ ጋሻ ይሆነኛል \nለፍርድ አይቸኩልም ነፍሴ ሆይ በፍቅሩ ያየኛል \nማን እንደርሱ አለ ነፍሴ ሆይ ውለታው የበዛ \nመሐሪ ይቅር ባይ ነው ነፍሴ ሆይ የሕይወቴ ቤዛ/፪/" },
			n21 = { "ከወገኔ ጋራ እዘምራለሁኝ\nበደስታ በሐሴት ስሙን እጠራለሁኝ\nምብና መጠጤ አምላኬ ነውና\nዘወትር አቀርባለሁ ለጌታ ምስጋና /2/\nሕዝቡ ተሰብስቦ በቤተክርስቲያን\nሲዘምር ደስ ይላል በአንድነት ሆነን\nበረከት ይሞላል ዝማሬው ይገርማል \nከእጣኑ ጋራ ወደ ላይ ይወጣል  /2/\n	አዝ..........\nቀሳውስቱ ሌሊት ማኅሌት ሲያቀርቡ \nከመላእክቱ ጋር ወረብ ሲወርቡ\nብርሃኑን ለብሰን በደስታ ስንዘምር\nምስጋናው ልዩ ነው ኅሊናን ሲሰውር /2/\n	አዝ............\nየእግዚአብሄርን ሥራ ኑና ተመልከቱ\nሰዎች ሲዘምሩ እንደ መላእክቱ\nየጽጌው ማኅሌት የትንሳኤው ደስታ\nልዩ ዝማሬ ነው እንዳይመስለን ተርታ /2/ " },
			n22 = { "ሥላሴን አመስግኑ /፪/ \nየምድር ፍጥረታት ዘምሩ እልል በሉ  /፪/\nበስመ አብ ወወልድ ወመንፈስ ቅዱስ \nምስጋና ይገባል ከምንም በፊት \nዓለማትን ሁሉ ለፈጠረ ጌታ \nምስጋና ይገባል ከጠዋት እስከ ማታ \n   አዝ ……\nኪሩቤል ሱራፌል የሚያመሰግኑህ \nመላእክት በሰማይ የሚዘምሩልህ \nእኛም የአዳም ልጆች እንዘምራለን \nበሰማይም በምድር እንጠራሃለን\n   አዝ ……\nብራብ በሥላሴ እጠግባለሁኝ \nብጠማም በአምላኬ እረካለሁኝ\nሥላሴ አምባዬ ክብሬም ናቸውና \nሁሌም ይመሩኛል በሕይወት ጎዳና" },
			n23 = { "	አማን በአማን /፬/ \n     መንግሥተ ሥላሴ ዘለዓለም /፪/ \nንግበር ሰብአ ብለው አማን በአማን \nአዳምን ፈጥረውት    ››    ›› \nበቸርነትና በፍቅር ጎበኙት \nሁሉን በእጁ አድርገው ሁሉን አስገዙለት \n   አዝ.....\nየፍቅር የደስታ አማን በአማን \nየበረከት አባት   ››     ›› \nመንግሥቱ ዘለዓለም ኅልፈት የሌለበት \nሊቃነ መላእክት የሚያመሰገኑት\n   አዝ.... \nየዚያን የደግ አባት አማን በአማን \nየአብርሃምን ቤት    ››     ›› \nእንደባረኩለት የእኛንም ባርኩልን \nየቤታችን ዋልታ መሠረት ሁኑልን \n   አዝ....\nበመከራ ጊዜ       አማን በአማን \nከጭንቅ የሚያወጡኝ  ››     ››\nስሙን ሳመሰግን ትረካለች ነፍሴ \nየእነ ሙሴን አምላክ የአብርሃሙን ሥላሴ" },
			n24 = { "ሃሌ ሃሌ ሉያ ለሰሚዕ ዕፁብ ግብር /፪/\nጥበቡ ለእግዚአብሔር /፪/\n\nትርጉም፡- የእግዚአብሔርን ጥበብ መስማት ዕፁብ ድንቅ ነው፡፡" },
			n25 = { "ኢየሱስ ክርስቶስ ይወደናል ይጠብቀናል /፪/\nእርሱ ለእኛ ደሙን ክሶልናል /፬/ ኧኸ" },
			n26 = { "ለመላው ዓለም መድኅን የሆነው በዕፀ መስቀል ላይ የዋለው /፪/\nእናመስግነው /፬/ እንመነው መድኃኔ ዓለም ነው/፬/ ኧኸ" },
			n27 = { "እሳተ ጽርሑ ማየ ጠፈሩ /፪/ \nደመና መንኩራኩሩ ለመድኃኔ ዓለም /፬/ ኧኸ\n\n  ትርጉም፡- ለመድኃኔ ዓለም እሳት አዳራሹ ደመናም መመላለሻው  ነው፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1.	ይትባረክ እግዚአብሔር")) {
				loadChild(n1);
			} else if (HoldItem.equals("2.	እምነት ተስፋ ፍቅር  ")) {
				loadChild(n2);
			} else if (HoldItem.equals("3.	ደምረነ")) {
				loadChild(n3);
			} else if (HoldItem.equals("4.	ድንቅ ነው ")) {
				loadChild(n4);
			} else if (HoldItem.equals("5.	አንትሙሰ")) {
				loadChild(n5);
			} else if (HoldItem.equals("6.	መድኃኔ ዓለም ")) {
				loadChild(n6);
			} else if (HoldItem.equals("7.	እጼውዐከ እግዚእየ ")) {
				loadChild(n7);
			} else if (HoldItem.equals("8.	ቅዱስ እግዚአብሔር")) {
				loadChild(n8);
			} else if (HoldItem.equals("9.	ድንቅ ነው ጥበብህ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10.	መድኃኔ ዓለም")) {
				loadChild(n10);
			} else if (HoldItem.equals("11.	ሰላም ወሰናይ")) {
				loadChild(n11);
			} else if (HoldItem.equals("12.	ናቀድም አእኵቶቶ")) {
				loadChild(n12);
			} else if (HoldItem.equals("13.	እግዚአብሔር ሆይ እወድሃለሁ ")) {
				loadChild(n13);
			} else if (HoldItem.equals("14.	 ባርክ ለነ ")) {
				loadChild(n14);
			} else if (HoldItem.equals("15.	ኢይምሰልክሙ (ቁም ዜማ)")) {
				loadChild(n15);
			} else if (HoldItem.equals("16.	በለኒ መሐርኩከ ")) {
				loadChild(n16);
			} else if (HoldItem.equals("17.	ሠርዓ ለነ ")) {
				loadChild(n17);
			} else if (HoldItem.equals("18.	አምላካችን ሆይ ")) {
				loadChild(n18);
			} else if (HoldItem.equals("19.	አኮቴት")) {
				loadChild(n19);
			} else if (HoldItem.equals("20.	ተይ ተመከሪ ")) {
				loadChild(n20);
			} else if (HoldItem.equals("21.	ከወገኔ ጋራ")) {
				loadChild(n21);
			} else if (HoldItem.equals("22.	ሥላሴን አመስግኑ ")) {
				loadChild(n22);
			} else if (HoldItem.equals("23.	አማን በአማን ")) {
				loadChild(n23);
			} else if (HoldItem.equals("24.	ለሰሚዕ ዕፁብ ግብር")) {
				loadChild(n24);
			} else if (HoldItem.equals("25.	ኢየሱስ ክርስቶስ")) {
				loadChild(n25);
			} else if (HoldItem.equals("26.	ለመላው ዓለም")) {
				loadChild(n26);
			} else if (HoldItem.equals("27.	እሳተ ጽርሑ")) {
				loadChild(n27);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T40(this, ParentList,
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
		text.setText("መዝሙር ዘዘወትር");
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

	public class T40 extends BaseExpandableListAdapter {

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

		public T40(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/1.Yitbarek Egziabher.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/2.Eminet Tesfa Fikir.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/3.Demirene.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/4.Dink Newu.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/5.Antimuse.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/6.Medihanealem.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/7.Etseweake Egzieye.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/8.Kidus Egziabher.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/9. Denqe new.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/10.Medhane Alem wehabe selam.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/11.Selam wesenay.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/12.Nakedem Aekototo.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/13.Egziabeher hoy Ewedehalehu.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/14.Barek lene.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/15.Iyemselkimu zema.mp3");
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/16.Beleni meharkuke.mp3");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/17.SerA lene.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/18.Amlakachin hoy.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/19.Akotet.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/21.Kewegene gara.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 22) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/23.Aman Beaman.mp3");
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/24.LesemiE etsub gibre.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();

			} else if (childPosition == 0 && groupPosition == 25) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/26.Lemelaw Alem.mp3");
			} else if (childPosition == 0 && groupPosition == 26) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/27.Esate tserhu.mp3");
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