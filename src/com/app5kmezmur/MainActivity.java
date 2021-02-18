package com.app5kmezmur;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;

import com.app5kmezmur.Title.SubCategory;
import com.app5kmezmur.Title.SubCategory.Mezmur;

public class MainActivity extends Activity implements
		SearchView.OnQueryTextListener, SearchView.OnCloseListener {

	ImageButton im;
	ActionBar actionbar;
	private ExpandableListView myList;
	private ArrayList<Title> pTitleArrayList;
	private ArrayList<SubCategory> pSubItemArrayList1, pSubItemArrayList2,
			none;
	public LinearLayout mLinearListView;
	public DrawerLayout mDrawerLayout;
	boolean isFirstViewClick = false;
	boolean isSecondViewClick = false;
	public ActionBarDrawerToggle mDrawerToggle;
	public ImageView image, image2;
	public TextView textv;
	public LinearLayout linear;
	public ScrollView mscroll;
	public ListAdapter listAdapter;
	Map<String, List<String>> ParentListItems;
	List<String> ChildList;
	ListView mDrawerList;
	SearchView search;
	SearchManager searchManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView text = (TextView) findViewById(R.id.textv);
		Typeface face = Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf");
		text.setTypeface(face);
		ColorDrawable col = new ColorDrawable(Color.parseColor("#365674"));
		getActionBar().setBackgroundDrawable(col);
		getActionBar().setDisplayShowHomeEnabled(false);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayShowTitleEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(false);
		TextView text1 = new TextView(this);
		text1.setText("ያሬዳዊ መዝሙር ");
		text1.setTextSize(16);

		text1.setTypeface(Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf"));
		text1.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(text1);

		init();
		// searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
	}

	public void init() {

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mLinearListView = (LinearLayout) findViewById(R.id.linear_listview);

		mscroll = (ScrollView) findViewById(R.id.scroll);
		Typeface face2 = Typeface.createFromAsset(this.getAssets(),
				"fonts/gfzemenu.ttf");

		ArrayList<Mezmur> traz1 = new ArrayList<Mezmur>();
		traz1.add(new Mezmur("መዝሙር  ዘዘወትር", "1-43"));
		traz1.add(new Mezmur("በእንተ ልደቱ ለእግዚእነ", "44-53"));
		traz1.add(new Mezmur("በእንተ ጥምቀቱ ለእግዚእነ", "54-62"));
		traz1.add(new Mezmur("በእንተ በዓለ ሆሳዕና", "63-66"));
		traz1.add(new Mezmur("በእንተ ስቅለቱ ለእግዚእነ", "67-79"));
		traz1.add(new Mezmur("በእንተ ትንሳኤሁ ለእግዚእነ", "80-85"));
		traz1.add(new Mezmur("በእንተ ዕርገቱ ለእግዚእነ\nመዝሙረ ጰራቅሊጦስ", "86\n87-88"));
		traz1.add(new Mezmur("በእንተ ምጽአቱ ለእግዚእነ", "89-93"));
		traz1.add(new Mezmur("መዝሙር ለድንግል ማርያም", "94-147"));
		traz1.add(new Mezmur("በእንተ መስቀሉ ለእግዚእነ", "148-162"));
		traz1.add(new Mezmur("በእንተ ቅዱሳን መላእክት", "163-173"));
		traz1.add(new Mezmur("በእንተ ቅዱሳን", "174-191"));
		traz1.add(new Mezmur("መዝሙረ ንስሐ", "192-234"));
		traz1.add(new Mezmur("በእንተ ጾም", "235-237"));
		ArrayList<Mezmur> traz2 = new ArrayList<Mezmur>();
		traz2.add(new Mezmur("መዝሙር ለድንግል ማርያም", "1-29"));
		traz2.add(new Mezmur("በእንተ ልደታ ለማርያም\nበእንተ ስደታ ለማርያም", "30\n31-34"));
		traz2.add(new Mezmur("በእንተ  ብሥራት\nበእንተ ዕርገታ ለማርያም", "35-40\n41-42"));
		traz2.add(new Mezmur("መዝሙር ዘዘወትር", "43-73"));
		traz2.add(new Mezmur("በእንተ ልደቱ ለእግዚእነ", "74-84"));
		traz2.add(new Mezmur("በእንተ ጥምቀቱ ለእግዚእነ\nበእንተ በዓለ ቃና ዘገሊላ", "85-90\n91"));
		traz2.add(new Mezmur("በእንተ ስቅለቱ ለእግዚእነ\nበእንተ ትንሳኤሁ ለእግዚእነ",
				"92-95\n96-101"));
		traz2.add(new Mezmur("በእንተ ዕርገቱ ለእግዚእነ\nበእንተ በዓለ ደብረታቦር",
				"102-104\n105-106"));
		traz2.add(new Mezmur("በእንተ ቅዱሳን መላእክት", "107-117"));
		traz2.add(new Mezmur("በእንተ ቅዱሳን", "118-135"));
		traz2.add(new Mezmur("በእንተ ጾም\nመዝሙረ ንስሐ", "136-137\n138-140"));
		traz2.add(new Mezmur("በእንተ መስቀሉ ለእግዚእነ\nበእንተ ቤተ ክርስቲያን\nበእንተ ዓውደ ዓመት",
				"141-143\n144-149\n150-154"));
		traz2.add(new Mezmur("በእንተ ሀገሪትነ ኢትዮጵያ\nበእንተ ጉባኤ", "155-157\n158-159"));

		ArrayList<Mezmur> traz3 = new ArrayList<Mezmur>();
		traz3.add(new Mezmur("መዝሙር  ዘዘወትር", "1-20"));
		traz3.add(new Mezmur("በእንተ ዕለተ ትፍስሕት\nበእንተ ዓውደ ዓመት\nበእንተ ልደቱ ለእግዚእነ",
				"21\n22-25\n26-31"));
		traz3.add(new Mezmur("በእንተ ጥምቀቱ ለእግዚእነ", "32-45"));
		traz3.add(new Mezmur(
				"በእንተ ስቅለቱ ለእግዚእነ\nበእንተ ትንሳኤሁ ለእግዚእነ\nበእንተ በዓለ ደብረታቦር",
				"46-51\n52-55\n56-58"));
		traz3.add(new Mezmur("መዝሙር ለድንግል ማርያም", "59-86"));
		traz3.add(new Mezmur("በእንተ ብሥራት\nበእንተ ልደታ ለ ማርያም\nመዝሙር ዘዘመነ ጽጌ",
				"87-88\n89-91\n92-102"));
		traz3.add(new Mezmur("በእንተ መስቀሉ ለእግዚእነ", "103-111"));
		traz3.add(new Mezmur("በእንተ ቅዱሳን መላእክት", "112-118"));
		traz3.add(new Mezmur("በእንተ ቅዱሳን", "119-136"));
		traz3.add(new Mezmur("በእንተ ጾም \nመዝሙረ ንስሐ", "137-138\n139-150"));
		traz3.add(new Mezmur("በእንተ ቤተ ክርስቲያን\nበእንተ ክረምት", "151-154\n155"));

		ArrayList<Mezmur> traz4 = new ArrayList<Mezmur>();
		traz4.add(new Mezmur("መዝሙር  ዘዘወትር", "1-27"));
		traz4.add(new Mezmur("በእንተ ብሥራት\nበእንተ ልደቱ ለእግዚእነ", "28-30\n31-37"));
		traz4.add(new Mezmur("በእንተ ጥምቀቱ ለእግዚእ\nበእንተ በዓለ ቃና ዘገሊላ",
				"38-44\n45-47"));
		traz4.add(new Mezmur("በእንተ በዓለ ሆሳዕና\nበእንተ ስቅለቱ ለእግዚእነ", "48\n49-58"));
		traz4.add(new Mezmur(
				"በእንተ ትንሳኤሁ ለእግዚእነ\nበእንተ ዕርገቱ ለእግዚእነ\nመዝሙረ ጰራቅሊጦስ",
				"59-61\n62\n63-65"));
		traz4.add(new Mezmur("በእንተ በዓለ ደብረታቦር\nበእንተ ምጽአቱ ለእግዚእነ",
				"66-69\n70-71"));
		traz4.add(new Mezmur("መዝሙር ለድንግል ማርያም", "72-96"));
		traz4.add(new Mezmur("መዝሙር ዘዘመነ ጽጌ", "97-111"));
		traz4.add(new Mezmur("በእንተ መስቀሉ ለእግዚእነ", "112-121"));
		traz4.add(new Mezmur("በእንተ ቅዱሳን መላእክት\nበእንተ ቅዱሳን", "122-125\n126-180"));
		traz4.add(new Mezmur("መዝሙረ ንስሐ", "181-187"));
		traz4.add(new Mezmur("በእንተ ቤተ ክርስቲያን\nበእንተ ሀገሪትነ ኢትዮጵያ\nበእንተ ክረምት",
				"188-199\n200-201\n202"));
		traz4.add(new Mezmur("ቁም ዜማ\nበእንተ ጾም", "203-205\n206-210"));

		ArrayList<Mezmur> language = new ArrayList<Mezmur>();
		language.add(new Mezmur("የኦሮምኛ መዝሙራት", "1-36"));
		language.add(new Mezmur("የወላይትኛ መዝሙራት", "37-48"));
		language.add(new Mezmur("የትግርኛ መዝሙራት", "49-82"));

		ArrayList<Mezmur> yemesqel = new ArrayList<Mezmur>();
		yemesqel.add(new Mezmur("የመስቀል መዝሙራት", "1-39"));
		yemesqel.add(new Mezmur("የምስጋና መዝሙራት", "40-68"));
		yemesqel.add(new Mezmur("የወላይትኛ መዝሙራት", "69-71"));
		yemesqel.add(new Mezmur("የኦሮምኛ መዝሙራት", "72-78"));
		yemesqel.add(new Mezmur("የትግርኛ መዝሙራት", "79-83"));
		ArrayList<Mezmur> zema = new ArrayList<Mezmur>();

		pSubItemArrayList1 = new ArrayList<SubCategory>();

		pSubItemArrayList1.add(new SubCategory("ጥራዝ ፩", traz1));
		pSubItemArrayList1.add(new SubCategory("ጥራዝ ፪", traz2));
		pSubItemArrayList1.add(new SubCategory("ጥራዝ ፫", traz3));
		pSubItemArrayList1.add(new SubCategory("ጥራዝ ፬", traz4));
		pSubItemArrayList1.add(new SubCategory("የቋንቋ መዝሙራት", language));
		pSubItemArrayList1.add(new SubCategory("የመስቀል መዝሙራት", yemesqel));

		pSubItemArrayList2 = new ArrayList<SubCategory>();
		pSubItemArrayList2.add(new SubCategory("የዜማ መሣሪያዎች በኢ\\ኦ\\ተ\\ቤ", zema));
		pSubItemArrayList2.add(new SubCategory("ከበሮ", zema));
		pSubItemArrayList2.add(new SubCategory("በገና", zema));
		pSubItemArrayList2.add(new SubCategory("መሰንቆ", zema));
		pSubItemArrayList2.add(new SubCategory("ጸናጽል", zema));
		pSubItemArrayList2.add(new SubCategory("መለከት", zema));
		pSubItemArrayList2.add(new SubCategory("መቋሚያ", zema));
		pSubItemArrayList2.add(new SubCategory("እምቢልታ", zema));
		pSubItemArrayList2.add(new SubCategory("ዋሽንት", zema));

		none = new ArrayList<SubCategory>();
		pTitleArrayList = new ArrayList<Title>();
		pTitleArrayList.add(new Title("መዝሙር ጥራዝ", pSubItemArrayList1));
		pTitleArrayList.add(new Title("የዜማ መሣሪያዎች", pSubItemArrayList2));
		pTitleArrayList.add(new Title("የበገና መዝሙሮች", none));
		pTitleArrayList.add(new Title("ቅዱስ ያሬድ", none));
		pTitleArrayList.add(new Title("ስለ መዝሙር", none));
		pTitleArrayList.add(new Title("ስለኛ", none));
		pTitleArrayList.add(new Title("ያጋሩ", none));
		pTitleArrayList.add(new Title("እርዳታ", none));
		pTitleArrayList.add(new Title("ደረጃ ይስጡት", none));
		pTitleArrayList.add(new Title("ዘግተው ይውጡ", none));

		for (int i = 0; i < 10; i++) {
			LayoutInflater inflater = null;
			inflater = (LayoutInflater) getApplicationContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View mLinearView = inflater.inflate(R.layout.row_first, null);
			final TextView mTitleName = (TextView) mLinearView
					.findViewById(R.id.textViewName);

			final RelativeLayout mLinearFirstArrow = (RelativeLayout) mLinearView
					.findViewById(R.id.linearFirst);
			final ImageView mImageArrowFirst = (ImageView) mLinearView
					.findViewById(R.id.imageFirstArrow);
			final LinearLayout mLinearScrollSecond = (LinearLayout) mLinearView
					.findViewById(R.id.linear_scroll);
			final View view = (View) mLinearView.findViewById(R.id.view);

			final int m = i;

			view.setBackgroundResource(R.drawable.back2);

			if (i == 0 || i == 1) {
				if (isFirstViewClick == false) {
					mLinearScrollSecond.setVisibility(View.GONE);
					mImageArrowFirst.setBackgroundResource(R.drawable.right4);
				} else {
					mLinearScrollSecond.setVisibility(View.VISIBLE);
					mImageArrowFirst
							.setBackgroundResource(R.drawable.abs__spinner_ab_default_holo_dark);
				}
				mLinearFirstArrow
						.setOnClickListener(new View.OnClickListener() {

							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								if (isFirstViewClick == false) {
									isFirstViewClick = true;
									mImageArrowFirst
											.setBackgroundResource(R.drawable.abs__spinner_ab_default_holo_dark);
									mLinearScrollSecond
											.setVisibility(View.VISIBLE);
								} else {
									isFirstViewClick = false;
									mImageArrowFirst
											.setBackgroundResource(R.drawable.right4);
									mLinearScrollSecond
											.setVisibility(View.GONE);
								}
							}
						});
			} else {
				if (i == 2 || i == 3) {
					mImageArrowFirst.setBackgroundResource(R.drawable.right4);

				} else if (i == 4) {
					mImageArrowFirst.setBackgroundResource(R.drawable.right4);

					view.setBackgroundResource(R.drawable.bac);

				} else if (i == 5) {
					mImageArrowFirst
							.setBackgroundResource(android.R.drawable.ic_menu_info_details);
				} else if (i == 6) {
					mImageArrowFirst
							.setBackgroundResource(android.R.drawable.ic_menu_share);
				} else if (i == 7) {
					mImageArrowFirst
							.setBackgroundResource(android.R.drawable.ic_menu_help);
				} else if (i == 8) {
					mImageArrowFirst
							.setBackgroundResource(android.R.drawable.star_big_off);
				} else if (i == 9) {
					mImageArrowFirst
							.setBackgroundResource(android.R.drawable.ic_menu_close_clear_cancel);
				}

				mLinearFirstArrow
						.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								if (m == 2) {
									Intent intent = new Intent(
											getApplicationContext(),
											Begena.class);
									startActivity(intent);
								} else if (m == 3) {
									Intent intent = new Intent(
											getApplicationContext(),
											KidusYared.class);
									startActivity(intent);
								} else if (m == 4) {
									Intent intent = new Intent(
											getApplicationContext(),
											Mezmurr.class);
									startActivity(intent);
								} else if (m == 5) {
									Intent intent = new Intent(
											getApplicationContext(),
											About.class);
									startActivity(intent);
								} else if (m == 6) {
									shareApplication();
								} else if (m == 7) {
									Intent intent = new Intent(
											getApplicationContext(),
											HelpMe.class);
									startActivity(intent);
								} else if (m == 8) {
									closeDrawer();
									AppRater.app_launched(MainActivity.this);
								} else if (m == 9) {
									onBackPressed();
								}
							}
						});
			}

			final String name = pTitleArrayList.get(i).getmezmurName();
			mTitleName.setText(name);

			for (int j = 0; j < pTitleArrayList.get(i).getmezmurList().size(); j++) {
				LayoutInflater inflater2 = null;
				inflater2 = (LayoutInflater) getApplicationContext()
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View mLinearView2 = inflater2
						.inflate(R.layout.row_second, null);

				TextView mSubItemName = (TextView) mLinearView2
						.findViewById(R.id.textViewTitle);
				final RelativeLayout mLinearSecondArrow = (RelativeLayout) mLinearView2
						.findViewById(R.id.linearSecond);
				final ImageView mImageArrowSecond = (ImageView) mLinearView2
						.findViewById(R.id.imageSecondArrow);
				final LinearLayout mLinearScrollThird = (LinearLayout) mLinearView2
						.findViewById(R.id.linear_scroll_third);
				final View view2 = (View) mLinearView2.findViewById(R.id.view2);
				view2.setBackgroundResource(R.drawable.back2);
				final int j2 = j;
				if (m == 1) {
					// mSubItemName.setBackgroundResource(android.R.color.darker_gray);

					mImageArrowSecond.setBackgroundResource(R.drawable.right4);
					ColorDrawable color = new ColorDrawable(
							Color.parseColor("#9cadbf"));
					mLinearSecondArrow
							.setBackgroundColor(android.R.color.transparent);
					mLinearSecondArrow
							.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									if (j2 == 0) {
										Intent intent = new Intent(
												getApplicationContext(),
												Zema.class);
										startActivity(intent);
									} else if (j2 == 1) {
										Intent intent = new Intent(
												getApplicationContext(),
												Kebero.class);
										startActivity(intent);
									} else if (j2 == 2) {
										Intent intent = new Intent(
												getApplicationContext(),
												Begena2.class);
										startActivity(intent);
									} else if (j2 == 3) {
										Intent intent = new Intent(
												getApplicationContext(),
												Masinko.class);
										startActivity(intent);
									} else if (j2 == 4) {
										Intent intent = new Intent(
												getApplicationContext(),
												Tsnatsl.class);
										startActivity(intent);
									} else if (j2 == 5) {
										Intent intent = new Intent(
												getApplicationContext(),
												Meleket.class);
										startActivity(intent);
									} else if (j2 == 6) {
										Intent intent = new Intent(
												getApplicationContext(),
												Mekuamia.class);
										startActivity(intent);
									} else if (j2 == 7) {
										Intent intent = new Intent(
												getApplicationContext(),
												Embilta.class);
										startActivity(intent);
									} else if (j2 == 8) {
										Intent intent = new Intent(
												getApplicationContext(),
												Washnt.class);
										startActivity(intent);
									}
								}
							});

				} else {
					if (isSecondViewClick == false) {
						mLinearScrollThird.setVisibility(View.GONE);
						mImageArrowSecond
								.setBackgroundResource(R.drawable.right4);
					} else {
						mLinearScrollThird.setVisibility(View.VISIBLE);
						mImageArrowSecond
								.setBackgroundResource(R.drawable.abs__spinner_ab_default_holo_dark);
					}
					mLinearSecondArrow
							.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									if (isSecondViewClick == false) {
										isSecondViewClick = true;
										mImageArrowSecond
												.setBackgroundResource(R.drawable.abs__spinner_ab_default_holo_dark);
										mLinearScrollThird
												.setVisibility(View.VISIBLE);
									} else {
										isSecondViewClick = false;
										mImageArrowSecond
												.setBackgroundResource(R.drawable.right4);
										mLinearScrollThird
												.setVisibility(View.GONE);
									}

								}
							});
				}
				final String catName = pTitleArrayList.get(i).getmezmurList()
						.get(j).getpSubCatName();
				mSubItemName.setText(catName);

				for (int k = 0; k < pTitleArrayList.get(i).getmezmurList()
						.get(j).getmMezmurArray().size(); k++) {
					LayoutInflater inflater3 = null;
					inflater3 = (LayoutInflater) getApplicationContext()
							.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
					View mLinearView3 = inflater3.inflate(R.layout.row_third,
							null);

					TextView mezmurNameCopy = (TextView) mLinearView3
							.findViewById(R.id.textViewItemName);
					TextView mezmurPageNumberCopy = (TextView) mLinearView3
							.findViewById(R.id.textViewItemPrice);
					final String mezmurName = pTitleArrayList.get(i)
							.getmezmurList().get(j).getmMezmurArray().get(k)
							.getItemName();
					final String mezmurPageNumber = pTitleArrayList.get(i)
							.getmezmurList().get(j).getmMezmurArray().get(k)
							.getItemPrice();
					mezmurNameCopy.setText(mezmurName);
					mezmurPageNumberCopy.setText(mezmurPageNumber);
					final int selected = k, ii = i, jj = j;
					mLinearView3.setOnClickListener(new OnClickListener() {
						public void onClick(View v) {

							Intent intent;
							if (ii == 0) {
								if (jj == 0) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Tiraz11.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Tiraz12.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Tiraz13.class);
										startActivity(intent);
									} else if (selected == 3) {
										intent = new Intent(MainActivity.this,
												Tiraz14.class);
										startActivity(intent);
									} else if (selected == 4) {
										intent = new Intent(MainActivity.this,
												Tiraz15.class);
										startActivity(intent);
									} else if (selected == 5) {
										intent = new Intent(MainActivity.this,
												Tiraz16.class);
										startActivity(intent);
									} else if (selected == 6) {
										intent = new Intent(MainActivity.this,
												Tiraz17.class);
										startActivity(intent);
									} else if (selected == 7) {
										intent = new Intent(MainActivity.this,
												Tiraz18.class);
										startActivity(intent);
									} else if (selected == 8) {
										intent = new Intent(MainActivity.this,
												Tiraz19.class);
										startActivity(intent);
									} else if (selected == 9) {
										intent = new Intent(MainActivity.this,
												Tiraz110.class);
										startActivity(intent);
									} else if (selected == 10) {
										intent = new Intent(MainActivity.this,
												Tiraz111.class);
										startActivity(intent);
									} else if (selected == 11) {
										intent = new Intent(MainActivity.this,
												Tiraz112.class);
										startActivity(intent);
									} else if (selected == 12) {
										intent = new Intent(MainActivity.this,
												Tiraz113.class);
										startActivity(intent);
									} else if (selected == 13) {
										intent = new Intent(MainActivity.this,
												Tiraz114.class);
										startActivity(intent);
									}
								} else if (jj == 1) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Tiraz21.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Tiraz22.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Tiraz23.class);
										startActivity(intent);
									} else if (selected == 3) {
										intent = new Intent(MainActivity.this,
												Tiraz24.class);
										startActivity(intent);
									} else if (selected == 4) {
										intent = new Intent(MainActivity.this,
												Tiraz25.class);
										startActivity(intent);
									} else if (selected == 5) {
										intent = new Intent(MainActivity.this,
												Tiraz26.class);
										startActivity(intent);
									} else if (selected == 6) {
										intent = new Intent(MainActivity.this,
												Tiraz27.class);
										startActivity(intent);
									} else if (selected == 7) {
										intent = new Intent(MainActivity.this,
												Tiraz28.class);
										startActivity(intent);
									} else if (selected == 8) {
										intent = new Intent(MainActivity.this,
												Tiraz29.class);
										startActivity(intent);
									} else if (selected == 9) {
										intent = new Intent(MainActivity.this,
												Tiraz210.class);
										startActivity(intent);
									} else if (selected == 10) {
										intent = new Intent(MainActivity.this,
												Tiraz211.class);
										startActivity(intent);
									} else if (selected == 11) {
										intent = new Intent(MainActivity.this,
												Tiraz212.class);
										startActivity(intent);
									} else if (selected == 12) {
										intent = new Intent(MainActivity.this,
												Tiraz213.class);
										startActivity(intent);
									}
								}

								else if (jj == 2) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Tiraz31.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Tiraz32.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Tiraz33.class);
										startActivity(intent);
									} else if (selected == 3) {
										intent = new Intent(MainActivity.this,
												Tiraz34.class);
										startActivity(intent);
									} else if (selected == 4) {
										intent = new Intent(MainActivity.this,
												Tiraz35.class);
										startActivity(intent);
									} else if (selected == 5) {
										intent = new Intent(MainActivity.this,
												Tiraz36.class);
										startActivity(intent);
									} else if (selected == 6) {
										intent = new Intent(MainActivity.this,
												Tiraz37.class);
										startActivity(intent);
									} else if (selected == 7) {
										intent = new Intent(MainActivity.this,
												Tiraz38.class);
										startActivity(intent);
									} else if (selected == 8) {
										intent = new Intent(MainActivity.this,
												Tiraz39.class);
										startActivity(intent);
									} else if (selected == 9) {
										intent = new Intent(MainActivity.this,
												Tiraz310.class);
										startActivity(intent);
									} else if (selected == 10) {
										intent = new Intent(MainActivity.this,
												Tiraz311.class);
										startActivity(intent);
									}
								} else if (jj == 3) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Tiraz40.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Tiraz41.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Tiraz42.class);
										startActivity(intent);
									} else if (selected == 3) {
										intent = new Intent(MainActivity.this,
												Tiraz43.class);
										startActivity(intent);
									} else if (selected == 4) {
										intent = new Intent(MainActivity.this,
												Tiraz44.class);
										startActivity(intent);
									} else if (selected == 5) {
										intent = new Intent(MainActivity.this,
												Tiraz45.class);
										startActivity(intent);
									} else if (selected == 6) {
										intent = new Intent(MainActivity.this,
												Tiraz46.class);
										startActivity(intent);
									} else if (selected == 7) {
										intent = new Intent(MainActivity.this,
												Tiraz47.class);
										startActivity(intent);
									} else if (selected == 8) {
										intent = new Intent(MainActivity.this,
												Tiraz48.class);
										startActivity(intent);
									} else if (selected == 9) {
										intent = new Intent(MainActivity.this,
												Tiraz49.class);
										startActivity(intent);
									} else if (selected == 10) {
										intent = new Intent(MainActivity.this,
												Tiraz410.class);
										startActivity(intent);
									} else if (selected == 11) {
										intent = new Intent(MainActivity.this,
												Tiraz411.class);
										startActivity(intent);
									} else if (selected == 12) {
										intent = new Intent(MainActivity.this,
												Tiraz412.class);
										startActivity(intent);
									}
								} else if (jj == 4) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Tiraz413.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Tiraz414.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Tiraz415.class);
										startActivity(intent);
									}
								} else if (jj == 5) {
									if (selected == 0) {
										intent = new Intent(MainActivity.this,
												Yemesqel1.class);
										startActivity(intent);
									} else if (selected == 1) {
										intent = new Intent(MainActivity.this,
												Yemesqel2.class);
										startActivity(intent);
									} else if (selected == 2) {
										intent = new Intent(MainActivity.this,
												Yemesqel3.class);
										startActivity(intent);
									} else if (selected == 3) {
										intent = new Intent(MainActivity.this,
												Yemesqel4.class);
										startActivity(intent);
									} else if (selected == 4) {
										intent = new Intent(MainActivity.this,
												Yemesqel5.class);
										startActivity(intent);
									}
								}
							}
						}
					});
					mLinearScrollThird.addView(mLinearView3);
					mezmurNameCopy.setTypeface(face2);
					mezmurPageNumberCopy.setTypeface(face2);
				}
				mLinearScrollSecond.addView(mLinearView2);
				mSubItemName.setTypeface(face2);
			}

			mTitleName.setTypeface(face2);
			mLinearListView.addView(mLinearView);

		}

		actionbarToggleHandler();
		image();
	}

	public void closeDrawer() {
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mDrawerToggle.syncState();
		mDrawerLayout.closeDrawer(mscroll);
	}

	public void openDrawer() {
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mDrawerToggle.syncState();
		mDrawerLayout.openDrawer(mscroll);
	}

	private void actionbarToggleHandler() {
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			@Override
			public void onDrawerClosed(View drawerView) {

			}

			@Override
			public void onDrawerOpened(View drawerView) {

			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	public void image() {
		image = (ImageView) findViewById(R.id.image);
		image2 = (ImageView) findViewById(R.id.image1);
		textv = (TextView) findViewById(R.id.textv);
		image.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				openDrawer();

			}
		});
		linear = (LinearLayout) findViewById(R.id.linear);
		linear.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				openDrawer();

			}
		});
		image2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				openDrawer();

			}
		});
		textv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				openDrawer();

			}
		});
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	public void shareApplication() {
		closeDrawer();
		ApplicationInfo app = getApplicationContext().getApplicationInfo();
		String filePath = app.sourceDir;

		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("*/*");
		intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
		startActivity(intent.createChooser(intent, "Share app via"));
	}

	public void onBackPressed() {
		triggerDialog(MainActivity.this);
	}

	public void triggerDialog(Context mContext) {
		closeDrawer();
		final Dialog dialog = new Dialog(mContext);
		// Set Dialog No Title
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(
				new ColorDrawable(Color.TRANSPARENT));
		dialog.getWindow().setGravity(Gravity.CENTER);
		LinearLayout ll = new LinearLayout(mContext);
		LinearLayout l2 = new LinearLayout(mContext);

		ll.setOrientation(LinearLayout.VERTICAL);
		l2.setOrientation(LinearLayout.HORIZONTAL);
		l2.setGravity(Gravity.CENTER_HORIZONTAL);
		ll.setBackgroundResource(R.drawable.border4);
		Typeface face = Typeface.createFromAsset(mContext.getAssets(),
				"fonts/gfzemenu.ttf");

		TextView tv = new TextView(mContext);
		tv.setText("ልትዘጉኝ ነው?");

		tv.setPadding(4, 0, 4, 10);
		tv.setTypeface(face);
		ll.addView(tv);

		// First Button
		Button b1 = new Button(mContext);
		b1.setBackgroundResource(R.drawable.pop);
		b1.setText("አይ");
		b1.setTypeface(face);
		b1.setGravity(Gravity.CENTER);
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				dialog.dismiss();
			}
		});
		l2.addView(b1);
		TextView tv2 = new TextView(mContext);
		tv2.setText("       ");
		tv2.setGravity(Gravity.CENTER);
		l2.addView(tv2);
		// Second Button
		Button b2 = new Button(mContext);
		b2.setBackgroundResource(R.drawable.pop);
		b2.setText("አዎ");
		b2.setTypeface(face);
		b2.setGravity(Gravity.CENTER);
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
				System.exit(0);
			}
		});

		l2.addView(b2);
		ll.addView(l2);

		dialog.setContentView(ll);

		// Show Dialog
		dialog.show();

	}

	@Override
	public boolean onClose() {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public boolean onQueryTextChange(String query) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onQueryTextSubmit(String query) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void onNewIntent(Intent intent) {
		handleIntent(intent);
	}

	private void handleIntent(Intent intent) {

		if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
			String query = intent.getStringExtra(SearchManager.QUERY);
			// use the query to search
		}
	}

	public void loadData() {

	}

	public void expandAll() {
		int count = listAdapter.getGroupCount();
		for (int i = 0; i < count; i++) {
			myList.expandGroup(count);
		}
	}

	public void displayList() {
		loadData();
		// myList=(ExpandableListView) findViewById(R.id.expandableListView);
		// listAdapter=new ListAdapter(MainActivity.this, Items,
		// ParentListItems);
		// myList.setAdapter(listAdapter);
	}
}
