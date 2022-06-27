package com.kcbgroup.main.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.DependsOn;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerInfo {

    private String [] accountInfo;//nested

}
