package com.example.elin.myfirstapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText(message);
        //setContentView(tv);

        GridView gv = new GridView(this);
        gv.setId(this.getTaskId());
        gv.setLayoutParams(new
                GridView.LayoutParams(GridLayout.LayoutParams.FILL_PARENT, GridLayout.LayoutParams.FILL_PARENT));
        gv.setBackgroundColor(Color.GREEN);
        gv.setNumColumns(3);
        gv.setColumnWidth(GridView.AUTO_FIT);
        gv.setVerticalSpacing(5);
        gv.setHorizontalSpacing(5);
        gv.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gv.setGravity(Gravity.CENTER);

        setContentView(gv);

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
