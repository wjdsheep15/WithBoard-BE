package com.example.withboard.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AffectionPostRequestUpdateDto {
    private String title;
    private String content;
}
