package com.example.periodictable;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PeriodicTable extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_periodic_table);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.periodic_table, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.Metals:
	        	return true;
	        case R.id.Nonmetals:
	        	return true;
	        case R.id.Metalloids:
	        	allGray();
	        	metalloids();
	        	return true;
	        case R.id.Alkali_Metals:
	        	allGray();
	        	toOrange();
	        	return true;
	        case R.id.Alkaline_Metals:
	        	allGray();
	        	toYellow();
	        	return true;
	        case R.id.Transition_Metals:
	        	allGray();
	        	toPink();
	        	return true;
	        case R.id.Post_Transition_Metals:
	        	allGray();
	        	posttrans();
	        	return true;
	        case R.id.Lanthanides_Metals:
	        	allGray();
	        	lantha();
	        	return true;
	        case R.id.Actinides_Metals:
	        	allGray();
	        	acta();
	        	return true;
	        case R.id.other_nonmetals:
	        	allGray();
	        	othernonmetals();
	        	return true;
	        case R.id.halogens:
	        	allGray();
	        	halo();
	        	return true;
	        case R.id.Noble_gases:
	        	allGray();
	        	inert();
	        	return true;
	        case R.id.Reset:
	        	allGray();
	        	toOrange();
	        	toYellow();
	        	toPink();
	        	posttrans();
	        	halo();
	        	othernonmetals();
	        	lantha();
	        	acta();
	        	metalloids();
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void allGray()
	{
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.GRAY);
		Button b2 = (Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.GRAY);
		Button b3 = (Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.GRAY);
		Button b4 = (Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.GRAY);
		Button b5 = (Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.GRAY);
		Button b6 = (Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.GRAY);
		Button b7 = (Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.GRAY);
		Button b8 = (Button)findViewById(R.id.Button01);
		b8.setBackgroundColor(Color.GRAY);
		
		Button b9 = (Button)findViewById(R.id.Button02);
		b9.setBackgroundColor(Color.GRAY);
		Button b10 = (Button)findViewById(R.id.Button03);
		b10.setBackgroundColor(Color.GRAY);
		Button b11 = (Button)findViewById(R.id.Button04);
		b11.setBackgroundColor(Color.GRAY);
		Button b12 = (Button)findViewById(R.id.Button05);
		b12.setBackgroundColor(Color.GRAY);
		Button b13 = (Button)findViewById(R.id.Button06);
		b13.setBackgroundColor(Color.GRAY);
		Button b14 = (Button)findViewById(R.id.Button07);
		b14.setBackgroundColor(Color.GRAY);
		Button b15 = (Button)findViewById(R.id.Button08);
		b15.setBackgroundColor(Color.GRAY);
		Button b16 = (Button)findViewById(R.id.Button09);
		b16.setBackgroundColor(Color.GRAY);
		
		Button b17 = (Button)findViewById(R.id.Button10);
		b17.setBackgroundColor(Color.GRAY);
		Button b18 = (Button)findViewById(R.id.Button11);
		b18.setBackgroundColor(Color.GRAY);
		Button b19 = (Button)findViewById(R.id.Button12);
		b19.setBackgroundColor(Color.GRAY);
		Button b20 = (Button)findViewById(R.id.Button13);
		b20.setBackgroundColor(Color.GRAY);
		Button b21 = (Button)findViewById(R.id.Button14);
		b21.setBackgroundColor(Color.GRAY);
		Button b22 = (Button)findViewById(R.id.Button15);
		b22.setBackgroundColor(Color.GRAY);
		Button b23 = (Button)findViewById(R.id.Button16);
		b23.setBackgroundColor(Color.GRAY);
		Button b24 = (Button)findViewById(R.id.Button17);
		b24.setBackgroundColor(Color.GRAY);
		
		Button b25 = (Button)findViewById(R.id.Button18);
		b25.setBackgroundColor(Color.GRAY);
		Button b26 = (Button)findViewById(R.id.Button19);
		b26.setBackgroundColor(Color.GRAY);
		Button b27 = (Button)findViewById(R.id.Button20);
		b27.setBackgroundColor(Color.GRAY);
		Button b28 = (Button)findViewById(R.id.Button21);
		b28.setBackgroundColor(Color.GRAY);
		Button b29 = (Button)findViewById(R.id.Button22);
		b29.setBackgroundColor(Color.GRAY);
		Button b30 = (Button)findViewById(R.id.Button23);
		b30.setBackgroundColor(Color.GRAY);
		Button b31 = (Button)findViewById(R.id.Button24);
		b31.setBackgroundColor(Color.GRAY);
		Button b32 = (Button)findViewById(R.id.Button25);
		b32.setBackgroundColor(Color.GRAY);
		
		Button b33 = (Button)findViewById(R.id.Button26);
		b33.setBackgroundColor(Color.GRAY);
		Button b34 = (Button)findViewById(R.id.Button27);
		b34.setBackgroundColor(Color.GRAY);
		Button b35 = (Button)findViewById(R.id.Button28);
		b35.setBackgroundColor(Color.GRAY);
		Button b36 = (Button)findViewById(R.id.Button29);
		b36.setBackgroundColor(Color.GRAY);
		Button b37 = (Button)findViewById(R.id.Button30);
		b37.setBackgroundColor(Color.GRAY);
		Button b38 = (Button)findViewById(R.id.Button31);
		b38.setBackgroundColor(Color.GRAY);
		Button b39 = (Button)findViewById(R.id.Button32);
		b39.setBackgroundColor(Color.GRAY);
		Button b40 = (Button)findViewById(R.id.Button33);
		b40.setBackgroundColor(Color.GRAY);
		
		Button b41 = (Button)findViewById(R.id.Button34);
		b41.setBackgroundColor(Color.GRAY);
		Button b42 = (Button)findViewById(R.id.Button35);
		b42.setBackgroundColor(Color.GRAY);
		Button b43 = (Button)findViewById(R.id.Button36);
		b43.setBackgroundColor(Color.GRAY);
		Button b44 = (Button)findViewById(R.id.Button37);
		b44.setBackgroundColor(Color.GRAY);
		Button b45 = (Button)findViewById(R.id.Button38);
		b45.setBackgroundColor(Color.GRAY);
		Button b46 = (Button)findViewById(R.id.Button39);
		b46.setBackgroundColor(Color.GRAY);
		Button b47 = (Button)findViewById(R.id.Button40);
		b47.setBackgroundColor(Color.GRAY);
		Button b48 = (Button)findViewById(R.id.Button41);
		b48.setBackgroundColor(Color.GRAY);
		
		Button b49 = (Button)findViewById(R.id.Button42);
		b49.setBackgroundColor(Color.GRAY);
		Button b50 = (Button)findViewById(R.id.Button43);
		b50.setBackgroundColor(Color.GRAY);
		Button b51 = (Button)findViewById(R.id.Button44);
		b51.setBackgroundColor(Color.GRAY);
		Button b52 = (Button)findViewById(R.id.Button45);
		b52.setBackgroundColor(Color.GRAY);
		Button b53 = (Button)findViewById(R.id.Button46);
		b53.setBackgroundColor(Color.GRAY);
		Button b54 = (Button)findViewById(R.id.Button47);
		b54.setBackgroundColor(Color.GRAY);
		Button b55 = (Button)findViewById(R.id.Button48);
		b55.setBackgroundColor(Color.GRAY);
		Button b56 = (Button)findViewById(R.id.Button49);
		b56.setBackgroundColor(Color.GRAY);
		
		Button b57 = (Button)findViewById(R.id.Button50);
		b57.setBackgroundColor(Color.GRAY);
		Button b58 = (Button)findViewById(R.id.Button51);
		b58.setBackgroundColor(Color.GRAY);
		Button b59 = (Button)findViewById(R.id.Button52);
		b59.setBackgroundColor(Color.GRAY);
		Button b60 = (Button)findViewById(R.id.Button53);
		b60.setBackgroundColor(Color.GRAY);
		Button b61 = (Button)findViewById(R.id.Button54);
		b61.setBackgroundColor(Color.GRAY);
		Button b62 = (Button)findViewById(R.id.Button55);
		b62.setBackgroundColor(Color.GRAY);
		Button b63 = (Button)findViewById(R.id.Button56);
		b63.setBackgroundColor(Color.GRAY);
		Button b64 = (Button)findViewById(R.id.Button57);
		b64.setBackgroundColor(Color.GRAY);
		
		Button b65 = (Button)findViewById(R.id.Button58);
		b65.setBackgroundColor(Color.GRAY);
		Button b66 = (Button)findViewById(R.id.Button59);
		b66.setBackgroundColor(Color.GRAY);
		Button b67 = (Button)findViewById(R.id.Button60);
		b67.setBackgroundColor(Color.GRAY);
		Button b68 = (Button)findViewById(R.id.Button61);
		b68.setBackgroundColor(Color.GRAY);
		Button b69 = (Button)findViewById(R.id.Button62);
		b69.setBackgroundColor(Color.GRAY);
		Button b70 = (Button)findViewById(R.id.Button63);
		b70.setBackgroundColor(Color.GRAY);
		Button b71 = (Button)findViewById(R.id.Button64);
		b71.setBackgroundColor(Color.GRAY);
		Button b72 = (Button)findViewById(R.id.Button65);
		b72.setBackgroundColor(Color.GRAY);
		
		Button b73 = (Button)findViewById(R.id.Button66);
		b73.setBackgroundColor(Color.GRAY);
		Button b74 = (Button)findViewById(R.id.Button67);
		b74.setBackgroundColor(Color.GRAY);
		Button b75 = (Button)findViewById(R.id.Button68);
		b75.setBackgroundColor(Color.GRAY);
		Button b76 = (Button)findViewById(R.id.Button69);
		b76.setBackgroundColor(Color.GRAY);
		Button b77 = (Button)findViewById(R.id.Button70);
		b77.setBackgroundColor(Color.GRAY);
		Button b78 = (Button)findViewById(R.id.Button71);
		b78.setBackgroundColor(Color.GRAY);
		Button b79 = (Button)findViewById(R.id.Button72);
		b79.setBackgroundColor(Color.GRAY);
		Button b80 = (Button)findViewById(R.id.Button73);
		b80.setBackgroundColor(Color.GRAY);
		
		Button b81 = (Button)findViewById(R.id.Button74);
		b81.setBackgroundColor(Color.GRAY);
		Button b82 = (Button)findViewById(R.id.Button75);
		b82.setBackgroundColor(Color.GRAY);
		Button b83 = (Button)findViewById(R.id.Button76);
		b83.setBackgroundColor(Color.GRAY);
		Button b84 = (Button)findViewById(R.id.Button77);
		b84.setBackgroundColor(Color.GRAY);
		Button b85 = (Button)findViewById(R.id.Button78);
		b85.setBackgroundColor(Color.GRAY);
		Button b86 = (Button)findViewById(R.id.Button79);
		b86.setBackgroundColor(Color.GRAY);
		Button b87 = (Button)findViewById(R.id.Button80);
		b87.setBackgroundColor(Color.GRAY);
		Button b88 = (Button)findViewById(R.id.Button81);
		b88.setBackgroundColor(Color.GRAY);
		
		Button b89 = (Button)findViewById(R.id.Button82);
		b89.setBackgroundColor(Color.GRAY);
		Button b90 = (Button)findViewById(R.id.Button83);
		b90.setBackgroundColor(Color.GRAY);
	}
	
	public void toOrange()
	{
		Button b2 = (Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.parseColor("#ffa500"));
		Button b3 = (Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.parseColor("#ffa500"));
		Button b4 = (Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.parseColor("#ffa500"));
		Button b5 = (Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.parseColor("#ffa500"));
		Button b6 = (Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.parseColor("#ffa500"));
		Button b7 = (Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.parseColor("#ffa500"));
	}
	
	public void toYellow()
	{
		Button b8 = (Button)findViewById(R.id.Button01);
		b8.setBackgroundColor(Color.YELLOW);
		
		Button b9 = (Button)findViewById(R.id.Button02);
		b9.setBackgroundColor(Color.YELLOW);
		Button b10 = (Button)findViewById(R.id.Button03);
		b10.setBackgroundColor(Color.YELLOW);
		Button b11 = (Button)findViewById(R.id.Button04);
		b11.setBackgroundColor(Color.YELLOW);
		Button b12 = (Button)findViewById(R.id.Button05);
		b12.setBackgroundColor(Color.YELLOW);
		Button b13 = (Button)findViewById(R.id.Button06);
		b13.setBackgroundColor(Color.YELLOW);
	}

	public void toPink()
	{
		Button b14 = (Button)findViewById(R.id.Button07);
		b14.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b15 = (Button)findViewById(R.id.Button08);
		b15.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b16 = (Button)findViewById(R.id.Button09);
		b16.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b17 = (Button)findViewById(R.id.Button10);
		b17.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b18 = (Button)findViewById(R.id.Button11);
		b18.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b19 = (Button)findViewById(R.id.Button12);
		b19.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b20 = (Button)findViewById(R.id.Button13);
		b20.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b21 = (Button)findViewById(R.id.Button14);
		b21.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b22 = (Button)findViewById(R.id.Button15);
		b22.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b23 = (Button)findViewById(R.id.Button16);
		b23.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b30 = (Button)findViewById(R.id.Button23);
		b30.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b31 = (Button)findViewById(R.id.Button24);
		b31.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b32 = (Button)findViewById(R.id.Button25);
		b32.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b33 = (Button)findViewById(R.id.Button26);
		b33.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b34 = (Button)findViewById(R.id.Button27);
		b34.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b35 = (Button)findViewById(R.id.Button28);
		b35.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b36 = (Button)findViewById(R.id.Button29);
		b36.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b37 = (Button)findViewById(R.id.Button30);
		b37.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b38 = (Button)findViewById(R.id.Button31);
		b38.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b39 = (Button)findViewById(R.id.Button32);
		b39.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b47 = (Button)findViewById(R.id.Button40);
		b47.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b48 = (Button)findViewById(R.id.Button41);
		b48.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b49 = (Button)findViewById(R.id.Button42);
		b49.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b50 = (Button)findViewById(R.id.Button43);
		b50.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b51 = (Button)findViewById(R.id.Button44);
		b51.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b52 = (Button)findViewById(R.id.Button45);
		b52.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b53 = (Button)findViewById(R.id.Button46);
		b53.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b54 = (Button)findViewById(R.id.Button47);
		b54.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b55 = (Button)findViewById(R.id.Button48);
		b55.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b57 = (Button)findViewById(R.id.Button50);
		b57.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b58 = (Button)findViewById(R.id.Button51);
		b58.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b59 = (Button)findViewById(R.id.Button52);
		b59.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b60 = (Button)findViewById(R.id.Button53);
		b60.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b61 = (Button)findViewById(R.id.Button54);
		b61.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b62 = (Button)findViewById(R.id.Button55);
		b62.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b63 = (Button)findViewById(R.id.Button56);
		b63.setBackgroundColor(Color.parseColor("#f778A1"));
		Button b64 = (Button)findViewById(R.id.Button57);
		b64.setBackgroundColor(Color.parseColor("#f778A1"));
		
		Button b65 = (Button)findViewById(R.id.Button58);
		b65.setBackgroundColor(Color.parseColor("#f778A1"));
		
		
	}
	
	public void posttrans()
	{
		Button b24 = (Button)findViewById(R.id.Button17);
		b24.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b88 = (Button)findViewById(R.id.Button81);
		b88.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b40 = (Button)findViewById(R.id.Button33);
		b40.setBackgroundColor(Color.parseColor("#99c68e"));
		
		Button b41 = (Button)findViewById(R.id.Button34);
		b41.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b66 = (Button)findViewById(R.id.Button59);
		b66.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b67 = (Button)findViewById(R.id.Button60);
		b67.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b68 = (Button)findViewById(R.id.Button61);
		b68.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b69 = (Button)findViewById(R.id.Button62);
		b69.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b70 = (Button)findViewById(R.id.Button63);
		b70.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b71 = (Button)findViewById(R.id.Button64);
		b71.setBackgroundColor(Color.parseColor("#99c68e"));
		Button b72 = (Button)findViewById(R.id.Button65);
		b72.setBackgroundColor(Color.parseColor("#99c68e"));
	}

	public void lantha()
	{
		Button b46 = (Button)findViewById(R.id.Button39);
		b46.setBackgroundColor(Color.parseColor("#ecd672"));
	}
	
	public void acta()
	{
		Button b56 = (Button)findViewById(R.id.Button49);
		b56.setBackgroundColor(Color.parseColor("#95b9c7"));
	}
	
	public void inert()
	{
		Button b76 = (Button)findViewById(R.id.Button69);
		b76.setBackgroundColor(Color.RED);
		Button b77 = (Button)findViewById(R.id.Button70);
		b77.setBackgroundColor(Color.RED);
		Button b78 = (Button)findViewById(R.id.Button71);
		b78.setBackgroundColor(Color.RED);
		Button b79 = (Button)findViewById(R.id.Button72);
		b79.setBackgroundColor(Color.RED);
		Button b80 = (Button)findViewById(R.id.Button73);
		b80.setBackgroundColor(Color.RED);
		Button b29 = (Button)findViewById(R.id.Button22);
		b29.setBackgroundColor(Color.RED);
		Button b45 = (Button)findViewById(R.id.Button38);
		b45.setBackgroundColor(Color.RED);
	}
	
	public void halo()
	{
		Button b74 = (Button)findViewById(R.id.Button67);
		b74.setBackgroundColor(Color.parseColor("#306eff"));
		Button b75 = (Button)findViewById(R.id.Button68);
		b75.setBackgroundColor(Color.parseColor("#306eff"));
		Button b81 = (Button)findViewById(R.id.Button74);
		b81.setBackgroundColor(Color.parseColor("#306eff"));
		Button b82 = (Button)findViewById(R.id.Button75);
		b82.setBackgroundColor(Color.parseColor("#306eff"));
		Button b28 = (Button)findViewById(R.id.Button21);
		b28.setBackgroundColor(Color.parseColor("#306eff"));
		Button b44 = (Button)findViewById(R.id.Button37);
		b44.setBackgroundColor(Color.parseColor("#306eff"));
	}
	
	public void othernonmetals()
	{
		Button b83 = (Button)findViewById(R.id.Button76);
		b83.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b84 = (Button)findViewById(R.id.Button77);
		b84.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b85 = (Button)findViewById(R.id.Button78);
		b85.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b86 = (Button)findViewById(R.id.Button79);
		b86.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b87 = (Button)findViewById(R.id.Button80);
		b87.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b27 = (Button)findViewById(R.id.Button20);
		b27.setBackgroundColor(Color.parseColor("#ADD8E6"));
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.parseColor("#ADD8E6"));
	}
	
	public void metalloids()
	{
		Button b89 = (Button)findViewById(R.id.Button82);
		b89.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b90 = (Button)findViewById(R.id.Button83);
		b90.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b25 = (Button)findViewById(R.id.Button18);
		b25.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b26 = (Button)findViewById(R.id.Button19);
		b26.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b42 = (Button)findViewById(R.id.Button35);
		b42.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b43 = (Button)findViewById(R.id.Button36);
		b43.setBackgroundColor(Color.parseColor("#4AA02C"));
		Button b73 = (Button)findViewById(R.id.Button66);
		b73.setBackgroundColor(Color.parseColor("#4AA02C"));
	}
	
	public void Lanthanides(View view)
	{
		Intent intent = new Intent(this, Lanthanides.class);
	    startActivity(intent);
	}
	
	public void Actinides(View view)
	{
		Intent intent = new Intent(this, Actinides.class);
	    startActivity(intent);
	}
	
	public void Hydrogen(View view)
	{
		Intent intent = new Intent(this, Hydrogen.class);
	    startActivity(intent);
	}
	
	public void Neon(View view)
	{
		Intent intent = new Intent(this, Neon.class);
	    startActivity(intent);
	}
	
	public void Helium(View view)
	{
		Intent intent = new Intent(this, Helium.class);
	    startActivity(intent);
	}

	public void Lithium(View view)
	{
		Intent intent = new Intent(this, Lithium.class);
	    startActivity(intent);
	}
	
	public void Beryllium(View view)
	{
		Intent intent = new Intent(this, Beryllium.class);
	    startActivity(intent);
	}
	
	public void Boron(View view)
	{
		Intent intent = new Intent(this, Boron.class);
	    startActivity(intent);
	}
	
	public void Carbon(View view)
	{
		Intent intent = new Intent(this,Carbon.class);
	    startActivity(intent);
	}
	
	public void Nitrogen(View view)
	{
		Intent intent = new Intent(this,Nitrogen.class);
	    startActivity(intent);
	}
	
	public void Oxygen(View view)
	{
		Intent intent = new Intent(this,Oxygen.class);
	    startActivity(intent);
	}
	
	public void Fluorine(View view)
	{
		Intent intent = new Intent(this,Fluorine.class);
	    startActivity(intent);
	}
	
	public void Sodium(View view)
	{
		Intent intent = new Intent(this,Sodium.class);
	    startActivity(intent);
	}
	
	public void Magnesium(View view)
	{
		Intent intent = new Intent(this,Magnesium.class);
	    startActivity(intent);
	}
	
	public void Aluminium(View view)
	{
		Intent intent = new Intent(this,Aluminium.class);
	    startActivity(intent);
	}
	
	public void Silicon(View view)
	{
		Intent intent = new Intent(this,Silicon.class);
	    startActivity(intent);
	}
	
	public void Phos(View view)
	{
		Intent intent = new Intent(this,Phos.class);
	    startActivity(intent);
	}
	
	public void Sulphur(View view)
	{
		Intent intent = new Intent(this,Sulphur.class);
	    startActivity(intent);
	}
	
	public void Chlor(View view)
	{
		Intent intent = new Intent(this,Chlor.class);
	    startActivity(intent);
	}
	
	public void Argon(View view)
	{
		Intent intent = new Intent(this,Argon.class);
	    startActivity(intent);
	}
	
	
	public void Potassium(View view)
	{
		Intent intent = new Intent(this,Potassium.class);
	    startActivity(intent);
	}
	
	public void Calcium(View view)
	{
		Intent intent = new Intent(this,Calcium.class);
	    startActivity(intent);
	}
	
	public void Scandium(View view)
	{
		Intent intent = new Intent(this,Scandium.class);
	    startActivity(intent);
	}
	
	public void Titanium(View view)
	{
		Intent intent = new Intent(this,Titanium.class);
	    startActivity(intent);
	}
	
	public void Vanadium(View view)
	{
		Intent intent = new Intent(this,Vanadium.class);
	    startActivity(intent);
	}
	
	public void Chromium(View view)
	{
		Intent intent = new Intent(this,Chromium.class);
	    startActivity(intent);
	}
	
	public void Manganese(View view)
	{
		Intent intent = new Intent(this,Manganese.class);
	    startActivity(intent);
	}
	
	public void Iron(View view)
	{
		Intent intent = new Intent(this,Iron.class);
	    startActivity(intent);
	}
	
	public void Cobalt(View view)
	{
		Intent intent = new Intent(this,Cobalt.class);
	    startActivity(intent);
	}
	
	public void Nickel(View view)
	{
		Intent intent = new Intent(this,Nickel.class);
	    startActivity(intent);
	}
	
	public void Copper(View view)
	{
		Intent intent = new Intent(this,Copper.class);
	    startActivity(intent);
	}
	
	public void Zinc(View view)
	{
		Intent intent = new Intent(this,Zinc.class);
	    startActivity(intent);
	}
	
	public void Gallium(View view)
	{
		Intent intent = new Intent(this,Gallium.class);
	    startActivity(intent);
	}
	
	public void Germanium(View view)
	{
		Intent intent = new Intent(this,Germanium.class);
	    startActivity(intent);
	}
	
	public void Arsenic(View view)
	{
		Intent intent = new Intent(this,Arsenic.class);
	    startActivity(intent);
	}
	
	public void Selenium(View view)
	{
		Intent intent = new Intent(this,Selenium.class);
	    startActivity(intent);
	}
	
	public void Bromine(View view)
	{
		Intent intent = new Intent(this,Bromine.class);
	    startActivity(intent);
	}
	
	public void Krypton(View view)
	{
		Intent intent = new Intent(this,Krypton.class);
	    startActivity(intent);
	}
	
	public void Rubidium(View view)
	{
		Intent intent = new Intent(this,Rubidium.class);
	    startActivity(intent);
	}
	
	public void Strontium(View view)
	{
		Intent intent = new Intent(this,Strontium.class);
	    startActivity(intent);
	}
	
	public void Yttrium(View view)
	{
		Intent intent = new Intent(this,Yttrium.class);
	    startActivity(intent);
	}
	
	public void Zirconium(View view)
	{
		Intent intent = new Intent(this,Zirconium.class);
	    startActivity(intent);
	}
	
	public void Niobium(View view)
	{
		Intent intent = new Intent(this,Niobium.class);
	    startActivity(intent);
	}
	
	public void Molybdenum(View view)
	{
		Intent intent = new Intent(this,Molybdenum.class);
	    startActivity(intent);
	}
	
	public void Technetium(View view)
	{
		Intent intent = new Intent(this,Technetium.class);
	    startActivity(intent);
	}
	
	public void Ruthenium(View view)
	{
		Intent intent = new Intent(this,Ruthenium.class);
	    startActivity(intent);
	}
	
	public void Rhodium(View view)
	{
		Intent intent = new Intent(this,Rhodium.class);
	    startActivity(intent);
	}
	
	public void Palladium(View view)
	{
		Intent intent = new Intent(this,Palladium.class);
	    startActivity(intent);
	}
	
	public void Silver(View view)
	{
		Intent intent = new Intent(this,Silver.class);
	    startActivity(intent);
	}
	
	public void Cadmium(View view)
	{
		Intent intent = new Intent(this,Cadmium.class);
	    startActivity(intent);
	}
	
	public void Indium(View view)
	{
		Intent intent = new Intent(this,Indium.class);
	    startActivity(intent);
	}
	
	public void Tin(View view)
	{
		Intent intent = new Intent(this,Tin.class);
	    startActivity(intent);
	}
	
	public void Antimony(View view)
	{
		Intent intent = new Intent(this,Antimony.class);
	    startActivity(intent);
	}
	
	public void Tellurium(View view)
	{
		Intent intent = new Intent(this,Tellurium.class);
	    startActivity(intent);
	}
	
	public void Iodine(View view)
	{
		Intent intent = new Intent(this,Iodine.class);
	    startActivity(intent);
	}
	
	public void Xenon(View view)
	{
		Intent intent = new Intent(this,Xenon.class);
	    startActivity(intent);
	}
	
	public void Caesium(View view)
	{
		Intent intent = new Intent(this,Caesium.class);
	    startActivity(intent);
	}
	
	
	public void Barium(View view)
	{
		Intent intent = new Intent(this,Barium.class);
	    startActivity(intent);
	}
	
	public void Hafnium(View view)
	{
		Intent intent = new Intent(this,Hafnium.class);
	    startActivity(intent);
	}
	
	public void Tantalum(View view)
	{
		Intent intent = new Intent(this,Tantalum.class);
	    startActivity(intent);
	}
	
	public void Tungsten(View view)
	{
		Intent intent = new Intent(this,Tungsten.class);
	    startActivity(intent);
	}
	
	public void Rhenium(View view)
	{
		Intent intent = new Intent(this,Rhenium.class);
	    startActivity(intent);
	}
	
	public void Osmium(View view)
	{
		Intent intent = new Intent(this,Osmium.class);
	    startActivity(intent);
	}
	
	public void Iridium(View view)
	{
		Intent intent = new Intent(this,Iridium.class);
	    startActivity(intent);
	}
	
	public void Platinum(View view)
	{
		Intent intent = new Intent(this,Platinum.class);
	    startActivity(intent);
	}
	
	public void Gold(View view)
	{
		Intent intent = new Intent(this,Gold.class);
	    startActivity(intent);
	}
	
	public void Mercury(View view)
	{
		Intent intent = new Intent(this,Mercury.class);
	    startActivity(intent);
	}
	
	public void Thallium(View view)
	{
		Intent intent = new Intent(this,Thallium.class);
	    startActivity(intent);
	}
	
	public void Lead(View view)
	{
		Intent intent = new Intent(this,Lead.class);
	    startActivity(intent);
	}
	
	public void Bismuth(View view)
	{
		Intent intent = new Intent(this,Bismuth.class);
	    startActivity(intent);
	}
	
	public void Polonium(View view)
	{
		Intent intent = new Intent(this,Polonium.class);
	    startActivity(intent);
	}
	
	public void Astatine(View view)
	{
		Intent intent = new Intent(this,Astatine.class);
	    startActivity(intent);
	}
	
	public void Radon(View view)
	{
		Intent intent = new Intent(this,Radon.class);
	    startActivity(intent);
	}
	
	public void Francium(View view)
	{
		Intent intent = new Intent(this,Francium.class);
	    startActivity(intent);
	}
	
	public void Radium(View view)
	{
		Intent intent = new Intent(this,Radium.class);
	    startActivity(intent);
	}

}
