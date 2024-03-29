package com.stockify.businesslinkservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiCallResponse {
    private int statusCode;
    private String message;
    private String userToken;
}
