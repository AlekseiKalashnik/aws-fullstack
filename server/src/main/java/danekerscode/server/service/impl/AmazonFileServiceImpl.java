package danekerscode.server.service.impl;

import danekerscode.server.model.AmazonFile;
import danekerscode.server.model.User;
import danekerscode.server.repository.AmazonFileRepository;
import danekerscode.server.service.AmazonFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AmazonFileServiceImpl implements AmazonFileService {
    private final AmazonFileRepository fileRepository;

    public void save(User user, String name) {
        fileRepository.save(AmazonFile.builder()
                .name(name)
                .user(user)
                .build());
    }

    public void deleteById(Integer id){
        fileRepository.deleteById(id);
    }
}
