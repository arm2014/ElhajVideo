package com.mohamed.elhajvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	public static final int SPLASH_DELAYED=3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
		
				Intent intent=new Intent(SplashActivity.this,MainActivity.class);
				finish();
				startActivity(intent);
			}
		}, SPLASH_DELAYED);
	
	}
}
