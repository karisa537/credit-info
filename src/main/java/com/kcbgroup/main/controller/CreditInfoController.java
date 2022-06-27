package com.kcbgroup.main.controller;

import com.kcbgroup.main.model.AccountInfo;
import com.kcbgroup.main.model.CustomerInfo;
import com.kcbgroup.main.service.ConsumingRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumerInfo-client")
public class CreditInfoController {

    @Autowired
    private ConsumingRest consumingRest;

   @GetMapping(value = "/customers/{id}")
   public AccountInfo[] getAccount(@PathVariable Long identityNumber){
       return consumingRest.getCustomer(String.valueOf(identityNumber));
   }
}
