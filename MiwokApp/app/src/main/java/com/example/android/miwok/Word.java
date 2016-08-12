package com.example.android.miwok;

/**
 * Created by david on 09-08-16.
 */
public class Word {

    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }
}
