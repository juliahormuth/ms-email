package com.ms.msemail.models;

import com.ms.msemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateTime;
    private StatusEmail statusEmail;
}
