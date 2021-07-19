package com.example.springbootprojectdemo2.wishlist.dto;

import com.example.springbootprojectdemo2.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto extends MemoryDbEntity {

    private String title;
    private String category;
    private String address;
    private String roadAddress;
    private String homePageLink;
    private String imageLink;
    private boolean isVisit;
    private Integer visitCount;
    private LocalDateTime lastVisitDate;


}
