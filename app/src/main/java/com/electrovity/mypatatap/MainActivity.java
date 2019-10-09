package com.electrovity.mypatatap;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    public void playMusic(View view){
       
        int id = view.getId();
        Log.i("ID","ID value is "+ id);

        String nameID = view.getResources().getResourceEntryName(id);

        Log.i("NameId","Name Id is" + nameID);

        int myMusic = getResources().getIdentifier(nameID,"raw","com.electrovity.mypatatap");

        mediaPlayer = MediaPlayer.create(this,myMusic);

        mediaPlayer.start();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
