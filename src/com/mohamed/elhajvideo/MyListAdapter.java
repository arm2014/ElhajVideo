package com.mohamed.elhajvideo;

import java.util.ArrayList;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
	
	private LayoutInflater inflater;
	private Context context;
	private ArrayList<String> stepsLink=new ArrayList<String>();
	private String[] stepsName;
	public MyListAdapter(Context c) {
		// TODO Auto-generated constructor stub
		context=c;
		stepsName=context.getResources().getStringArray(R.array.stepsName);
		stepsLink.add("https://www.youtube.com/watch?v=DevqAT5ExJg&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq&index=2");
		stepsLink.add("https://www.youtube.com/watch?v=oAlbFp19zSM&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=09OdGwIA0bA&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=R-RlqM8imfM&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=q0kcawVZdiQ&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=0QRF99GR6j0&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=JhH5PUVzq80&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=s21dDdBmU8U&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=zQDtHuJAGuA&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=p4PVNbzMOAs&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=an3z6K9BI7M&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=BvtzklFSqlw&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=ZUFV0IpLc_o&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		stepsLink.add("https://www.youtube.com/watch?v=_rwtSU7MRDI&list=PLYgglhY0W_982NxwkTu3Z82li5HblStUq");
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return stepsName.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View view=null;
		if (arg1 == null ) {
			LayoutInflater inflator = ((Activity)context).getLayoutInflater();
			view = inflator.inflate(R.layout.main_list_item, null);
			
		}else{
			view =arg1;
		}
		
		TextView text=(TextView)view.findViewById(R.id.itemtext);
		text.setText(stepsName[arg0]);
		
		
		
		
		return view;
	}

}
