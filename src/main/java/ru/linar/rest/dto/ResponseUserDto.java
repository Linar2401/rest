package ru.linar.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.linar.rest.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseUserDto {
    private User data;
}
