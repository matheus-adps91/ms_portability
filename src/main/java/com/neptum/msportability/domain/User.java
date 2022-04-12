package com.neptum.msportability.domain;

import com.neptum.msportability.framework.adapters.in.rest.dto.UserResume;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
@Getter
@NoArgsConstructor
public class User
{
    @Id
    private UUID userId;
    @OneToOne
    @JoinColumn(name = "lineInformationId")
    private LineInformation lineInformation;
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;
    private String name;
    private LocalDate birthDate;
    private String identification;

    public User( UserResume userResume )
    {
        this.lineInformation = new LineInformation( userResume.getLineInformationResume() );
        this.address = new Address( userResume.getAddressResume() );
        this.name = userResume.getName();
        this.birthDate = userResume.getBirthDate();
        this.identification = userResume.getIdentification();
    }
}
