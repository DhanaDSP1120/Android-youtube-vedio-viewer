package com.dhanadsp1120.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.app.slice.SliceItem;
import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView;
    ImageSlider is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                //  https://youtu.be/Zlz07Mluxb0
                // youTubePlayer.loadVideo("Zlz07Mluxb0",0);
                youTubePlayer.cueVideo("Zlz07Mluxb0", 0);
                //  super.onReady(youTubePlayer);
            }
        });
        is = findViewById(R.id.imageslider);
        List<SlideModel> sm = new ArrayList<>();

        sm.clear();
        String s="https://firebasestorage.googleapis.com/v0/b/fir-image-92add.appspot.com/o/images%2F08c09fe3-679d-4cbb-9430-b007f6dc21e2?alt=media&token=7e0aa283-0016-43dd-9fd0-10fa100f1b9a";
        sm.add(new SlideModel(s,ScaleTypes.FIT));
        String d="https://bit.ly/2YoJ77H";
        String m="The animal population decreased by 58 percent in 42 years.";
        sm.add(new SlideModel(d,m, ScaleTypes.CENTER_CROP));
is.setImageList(sm,ScaleTypes.FIT);


    }
}
