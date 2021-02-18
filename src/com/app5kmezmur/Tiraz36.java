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

public class Tiraz36 extends Activity {
	Button button4, button5, button6;
	CheckBox ch;
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("87.	ማርያም ደስ ይበልሽ ");
		ParentList.add("88.	  አብሠራ ወይቤላ ");
		ParentList.add("89.	 አልብኪ ነውር");
		ParentList.add("90.	  አዕይንታ ዘርግብ");
		ParentList.add("91.	 ተወለደችልን ");
		ParentList.add("92.	 አክሊለ ጽጌ");
		ParentList.add("93.	 ረሀበ ወጽምዓ");
		ParentList.add("94.	 ንግሥት እመቤቴ");
		ParentList.add("95.	 አፈ ንህብ ");
		ParentList.add("96.	 ክበበ ጌራ ወርቅ");
		ParentList.add("97.	መዓዛ አፈዋት ");
		ParentList.add("98.	ኅብረ ሐመልሚል");
		ParentList.add("99.	ሰላም ለኪ");
		ParentList.add("100.	ጽጌ አክሊለ ጽጌ");
		ParentList.add("101.	ክበበ ጌራ ወርቅ ጽሩይ");
		ParentList.add("102.	እንዘ ተኃቅፊዮ");

	}
	// Assign children list element using string array.

	String[] n87 = { "¥RÃM ¼3¼ dS YbL> bgBRx@L s§M¬\nbxNcE S§dr y›lM h#l# g@¬ ¼2¼\nyxM§K cRnt$ f”Ç s!çN\n=l¥W tgFæ s!mÈ BR¦N\nmDኃn!T s!mÈ sYÈN XNÄfr\nyz@ÂW xBœ¶ gBርx@L nbr\nxZ(((((((((((((((((\nDNGL tqMÈ bb@t mQdS\nሐር wRQ xS¥M¬ STfTL NG|T\ngBRx@L ¼2¼ z@ÂêE ሐÄ!S\nyxM§KN mwlD |U bmLbS\nxZ(((((((((((((((((\ngBRx@L s!Ãb|‰T DNGL STs¥\nbXRú* §Y xrf yml÷T GR¥\nXWnt¾ mLxK mçn#N S§yC\nYh#NL\" B§ ”l#N tqblC\nxZ((((((((((((((((( " },
			n88 = { "xB\\‰ wYb@§ l¥RÃM gBRx@L xB\\‰ mLአK ¼2¼\nxLï ¥~lQT ls§Ñ Ä!b mNbረ ÄêET \nmNGሥቱ T]N: ¼2¼\n\nTRg#MÝ( mL›k# QÇS gBRx@L lXmb@¬CN xb\\‰T µNcE y¸wldW ls§Ñ FÉ» ylWM x§T mNGSt$ bÄêET mNbR §Y T]ÂlC" },
			n89 = { "xLBk! nWR wx!MNTn! b§:l@k! ¼2\nÉx! XMl!ÆñS X~Ty mR›T ¼4\nylB>M nWR MNM ngR b§Y> §Y ¼2\nWÀ kl!ÆñS XHt& Ñ>‰ ¼4" },
			n90 = { "xዕYN¬ zRGB ¼2¼ x!Ãq&M wlÄ ¼2\nx!Ãq&M wlÄ ¼5¼ zRGB x!Ãq&M wlÄ %, ¼3¼\n\nTRg#MÝ( xYñ– yRGB ymsl# ¼yçn#¼ LJN x!Ãq&M wldÝÝ" },
			n91 = { "twldCLN DNGL ¥RÃM\nynb!ÃT TNb!T ?Ywt xÄM\n	/ÂÂ x!Ãq&M bጸlÖT s!tg#\n	yxM§KN Sõ¬ ]NtW s!fLg#$\n	b?G bሥR›T çnW s!¥LÇ\n	yፀ/YN XÂT s¥YN wlÇ\nxÆèC nb!ÃT ÃdrÙT tSÍ\nMLKT yçnC bäT XNÄN-Í\nyqrCLN zR yxM§K mg¾\ny?YwT W¦ MN+ twldC lX¾\n	y_L MKNÃT BTçN /@êN\n	bDNGL mwlD XRQ çnLN\n	lxÄM zR h#l# mD`n!T ÂTÂ\n	XÂt$N ys-N YDrsW MSUÂ" },
			n92 = { "xKl!l {g@ ¥RÃM q]§ mNG|t$ lg!×Rg!S\nKbb g@‰ wRQ ¼2¼ xKl!l {g@\n\nTRg#MÝ( bxbÆ yt¹lm xKl!LN ywRQ zWDNM yM¬qÄ©! ¥RÃM çY yg!×Rg!S ymNG|t$ xKl!L ¼yng\\B> xKl!L¼ n>" },
			n93 = { "rhb w{M› xzK¶ DNGL rhb w{M› ¼2¼\nMNÄb@ w^zn xzK¶ DNGL ¼2/¼n\nTRg#MÝ( DNGL çY rhb#NÂ _ÑN CG„NÂ `zn#N xúSb!" },
			n94 = { "NGሥT Xmb@t& DNGL ¥RÃM\nµNcE UR t‰b መድኃኔዓለም\nkgnT tsì XNÄYqR xÄM\nxNcE tNg§¬> kHÉN> U‰\nÆLbdL>W bdL xgß> mk‰\n	xNcE Nግሥት STç\" yh#l# Xmb@T\n	ÿéDስ Ärg> xNcEN lSdT ¼2¼\nXNÁT xdrg> rhB XÂ _Ñ\nê:†Â BRÇ XNÄ!h#M DµÑ\nLJ> መድኃኔዓለም h#l#N ¥DrG s!CL\nt\\dd lX¾ µNcE U‰ DNGL\n	t\\dD> DNGL bGB} br¦\n	lƒST ›mT kúDS xW‰¦\n	XNÁT xlqL> ybr¦W ï¬\n	y=l¥W _LqT yx‰êET h#µ¬\nXNGÄ!H -BqE\" DNGL yXn@ Xmb@T\nt\\DË XNÄLqR kzl›lM ?YwT\n=M¶L\" XD» b¯ XND\\‰b\nlNS/ xBqE\" bnFs@& XNÄLäT ¼3¼" },
			n95 = { "xf NIB ¥t$ú§ wLd N?ñK XMxf LM§» b#\\K xf mM›K ¼2¼¼\nqsm {g@ ¼2¼ {g@k! Xm XM§K" },
			n96 = { "Kbb g@‰ wRQ ¼4¼\nxKl!l {g@ ¥RÃM ¼4¼\n\nTRg#MÝ( ድንግል አንቺ የአበባ አክሊል እና የወርቅ ማርዳ ነሽ፡፡" },
			n97 = { "m›² xfêT ¥RÃM¼2¼{g@ mNG|T ቡRKT ¼2¼\n{g@ ¼2¼ zslÖäN wÄêET xBR¦ ወአጽብሐ ¼2¼\n\nTRg#MÝ( b¯ m›² Ãl> >t$ ¼QmM¼ ytÆrK> ymNG|T ¼yKBR¼ xbÆ ¥RÃM yslÖäN yÄêET yxBR¦Â yx{B¦ KB‰cW n>ÝÝ" },
			n98 = { "ህብረ ሐመልሚል ቀይህ ወጸአድኢድ¼2¼\nተፈፀመ ¼5¼ ማኅሌተ ጽጌ ¼2¼" },
			n99 = { "ሰላም ለኪ ¼3¼ ¼2¼\nክበበ ጌራ ወርቅ ¼2¼ አክሊለ ጽጌ \n\nትርጉም፦ የወርቅ ማርዳ ሆይ ሰላምታ ላንቺ የአበባ አክሊል የቅዱሳን ክብር ነሽ" },
			n100 = { "ጽጌ ¼2¼ አክሊለ ጽጌ ¼2¼ ማርያም ¼2¼ ኧኸ\nክበበ ጌራ ወርቅ ¼2¼ አክሊለ ጽጌ\n\nትርጉም፦ ማርያም ሆይ የአበባ አክሊል የወርቅ ማርዳ ነሽ" },
			n101 = { "ክበበ ጌራ ወርቅ ጽሩይ ክበበ ጌራ ወርቅ ¼2¼ ኧኸ\nእም እን³ ባህርይ ¼2¼  ዘየሀቱ ¼2¼ ጽሩይ እም እን³ ባህርይ ¼2¼ ኧኸ\n\nትርጉም፦ ከተመረጠ ከሚያበራ ዕንቁ ይልቅ የሚያበራ ንፅህናሽ ከባህርየ ዕንቁ ይልቅ የሚያበራ ነው።" },
			n102 = { "እንዘ ተኀቅፊዮ ለህፃንኪ ንዒ ማርያም ¼2¼\nንዒ ¼3¼ ማርያም ¼4¼\n\nትርጉም፦ ህፃንሽን ታቅፈሽ ማርያም ነይ" };
	String[] ByDefalutMessage = { "መዝሙር የለውም!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("87.	ማርያም ደስ ይበልሽ ")) {
				loadChild(n87);
			} else if (HoldItem.equals("88.	  አብሠራ ወይቤላ ")) {
				loadChild(n88);
			} else if (HoldItem.equals("89.	 አልብኪ ነውር")) {
				loadChild(n89);
			} else if (HoldItem.equals("90.	  አዕይንታ ዘርግብ")) {
				loadChild(n90);
			} else if (HoldItem.equals("91.	 ተወለደችልን ")) {
				loadChild(n91);
			} else if (HoldItem.equals("92.	 አክሊለ ጽጌ")) {
				loadChild(n92);
			} else if (HoldItem.equals("93.	 ረሀበ ወጽምዓ")) {
				loadChild(n93);
			} else if (HoldItem.equals("94.	 ንግሥት እመቤቴ")) {
				loadChild(n94);
			} else if (HoldItem.equals("95.	 አፈ ንህብ ")) {
				loadChild(n95);
			} else if (HoldItem.equals("96.	 ክበበ ጌራ ወርቅ")) {
				loadChild(n96);
			} else if (HoldItem.equals("97.	መዓዛ አፈዋት ")) {
				loadChild(n97);
			} else if (HoldItem.equals("98.	ኅብረ ሐመልሚል")) {
				loadChild(n98);
			} else if (HoldItem.equals("99.	ሰላም ለኪ")) {
				loadChild(n99);
			} else if (HoldItem.equals("100.	ጽጌ አክሊለ ጽጌ")) {
				loadChild(n100);
			} else if (HoldItem.equals("101.	ክበበ ጌራ ወርቅ ጽሩይ")) {
				loadChild(n101);
			} else if (HoldItem.equals("102.	እንዘ ተኃቅፊዮ")) {
				loadChild(n102);
			}

			else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}

		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new T36(this, ParentList,
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
		text.setText("በእንተ ብስራት ወልደታ ለድንግል ማርያም | መዝሙር ዘዘመነ ጽጌ");
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

	public static class T36 extends BaseExpandableListAdapter {
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

		public T36(Activity context, List<String> Items,
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
										+ "/mez/Tiraz3/087-Maryam des yibelish.mp3");
							} else if (childPosition == 0 && groupPosition == 1) {

								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/088-Absera Weyibela.mp3");
							} else if (childPosition == 0 && groupPosition == 2) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/089-Albki newr.mp3");
							} else if (childPosition == 0 && groupPosition == 3) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/090-Aeyinta zerigb.mp3");
							} else if (childPosition == 0 && groupPosition == 4) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/091-Tewoledechilin.wma");
							} else if (childPosition == 0 && groupPosition == 5) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/092-Aklile Tsegie.mp3");
							} else if (childPosition == 0 && groupPosition == 6) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/093-Rehabe wetsemea.mp3");
							} else if (childPosition == 0 && groupPosition == 7) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/094-Nigist Emebete.mp3");
							} else if (childPosition == 0 && groupPosition == 8) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/095-Afe Niheb.mp3");
							} else if (childPosition == 0 && groupPosition == 9) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/096-Kibebe gera werk.mp3");
							} else if (childPosition == 0
									&& groupPosition == 10) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/097-Meaza afewat.mp3");
							} else if (childPosition == 0
									&& groupPosition == 11) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/098-Hibre Hamelmil.mp3");
							} else if (childPosition == 0
									&& groupPosition == 12) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/099-Selam leki.mp3");
							} else if (childPosition == 0
									&& groupPosition == 13) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/100-Tsegie aklile tsegie.mp3");
							} else if (childPosition == 0
									&& groupPosition == 14) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/101-Kibebe gera wek tseruy.mp3");
							} else if (childPosition == 0
									&& groupPosition == 15) {
								mezmurPlay(Environment
										.getExternalStorageDirectory()
										.getPath()
										+ "/mez/Tiraz3/102-Enze tehakfiyo.mp3");
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