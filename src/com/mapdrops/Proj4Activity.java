package com.mapdrops;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import org.proj4.PJ;
import uk.os.oslabs.proj4.R;


public class Proj4Activity extends Activity {

    /** class TAG */
    private static final String TAG = "Proj4Activity";

    /**
     * Loads the Proj4 library.
     */
    static {
        System.loadLibrary("proj");
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView text = (TextView)findViewById(R.id.text_view);
        text.setText(PJ.getVersion());
        Log.d(TAG, PJ.getVersion());
    }
}
