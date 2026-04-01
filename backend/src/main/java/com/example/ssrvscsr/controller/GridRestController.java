package com.example.ssrvscsr.controller;

import com.example.ssrvscsr.dto.ItemDto;
import com.example.ssrvscsr.store.MockDataStore;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GridRestController {

    @GetMapping("/grid")
    public List<ItemDto> getGridData() {
        return MockDataStore.ITEMS;
    }
}
