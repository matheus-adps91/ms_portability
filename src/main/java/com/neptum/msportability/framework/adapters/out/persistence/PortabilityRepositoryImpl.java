package com.neptum.msportability.framework.adapters.out.persistence;

import com.neptum.msportability.application.ports.out.PortabilityRepository;
import com.neptum.msportability.domain.Portability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class PortabilityRepositoryImpl
    implements PortabilityRepository
{
    @Autowired
    private  PortabilityPostgreRepository portabilityPostgreRepository;

    @Override public Portability savePortability( Portability portability )
    {
        return portabilityPostgreRepository.save( portability );
    }

    @Override public Optional<Portability> findPortabilityById( UUID portabilityId )
    {
        return Optional.empty();
    }
}