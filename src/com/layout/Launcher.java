package com.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;

public class Launcher extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_launcher);
		LayoutUtils.setContext(this);
		System.out.println(LayoutUtils.getWindowWidth() + " x "+ LayoutUtils.getWindowHeight());
		
		MyCustomLayout myLayout = new MyCustomLayout(this);
		setContentView(myLayout,new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}

}
