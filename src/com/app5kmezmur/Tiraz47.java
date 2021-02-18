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

public class Tiraz47 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("97.	ማርያም ጎየይኪ");
		ParentList.add("98.	አንቲ ኩሎ");
		ParentList.add("99.	ክበበ ጌራ ወርቅ");
		ParentList.add("100.	ብኪ ይትፌሥሑ");
		ParentList.add("101.	ማርያም ሥነ ተክለ ጽጌ");
		ParentList.add("102.	ውድስት አንቲ ");
		ParentList.add("103.	ድንግል በበረሃ ");
		ParentList.add("104.	ከማሃ ኀዘን");
		ParentList.add("105.	ኢየሐፍር ቀዊመ ");
		ParentList.add("106.	እሴብሕ ጸጋኪ ");
		ParentList.add("107.	አልቦ እንበለ ሰሎሜ");
		ParentList.add("108.	 አብርሂ");
		ParentList.add("109.	 ዮም ጸለሉ መላእክት");
		ParentList.add("110.	ወተመይጠት");
		ParentList.add("111.	ብርሃነ ሕይወት");

	}
	// Assign children list element using string array.

	String[] n97 = { "ማርያም ጎየይኪ እምገጸ ሄሮድስ /፪/\nለአርእዮ /፬/ ተአምረ ግፍዕኪ /፪/\n\n ትርጉም፡- ማርያም ሆይ የግፍሽን ተአምር \n         ለማሳየት ከሄሮድስ ፊት ሸሸሽ ፡፡" },
			n98 = { "አንቲ ኩሎ ታሰግዲ ሎቱ /፪/ \nኧኸ ክበበ ጌራ ወርቅ /፪/ አክሊለ ጽጌ /፬/\n\n ትርጉም ፡- የራስ ወርቅ የአበባ አክሊል ማርያም ሁሉን ለቅድስት ሥላሴ ታሰግጃለሽ፡፡" },
			n99 = { "ክበበ ጌራ ወርቅ ጽሩይ እምዕንቈ ባሕርይ /፪/\nዘየሐቱ /፭/ እምዕንቈ ባሕርይ /፪/ ኧኸ\n\n ትርጉም፡- የራስ ወርቅ አክሊል ጽሩይ የሆነ የሚያበራ ነው፡፡" },
			n100 = { "ብኪ ይትፌስሑ ዘገነተ ጽጌ ጻድቃን/፪/ /፪/\nዕለተ ብርሃን /፬/ ማርያም ዕለተ ብርሃን /፪/ ኧኸ\n\n   ትርጉም፡- የብርሃን ዕለት ማርያም ሆይ በገነት ያሉ ጻድቃን ባንቺ ይደሰታሉ፡፡" },
			n101 = { "ማርያም ሥነ ተክለ ጽጌ ኧኸ ሥነ ተክለ ጽጌ/፪/ \nከመ ጽጌረዳ /፫/ ድንግል ዘሰሎሞን አክሊል /፪/\n\n  ትርጉም፡- ማርያም የአበባ ተክል ነሽ ውበትሽም የጽጌረዳ ነው/እንደ ጽጌሬዳ/፤ የሰሎሞንም አክሊል ነሽ፡፡" },
			n102 = { "ውድስት አንቲ በአፈ ነቢያት ወስብሕት በሐዋርያት /፪/\nአክሊለ በረከቱ ለዮሐንስ ወትምክሕተ ቤቱ ለእስራኤል /፪/\n\nትርጉም፡- የዮሐንስ  አክሊለ በረከት የእስራኤል ቤት መመኪያው የሆነሽ እመቤታችን በነቢያት አንደበትና በሐዋርያት የተመሰገንሽ ነሽ፡፡" },
			n103 = { "ድንግል በበረሃ አምላክን ታቅፋ\nበረሃውን ስትዞር ስትወድቅ ስትነሣ/፪/\nልቧ በኃዘን ደምቶ እጅጉን እያነባች\nበረሃብ ጥማት ምድረ ግብፅን ዞረች/፪/\nየፀሐይ ሐሩር ከላይ ሲያቃጥላት \nልጄን ሊገሉት ነው እያለች ሲጨንቃት/፪/\nየአሸዋው ግለት እግሯን ሲልጠው\nደሟ እንደ ጎርፍ ወርዶ ምድሩን አቀላው/፪/\nድንግል ሆይ እናቴ ተስፋ መመኪያዬ\nአዛኝ የአምላክ እናት ጥላ ከለላዬ/፪/\nለክብር እንድበቃ ስደትሽን አስቤ \nጽድቅን አስተምሪኝ ድንግል እመቤቴ/፪/" },
			n104 = { "ከማሃ ኀዘን ወተሰዶ ሶበ በኩለሄ ረከቦ /፪/\nዐይነ ልብ/፪/ ዘቦ/፪/ ዐይነ ልብ ዘቦ ዐይነ ልብ ርእዮ ለይብኪ /፪/\n\n ትርጉም- እንደ እመቤታችን ኀዘንና ስደት የደረሰበትና ዐይነ ልቡና ያለው ሁሉ ችግሯን/መከራዋን/ አይቶ ያልቅስ/ያንባ/፡፡" },
			n105 = { "ኢየሐፍር ቀዊመ/፪/ ቅድመ ሥዕልኪ /፪/\nወርኀ ጽጌረዳ /፬/ አመሐልቀ ወርኀ ጽጌረዳ /፪/ ኧኸ/፫/\n\nትርጉም፡- ለምስጋናሽ የተሰየመው የአበባ ወቅት/ዘመነ ጽጌ/ ቢያልቅም በሥዕልሽ ፊት ቆሜ መጸለይ/ማመስገን/ አልተውም፡፡" },
			n106 = { "	እሴብሕ ጸጋኪ ኦ እግዝእትየ ማርያም\n	ዕፅ ልምልምት ወፍሬ ጥዕምት /፫/\n		ሐረገ ወይን /፫/ አንቲ ማርያም \n		አጸደ ወይን /፫/ አንቲ ማርያም\nትመስሊ ፊደለ ወትወልዲ ወንጌለ ወታገምሪ መስቀለ\n	  አዝ …\nትመስሊ ሰማየ ወትወልዲ ፀሐየ ወታገምሪ አዶናየ\n	  አዝ …\nትመስሊ መሶበ ወትወልዲ ኮከበ ወታጸግቢ ርኁበ\n	  አዝ …\nትመስሊ መቅደሰ ወትወልዲ ንጉሠ ወታገምሪ መንፈስ ቅዱሰ\n	  አዝ …\nትመስሊ ታቦተ ወትወልዲ ጽላተ ወታገምሪ መለኮተ\n	  አዝ …\nትመስሊ ደመና ወትወልዲ ጽላተ ወታገምሪ ጥዒና \n	  አዝ …\nትመስሊ ገራህት ወታፍርሂ ሰዊተ ወታጸድቂ ነፍሳተ\n       አዝ …\nትመስሊ ስኂነ ወትወልዲ መድኅነ ወትፌውሲ ድውያነ\n	  አዝ …\nትመስሊ ምሥራቀ ወትወልዲ መብረቀ ወታለብሲ ዕሩቀ\n	  አዝ …\nለአብ መርዓቱ ለወልድ ወላዲቱ ለመንፈስ ቅዱስ ጽርሐ ቤቱ\n	  አዝ …" },
			n107 = { "አልቦ እንበለ ሰሎሜ ዘያስተባርየኪ ለኪ /፪/\nወዮሴፍ አረጋዊ ዘይጸውር ስንቀኪ /፬/ ኧኸ\n\nትርጉም ፡- ከሰሎሜ ውጪ የሚያግዝሽ ከቅዱስ ዮሴፍም ውጪ ስንቅሽን የሚሸከምልሽ የለም፡፡" },
			n108 = { "አብርሂ /፪/ ኢየሩሳሌም /፪/\nበጽሐ ብርሃንኪ ኢየሩሳሌም እግዚአብሔር /፪/ ትርጉም፡- ኢየሩሳሌም ሆይ ብርሃንሽ እግዚአብሔር ስለደረሰ አሁን አብሪ፡፡ \n\nየሚዘመርበት ወቅት፡- ኅዳር ፮" },
			n109 = { "ዮም ጸለሉ መላእክት ላዕለ ማርያም ወላዕለ ወልዳ ክርስቶስ በደብረ ቁስቋም/፪/\nእንዘ ይብሉ ስብሐት ስብሐት በአርያም ስብሐት በአርያም /፪/\nትርጉም፡- መላእክት በደብረ ቁስቋም ምስጋና በአርያም ይሁን እያሉማርያምንና ልጇን ከበቡ፡፡\n     የሚዘመርበት ወቅት፡- ኅዳር ፮" },
			n110 = { "ወተመይጠት ማርያም ሀገረ እስራኤል አቡሃ /፪/\nነቢራ በግብጽ /፬/ አርብዓ ወክልኤተ አውራኀ /፪/\n\nትርጉም፡- ማርያም አርባ ሁለት ወራት በግብጽ ተቀምጣ ወደ አባቷ ሃገር ኢየሩሳሌም ተመለሰች፡፡\nየሚዘመርበት ወቅት፡- ኅዳር ፮" },
			n111 = { "ብርሃነ ሕይወት ዘኢይጸልም ኀደረ ደብረ ቁስቋም/፪/\nኃይል ወጽንዕ ዘእምአርያም /፬/ ኧኸ\n\n ትርጉም፡- የማይጠፋው የሕይወት ብርሃን የአርያም ኃይል ብርታት በደብረ ቁስቋም አደረ ።\n\n      የሚዘመርበት ወቅት፡- ኅዳር ፮" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("97.	ማርያም ጎየይኪ")) {
				loadChild(n97);
			} else if (HoldItem.equals("98.	አንቲ ኩሎ")) {
				loadChild(n98);
			} else if (HoldItem.equals("99.	ክበበ ጌራ ወርቅ")) {
				loadChild(n99);
			} else if (HoldItem.equals("100.	ብኪ ይትፌሥሑ")) {
				loadChild(n100);
			} else if (HoldItem.equals("101.	ማርያም ሥነ ተክለ ጽጌ")) {
				loadChild(n101);
			} else if (HoldItem.equals("102.	ውድስት አንቲ ")) {
				loadChild(n102);
			} else if (HoldItem.equals("103.	ድንግል በበረሃ ")) {
				loadChild(n103);
			} else if (HoldItem.equals("104.	ከማሃ ኀዘን")) {
				loadChild(n104);
			} else if (HoldItem.equals("105.	ኢየሐፍር ቀዊመ ")) {
				loadChild(n105);
			} else if (HoldItem.equals("106.	እሴብሕ ጸጋኪ ")) {
				loadChild(n106);
			} else if (HoldItem.equals("107.	አልቦ እንበለ ሰሎሜ")) {
				loadChild(n107);
			} else if (HoldItem.equals("108.	 አብርሂ")) {
				loadChild(n108);
			} else if (HoldItem.equals("109.	 ዮም ጸለሉ መላእክት")) {
				loadChild(n109);
			} else if (HoldItem.equals("110.	ወተመይጠት")) {
				loadChild(n110);
			} else if (HoldItem.equals("111.	ብርሃነ ሕይወት")) {
				loadChild(n111);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T47(this, ParentList,
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
		text.setText("መዝሙር ዘዘመነ ጽጌ");
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

	public class T47 extends BaseExpandableListAdapter {

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

		public T47(Activity context, List<String> Items,
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
						+ "/mez/Tiraz4/97.Mariyam Goyeyiki.mp3");
			} else if (childPosition == 0 && groupPosition == 1) {

				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/98.Anti Kulo.mp3");
			} else if (childPosition == 0 && groupPosition == 2) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/99.Kibebe Gera Werk.mp3");
			} else if (childPosition == 0 && groupPosition == 3) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/100.Biki Yitfesihu.mp3");
			} else if (childPosition == 0 && groupPosition == 4) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/101.Mariyam Sine Tekletsige.mp3");
			} else if (childPosition == 0 && groupPosition == 5) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/102.Wedist Anti.mp3");
			} else if (childPosition == 0 && groupPosition == 6) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/103.Dingil Bebereha.mp3");
			} else if (childPosition == 0 && groupPosition == 7) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/104.KeMaha Hazen.mp3");
			} else if (childPosition == 0 && groupPosition == 8) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/105.Iyehafer kewime.mp3");
			} else if (childPosition == 0 && groupPosition == 9) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/106.Esebeh tsegaki.mp3");
			} else if (childPosition == 0 && groupPosition == 10) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/107.Albo Enbele selome.mp3");
			} else if (childPosition == 0 && groupPosition == 11) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/108.Abirihi.mp3");
			} else if (childPosition == 0 && groupPosition == 12) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/109.Yom Tselelu.mp3");
			} else if (childPosition == 0 && groupPosition == 13) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/110.Wetemeytet.mp3");
			} else if (childPosition == 0 && groupPosition == 14) {
				mezmurPlay(Environment.getExternalStorageDirectory().getPath()
						+ "/mez/Tiraz4/111.Birhane Hiwot.mp3");
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