package ra.file.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    //Lấy dữ liệu file trong DTO --> save vào thư mục upload trong tomcat
    String uploadFileToLocal(MultipartFile multipartFile);
    //lấy file từ thư mục upload(local) --> storage của firebase
    String uploadFileToFirebase(String localFilePath);
}
