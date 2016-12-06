package com.noriginmedia.cast.wrap;

import org.json.JSONObject;

/**
 * Created by Petru on 28/06/2016.
 */
public class MediaInfo {

    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_BUFFERED = 1;
    private com.google.android.gms.cast.MediaInfo mMediaInfo;

    public MediaInfo(com.google.android.gms.cast.MediaInfo mediaInfo) {
        this.mMediaInfo = mediaInfo;
    }

    public com.google.android.gms.cast.MediaInfo getMediaInfo() {
        return mMediaInfo;
    }

    public String getContentId() {return mMediaInfo.getContentId();}

    public MediaMetadata getMetadata() {return new MediaMetadata(mMediaInfo.getMetadata());}

    public static MediaInfo createMediaInfo(final String url, final String mimeType, final boolean isLive, final int duration, final MediaMetadata mediaMetadata, final JSONObject customData) {
        return new MediaInfo(new com.google.android.gms.cast.MediaInfo.Builder(url)
                .setContentType(mimeType)
                .setStreamType(isLive ? MediaInfo.STREAM_TYPE_LIVE
                        : MediaInfo.STREAM_TYPE_BUFFERED)
                .setMetadata(mediaMetadata.getMediaMetadata())
                .setStreamDuration(duration)
                .setCustomData(customData)
                .build());
    }

    public int getStreamType() {
        return mMediaInfo.getStreamType();
    }

}
