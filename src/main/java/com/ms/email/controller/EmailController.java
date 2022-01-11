package com.ms.email.controller;

import com.ms.email.dto.EMAILDto;
import com.ms.email.model.EmailModel;
import com.ms.email.service.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

public class EmailController {

    @Autowired
    EmailService service;

    //o dto é o objeto de entrada, o que serve pra requisição
    //a anotação @Valid indica que as validações estão sendo usadoas
    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EMAILDto dto){
        EmailModel model = new EmailModel();
        BeanUtils.copyProperties(dto,model);
        service.sendEmail(model);
        return new ResponseEntity<>(model, HttpStatus.CREATED);
    }
}
