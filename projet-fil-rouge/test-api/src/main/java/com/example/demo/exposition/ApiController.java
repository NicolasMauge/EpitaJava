package com.example.demo.exposition;

import com.sun.tools.jconsole.JConsoleContext;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/tmdb")
    public String getApiTmdb() {
        /*Map<String, String> map = new HashMap<>();
        map.put("api_key", "2e778ca4742d3e8e5f1ee2d5018255fc");
        map.put("language", "fr");
        map.put("page", "1");

        //RestTemplate restTemplate = new RestTemplate();
        String uri = "https://api.themoviedb.org/3/discover/movie?api_key={api_key}&language={language}&page={page}";

        String result = restTemplate.getForObject(uri, String.class, map);

        System.out.println(result);

        return result;*/
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.MILLISECONDS)
                .build();

        Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZTc3OGNhNDc0MmQzZThlNWYxZWUyZDUwMTgyNTVmYyIsInN1YiI6IjY0N2Q4NDk0MGZiMzk4MDBmYjBjN2JhZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.lmNdAk3VGlTdqrHwzPMvtXBg41ZZ8U3V9TdbyBnXYec")
                .build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
