package com.example.nuha_midterm12022;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ListActivity {
    ImageView view1;
    MediaPlayer mediaplayer1
    int playing;

    String[] attractions = {"list1", "list2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
                R.id.listView, attractions));

        setContentView(R.layout.activity_main2);
        v11 = (Button) findViewById(R.id.view1);

        view1.setOnClickListener(bttn1);

        mediaplayer1 = new MediaPlayer();
        mediaplayer1 = MediaPlayer.create(this,R.raw.);

        playing = 0;

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu/en/")));
                break;
            case 1:

                break;


        }
    }
}