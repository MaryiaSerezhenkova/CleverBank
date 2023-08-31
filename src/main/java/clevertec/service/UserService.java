package clevertec.service;

import clevertec.domain.dto.UserDto;
import clevertec.domain.entity.User;

import java.time.LocalDateTime;

public interface UserService extends IService<User, UserDto> {

    UserDto update (long id, LocalDateTime dtUpdate, UserDto user);
    void delete(long id, LocalDateTime dtUpdate);

}
