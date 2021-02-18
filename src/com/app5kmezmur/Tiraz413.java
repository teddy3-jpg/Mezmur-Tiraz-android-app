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

public class Tiraz413 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("1.	ያ አባ ኬኛ ");
		ParentList.add("2.	ገለተ ዋቀዮ (እግዚአብሔር ይመስገን)");
		ParentList.add("3.	ና ኬኒ ዋቀዮ");
		ParentList.add("4.	ጃለላን ሁንዳ ጎቴ");
		ParentList.add("5.	ዋቃዮ ኑ ደገኢ");
		ParentList.add("6.	ዱኧ ኬሳ ኑ ባፍቴ");
		ParentList.add("7.	ጀጀባዳ");
		ParentList.add("8.	ሎላ ፈኖሳቲን (ጥልን በመስቀሉ)");
		ParentList.add("9.	የሮ ኢሲን ዱፍተኒ");
		ParentList.add("10.	 ኢየሩሳሌም ገሉፍ");
		ParentList.add("11.	 ያዋቃዮ");
		ParentList.add("12.	 ገለተ ዋቀዮ");
		ParentList.add("13.	 ገለተ ኬ ያዋቀዮ");
		ParentList.add("14.	 ዋቀዮ ቁልቁሉ");
		ParentList.add("15.	 ጐቺ ጐፍታ");
		ParentList.add("16.	 መነ ዋቀዮ");
		ParentList.add("17.	 ኢሾ ጎፍታን ኑ ደለቴ");
		ParentList.add("18.	 ዋቀዮን በርባዳ");
		ParentList.add("19.	 አናፍ ዋቀዮዳ");
		ParentList.add("20.	 ጃለሊ ዋቀዮ");
		ParentList.add("21.	ያ መነ ዋቀዮ");
		ParentList.add("22.	 ሉቡ ሲፍ አቦመሙ");
		ParentList.add("23.	 ኡመመ ሁንዱመ ኢራ");
		ParentList.add("24.	 ዱበርቶተ ኬሳ (ከሴቶቹ ሁሉ)");
		ParentList.add("25.	 ማሉማ (በመኑ)");
		ParentList.add("26.	 ጎፍታን ሲፊለቴ");
		ParentList.add("27.	 ሲገለቴፈነ");
		ParentList.add("28.	 ያጊፍቲ ጀኔ ");
		ParentList.add("29.	 ያጊፍቲ ኮ ");
		ParentList.add("30.	 ኤርገማ ገብሬሊ");
		ParentList.add("31.	 ያገብሬሊ ኑ አራርሲ");
		ParentList.add("32.	 አከ አናኒያ (እንደ አናንያ)");
		ParentList.add("33.	አከ ሚካኤላ ኤርገማ");
		ParentList.add("34.	 ሩፋኤል ኤርገማ");
		ParentList.add("35.	 አቦቲን  ቁልቁሉ");
		ParentList.add("36.	 ገለኒ (ስብሐት)");

	}
	// Assign children list element using string array.

	String[] n1 = { "ያ አባ ኬኛ ሰሚረ ከን ጂራቱ መቃን ኬ ሀቁልቁላኡ ሞቱማን ኬ \nሀዱፉ ጃለሊ ኬ ሰሚረ አኩመ ተኤ አከሱመስ ለፈረቲ ሀታኡ ቡዴነ \nኬኛ ሀራፍ ከን ኑ ገኡ ኑፍ ኬኒ የከ ኬኛስ ኑፍ ዲሲ ኑቲስ ከን ኑ \nየከኒፍ አኩመ ዲስኑፊ ቆሩምሰቲስ ኑ ሂን ገልቺን ሀማራ ኑ ኦልቺ \nመሌ ሞቱማን ከን ኬቲሆ ሁምኒስ ገለኒስ በረ uራን አሜን፡፡ \nያጊፍቲ ኬኛ ዱብሮ ማርያሚ ነጋ ኤርገማ ገብርኤል ቁልቁሉቲን ነጋ \nሲን ጄና ያደ ኬቲን ዱብሮዳ ፎን ኬቲኒስ ዱብሮዳ ያ ሃደ ዋቀዮ ሲፍ \nገለኒ ሀተኡ፡፡ አቲ ዱበርቶተ ኬሳ ከን ኤቢፈምቴዳ ፊሪን ገራ ኬቲስ \nከን ኤቢፈሜዳ፡፡ ኬናን ከን ጉተምቴ ገመዲ ዋቀዮ ሲ ወጂን ጂራሆ \nጎፍታ ኬኘ ኢየሱስ ክርስቶሲራ ዲፈመ ኑፍ ከደዱ ጩቡ ኬኘ አከ ኑ \nዲሱፍ አሜን፡፡ ገለኒ ዋቃዮፍ ሀተኡ ኢኒ ኑ ኡሜራ አከ ኢሰ ዋቄፈኑፍ \nገለኒ ማሪያምፍስ ሀደ ጎፍታፍ ሀተኡ ኢሼን ጊፍቲ ኬኛ አከሱመስ \nአብዲ ኬኛ፡፡ ገለኒ ፋኖ ክርስቶሲፍ ሀተኡ ከን ኢቲን ፈይኔ ሁምነ \nኬኛ አከሱመስ ሂርኮ ኬኛ፡፡" },
			n2 = { "ገለተ ዋቀዮ /፬/\nከን ዮናን ኑገሄ/፪/ ገለተ ዋቀዮ /፪/ ኤዬ" },
			n3 = { "ና ኬኒ ዋቀዮ ሰሙፍ ቀልቢ የሮ ሁንዳ ከን ሲያዱ/፪/\nሉቡኮስ ናታሲሲ ሴረኬ ቆፋን ከን ገመዱ /፬/" },
			n4 = { "ጃለላን ሁንዳ ጎቴ ነመ ፈይሱፍ ፈኖረ ኦልቴ /፪/\nባየቴራ ባየቴ ጃላሊ ኬ/፪/ ያ ዋቅ ገለተ ኬ /፪/" },
			n5 = { "ዋቃዮ ኑ ደገኢ ባይፍኔ ሲከደና /፪/\nቶሎማ ኬን ኑያደዱ ቁልቁሎፍኔ ለሚ ከን ኬታና/፪/" },
			n6 = { "ዱኧ ኬሳ ኑ ባፍቴ ጃለለ ኬቲን ኑ ዋምቴ/፪/ /፪/\nገለኒ ሲፍ ሀተኡ /፪/ ያዋቀዮ /፬/ ኤዬ" },
			n7 = { "ጀጀባዳ /፪/ አመንቲ ኬሰኒቲ ጀባዳ /፪/\nሶባን ዱጋ በሁን ሂን ደንዳአሙ /፬/ ኤዬ\nኒአመነ ኒአብደነ ኤርገሞተ ዋቀቲስ ሂመነ /፪/\nየሮ ረኪናፊ የሮ ጊዲራ የሮ ዲጲናፊስ አብዲ ኑተኡ /፪/ ኤዬ\nያ ማርያሚ ያ ሃደኮ ዳበዱ ሚርገኮ/፪/\nኢልመ ኬ ናፍ ከዱ ዋኤ ጩቡ ኮ /፬/ ኤዬ" },
			n8 = { "ሎላ ፈኖሳቲን አጄሴ /፪/\nፈኖሳቲን ነሞታ ፈዩማ ኑፍ ሂሬ /፬/" },
			n9 = { "የሮ ኢሲን ዱፍተኒ/፪/ መነ ዋቀ ኬኛ /፪/\nገመዳ ነሞታ ሲን ሲመቲ ማርያም ሀቲ ኬኛ /፬/ ኤዬ\nኤጋ ያ ነሞታ ሉቡ ኬሰን/፪/ ዋቀዮዳፍ ኬና /2/\nማርያም ሀቲ ኬኛ ኑ ጎርስቲ ካኔ ደጌፈና /፬/ ኤዬ\nሀሜኘ ዲሳቲ ኮታሜ/፫/ ያነማ /፪/\nዋቀዮን ሀ ከደኑ ገልገለስ/፪/ ገነማ /፬/ ኤዬ" },
			n10 = { "ጃለሊ ዋቀዮ ጉያ ጂማታ ፈኖረቲ ሙለቴራ /፪/\nኢየሩሳሌም ኑ ገልቹዳፍ ቢየ ሀራ /፬/ ኤዬ\nኢየሩሳሌም ገሉፍ ጀጀባዳ የሮ ሁንዳ ያነሞታ /፪/\nዲያቴራ ዱፋቲን ጎፍታዳ /፬/ ኤዬ\nኤኙ ከን ቆጳኤ ኢየሩሳሌም ኢሼ ሀራ ገሉዳፊ /፪/\nቁልቁሎተ ወጂን ሚርገሳ ዳበቹፊ /፬/ ኤዬ" },
			n11 = { "ያዋቃዮ ሲኢ ሃገለቱ ያዋቀዮ መቃን ኬ ሃኡልፋቱ/፪/\nለፈ ጀለስ ታናን ሲሚረስ ከን በለሊኡ ዮ በርባኔ ሂን ጂሩ \nከን ሀመ ዋቀ ኬኘ ገኡ ኢኒ ሁንዱመረ ጫላ ገለኒ ኢሰ ሀገሁ /፪/ " },
			n12 = { "ገለተ ዋቀዮ የሮ ሁንዱማቲ /፪/\nአከ ዳዊት አኖ ገርቢቸ ኢሳቲ /፬/ ኤዬ\nጎፍታን ኮ አማኑኤል ባዬ ነ ጃለቴ /፪/\nሴጣን ሀርካ ዲገ ኢሳን ነቢተቴ /፬/ ኤዬ\nሴጣን ሀሌያቱ ሞርሚቱን ዲኒ ኮ /፪/\nሁምነ ጎፍታን ሞኧቹን ዮሚስ ከንኮ /፬/ ኤዬ" },
			n13 = { "ገለተ ኬ ያዋቀዮኮ /፪/\nሲን ከደዳ ሲን ከበጀ በረ ጂሬኘ ኮ \nዋን ና ዲፍቴፍ በሌሳ ኮ ሁንዱማ ጩቡኮ  /፪/" },
			n14 = { "ዋቀዮ ቁልቁሉ/፫/ ኡማ ኡመምቶታ\nሲገለቴፈነ ያ ሞቲ ሞቶታ /፪/\n\nጎፍታ ጎፍቶታፊ አቦማ ሁንዱማ \nኡመምቶተ ኬቲን ከን ታቴ ቤከማ\nፈይሳን ኬኛፊ ኤጋን ኬኘ ሱማ\n\nጃለሊ ኑፍ ቀብዱ ሀመነ ሂንጄደሙ\nከን ነሞታ ወጂን ወል ሂን መዳለሙ\nከንኬ ኦልአናዳ ኤሰቱ ሂንአርገሙ\n\nዮ ደደብኔ ኩፍኔ ሃርከ ኬን ኑ ካፍታ\nሂዳ ጩቡ ኬሣ ሁምነ ኬን ኑባፍታ\nገረ ጅሬኛቲስ ጃለላን ኑ ዋምታ\n\nኢጆሌኬ ታኔ አከ ሂንገርቦፍኔ\nአዱኛ ከናፊስ አከ ሂን ቢተምኔ\nያ ጎፍታ ኑኤጊ ሁምነኬ አብደኔ" },
			n15 = { "ጐቺ ጐፍታ ኬኛ ኑ ባየቴ ጂራ\nቶሉማ ኢሣ ሁንዳፍ ገለተ ገልቺና\n\nየሮ ረኮ ኬኛ ዲጲና ኑ ባሳ \nየካን ዮኩፍኔሌ ጃለላን ኑ ካሳ \nጩቡ ኬኘ ባዬ ጐንኩማ በሌሴ\nሞኧና ኑፍ ኬኔ ቢሊሰ ኑ ባሴ\n\nጂበ ኬኛ ዲሴ ኢኒ ኑ ጃለቴ\nበሌሱመ ኬኛን ቤለኤ ዴቦቴ\nሀሜኛ ነሞታ ሁንዱማ ኢሳ ኦብሴ\nኢጪቲ ጃለላ ኢሳ ፈኖዳን ሙሊሴ\n\nከአ ያ ነሞታ ገረ ኢሳቲ ዴቢና\nጩቡ ኢራ ፈጋኔ ሴረ ኢሳ ራወና\nኡፈተ ሰልጲና ኦፊራ ሙልቂኔ \nሀ ታኑ ቁልቁሉ ቀልቢ ጂጂረኔ" },
			n16 = { "ነሞታ ሀ ዴምኑ መነ ዋቀ ኬኛ\nበከ ኢቲ አርገኑ ነጋ ሉቡ ኬኛ\nጩቡ ኢራ ፈጋኔ ቆጶፍኔ ሀ ጂራኑ\nጄቸ ኢሳ ደጌኜ ቀልቢ ሃ ጂጅረኑ/፪/\n\nኑቲ ከነ አመኔ በከ ኢቲ ፉርፈኑ\nረኪነ ኬኛስ ኢዶ ኢት ሂመኑ\nገለተ ዋቀዮ ከን ኢት ገልፈኑ\nመነ ዋቀዮቲ ከን ጅራቱ ዮሚዩ \n\nፉልዱረ ከኩ ኢሣ ሶዳዳን ዳበነ\nአከ ሰበ እስራኤል ኢሊል ኢሊል ጄነ\nመነ ኢሳ ኬሰቲ ኢኒ ኑ ሃሚለቱ\nጄኔ ሃ ከደኑ ጐፍታን ኑ ሃ ፊለቱ\n\nኩፈኒ ከኡኒስ ሃመም ዮ ባየቴ\nመነ ኢሳ ጅራቹፍ ጎፍታን ኑ ፊለቴ\nቆርማተስ ደንዴኜ ጀባኔ ሃ ዳበኑ\nሞቱማ ዋቀዮ አብዲ ሃ ጎደኑ" },
			n17 = { "ኢሾ ጎፍታን ኑ ደለቴ ቆሪቺ ኬኛ\nኢፍኒ አዱኛ ደለቴራ ኢፍኒ አዱኛ ሁንዳ\n\nራጆኒ ራጀኒ ዋኤ ደሎተ ኢሳ\nዲንቂሲፈቹዳን ፎን ነማ ኡፈቹ ኢሳ\nቁልቁሎኒ ጎፋታ አብዲዳን ጅራተን\nከን አዳሚፍ  ገሌ ዋዳ ያደቹዳን\n\nአዳሚን ዴቢሱፍ ገረ ጅሬኛቲ\nአከ በዴ ሂንሃፍኔ ቢየ ለፊረቲ\nአንጎኢራ ገድቡኤ ጃለላፍ ቢተሜ \nደላ ኬሶ ጪሴ ሁጩዳን መረሜ\n\nየከ ኬኘ ኢላሌ ዋቅኒ ኑ ሂንዲስኔ\nቶኪቸ ኢልመ ኢሳ ደበርሴ ኑ ኬኔ\nጃለል ኢሳ ጉዳን ሃመነ ሂንጄደሙ\nጄቸ ኢልማን ነማን ሂመሜ ሂንዱሙ" },
			n18 = { "ዋቀዮን በርባዳ ኒ ፈይቱ/፪/ ኢሲን ሁንዱምቱ /፪/\nቆሪቺ አከ ኢሳ ሂንጅሩ ከን አከ ኢሳ ሂንጅሩ ኤሰዩ/፪/" },
			n19 = { "አናፍ ዋቀዮዳ አብዲን ሉቡ ኮቲ /፪/\nኢሰተን ሂመዳ የሮ ረኮ ኮቲ /፪/\nአብዲን ጂሬኘኮ ጀቤኚ ሉቡኮ /፪/\nዋቀዮ ጎፍታዳ ሁናዳ ቀቢሲኮ /፪/\nዋቀዮ ጎፍታንኮ አናፍ ኢፋኮዳ /፪/\nረኪነኮ ሁናዳን አናፍ አብዲኮዳ /፪/\nአብዲንኮ ሲሪቲ ያዋቀ ጎፍታኮ /፪/\nአቲ ነደቀቢ የሮ ጊዲራኮ /፪/\nማሪያም ሀደ ኢየሱስ አራረ ቀቤቲ /፪/\nነጋን ሲፍ ሀተኡ የሮ ሁንዱማቲ /፪/\nፈኖን ጎፍታ ኮቲ አናፍ ፈይሳዳ /፪/\nወረ ኢቲሂንአመኔ ገሩ ጎውማዳ /፪/\nአናፍ ዋቀዮዳ አብዲን ሉቡ ኮቲ /፪/\nኢሰተን ሂመዳ የሮ ረኮ ኮቲ /፪/" },
			n20 = { "ጃለሊ ዋቀዮ አናፍ ባየቴራ\nአንጐ ሙጩማሳ ቶላን ና ኬኔራ\nጃለለሣ ጉዳ ፈኖዳን ሙሊሴ\nኢኑምቲ ናዱኤ ዱኧራ ነባሴ \nሙጩማ ኮ ዲሴ ኢሰ ኢራ ፈጋናን \nአዱኛ ጃለዴ ሂዩማ ፊለናን\nጩቡዳፍ ቢተሙስ ነጂቢኔ ጐፍታን\nነ ዴቢሴ መሌ ነ ዋሜ ጃለላን\nነ ፈይሱፍ ጄዴ ባዬ ጊዲረሜ\nፊንጪሉኮ  ኦብሴ ኦፊቲ ነዋሜ\nቢታ ሴጣነራ ቢሊሰ ነባሴ\nኡፈተ ኡልፊና ነረቲ ዴቢሴ\nዱኧ ኢሣን ኡልፊነ ከን ነ ጐንፈቺሴፍ\nዱከና ነባሴ ከን ኢፈ ና ኬኔፍ\nአርጁማ ኢሳ ከናፍ ማለን ዲዬፈዳ\nኡማ ሰሚፍ ለፋ ነን ገለቴፈዳ" },
			n21 = { "ያ መነ ዋቀዮ ኡልፊነ ቀቤቲ\nኮቱ ኑ ኤቢሲ ማርያም ቁልቁሌቲ\nከራ በዲ ኢራ አቲ ኑ ዴቢሲ\nኢልመኬ ከደዱ ማሎ ኑ አራርሲ\nዱሜሰ ኤልያስ ከን ኢቲን አብደኔ\nቆሪቸ ናሆሚ ከን ኢቲን ፈይኔ\nሞቲን በረ በራ ከን ሂንጂጂረምኔ\nክርስቶስ ዋቀዮ ሲ ሀደ ኑፍ ኬኔ\nአርጆምኒ ቢሻኒ መቃኬን ኬነሜ\nሉቡ ዱኤ ወጂን ዬሙ መዳለሜ\nፈይናፍ ተኤራ ኑቲስ ከነ ቤክኔ\nኑ ደገኢ ጊፍቲ ዬሙ ሲ ዋመኔ\nኑ ወጂን ዳበዱ ያ ጊፍቲ ማርያሚ\nኢልመኬ ኑፍ ከዱ ጂሬኛፍ ኑ ዋሚ\nኑ ሆማ ኢንቀብኑ ሲጐደነ ሂርኮ \nአቲ ኑ ጀቤሲ ሃደ ጋፈ ረኮ" },
			n22 = { "ሉቡ ሲፍ አቦመሙ ዋቀዮ አቲ ኑ ኬኒ\nጉረ ቀልቢ ኬኛስ አቲ ኑ በኒ\nዱጋ ዳን ከደቴ ከን ሲ ደጌሲሱ\nየከ ኢራ ፈጋቴ ከን ሲ ገመቺሱ\nኑ ኬኒ ያ ጐፍታ ሉቡ ቁልቁላኤ\nዋን ጋሪ ሆጀቹፍ ከን ደፌ ቆባኤ\nጋሩማዳን ዴሙፍ አከ ጀቸኬቲ\nቤኛ ኑ ተኡ ኬ ሁበኔ ሲሪቲ\nኑቲ አከ ጂራኑፍ ሱገ ኬ አርገኔ\nኑ ገርጋሪ ጐፍታ የሮ ሲ ከደኔ\nገዳፊ ዲቢና ኑ ቢራ በሌሲ\nዴምሰ ኬኛ ሁንዳ አቲ ኑ ስሬሲ\nጃለለኬ ጉዳ  ጀቤኘ ጎደኔ\nገረኬ ሀዱፍኑ ጩቡራ ዴቢኔ\nአከ ኑረ ቡሉፍ ጃለሊ መነኬ\nዋቀዮ ኑ ኬኒ ሁበኖ ጄቸኬ\nሁምኒ ኬ ኦልአና ቢዮራ ኑ ካሴ\nኑ ሀቁልቁሌሱ ዲነ ኬኛ ጨብሴ" },
			n23 = { "ኡመመ ሁንዱመ ኢራ ቁልቁሉማ\nጄቻን ከን ሂን ሂመምኔ ኦላንቱማ\nዬሚስ ከን ሂን ደበሬ ዱብሩማ\nበሃ ቢፍቱዳ አቲ ኢፍቱ ከን ገነማ \nከን ታቴ አርገምቴ ቡርቂቱ ጅሬኛ\nነጌኛፍ ጃለላን ከን ጉተምቴ አቲ\nኤኙን ፈኬሰምታ ያ ገራ ላፌቲ\nኪታበ ጋሩማ ነጋ ሉቡ ኬኛ\nሃደ ሃደ ጫልቱ ማርያም ጊፍቲ ኬኛ\nአባቦ ኡርጐፍቱ ቢቂልቱ ጀነታ\nከራ ኬን ዲያኔ ኑቲ ገረ ጐፍታ\nኩን ሁንዱምቱ ከን ሲ ኬነሜ አቲ\nኡልፊነ ከን ቀብዱ ዋቀዮ  ቢረቲ\nአብዲ አዳም ታቴ ለፈ ከን ኢረቲ\nአራርሲቱን ኬኘ ማርያም ቁልቁሌቲ\nቁልቁሎተ ጫላ ቁልቁሉ ከን ታቴ\nሃደ ኢሣ አከ ታቱፍ ጐፍታን ሲፊለቴ\nኢፈ ኢፈ ጫልቱ ከራ ከን ጅሬኛ\nሲን ሆርዶፍኔ ገለ ገረ ቢየ ኬኛ" },
			n24 = { "ዱበርቶተ ኬሳ ከን ፊለምቴ ኬና ዋቀራ ከን አርገቴ/፪/\nገመዲ የሮ ሁንዱማ/፪/ያማርያሚ አብዲን ኮ ሱማ/፪/" },
			n25 = { "ማሉማን ማሊን ፈኬሲና ሀዳ ጎፍታ ኬኛ /፪/\nሀዳ ኬኛ ጊፍቲ ኬኛ ቁልቁሌቲ ኤዬ\nማርያሚን ማሊን ፈኬሰምቲ         /፪/" },
			n26 = { "ሉቡዳኒስ ፎኒኒስ አቲ ቁልቁሉዳ\nጎፍታን ሲፊለቴ አከ ታቱፍ ሃዳ  /፪/\nዱበርቶተ ኬሳ ጎፍታን ሲፊለቴ\nመነ ቡልቲ ኢሳ ቴሶ ሲጎደቴ\nነሞተ ፈይሱፍ ሲኢራ ደለቴ\nአብዲን አዳም ሲኢን ራወተሜ\nሰሚ ተኡ ኬቲን አዱን ነማፍ በሄ\nዱከነ በሌሴ አዱኛዳፍ ኢፌ\nአብዲ ኢጆሌ አዳም ማርያም ሃደ ጎፍታ\nኤኙ ሲንጄና ማሊን ፈኬሰምታ\nከን ሲከረተን ጎንኩማ ፌየኒ\nሲቲ ከን አመነን ጂሬኘ አርገተኒ\nያቁላቁሌቲ ኑፍ ከዱ ሲንጄና\nዋዳ ሲፍ ገሌን ዲፈመ ኑኬና" },
			n27 = { "ሲገለቴፈነ ዱብሮ ማርያሚ /፪/\nአብዲ ዋን ኑ ታቴፍ አከ ኩፍኔ ሂን ሀፍኔ /፬/ ኤዬ\nኡቱ ሰኚ ሲን ሃንቢሱ ባቴ /፪/\nኢቢዲ አከ ሰዶሚፍ ገሞራ ደለ ነማ ኛቴ /፬/ ኤዬ " },
			n28 = { "ያጊፍቲ ጀኔ ሃዋመኑ /፪/\nኢልመ ኢሼ ቢራ አራረ /፪/\nዋቅኒ ከን ከበጄ ኤኙቱ ሰልጲሳ\nዱበሮ ማርያሚ ከን ፊለቴ ኢሳ\nከን ሕዝቅኤል አርጌ በልበለ ጩፈምቴ\nሀገለቴፈኑ ጊፍቲ ፊለተምቴ\nዋቀዮ ኡማኒ ኢሼ ፊለቴራ\nአዱኛ ከናፊስ ሃደ ታሲሴራ\nመቃ ኢሼ ዋመኔ ዋቀዮ ሀከደኑ\nከራ ከኩ ኢሼ ዲፈመ አከ አርገኑ\nኑቲ ደደቦተ ሂንቀብኑ ደንዴቲ \nኩፍኔ አከ ሂንሃፍኔ ኑኮቱ ደፊቲ\nያሃደ ዋቀዮ ሂርኮ ኑፍ ተኢ አቲ\nዲፈመ ኑፍ ከዱ ኢልመኬ ቢራ አቲ" },
			n29 = { "ያጊፍቲ ኮ /፪/ ሚለዱ ገረኮ /፪/\nነጋን ኢልመኬ ነወጂን ሃተኡ /፬/ ኤዬ\nእግዚእትነ /፪/ ነጽሪ ኀቤነ /፪/\nሰላመ ወልድኪ የሃሎ ምስሌነ /፬/" },
			n30 = { "ኤርገማ ገብሬሊ ፉልዱረ ዋቀዮ/፪/ ዳበታ /፪/\nኢልማን ነሞታፊስ ዲፈማፍ ነጌኛ ከደታ /፬/" },
			n31 = { "ያገብሬሊ ኑ አራርሲ ዋቅዮዳኒ /፪/\nአከ ሂንበድኔ አከ ሂን ዱኔ ሉቡ ኬኛኒ\nአቲ ቁልቁሉ ኑዳበዱ ዱረ ኬኛኒ       /፪/" },
			n32 = { "አከ አናኒያ አከ አዛሪያ አከ ሚሳኤሊ ኑ ጀጀቤሲ /፪/\nኑ ጀጀቤሲ /፪/ አመንቲ ኬኛኒ ኑ ጀጀቤሲ /፪/" },
			n33 = { "አከ ሚካኤላ ኤርገማ አከ ገብርኤሊ /፪/\nነጋዳን ኑኮቱ ነጋዳን /፫/ ያማርያሚ ነጋዳን ኑኮቱ /፪/ ኤዬ/፫/" },
			n34 = { "ሩፋኤል ኤርገማዳ ኤርገማ ዋቀዮ /፪/\nኢጀ ጦቢት በኔ ኢፈ አርገቺሴ \nዋቀዮራ ኤርገሜ ጦቢያስ ዱኧራ ሃንቢሴ  /፪/" },
			n35 = { "አቦቲን  ቁልቁሉ አመንቲን ተአኒ\nገርጋርሰ ዋቀዮን ራጂ ሆጀተኒ\n\nአብርሃም በርባዴ ዋቀ ኢሳ አርገቴ\nቶኪቸ ኢልመ ኢሳ አርሳፍ ዲዬፈቴ\nዋቀዮ አመንቲ ኢሳ ፌዲ ኢሳ ሁበቴ\nበከ ሙጫ ኢሳ ሆላ ኢሳፍ ላቴ\n	ሙሴን አመንቲዳን ኡሌ ኢሳ ቀበቴ \n	ገላነ ኤርትራ በሊቸ አዳን ኩቴ\n	ኡመተ እስራኤሊፍ ራጂ ጉዳ ሆጀቴ\n	ኢሊሌፍ ገመቹን ዋቀ ዋቄፈቴ\nሰብኒ እስራኤሊ ዬሮ ዋቀ የኬ\nኤልያስ አመንቲን ቦካ ሰሚ ዶርኬ \nፉልዱረ ዲነ ኢሳ ጪሚናን ዳበቴ\nዋቀ አሳቲፊስ አርሳ ዲዬፈቴ\n	ጴጥሮስ መቃ ዋቃን ናፈ ለፋ ካሴ\n	ጳውሎስ ሁጩሳቲን ዲበማ ፈይሴ\n	ነሞትኒ ዋቀዮ አመንቲን ተአኒ\n	ጎፍታ ኢሳኒ ኢራ ዋን ባዬ አርገተኒ" },
			n36 = { "ገለኒ ዋቅዮፍ ሃተኡ ኢኒ ኑኡሜራ አከ ኢሰ\nገለኒ ማርያሚፍ ሃደ ጎፍታፍ ሃተኡ ኢሼን ጊፍቲ ኬኘ  \nአከሱመስ አብዲ ኬኘ ገለኒ ፈኖ ክርስቶሲፍ ሃተኡ\nከንኢቲን ፈይኔ ሁምነ ኬኘ አከሱመስ ሂርኮ ኬኘ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("1.	ያ አባ ኬኛ ")) {
				loadChild(n1);
			} else if (HoldItem.equals("2.	ገለተ ዋቀዮ (እግዚአብሔር ይመስገን)")) {
				loadChild(n2);
			} else if (HoldItem.equals("3.	ና ኬኒ ዋቀዮ")) {
				loadChild(n3);
			} else if (HoldItem.equals("4.	ጃለላን ሁንዳ ጎቴ")) {
				loadChild(n4);
			} else if (HoldItem.equals("5.	ዋቃዮ ኑ ደገኢ")) {
				loadChild(n5);
			} else if (HoldItem.equals("6.	ዱኧ ኬሳ ኑ ባፍቴ")) {
				loadChild(n6);
			} else if (HoldItem.equals("7.	ጀጀባዳ")) {
				loadChild(n7);
			} else if (HoldItem.equals("8.	ሎላ ፈኖሳቲን (ጥልን በመስቀሉ)")) {
				loadChild(n8);
			} else if (HoldItem.equals("9.	የሮ ኢሲን ዱፍተኒ")) {
				loadChild(n9);
			} else if (HoldItem.equals("10.	 ኢየሩሳሌም ገሉፍ")) {
				loadChild(n10);
			} else if (HoldItem.equals("11.	 ያዋቃዮ")) {
				loadChild(n11);
			} else if (HoldItem.equals("12.	 ገለተ ዋቀዮ")) {
				loadChild(n12);
			} else if (HoldItem.equals("13.	 ገለተ ኬ ያዋቀዮ")) {
				loadChild(n13);
			} else if (HoldItem.equals("14.	 ዋቀዮ ቁልቁሉ")) {
				loadChild(n14);
			} else if (HoldItem.equals("15.	 ጐቺ ጐፍታ")) {
				loadChild(n15);
			} else if (HoldItem.equals("16.	 መነ ዋቀዮ")) {
				loadChild(n16);
			} else if (HoldItem.equals("17.	 ኢሾ ጎፍታን ኑ ደለቴ")) {
				loadChild(n17);
			} else if (HoldItem.equals("18.	 ዋቀዮን በርባዳ")) {
				loadChild(n18);
			} else if (HoldItem.equals("19.	 አናፍ ዋቀዮዳ")) {
				loadChild(n19);
			} else if (HoldItem.equals("20.	 ጃለሊ ዋቀዮ")) {
				loadChild(n20);
			} else if (HoldItem.equals("21.	ያ መነ ዋቀዮ")) {
				loadChild(n21);
			} else if (HoldItem.equals("22.	 ሉቡ ሲፍ አቦመሙ")) {
				loadChild(n22);
			} else if (HoldItem.equals("23.	 ኡመመ ሁንዱመ ኢራ")) {
				loadChild(n23);
			} else if (HoldItem.equals("24.	 ዱበርቶተ ኬሳ (ከሴቶቹ ሁሉ)")) {
				loadChild(n24);
			} else if (HoldItem.equals("25.	 ማሉማ (በመኑ)")) {
				loadChild(n25);
			} else if (HoldItem.equals("26.	 ጎፍታን ሲፊለቴ")) {
				loadChild(n26);
			} else if (HoldItem.equals("27.	 ሲገለቴፈነ")) {
				loadChild(n27);
			} else if (HoldItem.equals("28.	 ያጊፍቲ ጀኔ ")) {
				loadChild(n28);
			} else if (HoldItem.equals("29.	 ያጊፍቲ ኮ ")) {
				loadChild(n29);
			} else if (HoldItem.equals("30.	 ኤርገማ ገብሬሊ")) {
				loadChild(n30);
			} else if (HoldItem.equals("31.	 ያገብሬሊ ኑ አራርሲ")) {
				loadChild(n31);
			} else if (HoldItem.equals("32.	 አከ አናኒያ (እንደ አናንያ)")) {
				loadChild(n32);
			} else if (HoldItem.equals("33.	አከ ሚካኤላ ኤርገማ")) {
				loadChild(n33);
			} else if (HoldItem.equals("34.	 ሩፋኤል ኤርገማ")) {
				loadChild(n34);
			} else if (HoldItem.equals("35.	 አቦቲን  ቁልቁሉ")) {
				loadChild(n35);
			} else if (HoldItem.equals("36.	 ገለኒ (ስብሐት)")) {
				loadChild(n36);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T413(this, ParentList,
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
		text.setText("የኦሮምኛ መዝሙራት");
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

	public class T413 extends BaseExpandableListAdapter {

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

		public T413(Activity context, List<String> Items,
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
