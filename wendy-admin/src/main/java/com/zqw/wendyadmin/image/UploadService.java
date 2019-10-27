package com.zqw.wendyadmin.image;


import com.zqw.wendyadmin.image.utils.ImgException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    String updateHead(MultipartFile file) throws ImgException;

    String imageOrc(MultipartFile file) throws IOException;
}
