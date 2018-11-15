package org.project.service;


import org.projectshop.pojo.User;
import org.projectshop.pojo.result.Result;

public interface UserService {

    public Result getToken(User user);

    public Result isLogin();

    public Result checkUserName(String username);

    public Result login(String username, String password);

    public Result logout(String token);
}
