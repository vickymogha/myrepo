package com.layout;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MyCustomLayout extends RelativeLayout{

	public MyCustomLayout(Context context) {
		super(context);

		Button btn = new Button(context);
		btn.setLayoutParams(getLayoutParams(96*2, 96));
		
		LayoutUtils.setXY(btn, LayoutUtils.getPropWidth(50),LayoutUtils.getPropHeight(800-300));
		this.addView(btn);
		
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				System.out.println("clicked me");
			}
		});
		
	}
	
	
	public LayoutParams getLayoutParams(int width, int height){
		return new LayoutParams((int)LayoutUtils.getPropWidth(width),(int) LayoutUtils.getPropHeight(height));
	}

}
