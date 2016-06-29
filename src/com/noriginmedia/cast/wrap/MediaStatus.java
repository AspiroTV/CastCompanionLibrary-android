package com.noriginmedia.cast.wrap;

/**
 * Created by Petru on 28/06/2016.
 */
public class MediaStatus {
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_BUFFERING = 4;

    public static final int IDLE_REASON_NONE = 0;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_ERROR = 4;

    public static final int REPEAT_MODE_REPEAT_OFF = 0;

    com.google.android.gms.cast.MediaStatus mMediaStatus;

    public MediaStatus(com.google.android.gms.cast.MediaStatus mediaStatus) {
        this.mMediaStatus = mediaStatus;
    }

    public com.google.android.gms.cast.MediaStatus getMediaStatus() {
        return mMediaStatus;
    }

    public int getPlayerState() {
        return mMediaStatus.getPlayerState();
    }

    public int getIdleReason() {
        return mMediaStatus.getIdleReason();
    }

    public MediaInfo getMediaInfo() {return new MediaInfo(mMediaStatus.getMediaInfo());}

    public com.google.android.gms.cast.MediaStatus getmMediaStatus() {
        return mMediaStatus;
    }

}
