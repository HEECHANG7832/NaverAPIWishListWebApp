package com.example.springbootprojectdemo2.wishlist.repository;

import com.example.springbootprojectdemo2.db.MemoryDbRepositoryAbstract;
import com.example.springbootprojectdemo2.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
