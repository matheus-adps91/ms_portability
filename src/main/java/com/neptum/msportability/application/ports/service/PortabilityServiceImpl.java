package com.neptum.msportability.application.ports.service;

import com.neptum.msportability.application.ports.in.PortabilityService;
import com.neptum.msportability.application.ports.out.PortabilityRepository;
import com.neptum.msportability.domain.Address;
import com.neptum.msportability.domain.LineInformation;
import com.neptum.msportability.domain.Portability;
import com.neptum.msportability.domain.User;
import com.neptum.msportability.framework.adapters.in.rest.dto.PortabilityResume;

public class PortabilityServiceImpl
    implements PortabilityService
{
    private final PortabilityRepository portabilityRepository;

    public PortabilityServiceImpl( PortabilityRepository portabilityRepository )
    {
        this.portabilityRepository = portabilityRepository;
    }

    @Override
    public Portability createPortability( PortabilityResume portabilityResume )
    {
        Portability portability = new Portability( portabilityResume );
        Portability savedPortability = portabilityRepository.savePortability( portability );
        return savedPortability;
    }
}