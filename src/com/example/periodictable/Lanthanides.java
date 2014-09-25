package com.example.periodictable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.text.util.Linkify;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class Lanthanides extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lanthanides);
		// Show the Up button in the action bar.
		setupActionBar();
		
		TextView noteView = (TextView) findViewById(R.id.textView4);
		Linkify.addLinks(noteView, Linkify.ALL);
	}

	
	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lanthanides, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	public void Lanthanum(View view)
	{
		Intent intent = new Intent(this,Lanthanum.class);
	    startActivity(intent);
	}
	
	public void Cerium(View view)
	{
		Intent intent = new Intent(this,Cerium.class);
	    startActivity(intent);
	}
	
	public void Praseodymium(View view)
	{
		Intent intent = new Intent(this,Praseodymium.class);
	    startActivity(intent);
	}
	
	public void Neodymium(View view)
	{
		Intent intent = new Intent(this,Neodymium.class);
	    startActivity(intent);
	}
	
	public void Promethium(View view)
	{
		Intent intent = new Intent(this,Promethium.class);
	    startActivity(intent);
	}
	
	public void Samarium(View view)
	{
		Intent intent = new Intent(this,Samarium.class);
	    startActivity(intent);
	}
	
	public void Europium(View view)
	{
		Intent intent = new Intent(this,Europium.class);
	    startActivity(intent);
	}
	
	public void Gadolinium(View view)
	{
		Intent intent = new Intent(this,Gadolinium.class);
	    startActivity(intent);
	}
	
	public void Terbium(View view)
	{
		Intent intent = new Intent(this,Terbium.class);
	    startActivity(intent);
	}
	
	public void Dysprosium(View view)
	{
		Intent intent = new Intent(this,Dysprosium.class);
	    startActivity(intent);
	}
	
	public void Holmium(View view)
	{
		Intent intent = new Intent(this,Holmium.class);
	    startActivity(intent);
	}
	
	public void Erbium(View view)
	{
		Intent intent = new Intent(this,Erbium.class);
	    startActivity(intent);
	}
	
	public void Thulium(View view)
	{
		Intent intent = new Intent(this,Thulium.class);
	    startActivity(intent);
	}
	
	public void Ytterbium(View view)
	{
		Intent intent = new Intent(this,Ytterbium.class);
	    startActivity(intent);
	}
	
	public void Lutetium(View view)
	{
		Intent intent = new Intent(this,Lutetium.class);
	    startActivity(intent);
	}

}
