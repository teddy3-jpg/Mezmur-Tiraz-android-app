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

public class Tiraz34 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("46.	 ኦ ዘጥዕመ ");
		ParentList.add("47.	 ኧኸ በቀራንዮ ");
		ParentList.add("48.	 እፎ ቀሰፉከ ");
		ParentList.add("49.	 የእውነት ብርሃን (አራራይ)");
		ParentList.add("50.	  አምላክ ሆይ ልትሆን ");
		ParentList.add("51.	  ለቤተ ክርስቲያን ብለህ ");
		ParentList.add("52.	 ዮም ፍስሐ ኮነ ");
		ParentList.add("53.	 ሰላም ሰላም");
		ParentList.add("54.	 ለዛቲ ቤት");
		ParentList.add("55.	 ጸጋ ዘአብ");
		ParentList.add("56.	 አማን በአማን");
		ParentList.add("57.	 የታቦር ተራራ");
		ParentList.add("58.	 በስመ ዚአከ");

	}
	// Assign children list element using string array.

	String[] n46 = { "å z_:m ät b|U ¼3¼\ns!-¥ lñrW bs!âL br¦\nk¯n# l!Ã-ÈW y?YwTN W¦\nbKBR l!mLsW bx@ìM l!ÃñrW\nbmSqL tsQlÖ l!ÃDnW kFÄ\nkz#Ín# wRì lBî kK»Ä\nbsW XJ tmTè bCNµR twGè\nG:²NN l!sBK wd s!åL wRì\nMWt$N l!ÃDnW ‰s#N xêRì\nl!qDS bdÑ l!ÃkBR bSÑ\nxZ(((((((((((((((((((( " },
			n47 = { "%, bq‰N× %, bfssW dMH ¼2¼\n%, bKb#R SMH xM§K çY ¥rN XÆKH ¼2¼" },
			n48 = { "እፎ ቀሰፉከ ካህናተ ይሁዳ ወሌዊ ¼2¼\nመድኃኔ ዓለም ¼2¼ ህፃን ወአረጋዊ ¼2¼\n\nትርጉምÝ  ህÉn#Â xrUêEWM yYh#ÄÂ yl@êE µHÂT mD`n@›lM çY XNÁT grûH" },
			n49 = { "BR¦N yXWnT BR¦N =l¥N Ã-Í\nät nFSN yšr KRSèS y›lM tsÍ\nSl ሰW FQR Sl ሰW LJ KBR\nሥUN lBî ሰW çn kxÄM LJ zR\nምን :]#B DNQ nW §sbW\nምን G„M DNQ nW yfÈ¶ |‰W" },
			n50 = { "	xM§K çY LTçN b@² l\\W LJ\n	mk‰N tqbLK bGf®C XJ\nyxYh#D ¥~bR bxNt §Y mk„\nbäT l!Ãsq-#H h#l#M tÆb„\nb/ሰT wNJlW ¹NÙcW xöÑH\nbGF Ç§ mTtW M‰QN tûBH\n	kg¢EW ðT qRbW ሕZb#N xÆbl#\n	bRÆNN xSft$ xNtN l!ÃsQl#\n	xúLæ s-H ’!§õS fTñ\n	gRfW XNÄ!sQl#H {DQH bdL çñ\nbxMSt$ QNêT cNKrW bmSqL\nq‰N× xêl#H b>FèC mµkL\nW¦ BTlMN yWçC Ælb@T\nhäTN x--#H yGÍcW B²T\n	ÃNN h#l# mk‰ bT:GST f}mH\n	nFSHN kሥUH bf”DH lyH\n	yT:GSTHN B²T m§እKT xdnq$	lሰW LJ ÃlHN FQRHN xwq$" },
			n51 = { "zbXNtExሃ lb@t KRStEÃN tጸÍXk bWSተ ዓWD \nkm TqDú bdMk Kb#R\nzbXNtExሃ ZGሃ¬t mêQ?T ፆr wtxg\\ M‰q \nRኲሰ XNz xLï zxbs xM§K Ä!b ዕ] msqL tsQl\nlb@t KRStEÃን BlH LTqDúT bdMH\nbxdÆÆY b_ð tm¬H\nN[#ህ KRSèS bxÄM _ÍT LTwqS\nbkNt$ LTksS xm§ls#H\nk’!§õS wd ÿéDS\nh#l#N ÒY úlH MNM ¥DrG úYúNH\nbxYh#D XJ tgrFK\nw× wsN yl@§T ት:GስTH\nSl X¾ BlH mk‰N tqbLK\nMNM bdL úYñRBH\nxM§K bXN=T mSqL §Y sql#H" },
			n52 = { "×M FS/ ÷n bsNbt KRStEÃN XSm tN|x \nKRSèS XÑ¬N qdú wxKb‰ XMኲ#lÖN mê:L \nአልዐላ x¥N tN|x XMn Ñ¬N\n\n×M FS/ ÷n bsNbt KRStEÃN XSm tN|x \nKRSèS XÑ¬N\nqdú wxKb‰ ¼2¼ XMኲ#lÖN mê:L\n\n²Ê dS¬ çn bsNbt KRStEÃN tn|aLÂ KRSèS kÑ¬N\nqdúT xkb‰T ¼2¼ kFM xdrUT kh#l#M :l¬T\n\nTRg#MÝ( ²Ê bKRStEÃN sNbT dS¬ çn KRSèS kÑ¬N tn|aLÂ qdúT xkb‰T kF kF xdrUT kh#l#M :l¬T" },
			n53 = { "s§M s§M¼2¼\nXMYXz@s Yk#N s§M ¼4¼\ns§M s§M ¼2¼\nkXNGÄ!HS Yh#N s§M ¼4¼" },
			n54 = { "ለዛቲ ቤት ሐነፃ ወልድ ¼2¼\nወፈፀማ መንፈስ ቅዱስ ¼4¼¼\nይህችን ቤት ወልድ አነፃት ¼2¼\nመንፈስ ቅዱስም ፈፀማት ¼4 ¼ " },
			n55 = { "ጸጋ ዘአብ ሒሩት ዘወልድ ሱታፌ ዘመንፈስ ቅዱS¼2¼\nተውህቦሙ¼3¼ ለሐዋርያት ¼2¼\n\nትርጉም፡- የአብ ጸጋ የወልድ ቸርነተ የመንፈስ ቅዱሰ አንድነት¼ በረከት¼ ለሐዋርያት ተሰጣቸው፡ ለጰ‰ቅሊጦስ ¼ለሐዋርያት በዓL¼ የሚባል" },
			n56 = { "አማን በአማን ¼4¼¼\nተሰብ/ በደብረ ታቦር ¼4¼¼\n\nTRg#MÝ( XWnT bXWnT bdBr ¬ïR tmsgnÝÝ" },
			n57 = { "የታቦር ተራራ በጣም ደስ ይብልሽ ¼2¼\nእግዚአብሔር መለኮቱን ስለገለ-ብሽ ¼4¼¼" },
			n58 = { "በስመ ዚአከ ይትፌ|/# ዮም ¼2¼\nታቦር ወአርሞንኤም ¼4¼¼\n\n	TRg#MÝ( ታቦርና አርሞንኤም በስMH ዛሬ ደስ ይላcêL፡፡" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("46.	 ኦ ዘጥዕመ ")) {
				loadChild(n46);
			} else if (HoldItem.equals("47.	 ኧኸ በቀራንዮ ")) {
				loadChild(n47);
			} else if (HoldItem.equals("48.	 እፎ ቀሰፉከ ")) {
				loadChild(n48);
			} else if (HoldItem.equals("49.	 የእውነት ብርሃን (አራራይ)")) {
				loadChild(n49);
			} else if (HoldItem.equals("50.	  አምላክ ሆይ ልትሆን ")) {
				loadChild(n50);
			} else if (HoldItem.equals("51.	  ለቤተ ክርስቲያን ብለህ ")) {
				loadChild(n51);
			} else if (HoldItem.equals("52.	 ዮም ፍስሐ ኮነ ")) {
				loadChild(n52);
			} else if (HoldItem.equals("53.	 ሰላም ሰላም")) {
				loadChild(n53);
			} else if (HoldItem.equals("54.	 ለዛቲ ቤት")) {
				loadChild(n54);
			} else if (HoldItem.equals("55.	 ጸጋ ዘአብ")) {
				loadChild(n55);
			} else if (HoldItem.equals("56.	 አማን በአማን")) {
				loadChild(n56);
			} else if (HoldItem.equals("57.	 የታቦር ተራራ")) {
				loadChild(n57);
			} else if (HoldItem.equals("58.	 በስመ ዚአከ")) {
				loadChild(n58);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T34(this, ParentList,
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
		text.setText("በእንተ ስቅለቱ ወ ትንሳኤሁ ለእግዚእነ | በእንተ ደብረታቦር");
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

	public static class T34 extends BaseExpandableListAdapter {
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

		public T34(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/046-O Zeteme.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/047-Ehe bekeranyo.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/048-Efo kesefuke.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								Toast.makeText(context, "መዝሙር የለውም!",
										Toast.LENGTH_SHORT).show();
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/050-Amlak Hoy litihon.wma");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/051-LebeteKrstian bileh-1.wma");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/052-Yom fiseha kone.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/053-Selam Selam.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/054-Lezati Bet.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/055-Tsega zeAb.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/056-Aman beaman.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/057-YeTabor terara.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/058-Besime ziake.mp3");
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