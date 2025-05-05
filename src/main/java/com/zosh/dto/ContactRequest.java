package com.zosh.dto;

import lombok.Data;

@Data
public class ContactRequest {
    private String name;
    private String email;
    private String contact;
    private String subject;

    // Getters and Setters
}
