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

public class Tiraz212 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("141.	መስቀልከ");
		ParentList.add("142.	በመስቀልከ ርድአነ");
		ParentList.add("143.	መድኃኒት");
		ParentList.add("144.	የቅዱሳን በዓት ");
		ParentList.add("145.	ተቀደሲ");
		ParentList.add("146.	እምርኁቅሰ");
		ParentList.add("147.	አይ ይእቲ");
		ParentList.add("148.	አመ ትትሐነጽ");
		ParentList.add("149.	ቤተ ክርስቲያን አሐቲ");
		ParentList.add("150.	ዓውደ ዓመት መጽአ");
		ParentList.add("151.	ዓውደ ዓመት ለባርኮ");
		ParentList.add("152.	አመ ከም ዮም");
		ParentList.add("153.	ያብጽሐነ ");
		ParentList.add("154.	ርዕሰ ዓውደ ዓመት");

	}
	// Assign children list element using string array.

	String[] n141 = { "መስቀልከ ኧኸ ዕፀ መድኃኒት/2/\nዕፀ መድኃኒት  /4/ መስቀልከ /2/\n\nትርጉም፦ መስቀልህ  የድኅነት ተክል ነው። " },
			n142 = { "በመስቀልከ ርድአነ/፪/\nወበኃይልከ ተማህፀነ/፬/\n\nትርጉም፦ በመስቀልህ እርዳን በኃይልህም ጠብቀን።" },
			n143 = { "መድኃኒት ዕፀ ሕይወት /2/\nዝንቱ ውእቱ መስቀል ኧኸ /2/\n\nትርጉም፦ መድኃኒት የሕይወት ተክል ይህ መስቀል ነው ። " },
			n144 = { "	ልቡናን የሚመስጥ መዓዛ እጣኗ \n	ሕሊናን ይገዛል ዝማሬ ድጓዋ \nየቅዱሳን በዓት የጸሎት ዋሻቸው \nቤተክርስቲያን ናት አምባ መጠጊያቸው \n	የመላእክት ዜማ የአዕውፋት ዝማሬ  \n	የሚለቀምባት የትሩፋት ፍሬ\nአዝ . . .\n	ይዘምሩባታል በአንድነት ተባብረው \n	የሌዋዊው በትር ጸናጽል ከበሮው \nአዝ . . .\n	ወራዳዋን ዓለም የናቋት በቅድሚያ\n	የእምነት አርበኞች ያገኟት በቅድሚያ \nአዝ . . .\n	የገድላቸው ተዓምር መንቦግቦጊያ መቅረዝ \n	የሰማዕታት አክሊል የሥራቸው ደመወዝ  \nአዝ . . .\n	መውደቂያዬ ይሁን ከመቃብራቸው \n	ይፈውሳልና ተረፈ አጽማቸው \nአዝ . . .\n	ከኃጥአን ድንኳን መውጣቴ ነው ዛሬ\n	የቅዱሳን በዓት ልትሆኝ ሀገሬ \nአዝ . . ." },
			n145 = { "ተቀደሲ ወንሥኢ ኃይለ ኦ ቤተ እግዚአብሔር /2/\nእስመ ናሁ ንጉሥኪ በጽሐ እግዚአብሔር/2/\n\nትርጉም፦ የእግዚአብሔር ቤት ሆይ ክበሩ ከፍም በይ ኃይልንም ንሺ። የሚያበራልሽ ንጉሥሽ እግዚአብሔር እነሆ መጥቷልና።" },
			n146 = { "እምርኁቅሰ ርእይዋ ወተአምኅዋ ወአእመሩ ከመ ሀገሮሙ ይእቲ/2/\nገነትይ ይእቲ ነቅዓ ገነት አዘቅት ማየ ሕይወት ማኅደር ለንጹሐን /2/\n\nከሩቅ ሆነው አይዋት ተሳለሟት ሃገራችውም እንደሆነች አወቁ /2/\nገነት ናት ነቅዓ ገነት የሕይወት ምንጭ የንጹሐ ን ማደሪያ /2/" },
			n147 = { "አይ ይእቲ ዛቲ እንተ ታስተርኢ  \nእምርኁቅ ከመ ማሕቶት ደብረ ገነት /2/\nሙሴኒ ርእያ ሀገር ቅድስት\nዕዝራ ተናገራ  /3/ዘመራ ዳዊት /2/\n\nትርጉም፦ያቺ እንደመብራት ከሩቅ የምትታይ የገነት ተራራ ሙሴ ያያት ዕዝራም ትንቢት ይተነገረላት ዳዊትም የዘመረላት እንዴት ያለች ድንቅ ናት። " },
			n148 = { "አመ ትትሐነጽ ኢየሩሳሌም በዕንቈ ሰንፔር ወበከርከዴን በዕንቈ ሰንፔር/2/\nዓረፋቲሃ ለኢየሩሳሌም  ወማኅፈዲሃኒ በወርቅ ልቡጥ ወመርህባሰ ለኢየሩሳሌም  \n/2/\n\nትርጉም፦ ኢየሩሳሌም(ቤተ ክርስቲያን ፣ መንግስተ ሰማያት ) በዕንቈ ፣ በከርከዴንና በሰንፔር በታነጸች   ጊዜ ግድግዳዎቿና አጥሮቿ በወርቅ የተለበጡ “†¨<::" },
			n149 = { "ቤተ ክርስቲያን አሐቲ አንቀጸ አድኅን ይእቲ ደብረ ምሕረት  /2/ትግሁ ባቲ  /2/ ሕዝበ ክርስቲያን ኧኸ እንበለ አጽርዖ/2/ \n\nትርጉም፦ ቤተክርስቲያን አንዲት ናት። የድህነት በርም ናት። የክርስቲያን ወገኖች   ያለመታጎል (ያለማቋረጥ) ትጉባት አገልግሉባት ።" },
			n150 = { "ዓውደ ዓመት መጽአ /2/\nይእዜሰ ዮሐንስ ተፈሥሐ /2/ ኧኸ\n\nትርጉም፦  ዓውደ ዓመት መጣ። እንግዲህስ ዮሐንስ  ደስ ይበልህ::" },
			n151 = { "ዓውደ ዓመት ለባርኮ ባርኮ ዓውደ ዓመት  /2/\nንዓ ማርያም ለምሕረት ወሣህል  /2/ ኧኸ\n\nትርጉም፦ዓውደ ዓመትን ለመባረክ   ማርያም ሆይ ለምሕረትና  ለይቅርታ ነይ።" },
			n152 = { "አመ ከም ዮም /6/ \nያብጽሐነ  /3/ አመ ከመ ዮም  ኧኸ /2/\n\nትርጉም፦ እንደዛሬው ለከርሞ ያድርሰን።" },
			n153 = { "ያብጽሐነ  አመ ከመ ዮም /2/\nአመ ከመ ዮም /2/ ያብጽሐነ  /2/\n\nትርጉም፦  እንደዛሬው ለከርሞ ያድርሰን።" },
			n154 = { "ርዕሰ ዓውደ ዓመት ዮሐንስ ወላዴ መጥቅዕ /2/\nወአበቅቴ/5/ ወላዴ መጥቅዕ/2/\n\nትርጉም፦ አበቅቴን እና መጥቅዕን የሚያስገኝ የዓውደ ዓመት ራስ ዮሐንስ ነው::" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("141.	መስቀልከ")) {
				loadChild(n141);
			} else if (HoldItem.equals("142.	በመስቀልከ ርድአነ")) {
				loadChild(n142);
			} else if (HoldItem.equals("143.	መድኃኒት")) {
				loadChild(n143);
			} else if (HoldItem.equals("144.	የቅዱሳን በዓት ")) {
				loadChild(n144);
			} else if (HoldItem.equals("145.	ተቀደሲ")) {
				loadChild(n145);
			} else if (HoldItem.equals("146.	እምርኁቅሰ")) {
				loadChild(n146);
			} else if (HoldItem.equals("147.	አይ ይእቲ")) {
				loadChild(n147);
			} else if (HoldItem.equals("148.	አመ ትትሐነጽ")) {
				loadChild(n148);
			} else if (HoldItem.equals("149.	ቤተ ክርስቲያን አሐቲ")) {
				loadChild(n149);
			} else if (HoldItem.equals("150.	ዓውደ ዓመት መጽአ")) {
				loadChild(n150);
			} else if (HoldItem.equals("151.	ዓውደ ዓመት ለባርኮ")) {
				loadChild(n151);
			} else if (HoldItem.equals("152.	አመ ከም ዮም")) {
				loadChild(n152);
			} else if (HoldItem.equals("153.	ያብጽሐነ ")) {
				loadChild(n153);
			} else if (HoldItem.equals("154.	ርዕሰ ዓውደ ዓመት")) {
				loadChild(n154);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T212(this, ParentList,
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
		text.setText("በእንተ መስቀሉ ለእግዚእነ| በእንተ ቤተክርስቲያን| በእንተ ዓውደ ዓመት");
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

	public class T212 extends BaseExpandableListAdapter {

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

		public T212(Activity context, List<String> Items,
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
							} else if (childPosition == 0
									&& groupPosition == 11) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 12) {
								Toast.makeText(context, "መዝሙር የለውም",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0
									&& groupPosition == 13) {
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