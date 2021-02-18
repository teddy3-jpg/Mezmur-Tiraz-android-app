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

public class Tiraz415 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("49.	 ኦ ጎይታና");
		ParentList.add("50.	 ሓቀኛ ዝኾነት");
		ParentList.add("51.	 ኣን መን እየ");
		ParentList.add("52.	 መራሒት መንግስተ ሰማያት");
		ParentList.add("53.	 ሰላም ንዓኺ ");
		ParentList.add("54.	 ኣምላኽ እንትግለፅ");
		ParentList.add("55.	 ምስ ቅዱስ ሚካኤል");
		ParentList.add("56.	 ልመናና ስማዕ");
		ParentList.add("57.	 ንክንሳህ ");
		ParentList.add("58.	ኣልቦ ዘከማየ");
		ParentList.add("59.	 ውእቱ ሚካኤል");
		ParentList.add("60.	ናትና ፍቕሪ");
		ParentList.add("61.	 ምስጋና  ንማርያም");
		ParentList.add("62.	 ስብሓት ");
		ParentList.add("63.	መድሓኒና  ካብ  ሰማይ  ወረደ");
		ParentList.add("64.	ለምንልና ደኣ ምሕረት");
		ParentList.add("65.	 ኣረጋዊ  ቅዱስ");
		ParentList.add("66.	 ራህረሀለይ  ጎይታ");
		ParentList.add("67.	ሰላም ንብላ ንቤተክርስቲያን");
		ParentList.add("68.	ንእግዚአብሔር ተኣዘዙ");
		ParentList.add("69.	ማርያም ድንግል      ");
		ParentList.add("70.	ሃበና እግዚአብሔር");
		ParentList.add("71.	ካብ ኣምላኽ ቀፂሉ");
		ParentList.add("72.	 ወዲቐ ከይቀሪ");
		ParentList.add("73.	ኣምላኽ  ተላዒሉ");
		ParentList.add("74.	ጎስአ ");
		ParentList.add("75.	ኦ ጊዜ ትንሳኤ");
		ParentList.add("76.	ዘንተ ሃለየ  ");
		ParentList.add("77.	መሲሉኒ በዲለካ");
		ParentList.add("78.	አዘክሪ ማርያም");
		ParentList.add("79.	ከምዝሰማዕናዮ");
		ParentList.add("80.	 ያሬድ አቦ ዜማ");
		ParentList.add("81.	 ደወልኪ");
		ParentList.add("82.	 ሰአሊለነ");
		ParentList.add("83.	 ገብርኤል ሊቀ መላእክት");
		ParentList.add("84.	ካብ ኩሎም መላእኽቲ");
		ParentList.add("85.	 ገብረ መንፈስ ቅዱስ");
		ParentList.add("86.	ሥላሴ");
		ParentList.add("87.	ሐቂ እምበር");
		ParentList.add("88.	 የዐቢ ክብራ");

	}
	// Assign children list element using string array.

	String[] n49 = { "ኦ ጎይታና መን ኣሎ ከማኻ /፪/\nንዓና ክትብል ኣብ መስቀል ተሰቐልካ /፬/ " },
			n50 = { "ሓቀኛ ዝኾነት ሃይማኖትና\nብደሙ መስሪቱ ኣምላኽ ዘፅነዐልና\nተዋህዶ ንፅህት እምነትና\n\nንኣዳም ንሄዋን ተስፋ ዝሃበላ\nኣምላኽ ካብ ማርያም ዝተወለደላ\nሓንቲ እያ ሃይማኖት ካልኣይቲ ዘይብላ\n\nንተዋህዶ ክብሉ ቅዱሳን ኣቦታት\nህይወቶም ሰዊኦም ኮይኖም ሰማእታት\nኣረኪቦምና ኣለዉ ቅድስቲ ሃይማኖት\n\nቅዱስ ጊዮርጊስ ሊቀ ሰማዕታት\nህይወቱ ሰዊኡ ፀኒዑ ብእምነት\nኣርኣያ ክኸውን ንኹሉ ፍጥረታት\n\nንሕና እውን ኩልና ከሞቶም ኣቦታትና\nክንፀንዕ ይግባእ በዚኣ እምነትና\nምእንቲ ክንረክብ ክብሪ ካብ ኣምላኽና" },
			n51 = { "ኣን መን እየ ኢልና ርእስና ንመርምር\nኣብ ቅድሚ ኣምላኽና ሓጢኣትና ንዘክር\n\nናይ ኣምላኽ ትእዛዝ ብኣና ተጣሒሱ\nብዝሙት ብሓሜት ኣካልና ረኺሱ\n\nናይ ሥጋ ጥቕሚ ሪኡ ልብና ፀኒዑ \nሞት ክሳዕ ዝወስደና ንምንታይ ዘንጊዑ\n\nንንስሃ ዝኾን ካብ ሃበና ዕድመ\nንመለስ ናብ ኣምላኽ ብርሃን ከይፀልመተ\n\nኣሞፅ ኣብ ትንቢቱ ከምዝተንበዮ\nነፍስና ከይትጠሚ ቃሉ ንስማዓዮ\n\nናይ ፃድቃን ሰማእታት ናይ ድንግል ፀሎታ\nኣይፈለፈየና ኣብ ቕድሚ ልዑል ጎይታ" },
			n52 = { "መራሒት መንግስተ ሰማያት ድንግል ማርያም /፪/\nኣድሕንና ንዓና ደቅኺ ካብ ገሃነም /፬/" },
			n53 = { "ሰላም ንዓኺ ማርያም ፈጣሪ ንምውላድ ዝበቃኻዕኺ/፪/\nኣምላኽ ንዓኺ ተዘይሓድገልና \nከም ሰዶምን ከም ገሞራን ኩልና ምኸና /፪/" },
			n54 = { "ኣምላኽ እንትግለፅ ብዘፍርሕ ግርምኡ \nቅዱሳን መላእክት መለከት እንተስምዑ \nናይ ሰብረ ዘይት ቃሉ እንትፍፀም ኣኺሉ ጊዚኡ\nተስፋ ንግበር ኩልና ናይ ኣምላኽ ምምፅኡ /፪/\n\nወርሒ እንትትፅልምት ከዋኽብቲ እንትረግፉ\nፀሓይ እንትትጠፍእ ሰማይን ምድርን እንትሓልፍ\nፍርድና ክንቅብል ደቂ ኣዳም ኩልና ንስራዕ\nኣብ ቅድሚ ኣምላኽ ይረአ ተግባርና ይቀላዕ /፪/\n\nፃድቃን እንትወርሱ መንግስተ ሰማያት \nሓጥኣን ይኸዱ ናብ ገሃንመ እሳት\nከምዚ ኣይመስለናን ነይሩ ይብሉ ብብኽያት ብኣውያት\nፍርዶም ይቕበሉ ካብ ኣምላኽ ዘይውዳእ መዓት /፪/\n\nናይ መድሓኒዓለም ዘይልወጥ ቃሉ\nኣይተርፍን ክመፅእ እዩ ቅዱሳን ኣኸቲሉ\nሓጥኣን እንትበኽዩ ፃድቃን ይዝምሩሉ\nንሕናኸ ኣበይ ይኸውን እንርከበሉ /፪/ " },
			n55 = { "ምስ ቅዱስ ሚካኤል ወገብርኤል አዴና ንዒ ማርያም/፪/\nንዒ ባርኽና ከምቶም ኣቦታትና /፪/ ኣዴና ንዒ ማርያም /፪/" },
			n56 = { "እግዚኣብሔር ምሕረትካ ዓድለና /፪/\nንዓና ደቅኻ ይቕሬታ ሃበና /፪/\n\nልመናና ስማዕ …ፈጣሪና\nበዲልናካ ኢና እሞ …ሓላዊና\n\nጎይታ ኽቡር ቅዱስ ምሕረትካ ሃበና\nሰላምካን ፍቕርኻን ኣይፈለየና\n\nካብ ርጉም ፀላኢ …ኣምላኽ ሓልወና /፪/\nበቲ ረቂቕ ሓይሉ ሰይጣን ከይስዕረና /፪/\n\nድንግል ማርያም ምሕረት ለምንልና /፪/\nፍቕሪ ንኽህበና እግዚኣብሔር ኣምላኽና /፪/\n\nኣብ ቅዱስ እምነትና ኣፅንዐና /፪/\nምእንቲ ክንወርስ ተስፋ መንግስትኻ" },
			n57 = { "ንክንሳህ መንፈስ ቅዱስ ኣይትፈለየና /፪/\nኣይትፈለየና /፪/ ሓይልኻ ሃበና /፪/" },
			n58 = { "ኣልቦ ዘከማየ/፪/ ኣበሳ ኃጢኣት ገባሪ /፪\nወኣልቦ ዘከማከ /፫/ እግዚኣብሔር መሐሪ /፪/\n'\nመድኃኔዓለም ክርስቶስ ዓለማተ ኩሉ ፈጣሪ /፪/\nበደመገቦከ /፫/ ኃጢኣትየ ኣስተሥሪ /፪/\n\nከምዝኸማይ የለን ከምዝኸማይ ኣበሳን ሓጢኣትን ገባሪ /፪/ \nከማኻ እውን የለን /፫/ እግዚኣብሔር መሓሪ /፪/\n\nመድሃኒዓለም ክርስቶስ ናይዚ ዓለም ኩሉ ፈጣሪ /፪/\nብደም ናይ ጎንኻ /፫/ ሓጢኣተይ ኩሉ ኣስተስሪ /፪/" },
			n59 = { "ውእቱ ሚካኤል ውእቱ መልኣከ ኃይል ልዑል ውእቱ ልዑለ መንበር /፪/\nይስኣል ለነ ይስኣል ለኢትዮጵያ ረዳኤ ይኩና ኣመ ምንዳቤ /፪/ \nንሱ እዩ ሚካኤል ንሱ እዩ መልአከ ሐይል ልዑል ካብ ኩሎም ሊቀ መላእክት /፪/\nይለምነልና ይለምን ንኢትዮጵያ ረዳኢ ይኹና ኣብ እዋን ፀገማ /፪/" },
			n60 = { "ካብ ሰማይ ሰማያት ናብ ምድሪ ወሪዱ \nንደቂ ሰባት ኢሉ ተዋሪዱ \nሓጢኣት ዘይባህሪኡ ብኣምላኽነቱ \nንምንታይ ተሰቒሉ ኣብ ማእኸል ሸፋቱ\n	ናትና ፍቕሪ ስሒብዎ\n	ተሰቂሉ ኣብ ቀራንዮ ጎቦ\n\nኣዲኡ እንታይ በለት ሓቊፋ ዘዕበየት\nፈቐዶ በረኻ ምስኡ ዝተሰደት \nእንታይ እዩ ገይሩ እንታይ እዩ በዲሉ \nመላእ ኣካላቱ ብጎመድ ቖሲሉ\n\nቀላያት ኩሎም ዝግዝኡሉ \nንደቂ ሰባት ማይ ፀሚኡኒ ኢሉ \nደምን ረሃፅን ብገፁ እናወረደ \nክትበኪ ረኣያ እታ ርህርህቲ ኣደ\n\nመከራ ከይፈርሐ ዝተኸተለ \nዮሃንስ በኸየ ወይለየ እናበለ\nክሳብ መወዳእታ ብትብዓት ዝሰዓቦ \nእኔሃ ኣዴኻ ኢሉ ንዮሃንስ ሃቦ" },
			n61 = { "ምስጋና  ንማርያም ካብ ሞት ኣድሒና ብህይወት ዘንበረትና /፪/         \nናይ ቅዱሳን ህይወት ኣደ መድሓኒና /፪/\n\nንዓኺ መሪፁ ከይተፈጥረ ዓለም \nንዓና ንኸድሕን ህያው መድሃኒኣለም \nብኣኺ ኢናሞ ሂወት ዝረኸብና \nምስጋና ይብፃሕኺ ማርያም ኣዴና\n\nካብሰማይ ወሪዱ መድሃኒኣለም \nብሓቂ ይመስገን ይኽበር ንዘለኣለም \nንዘምር ኩልና ንጎይታ ፈጣሪ \nክንዲ ዝሃበና ናይ ዘለኣለም ክብሪ\n\nሓጢኣትና በዚሑ ሸክሙ ኸቢዱና \nኣቃልልናንዶ ርህርቲ ኣዴና\nተግባርና ኸፊኡ መሲልና ንዓለም \nኣድሕንና ድንግል ካብ እሳተ ገሃነም \n\nፀጋ ዝተመላእኺ ማርያም ቅድስቲ \nካብኩለን ኣንስቲ ንስኺ ሕርይቲ\nንዓና ደቅኺ ሓጢኣት ዝበዝሐና \nካብ ክቡር ወድኺ ምሕረት ለምንልና\n\nመሰረት ህይወትና ምሕረት ናይ ነብስና \nኣምላክ ብምውላድኪ ካብ ፀልማት ወፂእና \nካብ መከራ ኣውፂኡ ንኽህበና ሰላም\nተወሊዱ ጎይታ ካብ ድንግል ማርያም  " },
			n62 = { "ስብሀት ለእግዚአብሔር ኪያነ ዘፈጠረ ከመ ናምልኮ\nስብሀት ለማርያም እመ ኣምላክ እግእትነ ወመድሀኒትነ\nስብሀት ለመስቀለ ክርስቶስ ዕፀ መድኃኒት ሀይልነ ወፀወንነ" },
			n63 = { "መድሓኒና ካብ ሰማይ ወረደ /፪/\nምእንታና ካብ ድንግል ተወልደ   /፪/ \n\nኣብ ዝባነ ኪሩብ ዝነብር ብኽብሪ\nሰራዒ መጋቢ ናይ ኩሉ ፈጣሪ\nንደቂ ኣዳም ክምልስ ናብ ክብሪ\nካብ ሰማይ ወረደ ስሒብዎ ፍቅሪ\n\nሰማያዊ ኣምላኽ ዝፈጠረ ዓለም \nኣብ ደንበ ሓደረ ኣብ ቤተልሔም\nከርቤ ዕጣን ወርቂ ኣምፅኡ ነገሰታት \nህያቦም ኣቕረቡ ብኽብሪ ብስግደት\n\nማንም ኣብ ዘይቐርቦ ዝነብር ኣብ ብርሃን\nተወሲኑ ሓደረ ኣብናይ ድንግል ማህፀን \nጓሶት ቤተልሔም ሪኦምዎ ሰገዱ\nመላእኽቲ ዘመሩ ኪሩቤል ወረዱ፡፡\n\nሰማይን ምድርን ዝሓዘ ኣብ ኢዱ\nንኣዳም አቦና ኮይኑዎ  ዘመዱ\nፍፁም ሰብ ኮይኑ ንዓና ንምድሓን\nነፃነት ኣዊጁ ኣጥፊኡልና ርግማን " },
			n64 = { "ማርያም ድንግል ርህርህቲ መምለዲት ንደቂ ሰባት    \nሓጢኣተኛ ኣይትንዕቕን´ሞ ለምንልና ደኣ ምሕረት\n\nብደቂ ኣዳም ብኣና ኣይጭክንን ልብኺ\nመሓረለይ ደኣ ወደይ ትብሊዮ ንፈጣሪኺ\nትልምንልና ንጎይታ ነቲ ፀባኦት ወድኺ/፪/\n\nምኽንያት ድሕነትና ኢኺ ወላዲተ አምላኽ ብሓቂ\nንዝፀወዐ ኣሚኑ ሽምኪ ዝምረፅ ካብ ወርቂ\nኣይትገድፍዮን ፈፂምኪ ኣብ ግዜ መከራ ኣብ ጭንቂ/፪/\n\nኣብ መርዓ ቃና ዘገሊላ ማይ ናብ ወይኒ ዘለወጥኪ\nኣክሊለ ሰማእታት ኢኺ መድኃኔዓለም ዝወለድኪ\nልበይ ካብ ሓጢኣት ኣንፂህኺ ኣላብስዮ ፀጋኺ /፪/" },
			n65 = { "ፃድቅ  የዋህ  ርህሩህ  ብእሴ  እግዚአብሔር\nኣርጋዊ  ቅዱስ  ድንግል  ገባሬ  ተኣምር    \n\nሃፍትን ክብርን ዓለም ብፍፁም ንዒቕካ\nምእንተ ፅድቂ ኢልካ ስደት ዝመረፅካ 	\nፍቕሪ አቦን ኣዶን ኣረጋዊ ንድሕሪት ገዲፍካ\nክሕደት ልዮን ፀሊእኻ ኣረጋዊ ኢትዮጵያ መፃእኻ፡፡\n\nብሃይማኖት ፅንዓት ፍፁም ዝጠንከረ\nፅድቂ ንኽምስክር ገዳም ዝሓደረ\nብናይ ጎይታ ፍቓድ ኣረጋዊ ስልጣን ተዋሂቡ\nንገበል ኣዚዙ ኣረጋዊናብ ዳሞ ደይቡ፡፡\n\nብዓል ምሉእ ክብሪ ኣምላኹ ፈታዊ\nብፆም ፀሎት ስግደት ዝፀንዐ ባህታዊ\nካብ ሞት ተሰዊርካ ኣረጋዊ ብምግባር ብእምነት\nኣቦና ባርኸና ኣረጋዊ ንኽንረክብ ምሕረት፡፡\n\nኣምላኽ ተቐቢሉ እቲ ሙሉእ እምነትካ \nዓለም ንኽተምሕር ቃል ኪዳን ሃበካ\nዘሚካኤል ቅዱስ ኣረጋዊ ንዓና ደቅኻ\nምሕረት ለምነልና ኣረጋዊ ካብቲ ፈጣሪኻ፡፡" },
			n66 = { "ክሳዕ መዓዝ ሕግኻ ክጥሕስ\nራህርሀለይ ጎይታ ልቦናይ ክምለስ   /፪/  \n\nብምሕረትካ ተዘይገዲፍካለይ\nነጊርካ ዘይውዳእ ብዙሕ እዩ  በደለይ\nኣይተኣዘዘዝኩኻን  እምኒ ኮይኑ ልበይ\nፀጋኻ ሃበኒ  ክእዘዝስ ኣቦይ /፪/\n\nህያው ቃልካ መጊብካ መኺርካኒ\nቅኑዕ መንገድኻ ፈፂምካ ኣርኢኻኒ\nግን እይተለወጥኩን  ምግባር ጎዲሉኒ\nታሪኸይ  ክቕየር ሓይልኻ ሃበኒ /፪/\n\nኣይከኣልኩን  ክሕሉ ሕግኻ \nስንፍናይ በዚሑ  ርሒቀ ካባኻ \nንንስሃ ኣብቀዐኒ  ብፍፁም  ፍቅርኻ \nሕይወተይ  ቀድሳ  ብቕድስናኻ  /፪/\n\nድኻመይ ርኢኻ  እንተይኣርሓቕካኒ\nሓቑፍካ  ደጊፍካ  ይቕረታ  ሂብካኒ\nተስፋ ንኸይቖርፅ  ርህራሄኻ  ኣለኒ\nበዝሒቲ  ምሕረትካ  ፍፁም ደኒቑኒ /፪/" },
			n67 = { "ሰላም ሰላም ንብላ ንቤተክርስቲያን /፪/\nኣካል ናይ ክርስቶስ ሕብረት ናይ ቅዱሳን /፪/\n\nናይ ድንግል ማርያም ፍቕሪ ምስ በረከት /፪/\nይብዘሐላ ንዓለም ክኸውን መድሓኒት /፪/\n\nናይ መስቀሉ ኪዳን እዩ መድሓኒና /፪/\nብደሙ ኢናሞ ህይወት ዝረኸብና /፪/\n\nናይ ቅዱሳን ፀሎት ናይ ፃድቃን በረከት /፪/\nይሕደር ምስ ኩልና ናይ መላእኽቲ ረድኤት /፪/\n\nብፍቕሪ ክንነብር ብፍፁም ትሕትና /፪/\nጥበብካ ሃበና እግዚአብሄር አምላኽና /፪/\n\nፀጋ መንፈስ ቅዱስ ይሕደር ምስ ኩልና /፪/\nይፅናዕ ሃሌሉያ ዘለኣለም ኣባና /፪/" },
			n68 = { "ንእግዚአብሔር ተኣዘዙ ስሙውን ፀውዑ\nንህዝብታት ምግባሩ ንገርዎም\nምስጋና ንስሙ ኣቕርቡ\nሰንበት ኣኽብሩ ፅድቂ´ውን ስርሑ\nሰማያዊ መኽዘን ንዓርስኹም ስንቂ ኣዳልዉ\nነቐዝ ኣብ ዘየበላሽዎ ሌባ ኣብ ዘይረኽቦ\nድልዋት ኮይንኩም ንበሩ\nጉዳይ ላዕላይ ሰማይ ሕሰቡ\nክርስቶስ ኣብ ዝነብረሉ" },
			n69 = { "ማርያም ድንግል ንዒ ናባና /፪/\nመድሓኒት ኢኺሞ  ናይ ነብስና /፪/\n\nናይ ያዕቆብ  መሳልል  ናይ  ጌዴዎን  ፀምር\nስምኪ ጥዑም  እዩ  ካብ  ፀባ  ካብ  መዓር\nሕጉሳት ንኸውን  ክንዝምር  ከለና\nስለ  ዝኾንክልና ካብ ሞት መድሓኒትና\n\nንልምን ኣለና ብፍፁም ትሕትና \nክንበፅሕ ናብ ኣምላኽ ብድንግል ልመና\nብናትኪ ቃል ኪዳን ስለ ዝተኣማመንና\nካብ ናይ ዘለኣለም ሞት ኣምላኽ የድሕነና\n\nኣማናዊት መቕደስ ናይ ሕይወትና ኪዳን \nምክንያተ ድሕነት ናይ ነብስን ናይ ስጋን\nሓዱሽ ዝገበርኪ ኣርሒቕኪ ንእርጋን\nንዓለም ዝሃብኪ ናይ ዘለኣለም ብርሃን\n\nኣክሊል ናይ ሰሎሞን ናይ ዳዊት በገና\nበትረ ኣሮን ኢኺ ሀመልማለ ሲና\nምሕረት ለምንልና ክንረክብ ተስፋና\nመኣዲ ቅዱሳን ሰማያዊ መና" },
			n70 = { "ዘይውዳእ ሃፍትኻ በረከት ናይ ኢድካ /፪/\nሃበና እግዚአብሔር ንዑ ናባይ ኢልካ /፪/   ኣዝ\n\nየብልናን  ኣብ ኢድና ቀለብ ናይ ነብስና  \nብሓጢኣት ዓለም ዝረኸስና ኢና\nኣብ መወዳእታ ኣብ ዳግም ምፅኣትካ\nመን ኮን ይኾን ጎይታ ዝቐውም ቅድሜኻ /፪/ \n\nብቐትሪ ብምሸት ፀልሚቱ ናብራና\nብስጋዊ ፍቓድ ፍፁም ተታሒዝና\nከይንወድቕ ከም ዴማስ ብብርቕርቕ ዓለም\nሓይልኻ ሃበና ሎሚ መድኃኔዓለም /፪/\n\nንስሃ ንምእታው ክንሓስብ ከለና\nልብና ሰዊሩ ሰይጣን እናስሐተና\nፍቕርኻ ከይንርኢ እናኸልከለና\nኣይከኣልናን ኣምላኽ ፀጋኻ ሃበና /፪/\n\nከይንፈልጥ ሓቂ መንገዲ ናይ ሕይወት\nሓጢኣት ኣድኪሙና ኮይኑና ዓቐበት\nሓይልኻ ሃበና ምርኩዝ ክኾነና\nብናትካ ረድኤት ክንፀንዕ ኩልና /፪/" },
			n71 = { "ካብ ኣምላኽ ቀፂሉ ምስግናን ስግደትን ሰላምን\nንዓኣ ይግባእ ንድንግል ማርያም /2/" },
			n72 = { "ወዲቐ  ከይቀሪ  ተዋሒጠ  ኣብ  ዓለም\nጎይታይ  ኣድሕነኒ  ስለ  ድንግል  ማርያም /፪/\nሓይልኻ  ሃበኒ  ርኢኻ  ናተይ  ድኻም /፫/\n\nካብ  ፅባቐ  ዓለም  ዝሓልፍ  ዝፈርስ\nኣብ ቤትካ  ክነብር ይሕሸኒ  ኣነስ /፪/\nንኸይርሕቐኒ  ፀጋ  መንፈስ ቅዱስ /፫/\nብስጋይ  ደኺመ  ወዲቐ  ከይቀሪ\nኦ  ጎይታይ ሃበኒ  ናይ  ኣዴኻ  ፍቕሪ \n			ናይታ ድንግል ፍቕሪ\nንዓኣ  እንተሒዘስ  ኣይስእንን ‘የ ክብሪ /፫/\nኣብ ምምፃእኻ እዋን ኣብ ግዜ ፍርድኻ\nምእንታን ክቐውም  ምሰቶም ኣባጊዕኻ   \n			ምስቶም ቅዱሳንካ\nጎይታይ ፍቐደለይ ክኾን ብየማንካ /፫/" },
			n73 = { "ሓጢኣትና ደምሲሱ ዕዳና ከፊሉ\nንፍቕሪ ሰብ ኢሉ ኣብ መስቀል ውዒሉ\nንሞት ኣሸኒፉ ኣምላኽ ተላዒሉ\nእሰይ ደስ ኢሉና ሰባት ዕልል በሉ\n\nብዘይ ምንም በደል ብዘይ ምንም ሓጢኣት\nንፍርዲ ቀሪቡ ኣብ ጲላጦስ ቅድሚት\nዝገርም ፍቅሪ እዩ ዝደንቕ ምሕረት \nንዝሰቐልዎ ኮይንዎም መድሓኒት\n\nተናገሪ ፍቕሩ መግደላዊት ማርያም \nናይ ኢየሱስ ክርስቶስ ናይ መድኃኔዓለም\nብዝሓት ናይ ወታደር ፍፁም ከይፈራሕኺ \nብንጉሆ ገስጊስኪ ኣምላኽ  ዝኣለሽኪ\n\nኣብ ተዓፅወ ገዛ መእተዊ ኣብ ዘይብሉ\nደቀ መዛሙርቱ ኣብ ተሰብሰብሉ\nብተዋህዶ ምስጢር ኣብ ማእኸሎም ኮይኑ\nሰላሙ ኣዊጁ ኣርእይዎም ጎኑ \n\nብናይ ደሙ ማህተም ስጋና ቀዲሱ\nተላዒሉ ጎይታ ንፅልኢ ደምሲሱከፊቱልና በሪ ናይ መንግሰተ ሰማይ\nተቐመጠ ኣብ ክብሩ ኣብ መንበሩ ኣብ ላዕላይ" },
			n74 = { "ጎስዐ ልብየ /፪/ ቃለ ሰናየ\nወአነ አየድዕ ቅዳሴሃ ለማርያም\nአኮ በአብዝሆ አላ በአውሕዶ\n\nአባ ህርያቆስ ልቡ ተላዓዒሉ ከመስግነኪ\nእንዳተገረመ ማርያም ብንፅህናኺ\nአምላኽ ብምሕዳሩ መፂኡ አብልዕሌኺ\n\nብምንታይ ከመይን ጌርና ክንምስለኪ ድንግል\nሐመረ ኖኅ ማርያም ናይያዕቆብ መሳለል  \nዝለምለመት በትሪ አሮን ናይ ሰለሞን አክሊል\nትንቢተ ነብያት ሞገስ ናይ ሓዋርያት \nሐፍቶም ንመላእኽቲ መመክሒት መነኮሳት\nተስፋ ኃጥአን ኢኺ ኣዶ ሰማዕታት\n\nኦ ምልእተ ጸጋ ተነጊሩ ዘይውዳእ በዝሒ ምስጋናኺ\nካብ ኪሩቤል ካብ ሱራፌል ዝበልፅ ግርማኺ\nንናይ ተዋህዶ ምስጢር አምላኽ  ዝሐረየኪ" },
			n75 = { "ኦ ጊዜ ትንሳኤ ኦ ተሐጉስ ዕለት\nምሕረት ዝወረደላ ንደቂ ሰባት \nነፃ ወፂእና ካብ ሰይጣን መግዛእቲ\nካብ ኩለን ዕለታት ሰንበት እያ ኽብርቲ /፪/\n\nሎሚ ሓጎስ ኾይኑ ብሰንበተ ክርስቲያን\nስለዝተልዓለ ክርስቶስ ካብሙታን\nኣዳም ኣይተረፈን ወፂኡ ካብ ገነት\nመሊስዎ ጎይታ ኣብዚሑሉ ምሕረት /፪/\n\nንደቂ ሰባት ብርሃን ወፂኡልና\nብክርስቶስ ትንሳኤ ሓጎስ በዚሑልና\nሞትና ተቐቢሉ ህይወቱ ሂቡና\nመርገምና ኣርሒቑ ሓዲሱ ህይወትና /፪/\n\nክርስቶስ ተላዒሉ ኣብ ሳልሳይ መዓልቲ\nብሰንበተ ክርስትያን ካብ ኩለን ሕርይቲ\nሞት ሓይልኻ ኣበይ ኣሎ ተሳዒርካ ሎሚ\nስልጣንካ ጠፊኡ ብጎይታና ሓይሊ /፪/" },
			n76 = { "ዘንተ ሃለየ ወይቤ ምንተኑ ዘረብሁ አቡዬ ወእምዬ \nዘኢረከቡ በቁኤተ በሲመተ ዓለም ሐላፊ /፪/\nወይቤ ቅዱስ ማር ጊዮርጊስ አንሰ አኀድግ እምኔየ \nክብረ ዝንቱ ዓለም ዘየሃልፍ ፍጡነ አጥሪ ሊተ መንግሥተ ሰማያት/፪/" },
			n77 = { "መሲሉኒ በዲለካ ተጋግየ ርሒቐ ካባኻ\nመሲሉኒ ዓለም ዝሐሸት አይደልዮን ኢለ ናትካ አቦነት (፪)\n	ዝሃብካኒ ኩሉ ንብረተይ\n	በቲነዮ የለን አብ ኢደይ\n	ኮይነለኹ ምንም ዘይብለይ\n	ዝተደርበኹ ዝኾንኩ በይነይ\nፈተውተይ ኩሎም ዝነበሩ ምሳይ\nየለውን ሕዚ ምስተረፍኩ ጥርሐይ\nከፊኡኒ ብኹሉ ተፀሊአ\nዘይምሱል መሲለ ብዙሕ ተገፊዐ\n	አየቀበፅኩን መፂአ ናባኻ\n	ናብ አቦይ ኢለ ፈሊጠ ምሕረትካ\n	አድሕነኒ ጎይታ ተቐበለኒ\n	ብዘይካኻ አነ መን አለኒ\n\nፀውዓዮም ኩሉም ፈተውትኻ\nሕጉሳት ይኹኑ ጎይታ ምሳኻ\nንገሮም አቦይ ካብ ሞት ምምላሰይ\nእቲ ብዙሕ በደለይ ከምዝሐደግካለይ\n	ብሰማይ ብምድሪ ኮይኑ አሎ ሐጎስ\n	ጠፊኡ ዝነበረ ዳግም እንትምለስ\n	ሐደ ሐጢያተኛ ህይወት ብምርካቡ\n	ጎይታ ተሐጎሰ ፈተውቱ አኪቡ" },
			n78 = { "አዘክሪ ማርያም ስደትክን ጥሜትክን\nሓዘንክን ጭንቅኽን እቲ ኩሉ ድኻምክን\nናብ ገፅ ወድኺ ዝወረደ ንብዓት\nአዘክሪ አዴና ምእንተ ደቅኺ\nአዘክሪ አዴና ለምንልና ምሕረት\n\nንፃድቃን ዋግኦም ኣምላኽ እንትኸፍሎም\nበደልና ንዝበዝሐ በልዮ መሐሮም\nናትኪ ቅድስና ሞጎስ ይኹነና\nምርኩስ ህይወት ኾይኑ ካብ ሞት የድሕነና /፪/\n\nጎደሎ እዩ እምነትና ምግባርና\nምሕረት ንኽንረክብ ድንግል ለምንልና\nፍቱው ወድኺ አምላኽኪ አምላኽና\nእሙን እዩ ቃሉ ብኣኺ ክምሕረና /፪/\n\nአብ ቅድሚ ሥላሴ ሞጎስ ዝረከብኪ\nህይወት ዝህብ እዩ እቲ ቃልኪዳንኪ\nዘፍሰስክዮ ንብዓት አብ ጊዜ ስደትኪ\nየተዓርቐና ምስ ቅዱስ ወደኺ /፪/" },
			n79 = { "ከምዝሰማዕናዮ ብነብያት ትንቢት ጋህዲ ኮይኑ ርኢናዮ /፪/\nሰበ ዝኾነ አምላኽ አብ ደንበ ደቂሱ/፪/አብ ቤተልሔም ረኺብናዮ/፪/\n	ንዑ ርአዩ ዘገርም ነገር\n	ምስጋና ነቕርበሉ ስለ ዝገለፀልና ምሥጢር /፪/\n	ሰብ ዘይኸውን አምላኽ ሰበ ኮይኑ\n	መለኮት ብመጠን ወዲ ሰብ ርኢናዮ ተወሲኑ /፪/\nንመዋዕል ግዝአቱ ፍፃመ ዘይብሉ\nሥጋ አዳም ተዋሂዱ ዘበን ተቖፂሩሉ /፪/\nዘይረአይ ተራእዩ ዘይፍለጥ ተገሊፁ\nወልደ እግዚአብሔር ሕያው ብሐቂ ሰብ ኮይኑ /፪/\n	ካብቲ ዓብዪ ጥበብ ዓለም ዝፈጠረሉ /፪/\n	ኣዝዩ ይበልፅ ንዓና ዘድሐነሉ /፪/" },
			n80 = { "ያሬድ አቦ ዜማ ቅዱስ ኢኻ መራሔ መዘምራን/፪/\nዜማ መላእኽቲ አምሂርካና አምላኽና ንክነመስግን\nቅዱስ ያሬድ ካህን ጥዑመ ልሳን ኢኻ ጥዑመ ልሳን /፪/" },
			n81 = { "ደወልኪ ካብ ርሑቕ ሰሚዕና \nናባኺ መፂእና ክነቕርብ ምስጋና\nቤተክርስቲያን መረበትና\n\nመዓዛኺ ጥዑም ካብ ልቢ ዘይጠፍእ\nማህሌትኪ ንነፍሲ ብሐጎስ ዝመልእ \nኩሉሻዕ ዝናፈቕ ፈፂሙ ዘይርሳዕ\n\nወድ ሰብ ኩሉ ክኾን ክርስቲያን \nናባኺ ይመፅእ አብ አርባዓን አብ ሰማንያን\nብጥምቀት ክርስቶስ አደ ትኾንዮም ንአማንያን\n\nብደሙ ዝመስረተኪ ኣዒንቱ ዘይፍለያኺ\nመፅለሊት ምእመናን ዘይውዳእ ምስጢርኪ  \nህይወት ረኺብና ብስጋወደሙ ካብ መአደኺ" },
			n82 = { "ሰአሊለነ ኃበ ወልድኪ ሔር መድኃኒነ /፪/\nይምሐረነ ወይሰሃለነ ይምሐረነ ይስረይ ኃጢአትነ/፪/\nለምንልና ንሩህሩህ ወድኺ መድሓኒና /፪/\nይምረና ይቕረ ይበለና ሓጢአትና ንሱ ይደምስሰልና" },
			n83 = { "ገብርኤል ሊቀ መላእክት ትቐውም አበ ቅድሚ ፈጣሪ /፪/\nከይንጋገ ከይንጠፍእ ምርሐና ንኽንረክብ ክብሪ/፪/\n\nአምላኽና ክሳብ ንፈልጥ ንፅናሕ ብፅንዓት\nኢልካ አረጋጊዕኻዮም ንመላእኽቲ ሰማያት\nርድአና ክንፀንዕ ንሕናውን ብጸሎት\nትእዛዝ ፈጣሪ ክንሕሉ ፀኒዕና ብእምነት\n\nአናንያ አዛርያ ሚሳኤል ብሽም ፈጣሪኦም\nናብ ሐዊ ምስተደርበዩ ምእንቲ እምነቶም\nነበልባል ማይ ጌርካዮ ኮይንካ አብ ማእኸሎም\nንፈጣሪ አመስገኑ ካብ ሞት ብምድሐኖም\n\nናብ ፍሉሕ ማይ ክድርበዩ ምስተፈረደሎም \nቂርቆስ ንአዲኡ አፅኒዑ ክልቲኦም ጠንኪሮም\nብእምነት ምስ አተው ክንድሕን ኢና ኢሎም\nምንም ከይተጎድኡ ቀልጢፍካ በፃሕኻሎም" },
			n84 = { "ካብ ኩሎም መላእኽቲ ዝለዓለ ኽብርኻ\nሊቀ መላእኽቲ የዋህ ዝባህሪኻ\nበሓይሊ ጸሎትካ ወዲቑ ሳጥናኤል\nልዑል መንበር ኢኻ ቅዱስ ሚካኤል ሓያል\n\nኣፎምያ ብሃይማኖት ብምግባር እናሃለወት\nብሽምካ መፂኡ ከውፅኣ ካብ እምነት\nበቲ እኩይ ግብሩ ስለዘይተስዓረት\nክቐትላ ምስበለ ኣድሓንካያ ካብ ሞት\n\nናይ ሞት ደብዳቢኡ ኣብ ኢዱ ጨቢጡ\nይጓዓዝ ነበረ ባህራን ብዘይምፍላጡ\nሚካኤል ኣብ መንገዲ ቀልጢፍካ መፂእኻ\nነቲ ደብዳቤ ቀየርካዮ ናብ ዘሐጉስ መርዓ\n\nፈርኦን ተቆጢዑ ንእስራኤል እንትስእቦም\nንባሕሪ ከፊልካ ሚካኤል ኣሕሊፍካዮም\nፈርዖን ምስ ሰራዊቱ ከዲንካዮ ብማይ\nጥሒሎም ተረፉ ሞይቶም ኣብ ውሽጢ ማይ" },
			n85 = { "ገብረ መንፈስ ቅዱስ ናይ ዝቋላ ሐርበኛ\nአብ ውሽጢ ባሕሪ ሚእቲ ዓመት ዝፀለኻ /፪/\nሰሚዑካ አምላኽ  ምሒሩልካ  ንኢትዮጵያ \nምሒሩልካ ንዓና ደቅኻ /፪/" },
			n86 = { "ሥላሴ ብስም ብግብሪ ብአካል ሠለስተ እንትኾኑ\nብኣገዘዝኣ ብባህርይ ብመለኮትን ፍቓድን ብሓደነት ይእመኑ/፪/\n\nአብ ብስልጣኑ ካብ ወልድን መንፈስ ቅዱስን አይዓብን\nወልድ ብስልጣኑ ካብ አብን መንፈስ ቅዱስን አይንእስን\nመንፈስ ቅዱስ እውን ሥልጣኑ ሓደ እዩ ምስ አብን ወልድን\n\nብሓደነት ብሠለስተነት ይነብሩ ንሳቶም\nቅድሚ ዓለም ድሕሪ ዓለም ዝነበሩ ፀኒዖም\nበዚ ባህርይ ይፍለጡ ሥላሴ ዘለዓለም\n\nኣብ ህንፃ ሰናዖር ሓደነት ሠለስተነት ተፈሊጡ\nኣብ ቤተ ኣብርሃም ሥላሴ መንነቶም ተገሊፁ\nብሓዲስ ኪዳንውን አብ ዮርዳኖሰ ተረጋጊፁ" },
			n87 = { "ሐቂ እምበር ሓሶት ዘይብሉ\nድሕነት ደቂ ሰባት ዝተፈፀመሉ\nንኹሉ ዝተውሃበ ንማንም ከይፈለየ\nፍቕሪ ክርስቶሰ እዩ አብ መሰቀል ዝተርኣየ/፪/\n\nቁስልና ቆሲሉ ሕማምና ሓሚሙ\nስግኡን ደሙን አቕሪቡ ንኹሉ ዓዲሙ\nናትና በደል ኩሉ ንሱ ተሸኪሙ\nጎኑ ተወጊኡ አፍሲሱልና ደሙ/፪/\n\nንርእሱ ከይሰሰዐ ህይወቱ ሂቡና\nወንጌል ኮይኑ ባዕሉ ፍቅሪ ዘንበበና\nምሕረትን ይቅርታን ፍፁም መጊቡና\nኣርእዩና ትዕግስቱ መሓሪ ኣምላኸና /፪/\n\nከምእዚ እዩ ፍቕሪ አድልዎ ዘይብሉ\nብዘይ ምንም ዋጋ ዝወሃብ ንኹሉ\nብአንደበት ዘይኮነ ዝተገልፀ ብተግባር\nካብ ሕሊና ዘይጠፍእ ንዘለአለም ዝነብር /፪/" },
			n88 = { "የዐቢ ክብራ ለማርያም እምኩሎሙ ቅዱሳን /፪/ \nእስመ ድልወ ኮነት ለተወክፎ ቃለ አብ ዘይፈርህዎ መላእክት \nወየአኲትዎ ትጉሃን በሰማያት ማርያም ድንግል ጾረቶ በከርሳ /፪/\nካብ ኩሎም ቅዱሳን ክብሪ ድንግል ማርያም አዝዩ ልዑል እዩ/፪/ \nቃለ ኣብ ንኽትቅበል ብቕዕቲ ብምዃና\nመላእኽቲ ዝፈርሕዎ ትጉሃን ኣብ ሰማያት ዘመስግንዎ \nማርያም ድንግል ፀይራቶ ኣብ ማህፀና /፪/ " };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("49.	 ኦ ጎይታና")) {
				loadChild(n49);
			} else if (HoldItem.equals("50.	 ሓቀኛ ዝኾነት")) {
				loadChild(n50);
			} else if (HoldItem.equals("51.	 ኣን መን እየ")) {
				loadChild(n51);
			} else if (HoldItem.equals("52.	 መራሒት መንግስተ ሰማያት")) {
				loadChild(n52);
			} else if (HoldItem.equals("53.	 ሰላም ንዓኺ ")) {
				loadChild(n53);
			} else if (HoldItem.equals("54.	 ኣምላኽ እንትግለፅ")) {
				loadChild(n54);
			} else if (HoldItem.equals("55.	 ምስ ቅዱስ ሚካኤል")) {
				loadChild(n55);
			} else if (HoldItem.equals("56.	 ልመናና ስማዕ")) {
				loadChild(n56);
			} else if (HoldItem.equals("57.	 ንክንሳህ ")) {
				loadChild(n57);
			} else if (HoldItem.equals("58.	ኣልቦ ዘከማየ")) {
				loadChild(n58);
			} else if (HoldItem.equals("59.	 ውእቱ ሚካኤል")) {
				loadChild(n59);
			} else if (HoldItem.equals("60.	ናትና ፍቕሪ")) {
				loadChild(n60);
			} else if (HoldItem.equals("61.	 ምስጋና  ንማርያም")) {
				loadChild(n61);
			} else if (HoldItem.equals("62.	 ስብሓት ")) {
				loadChild(n62);
			} else if (HoldItem.equals("63.	መድሓኒና  ካብ  ሰማይ  ወረደ")) {
				loadChild(n63);
			} else if (HoldItem.equals("64.	ለምንልና ደኣ ምሕረት")) {
				loadChild(n64);
			} else if (HoldItem.equals("65.	 ኣረጋዊ  ቅዱስ")) {
				loadChild(n65);
			} else if (HoldItem.equals("66.	 ራህረሀለይ  ጎይታ")) {
				loadChild(n66);
			} else if (HoldItem.equals("67.	ሰላም ንብላ ንቤተክርስቲያን")) {
				loadChild(n67);
			} else if (HoldItem.equals("68.	ንእግዚአብሔር ተኣዘዙ")) {
				loadChild(n68);
			} else if (HoldItem.equals("69.	ማርያም ድንግል      ")) {
				loadChild(n69);
			} else if (HoldItem.equals("70.	ሃበና እግዚአብሔር")) {
				loadChild(n70);
			} else if (HoldItem.equals("71.	ካብ ኣምላኽ ቀፂሉ")) {
				loadChild(n71);
			} else if (HoldItem.equals("72.	 ወዲቐ ከይቀሪ")) {
				loadChild(n72);
			} else if (HoldItem.equals("73.	ኣምላኽ  ተላዒሉ")) {
				loadChild(n73);
			} else if (HoldItem.equals("74.	ጎስአ ")) {
				loadChild(n74);
			} else if (HoldItem.equals("75.	ኦ ጊዜ ትንሳኤ")) {
				loadChild(n75);
			} else if (HoldItem.equals("76.	ዘንተ ሃለየ  ")) {
				loadChild(n76);
			} else if (HoldItem.equals("77.	መሲሉኒ በዲለካ")) {
				loadChild(n77);
			} else if (HoldItem.equals("78.	አዘክሪ ማርያም")) {
				loadChild(n78);
			} else if (HoldItem.equals("79.	ከምዝሰማዕናዮ")) {
				loadChild(n79);
			} else if (HoldItem.equals("80.	 ያሬድ አቦ ዜማ")) {
				loadChild(n80);
			} else if (HoldItem.equals("81.	 ደወልኪ")) {
				loadChild(n81);
			} else if (HoldItem.equals("82.	 ሰአሊለነ")) {
				loadChild(n82);
			} else if (HoldItem.equals("83.	 ገብርኤል ሊቀ መላእክት")) {
				loadChild(n83);
			} else if (HoldItem.equals("84.	ካብ ኩሎም መላእኽቲ")) {
				loadChild(n84);
			} else if (HoldItem.equals("85.	 ገብረ መንፈስ ቅዱስ")) {
				loadChild(n85);
			} else if (HoldItem.equals("86.	ሥላሴ")) {
				loadChild(n86);
			} else if (HoldItem.equals("87.	ሐቂ እምበር")) {
				loadChild(n87);
			} else if (HoldItem.equals("88.	 የዐቢ ክብራ")) {
				loadChild(n88);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T415(this, ParentList,
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
		text.setText("የትግረኛ መዝሙራት");
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

	public class T415 extends BaseExpandableListAdapter {

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

		public T415(Activity context, List<String> Items,
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