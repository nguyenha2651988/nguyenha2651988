package test_heroku.service.impl;

import test_heroku.model.Picture;
import test_heroku.repository.PictureRepository;
import test_heroku.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;


public class PictureServiceImpl implements PictureService {
    @Autowired
    PictureRepository pictureRepository;
    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }

    @Override
    public void delete(Long id) {
        pictureRepository.deleteById(id);
    }

}
