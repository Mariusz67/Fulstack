package com.company.enroller.meeting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String description;


}
