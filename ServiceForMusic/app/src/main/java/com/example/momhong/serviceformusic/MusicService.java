package com.example.momhong.serviceformusic;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
    MediaPlayer  mPlayer;
    public MusicService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mPlayer = MediaPlayer.create(this,R.raw.indiansong);
        mPlayer.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mPlayer.stop();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
