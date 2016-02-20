package com.wavelet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("health")
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Health {

    private String deviceId;
    private Integer dataTypeId;
    private Date timestamp;
    private String data;

}
