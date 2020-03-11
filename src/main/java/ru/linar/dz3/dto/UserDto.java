package ru.linar.dz3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.linar.dz3.models.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String email;
    private String country;
    private boolean gender;
    private LocalDateTime createdAt;


    public static UserDto from(User user){
        return UserDto.builder()
                .country(user.getCountry())
                .email(user.getEmail())
                .gender(user.isGender())
                .id(user.getId())
                .createdAt(user.getCreatedAt())
                .build();

    }

    public static List<UserDto> from(List<User> users) {
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }
}
