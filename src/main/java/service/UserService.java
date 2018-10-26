package service;

import pojo.result.Result;
import pojo.user.User;

public interface UserService {

    Result getToken(User user);

    Result isLogin();

    Result checkUserName(String username);

    Result login(String username, String password);

    Result logout(String token);
}
