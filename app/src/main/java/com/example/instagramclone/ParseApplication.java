package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("53EEREbZR9XUJ5mMfIO83IypfCmWREiuBNkAh9hv")
                .clientKey("PutYJi8bcHzRyEGRg7ARwMhdDMsahmAjCsTFfj5N")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
