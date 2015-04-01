package com.jikexueyuan.learnrv;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends ActionBarActivity {


    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        rv= new RecyclerView(this);
        setContentView(rv);

        rv.setLayoutManager(new GridLayoutManager(this,4,LinearLayoutManager.HORIZONTAL,false));
//        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        rv.setAdapter(new MyAdapter());
    }

}
