package com.softpal.softpalpreferencemanagers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.softpal.softpalpreferencemanager.SoftPalPreferenceManager;

public class MainActivity extends AppCompatActivity
{
	
	private SoftPalPreferenceManager softPalPreferenceManager;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		softPalPreferenceManager=new SoftPalPreferenceManager(getApplicationContext());
	}
}
