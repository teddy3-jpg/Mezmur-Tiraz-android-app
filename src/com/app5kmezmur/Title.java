package com.app5kmezmur;

import java.util.ArrayList;

public class Title {

	private String mezmurName;

	private ArrayList<SubCategory> mezmurList;

	public Title(String mezmurName, ArrayList<SubCategory> mezmurList) {
		super();
		this.mezmurName = mezmurName;
		this.mezmurList = mezmurList;
	}

	public String getmezmurName() {
		return mezmurName;
	}

	public void setmezmurName(String mezmurName) {
		this.mezmurName = mezmurName;
	}

	public ArrayList<SubCategory> getmezmurList() {
		return mezmurList;
	}

	public void setmezmurList(ArrayList<SubCategory> mezmurList) {
		this.mezmurList = mezmurList;
	}

	public static class SubCategory {

		private String pSubCatName;
		private ArrayList<Mezmur> mMezmurArray;

		public SubCategory(String pSubCatName,
				ArrayList<Mezmur> mMezmurArray) {
			super();
			this.pSubCatName = pSubCatName;
			this.mMezmurArray = mMezmurArray;
		}

		public String getpSubCatName() {
			return pSubCatName;
		}

		public void setpSubCatName(String pSubCatName) {
			this.pSubCatName = pSubCatName;
		}

		public ArrayList<Mezmur> getmMezmurArray() {
			return mMezmurArray;
		}

		public void setmMezmurArray(ArrayList<Mezmur> mMezmurArray) {
			this.mMezmurArray = mMezmurArray;
		}

		public static class Mezmur {

			private String mezmurName;
			private String mezmurPageNumber;

			public Mezmur(String mezmurName, String mezmurPageNumber) {
				super();
				this.mezmurName = mezmurName;
				this.mezmurPageNumber = mezmurPageNumber;
			}

			public String getItemName() {
				return mezmurName;
			}

			public void setItemName(String mezmurName) {
				this.mezmurName = mezmurName;
			}

			public String getItemPrice() {
				return mezmurPageNumber;
			}

			public void setItemPrice(String mezmurPageNumber) {
				this.mezmurPageNumber = mezmurPageNumber;
			}

		}

	}

}
