package com.neptum.msportability.framework.adapters.in.rest.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserResume
{
    private LineInformationResume lineInformationResume;
    private AddressResume addressResume;
    private String name;
    private LocalDate birthDate;
    private String identification;
}
