package com.neptum.msportability.domain;

import com.neptum.msportability.domain.enums.CellphoneOperator;
import com.neptum.msportability.domain.enums.StatusPortability;
import com.neptum.msportability.framework.adapters.in.rest.dto.PortabilityResume;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "tb_portability" )
@Getter
@NoArgsConstructor
public class Portability
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID portabilityId;
    private CellphoneOperator source;
    private CellphoneOperator target;
    private StatusPortability statusPortability;
    @OneToOne
    @JoinColumn( name = "userID" )
    private User user;

    public Portability( PortabilityResume portabilityResume )
    {
        this.source = CellphoneOperator.valueOf( portabilityResume.getSource() );
        this.target = CellphoneOperator.valueOf( portabilityResume.getTarget() );
        this.statusPortability = StatusPortability.PROCESSING_PORTABILITY;
        this.user = new User( portabilityResume.getUserResume() );
    }
}
