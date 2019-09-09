package com.example.demo.docinfo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DocInfoService {
    private final DocInfoRepo docInfoRepo;

    public DocInfo getDocInfo(Integer docInfoId) {
        return docInfoRepo.getDocInfo(docInfoId);
    }
}
