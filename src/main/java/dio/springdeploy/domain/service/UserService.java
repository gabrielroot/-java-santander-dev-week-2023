package dio.springdeploy.domain.service;

import dio.springdeploy.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
