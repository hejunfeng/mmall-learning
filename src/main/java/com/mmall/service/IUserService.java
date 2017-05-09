package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by kaka on 2017/5/7.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password );
    ServerResponse<String> register(User user);
    ServerResponse<String> checkVaild(String str,String type);
    ServerResponse<String> selectQuestionByUsername(String username);
    ServerResponse<String> checkAnswer(String username,String question, String answer);
    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);
    ServerResponse<User> updateInformation(User user);
}
