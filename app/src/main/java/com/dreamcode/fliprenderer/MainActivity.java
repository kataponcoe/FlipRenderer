package com.dreamcode.fliprenderer;

import com.dreamcode.fliprenderer.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import dreamcode.flip.FlipViewGroup;

public class MainActivity extends Activity {
	private FlipViewGroup contentView;
	
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		contentView = new FlipViewGroup(this);
		
		contentView.addFlipView(View.inflate(this, R.layout.render_merah, null));
		contentView.addFlipView(View.inflate(this, R.layout.render_hijau, null));
		contentView.addFlipView(View.inflate(this, R.layout.render_biru, null));
		
		setContentView(contentView);
		
		contentView.startFlipping(); //ngebuat flipping
	}
}