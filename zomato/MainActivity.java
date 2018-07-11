package com.example.d.zomato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private User user;
    RecyclerView recyclerView;
    public static final String URL = "https://developers.zomato.com/api/v2.1/reviews?res_id=16774318";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        StringRequest stringRequest = new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("ok", response);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                user = gson.fromJson(response, User.class);
                List<com.example.d.zomato.UserReview> userReviews = user.getUserReviews();
                Log.d("ok", "onResponse: "+userReviews.size());
                recyclerView=findViewById(R.id.recycler_view);
                ZomatoAdapter zomatoAdapter = new ZomatoAdapter(getApplicationContext(), userReviews);
                recyclerView.setAdapter(zomatoAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager (getApplicationContext()));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_LONG).show();

            }
        }) {    //this is the part, that adds the header to the request
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> params = new HashMap<String, String> ();
                params.put("user-key", "5e7397661bafa1c125f73af010932fb5");
                params.put("Accept", "application/json");
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    }

