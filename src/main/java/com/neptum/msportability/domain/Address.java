package com.neptum.msportability.domain;

import com.neptum.msportability.framework.adapters.in.rest.dto.AddressResume;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "tb_address")
@Getter
@NoArgsConstructor
public class Address
{
    @Id
    private UUID addressId;
    private String street;
    private String number;
    private String city;
    private String country;

    public Address( AddressResume addressResume )
    {
        this.street = addressResume.getStreet();
        this.number = addressResume.getNumber();
        this.city = addressResume.getCity();
        this.country = addressResume.getCountry();
    }
}
