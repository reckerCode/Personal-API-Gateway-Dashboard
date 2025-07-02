package com.api.gateway.service.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document(collation = "logs")
public class Logs {
    String id;
    String logLocalId;
    String logCountryCode;
    String routerId;
    String timestamp;
    String statusCode;
    int responseTime;
}
