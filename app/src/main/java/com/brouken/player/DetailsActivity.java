package com.brouken.player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView text_filename,text_location,text_size,text_date,text_format,text_resolution,text_duration,text_haveaudio,text_havevideo,text_bitrate,text_framecount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
        text_filename.setText(Utils.filename);
        text_size.setText(Utils.size);
        text_resolution.setText(Utils.resolution);
        text_format.setText(Utils.format);
        text_location.setText(Utils.location);
        text_duration.setText(Utils.duration);
        text_haveaudio.setText(Utils.haveAudio);
        text_framecount.setText(Utils.framecount);
        text_havevideo.setText(Utils.haveVideo);
        text_bitrate.setText(Utils.bitrate);
        imageView.setOnClickListener(view -> {
            onBackPressed();
        });


    }
    void init(){
        imageView=findViewById(R.id.back);
        text_filename=findViewById(R.id.filename_);
        text_size=findViewById(R.id.size_);
        text_format=findViewById(R.id.format_);
        text_resolution=findViewById(R.id.resolution_);
        text_duration=findViewById(R.id.duration_);
        text_location=findViewById(R.id.location_);
        text_haveaudio=findViewById(R.id.audio_);
        text_havevideo=findViewById(R.id.video_);
        text_bitrate=findViewById(R.id.bitrate_);
        text_framecount=findViewById(R.id.framerate_);
    }
}