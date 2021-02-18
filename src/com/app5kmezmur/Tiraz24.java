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

public class Tiraz24 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("43.	በስመ ስላሴ ");
		ParentList.add("44.	የስላሴን መንበር");
		ParentList.add("45.	ቅዱስ ቅዱስ ");
		ParentList.add("46.	ስብሐት ለስላሴ");
		ParentList.add("47.	እናመስግነው ");
		ParentList.add("48.	መዓትህን አርቅ");
		ParentList.add("49.	ወመኑ መሐሪ ");
		ParentList.add("50.	ኦ አንትሙ");
		ParentList.add("51.	ሃሌ ሉያ ");
		ParentList.add("52.	ለአምላካችን እንዘምር ");
		ParentList.add("53.	ኩሉ ከንቱ ");
		ParentList.add("54.	እናመስግነው ");
		ParentList.add("55.	ሁላችን እንጸልይ ");
		ParentList.add("56.	ኃይሉን ያለብሰኛል ");
		ParentList.add("57.	የቀደመ በደላችንን");
		ParentList.add("58.	ዘይክል ኩሎ ");
		ParentList.add("59.	ወዘምሩ ለስሙ ");
		ParentList.add("60.	ሁላችን እናቅርብ ");
		ParentList.add("61.	የሕይወት እንጀራ ");
		ParentList.add("62.	ማን እንደ እርሱ ");
		ParentList.add("63.	መንግስቱ ዘለዓለም ");
		ParentList.add("64.	ለአምላክ ተቀኙ ");
		ParentList.add("65.	ከህግ እንዳንወጣ ");
		ParentList.add("66.	ተነሱ እንዘምር");
		ParentList.add("67.	ኖላዊ ትጉህ");
		ParentList.add("68.	አትልፊ በከንቱ ");
		ParentList.add("69.	መንክር እግዚአብሔር");
		ParentList.add("70.	ይትባረክ እግዚአብሔር");
		ParentList.add("71.	እግዚአብሔር ዐቢይ");
		ParentList.add("72.	ወሥኑስ");
		ParentList.add("73.	ዘመንበሩ ዐቢይ");

	}
	// Assign children list element using string array.

	String[] n43 = { "ኃይልየ ሥላሴ ወጸወንየ ሥላሴ/2/\nኧኸ በስመ ሥላሴ /2/ እቀጠቅጥ ከይሴ/2/\n\nትርጉም፦ ሥላሴ ኃይሌና መጠጊያዬ ናቸው። በሥላሴ ስም አባቡን/ዲያቢሎስን/ እቀጠቅጣለሁ። " },
			n44 = { "የስላሴን መንበር ቅዱሳን ከበውት  \nእያሸበሸቡ የሰማይ መላእክት\nድንግልን ከመሀል ሚካኤልን ከፊት  \nአእላፍ መላእክት ሲሰግዱ በፍርሃት\nእዩት ተመልከቱት የሰማዩን ድምቀት /2/\n	የሥላሴን መንበር ቅዱሳን ከበውት   \n	እያሸበሸቡ የሰማይ መላእክት \n	ካህናተ ሰማይ ቅዱስ ቅዱስ ቅዱስ ሲሉ\n	 ይህን ልዩ ክብር ሉያዩ የታደሉ\n	በጽድቅ ሥራቸው ደምቀው  ይታያሉ /2/\nአዝ . . . \n	ይቅዱሳን ሕብረት የቅዱሳን ሀገር\n	ሲያወድስ ይኖራል የሥላሴ ክብር\n	ጽድቅና ርህራሄ የተሞላ ሰማይ\n	እግዚአብሔር ያድለን በትንሳኤ እንድናይ/3/\nአዝ . . . " },
			n45 = { "ቅዱስ ቅዱስ ቅዱስ እግዚአብሔር /2/\nዘበተዋሕዶ/2/ ይሤለስ /2/\n\nትርጉም፦ በአንድነት ሦስትነ በሦስትነት አንድ የሚሆን እግዚአብሔር ምስጉን ጽኑዕ ልዩ ነው።" },
			n46 = { "ስብሐት ለስላሴ ለፈጣሬ ኩሉ ዓለም/2/ \nበመላእክቲሁ ስቡህ ዘለዓለም\nበመላእክቲሁ እኩት ዘለዓለም     /2/\n\nምስጋና ለሥላሴ ለዓለሙ ኩሉ ፈጣሪ /2/\nበመላእክቱ ነውና ሲመሰገን ነዋሪ/4/" },
			n47 = { "እናመስግነው /2/ ጌታችንን እንደ ቅዱስ ዳዊት/2/\nመንፈስቅዱስ ቃኘን /2/ያስተምረን /3/ ኧኸ\nአምላካችን እንደ ቅዱስ ዳዊት /2/\nእናመስግነው/2/ ጌታችንን እንደአባቶቻችን/2/\nኧኸ እናመስግነው/2/ ጌታችንን እንደ ቅዱስ ያሬድ/2/\nመንፈስ ቅዱስ ይቃኘን /2/ ያስተምረን /3/\nአምላካችን እንደአባቶቻችን /2/" },
			n48 = { "መዓትህን አርቅ /2/ ከእኛ\nምሕረትህን አውርድ/3/ ሰማያዊው ዳኛ\nኢየሱስ ክርስቶስ /2/ንጉሠ ራማ\nበጨነቀን ጊዜ በቸገረን ጊዜ በፈተና ጊዜ ጸሎታችንን ስማ\n\nንጉሠ ራማ፦ ሰው ምርምሮ ሊደርስበት በማይችል ልዕልና የምትኖር ልዑል ከፍ ያልህ ንጉሥ ማለት ነው። ራማ ማለት ክፈታ ማለት ነው። " },
			n49 = { "ወመኑ መሐሪ ዘከማከ/2/ \nወኩሉ ይሴፎ ኪያከ/4/ \n\nትርጉም፦  ሁሉም አንተን ተስፋ ያደርጋልና። እንዳንተ ይቅር ባይ ማን ነው\n\nየሚዘመርበት ወቅር፡ በወርኃ ጥቅምት " },
			n50 = { "ኦ አንትሙ ሕዝበ ክርስቲያን \nበከመ ተጋባዕክሙ በዛቲ ዕለት\nከማሁ ያስተጋብዕክሙ በደብረ ጽዮን ቅድስት\nወበኢየሩሳሌም ኢየሩሳሌም አግዓዚት/2/\n\nትርጉም፦ እናንት የክርስቲያን ወገኖች ሆይ በዚህች ዕለት እንደተሰበሰባችሁ ቅድስት በምትሆን በደብረ ጽዮን ነፃ በምትወጣ በኢየሩሳሌም ይሰብስባችሁ። " },
			n51 = { "ሃሌ ሉያ ለእርሱ እንዘምር በእልልታ\nክብር ይገባዋል የሠራዊት ጌታ/4/\nጸናጽል ክበሮ በገናም ይደርደር\nነፃ ላደረገን ከባርነት ቀንበር /4/ለፍቅር ለሰላም ለምሕረት አባት\nይጎሰም ነጋሪት ይነፋ መለከት/4/\nሁሉ በእጁ ሳለ ድሃ ለሆነልን \nየነገሥታት ንጉሥ ጌታችን ይመስገን  /4/\nለገዛልን ርስት በደሙ ለዋጀን\nበመስቀል ተሰቅሎ በሞቱ ላዳነን/4/\nስለኛ ደኅንነት ሐፍረትን ለናቀው\nለአማልእክት አምላክ ምስጋና ይድረሰው /4/\nእኛ ክርስቲያኖች ሁላችንም ዛሬ \nለዓለም መድኃኒት እናቅርብ ዝማሬ/4/\nሃሌ ሉያ በእርሱ እንዘምር በእልልታ \nክብር ይገባዋል የሠራዊት ጌታ/4/\nጸናጽል ክበሮ በገናም ይደርደር\nነፃ ላደረገን ከባርነት ቀንበር /4/" },
			n52 = { "ለአምላካችን እንዘምር ለጌታችን እንዘምር /2/\nብዙ ነው ውለታው የእግዚአብሔር /2/\n	ወደእኛ ለምጣው ከሰማያት ወርዶ \n	በበረት ለተኛው ከድንግል ተወልዶ \n	ለሰው ልጆች ፍቅር ሰው የሆነው ወዶ/2/\nአዝ ....\n	እኛ ለሰደድን ለተሰደደልን \n	ተጠምቆና አጥምቆ አርአያ ለሆነን \n	በበደልነው ሁሉ እርሱ ለካሰልን/2/\nአዝ ....\n	 በመስቀል ተሰቅሎ ፍቅሩን ለገለጸው\n	ዓለምን ለማዳን ደሙን ላፈሰሰው\n	ለቸሩ ክርስቶስ ምስጋና ይድረሰው /2/\nአዝ ....\n	ለሐዘን ለደስታ  ስለደረሰልን\n	ለኑሯችን ሁሉ ስለቀደመልን \n	በበጎ ስጦታው ፍቅሩን ላበዛልን//\nአዝ ....\n	ስለቸርነቱ ብዙ አድርጎልናል  \n	ታዲያ ለዚህ ሁሉ ስለቀደመልን  \n	ሰዎች ዝም አንበል ማመስገን ይገባል /2/\nአዝ ...." },
			n53 = { "ኩሉ ከንቱ ከንቱ ንብረቱ\nእስመ ኩሉ ኃላፊ ውእቱ /2/\nመድኃኔዓለም /2/ አድኅነነ  /2/ እሞተ ከንቱ /2/ \n\nትርጉም፦  ሁሉ ከንቱ ንብረቱ ሁሉ ከንቱ ነው። መድኃኔዓለም ከከንቱ ሞት አድነን።" },
			n54 = { "እናመስግነው /2/\nአምላካችን ውለታው ብዙ ነው/2/\n	ከኃጢአት ቀንበር ከሞት ቤት ለይቶ\n	መንግስቱን ለሰጠን ከሲኦል አውጥቶ\n	ዘለዓለማዊ ቤት ታላቅ ሀብት ያደለኝ \n	መጬም የማይተወኝ ታላቅ አባት አለኝ\nአዝ ....\n	ፍጡራን ቢንቁኝ መጎስቆሌን አይተው\n	ወዳጆች ቢሸሹኝ ወዳጆች ነህ ብለው\n	እውነተኛው ረዳት አምላኬ መች ተወኝ ˜\n	ሁለት እጄን ይዞ ልጄ ተነስ አለኝ ˜\nአዝ ....\n	ሞታችንን ሞቶ ሕይወትን ላደለን \n	ለቸሩ ክርስቶስ ምን እንከፍለዋለን \n	ለታላቅ  ውለታው ጌታ ለዋለልን \n	በእልልታ እንዘምር በአንድነት ሆነን\nአዝ ...." },
			n55 = { "ሁላችን እንጸልይ የሃይማኖት ጸልሎት /2/\nእንድናውቅ ምስጢሩን /2/ የተዋሕዶ እምነት\nየአንድነት ሦስትነት ምስጢሩ ከገባን/2/ \nከቶ ምንም አይኖር /2/የሚያደናግረን\nየአምላክ ሰው መሆን ምስጢረ ሥጋዌ	 /2/\nያስረዳናል በእውነት /2/ የአንድነት ህላዌ \nየአንድነት ምስጢሩ  ይረቃል/2/ \nበሃይማኖት ትምህርት/2/ ጎልቶ  ይታወቃል\n	ሁላችን እንጸልይ ...." },
			n56 = { "ኃይሉን ያለብሰኛል ቅዱሱ ጌታዬ\nየዓይኖቼ ተስፋ ታማኝ ጠባቂዬ\nበሰላም ወጥቼ  በሰላም እገባለሁ\nእግዚአብሔር ሳለልኝ  ምንስ እሆናለሁ/2/\n\nበእርሱ ደስ ይለኛል ፍቅሩን ቀምሻለሁ\nበከራየ ቀን በእርሱ ድኛለሁ\nየዘለዓለም ደስታ በእርሱ ማመኔ ነው\nዓለሙም ንብረቱም ሁሉም አላፊ ነው /2/\n\nዘመን የማይሽረው ቀን የማይለውጠው \nየአብርሃም አምላክ እግዚአብሔር ኃያል ነው\nፍቃዱን ለማድረግ አምላክ ይመራኛል \nሕጉም ለመንገዴ ብርሃን ሆኖልኛል /2/\n\nጎብኝቶኛል አምላክ ድንቅ አድርጎልኛል \nበመስቀል ስቃዩ በደሙ ገዝቶኛል \nበእርሱ ደስ ይበለን እንቅረብ ከቤቱ \nአያልቅም ብዙ ነው የአምላክ በረከቱ/2/\n\nከቤትህ በረከት ስለሰጠኸኝ \nመዳንን በቃልህ ስላደረክልኝ ˜\nላመስኝህ እንጂ ሌላ ምን እላለሁ \nከሜትህ ሳልለይ ቤን እሰጣለሁ እሰጣለሁ /2/" },
			n57 = { "የቀደመ በደላችንን /2/ አታስብብን/2/\nአቤቱ ይቅርታህ ፈጥኖ ይደረግልን \nአቤቱ ይቅርታህ ፈጥኖ ይሁን ይደረግልን/2/" },
			n58 = { "ዘይክል ኩሎ ወአልቦ ዘይሰአኖ ለእግዚአብሔር \nአምላከ ነጋያን ረዳኤ ምንዱባን \nንሕነ ሀቤከ  /2/ተማኅጸነ \n	 የድሆች አለኝታ ተስፋ ላጡ ተስፋ\n	ሁሉንም የሚችል ደራሽ ለተገፋ\n	ለእኛም ድረስልን በኃጢአት ሳንጠፋ\nአዝ . . . /ናዛዜ ኅዙናን/\n	ከገነት ሲባረር አዳም ተሳስቶ\n	ባለቀሰ  ጊዜ ልጅነቱ አጥቶ\n	ትድናለህ ብለህ ያዳንከው በመስቀል\n	ይቅዱሳን አምላክ አቤቱ ቸል አትበል\nአዝ . . . /ወተስፋ ቅቢጻን /\n	ሕዝበ እስራኤልን ፈርኦን ሲገዛቸው  \n	ጭንቅና መከራ እያጸናባቸው \n	በእነ ራሔል ልቅሶ ሙሴን ላከላቸው\nአዝ . . . /ረዳኤ ምንዱባን/\n	እኛም ወገኖችህ ወዳንተ እንጮሃለን\n	 ከጭንቅ ከመከራ እንድትታደገን\n	ጌታ አንተ ነህና ናዛዜ ኅዙናን\nአዝ . . . /ናዛዜ ኅዙናን/\nአዝ . . . /ወተስፋ ቅቡጻን/" },
			n59 = { "ወዘምሩ ለስሙ /2/ሀቡ አኮቴተ ለስብሐቲሁ /2/\nበልዎ ለእግዚአብሔር ግሩም ግብርከ/2/\n\nለስሙ ዘምሩ/2/ምሥጋናን አቅርቡ ለጌትነቱ/2/\nእግዚአብሔርን  /2/ ሥራህ ድንቅ ነው በሉት  /2/" },
			n60 = { "ሁላችን እናቅርብ ለአምላክ ምስጋና \nእሱን ለማመስገን ተፈጥረናልና/2/\nዓለም ላስገኘ በረቂቅ ምሥጢሩ\nለእግዚአብሔር በደስታ ዘምሩ /2/\nበአምላካዊ ጥበብ ሁሉን ለፈጠረው \nክብሩ እንዲታወቅ እንዲታወቅ እንዲመሰገን ነው /2/\nፍጥረታት እንደሥጦታቸው \nያመሰግኑታል  ውለታውን አውቀው/2/ \nየብረከት አምላክ እንዲባርከን\nእንዘምር ሁላችን በመንፈስ ሁነን/2/\nለኃያሉ አምላክ ለሠራዊት ጌታ \nበገናው  ይደርደር ከብሮው ይመታ/2/\nከጥፋት ለዋጀን በከበረእው ደሙ\nየዝማሬን መስዋዕት እናቅርብ  ለስሙ/2/" },
			n61 = { "ኑ የሕይወት እንጀራ እንብላ   የሕይወእንጀራ/2/\nለዘለዓለም በቤቱ እንኖራለን \n	 ድውያነ ሥጋ ጸጋው የራቃችሁ \n	በሥጋም በነፍስም ጽድቅ የተራባችሁ \n	ለመዳኑ ሕይወት አምላክ ሲጠራችሁ \n	በፍርሐት ቅረቡ ወደ ፈጣሪያችሁ \nአዝ ....\n	ሥጋውን ፍሪዳ አድርጎ ሰጥቶናል\n	ደሙን መጠጥ አድርጎ በፍቅር አድሎናል\n	ከዚህ ሰፊ ማዕድ ቅረቡ ይለናል\n	ከቅዱሳን ሕብረት ይቀላቅለናል \nአዝ ....\n	ኑ ወደእኔ ይላል የአለሙ ቤዛ\n	ጊዜያችን አይለፍ በዋዛ ፈዛዛ\n	ሥጋውን ካልበላን ንስሐ ገብተን \n	ደሙንም ካልጠጣን ከኃጢአት ርቀን\n	በመጨረሻው ቀን ዕዳ አለብን\nአዝ ...." },
			n62 = { "ማን እንደ እርሱ እንደ እግዚአብሔር\nቸርነቱ ብዙ በሰማይ በምድር\n	ሞገድና ነፋስ የሚታዘዙለት\n	አብሕርት ቀላያት የሚታዘዙለት \n	ኅቱም መቅብርን ሳይከፍት የተነሣ \n	ነፍሳትን ያዳነ ከሲዖል አበሳ\nአዝ . . .\n	ፈዋሴ ድውያን ቸርነቱ ብዙ \n	የጸጋ ልብሳቸው ጽድቅን ለታረዙ\n	የተዋረዱትን ከፍከፍ የሚያደርግ\n	ለባልቴቷ ዳኛ ፈራጅ ለድሃ አደግ\nአዝ . . .\n	የጠፋውን አዳም ሊፈልግ የመጣ\n	ከባርነት ዓለም ከጽልመት ያወጣ\n	ብርሃን ዘበአማን ጨለማን ያራቀ\n	ሰውን ከራሱ ጋር ሞቶ ያስታረቀ\nአዝ . . .\n	በመከራ ሳሉ ሕዝቦቹን ያሰበ\n	ሥጋውና ደሙን ቆርሶ የመገበ\n	ከባቴ አበሳ ምሕረቱ የበዛ\n	ጌታችን እርሱ ነው የሁላችን ቤዛ\nአዝ . . ." },
			n63 = { "መንግሥቱ ዘለዓለም /2/\nወምኲናኑኒ ለትውልደ ትውልድ/2/\n\nመንግሥቱ ዘለዓለማዊ ነው/2/\nአገዛዙም ለልጅ ልጅ ነው/2/" },
			n64 = { "ዘምሩለት /4/እስኪ ለአምላክ ተቀኙለት /2/\n	ስለክብሩ ቃኙ ሁል ጊዜ አወድሱት \n	ለፈጠረን አምላክ ስቡህ እንበልለት \n	ዓለምን ፈጥሮልን እኛን እንዲደላን  \n	ምን እንከፍለዋለን እንበል ተመስገን\nአዝ ....\n	ምድርን በአበባ ያስጌጠልን ለእኛ\n	ብርሃን እንዳናጣ ፀሐይን ዳግመኛ\n	ውኃ እንዳንጠማ ቀላያትን ፈጥሮ\n	አድሎናልና እንዘምር በአንክሮ\nአዝ ....\n	እስኪ ዘምሩለት እንደመላእክት\n	እንደ አርባዕቱ እንስሳ ቀንና ሌሊት\n	ክብርና ምስጋና ይገባዋል ለእርሱ\n	እንዘምር በእልልታ ገብተን ከመቅደሱ\nአዝ ...." },
			n65 = { "መጽሐፍ ቅዱስን ሁሉም ያነበዋል \nምዕራፍና ቁጥሩን ሁሉም የጠቅሰዋል\nበዚህ ብቻ አይበቃም ተርጓሚ ያሻዋል\n	እንደፈቃዳችን ብንተረጉመው/2/\n	በውጥን የሚያስቀር ስህተቱ ብዙ ነው/2/\n	ከቶ በሰው ፈቃድ ትንቢት እንዳልመጣ\n	ይመክረናል መጽሐፍ ከህግ እንዳንወጣ/2/ \nእንጠይቅ መምህራን ያሉት በደረጃ\nእናንብብ መጽሐፍት ይሁኑን ማስረጃ/2/" },
			n66 = { "ተነሱ እንዘምር /2/ \nበአንድነት ሆነን  በእልልታ/2/ ኧኸ /3/\nምስጋና በሰማይ ምስጋና በምድር /2/\nለኃያሉ ጌታ ለልዑል እግዚአብሔር\n	ስፈሪ ነው ያልነው ብዙ ነገር ነበር\n	ሁሉንም አለፍነው እግዚአብሔር ይመስገን\n	ሕዝቦች ደስ ይበለን ሕይወታችን ድኗል  \n	ሰይጣን ጠላትችን አፍሮ ትመልሷል\nአዝ . . .\n	አምላክሆይ ስምህን ብንጠራው ብንጠራው\n	አልጠገብ አለን ምንኛ ጣፋጭ ነው\n	አብቤት የአንተ ስራ የአንተ ልዕልና\n	ቢነገር አያልቅም ስምህ ነው ገናና\nአዝ . . .\n	ሰማይ ዙፋንህ ነው ምድርም መረገጫህ \n	በዚህም በዚያም ቢሆን በሁሉም አንተ ነህ\n	በሄድንበት ሁሉ ትከተለናለህ \n	ከእንቅፋት ከድንጋይ ትሰውረናለህ\nአዝ . . .\n	ስለመልካም ሥራህ አለብን  ውለታ\n	ለማይነገረው የማዳን ስጦታ\n	ተመስገን እንበል ከጧት እስከማታ\n	ሌላ ምንም የለን የምንከፍልህ ጌታ\nአዝ . . .\n	መልስ እንድናዘጋጅ ቶሎ ሳንጠራ\n	ሳለ አንደበታችን ምስጋናህን እናውራ\n	ምስጋና በሰማይ ምስጋና በምድር\n	እስከዘለዓለም ለስምህ እንዘምር\nአዝ . . ." },
			n67 = { "ኖላዊ ትጉህ /2/\nሐውጸነ/2/ በምሕረት ብዙኅ ኧኸ /4/\n\nትርጉም፦ ቸር ትጉህ ጠባቂ ሆይ በብዙ ምሕረት ቸርነት  ጎብኘን።" },
			n68 = { "አትልፊ በከንቱ አትድከሚ ዓለም /2/\nቆርጫለሁ  እኔ ከጌታ አልለይም/2/\n	እኔ አልገበዝም አልደለልም\n	ልቤ እያወቀ አምላኬንን አልክድም \n	አለምን ለመምሰል እምነት አልለውጥም\n	በከንቱ ማባበል ከመንገዱ አልወጣም\nአዝ ....\n	ሥጋዊ ፍላጎት አያታልለኝም\n	ዓለማዊ እውቀት አያስታብየኝም\n	እነዚህ በአንድነት ይጠፋሉ ሁሉም \n	እግዚአብሔር ጽድቅ ግን ይኖራል ዘለዓለም\nአዝ... \n	ሰውን ለማስደሰት ትዕዛዙን አልጥስም \n	በከንቱ ማባበል ከመንገዱ አልወጣም\n	ለዲያብሎስ እጄን በፍጹም አልሰጥም\n	ጌታ እግዚአብሔርን አላሳዝነውም\nአዝ ....\n	ከቅዱስ እግዚአብሔር እኔ አልለይም\n	በምድርም በሰማይ ያለ እርሱ አልኖርም\n	መመኪያዬ እርሱ ነው ባዝንም ብደሰትም\n	ሕይወቴ ጌታ ነው ያለ እርሱ \nአዝ ...." },
			n69 = { "መንክር እግዚአብሔር በላዕለ ቅዱሳኒሁ/2/\nአምላከ እስራኤል ውእቱ ይሁብ ኃይለ ወጽንዓ ከሕዝቡ\nኧኸ /2/\n\nትርጉም፦ እግዚአብሔር በቅዱሳኑ ላይ ድንቅ ነው።(አድሮባቸው ድንቅ ሥራን ይሠራል) የእስራኤል አምላክ እርሱ ለሕዝቡ  ኃይልን እና ብርታትን ይሰጣል።" },
			n70 = { "ይትባረክ እግዚአብሔር\nለዘወሀበነ /2/ ሰላም ወፍቅር ኧኸ\n\nትርጉም፦ ሰላምና ፍቅር ስለሰጥን እግዚአብሔር ይመስገን" },
			n71 = { "እግዚአብሔር ዐቢይ /2/ ወዐቢይ ኃይሉ\nወአልቦ ኁልቁ /4/ ኁልቁ ለጥበቢሁ \n\nትርጉም፦ እግዚአብሔር ታላቅ ነው። ኃይሉም ታላቅ ጽኑ ነው። ለጥበቡም ስፍር ቁጥር የለውም" },
			n72 = { "ወሥኑስ  ለዘይቤ/2/ ያዕቆብ  /2/\nይእቲ ሥጋ /2/ እምማርያም እንተ ነሥአ መድኅን/2/\n\nትርጉም፦ የያዕቆብ ደም ግባት(ውበት) ያልት መድኅን ዓለም ክርስቶስ ከማርያም የነሣት(የለበሣት ) ሥጋ ናት። ምስጢረ ሥጋዌን ይተረጉማል።  " },
			n73 = { "ዘመንበሩ ዐቢይ መንበሩ  ውእቱ መንበሩ ዘኪሩቤል  /2/\nያቀድም አዕምሮ  /2/ሕሊና ሰብእ /2/\n\nትርጉም፦ ከፍ ባለ ዙፋኑ በኪሩቤል ላይ የሚቀመጥ እርሱ የሰውን ሕሊና (ሃሳብ)አስቀድሞ ያውቃል።" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("43.	በስመ ስላሴ ")) {
				loadChild(n43);
			} else if (HoldItem.equals("44.	የስላሴን መንበር")) {
				loadChild(n44);
			} else if (HoldItem.equals("45.	ቅዱስ ቅዱስ ")) {
				loadChild(n45);
			} else if (HoldItem.equals("46.	ስብሐት ለስላሴ")) {
				loadChild(n46);
			} else if (HoldItem.equals("47.	እናመስግነው ")) {
				loadChild(n47);
			} else if (HoldItem.equals("48.	መዓትህን አርቅ")) {
				loadChild(n48);
			} else if (HoldItem.equals("49.	ወመኑ መሐሪ ")) {
				loadChild(n49);
			} else if (HoldItem.equals("50.	ኦ አንትሙ")) {
				loadChild(n50);
			} else if (HoldItem.equals("51.	ሃሌ ሉያ ")) {
				loadChild(n51);
			} else if (HoldItem.equals("52.	ለአምላካችን እንዘምር ")) {
				loadChild(n52);
			} else if (HoldItem.equals("53.	ኩሉ ከንቱ ")) {
				loadChild(n53);
			} else if (HoldItem.equals("54.	እናመስግነው ")) {
				loadChild(n54);
			} else if (HoldItem.equals("55.	ሁላችን እንጸልይ ")) {
				loadChild(n55);
			} else if (HoldItem.equals("56.	ኃይሉን ያለብሰኛል ")) {
				loadChild(n56);
			} else if (HoldItem.equals("57.	የቀደመ በደላችንን")) {
				loadChild(n57);
			} else if (HoldItem.equals("58.	ዘይክል ኩሎ ")) {
				loadChild(n58);
			} else if (HoldItem.equals("59.	ወዘምሩ ለስሙ ")) {
				loadChild(n59);
			} else if (HoldItem.equals("60.	ሁላችን እናቅርብ ")) {
				loadChild(n60);
			} else if (HoldItem.equals("61.	የሕይወት እንጀራ ")) {
				loadChild(n61);
			} else if (HoldItem.equals("62.	ማን እንደ እርሱ ")) {
				loadChild(n62);
			} else if (HoldItem.equals("63.	መንግስቱ ዘለዓለም ")) {
				loadChild(n63);
			} else if (HoldItem.equals("64.	ለአምላክ ተቀኙ ")) {
				loadChild(n64);
			} else if (HoldItem.equals("65.	ከህግ እንዳንወጣ ")) {
				loadChild(n65);
			} else if (HoldItem.equals("66.	ተነሱ እንዘምር")) {
				loadChild(n66);
			} else if (HoldItem.equals("67.	ኖላዊ ትጉህ")) {
				loadChild(n67);
			} else if (HoldItem.equals("68.	አትልፊ በከንቱ ")) {
				loadChild(n68);
			} else if (HoldItem.equals("69.	መንክር እግዚአብሔር")) {
				loadChild(n69);
			} else if (HoldItem.equals("70.	ይትባረክ እግዚአብሔር")) {
				loadChild(n70);
			} else if (HoldItem.equals("71.	እግዚአብሔር ዐቢይ")) {
				loadChild(n71);
			} else if (HoldItem.equals("72.	ወሥኑስ")) {
				loadChild(n72);
			} else if (HoldItem.equals("73.	ዘመንበሩ ዐቢይ")) {
				loadChild(n73);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T24(this, ParentList,
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

	public class T24 extends BaseExpandableListAdapter {

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

		public T24(Activity context, List<String> Items,
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
										+ "/mez/Tiraz2/043-Beseme Selease.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/044-Yeselasen Menber.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/045-Kidus Kidus.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/046-Sebhat Leselase.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/047-Enamesgenew.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/048-Meatehen Arek.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/049-Wemenu Mehari.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/050-O Antemu.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/051-Hale Luya.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/053-Kulu Kentu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/054-Enamesgenew.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/055-Hulachen Entseley.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/057-Yekedeme Bedelachenen.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/058-Zeyikl Kulu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/059-Wezemiru Lesimu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 17) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 18) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();

							} else if (childPosition == 0
									&& groupPosition == 19) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/062-Man Ende Ersu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 20) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/063-Mengistu Zelealem.mp3");
							} else if (childPosition == 0
									&& groupPosition == 21) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/064-Leamlak Tekegnu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 22) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/065-Kehig Endanweta.mp3");
							} else if (childPosition == 0
									&& groupPosition == 23) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 24) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/067-Nolawi Teguh.mp3");
							} else if (childPosition == 0
									&& groupPosition == 25) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/068-Atelfi Bekentu.mp3");
							} else if (childPosition == 0
									&& groupPosition == 26) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/069-Menkir Egziabhear.mp3");
							} else if (childPosition == 0
									&& groupPosition == 27) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/070-Yitbarek Egziabhear.mp3");
							} else if (childPosition == 0
									&& groupPosition == 28) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/071-Egziabhear Abiy.mp3");
							} else if (childPosition == 0
									&& groupPosition == 29) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 30) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/073-Zemenberu Abiy.mp3");
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