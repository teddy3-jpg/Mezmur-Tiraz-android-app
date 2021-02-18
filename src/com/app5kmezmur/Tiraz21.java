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

public class Tiraz21 extends Activity {

	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("1. ዕዳ አለብን");
		ParentList.add("2. እመቤታችን");
		ParentList.add("3. ሰላም ላንቺ ይሁን");
		ParentList.add("4. አዛኝቷ እመቤት");
		ParentList.add("5. የጠሩሽ");
		ParentList.add("6. እንዘ ተሐቅፊዮ");
		ParentList.add("7. አንቺ የወይን ሐረግ");
		ParentList.add("8. በእንተ ማርያም");
		ParentList.add("9. ሰላም ለኪ");
		ParentList.add("10. ሰላም ለኪ ለኖኅ ሐመሩ");
		ParentList.add("11. ትርሲተ ወልድ");
		ParentList.add("12. ምስለ ሚካኤል");
		ParentList.add("13. ምንተኑ አአስየኪ ");
		ParentList.add("14. ንዒ");
		ParentList.add("15. ፀምር ፀዓዳ ");
		ParentList.add("16. ወዳጄ ሆይ");
		ParentList.add("17. ምስጋና ለስምሽ");
		ParentList.add("18. ትበርህ ማርያም");
		ParentList.add("19. እናታችን ጽዮን");
		ParentList.add("20. አዳም ወሠናይት");
		ParentList.add("21. ብኪ ድኀነ ዓለም");
		ParentList.add("22. ፍስሓ ወሰላም");
		ParentList.add("23. እዘኝልን");
		ParentList.add("24. ሰአሊ ለነ");
		ParentList.add("25. ንዒኀቤነ");
		ParentList.add("26. ፍቅርኪ መጸሐፍ");
		ParentList.add("27. በአልባሰ ወርቅ");
		ParentList.add("28. ሰአሊ ለነ ቅድስት");
		ParentList.add("29. ሐዋርያት ይብልዋ");

	}
	// Assign children list element using string array.

	String[] n1 = { "የእመቤታችንን አማልጅነቷን \nክብሯን የቀነስን ያዋረድን\nዕዳ አለብን/2/ ከፈጣሪያችን/2/\n	የተሰጣት ሙሉ ሥልጣን\n	ክብርን ያገኘች በቃል ኪዳን\n	ስሟን የጠራ እንደሚድን\n	በመጽሐፍ ሲነገረን\nአዝ...\n	ቤዝዊተ ኩሉ የተባለች\n	በእነ ቅዱስ ኤፍሬም የትመሰገነች\n	በእነ አባ ጊዮርጊስ ውዳሴን ያገኘች\nበመናፍቃን ዘንድ ምነው ተዘነጋች\nአዝ ...\n	ከሴቶች ሁሉ ልዩ ናት እያልን\n	በሁለቱም ወገን በፍፁም ድንግል\n	የብርሃን እናቱ ማርያም ስትባል\n	በደካሞች ዘንድ እንዴት ትቃለል\nአዝ ...\n	ቃና ዘገሊላ ከልጇ ጋር ሳለች\n	ከሠርግ ቤት ገብታ ድንግል አማልዳለች \n	እንኳንስ እመአምላክ ቤዛዊተ ኩሉ \n	ጻድቃን ሰማዕታት በእውነት ያማልዳሉ::\nአዝ ... " },
			n2 = { "እመቤታችን ላንቺ እናቀርባለን ምስጋና\nአንቺ የወለድሺው ክርስቶስ የዓለም መድኃኒት ሆኗልና\nህፃናትም ስላወቁ ደግነትሽን በሙሉ\nወደ አንቺ ሁል ጊዜ ይማልላሉ\nከፈጣሪሽ አማልጂን እያሉ\nወጣቶችም ስላወቁ ደግነትሽን በሙሉ \nወደ አንቺ ሁል ጊዜ ይማልላሉ\nከፈጣሪሽ አማልጂን እያሉ" },
			n3 = { "ሰላም ላንቺ ይሁን /3/ ማርያም ድንግል /2/\nየሴቶች መመኪያ የሴቶች አክሊል /2/\nየሴቶች መመኪያ የሴቶች /2/ የሴቶች አክሊል \nሰላም ላንቺ ይሁን /3/ የሁሉ እመቤት /2/\nየኃጥእን ተስፋ የጻድቃን ሕይወት /2/\nየኃጥእን ተስፋ የጻድቃን /2/ ሕይወት\nሰላም ላንቺ ይሁን /3/ የሁሉ ወዳጅ /2/\nየጽድቅ መሰላል የዓለም አማላጅ /2/\nየጽድቅ መሰላል የዓለም /2/ አማላጅ \nሰላም ለወለድሽው /3/ አምላካችንን /2/\nሰማይና ምድር የማይችሉትን/2/\nሰማይና ምድር የምይችሉት የማይችሉትን \nሰላም እመቤቴ/3/ አምላክን ለወለድሽ /2/\nየሰማይ መላእክትየሚያመሰግኑሽ /2/\nየሰማይ መላእክት /2/ የሚያመሰግኑሽ\nሰላም ለእመቤቴ /3/ አምላክ ለመረጠሽ /2/\nከሴቶቹ ሁሉ ይተባረክሽ ነሽ /2/\nከሴቶቹ ሁሉ  የተባረክሽ /2/ ነሽ  " },
			n4 = { "አዛኝቷ እመቤት አትርሺኝ ˜\nየፈጣሪዬ እናት አስታውሺኝ˜\nበምሕረትሽ/3/ ተማለጂኝ\n	የመከራ ነፋስ አጥቃኝ˜\n	ሕይወቴ ዝላለች ደከመኝ˜\n	ከጥላሽ ሥር /3/ አሳርፊኝ˜\nአዝ...\n	ከጭንቀት ባሕር ውስጥ አድኚኝ˜\n	ፈጥኜ ሳልጠፋ አስጥይኝ˜\n	እመቤቴ /3/ ተመልከቺኝ˜\nአዝ...\n	አምላኬን ለማየት አልችልም\n	ኃጢአቴ ብዙ ነው አይሆንም\n	ካልደገፍሽኝ /3/ እኔ አልድንም \nአዝ... \n	ድንግል እመቤቴ እባክሽ\n	ከፈጣሪ አስታርቂኝ ከልጅሽ\n	ያላንቺ ማን /2/ ያላንቺ ማን አለኝ አስታዋሽ" },
			n5 = { "የጠሩሽ አንቺን ተማጽነው የዳኑብሽ \nየበላዔ  ሰብእ እመቤት የአምላክ እናት\nድንግል አዛኝቱ ማርያም ቅድስት /2/\n	በቃል ኪዳንሽ ብዙዎች ድነዋል \n	በምልጃሽም ጽድቅን አግኝተዋል \n	የአምላክ ቸርነቱን አይተዋል /2/\nአዝ . . .\n	የእሳት ባህርን በአንቺ ተሻግረዋል \n	የሰይጣንን ጾር በአንቺ ድል ነስተዋል\n	ለሰማያዊው ክብር በቅተዋል /2/\nአዝ . . .\n	ነፍሳቸዉም ጽድቅን አግኝታለች\n	ሕይወታቸውም በአንቺ ትድናለች\n	ድንግል ሆይ አትጣይኝ ስላለች  /2/\nአዝ . . .\n	እኔ በአንቺ እታመናለሁ\n	የአምላክ እናት አሳስቢ እላለሁ\n	በአማላጅሽ እድናለሁ /2/\nአዝ . . .\n	እኛ በአንቺ እንታመናለን\n	የአምላክ እናት አሳስኒ እንላለን\n	በአማላጅነትሽ እንድናለን /2/\nአዝ . . .\n	ምእመናንም በአንቺ ያምናሉ \n	የአምላክ እናት አሳስኒ ይላሉ\n	በአማላጅነትሽ ይድናሉ/2/\nአዝ . . ." },
			n6 = { "እንዘ ተሐቅፊዮለሕፃንኪ ድንግል/2/\nምስለ ሚካኤል/4/ ወገብርኤል /2/\n\nትርጉም፦  ድንግል ሆይ ሕፃንሽን ታቅፈሽ ደስ ካለው ከሚካኤል እና ደስታን ከሚያበስር ከገብርኤል ጋር ነይ  \n የሚዘመርበት ቀን 6 (ዘመነ ጽጌ)" },
			n7 = { "አንቺ የወይን ሐረግ ድንግል ልምላሜሽ የበዛ/2/\nምግብ ሆኖ /2/ ተሰጠን ፍሬሽ ለኛ ቤዛ/2/ ኧኸ\n	ባንቺ ሰማይነት የወጣው ፀሐይ/2/\n	ብርሃን ነው /2/ ለጻድቃን ስሙም አዶናይ/2/ ኧኸ\nአዝ...\n	ፊደል ትመስሊያለሽ ድንግል ወንጌል ትወልጃለች/2/\n	ለመላእክት/2/የማይቻል ነበልባሉን የቻልሽi/2/ ኧኸ\nአዝ...\n	የመሶብ ምሳሌ  ድንግል የኮከብ መገኛ/2/\n	በሥጋችን በነፍሳችን እንዳንራብ አንቺ አለሽን ለእኛ/2/ ኧኸ\nአዝ..." },
			n8 = { "በእንተ ማርያም /2/ ወላዲትከ ወበእንተ ዮሐንስ ፍቁርከ/2/\nርድአነ እግዚኦ በኃይለ መስቀልከ /2/		\n\nትርጉም፦  ስለወለደችህ እናትህ ማርያም እና ስለወዳጅህ ዮሐንስ ብለህ አቤቱ በመስቀልህ ኃይል እርዳን" },
			n9 = { "ሰላም ለኪ እንዝ ንሰግድ ንብለኪ \nማርያም እምነ ናስተበቁዓኪ\nእምአርዌ ነዓዊ ተማኅጸነ ብኪ \nበእንተ ሐና እምኪ\nወኢያቄም አቡኪ \nማኅበረነ ዮም ድንግል ባርኪ\n\nሰላም ላአንቺ ይሆን ስግደትም ላንቺ ይሁን \nማርያም እናታችን የመለኮት ዙፋን \nከኃይለኛ አውሬ የምትጠብቂን \nስለቅድስት ሐና ብልሽ  \nስለ ኢያቄም ካህን ማኅበራችንን ባርኪልን" },
			n10 = { "ሰላም ለኪ ለኖኅ ሐመሩ \nሰላም ለኪ ለአሮን በትሩ\nሰላም ለኪ  ለቅዱስ ዳዊት መሰንቆ መዝሙሩ\nሰላም ለኪ ለጌዲዮን ፀምሩ\nሰላም ለኪ ለሰሎሞንም መንበረ ክብሩ\nሰላም ለኪ ለፍሬ ስብሐት መፆሩ/2/\n	እመ እግዚአብሔር ፀባኦት  ሰላም ለኪ\nሰላም ለኪ ሠረገላሁ ለአሚናዳብ \nሰላም ለኪ መና ያለብሽ ንጹህ መሶብ\nሰላም ለኪ ያዕቆብ ያየሽ በሎዛ \nሰላም ለኪ የይስሐቅ መአዛ\n	እንዘ ንሴፈወ ለበረከትኪ ዘምስለ አምኃ ንሰግድ ለኪ\nሰላም ለኪ ኅብስተ መና ዘእስራኤል\nሰላም ለኪ የሰማዕታት ንጹህ አክሊል\nሰላም ለኪ ዕፀ ጳጦስ ዘሲና\nሰላም ለኪ የኤልያስ መና\n	እንዘ ንሴፈወ  ለበረከትኪ ዘምስለ አምኃ ንሰግድ ለኪ" },
			n11 = { "ትርሲተ ወልድ መለኮት ወፍቅር ኀደረ ላዕሌሃ ኀደረ/2/\nይቤላ ርግብየ ወይቤላ ሠናይትየ ማርያም ድንግል/2/\n\nትርጉም፦  የወልድ ሽልማት' መለኮቱ' ፍቅሩም በእርሷ አደረ:: ወልድ መልካሟ ርግቤ ሁይ አላት ድንግል ማርያምን:: (በሰሎሞን አድሮ የተናገረ እርሱ ነውና::)\nየሚዘመርበት ወቅት :ታኅሳስ 3" },
			n12 = { "ምስለ ሚካኤል ወገብርኤል ንዒ ሠናይትየ ማርያም/2/ \nንዒድንግል ንዒ/2/ ድንግል ምስለ ሚካኤል/2/ ኧኸ\n\nትርጉም፦  መልካሚቱ ማርያም ድንግል ከሚካኤልና ከገብርኤል ጋር ነይ" },
			n13 = { "ምንተኑ አአስየኪ  እሴተ\nበእንተ ኩሉ ዘገበርኪ ሊተ /2/\n	የቅዱሳን ተስፋ የትንቢት ምዕራፍ\n	የስደተኞች ስንቅ የምሕረት ደጃፍ\n	የፍጥረት መመኪያ ምክንያተ ድኂን\n	ለእኔም ለመንገዴም ስለሆንሽኝ ብርሃን\nአዝ . . .\n	የዓለም ኑሮ ማርኮኝ ልቤ ሲዋልል \n	በፈተናው ብዛት በሕይወት ስዝል\n	ለሥጋዬ ፍቃድ ከቶ ስላልተውሽኝ ˜\n	ለነፍሴም ሰላምን ስላገኘሽልኝ\nአዝ . . .\n	በኃጢአት መጎስቆሌን ድካሜን ሳታዪ\n	በሐዘን በችግሬ ከኔ ሳትለዪ\n	ከመከራ አዘቅት በአንቺ ስለወጣሁ\n	ለብዙ ውለታሽ ምን እከፍልሻለሁ\nአዝ . . .\n\nየአዝማቹ ትርጉም፦ ስላደረግሽልኝ ምን እከፍልሻለሁ ማለት ነው" },
			n14 = { "ንዒ ርግብየ/4/\nትናዝዘኒ ኃዘነ ልብየ/4/\n\nትርጉም፦  ርግቤ ሆይ (ድንግል ማርያም) የልቤን ሐዘን ታረጋጊልኝ ዘንድ ነይ" },
			n15 = { "ፀምር ፀዓዳ መሶበ ወርቅ  እንተ መና መሶበ ወርቅ/2/\nበትረ አሮን እንተ ሠረጸት/2/ መሶበ ወርቅ/2/\n\nትርጉም፦  ነጭ ጸምር (ባዘቶ) መና ያለባት መሶበ ወርቅ የለመለመች የአሮን በትር ድንግል ማርያም ናት ።" },
			n16 = { "ወዳጄ ሆይ እነሆ ውብ ነሽ \nየታተመች ፈሳሽ እንከን የሌለሽ\nየተዘጋች ፈሳሽ ንጽህት አዳራሽ \n	ሕዝቅኤል ያየሽ የምስራቋ በር\n	ማንም ያልገባባት ከአምላክ በስተቀር\n	የልዑል ማደሪያ አማናዊት መቅደስ\n	ስለንጽህናሽ ምስጋና እናድርስ\nአዝ . . .\n	ሁለቱንም የሆንሽ እናትና ድንግል\n	ማኅደረ መለኮት ወላዲተቃል \n	ያለዘርዐ ብዕሲ በኅቱም  ድንግልና\n	አምላክን የወለድሽ ሐመልማለ ሲና\nአዝ . . .\n	ምስራቀ ምስራቃት ድንግል ሆይ አንቺ ነሽ\n	ጨረቃን የምትመስይ ፀሐይን የወለድሽ\n	የማለዳ ብርሃን ለዓይን የምትሳሺ\n	ጽዮን እናቴ ሆይ ከጎኔ አትሽሺ\nአዝ . . ." },
			n17 = { "ምስጋና ለስምሽ ድንግል እመቤቴ\nበአንቺ አማላጅነት ድኅነት በማግኘቴ\nቅዱሳን አባቶች ቀንም ከሌሊት \nለአንቺ ይቀኛሉ\n	ከሀገር ብህንሳ ፍቅርሽ አድ=ስገድዶት\n	የአንቺ ንጽህና ፍጹም አስደንቆት\n	አባ ሕርያቆስ ተሞልቶ በመንፈስ\n	ድንግል ሆይ አለ አንቺን ለማወደስ\nአዝ . . . \n	ፋራን የተሰኘሽ የዕንባቆም ተራራ\n	በረከት የሞላሽ የገነት አዝመራ\n	ዕፀ ጳጦስ የተባልሽ የሙሴ ጽላት\n	የይስሓቅ መዓዛ የአብርሃም ደግነት\nአዝ . . . \n	እንደእተናገረው ዳዊት በትንቢቱ\n	በቀኝ ትቆማለች አምራ ንግስቲቱ\n	ባለገንዘቦችም አሕዛብ በሙሉ\n	ለክብርሽ ዝቅ ብለው ለክብሽ ይሰግዳሉ\nአዝ . . . \n	ዓለም የዳነብሽ አንቺ የኖኅ መርከብ\n	ምስጋናሽ መብዛቱ እንደ ሰማይ ኮከብ\n	ዘወትር ሁልጊዜ ቢሰላ ቢወራ \n	ድንግል ሆይ አያልቅም የአንቺ ድንቅ ሥራ \nአዝ . . ." },
			n18 = { "ትበርህ ማርያም ፀሐይ ትበርህ/2/\nማርያም ፀሐይ/4/ ትበርህ ማርያም ፀሐይ /2/ ኧኸ\n\n	ትርጉም፦  የብርሃን እናት ፀሐይ ማርያም ከፀሐይ ይልቅ ታበራለች" },
			n19 = { "እናታችን ጽዮን \nመጠጊያ ማረፊያ ጥላችን ነሽና\n	ከገነት ብንወጣ ማረፊያ ሆንሽን \n	የምሕረት ደመና ውኃ ሰጠሽን\n	የሕይወት እንጀራን አመጣሽልን\n	በአስራትም በአደራም ለአንቺ ተሰጠን\nአዝ . . .\n	የኤልሳቤጥ አጽናኝ የጭንቅ ቀን ደራሽ\n	የኃጢአታችን ባት ዳገት ስይሆንብሽ \n	ምስራችን ደስታን ይዘሽልን መጣሽ\n	ማርያም ስንልሽ ደረሽልን ፈጥነሽ \nአዝ . . .\n	ውለታሽ ብዙ ነው ለልብ የማይጠፋ \n	ስምሽ ምጽናኛ ነው አዝኖ ለተከፋ\n	በእንተ ማርያም ብሎ ለለመነ\n	የሰማይ የምድሩም ማንም አልጨከነ\nአዝ . . .\n	በትራችን ነሽ አንቺ የምትደግፊን\n	ባሕረ እሳትን የምታሳልፊን\n	ጽርሓ ሥላሴ ነሽ ማኅደረ መለኮት\n	ሁልጊዜ አንጠግብሽም እንላለን ብጽዕት \nአዝ . . ." },
			n20 = { "አዳም ወሠናይት /4/ \nማርያም/2/ አዳም ወሠናይት/4/ ኧኸ		\n\nትርጉም፦  ማርያም ያማረች መልካም ናጥ በኀልዮ(በኀሳብ) በነቢብ(በመናገር) በግቢር(በመሥራት) ንጽሕት እንደሆነች ሲናገር ነው" },
			n21 = { "ብኪ ድኅነ ዓለም \nወበወልድኪ ኮነ ሰላም/4/ ኧኸ	\n\nትርጉም፦ በአንቺ ዓለም ዳነ በልጅሽም ሰላም ሆነ " },
			n22 = { "ፍስሐ ወሰላም የኀሉ ምስሌነ/2/\nድንግል ማርያም እምነ/4/ ኧኸ \n\nትርጉም፦  ደስታና ሰላም ከእኛ ጋር ይሁን ድንግል ማርያም እናትችን ናትና።" },
			n23 = { "እዘኝልን ድንግል  የአምላክ መንበር\nዓለሙን በማየት ወድቀን እንዳንቀር/2/\nበኃጢአት በበደል ከልጅሽ ለራቅን\nበዝሙት በሀሜት ዛሬም ለወደቅን\nበዲአቢሎስ ተንኮል ለተተበተብን\nበአማላጅነትሽ ዛሬም ተማጸኚን\nከኢየሱስ ክርስቶስ ምሕረትን ለምኚ /2/\nበንስሃ ታጥበን በፍቅሩ ተስበን\nከልግሽ እግር ስር ለመቀምጥ አብቂን/2/\n\n በፈጸምነው በደል ተፀፃች አድርጊን \nመራራ እንባ እናፍስ ልብን መልሽልን/2/\nፈቃደ ሥጋና ፈቃደ ሰይጣን \nዓለም ተደርባ ስታስጨንቀን  /3/\nሰላምን ተጠምተን ስንንከራተት \nድንግል ድረሽልን ያአምላክ እናት /2/\nእባክሽ አትለይን እስከ መጨራሻው \nእየቀረበ ነው የክርስቶስ መምጫው /2/\nድንግል ማርያም ሆይ  እባክሽ አሳስቢ \nለጻድቃን አይደለም ለኃጥአን ብለሽ/2/\n\nብቀኝ እንዲያቆመን በዳግም ምጽአቱ  \nድንግል  ለምኝልን ለአምላክ እናቱ\nድንግል ለምኝልን ለአምላክ ወላዲቱ \nቡሩካን ልጆቼ ብሎ እንዲቀበለን\nፍቅሩን ቸርነቱን አስቦ እንዲምረን  /3/\nድንግል አደራሽን ስለ እኛ አሳስቢልን \nበእርሱ መሰረት ላይ ክርስቶስ ያቁመን /2/" },
			n24 = { "ሰአሊ ለነ ማርያም ሰአሊ ለነ /2/\nወልድኪ ይምሐረነ ወመዋርስቲሁ ይረስየነ መድኃኔዓለም /2/\nለምኝልን  ድንግል ማርያም ለምኝልን  /2/\nልጅሽ ይቅር እንዲለን የመንግስቱም ወራሾች እንዲያደርገን /2/" },
			n25 = { "ንዒኀቤነ ኦ ድንግል\nምስለ ወልድኪ መድኀኒነ \nከመ ትባርኪ ላዕሌነ\n	ነይ ከአምልክሽ ጋር  ከልጅሽ\n	ይቅር እንዲለን በምልጃሽ \n	ንዒድንግል /2/ ከልጅሽ ከአምኑኤል \nአዝ . . .\n	የሐና የኢያቄም መልካም ተክል\n	የሐዋርያት ተክል የሰማዕታት አክሊል\n	ነይ ድንግል /2/  ነይልን ፈጥነሽ ድንግል \nአዝ . . .\nአሕዛብ ነግስታት ይገዙልሻል	\n	የናቁሽም ሁሉ ይሰግዱልሻል\n	የእግዚአብሔር ከተማ /2/ድንግል ሆይ ጽዮን  ይሉሻል\nአዝ . . .\n	ከጥልቅ ማዕበል ሳለን\n	በኃጢአት ወጥመድ ተይዘን\n	ድረሽልን /2/ ከልጅሽ አንቺ አማልጅን \nአዝ . . ." },
			n26 = { "ፍቅርኪ መጽሐፍ /4/ \nለዘያነብቦ/3/ፍቅርኪ መጽሐፍ /2/ ኧኸ		\n\nትርጉም፦ ለሚያነበው ሰው ፍቅርሽ መጽሐፍ ነው" },
			n27 = { "በአልባሰ ወርቅ /2/ ፀዓዳ ርግብ ትመስል  ማርያም ድንግል /2/\nይእቲኬ ማርያም ድንግል እምደመና ቀሊል እሙ ለእግዚእ /2/\n\nትርጉም፦  ድንግል ማርያም ወርቅን ተጎናጽፋ ነጭ ርግብን ትመስላለች። እርሷም ማርያም የጌታ እናቱ ከደመና ይልቅ ፈጣን ናት" },
			n28 = { "ሰአሊ ለነ ቅድስት እንልሻለን /2/\nእንደ ኤፍሬም እንደ አባታችን\nለምኝልን	እመቤታችን /2/\n	ተስፋቸው ነሽና ለፍጥረተ ዓለም\n	እየተመኩብሽ እስከ ዘለዓለም\n	ኃጢአታቸው ተደምስሶላቸው\n	በአንቺ ጸሎት ዳነች ሕይወታቸው\nአዝ . . .\n	ስምሽም ስልጡን ነው በእግዚአብሔር መንበር\n	ቃል ኪዳን ገባልሽ ዓለሙን ሊምር\n	በአንቺ ጸሎት ይተማመናሉ\n	ጠዋት ማታ ቅድስት ሆይ ይላሉ \nአዝ . . .\n	ዓለም ስትዋጋን በምኞት ስለት\n	ነፍሳችን ስትዝል ሲከብዳት ኃጢአት\n	ጨልሞብን ግራ ሲገባን\n	ብርሃናችን ነይ እናታችን\nአዝ . . .\n	የልባችን ኃዘን እጅጉን ከብዶናል\n	ኃጢአታችን በዝቶ መቆም ተስኖናል\n	እንደ ኤልሳቤጥ እንደ ዘመእድሽ\n	ደስ አሰኝን ይሰማ ድምጽሽ\nአዝ . . ." },
			n29 = { "ሐዋርያት ይብልዋ/2/ ለማርያም/2/ \nሰላም ለኪ/4/ ይብልዋ ለማርያም/2/ ኧኸ ኧኸ ኧኸ\n\nትርጉም፦ ሐዋርያት ማርያምን ሰላም ላንቺ ይሁን ይሏታል። ያከብሯታል ያገኗታል ሲል ነው። " };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1. ዕዳ አለብን")) {
				loadChild(n1);
			} else if (HoldItem.equals("2. እመቤታችን")) {
				loadChild(n2);
			} else if (HoldItem.equals("3. ሰላም ላንቺ ይሁን")) {
				loadChild(n3);
			} else if (HoldItem.equals("4. አዛኝቷ እመቤት")) {
				loadChild(n4);
			} else if (HoldItem.equals("5. የጠሩሽ")) {
				loadChild(n5);
			} else if (HoldItem.equals("6. እንዘ ተሐቅፊዮ")) {
				loadChild(n6);
			} else if (HoldItem.equals("7. አንቺ የወይን ሐረግ")) {
				loadChild(n7);
			} else if (HoldItem.equals("8. በእንተ ማርያም")) {
				loadChild(n8);
			} else if (HoldItem.equals("9. ሰላም ለኪ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10. ሰላም ለኪ ለኖኅ ሐመሩ")) {
				loadChild(n10);
			} else if (HoldItem.equals("11. ትርሲተ ወልድ")) {
				loadChild(n11);
			} else if (HoldItem.equals("12. ምስለ ሚካኤል")) {
				loadChild(n12);
			} else if (HoldItem.equals("13. ምንተኑ አአስየኪ ")) {
				loadChild(n13);
			} else if (HoldItem.equals("14. ንዒ")) {
				loadChild(n14);
			} else if (HoldItem.equals("15. ፀምር ፀዓዳ ")) {
				loadChild(n15);
			} else if (HoldItem.equals("16. ወዳጄ ሆይ")) {
				loadChild(n16);
			} else if (HoldItem.equals("17. ምስጋና ለስምሽ")) {
				loadChild(n17);
			} else if (HoldItem.equals("18. ትበርህ ማርያም")) {
				loadChild(n18);
			} else if (HoldItem.equals("19. እናታችን ጽዮን")) {
				loadChild(n19);
			} else if (HoldItem.equals("20. አዳም ወሠናይት")) {
				loadChild(n20);
			} else if (HoldItem.equals("21. ብኪ ድኀነ ዓለም")) {
				loadChild(n21);
			} else if (HoldItem.equals("22. ፍስሓ ወሰላም")) {
				loadChild(n22);
			} else if (HoldItem.equals("23. እዘኝልን")) {
				loadChild(n23);
			} else if (HoldItem.equals("24. ሰአሊ ለነ")) {
				loadChild(n24);
			} else if (HoldItem.equals("25. ንዒኀቤነ")) {
				loadChild(n25);
			} else if (HoldItem.equals("26. ፍቅርኪ መጸሐፍ")) {
				loadChild(n26);
			} else if (HoldItem.equals("27. በአልባሰ ወርቅ")) {
				loadChild(n27);
			} else if (HoldItem.equals("28. ሰአሊ ለነ ቅድስት")) {
				loadChild(n28);
			} else if (HoldItem.equals("29. ሐዋርያት ይብልዋ")) {
				loadChild(n29);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T21(this, ParentList,
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
		text.setText("መዝሙር ዘዘወትር  ለድንግል ማርያም");
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

	public class T21 extends BaseExpandableListAdapter {

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

		public T21(Activity context, List<String> Items,
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
										+ "/mez/Tiraz2/001-Eda Aleben.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/002-Emebetachen.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/003-Selam Lanchi Yihun.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/004-Azagntua Emebet.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/005-Yeterush.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/006-Enze Tehakefiyo.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/007-Anchi Yewoin Hareg.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/009-Selam Leki.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/010-Selam Leki Lenoh Hameru.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/011-Trsite Wold.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/012-Mesle Michael.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/013-Mintenu A'aseki.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/014-NeE Rigbye.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/015-Tsemr Tseada.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/016-Wedaje Hoy.mp3");
							} else if (childPosition == 0
									&& groupPosition == 16) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 17) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/018-Teberih Mariam.mp3");
							} else if (childPosition == 0
									&& groupPosition == 18) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/019-Enatachin Tsion.mp3");
							} else if (childPosition == 0
									&& groupPosition == 19) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/020-Adam Wesenait.mp3");
							} else if (childPosition == 0
									&& groupPosition == 20) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/021-Beki Dehne Alem.mp3");
							} else if (childPosition == 0
									&& groupPosition == 21) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/022-Fessha Weselam.mp3");
							} else if (childPosition == 0
									&& groupPosition == 22) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/023-Ezegnilen.mp3");
							} else if (childPosition == 0
									&& groupPosition == 23) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/024-Seali Lene.mp3");
							} else if (childPosition == 0
									&& groupPosition == 24) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/025-NeE Habeane.mp3");
							} else if (childPosition == 0
									&& groupPosition == 25) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/026-Fikriki Metshaf.mp3");
							} else if (childPosition == 0
									&& groupPosition == 26) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/027-Bealbase Work.mp3");
							} else if (childPosition == 0
									&& groupPosition == 27) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 28) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/029-Hawariyat Yiblewa.mp3");
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