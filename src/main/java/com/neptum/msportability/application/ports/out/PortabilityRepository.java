package com.neptum.msportability.application.ports.out;

import com.neptum.msportability.domain.Portability;

import java.util.Optional;
import java.util.UUID;

public interface PortabilityRepository
{
    Portability savePortability(Portability portability);
    Optional<Portability> findPortabilityById( UUID portabilityId );
}
