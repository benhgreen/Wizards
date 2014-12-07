package com.benhgreen.wizards;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void buttonclick2(View view){
        ImageButton img = (ImageButton) findViewById(R.id.wizardView1);
        img.bringToFront();
        Toast toast = Toast.makeText(getApplicationContext(), "Button 2 Pressed", Toast.LENGTH_SHORT);
        toast.show();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tidus);
        mp.start();
    }
    public void buttonclick(View view){
        ImageButton img = (ImageButton) findViewById(R.id.wizardView2);
        img.bringToFront();
        Toast toast = Toast.makeText(getApplicationContext(), "Button 1 Pressed", Toast.LENGTH_SHORT);
        toast.show();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.hoooo);
        mp.start();

    }

}
