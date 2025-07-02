package com.api.gateway.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogsDTO {
    String id;
    String routerId;
    String timestamp;
    String statusCode;
    int responseTime;
}
