package org.school.sbb2.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @NotEmpty(message = "ID is required.")
    @Size(min = 3, max = 25)
    private String username;
    @NotEmpty(message = "Password is required.")
    private String password1;
    @NotEmpty(message = "Re-entering your password is required.")
    private String password2;
    @NotEmpty(message = "Email address is required.")
    @Email
    private String email;
}
