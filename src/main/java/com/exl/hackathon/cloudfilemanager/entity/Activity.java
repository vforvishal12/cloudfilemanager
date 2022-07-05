package com.exl.hackathon.cloudfilemanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    @Id
    private String fileId;
    private String fileName;
    private String cloudPartner;
    private String user;
    private String uploadDateTime;
    private String lastDownloadDateTime;
    private Boolean isGuestUser;



}
