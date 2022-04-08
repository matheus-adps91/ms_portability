package com.neptum.msportability.domain;

import com.neptum.msportability.domain.enums.CellphoneOperator;
import com.neptum.msportability.domain.enums.StatusPortability;

import java.util.UUID;

public class Portability
{
    private UUID portabilityId;
    private CellphoneOperator source;
    private CellphoneOperator target;
    private StatusPortability statusPortability;
    private User user;
}
