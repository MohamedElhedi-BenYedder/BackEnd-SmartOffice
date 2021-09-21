package tn.smartoffice.backend.dto.LogIn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasicAuthDto {
    private String email;
    private String password;
}
