package tn.smartoffice.backend.model.SubSite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class FrontDoor extends SubSite{
    private final String category = "FrontDoor";
}

