package com.example.bitcoinapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient
{
    @GET("/users/{user}/repos")
    Call<List<ListItem>> reposForUser(
            @Path("user") String user
    );
}
