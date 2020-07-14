package com.christophe.rhapsode.dao;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.christophe.rhapsode.model.Photo;

public interface PhotosDao extends MongoRepository<Photo, String> {

}
