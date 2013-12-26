package miguelmaciel.github.getlanguagecode;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int x;
		for (x = 0; x < Locale.getAvailableLocales().length; x++) {
			Log.d("Locais", Locale.getAvailableLocales()[x].toString());
		}

		Log.d("Lingua Actual",
				Locale.getDefault().getDisplayLanguage(Locale.getDefault()));
		Log.d("Pais Actual", Locale.getDefault().getDisplayCountry());
		Log.d("Codigo Actual", Locale.getDefault().getISO3Country());
	}

}
