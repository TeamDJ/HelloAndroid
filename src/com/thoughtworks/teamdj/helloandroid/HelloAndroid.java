package com.thoughtworks.teamdj.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by IntelliJ IDEA.
 * User: jottaway
 * Date: Jul 21, 2010
 * Time: 2:31:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloAndroid extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Hello Android");
        setContentView(textView);
    }
}
