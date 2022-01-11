package com.ms.email.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EMAILDto {

    //a anotation @NotBlank é do validation e diz que o atributo é obrigatorio
    @NotBlank
    private String ownerREf;

    @NotBlank
    @Email
    private String emailFrom;

    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
