package com.melardev.tutorialsfirebase.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.melardev.tutorialsfirebase.model.AndroidVersion;


public class JSONResponse {

    @SerializedName("items")
    @Expose
    private AndroidVersion[] items;
    public AndroidVersion[] getItems() {
        return items;
    }


















}
