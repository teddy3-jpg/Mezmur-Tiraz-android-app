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

public class Tiraz46 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("72.	ትበርህ እም ኮከበ ጽባህ");
		ParentList.add("73.	አመ ትበርህ ");
		ParentList.add("74.	ወልድኪ ይጼውአኪ");
		ParentList.add("75.	ድንግልን ፍለጋ ");
		ParentList.add("76.	ሕዝበ ኢትዮዽያ");
		ParentList.add("77.	መሐርኒ ድንግል");
		ParentList.add("78.	አክሊሎሙ ለሰማዕት ");
		ParentList.add("79.	እናታችን ጽዮን ");
		ParentList.add("80.	አክሊለ ምክሕነ  ");
		ParentList.add("81.	አንቲ ውእቱ ");
		ParentList.add("82.	ኦ ድንግል ");
		ParentList.add("83.	ተፈታ ችግሬ ");
		ParentList.add("84.	እኅትነ ይብልዋ ");
		ParentList.add("85.	ሐናና ኢያቄም ");
		ParentList.add("86.	ማርያምሰ /ቁም ዜማ/");
		ParentList.add("87.	ሰአሊ ለነ ");
		ParentList.add("88.	የኤልሳቤጥ ሐሴት ");
		ParentList.add("89.	ዮም ኮነ ፍስሐ ");
		ParentList.add("90.	አዘክሪ ድንግል");
		ParentList.add("91.	ለምኚ ድንግል ");
		ParentList.add("92.	አድኝኝ እናቴ");
		ParentList.add("93.	ቀስተ ደመናው ");
		ParentList.add("94.	ክነፈ ርግብ");
		ParentList.add("95.	የዐቢ ክብራ ");
		ParentList.add("96.	ሰላም ላንቺ ይሁን ");

	}
	// Assign children list element using string array.

	String[] n72 = { "ትበርህ እም ኮከበ ጽባህ ወታስተርኢ እምአርዕስተ አድባር ማርያም/፪/\nአዳም ወሰናይት ጽዕዱት ወብርሕት ብርሕት ከመ ፀሐይ /፪/\n\n ትርጉም፡- ማርያም ከንጋት ኮከብ ታበራለች፡፡ ከተራሮች ጫፍ በላይ ከፍ ብላ ትታያለች፡፡ ያማረች የተዋበች የጠራች እንደ ፀሐይም የምታበራ ናት፡፡\n\nየሚዘመርበት ወቅት- ግንቦት 21 በደብረ ምጥማቅ" },
			n73 = { "አመ ትበርህ በደብረ ምጥማቅ ሐምስተ ዕለታተ /፪/\nማርያም ድንግል/፬/ በደብረ በደብረ ምጥማቅ /፪/ ኧኸ/፫/ \n\nትርጉም- በደብረ ምጥማቅ አምስት ቀናት በታየሽ ጊዜ እመቤታችን ሆይ አበራሸ፡፡\n\nየሚዘመርበት ወቅት- ግንቦት 21 በደብረ ምጥማቅ" },
			n74 = { "ወልድኪ ይጼውአኪ /፬/\nውስተ ሕይወት ወመንግሥተ ክብር /፬/ \nልጅሽ ይጠራሻል /፬/\nወደ ሕይወትና ወደ ክብር መንግሥት /፬/\n\nየሚዘመርበት ወቅት: ጥር 21 አስተርእዮ ማርያም እና ነሐሴ 16" },
			n75 = { "እወርዳለሁ ቆላ እወጣለሁ ደጋ /2/\nየጭንቅ አማላጄን ድንግልን/፫/ ፍለጋ /2/  \n\nአቀብ ቁልቁለቱን አይችልም ጉልበቴ /2/\nምርኩዜ ከሌለሽ ድንግል እመቤቴ/2/\nአንቺ የኖኅ መርከብ የሕይወት መገኛ /2/\nመንግሥተ ሰማያት መግቢያችን ነሽ ለእኛ/2/\n   አዝ...\nአልጫውን ዓለም የሚያጣፍጠው /2/\nስምሽ ማርያም ነው/2/ የዓለም ሁሉ ጨው /2/\nእንደ በደላችን እንዳይሆን ቅጣቱ /2/\nአማልጅን ከልጅሽ ድንግል አዛኝቱ/2/\n   አዝ...\nየእናት አማላጅ የልጅ ተማላጅ /2/\nፊት አያስመልስም ይሁን ይሁን እንጂ/፬/" },
			n76 = { "ሕዝበ ኢትዮዽያ እለተወልዱ በሕየ እምነ ጽዮን ይብል ሰብእ /2/\nወብእሲ ተወልደ በውስቴታ ልዑል ሣረራ ውእቱ እግዚአብሔር /2/\n\n   ትርጉም- የኢትዮዽያ ሕዝብ ጽዮን እናታችን ይላል በውስጧ ክርስቶስ ተወለደ የወለደችውም ፈጣሪዋን ነው፡፡\n\nየሚዘመርበት ወቅት: ኅዳር 21 ጽዮን ማርያም " },
			n77 = { "መሐርኒ ድንግል ወተሰሃልኒ በበዘመኑ /፪/\nለእመ መሐርክኒ /፫/ አንቲ ዘይኴንነኒ መኑ \nኰናኔ ሥጋ ወነፍስ /፫/ ወልድኪ አኮኑ      /፪/\n\nትርጉም፡- ድንግል ሆይ ማሪኝ በየዘመኑ ተለመኝን አንቺ ከማርሽኝ የሚፈርድብኝስ ማነው በሥጋና በነፍስ የሚፈርድ ልጅሽ አይደለምን?" },
			n78 = { "አክሊሎሙ ለሰማዕት ሢመቶሙ ለካህናት /፪/\nነያ ጽዮን መድኀኒት/፬/ ኧኸ\nየሰማዕታት አክሊላቸው የካህናት ሹመታቸው /፪/\nጽዮን ናት መድኃኒታቸው /፬/ ኧኸ" },
			n79 = { "እናታችን ጽዮን እንላለን እኛ /፪/\nስለወለድሽልን የሰላሙን ዳኛ\n   አዝ...\nበሔዋን ምክኛት ቤታችን ተዘግቶ\nስንባዝን በሲኦል ሰላማችን ጠፍቶ\nበቃለ ነብያት ተስፋውን አናግሮ\nአብሳሪውን ላከ ውበትሽን አፍቅሮ\n   አዝ...\nመላኩ ሲነግርሽ የሰላሙን ዜና\nንጉሥ መማረኩን በአንቺ ቅድስና\nእንደ ቃልህ ይሁን ብለሽ ስትረቺ\nሰማያዊ ንጉሥ ተዋሐደ በአንቺ\n   አዝ...\nየህብስት ማደሪያ ጸዋሪተ ፍሬ\nእንዳመሰገነሽ ዳዊት በዝማሬ\nኤልሳቤጥ ዘመድሽ ልዕልናሽን አይታ\nብጽዕት አለችሽ አደግድጋ ታጥቃ\n   አዝ...\nበእሳት ባሕር ጥሎን ያየሲኦል ዳኛ\nከሠራዊቱ ጋር ሲዘባበት በእኛ\nመሲሑ ልጅሽ በበረት ተወልዶ\n ከግዞት አወጣን ራሱን አዋርዶ" },
			n80 = { "አክሊለ ምክሕነ ወቀዳሚተ መድኀኒትነ       \nወመሠረተ ንጽሕነ /2/ ኮነ በማርያም ድንግል  /2/ አዝ\n\nየመመኪያችን ዘውድ የአዳም ተስፋ የአምላክ እናቱ\n>>     አማልጅን ከልጅሽ ድንግል ወላዲቱ\n>>     በዓለም ተስበን ፈጽሞ እንዳንጠፋ\n>>   ምልጃሽ አይለየን ድንግል የእኛ ተስፋ\nየመመኪያችን ዘውድ የድኅነታችን መጀመሪያ    \nየንጽሕናችን መሠረት/2/ተገኘልን በማርያም ድንግል  /2/\nየመመኪያችን ዘውድ የሴም ቡራኬው የይሰሐቅ መዓዛ\n>>    ያዕቆብ እንዳየሽ በፍኖተ ሎዛ\n>>     በቃል ኪዳንሽ ለምንማጸንሽ\n>>     የመመኪያችን ዘውድ የድል አርማችን ነሽ\n   አዝ...\nየመመኪያችን ዘውድ የዳዊት መሰንቆ የሰሎሞን አክሊል\n>>    የታተምሽ ጉድጓድ የታጠርሽ ተክል\n>>    ፋራን የምትባይ የእንባቆም ተራራ\n>>    በዓለም እንዳንጠፋ ድንግል ሆይ አደራ\n	አዝ..." },
			n81 = { "አንቲ ውእቱ ንጽሕት እምንጹሐን ዘነበርኪ ውስተ ቤተ መቅደስ ከመ ታቦት /2/\nወመላእክት ያመጽኡ ሲሳየኪ ያመጽኡ /2/\n\nትርጉም፡- እመቤቴ ሆይ ከንጹሐን ሁሉ ንጽሕት ሆነሽ መላእክትም ምግብሽን እያመጡልሽ እንደ ታቦት በቤተ መቅደስ ኖርሽ፡፡" },
			n82 = { "ኦ ድንግል ደስ ይበልሽ\nኦ ቅድስት ደስ ይበልሽ\n     ገብርኤል በቃሉ ደስታን ያሰማሽ\n     ኦ ንጽሕት ደስ ይበልሽ\n          አዝ...\n     የዘለዓለም አምላክ እናት ስለሆንሽ\n     ኦ ንጽሕት ደስ ይበልሽ\n          አዝ...\n     ከፍጡራን ሁሉ በላይ ስለሆንሽ\n     ኦ ንጽሕት ደስ ይበልሽ\n          አዝ...\n     የነገሥታት ንጉሥ ዙፋን ስለሆንሽ\n     ኦ ንጽሕት ደስ ይበልሽ\n         አዝ...\n     የድኅነቴ ዓርማ ልዩ ምልክቴ\n     ለእኔም ነሽ እናቴ እመቤቴ /፪/\n     የድኅነቴ ዓርማ ልዩ ምልክቴ\n     ልዩ ነሽ እናቴ እመቤቴ\n          አዝ...\n     የምታማልጅን ከቸሩ አባታችን\n     ለእኛም እናታችን እመቤታችን /፪/\n     የምታማልጅን ከቸሩ አምላካችን\n     ለእኛም እናታችን አስታራቂያችን\n          አዝ...\n     ስለውድ ሀገርሽ ስለ ኢትዮዽያ\n     ለልጅሽ አሳስቢ ብለሽ ሃሌ ሉያ\n     ድንግል ሆይ አሳስቢ ብለሽ ሃሌ ሉያ\n     ስለውድ ሀገርሽ ስለ ኢትዮዽያ\n     ለልጅሽ አሳስቢ ብለሽ ሃሌ ሉያ\n          አዝ..." },
			n83 = { "   ምን ይሆን ውለታሽ ድንግል የምከፍልሽ /፪/   \n   ላንቺ በመንገሬ ተፈታ ችግሬ /፪/\nየደካሞች ምርኩዝ የኃጥአን ተስፋ /፪/\nፈጥነሽ ትደርሽያለሽ የሰው ልጅ ሲከፋ /፪/\nምን በግዞት ቢሆን ጨለማ ቢወርሰው /፪/\nእንዳዘነ አይቀርም አንቺን የያዘ ሰው /፪/\n   አዝ...\nድንግል ሆይ በምልጃሽ አስቢኝ አሁንም/፪/\nደካማ ነኝና መሳሳቴ አይቀርም /፪/\nቅዱሳን ስምሽን ምግባቸው አድርገው /፪/\nይኖራሉ በአንቺ በሐሴት ጠግበው /፪/\n   አዝ...\nአትርሺኝ እመ አምላክ ቤዛዊተ ኵሉ /፪/\nላንቺ ሰጥቻለሁ ሕይወቴን በሙሉ /፪/\nውዳሴ ማርያምን አልነጥልም ከአፌ /፪/\nበእሱ አይቼዋለሁ ፈተናን ማለፌ /፪/\n   አዝ...\nየዘነጋሽ ሁሉ ሲቸገር ቢጠራሽ /፪/\nአትይውም ችላ አላውቀውም ብለሽ /፪/\n   አዝ..." },
			n84 = { "መላእክት በሰማያት እኅትነ ይብልዋ ሰማዕት ይኤምእዋ/፪/\nጻድቃን ይቄድስዋ በበነግገዶሙ ይዌድስዋ/፪/\nመላእክት በሰማያት እኅታችን ይሏታል ሰማዕታትም እጅ ይነሷታል/፪/\nጻድቃን ያመሰግኗታል በየነገዳቸው ያወድሷታል /፪/" },
			n85 = { "ሐናና ኢያቄም በስለት ያገኙሽ /፪/\nድንግል እናታችን በጣም ደስ ይበልሽ/፪/ /፬/ ኧኸ \nለመዳን ምክንያት ድንግል አንቺ ነሽ /፪/\nንጽሕት ቅድስት እያልን እናመስግንሽ/፪/ /፬/ ኧኸ\nበቤተ መቅደስ ኖርሽ በቅድስና /፪/\nእየተመገብሽ ሰማያዊ መና/፪/ /፬/ ኧኸ\nዕፁብ ነው ድንቅ ነው የአምላካችን ሥራ /፪/	 \nየሰጠን ድንግልን እንዳናይ መከራ/፪/ /፬/ ኧኸ   " },
			n86 = { "ማርያምሰ ተሐቱ ውስተ ከርሱ ለአዳም ከመባሕርይ ጸአዳ\nእስመ በእንቲአሃ ወበእንተ አዝማዲሃ ተሰቀልኩ ይቤ ከመ\nአድኅኖሙ አዳምሃ አቤልሃ አብርሃምሃ ይስሐቅሃ ወያዕቆብሃ\nነቢያት እለ ከማሆሙ ዐቀቡ ሕግየ ከመ በላይሌሆሙ እሰባህ \nእስከ ለአለም አለም፡፡\nማርያምም ታበራለች በአዳም ወገብ ውስጥ እንደ ጸአዳ ባሕርይ\nታበራለች ስለ እሷና ስለዘመዶቿ ተሰቀልኩ አለ አድናቸው ዘንድ\nአዳምን አቤልን አብርሃምን ይስሐቅን ያዕቆብን ሌሎቹንም \nነብያት እንዲሁም ሕጌን የሚጠብቅትን ሁሉ በእነርሱም ላይ\nለዘለዓለም እመሰገን ዘንድ፡፡" },
			n87 = { "ሰአሊ ለነ ኀበ ወልድኪ ሔር መድኃኒነ /፪/\nይምሐረነ ወይሰሐለነ ይምሐረነ ይስረይ ኀጢአተነ /፪/\n\n ትርጉም፡- ድንግል ሆይ ይምረን ዘንድ ኀጢአታችንንም ይቅር ይለን ዘንድ ቸርና አዳኝ ወደ ሆነው ልጅሽ ለምኝልን፡፡" },
			n88 = { "የኤልሳቤጥ ሐሴት የዮሐንስ ደስታ \nየእኛንም ተቀበይ ውዳሴና እልልታ \nእናታችን ማርያም ይድረስሽ ምስጋና \nሰላም ለአንቺ ይሁን የምሕረት ደመና\n\nየሁላችን እናት ተስፋ ድኅነታችን \nወላዲተ አምላክ ድንግል ብርሃናችን \nያጣ ከቶ የለም አንቺኑ ለምኖ \nክብርን ያላገኘ በስምሽ ተማጽኖ /፪/\n    አዝ...\nየያዕቆብ መሰላል የአሮን በትር \nበልባችን ይስረጽ ድንግል ያንቺ ፍቅር \nእንደ ሕርያቆስ እምነት ባይኖረን \nየምስኪኖች አጽናኝ አለሁ በይን /፪/\n    አዝ...\nምሕረት እንድናገኝ ወድቀናል ከፊትሽ \nሸክማችን ይራገፍ በአማላጅነትሽ \nማን ጐድሎበት ያውቃል አንቺኑ ተማጽኖ \nሰላምን ያገኛል በጥላሽ ሥር ሆኖ /፪/ " },
			n89 = { "ዮም ኮነ ፍስሐ በእንተ ልደታ ለማርያም /፪/\nአማን አማን በአማን ተወልደት/፪/ እመ ብርሃን/፪/ \n\n  ትርጉም፡- ዛሬ ደስታ ሆነ እመቤታችን ቅድስት             \n           ድንግል ማርያም ተወልዳለችና፡፡" },
			n90 = { "	አዘክሪ ድንግል አዘክሪ \n	ለልጅሽ አሳስቢ አዘክሪ\n	ለኃጥአን አኮ ለጻድቃን /፪/  \nካንቺ መወለዱን 	አዘክሪ \nበቤተልሔም 	>>\nበጨርቅ መጠቅለሉን 	>>\nመኝታው ግርግም	>>\nለኃጣን አኮ ለጻድቃን	>>\n   አዝ ...\nበዚያ በብርድ ወራት 	አዘክሪ\nየገበሩለትን 	>>\nየአድግና የላህም 	>>\nእስትንፋሣቸውን 	>>\nለኃጥአን አኮ ለጻድቃን	>>\n   አዝ...\nበግብፅ በረሃ 	አዘክሪ\nመሠደድሽን 	>>\nየአሸዋው ግለት 	>>\nርሃቡና ጥሙን 	>>\nለኃጣን እኮ ለጻድቃን	>> \n   አዝ...\nበመስቀሉ ሥር 	አዘክሪ\nባነባሽው እንባ 	>>\nአሳስቢ ድንግል ሆይ 	>>\nገነት እንድንገባ 	>>\nለኃጣን አኮ ለጻድቃን 		>>" },
			n91 = { "ለምኚ ድንግል ለምኚ  /፪/ \nለኃጥአን /፫/አይደለም ለጻድቅን /፪/ \nለምኚ ታላቅ ስጦታዬ \n  >>   አዛኝ ሩኅሩኅ ነሽ\n  >>   የጌታዬ እናት \n  >>   ጸጋን የተሞላሽ \n  >>   የአምላክ ማደሪያ \n  >>   ለምነሽ አስምሪኝ \n  >>   አማናዊት ጽዮን \n  >>   ከእኔ አትለይኝ\nአዝ... \nለምኚ ሐዘንሽ ሐዘኔ \n  >>   ለእኔ ይሁን ድንግል \n  >>   የተንከራተትሺው  \n  >>   በሀገረ እስራኤል\n  >>   ትእግስትሽን ሳየው \n  >>   ልቤ ይመሰጣል \n  >>   የሐዘን እንባ ጎርፍ\n  >>   ዐይኔን ይሞላዋል \nአዝ... \nለምኚ በቀራንዮ አምባ \n  >>   በዚያ በፍቅር ቦታ\n  >>   በእግረ መስቀሉ ስር\n  >>   ከክርስቶስ ጌታ \n  >>   ለእኛ ተሰጥተሻል \n  >>   እናት እንድትሆኝን \n  >>   ልጆችሽ ነንና\n  >>   ምልጃሽ አይለየን\nአዝ... \nለምኚ አንደበቴን ጌታ\n  >>   በምስጋና መላው\n  >>   ደስ ይበልሽ ብዬ \n  >>   እኔም ላመስግናት  \n  >>   አንደበቴን ጌታ \n  >>   በምስጋና  መላው\n  >>   ደስ ይበልሽ ብዬ\n  >>   እኔም ላመስግናት" },
			n92 = { "አድኝኝ እናቴ ከሥጋ ፈተና \nሥጋዬ ከኃጢአት ከቶ አልራቀምና\nሸክሜ የከበደኝ ብቸኛ ሆኛለሁ \nአትለይኝ ድንግል አደራ እልሻለሁ/፪/ \n   አዝ...\nየአማኑኤል እናት የተዋህዶ አክሊሉ \nአትጥፊ ከመሀል እንድትሆኝን ኃይል \nምንም ቢበዛብሽ የእኛ ጉስቁልና  \nከእኛ ጋራ ከሆንሽ አለን ቅድስና፪/ \n   አዝ... \nተስፋዬ ነሽና እመካብሻለሁ \nግራ ቀኝ አልልም ምርኮኛሽ ሆኛለሁ\nስቅበዘዝ አይቶኝ ተስፋ የሰጠኝ \nእግዚአብሔር ይመስገን ካንቺ ያስጠጋኝ/፪/\n   አዝ...\nበሥጋ ደክሜ በነፍሴ እንዳልጠፋ  \nእማጸንሻለሁ ድንግል የእኔ ተስፋ\n የመንግስቱ ወራሽ እንድሆን አድርጊኝ \nመልካም ሥራን መሥራት እኔን አስተምሪኝ /፪/ \n	አዝ...\nአንቺ የሌለሽበት ጉባኤው ባዶ ነው  \nበቁም የደረቀ ሕይወት የተለየው  \nበመካከል ገብተሽ ሙዪ የጎደለውን\nሠርጉ ተደግሷል ጎብኝልን ጓዳውን/፪/" },
			n93 = { "የኖኅ ቃል ኪዳኑ ምልክት ዓርማው \nየመዳኑ ምሥጢር የሰላም ተስፋው \nእመቤቴ አንቺ ነሽ ቀስተደመናው/ /፪/\n\nአንቺ የአሮን በትር ሳይተክሏት ያደገች\nየማክሰኞ እርሻ ያለዘር ያፈራች  \nየሲና ሐመልማል የተዋህዶ ምሥጢር \nክብርት እመቤቴ ሀገረ እግዚአብሔር/፪/  \n   አዝ . . . \nየዳዊት መሰንቆ የያሬድ ጽናጽል\nየደካሞች ምርኩዝ የሰሎሞን አክሊል \nሰላሜ ተስፋዬ የሐዘኔ ደራሽ\nየጽዮን ተራራ መሸሸጊያዬ ነሽ/፪/ \n   አዝ . . . \nየኤልሳዕ ማሰሮ ጨው የተገኘብሽ  \nየሕዝቅኤል ራዕይ ንጽሕት አዳራሽ \nአንቺ የአዳም ተስፋ የመዳኑ ብሥራት \nአንቀጸ ብርሃን ነሽ የአማኑኤል እናት/፪/\n   አዝ . . ." },
			n94 = { "ክነፈ ርግብ በብሩር ዘግቡር ወገበዋቲሃኒ በሐመልማለ ወርቅ /፪/\nአንቲ ምስራቅ ወወልድኪ ፀሐየ ጽድቅ አማን በአማን /፫/     \nኢየኀልቅ ኪዳንኪ ወላዲተ አምላክ /፪/\nእንደ ርግብ ክንፍ በብርም እንደ ተሰራች ጎኖችሽም የወርቅ ሐመልማል /፪/\nአንቺ ምስራቅ ነሽ ልጅሽም የጽድቅ ፀሐይ ነው እውነት በእውነት/፫/     \nአያልቅም ቃል ኪዳንሽ የአምላክ እናት /፪/" },
			n95 = { "የዐቢ ክብራ ለማርያም እምኵሎሙ ቅዱሳን/፪/   /፪/\nእስመ ድልወ ኮነት ለተወክፎ ቃለ አብ /፪/\nዘይፈርህዎ መላእክት ወየአኵትዎ ትጉሃን በሰማያት   \nማርያም ድንግል ጾረቶ በከርሳ                        /፪/\n\nትርጉም፡- የድንግል ማርያም ክብር ከቅዱሳን ክብር ይበልጣል የአብን ቃል ለመቀበል በተገባ ተገኝታለችና የሚፈሩትን ትጉሆች በሰማያት የሚያመሰግኑትን ድንግል ማርያም በማኅፀኗ ተሸከመችው፡፡" },
			n96 = { "	ሰላም ለአንቺ ይሁን ቅድስት እናትችን\n	የአዳም ልጆች ተስፋ የሰማይ ቤታችን  /፪/\n\nነቢዩ ሕዝቅኤል የተነበየልሽ\nከአዳም ዘር መካከል አምላክ የመረጠሽ\nየሥላሴ ዙፋን የተዘረጋብሽ\nንጽሕት አዳራሽ ተስፋችን አንቺው ነሽ\n   አዝ...\nለሐና ለኢያቄም አንቺን ቢሰጣቸው\nሁሉን ቻይ የሆነው ቸሩ አምላካቸው\nወስደው አስረከቡሽ ከቤተ መቅደስ\nማደሪያ ልትሆኚ ለመንፈስ ቅዱስ\n   አዝ...\nየሐና ፍሬዋ የኢያቄም ዘር\nባንቺ ተከፈተ የተዘጋው በር\nባንቺ ቅድስና ጸጋን አግኝተናል\nበተሰጠሸ ኪዳን ሕይወትን ወርሰናል\n   አዝ....\nበኅሊና አምላክ ቀድሞ የነበርሽ\nለተከዘው አዳም መፅናኛው የሆንሽ\nርግማን ደርሶባት ሔዋን ስታነባ\nየብርሃን ጸዳል ሆንሽላት አበባ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("72.	ትበርህ እም ኮከበ ጽባህ")) {
				loadChild(n72);
			} else if (HoldItem.equals("73.	አመ ትበርህ ")) {
				loadChild(n73);
			} else if (HoldItem.equals("74.	ወልድኪ ይጼውአኪ")) {
				loadChild(n74);
			} else if (HoldItem.equals("75.	ድንግልን ፍለጋ ")) {
				loadChild(n75);
			} else if (HoldItem.equals("76.	ሕዝበ ኢትዮዽያ")) {
				loadChild(n76);
			} else if (HoldItem.equals("77.	መሐርኒ ድንግል")) {
				loadChild(n77);
			} else if (HoldItem.equals("78.	አክሊሎሙ ለሰማዕት ")) {
				loadChild(n78);
			} else if (HoldItem.equals("79.	እናታችን ጽዮን ")) {
				loadChild(n79);
			} else if (HoldItem.equals("80.	አክሊለ ምክሕነ  ")) {
				loadChild(n80);
			} else if (HoldItem.equals("81.	አንቲ ውእቱ ")) {
				loadChild(n81);
			} else if (HoldItem.equals("82.	ኦ ድንግል ")) {
				loadChild(n82);
			} else if (HoldItem.equals("83.	ተፈታ ችግሬ ")) {
				loadChild(n83);
			} else if (HoldItem.equals("84.	እኅትነ ይብልዋ ")) {
				loadChild(n84);
			} else if (HoldItem.equals("85.	ሐናና ኢያቄም ")) {
				loadChild(n85);
			} else if (HoldItem.equals("86.	ማርያምሰ /ቁም ዜማ/")) {
				loadChild(n86);
			} else if (HoldItem.equals("87.	ሰአሊ ለነ ")) {
				loadChild(n87);
			} else if (HoldItem.equals("88.	የኤልሳቤጥ ሐሴት ")) {
				loadChild(n88);
			} else if (HoldItem.equals("89.	ዮም ኮነ ፍስሐ ")) {
				loadChild(n89);
			} else if (HoldItem.equals("90.	አዘክሪ ድንግል")) {
				loadChild(n90);
			} else if (HoldItem.equals("91.	ለምኚ ድንግል ")) {
				loadChild(n91);
			} else if (HoldItem.equals("92.	አድኝኝ እናቴ")) {
				loadChild(n92);
			} else if (HoldItem.equals("93.	ቀስተ ደመናው ")) {
				loadChild(n93);
			} else if (HoldItem.equals("94.	ክነፈ ርግብ")) {
				loadChild(n94);
			} else if (HoldItem.equals("95.	የዐቢ ክብራ ")) {
				loadChild(n95);
			} else if (HoldItem.equals("96.	ሰላም ላንቺ ይሁን ")) {
				loadChild(n96);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T46(this, ParentList,
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
		text.setText("መዝሙር ዘዘወትር ለድንግል ማርያም");
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

	public class T46 extends BaseExpandableListAdapter {

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

		public T46(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/72.Tiberihi.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/73.AmeTiberihi.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/74.Weldiki Yitseweaki.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/75.Dengilin Filega.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/76.Hizbe Ethiopia.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/77.MEHARENE DENGEL.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/78.Aklilomu.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/79.Enatachin Tsiyon.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/80.Aklile mikihne.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/81.Anti Weetu.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/82.o dingil des yibelish.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/84.EHETENE YEBELEWA.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/85.Hanana Eyakm.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/86.Mareyamese tehatu.mp3");
			} else if (childPosition == 0 && groupPosition == 15) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/87.Sealilene Habe Weldiki.wma");
			} else if (childPosition == 0 && groupPosition == 16) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/88.Ye Elsabet haset.mp3");
			} else if (childPosition == 0 && groupPosition == 17) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/89.Yom fiseha kone.mp3");
			} else if (childPosition == 0 && groupPosition == 18) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/90.Azekiri Dingle.mp3");
			} else if (childPosition == 0 && groupPosition == 19) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/91.Lemigni dingil.mp3");
			} else if (childPosition == 0 && groupPosition == 20) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/92.Adignign Enate.mp3");
			} else if (childPosition == 0 && groupPosition == 21) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/93.Keste Demenawe.mp3");
			} else if (childPosition == 0 && groupPosition == 22) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/94.Kinefe Rigeb.mp3");
			} else if (childPosition == 0 && groupPosition == 23) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/95.Yeabi kibra.mp3");
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
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