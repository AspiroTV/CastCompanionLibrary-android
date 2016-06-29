package com.noriginmedia.cast.wrap;

/**
 * Created by Petru on 28/06/2016.
 */
public class ApplicationMetadata {

    com.google.android.gms.cast.ApplicationMetadata mApplicationMetadata;
    public ApplicationMetadata(com.google.android.gms.cast.ApplicationMetadata applicationMetadata) {
        this.mApplicationMetadata = applicationMetadata;
    }

    public String getApplicationId() {
        return mApplicationMetadata.getApplicationId();
    }

    public String getName() {
        return mApplicationMetadata.getName();
    }

    public String getSenderAppIdentifier() {
        return mApplicationMetadata.getSenderAppIdentifier();
    }
}
