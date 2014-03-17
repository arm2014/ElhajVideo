package com.mohamed.elhajvideo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView mainListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 mainListView=(ListView) findViewById(R.id.mainList);
		 mainListView.setAdapter(new MyListAdapter(this));
		
	}

	

}
