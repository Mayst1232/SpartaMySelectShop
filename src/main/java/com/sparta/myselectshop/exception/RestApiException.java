package com.sparta.myselectshop.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class RestApiException {
    private String errorMessage;
    private int statusCode;
}