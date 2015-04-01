package com.jikexueyuan.learnintent;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by plter on 3/18/15.
 */
public class MyAty extends Activity {

    public static final String ACTION = "com.jikexueyuan.learnintent.intent.action.MyAty";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaty);
    }
}
