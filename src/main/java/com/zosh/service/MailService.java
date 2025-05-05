package com.zosh.service;

import com.zosh.dto.ContactRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(ContactRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("papu09353@gmail.com"); // Receiver
        message.setSubject("New Contact Message from " + request.getName());
        message.setText(
                "Name: " + request.getName() + "\n" +
                        "Email: " + request.getEmail() + "\n" +
                        "Contact: " + request.getContact() + "\n" +
                        "Message: " + request.getSubject()
        );
        mailSender.send(message);
    }
}
