package edu.pasudo123.study.s3.storage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("s3")
public class StorageController {

    @GetMapping
    public String get() {
        return "";
    }
}
