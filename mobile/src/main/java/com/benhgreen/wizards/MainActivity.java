package com.benhgreen.wizards;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
String[] wizardarray1= {"Wizard","Warlock","Mage","Sage","Manny","Manuel","Manfred"};
    String[] wizardarray2= {"Power","Magic","Warlocks","Idiots","Manny","Manuel","Manfred"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton image = (ImageButton) findViewById(R.id.wizardView2);
        image.setVisibility (View.INVISIBLE);
                }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void buttonclick2(View view){
        ImageButton img = (ImageButton) findViewById(R.id.wizardView1);
        ImageButton image = (ImageButton) findViewById(R.id.wizardView2);
        //Toast toast = Toast.makeText(getApplicationContext(), "Button 2 Pressed", Toast.LENGTH_SHORT);
        //toast.show();
     }
    public void buttonclick(View view){
        Random rand =new Random ();
        int x = rand.nextInt(wizardarray1.length);
        String wizardvariable = wizardarray1[x];
        x = rand.nextInt(wizardarray2.length);
        String wizardvariable2 = wizardarray2[x];
        ImageButton image = (ImageButton) findViewById(R.id.wizardView1);
        ImageButton img = (ImageButton) findViewById(R.id.wizardView2);
        TextView text = (TextView) findViewById(R.id.textView);
                               img.bringToFront();
        image.setVisibility (View.INVISIBLE);
        img.setVisibility (View.VISIBLE);
        text.setVisibility (View.VISIBLE);
        text.setText(wizardvariable + " of " + wizardvariable2);

       //Toast toast = Toast.makeText(getApplicationContext(), "Button 1 Pressed", Toast.LENGTH_SHORT);
       //toast.show();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.hoooo);
                     mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                ImageButton image = (ImageButton) findViewById(R.id.wizardView1);
                ImageButton img = (ImageButton) findViewById(R.id.wizardView2);
                image.bringToFront();
                img.setVisibility (View.INVISIBLE);
                image.setVisibility (View.VISIBLE);
                mp.release();
            }
        });

    }

}
