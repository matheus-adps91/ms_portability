package com.neptum.msportability.domain;

import com.neptum.msportability.framework.adapters.in.rest.dto.LineInformationResume;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table( name = "tb_line_information" )
@Getter
@NoArgsConstructor
public class LineInformation
{
    @Id
    private UUID lineInformationId;
    private String lineNumber;

    public LineInformation( LineInformationResume lineInformationResume )
    {
        this.lineNumber = lineInformationResume.getLineInformation();
    }
}
