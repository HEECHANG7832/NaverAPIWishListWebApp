package com.example.springbootprojectdemo2.wishList.service;

import com.example.springbootprojectdemo2.wishlist.WishListService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Test
    public void searchList() {
        var result = wishListService.search("갈비집");

        System.out.println(result);

        Assertions.assertNotNull(result);
    }
}
