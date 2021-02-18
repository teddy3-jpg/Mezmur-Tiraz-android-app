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

public class Tiraz414 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("37.	 ደኡዋ የልዳሬ");
		ParentList.add("38.	 ዳሞታ ደሪያ ቃቲያ");
		ParentList.add("39.	ዎሳርኪ ማርያሜ");
		ParentList.add("40.	 ቦንቾ ሱታን ዎዚስ");
		ParentList.add("41.	 አማኑዋ ቶሳው");
		ParentList.add("42.	 ማርያም ቦንቾይ");
		ParentList.add("43.	 አዳማ ኔ ሜራን");
		ParentList.add("44.	 አሱንታ ሳቢቴ");
		ParentList.add("45.	 ጋናታ ማርያሜ");
		ParentList.add("46.	 ሚንቴታ ኑ ጎዳው");
		ParentList.add("47.	 ኑና ናጋናው");
		ParentList.add("48.	 ቀራኒዮ ጉታራን");

	}
	// Assign children list element using string array.

	String[] n37 = { "ኢሞታ ኩንቲዲ ጦሳይ ኢሚዶሬ\nጋብርኤልያ ምሽራቹዋ መቅደስያን ሲያሬ\nማጫሳ ኡባፔ ጦሳይ ዱማይ ዶሮሬ\nመረተታ ጎዳይ ነናን አቂዶሬ\n\nባይዳ ጣይዳ አዳሜ ዘረታው\nጡሙዳ ጫምዳ ሀሳአ ዴኡዋዉ\nሲኦሊያን ዴኢያጌታ ጋናቲያ ዛራናው\nደኡዋ የልዳሬ ኑ ሀይቁዋ ጣይሳናው\n\nዳዊቴ ባጋናራ ዕዝሪ ማሰንቁዋራ\nያሬዲ ሳባራ ኤፍሬሚ ጋላታራ\nአዋቲ ቄሴቲ ቢላሂ ሰዓታቲያራ\nኔና ጋላቶሶና ሳሉዋ ኪታንቻራ\n\nአግና ወታዳ አዋ አይፊያ ማያዳ\nሳሉዋ ሳአ ካዊያ ካላቻ ጎጣዳ\nጦሳይ አቆ ኬቲያ ኡሻቻን ኤቃዳ\nኔ ዴሪያው ወሳሳ ማራርኪ ያጋዳ" },
			n38 = { "ዳሞታ ደሪያ ቃቲያ ኔ ጦሳ ዎልቃራ\nአጆራፔ ኬሲይያ ጌሻ ሚካኤልያራ\nሳሉዋ ጦሳው ሺሽዮ ሳዊያ ኢጣናራ\nተክለሐይማኖቲያው ሃያ ኔ ማዱዋራ\n\nእሲ ጌዲያን ኤቃዳ ኔ ዎሲዶ ዎሳይ\nዴሪያው ዎሲሺኒ ሔሶሲያ አፑታይ\nሳሉዋ ጪማቱራ ኔ ያርሽዮ ጋላታይ\nሃቺካ ናጎ ኔ ኤኮ ማቻ ቃላይ\n\nኔ ወንጌሊያ ዛሬታይ ሳአን ኡባን ሞኪስ\nኔ ማስቃልያ ወልቃይ ቱና አያና ሻሪስ\nሳሉዋ ጦሊንቲያዳን ኔ ናቲ ጮራቲስ\nዱዴ ቆቄ ጉንዳይ ኔ ጣባላን ፓጢስ\n\nወንጌልያ ጣይሳናው ዎርዶይ ዱፑዋ ቦኪን\nግስትያ ላላንታናዉ ጡማን ዛርዱዋ ዘርን\nሀዳኑዋ ኦታናው ጪታን ጪታን ሽቂን\nሀኔናባ ጊዲስ ኔ ዎሳይ ሲየቲን" },
			n39 = { "ዎሳርኪ ማርያሜ ኔናአ ማታፔ /፪/\nወልቃማ ጎዳቱ ጎዳፔ /፪/\n\nሕዝቅኤላጋዳን ቱማ ማርካታና\nማርያማ ኑ አይያ ጌላኢዮ ያጋና\nጦሳ አዬ ቦላን ኔ ዶና ዶይያጎ\nአዬ አና ዶናይ ዱዳናጎ\n\nጌሻ መቅደሲያን ጌሻተታን ዴአሱ\nሳአጋ ጊደና ሳሉዋ ማና ማሱ\nሳሉዋፔ ዱቄታ ሳሉዋ ኡሻ ኡያሱ\nጋብርኤሊያ ሳሮታ አማኑዋን ኤካሱ\n\nታይሽሌ ዶያርኪ ኔ ኦይቆ ዎንጌሊያ\nአሺዲ ዮቲኮ ሳሉዋን ቦንቆይ ናጌስ\nማርካታና ኑኒ ጌሻ ማርያሚባ\nማጣፓ ዶይዲ ኑኢባ ዮታና" },
			n40 = { "ናጋራይ ባይናጌ ጦሳ ናአይ ጦሳይ\nናአንቶይ ባይናጌ ማርያሚ ናአይ ኢሶይ\nማታ ኤሳ ጎዳይ ጫሚያ ጭይያ ኡይስ\nባይዳ አዳማ ቦንቾ ሱታን ዎዚስ\n\nሳሎይ ሳአይ ያዬስ አባይ አዎ ኪተቴስ\nአግናይ አዋ አይፔ ኢጎዳን ዴኤስ\nአሱንታን ኑ ሞርኬ ጣላሄ ኮኮረስ\nአ ኢሱዋ ሱታይ ዴሪያው ኡባው ጊደስ\n\nደሪያፔ ካስያን ጦሊንቲያፔ ኮይሩዋን\nጡማይኔ ፖኦይኔ ሻኬቲ ኤረተናን\nሀታይ ጎጌናን አዳሜ ሜረተናን\nጦሳ ናአይ ዴኤስ ሜሪና አራታን\n\nአዳሜ ባላ ባርቼ ሳሉዋፔ ጤሶጌ\nአሳናቱ ሲቆይ ሳሉዋፔ ኤሆጌ\nኢሞታይ ኩሚዶ ማርያሚፔ ዬሌታጌ\nፕርዳናው ኢ ያና ኑ ጊሻዉ ሃይቃጌ\n\nአ ቦንቹ ሱታይ ጉኮ ማስቃሊያ ዬራና\nአቶሆይ ኤቂዶሳን መቅደሲያን ጎይናና\nአቃላይ ጣፔቶ ታቦታ ቦንቻና" },
			n41 = { "አዋይ ናአይ ጢሎ አያናይ ቶኮ አማኑዋ ቶሳው /፪/\nኑና አማኑዋኒ ሚንታ ጌሻ ተክለ ሐይማኖቲያዉ /፪/" },
			n42 = { "ማርያም ቦንቾይ ዳሬሲ መሬታ ኡባፔ /፪/\nባና መዳ ጦሳ /፫/ ጎዳ የሎ ጊሻው /፪/ ሐሹ" },
			n43 = { "አዳማ ኔ ሜራን መዳጎ ሙሴ አሮና ጦሳው /፪/\nኑ ናጋራ አቶጋ ኑ ዎሳኮ ጤላ /፪/" },
			n44 = { "አሱንታ ሳቢቴ /፪/ ጋላታ ሺሺቴ አ ጎዳቴታው /፪/\nጌሻ ዎልቃማ ጦሳ /፪/ ኔዎ ኦሶይ ማላሌስ ጊቴ /፪/" },
			n45 = { "ታማኔ ናኡ ላይታ መቅደሲያን ዴአሬ\nኪታንቻ ፋኑኤሊያን ሳሉዋ ማና ማሬ\nመሬታ ኡባፔ ጌሻ ጊዲዳሬ\nጋናታ ማርያሜ ጦሳን ዶሬታሬ\n\nጋብርኤሌ ኪታንቻይ ቦንቹዋን ሳሮ ጎሬ\nዎዛናፔ ጤጊዮዴ ሶሁዋራ ጋኪያሬ\nኔና ጤጊያ ኡባ ሳሉዋን ማርሲያሬ\nጋናታ ማርያሜ ሂዶታው ዎቶሬ\n\nፖኡዋ ማይዳሬ ጎዳ ዬሊዳሬ\nአዋፔ ፖኢያሬ ዎርቃ ጉሎታሬ\nአጊና የዳዳ ፖኡዋን ዶዴታሬ\nጋናታ ማርያሜ መሬታይ ጬቂዮሬ\n\nግብጼ ባዙዋን ዋይያ ኬሂ ቤኢዳሬ\nሳሙዋኔ ናሚሳን ዳሮ ዋዬታሬ\nኑኒ  ዎሲዮ ዎሳ ኔ ናኦኮ ጋቲያሬ\nጋናታ ማርያሜ ጦሳ የሊዳሬ\n\nኪታንቻቹ ሚቼ ጌሻቱ ጎዳቴ\nያዕቆባዮ ጋዬ እዚራሲ ማሲንቄ\nአሮና ጋቲሜ አብርሐሜ ድንኳኔ \nጋናታ ማርያሜ አዳሜ ሂዶቴ" },
			n46 = { "ሚንቴታ ኑ ጎዳው ኔ ናራ ኑ ዳናው\nኔ ዎልቃን ጊጢዲ ፖሉዋው ባጤታናው\nጋኪያ ሜቱዋን ኡባን ሚኒዲ ኤቃናው\nውርሴታይ ጋካናው ኔናን ኑ ጌንጫናው\n\nኢታ ላይታ ጊዶን ኔ ናቱራ ዲያጎ\nጣላሂያ ቃቻዳ ሲኦሊያን ዎታጎ\nኔ ናቱ ዩሹዋኒ ኪታንቻ ኤሳጎ\nጡቤ ጡቤናዳን ኑና ናጊሲያጎ\n\nኔ ናታ ሞርኪያሲ አታ ኢማባካ\nኩንዲዲ ዴኢዮ ዎዴ ኦላ አጋባካ\nኑኒ ዎሲዮ ዎሳ ጦሳው ኔ ኤዝጋሳ\nኔ ሲንታን ኩንዲዳ ኑና ኔ ጦኒሳ\n\nሐና አማኑዋኒ ባሜቱዋ ዮቲን\nጋርሳ ዎዛናን ሚሽታ ዬኪን\nሄ ጎጊያ አፑታ ሶሁዋን ቁጫዳሳ\nማይኒዳ ኡሉዋፔ ሳሙኤላ ኢማዳሳ\n\nዎሲዶ ዎሳሲ ዛሩዋ ዛሪያይ ኔና\nሺቂዶባ ኡባ ጋታ በሲያይ ኔና\nአማኑዋን ጤሲኮ ኔኒ ማታን ዳሳ\nሚንቲ ዎሲያ ጌቱስ ሶሁዋራ ጋካሳ" },
			n47 = { "ኑና ናጋናው ማታይ ኢመቶጌታ\nኑ ጦሳ ሲንታኒ ማሮታው ኤቂያጌታ\nጦሳይ ቦንቾጌታ ኑኒካ ቦንቻና\nኪታንቻቱ ማዱዋ ጉታራን ዮታና\n\nጣላሂያ ኦሊዳ ጌሻ ሚካኤሊያ ዱዋ\nምሽራቹዋ ሲስያጋ ጌሻ ጋብርኤሊያ ዱዋ\nሳሉዋ ማና ሚዚያ ጌሻ ፋኑኤሊያ ዱዋ\nኪታንቻታ ኪተስ ኤቃናው ኑ ዩሹዋን\n\nሜቶቲዲ ጤሲን ኤሱዋን ጋኮሶና\nኑ ሜቱዋ ኑ ማላ ቱሁዋ ቢርሾሶና\nጌሻ ኪታንቻቲ ኑና ማዶሶና\nአሲንታን ኤቂዲ ኑዮ ዎሶሶና\n\nጦሳ ጌሻ ሱንታይ ኤታ ቄፊያን ዴኤስ\nኤታ ቦንችያይ ኡባይ ሳሉዋ ጦሳ ቦንቼስ\nጦሳ ኪታንቻቲ ኑ ዩሹዋን ኤቆሶና\nኡንኤቲያ ሞርኪያፔ ኑና አሾሶና" },
			n48 = { "ግብፄ ባዙዋ ሱሉዋን ኔና ጋካ ሜቶይ\nቀራኒዮ ጉታራን ኔ ዬኮ አፉታይ\nኢስናይ ካቄቲን ኔ ጎማፓ ማ ታማይ\nኡባውካ ቆፌቶ ሜቱዋ በኢዳ ሻያይ\n\nኩንዲዲ ዴንዲዲ ኢ ባርቺያ ቤኢዮዴ\nአይሁዴ አሳቲ ኔናአ ካቂዮዴ\nማስቃልያን ጣጱዋን ኔ ኤቃ የኪዮዴ\nኢስናይ ቃሬታይ ኢ ኔና ዋቲዴ\n\nአኮ ቦንጎታዳ አፉታ ሶሲሽን\nአይኦቲን ካቂዶ ታናው ያጊሽን\nዮሐኒሳ ጤጊስ ባአዮ ዎይቲ ኢሚስ\nባአዬኮ ሲሚዲ ኔናአ ኤካ ጊስ\n\nጦሳ ሂራጋ ቃላይ ባዎዲያን ፖሌታና\nሃቺ ቶቺያ ኡባይ ኔ ጌዲያን ኩንዳና\nኔዮ ሃሬቴና ካዎቴታይ ጣያና\nዬሌታ ኡባይ ጽዮኔ ያጋና" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("37.	 ደኡዋ የልዳሬ")) {
				loadChild(n37);
			} else if (HoldItem.equals("38.	 ዳሞታ ደሪያ ቃቲያ")) {
				loadChild(n38);
			} else if (HoldItem.equals("39.	ዎሳርኪ ማርያሜ")) {
				loadChild(n39);
			} else if (HoldItem.equals("40.	 ቦንቾ ሱታን ዎዚስ")) {
				loadChild(n40);
			} else if (HoldItem.equals("41.	 አማኑዋ ቶሳው")) {
				loadChild(n41);
			} else if (HoldItem.equals("42.	 ማርያም ቦንቾይ")) {
				loadChild(n42);
			} else if (HoldItem.equals("43.	 አዳማ ኔ ሜራን")) {
				loadChild(n43);
			} else if (HoldItem.equals("44.	 አሱንታ ሳቢቴ")) {
				loadChild(n44);
			} else if (HoldItem.equals("45.	 ጋናታ ማርያሜ")) {
				loadChild(n45);
			} else if (HoldItem.equals("46.	 ሚንቴታ ኑ ጎዳው")) {
				loadChild(n46);
			} else if (HoldItem.equals("47.	 ኑና ናጋናው")) {
				loadChild(n47);
			} else if (HoldItem.equals("48.	 ቀራኒዮ ጉታራን")) {
				loadChild(n48);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T414(this, ParentList,
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
		text.setText("የወላይትኛ መዝሙራት");
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

	public class T414 extends BaseExpandableListAdapter {

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

		public T414(Activity context, List<String> Items,
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