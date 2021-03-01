package com.example.security.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
public class Test implements Serializable {
//    @JsonProperty("PID")
    private Long id;
//    @JsonProperty("PAMOUNT")
    private Double amount;
//    @JsonProperty("PDATA")
    private Long timestamp;

    public Test(@JsonProperty("PID") final long id,
                @JsonProperty("PAMOUNT") final Double amount,
                @JsonProperty("PDATA") final Long timestamp) {
        super();
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}
