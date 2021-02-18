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

public class Tiraz32 extends Activity {
	Button button4, button5;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("21.	 እንኳን ደስ ያላችሁ");
		ParentList.add("22.	 ጸልይ ኀበ አምላክ");
		ParentList.add("23.	 እምሔሶ ለሄሮድስ");
		ParentList.add("24.	 ራጉኤል እምሰማያት ");
		ParentList.add("25.	 ወአንተኒ ሕፃን ");
		ParentList.add("26.	 ተወልደ ኢየሱስ");
		ParentList.add("27.	ርእይዎ ኖሎት");
		ParentList.add("28.	 ይትፌሥሓ አድባረ ጽዮን ");
		ParentList.add("29.	  ቤዛ ኲሉ ዓለም");
		ParentList.add("30.	 ዮም ተወልደ");
		ParentList.add("31.	 በከመ ሰማዕነ ");
	}
	// Assign children list element using string array.

	String[] n21 = { "XNµ*N dS ያላችሁ ¼6¼\nmLXKt ×/NS h h# B§Cሁ\nðdL ö_‰Ch# kXn yn@¬ ጠዋትና ¥¬\ntm§LúCh# lz!H b”Ch#\n	yxM§K cRnT rqEQnT\n	YH nW Cé¬W kHÉNnT Xsk xêqEnT\n	›m¬T ö_é lÄ!PlÖ¥ ¼Ä!G¶¼ mB”T\nytê?ì LíC XÂNT h#§Ch#\nየዕውቀት µÆ ©ñ lBúCh# dS ¥l¬Ch#\n	xd‰ XNÄTrú*T b@t KRStEÃNN\n	xNÄ!T tê?ì xd‰Ch#N\nxZ((((((((((( " },
			n22 = { "[ልይ ^b xM§K ¼2¼ ‰g#x@L mLxK ¼2¼\n;Wd ›mT km YTÆrK ¼4¼\n\nTRg#MÝ( ;Wd xmt$ XNÄ!ÆrK ‰g#x@L çY wd xM§K [LY" },
			n23 = { "XM/@î lÿéDS YB§: m/§h# ¼2¼ XM ÃMTR R:î l×/NS ¼2 ¼\n;b!ይ nb!ይ ¼2¼ sÆk@ wNg@L¼4¼\n\nTRg#MÝ( ÿéDS êÂ nb!Y yçnWNÂ y_MqT sÆk! የ×/NSN xNgT k¸ÃSቆR_ m/§WN b!b§ YšlW nbR" },
			n24 = { "ራጉኤል እምሰማÃት ¼2¼\nእም ኀበ ላዕል ወረደ እምልዑላን ¼4¼\n\nTRg#MÝ( ‰g#x@L ks¥ÃT kF µl ï¬ wrd" },
			n25 = { "ወአንተኒ ህፃን ነቢየ ልዑል¼4¼\nአርኩ ለመርዓዊ ትሰመይ¼2¼ ነቢየ ልዑል¼2¼\n\nትርጉምÝ(አንተ ህፃን የልዑል ነቢይ የሙሽራው ክርስቶስ መንገድ ጠራጊ ትባላለህ " },
			n26 = { "twLd x!ys#S bb@tL/@M ¼2¼ zYh#Ä bb@t L/@M ¼2¼\nxêLd -!éS አሜሃ YsGÄ ¼2¼ bb@tL/@M\n\nTRg#MÝ( ኢየሱስ በይሁዳ በቤተልሔም ተወለደ \nየጢሮስ s@T ልጆች ያን ጊዜ ይsግዱለታል፡፡" },
			n27 = { "×M s¥ÃêE b¯L skb lztwLd XMQDST DNGL ¼2¼\nRXYã ñlÖT ¼2¼ xXኰTã m§XKT ¼2¼\n\nTRg#MÝ- ²Ê kQDST DNGL ytwldWN Xr®C x†T m§XKT xmsgn#T" },
			n28 = { "YTØ|ሓ xDÆr {×N wYT/\\Ã xêLd x!T×ùÃ ¼2¼\nXSm twLd B/#t LdT mD`n@ ›lM \nbx!y„úl@M mD`n@›lM ¼2¼\n\nTRg#MÝ y{×N t‰‰éC Yds¬l#¿ yx!T×ùÃM ልጆቿ /œ@TN ÃdRUl#¿ በልደቱ ብቸኛ የሆነ  mD`n@ ›lM bx!y„úl@M twLÄ*LÂÝÝ" },
			n29 = { "b@² ኲl# ›lM ×M twLd\nb@² ኲl# ›lM ×M twLd\ny›lM h#l# mD`n!T ²Ê twld\ny›lM h#l# mD`n!T ²Ê twld" },
			n30 = { "×M twLd mD`n@ ›lM\n×M twLd kœt& BR¦N\n\nTRg#MÝ( y›lM mD`n!T ²Ê twld\nBR¦NN y¸gL_ ¼yBR¦N g@¬¼²Ê twld" },
			n31 = { "	bkm s¥:n k¥h# Rx!n\n	bhgr XGz!x `Ã§ን bhgr xM§Kn\nxÄMN l!ÃdnW ”L XNdgÆlT\nbmSqL tsQlÖ b@² l!çNlT\nXNdtÂgr kሰ¥Y wrd\nbሰW xµL ¬y b¯L twld\n	nb!Ãt$ XNÄ† bTNb!T mn}R\n	yÃ:öBN ÷kB yXs@YN SR bTR\n	X¾ GN bxµL tgLõ xynW\n	bG:z HÉÂT b¯L xgßnW\nkHZQx@L Mስ‰Q ]/Y XNÄ!wÈ\nwgn#N l!¬dG mD~N XNÄ!mÈ\nnb!Ãt$ XNÄl# X¾M XNds¥N\nbxMላµCN hgR yçnWN xy”" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("21.	 እንኳን ደስ ያላችሁ")) {
				loadChild(n21);
			} else if (HoldItem.equals("22.	 ጸልይ ኀበ አምላክ")) {
				loadChild(n22);
			} else if (HoldItem.equals("23.	 እምሔሶ ለሄሮድስ")) {
				loadChild(n23);
			} else if (HoldItem.equals("24.	 ራጉኤል እምሰማያት ")) {
				loadChild(n24);
			} else if (HoldItem.equals("25.	 ወአንተኒ ሕፃን ")) {
				loadChild(n25);
			} else if (HoldItem.equals("26.	 ተወልደ ኢየሱስ")) {
				loadChild(n26);
			} else if (HoldItem.equals("27.	ርእይዎ ኖሎት")) {
				loadChild(n27);
			} else if (HoldItem.equals("28.	 ይትፌሥሓ አድባረ ጽዮን ")) {
				loadChild(n28);
			} else if (HoldItem.equals("29.	  ቤዛ ኲሉ ዓለም")) {
				loadChild(n29);
			} else if (HoldItem.equals("30.	 ዮም ተወልደ")) {
				loadChild(n30);
			} else if (HoldItem.equals("31.	 በከመ ሰማዕነ ")) {
				loadChild(n31);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T32(this, ParentList,
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
		text.setText("በእንተ ዕለተ ትፍስሕት ወዓውደ ዓመት| በእንተ ልደቱ ለእግዚእነ| ");
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

	public static class T32 extends BaseExpandableListAdapter {
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

		public T32(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/021-Enkuan Des Alachihu.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/022-Tsely HabeAmlak.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/023-Emheso Leherods.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/024-Raguel Emsemayat.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/025-Weanteni Hetsan.mp3");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/026-Tewolde Iyesus.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/027-Reyiwo nolot.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/028-Yitfesiha adbare Tsion.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/029-Beza kulu alem.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/030-Yom Tewolde.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/031-Bekeme Semaene.wma");
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