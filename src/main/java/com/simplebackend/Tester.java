package com.simplebackend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tester {

    @GetMapping("/hwid/{user}/{id}")
    public @ResponseBody ResponseEntity<String> getById(@PathVariable String user, @PathVariable String id) {
        return new ResponseEntity<>("1", HttpStatus.OK);
    }

}
