package com.i012114.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView =(ImageView) findViewById(R.id.id_img_item_cardvie);


        Picasso.with(this).load("https://st-listas.20minutos.es/images/2012-05/329923/3519541_640px.jpg?1336330920").into(imageView);
    }


}
