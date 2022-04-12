package com.neptum.msportability.application.ports.in;

import com.neptum.msportability.domain.Portability;
import com.neptum.msportability.framework.adapters.in.rest.dto.PortabilityResume;

public interface PortabilityService
{
    Portability createPortability( PortabilityResume portabilityResume );
}
