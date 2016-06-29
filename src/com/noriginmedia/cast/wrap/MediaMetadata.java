package com.noriginmedia.cast.wrap;


import com.google.android.gms.common.images.WebImage;

import android.net.Uri;

import java.util.List;

/**
 * Created by Petru on 28/06/2016.
 */
public class MediaMetadata {

    private com.google.android.gms.cast.MediaMetadata mMediaMetadata;

    public static final String KEY_SUBTITLE = "subtitle";
    public static final String KEY_TITLE = "title";
    public static final int MEDIA_TYPE_MOVIE = 1;

    public MediaMetadata(com.google.android.gms.cast.MediaMetadata mediaMetaData) {
        this.mMediaMetadata = mediaMetaData;
    }

    public com.google.android.gms.cast.MediaMetadata getMediaMetadata() {
        return mMediaMetadata;
    }

    public String getImageUrl() {
        List<WebImage> images =mMediaMetadata.getImages();
        if (images != null && images.size() > 0) {
            WebImage image = images.get(0);
            return image.getUrl().toString();
        }
        return null;
    }

    public void setImageUrl(final String iconURL) {
        if (iconURL != null) {
            Uri iconUri = Uri.parse(iconURL);
            WebImage image = new WebImage(iconUri, 100, 100);
            mMediaMetadata.addImage(image);
        }
    }

    public String getString(final String key) {
        return mMediaMetadata.getString(key);
    }

    public void putString(final String key, final String value) {
        mMediaMetadata.putString(key, value);
    }

    public static MediaMetadata createMediaMetadata(int type) {
        return new MediaMetadata(new com.google.android.gms.cast.MediaMetadata(type));
    }
}
