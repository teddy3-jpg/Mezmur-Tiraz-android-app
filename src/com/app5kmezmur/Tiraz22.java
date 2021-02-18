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

public class Tiraz22 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("30.	ተፈፀመ ሐና በወለትኪ");
		ParentList.add("31.	አስምኪ ቦቱ");
		ParentList.add("32.	ድንግል መከራሽን");
		ParentList.add("33.	የጻድቃን እመቤት ");
		ParentList.add("34.	ምዕረ በዘባንኪ");

	}
	// Assign children list element using string array.

	String[] n30 = { "ተፈፀመ ሐና በወለትኪ/2/\nተስፋ ቅዱሳን አበውኪ\nተስፋ ቅዱሳን አበው/2/\n\nተፍፀመ  ሐና በልጅሽ/2/\nየቅዱሳን ተስፋ ያባቶችሽ/4/ ኧኸ\n\nየሚዘመርበት ወቅት ግንቦት 1" },
			n31 = { "አስምኪ ቦቱ /2/ ንግሥተ ሰማያት ወምድር\nተፈፀመ/5/ ማኅሌተ ጽጌ/2/ ኧኸ\n\nትርጉም፦ የሰማይና የምድር ንግሥት ሆይ እነሆ የጽጌው ማህሌት ተፈጸመ። ውድ ልጅሽ በእቅፍሽ እንደሚያርፍ አንቺም በዚህ ማህሌት እረፊበት። ደስ ተሰኚበት።  የሚዘመርበት ወቅት  ኅዳር 6" },
			n32 = { "ድንግል መከራሽን ጥውሰው \nበሄሮድስ ዘመን ፍጥረት ያለቀሰው\nአንቺ የአምላክ እናት ደግሞም እመቤት \nእንደችግረኛ ተነሳሽ ስደት\n	ኧረ ለምሆኑ እንዴት አለቀልሽ  \n	ስትንከራታ በረሃን አቋርጠሽ\n	ይገድሉታል ብለሽ ለልጅሽ አስበሽ\n	በግብጽ በረሃ መከራሽን አየሽ\n	መከራሽን መከራሽን አየሽ \nአዝ. . .\n	አዛኝቷ ማርያም በጠራሁሽ ጊዜ \n	እንድትደርሽልኝ በመከራ ጊዜ \n	መከራን ያየ ሰው መቼም አይጨክንም  \n	አትቸክኝብኝ አደራሽን  ማርያም \n	አደራሽን አደራሽን ማርያም\nአዝ . . . \n	አቤት ይዚያብ ጊዜ ያየሽው መከራ \n	ያለቀስሽው ለቅሶ ጭራሽ አይወራ   \n	የአማኑኤል እናት አንቺ መክረኛ \n	እድሜሽን ጨርሺው ሆነሽ ሃዘንተኛ\n ሀዘንተኛ ሆነሽ ሀዘንተኛ	\nአዝ . . .\n\nየሚዘምርበት ወ ቅት፦ ከ መስከረም 26_ ኅዳር 6 " },
			n33 = { "የጻድቃን እመቤት የደናግል ተስፋ	\nሀገር ለሀገር ዞረች አምላክን ታቅፋ 	\nእንባዋ ይፈሳል እንደክረምት ውሃ\nእንደ ክረምት ውሃ እንባዋ\nምንም አላገኘች አይዞሽ ባይ ዘመድ\nአይዞሽ ባይ ዘመዷ ወልደ አምላክ ሳለ\nውሃ ጥም ጸንቶባት አፏ ደርቆ ዋለ\nመቼ ትስኖት ነው ውሃ ለእርሷ ማውረድ \nአስቦ ነው እንጂ ክብሩን ለማዋረድ \nስልጣኑን ሸሽጎ ክብሩን ያዋረደው\n ከገሃነም እሳት እኛን ሊያድነን ነው\n\nየሚዘመርበት ወቅት ከ መስከረም 26 - ኅዳር 6 " },
			n34 = { "ምዕረ በዘባንኪ ወምዕረ በገቦኪ /2/\nበሀዚለ ህፃን/2/እፎ ደከምኪ /4/\nአንድ ጊዜ በጀርባሽ አንድ ጊዜ በጎንሽ  /2/\nህፃን በመሸከምሽ/2/ ደከምሽ /4/\n\n የሚዘመርበት ወቅት  መስከረም 26_ ህዳር 6" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("30.	ተፈፀመ ሐና በወለትኪ")) {
				loadChild(n30);
			} else if (HoldItem.equals("31.	አስምኪ ቦቱ")) {
				loadChild(n31);
			} else if (HoldItem.equals("32.	ድንግል መከራሽን")) {
				loadChild(n32);
			} else if (HoldItem.equals("33.	የጻድቃን እመቤት ")) {
				loadChild(n33);
			} else if (HoldItem.equals("34.	ምዕረ በዘባንኪ")) {
				loadChild(n34);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T22(this, ParentList,
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
		text.setText("በእንተ ልደታ ወስደታ  ለድንግል ማርያም");
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

	public class T22 extends BaseExpandableListAdapter {

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

		public T22(Activity context, List<String> Items,
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

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/031-Asmeki Botu.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/032-Dingel Mekerashin.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz2/033-Yetsadkan Emebet.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
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