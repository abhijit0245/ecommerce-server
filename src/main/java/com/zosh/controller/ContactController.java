package com.zosh.controller;

import com.zosh.dto.ContactRequest;
import com.zosh.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private MailService mailService;

    @PostMapping
    public String sendEmail(@RequestBody ContactRequest request) {
        mailService.sendMail(request);
        return "Message sent successfully";
    }
}

