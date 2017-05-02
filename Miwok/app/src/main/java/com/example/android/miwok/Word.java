package com.example.android.miwok;

/**
 * Created by GS-1257 on 28-04-2017.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mMusicResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int musicResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMusicResourceId = musicResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int musicResourceID){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceID;
        mMusicResourceId = musicResourceID;

    }


    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getmMusicResourceId() { return mMusicResourceId;}

    public boolean isValidImage(){
        if (mImageResourceId == NO_IMAGE_PROVIDED)
        {
            return false;
        }
        return true;
    }
}
