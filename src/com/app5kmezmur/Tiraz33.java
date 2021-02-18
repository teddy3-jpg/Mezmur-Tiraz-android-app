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

public class Tiraz33 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("32.	 በፍስሐ ወበሰላም");
		ParentList.add("33.	  በፍስሐ ወበሰላም እምሰማያት");
		ParentList.add("34.	 ሥጋ ሰብእ መዋቴ");
		ParentList.add("35.	 አስተርአየ ገሀደ");
		ParentList.add("36.	 አንሶሰወ");
		ParentList.add("37.	 ነድ ለማየ ባሕር ");
		ParentList.add("38.	 ክርስቶስ ተወልደ ");
		ParentList.add("39.	 ክርስቶስ ተወልደ ");
		ParentList.add("40.	 ግነዩ ለእግዚአብሔር");
		ParentList.add("41.	 ኀዲጎ ተስዓ");
		ParentList.add("42.	 አጥመቆ በማይ");
		ParentList.add("43.	 መጽአ ቃል ");
		ParentList.add("44.	ዮሐንስኒ ይቤ");
		ParentList.add("45.	 ይእዜኒ ለሰላም");

	}
	// Assign children list element using string array.

	String[] n32 = { "bFS/ wbs§M ¼2¼\nwrd wLD ¼2¼ WSt M_¥”T ¼2¼ \n\nTRg#MÝ( bdS¬Â bs§M XGz!xB/@R wLD wd m-mqEÃ wrd" },
			n33 = { "በፍስሓ ወበሰላም እምሰማያት¼2¼\nወረደ ወልድ ውስተ ምጥማቃት¼4¼\n\nTRg#MÝ( bdS¬Â bs§M XGz!xB/@R wLD wd m-mqEÃ wrd" },
			n34 = { "|U sBX mêቴ ¼4¼\nwgBr mNõ§:ተ ¼8¼\n\nTRg#MÝ(የሚሞተውን የስውን ሥጋ መሠወሪያው  አደረገ ተዋሐደ" },
			n35 = { "xStRxy ghd xStR›y XNz HÉN ¼2¼\nXNz HÉN LHq¼2¼ b×RÄñS t-Mq XNz QÉN¼2¼\n\nTRg#MÝ( bGL_ ¬y XNd HÉÂT qS bqS xdg b×RÄñSt-mqÝÝ " },
			n36 = { "xNîsw ¼2¼ wxስtRxy ¼2¼\nb×RÄñS %, t-Mq b×/NS ¼4¼\n\nTRg#MÝ( ተመላለሰ በግልጥ ታየ በዮርዳኖስ ወንዝ ዮሐንስ እጅ ተጠመቀ::" },
			n37 = { "nD l¥y ÆQR kbï ¼2¼\n¥y ÆQR ^b yNWR ]bï ¼4¼\n\nTRg#MÝ( XúT yÆQ„N W¦ kbbW ÆQ„M y¸ÿDbT =nqWÝÝ" },
			n38 = { "KRSèS twLd XsY\nKRSèS t-Mq b¥ይ\nወldn ÄGm X¥Y ¼2¼ ÄGm ¼2¼ ወldn ÄGm X¥Y \n\nTRg#MÝ( ክርሰቶስ ተወለደ፣ ክርስቶስ ተጠመቀ ዳግም ከውሃ ወለደን" },
			n39 = { "KRSèS twLd wt-Mq ¼2¼\nxStRX×t$ x¥N xStRXዮt$ ¼2¼\n\nTRg#MÝ( ክርስቶስ ተወለደ ተጠመቀ መገለጡም እውነት ነው፡፡ " },
			n40 = { "Gn† lXGz!xB/@R XSm ^@R ¼2¼\nXSm l›lM M?rt$ XSm l›lM ¼4¼\nXÂmSGN> yxM§K XÂT bZ¥Ê ¼2¼\ny›lM b@² nWÂ y¥~]N> FÊ ¼4¼\nks¥የ s¥ÃT wRì kxNcE twLì ¼2¼\nml÷T wrd ×RÄñS X¾N lmqdS ¼4¼\nb×/NS XJ t-mq :ÄCNN Íq ¼2¼\nbcRnt$ xwqN kbdL x‰qN ¼4¼\nbDNGLÂ ywlD>W yxNcE ጽንስ ¼2¼\nyDk#¥ñC BR¬T nW yQÑ¥N fWS ¼4¼\nSM>N y-‰ ZKR>NM Ãzkr ¼2¼\nbmNG|t s¥Y Yñ‰L XNdtkbr ¼4¼\nBR¦n ml÷T ÃdrB> xÄ‰> ¼2¼\nQDSt QÇúN ¥RÃM DNGL xNcE n> ¼4¼\nXmb@¬CN XÂ¬CN ¥RÃM ¼2¼\nየተማጸነሽ Yñ‰L lzl›lM ¼4¼" },
			n41 = { "^Ä!¯ tS› wtS›t ngd ¼2¼\n¥:kl ÆHR ¼2¼ öm ¥:kl ÆHR ¼2¼\nTRg#MÝ( z-Â z-ß#N ngd m§XKT Tè bÆ?R mµkL öm" },
			n42 = { "x_mö b¥Y ¼6¼\n×/NS ¼3¼ x_mö b¥Y\n\nTRg#MÝ( ×/NS መድኃኒታችንን bW¦ x-mqW" },
			n43 = { "መጽአ ቃል¼2¼ እም ደመና ዘይብል¼2¼\nእምደመና ዘይብል ¼3¼ ዝንቱ ወልድየ¼2¼ " },
			n44 = { "ዮሐንስኒ¼2¼ ይቤ ዘአጥመቆ በዮርዳኖስ¼2¼\nርኢክዎ ወስእንኩ ጠይቆቱ ስእንኩ¼2¼\n\nትርጉም( በዮርዳኖስ ጌታን ያጠመቀው ዮሐንስ ጌታዬን አየሁት እርሱን መምህሬን ልደርስበት አልቻልኩም አለ። " },
			n45 = { "ይእዜኒ ለሰላም ንትልዋ ለሰላም ¼2¼\nተጠምቀ ነዋ መድኃኔዓለም መድኃኒነ መድኃኔዓለም¼2¼" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("32.	 በፍስሐ ወበሰላም")) {
				loadChild(n32);
			} else if (HoldItem.equals("33.	  በፍስሐ ወበሰላም እምሰማያት")) {
				loadChild(n33);
			} else if (HoldItem.equals("34.	 ሥጋ ሰብእ መዋቴ")) {
				loadChild(n34);
			} else if (HoldItem.equals("35.	 አስተርአየ ገሀደ")) {
				loadChild(n35);
			} else if (HoldItem.equals("36.	 አንሶሰወ")) {
				loadChild(n36);
			} else if (HoldItem.equals("37.	 ነድ ለማየ ባሕር ")) {
				loadChild(n37);
			} else if (HoldItem.equals("38.	 ክርስቶስ ተወልደ ")) {
				loadChild(n38);
			} else if (HoldItem.equals("39.	 ክርስቶስ ተወልደ ")) {
				loadChild(n39);
			} else if (HoldItem.equals("40.	 ግነዩ ለእግዚአብሔር")) {
				loadChild(n40);
			} else if (HoldItem.equals("41.	 ኀዲጎ ተስዓ")) {
				loadChild(n41);
			} else if (HoldItem.equals("42.	 አጥመቆ በማይ")) {
				loadChild(n42);
			} else if (HoldItem.equals("43.	 መጽአ ቃል ")) {
				loadChild(n43);
			} else if (HoldItem.equals("44.	ዮሐንስኒ ይቤ")) {
				loadChild(n44);
			} else if (HoldItem.equals("45.	 ይእዜኒ ለሰላም")) {
				loadChild(n45);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T33(this, ParentList,
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
		text.setText("በእንተ ጥምቀቱ ለእግዚእነ");
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

	public static class T33 extends BaseExpandableListAdapter {
		TextView duratio;
		private Activity context;
		Button play, playpause;

		private MediaPlayer mp = new MediaPlayer();
		SeekBar seekbarProgress;
		private int duration;
		private final Handler handler = new Handler();
		private double timeElapsed = 0, finalTime = 0;
		public int oneTimeOnly = 0;
		private Map<String, List<String>> ParentListItems;
		private List<String> Items;

		public T33(Activity context, List<String> Items,
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
					"fonts/VG2_Main.ttf");
			item.setTypeface(face1);
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
										+ "/mez/Tiraz3/032-Befisiha webeselam.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/033-Befisiha webeSelam Emsemayat.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/034-Siga seb mewate.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/035-Asteraye gehade.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/036-Ansosewe.mp3");
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
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/040-Gineyu leEgziabher.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/041-Hadigo tes'a.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/042-Atmeko bemay.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/043-Mets'a Kal-diffe.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/044-Yohanisni yibe-diffe.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/045-Yiezeni leselam.mp3");
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