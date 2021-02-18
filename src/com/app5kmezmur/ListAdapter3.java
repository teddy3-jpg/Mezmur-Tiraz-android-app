package com.app5kmezmur;

import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.app5kmezmur.R;

public class ListAdapter3 extends BaseExpandableListAdapter {
	private Activity context;
	private Map<String, List<String>> ParentListItems;
	private List<String> Items;

	public ListAdapter3(Activity context, List<String> Items,
			Map<String, List<String>> ParentListItems) {
		this.context = context;
		this.ParentListItems = ParentListItems;
		this.Items = Items;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return ParentListItems.get(Items.get(groupPosition)).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(final int groupPosition, final int childPosition,
			boolean isLastChild, View ListView, ViewGroup parent) {
		final String CoursesName = (String) getChild(groupPosition,
				childPosition);
		LayoutInflater inflater = context.getLayoutInflater();
		if (ListView == null) {
			ListView = inflater.inflate(R.layout.child_list_item2, null);
		}
		TextView item = (TextView) ListView.findViewById(R.id.textView2);
		item.setText(CoursesName);
		Typeface face2 = Typeface.createFromAsset(context.getAssets(),
				"fonts/gfzemenu.ttf");
		item.setTypeface(face2);
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
			ListView = infalInflater.inflate(R.layout.parent_list_item2, null);
		}
		TextView item = (TextView) ListView.findViewById(R.id.textView2);
		item.setText(CoursesFull);
		Typeface face2 = Typeface.createFromAsset(context.getAssets(),
				"fonts/gfzemenu.ttf");
		item.setTextSize(16);
		item.setTypeface(face2);
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
}