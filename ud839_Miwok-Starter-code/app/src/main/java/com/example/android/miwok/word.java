package com.example.android.miwok;

public class word {

    private String  mDeafaultTranslation;


    private String mMiwoikTranslation;



    public  word(String defaultTranslation, String miwokTranslation) {
        mDeafaultTranslation = defaultTranslation;
        mMiwoikTranslation = miwokTranslation;
    }


    public String getDefaultTranslation() {
        return mDeafaultTranslation;
    }

        public String getMiwokTranslation() {
        return mMiwoikTranslation;
    }

}


