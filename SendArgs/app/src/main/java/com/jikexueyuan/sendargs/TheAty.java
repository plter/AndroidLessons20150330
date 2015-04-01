package com.jikexueyuan.sendargs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TheAty extends ActionBarActivity {


    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
        tv = (TextView) findViewById(R.id.tv);
        editText = (EditText) findViewById(R.id.editText);

        Intent i = getIntent();
//        Bundle data = i.getExtras();
//        Bundle data = i.getBundleExtra("data");
//

//        tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("name=%s,age=%d,name1=%s",data.getString("name"),data.getInt("age"),data.getString("name1","leo")));


//        User user = (User) i.getSerializableExtra("user");

        User user = i.getParcelableExtra("user");
        tv.setText(String.format("User info(name=%s,age=%d)",user.getName(),user.getAge()));


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.putExtra("data",editText.getText().toString());
                setResult(1, i);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_the_aty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
