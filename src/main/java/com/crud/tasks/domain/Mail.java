package com.crud.tasks.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Mail {

    private String mailTo;
    private String toCc;
    private String subject;
    private String message;

}
