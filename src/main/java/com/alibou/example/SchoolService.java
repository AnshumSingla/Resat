package com.alibou.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper, StudentMapper studentMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto create( SchoolDto schoolDto) {
        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool =  schoolRepository.save(school);
        return schoolDto;
    }

    public List<SchoolDto> findAll() {
        return this.schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }
}
