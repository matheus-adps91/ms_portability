package com.neptum.msportability.domain;

import java.time.LocalDate;
import java.util.UUID;

public class User
{
    private UUID userId;
    private LineInformation lineInformation;
    private Address address;
    private String name;
    private LocalDate birthDate;
    private String identification;
}
