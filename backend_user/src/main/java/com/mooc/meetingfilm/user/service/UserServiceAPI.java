package com.mooc.meetingfilm.user.service;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * <h3>backend-parent</h3>
 * <p>用户接口</p>
 *
 * @author : java练习生
 * @date : 2020-07-19 10:04
 **/
public interface UserServiceAPI {
    String checkUserLogin(String username, String password) throws CommonServiceException;
}
