package com.melardev.tutorialsfirebase.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("/search/users?q=language:java>200+followers:>1000")
    Call<JSONResponse> getJSON();
}
