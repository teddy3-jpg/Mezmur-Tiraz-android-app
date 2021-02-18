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

public class Tiraz29 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("107.	ሚካኤል ብሂል");
		ParentList.add("108.	ውእቱ ሚካኤል ");
		ParentList.add("109.	አንስዕ ኃይለከ ");
		ParentList.add("110.	ሚካኤል");
		ParentList.add("111.	ሚካኤል ሐመልማለ ወርቅ ");
		ParentList.add("112.	ሠለስቱ ደቂቅን ");
		ParentList.add("113.	እም እቶነ እሳት");
		ParentList.add("114.	ንቁም በበህላዌነ");
		ParentList.add("115.	ከመትባርከነ");
		ParentList.add("116.	ስዩም በዲበ ኃይላት");
		ParentList.add("117.	ብቃት ስለሌለህ");

	}
	// Assign children list element using string array.

	String[] n107 = { "ሚካኤል ብሂል እፁብ ነገር\nገብርኤል ብሂል ወልደ እግዚአብሔር /2/\nበዲበ ርእሱኒ /5/ አክሊለ ትዕምርተ መስቀል \n\nትርጉም፦ ሚካኤል ማለት እፁብ ነገር ማለት ነው። ገብርኤል ማለትም የእግዚአብሔር ልጅ ማለት ነው። በራሱም ላይ የመስቀል ምልክት ያለው አክሊል ተቀዳጅቷል።  " },
			n108 = { "ውእቱ ሚካኤል  ውእቱ መልአከ ኃይል    \nልዑል ውእቱ ልዑለ መንበር /2/ \n\nይስአል ለነ ይስአል ለኢትዮጵያረዳኤ ይኩና አመ ምንዳቤ	  /2/\n\nትርጉም፦ የሰላም መልአክ ኃይልን የሚያደርግ መልአክ ሚካኤል መንበሩ ልዑል ነው። ለእኛ ይለምንልን። ሊኢትዮጵያም ይለምንላይ። በመከራም ጊዜም ረዳት ይሁናት። " },
			n109 = { "አንስዕ ኃይለከ ወንአ አድኅነነ  /2/\nሚካኤል  ርድአነ /2/ \nሚካኤል /2/በጸሎትከ ተማኅፀነ    /2/\nኃይልህን አንሳ መጥተህ አድነን  /2/\nሚካኤል ተራዳን  \nሚካኤል በጸሎትህ ለምንልን   /2/" },
			n110 = { "ሚካኤል እመላእክት መኑ ከማከ ልዑል/2/\n	አስተምሕር ለነ ሰአልናከ \n	በአሠርቱ ወአርብዕቱ ትንብልናከ  /2/\nአዝ..................\n	ዐይኑ ዘርግብ ልብሱ ዘመብረቅ \n	ሐመልማለ ወርቅ	   /2/\nአዝ..................\n	ይሰግድ በብረኪሁ እስክ \n	ይመጽዕ ሥርየት ለኀጥአን \n\nሚካኤል እመላእክት መኑ ከማከ ክቡር\nሚካኤል እመላእክት መኑ ከማከ ልዑል\n	መኑ ከማከ ክቡር መኑ ከማከ ልዑል/2/\n\nሚካኤል ከመላእክት እንዳንተ ያለ ማን ነው የአምላክ ባለሟል/2/\n	ለምንልን/2/ ለመንህ\n	በአሥራ አርቱ የጸሎት ሥርዓትህ    /2/\nአዝ..................\n	ዐይኑ የርግብ ነው ልብሱ የወርቅ ሐመመልማል\n	ልብሱ የመብረቅ ነው  /2/\nአዝ..................\n	ይሰግዳል በጉልበቶቹ ለኃጥአን \n	እስኪሰጥ የአምላክ ሥርየቱ  /2/\nሚካኤል ከመላእክት እንዳንተ ያለ ማን ነው የአምላክ ባለሟል/2/\n	እንዳንተ ያለ ማን አለ /2/" },
			n111 = { "ሚካኤል ሐመልማለ ወርቅ /2/ ልብሱ ዘመብረቅ\n	ሚካኤል  ሐመልማለወርቅ የወርቅ ልምላሜ \n	የወርቅ ልምላሜ ና ና ና ስለምንህ ቆሜ	\nአዝ . . . ሚካኤል \nገብርኤል ሊቀመላእክት  /2/ \nሠለስቱ ደቂቅን ያውጣህ ከእሳት \n	በሠለስቱ ደቂቅ ናቡከደነፆር ተቆጣ 	\n	እሳቱ ነደደ ነበልባሉ ወጣ\n	ግን ኃያል ገብርኤል ሊያድናቸው መጣ \nአዝ . . . ገብርኤል \n	 ሠለስቱ ደቂቅ ይባርክዎ ለእግዚአብሔር \n	ስቡሕኒ ውእቱ ወልዑልኒ ውእቱ ብለው\n	ምስጋና አቀረቡ ከእሳቱ ላይ ሆነው\nአዝ . . . ገብርኤል \nራጉኤል ሊቀመላእክት/2/ \nእምሀበ ላዕል ወረደ /2/\n	መጋቤ ብርሃናት አንሶሳዌ ፋና\n	ራጉኤል ና ና  \n	ና ና ና አማላጅ ነህና\nአዝ . . .  ራጉኤል \n\nኡራኤል ሊቀመላእክት /2/\nለዕዝራ ያጠጣህ ጽዋአ ሕይወት \n	በዓለም ፈተና በስቃይ ኩነኔ\n	ስባዝን ስጨነቅ ስጠበብ ወይ እኔ \n	ኡራኤል የእኔ ኃያል ቁምልኝ ከጎኔ\nአዝ . . . ኡራኤል" },
			n112 = { "ሠለስቱ ደቂቅን ያወጣህ ከእሳት /2/ \nእኛንም አድነን/2/ሊቀ መላእክት\nእኛንም አድነን/2/ገብርኤል ሊቀ መላእክት \n\nቂሪቆስ እየሉጣን ያውጣህ ከእሳት/2/\nእኛንም አድነን /2/ሊቀመላእክት \nእኛንም አድነን /2/ ገብርኤል  ሊቀመላእክት\n\nሠለስቱ ደቂቅን ያወጣህ ከእሳት /2/ \nእኛንም አድነን/2/ሊቀ መላእክት\nእኛንም አድነን/2/ገብርኤል ሊቀ መላእክት " },
			n113 = { "እም እቶነ እሳት/2/ዘይነድድ\nአንገፈነ  በሰፊሐ እድ ሊቀ መላእክት/2/  አዝ\n	ታላቅ መመኪያ ነህ ሁሉ\n	ናዛዜ ኅዙናን/2/ገብርኤል ለልዑል መልአከ ኃይሉ\nየነበልባል ኃይሉ ሞገዱ ሲበዛ\nለሠለስቱ ደቂቅ የሆንካቸው ቤዛ\n	አዝ .... (ታላቅ መመኪያ ነህ)\nፈጥነህ የምትደርስ በዕለተ ጽሕቅ \nምስጉን ነህ አንተ ከፍ ያልክ በጽድቅ\n	አዝ ....(ታላቅ መመኪያ ነህ) \nዜናዊ ፍስሐ ለሰው ልጅ ድህነት\nየሰላም መልአክ ነህ ሊቀ መላእክት\n	አዝ .... (ታላቅ መመኪያ ነህ)\nበአማላጅነትህ እንኮራለን\nእኛ ክርስቲያኖች ደቂቀ ጽዮን\n	አዝ .... (ታላቅ መመኪያ ነህ)\n\nየግእዙ ትርጉም:-ከሚነደው እሳት ነበልባል   የመላእክት አለቃ እጆቹን ዘርግቶ አተረፈን\n\nበዕለተ ጻሕቅ:- በጭንቅ ቀን " },
			n114 = { "ንቁም በበህላዌነ /2/ \nለአምላከነ /2/\nእስከ ንረክቦ ለአምላከነ/2/  ኧኸ . . . አዝ   \n	ጌታችንን እስክናውቀው በልዕልና   \n	ባለንበት እንጽና\nአዝ . . .\n	ይህን ብለህ መላእክትን እንዳረጋጋህ\n	ቅዱስ ግብርኤል አጽናን በምልጃህ \nአዝ . . .\n	አጠንክረን በሃይማኖት በምግባርም\n	ከክህደት ጥርጥር አውጣን\nአዝ . . .\n	ቁሙ በለን በሃይማኖት ለዘወትር\n	እንድንበቃ ለክብር \nአዝ . . .\n	ቅዱስ ገብርኤል አረጋጊ አጽናኝ መልአክ\n	መላእክትን በሰማያት እንጽና ያልክ\n	ከሃይማኖት ልንወጣ ስንባዝን \n	ና እና ባርከን ቅዱስ ገብርኤል ሆይ አጽናን\nአዝ . . . " },
			n115 = { "ከም ትባርከነ በመስቀልከ ዘወርቅ/2/ \nተዋነይ በጽድቅ /4/ ገብርኤል  ሐመልማለወርቅ/2/\n\nትርጉም፦ በክቡር መስቀልህ ትባርከን ዘንድ ገብርኤል ሆይ በ እውነት በርድኤት ተመላለስ።  " },
			n116 = { "ስዩም በዲበ ኃይላት ሩፋኤል ሊቀ መላእክት/2/ \nበዲበ ኃይላት/4/ሩፋኤል ሊቀ መላእክት /2/\n\nትርጉም፦ በኃያላን መላእክት ላይ የተሾመ የመላእክት አለቃ   ሩፋኤል ነው። " },
			n117 = { "ብቃት ስለሌለህ ባትችል ልታያቸው \nብቻህን የተጣልክ ሰዎች ቢመስላቸው\nከአንተም ጋራ ያሉት እጅግ የበዙ ናቸው \n	ድካም ብቸኘት የሶርያ ጭፍራ\n	ችግር ሰይፉን መዞ ከቦ ሲያስፈራራ\n	አለቀልኝ ብለህ ልቤ ሆይ አትፍራ\n	ቅዱሳን መላእክት አሉ ከአንተ ጋራ\nአዝ . . .\n	ተሰደህ ብትሄድ በባቢሎን ማዶ \n	ኑሮህ እሬት ሲህን ማዕረግህ ተዋርዶ \n	በዕንባ ብትዋጥም ጽዮንን እያሰብህ \n	በዙሪያህ ሰፍረዋል መላእክት ሊያጽናኑህ\nአዝ . . .\n	ዓለም ኢያሪኮ ሰባት ኝብ አጥራ  \n	ኃጢአት ስታደባ ቀስቶቿን ወጥራ\n	የተሸነፍክና ያለቀ ሲመስልህ \n	የእግዚአብሔር ሰራዊት በዙሪያህ አሉልህ \nአዝ . . ." };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("107.	ሚካኤል ብሂል")) {
				loadChild(n107);
			} else if (HoldItem.equals("108.	ውእቱ ሚካኤል ")) {
				loadChild(n108);
			} else if (HoldItem.equals("109.	አንስዕ ኃይለከ ")) {
				loadChild(n109);
			} else if (HoldItem.equals("110.	ሚካኤል")) {
				loadChild(n110);
			} else if (HoldItem.equals("111.	ሚካኤል ሐመልማለ ወርቅ ")) {
				loadChild(n111);
			} else if (HoldItem.equals("112.	ሠለስቱ ደቂቅን ")) {
				loadChild(n112);
			} else if (HoldItem.equals("113.	እም እቶነ እሳት")) {
				loadChild(n113);
			} else if (HoldItem.equals("114.	ንቁም በበህላዌነ")) {
				loadChild(n114);
			} else if (HoldItem.equals("115.	ከመትባርከነ")) {
				loadChild(n115);
			} else if (HoldItem.equals("116.	ስዩም በዲበ ኃይላት")) {
				loadChild(n116);
			} else if (HoldItem.equals("117.	ብቃት ስለሌለህ")) {
				loadChild(n117);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T29(this, ParentList,
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
		text.setText("በእንተ ቅዱሳን መላእክት");
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

	public class T29 extends BaseExpandableListAdapter {

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

		public T29(Activity context, List<String> Items,
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
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 1) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 2) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 3) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 4) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 5) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 6) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 7) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 8) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 9) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 10) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
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