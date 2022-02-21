package com.example.nuha_midterm12022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Integer [] Animals ={R.drawable.cub2,R.drawable.cat4,};
    ImageView pic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridview);
        final ImageView pic = findViewById(R.id.imageView);
        grid.setAdapter(new ImageAdapter(this));




        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Species No"+(position+1),Toast.LENGTH_LONG).show();
                pic.setImageResource(Animals[position]);
            }
        });
    }



    public class ImageAdapter extends BaseAdapter {
        private Context context;


        public  ImageAdapter (Context c){
            context=c;

        }

        @Override
        public int getCount() {
            return Animals.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new ViewGroup.LayoutParams(330,300));
            return pic;
        }
    }
}