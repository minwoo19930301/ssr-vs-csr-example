package com.example.ssrvscsr.controller;

import com.example.ssrvscsr.store.MockDataStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GridController {

    @GetMapping("/grid")
    public String showGrid(Model model) {
        model.addAttribute("items", MockDataStore.ITEMS);
        return "grid"; // resources/templates/grid.html
    }
}
