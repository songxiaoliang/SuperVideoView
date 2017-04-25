package com.song.supervideoview;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.container)
    SuperVideoView videoView;
    private String mVideoPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/me.mp4";
    private String mVideoUriPath = "http://oleeed73x.bkt.clouddn.com/me.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        videoView.register(this);
        videoView.setVideoPath(mVideoUriPath);
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoView.onResume();
    }
}
