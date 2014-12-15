package com.benhgreen.wizards;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends ActionBarActivity {
    String[] wizardarray1= {"Wizard","Warlock","Mage","Sage","Lord","Prince","Sultan",
            "Lady","Princess","Caesar","King","Queen"};
    String[] wizardarray2= {"Kicking","Knives","Warlocks","Idiots","Manny","Manuel","Manfred","Swag","Grease",
            "Dying a Lot","Running Away Like A Little Girl","Drinking Bleach","Quesadillas",
            "The Dumpster","Pure Trash","Punching Someone And Breaking A Finger"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                }

    public void generatewizard (View view){
        Random rand =new Random ();
        ImageButton image = (ImageButton) findViewById(R.id.wizardView1);
        ImageView img = (ImageView) findViewById(R.id.wizardView2);
        TextView text = (TextView) findViewById(R.id.textView);
        int x = rand.nextInt(wizardarray1.length);
            String wizardvariable = wizardarray1[x];
             x = rand.nextInt(wizardarray2.length);
              String wizardvariable2 = wizardarray2[x];
                text.setText(wizardvariable + " of " + wizardvariable2);

        img.bringToFront();
        image.setVisibility (View.INVISIBLE);
        img.setVisibility (View.VISIBLE);
        text.setVisibility (View.VISIBLE);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.hoooo);
                     mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                public void onCompletion(MediaPlayer mp) {
                    ImageButton image = (ImageButton) findViewById(R.id.wizardView1);
                      ImageView img = (ImageView) findViewById(R.id.wizardView2);
                       image.bringToFront();
                     img.setVisibility (View.INVISIBLE);
                       image.setVisibility (View.VISIBLE);
                     mp.release();
                            }
        });

    }

}
