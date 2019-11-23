package com.example.omdbapiconsume;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET(".")
    Call<OmdbMovieResponse> getOmdbApi(@Query("apiKey") String apiKey, @Query("s") String s);
}
