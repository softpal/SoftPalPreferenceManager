# SoftPalPreferenceManager


### Developed by
[Softpal](https://www.github.com/softpal)


### What is this library about?

    SharedPref Manager helps to manage your android Shared Preferences very effectively.
    
  
  ## Installation

    Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

### Gradle
[![](https://jitpack.io/v/softpal/SoftPalPreferenceManager.svg)](https://jitpack.io/#softpal/SoftPalPreferenceManager)
```javascript
dependencies {
    implementation 'com.github.softpal:SoftPalPreferenceManager:1.0'
}
```
## Usage
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

