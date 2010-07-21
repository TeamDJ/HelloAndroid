package com.thoughtworks.teamdj.helloandroid;

import android.app.Activity;
import android.os.Bundle;

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
        setContentView(R.layout.main);
    }
}
