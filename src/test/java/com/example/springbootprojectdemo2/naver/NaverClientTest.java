package com.example.springbootprojectdemo2.naver;

import com.example.springbootprojectdemo2.naver.dto.SearchImageReq;
import com.example.springbootprojectdemo2.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void localSearchTest() {
        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = naverClient.SearchLocal(search);

    }

    @Test
    public void ImageSearchTest() {
        var search = new SearchImageReq();
        search.setQuery("갈비집");

        var result = naverClient.SearchImage(search);

    }



}
