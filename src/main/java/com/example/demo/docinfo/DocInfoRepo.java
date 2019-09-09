package com.example.demo.docinfo;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class DocInfoRepo {
    private final List<DocInfo> docInfoList = List.of(
            new DocInfo(1, "Politeh", List.of("surgeon", "veterinarian"), LocalDate.parse("2000-01-01")),
            new DocInfo(2, "MidicalPolith", List.of("veterinarian"), LocalDate.parse("2000-01-01")),
            new DocInfo(3, "Me4nikova", List.of("surgeon"), LocalDate.parse("2000-01-01")),
            new DocInfo(4, "4kalova", List.of("surgeon", "genetics"), LocalDate.parse("2000-01-01")),
            new DocInfo(5, "Medin", List.of("genetics", "veterinarian"), LocalDate.parse("2000-01-01")));

    public DocInfo getDocInfo(Integer docInfoId) {
        return docInfoList.stream()
                .filter(x -> x.getDocInfoId().equals(docInfoId))
                .collect(toSingleton());
    }

    private static <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new DocInfoNotFoundException();
                    }
                    return list.get(0);
                }
        );
    }
}
