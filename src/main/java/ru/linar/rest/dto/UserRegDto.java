package ru.linar.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.linar.rest.annotations.FieldMatch;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldMatch.List({
        @FieldMatch(first = "password", second = "passwordRepeat", message = "The password are not equals")
})
public class UserRegDto {
    @NotNull
    @Email(message = "Почта должна быть релевантной")
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String passwordRepeat;
    @NotNull
    private String country;
    @NotNull
    private boolean gender;
    @NotNull
    @AssertTrue(message = "Вы не согласились с условиями соглашения")
    private boolean agreement;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birthday;
}
