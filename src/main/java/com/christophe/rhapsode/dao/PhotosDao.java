package com.christophe.rhapsode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christophe.rhapsode.model.Photo;

public interface PhotosDao extends JpaRepository<Photo, Integer> {

}
