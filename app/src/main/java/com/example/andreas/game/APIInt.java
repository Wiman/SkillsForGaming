package com.example.andreas.game;

import java.util.List;

        import retrofit2.Call;
        import retrofit2.http.GET;



public interface APIInt {

    String BASE_URL = "http://afgamingserver.azurewebsites.net/api/";

    @GET("Gaming/")
    Call<List<API>> getGames();
}
