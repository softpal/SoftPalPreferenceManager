package com.softpal.softpalpreferencemanager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 The type Preference manager.
 */
public class SoftPalPreferenceManager
{
	private SharedPreferences pref;
	private SharedPreferences.Editor editor;
	private Context _context;
	
	// shared pref mode
	private int PRIVATE_MODE = 0;
	
	// Shared preferences file name
	private static final String PREF_NAME = "intro_slider-welcome";
	
	private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
	
	/**
	 Instantiates a new Preference manager.
	 
	 @param context the context
	 */
	public SoftPalPreferenceManager(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		editor = pref.edit();
		editor.apply();
	}
	
	/**
	 Sets first time launch.
	 
	 @param isFirstTime the is first time
	 */
	public void setFirstTimeLaunch(boolean isFirstTime) {
		editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
		editor.commit();
	}
	
	/**
	 Is first time launch boolean.
	 
	 @return the boolean
	 */
	public boolean isFirstTimeLaunch() {
		return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
	}
}
