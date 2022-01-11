package com.ms.email.model;


import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data    //anotation do lombok assim não precisamos fazer getters,setters econstrutores
@Entity
@Table(name="TB_EMAILS")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;

    private String ownerREf;
    private String emailFrom;
    private String emailTo;
    private String subject;
    
    @Column(columnDefinition="TEXT")   //permite o uso de texto maiores
    private String text;

    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
