package com.app5kmezmur;

import com.app5kmezmur.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.R.color;
import android.R.drawable;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
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
import android.widget.SeekBar;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ListView;

public class Yemesqel2 extends Activity {
	Button button4, button5;
	View lay;
	CheckBox ch;
	MediaPlayer mp = new MediaPlayer();
	Integer id[];
	List<String> ChildList;
	int lastexpandedpos = -1;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{

		ParentList.add("40. ኑ እናመስግን");
		ParentList.add("41. ንዒ ኀቤነ");
		ParentList.add("42. ዘይክል ኩሎ");
		ParentList.add("43. ኢትዮጵያ ታበጽሕ እደዊሃ ");
		ParentList.add("44. መሐርኒ ድንግል");
		ParentList.add("45. ትርሲተ ወልድ");
		ParentList.add("46. ክነፈ ርግብ");
		ParentList.add("47. መልአከ ሰላምነ");
		ParentList.add("48. ያሬድ ሐዋርያ");
		ParentList.add("49. እምልማደ ሳህልከእምልማደ ሳህልከ");
		ParentList.add("50. ሰላም ዘአብ");
		ParentList.add("51. አይ ይእቲ");
		ParentList.add("52. ኦ ፍጡነ ረድኤት");
		ParentList.add("53. ገድልከ ግሩም");
		ParentList.add("54. እልፍ አእላፋት");
		ParentList.add("55. ከክርቶስ ፍቅር");
		ParentList.add("56. ትምክሕተ ዘመድነ");
		ParentList.add("57. አክሊሎሙ ለሰማዕት");
		ParentList.add("58. አሰርገዋ");
		ParentList.add("59. አንስዕ ኃይለከ");
		ParentList.add("60. ድንቅ ነው");
		ParentList.add("61. እናመስግነው");
		ParentList.add("62. ብኪ ድኅነ ዓለም");
		ParentList.add("63. ዮሐንስ ክቡር ነብየ ልዑል");
		ParentList.add("64. ኩሉ ይሰግድ");
		ParentList.add("65. ቤተ ክርስትያን ባሕረ ጥበባት");
		ParentList.add("66. ሰላምህን ስጣት");
		ParentList.add("67. ፀምር ፀዓዳ");
		ParentList.add("68. ዘማየ ገብረ");
		ParentList.add("69. አንዲት_ናት_ቤተ_ክርስቲያን");

	}

	String[] n40 = { "እናመስግነው /2/ ጌታችንን እንደ ቅዱስ ዳዊት/2/\nመንፈስቅዱስ ቃኘን /2/ያስተምረን /3/ ኧኸ\nአምላካችን እንደ ቅዱስ ዳዊት /2/\nእናመስግነው/2/ ጌታችንን እንደአባቶቻችን/2/\nኧኸ እናመስግነው/2/ ጌታችንን እንደ ቅዱስ ያሬድ/2/\nመንፈስ ቅዱስ ይቃኘን /2/ ያስተምረን /3/\nአምላካችን እንደአባቶቻችን /2/" },
			n41 = { "ንዒኀቤነ ኦ ድንግል\nምስለ ወልድኪ መድኀኒነ \nከመ ትባርኪ ላዕሌነ\n	ነይ ከአምልክሽ ጋር  ከልጅሽ\n	ይቅር እንዲለን በምልጃሽ \n	ንዒድንግል /2/ ከልጅሽ ከአምኑኤል \nአዝ . . .\n	የሐና የኢያቄም መልካም ተክል\n	የሐዋርያት ተክል የሰማዕታት አክሊል\n	ነይ ድንግል /2/  ነይልን ፈጥነሽ ድንግል \nአዝ . . .\nአሕዛብ ነግስታት ይገዙልሻል	\n	የናቁሽም ሁሉ ይሰግዱልሻል\n	የእግዚአብሔር ከተማ /2/ድንግል ሆይ ጽዮን  ይሉሻል\nአዝ . . .\n	ከጥልቅ ማዕበል ሳለን\n	በኃጢአት ወጥመድ ተይዘን\n	ድረሽልን /2/ ከልጅሽ አንቺ አማልጅን \nአዝ . . ." },
			n42 = { "ዘይክል ኩሎ ወአልቦ ዘይሰአኖ ለእግዚአብሔር \nአምላከ ነጋያን ረዳኤ ምንዱባን \nንሕነ ሀቤከ  /2/ተማኅጸነ \n	 የድሆች አለኝታ ተስፋ ላጡ ተስፋ\n	ሁሉንም የሚችል ደራሽ ለተገፋ\n	ለእኛም ድረስልን በኃጢአት ሳንጠፋ\nአዝ . . . /ናዛዜ ኅዙናን/\n	ከገነት ሲባረር አዳም ተሳስቶ\n	ባለቀሰ  ጊዜ ልጅነቱ አጥቶ\n	ትድናለህ ብለህ ያዳንከው በመስቀል\n	ይቅዱሳን አምላክ አቤቱ ቸል አትበል\nአዝ . . . /ወተስፋ ቅቢጻን /\n	ሕዝበ እስራኤልን ፈርኦን ሲገዛቸው  \n	ጭንቅና መከራ እያጸናባቸው \n	በእነ ራሔል ልቅሶ ሙሴን ላከላቸው\nአዝ . . . /ረዳኤ ምንዱባን/\n	እኛም ወገኖችህ ወዳንተ እንጮሃለን\n	 ከጭንቅ ከመከራ እንድትታደገን\n	ጌታ አንተ ነህና ናዛዜ ኅዙናን\nአዝ . . . /ናዛዜ ኅዙናን/\nአዝ . . . /ወተስፋ ቅቡጻን/" },
			n43 = { "ኢትዮጵያ ታበጽሕ እደዊሃ ኀበ እግዚአብሔር/2/\nእንዘትብል አምላኪየ_/2/ነጽረኒ ወአድኅነኒ እምኃይለ ጸላኢ ወፀር \n\nበ ምህረት አይን ተመልከተን ከጠላት ኃይል አድነን እያለች ኢትዮጵያ እጆቿን ወደ እግዚአብሔር ትዘረጋለች።  " },
			n44 = { "መሐርኒ ድንግል ወተሰሃልኒ በበዘመኑ/፪/\nለእመ መሐርክኒ/፫/ አንቲ ዘይኴንነኒ መኑ \nኰናኔ ሥጋ ወነፍስ/፫/ ወልድኪ አኮኑ      /፪/\n\nትርጉም፡( ድንግል ሆይ ማሪኝ በየዘመኑ ተለመኝን አንቺ ከማርሽኝ የሚፈርድብኝስ ማነው በሥጋና በነፍስ የሚፈርድ ልጅሽ አይደለምን?" },
			n45 = { "ትርሲተ ወልድ መለኮት ወፍቅር ኃደረ ላዕሌሃ ኃደረ/፪/\nይቤላ ርግብየ ወይቤላ ሠናይትየ ማርያም ድንግል/፪/\n\nTRg#MÝ( ጠቢቡ ሰሎሞን ያማረች ርግብዬ ያላት እመቤታችን ድንግል ማርያም መለኮታዊ የሆነውና ይህንን ዓለም በፍቅሩ የወደደው በእርሷ ላይም ያደረው የወልድ ሽልማት ናት፡፡" },
			n46 = { "ክነፈ ርግብ በብሩር ዘግቡር  ወገበዋቲሃኒ ሐመልማለ ወርቅ   /፪/\nአንቲ ምስራቅ ወወልድኪ ፀሐየ ጽድቅ አማን በአማን/፫/ ኢየኀልቅ ኪዳንኪ ወላዲተ አምላክ /፪/\n\nእንደ ርግብ ክንፍ በብርም እንደ ተሰራች\nጎኖችሽም የወርቅ ሐመልማል                 /፪/\nአንቺ ምስራቅ ነሽ ልጅሽም የጽድቅ \nፀሐይ ነው እውነት በእውነት/፫/\nአያልቅም ቃል ኪዳንሽ የአምላክ እናት  /፪/" },
			n47 = { "መልአከ ሰላምነ ሊቀ መላእክት ዑራኤል /2/\nሰአል ወጸልይ በእንቲአነ አዕርግ ጸሎተነ ቅድመ መንበሩ ለመድኃኔዓለም \n\nትርጉም፦ የሰላም መልአክ ቅዱስ ዑራኤል ስለ እኛ ለምንልን ጸሎታችንንም በመድኃኔዓለም ፊት አሳርግልን  " },
			n48 = { "ያሬድ ሐዋርያ/፮/\nዘአብርሃ ለኢትዮዽያ/፬/\n\nትርጉም- ያሬድ ሐዋርያ ለኢትዮዽያ አበራ\nእንድታድለኝ ጸጋ ነፍስ/፬/ ኧኸ" },
			n49 = { "እምልማደ ሣህልከ ለነ ግበር\nሣህል ገብርኤል ነደ ወነበልባለ  /፪/\nከመ ለአናንያ ወአዛርያ ወሚሳኤል ዘአቁረርከ ነደ/፪/\n\nትርጉም ለአናንያ ለአዛርያ እና ሚሳኤል ነበልባሉን ያበረድክ ቅዱስ ገብርኤል ሆይ የተለመደ ምሕረትህን ለእኛም አድርግልን፡፡" },
			n50 = { "ሃሌ ሉያ/2/ ሰላም ዘአብ ወፍቅር ዘወልድ ሃይማኖት ዘመንፈስ ቅዱስ/2/ \nይኅድር ምዕከሌክም አምላከ ሰላም \nሰላም /2/ የሀሉ ምስሌክሙ \n\nሃሌ ሉያ/2/ የአብ ሰላም የወልድድ ፍቅር ሃይማኖት የመንፈስ ቅዱስ /2/ \nይደር በመካከላችሁ የሰላሙ አምላክ \nሰላም/2/ ከእናንተ ጋር ይሁን" },
			n51 = { "አይ ይእቲ ዛቲ እንተ ታስተርኢ  \nእምርኁቅ ከመ ማሕቶት ደብረ ገነት /2/\nሙሴኒ ርእያ ሀገር ቅድስት\nዕዝራ ተናገራ  /3/ዘመራ ዳዊት /2/\n\nትርጉም፦ያቺ እንደመብራት ከሩቅ የምትታይ የገነት ተራራ ሙሴ ያያት ዕዝራም ትንቢት ይተነገረላት ዳዊትም የዘመረላት እንዴት ያለች ድንቅ ናት። " },
			n52 = { "ኦ ፍጡነ ረድኤት /2/ \nየእግዚአብሔር አገልጋይ ቅዱስ ሰማዕት\n	ሰላም ላንተ ይሁን -  ፍጡነ ረድኤት  \n	የልዳው ፀሐይ -  ፍጡነ ረድኤት\n	በጨካኝ ንጉሥ ፊት ቆምክ አደባባይ\n	ታማኝ አገልጋይ ነህ -  ፍጡነ ረድኤት \n	ስቃይ ያልበገረህ -  ፍጡነ ረድኤት\n	አክሊልን አገኘህ መከራን ታግሰህ\nአዝ . . .\n	ለእምነቱ ተጋዳይ -  ፍጡነ ረድኤት\n	ታማኝ  ወታደር -  ፍጡነ ረድኤት\n	ቢነገር አያልቅም ይተሰጠህ ክብር\n	ስቃይ ሲያደርሱብህ -  ፍጡነ ረድኤት\n	በመታገስህ -  ፍጡነ ረድኤት\n	 ሲወራ ይኖራል ዘለዓለም ስምህ \nአዝ . . .\n	የፈጣሪውን ስም -  ፍጡነ ረድኤት\n	ስለመሰከረ -  ፍጡነ ረድኤት\n	ጊዮርጊስ ሰማዕት በሰይፍ ተመተረ\n	የስቃይ መሳሪያ -  ፍጡነ ረድኤት\n	ያላዘናጋህ -  ፍጡነ ረድኤት\n	መንፈሳዊ አርበኛ ጊዮርጊስ አንተ ነህ\nአዝ . . .\n	ለሰማው ይደንቅል -  ፍጡነ ረድኤት\n	የአንተ ሰማዕትነት -  ፍጡነ ረድኤት\n	ምሳሌ ይሆናል ለሁሉም ፍጥረት \n	ገድልህ ይነገራል -  ፍጡነ ረድኤት\n	ክብር እንደተሰጠህ -  ፍጡነ ረድኤት\n	ጊዜ የማይሽረው ምግባር ሃይማኖት\nአዝ . . ." },
			n53 = { "ገድልከ ግሩም ነገርከ ጥዑም/፪/\nጊዮርጊስ ኃያል እንቍ ስም ቅረበነ/፫/ በሠላም/፪/\n\nትርጉም፡ ገድልህ ግሩም አስደናቂ ኃያሉ ጊዮርጊስ ስምህ እንቁ የከበረ ነው፡፡ በሰላም ቅረበን፡፡" },
			n54 = { "እልፍ አእላፋት ወትእልፈት ቅዱሳን ንጹሃን መላዕክት  ቆሙ ለአገልግሎት ጸንተው በአንድነት  ቅዱስ /3/ አምላክ በማለት /2/ \nኢዮር ራማ ኤረር የመላዕክት ሀገር \nየሐይማኖት የፍቅር የምልክት ክር \n እውነት የታየብሽ የመላዕክ ክብር  \nአዝ..........\nእንጽና ሲል ገብርኤል በአለንበት ቦታ  \n	በሳጥናኤል ነገድ ነበረ ሁካታ \nግማሹ እየካደ ቀሪው ሲያመነታ \nአዝ..........\nየሳጥናኤል ምኞት እንደ አበባ ረግፎ \nሚካኤል ተሾመ በዕምነት ተደግፎ \nሳጥናኤል ወደቀ ጸጋውን ተገፎ \nአዝ..........\nቅዱሳን መላዕክት በዕምነት የጸናችሁ  በታላቅ አክብሮት ሰላም እንበላችሁ  ስግደት ወበጸጋ እንስገድላችሁ \nአዝ.........." },
			n55 = { "ከክርስቶስ ፍቅር የሚለይኝ ማነው /2/\nመከራ ችግር ስቃይ ወይስ መራቆት ነው /2/ \nአንፈራም አንሰጋም አንጠራጠርም /2/ \nእግዚአብሔር ከእኛ ጋር ይኖራል ለዘለዓለም /2/\nበትጋት ተራምደን እንግባ በጠዋት /2/ \nበደሙ መስርቶ ለሠራልን ቤት /2/\nከቶ የት ይገኛል እንዲህ ያለ ቤት /2/ \nየውሃ ግድግዳ የደም መሰረት/2/ \nየውሃ ግድግዳ የደም መሰረት/2/\nይኸው እዚህ አለ የአማኑኤል ቤት/2/ " },
			n56 = { "ትምክሕተ ዘመድነ/፪/ ማርያም እምነ/፪/   \nማርያም ትምክሕተ ዘመድነ .... አዝ\n\n	የድኅነታችን አርማ የነፃነታችን\n	የሕይወት መሠረት ነሽ ድንግል እናታችን\n	አንቺን ለእኛ ዘርን ባያስቀር\n	እንደ ጥንቱ እንደ ሰዶም ምድር\n	ሁላችንም በጠፋን ነበር\nየአብርሃም ድንኳን ነሽ አምላክ ያደረብሽ\nየጌዴዎንም ፀምር ለይቶ ያከበረሽ\nየእኛ ቤዛ በጉ የተያዘብሽ\nየዋኅ ርግብ ከአበው ሥር የተገኘሽ\nዕፀ ሳቤቅ የሕይወት ሐረግ ነሽ\n	አምላክ ከሰማይ ሆኖ ይህችን ዓለም ሲቃኝ\n	ንጽሕት ቅድስት ሆነሽ ማርያም አንቺን ቢያገኝ\n	ትሕትናሽን ሕይወትሽንም ወዶ\n	ቃል ሰው ሆነ ከሰማያት ወርዶ\n	አከበረሽ በፍጹም ተዋሕዶ\nየመዳናችን ምክንያት የሰው ልጆች ሰላም\nከኃጢአት ከመርገም የዳነብሽ ዓለም\nአምስት ሺህ አምስት መቶ ዘመን\nበሲኦል ውስጥ ተግዘን የኖርን\nድንግል በአንቺ ነፃነት አገኘን" },
			n57 = { "አክሊሎሙ ለሰማዕት ሢመቶሙ ለካህናት /፪/\nነያ ጽዮን መድኀኒት/፬/ ኧኸ\nየሰማዕታት አክሊላቸው የካህናት ሹመታቸው /፪/\nጽዮን ናት መድኃኒታቸው /፬/ ኧኸ" },
			n58 = { "አሰርገዋ ለኢትዮጵያ በስብሐት ወበ ሃሌ ሉያ/፪/ \nያሬድ ካህን ጥዑመ ልሳን ለቤተክርስቲያን ፀሐያ/፪/\n\nአሸበረቃት ኢትዮጵያን በምስጋና ወበ ሃሌ ሉያ/፪/ \nካህኑ ያሬድ ልሳኑ ጣፋጭ ለቤተ ክርስቲያን ብርሃኗ/፪/ " },
			n59 = { "አንስዕ ኃይለከ ወንአ አድኅነነ  /2/\nሚካኤል  ርድአነ /2/ \nሚካኤል /2/በጸሎትከ ተማኅፀነ    /2/\nኃይልህን አንሳ መጥተህ አድነን  /2/\nሚካኤል ተራዳን  \nሚካኤል በጸሎትህ ለምንልን   /2/" },
			n60 = { "ድንቅ ነው ልዩ ነው ልዑል የእኛ ጌታ\nምስጋና ይድረሰው ከጠዋት እስከ ማታ(2)\n	አዝ....\nየማይመረመር በሰው ልጅ ኅሊና\nረቂቅ ባሕርይ ገናና ነውና \nያለ የነበረ ከዘመናት በፊት \nለዘለዓለም ኗሪ ፈጣሪ ዓለማት \n	አዝ....\nበፍጥረታት ሁሉ የሚመሰገነው \nኃያሉ ጌታችን በእውነት ልዩ ነው \nበፍጹም ልዩ ነው የእርሱ ጌትነቱ \nአልፋና ዖሜጋ ጽኑ ነው መንግሥቱ\n	አዝ.... \nአዳምን ለማዳን ፍጹም በመውደዱ \nየማይሞተው አምላክ ሞተ በፈቅዱ\nምሥጢሩ ረቂቅ ነው ለሰዎች አእምሮ \nፍቅሩ ያስደንቃል ስናየው በአንክሮ\n	አዝ...." },
			n61 = { "እናመስግነው /2/\nአምላካችን ውለታው ብዙ ነው/2/\n	ከኃጢአት ቀንበር ከሞት ቤት ለይቶ\n	መንግስቱን ለሰጠን ከሲኦል አውጥቶ\n	ዘለዓለማዊ ቤት ታላቅ ሀብት ያደለኝ \n	መጬም የማይተወኝ ታላቅ አባት አለኝ\nአዝ ....\n	ፍጡራን ቢንቁኝ መጎስቆሌን አይተው\n	ወዳጆች ቢሸሹኝ ወዳጆች ነህ ብለው\n	እውነተኛው ረዳት አምላኬ መች ተወኝ ˜\n	ሁለት እጄን ይዞ ልጄ ተነስ አለኝ ˜\nአዝ ....\n	ሞታችንን ሞቶ ሕይወትን ላደለን \n	ለቸሩ ክርስቶስ ምን እንከፍለዋለን \n	ለታላቅ  ውለታው ጌታ ለዋለልን \n	በእልልታ እንዘምር በአንድነት ሆነን\nአዝ ...." },
			n62 = { "ብኪ ድኅነ ዓለም \nወበወልድኪ ኮነ ሰላም/4/ ኧኸ	\n\nትርጉም፦ በአንቺ ዓለም ዳነ በልጅሽም ሰላም ሆነ " },
			n63 = { "ዮሐንስ ክቡር ነቢየ ልዑል/፪/\nብእሴ ሰላም/፬/ ዘንብረቱ/፪/ ገዳም/፪/ ኧኸ\n\nትርጉም፡ ክቡር ዮሐንስ የእግዚአብሔር ነቢይ የሰላም ሰው ኑሮው በዱር የሆነ/ሰውነቱን ለገዳም ያዘጋጀ/፡፡" },
			n64 = { "ኩሉ ይሰግድ ለሥላሴ/2/ ኩሉ ይሰግድ/2\nወይትቀነይ ኩሉ ለመንግሥተ ሥላሴ ለሥላሴ ኩሉ ይሰግድ \n\nትርጉም፦ ፍጥረት ሁሉ ለሥላሴ ይሰግዳል ለሥላሴ መንግሥት ፍጥረት ሁሉ ይገዛል።  " },
			n65 = { "ቤተ ክርስቲያን ባሕረ ጥበባት  /፪/\nአትመረመርም እጅግ ጥልቅ ናት /፪/ ኧኸ\nበሥጋዊ ጥበብ ለማወቅ ቢቃጣ \nየእምነት መነጽሩን ይዞ ስላልመጣ  /፪/ \nአንዳንዱ በክህደት /፪/ ፈጣሪውን አጣ /፪/\nእንመሰክራለን ፈጣሪያችን አለ \nእንመሰክራለን አማኑኤል አለ	/፪/\nእንመነው አንካደው አማኑኤል ቸር ነው /፪/\nእንመሰክራለን ድንግል አማላጅ ናት\nእንመሰክራለን ማርያም አምላጅ ናት     /፪/\nእንመናት አንካዳት የአምላክ እናት ናት/፪/" },
			n66 = { "ሃሌ ሃሌ ሃሌ ሉያ /2/\nሀባ ሰላምከ ለኢትዮጵያ /4/ \nሃሌ ሃሌ ሃሌ ሉያ /2/ \nሰላምህን ስጣት ለኢትዮጵያ /4/ " },
			n67 = { "ፀምር ፀዓዳ መሶበ ወርቅ  እንተ መና መሶበ ወርቅ/2/\nበትረ አሮን እንተ ሠረጸት/2/ መሶበ ወርቅ/2/\n\nትርጉም፦  ነጭ ጸምር (ባዘቶ) መና ያለባት መሶበ ወርቅ የለመለመች የአሮን በትር ድንግል ማርያም ናት ።" },
			n68 = { "ዘሰማየ ገብረ ሰማየ ገብረ ወምድረ ሣረረ/2/\nአልቦ ዘይምስሎ ለአምላከነ/4/ \nሰማይን የዘረጋ ምድርንም ይጸና/2/ ኃያል ጌታ ሕያው አምላክ ያለ እርሱ ማን አለና  " },
			n69 = { "አንዲት ናት ቤተ ክርስቲያን አንዲት ናት /፪/\nቋንቋና ዘር ቀለም ማይነጣጥሏት\nክርስቶስ በደሙ የመሠረታት\nቤተ ክርስቲያን አንዲት ናት\n   \nአዲስ አይደለንም ለመከራ ጉዞ\nየወደቀ አናውቅም መስቀል ተመርኩዞ\nአምላከ ቅዱሳን ከኛ ጋር ነውና\nበርቱ ክርስቲያኖች በእውነት ጎዳና /፪/\n     አዝ\nየአበውን እምነት በአላውያን ፊት\nሰምተን ስላደግን ከገድላት አንደበት\nመሥዋዕትነት ቀርቧል ከፊታችን\nእውነት ስትገፋ አይችልም ልባችን /፪/\n	  አዝ\nአልጠፋችምና በእሳት ተፈትና\nይህን እናውቃለን በገሃድ ነውና\nመሰደድ መቃጠል ሁሉም ለጊዜው ነው\nለእውነት ከሆነ ሞትም ክብራችን ነው /፪/\n    አዝ\nከተዋሕዶ ጋር ስላለ መንፈሱ\nእውነትን ለማጥፋት መቅደስ አታፍርሱ\nበግፍ ቢገደሉ ክርስቲያኖች ሁሉ\nኦርቶዶክስ /ተዋሕዶ/ አትጠፋም ተነግሯል በቃሉ /፪/\n    አዝ\nታሪክን ያኖረች ፊደላትን ቀርፃ\nቅርስን ያወረሰች ገዳማት አንፃ\nእንግዳ ተቀባይ መንፈሳዊት እናት\nይህንን አትዘንጉ ኦርቶዶክስ /ተዋሕዶ/ ሀገር ናት /፪/\n    አዝ " };
	String[] ByDefalutMessage = { "በመጫን ላይ ነው። እባክዎትን ትንሽ ይጠብቁ!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		setTitle("የምስጋና መዝሙራት");
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setIcon(R.drawable.ic_arrow_back_white2);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("40. ኑ እናመስግን")) {
				loadChild(n40);
			} else if (HoldItem.equals("41. ንዒ ኀቤነ")) {
				loadChild(n41);
			} else if (HoldItem.equals("42. ዘይክል ኩሎ")) {
				loadChild(n42);
			} else if (HoldItem.equals("43. ኢትዮጵያ ታበጽሕ እደዊሃ ")) {
				loadChild(n43);
			} else if (HoldItem.equals("44. መሐርኒ ድንግል")) {
				loadChild(n44);
			} else if (HoldItem.equals("45. ትርሲተ ወልድ")) {
				loadChild(n45);
			} else if (HoldItem.equals("46. ክነፈ ርግብ")) {
				loadChild(n46);
			} else if (HoldItem.equals("47. መልአከ ሰላምነ")) {
				loadChild(n47);
			} else if (HoldItem.equals("48. ያሬድ ሐዋርያ")) {
				loadChild(n48);
			} else if (HoldItem.equals("49. እምልማደ ሳህልከእምልማደ ሳህልከ")) {
				loadChild(n49);
			} else if (HoldItem.equals("50. ሰላም ዘአብ")) {
				loadChild(n50);
			} else if (HoldItem.equals("51. አይ ይእቲ")) {
				loadChild(n51);
			} else if (HoldItem.equals("52. ኦ ፍጡነ ረድኤት")) {
				loadChild(n52);
			} else if (HoldItem.equals("53. ገድልከ ግሩም")) {
				loadChild(n53);
			} else if (HoldItem.equals("54. እልፍ አእላፋት")) {
				loadChild(n54);
			} else if (HoldItem.equals("55. ከክርቶስ ፍቅር")) {
				loadChild(n55);
			} else if (HoldItem.equals("56. ትምክሕተ ዘመድነ")) {
				loadChild(n56);
			} else if (HoldItem.equals("57. አክሊሎሙ ለሰማዕት")) {
				loadChild(n57);
			} else if (HoldItem.equals("58. አሰርገዋ")) {
				loadChild(n58);
			} else if (HoldItem.equals("59. አንስዕ ኃይለከ")) {
				loadChild(n59);
			} else if (HoldItem.equals("60. ድንቅ ነው")) {
				loadChild(n60);
			} else if (HoldItem.equals("61. እናመስግነው")) {
				loadChild(n61);
			} else if (HoldItem.equals("62. ብኪ ድኅነ ዓለም")) {
				loadChild(n62);
			} else if (HoldItem.equals("63. ዮሐንስ ክቡር ነብየ ልዑል")) {
				loadChild(n63);
			} else if (HoldItem.equals("64. ኩሉ ይሰግድ")) {
				loadChild(n64);
			} else if (HoldItem.equals("65. ቤተ ክርስትያን ባሕረ ጥበባት")) {
				loadChild(n65);
			} else if (HoldItem.equals("66. ሰላምህን ስጣት")) {
				loadChild(n66);
			} else if (HoldItem.equals("67. ፀምር ፀዓዳ")) {
				loadChild(n67);
			} else if (HoldItem.equals("68. ዘሰማየ ገብረ")) {
				loadChild(n68);
			} else if (HoldItem.equals("69. አንዲት_ናት_ቤተ_ክርስቲያን")) {
				loadChild(n69);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new Mesqel(this,
				ParentList, ParentListItems);
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

	public void setTitle(String title) {
		TextView text = new TextView(this);
		text.setText(title);
		text.setTextSize(14);
		text.setTypeface(Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf"));
		text.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text);

	}

	public class Mesqel extends BaseExpandableListAdapter {

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

		public Mesqel(Activity context, List<String> Items,
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
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 1) {

				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 2) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 3) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 4) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 5) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 6) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 7) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 8) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 9) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 10) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 11) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 12) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 13) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 14) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 15) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 16) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 17) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 18) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 19) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 20) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 21) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 22) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 23) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 24) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 25) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 26) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 27) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 28) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 29) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 30) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 31) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 32) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 33) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 34) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 35) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 36) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 37) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 38) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 39) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 40) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 41) {
				Toast.makeText(context, "መዝሙር የለውም", Toast.LENGTH_SHORT).show();
			} else if (childPosition == 0 && groupPosition == 42) {
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
