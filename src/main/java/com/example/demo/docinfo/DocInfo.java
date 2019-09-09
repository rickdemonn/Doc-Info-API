package com.example.demo.docinfo;


import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DocInfo {
    private final Integer docDiplomaId;
    private final String university;
    private final List<String> specializations;
    private final LocalDate date;
}
