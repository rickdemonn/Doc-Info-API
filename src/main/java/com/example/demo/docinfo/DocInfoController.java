package com.example.demo.docinfo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@Slf4j
@AllArgsConstructor
public class DocInfoController {
    private final DocInfoService docInfoService;

    @GetMapping("/{docinfoid}")
    public DocInfo getDocInfo(@PathVariable Integer docInfoId){
        return docInfoService.getDocInfo(docInfoId);
    }
}
