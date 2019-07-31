package com.msita.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @Email
    @NotEmpty(message = "Truong bat buoc!")
    private String email;
    @NotNull(message = "Truong bat buoc!")
    @Size(min = 4 , max = 10)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
