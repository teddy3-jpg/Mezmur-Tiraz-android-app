package com.app5kmezmur;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ExpandableListView.OnChildClickListener;
import com.app5kmezmur.R;

public class Wereb extends Activity {
	List<String> ChildList;
	Map<String, List<String>> ParentListItems;
	ExpandableListView expandablelistView;
	// EditText inputSearch;

	// Assign Parent list items here.
	List<String> ParentList = new ArrayList<String>();
	{
		ParentList.add("በጌቴ ሴማኔ: ቅኝት - ሠላምታ");

	}
	// Assign children list element using string array.

	String[] b1 = { "423 224 542 222\n423 115 113 224 542 222\n በጌቴ ሴማኔ በአትክልቱ ቦታ /2/\nለእኛ ሲል ጌታችን በዓለም ተንገላታ /2/\nአዳምና ሄዋን ባጠፉት ጥፋት /2/\nበእኛም ነበረብን የዘላለም ሞት /2/\nመስቀል ተሸክሞ ሲወጣ ተራራ /2/\nይገርፉት ነበረ ሁሉም በየተራ /2/\nድንግል አልቻለችም እንባዋን ልትገታ /2/\nእያየች በመስቀል ልጇ ሲንገላታ /2/\nበአምላክነቱ ሳይፈርድባቸው /2/\nእንዲህ ሲል ጸለየ አባት ሆይ ማራቸው /2/\nበረቂቅ ጥበቡ ሁሉን የፈጠረ /2/\nበሰዎች ተገርፎ ሞተ ተቀበረ /2/\nፍቅሩን የገለፀው ተወልዶ በሥጋ /2/\nኢየሱስ ጌታ ነው አልፋና ኦሜጋ /2/\n" };
	String[] ByDefalutMessage = { "በመጫን ላይ ነው። እባክዎትን ትንሽ ይጠብቁ!" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_wereb);
		ParentListItems = new LinkedHashMap<String, List<String>>();
		for (String HoldItem : ParentList) {
			if (HoldItem.equals("በጌቴ ሴማኔ: ቅኝት - ሠላምታ")) {
				loadChild(b1);
			} else
				loadChild(ByDefalutMessage);
			ParentListItems.put(HoldItem, ChildList);
		}
		expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
		final ExpandableListAdapter expListAdapter = new ListAdapter2(this,
				ParentList, ParentListItems);
		expandablelistView.setAdapter(expListAdapter);
		expandablelistView.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				return true;
			}
		});
		getActionBar().setDisplayHomeAsUpEnabled(true);

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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wereb, menu);
		return true;
	}
}
