package com.example.proyectopizzachido.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class ApiController {
        @Autowired
        lateinit var localeRepository: LocaleRepository

        @CrossOrigin("http://localhost:8000")
        @GetMapping("/")
        fun getAll(): Iterable&lt; {
        }


    }Locales&gt;
    {
        return localeRepository.findAll();
    }

}