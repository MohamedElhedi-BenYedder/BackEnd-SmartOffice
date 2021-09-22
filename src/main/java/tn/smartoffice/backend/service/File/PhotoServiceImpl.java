package tn.smartoffice.backend.service.File;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import tn.smartoffice.backend.model.Media.Photo;
import tn.smartoffice.backend.repository.File.PhotoRepository;

import java.io.IOException;

@Component
public class PhotoServiceImpl implements PhotoService{
    @Autowired
    PhotoRepository photoRepository;
    public String addPhoto(String title, MultipartFile file) throws IOException {
        Photo photo = new Photo();
        photo.setTitle(title);
        photo.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = photoRepository.insert(photo);
        return photo.getMediaId();
    }

    public Photo getPhoto(String id) {
        return photoRepository.findById(id).get();
    }
}
