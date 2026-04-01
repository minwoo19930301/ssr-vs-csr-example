package com.example.ssrvscsr.store;

import com.example.ssrvscsr.dto.ItemDto;
import java.util.Arrays;
import java.util.List;

public class MockDataStore {
    public static final List<ItemDto> ITEMS = Arrays.asList(
        new ItemDto(1L, "Spring Boot 기초", "김스프링", 25000),
        new ItemDto(2L, "Thymeleaf 마스터", "이타임", 18000),
        new ItemDto(3L, "JPA 실전 가이드", "박데이터", 32000),
        new ItemDto(4L, "React와 함께하는 백엔드", "최프론트", 28000),
        new ItemDto(5L, "Docker & Kubernetes", "정데브옵스", 35000),
        new ItemDto(6L, "Clean Architecture", "클린코드", 38000)
    );
}
