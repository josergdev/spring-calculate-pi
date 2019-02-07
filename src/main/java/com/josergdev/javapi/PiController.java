package com.josergdev.javapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pi")
public class PiController {

    @GetMapping
    public PiModel piModel(@RequestParam(value="digits", defaultValue = "3") int digits) {
        return new PiModel(digits, new Pi().calcPiDigits(digits));
    }


}
