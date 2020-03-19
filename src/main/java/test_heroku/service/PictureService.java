package test_heroku.service;

import test_heroku.model.Picture;



public interface PictureService {
    void save(Picture picture);
    void delete(Long id);

}
