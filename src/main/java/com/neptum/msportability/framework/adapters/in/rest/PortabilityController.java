package com.neptum.msportability.framework.adapters.in.rest;

import com.neptum.msportability.application.ports.in.PortabilityService;
import com.neptum.msportability.framework.adapters.in.rest.dto.PortabilityResume;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PortabilityController
{
    private final PortabilityService portabilityService;

    @PostMapping("/portability")
    public void createPoratability(
        final @RequestBody PortabilityResume portabilityResume )
    {
        portabilityService.createPortability( portabilityResume );
    }
}
