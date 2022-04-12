package com.neptum.msportability.framework.adapters.out.persistence;

import com.neptum.msportability.domain.Portability;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PortabilityPostgreRepository
    extends CrudRepository<Portability,UUID>
{
}
