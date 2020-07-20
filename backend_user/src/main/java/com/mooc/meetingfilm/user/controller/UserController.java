package com.mooc.meetingfilm.user.controller;

import com.mooc.meetingfilm.user.controller.vo.LoginReqVO;
import com.mooc.meetingfilm.user.service.UserServiceAPI;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.utils.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>backend-parent</h3>
 * <p>用户模块表现层</p>
 * @author : java练习生
 * @date : 2020-07-18 15:52
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceAPI serviceAPI;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponseVO login(@RequestBody LoginReqVO reqVO) throws CommonServiceException {


        // 数据验证
        reqVO.checkParam();

        // 验证用户名和密码是否正确
        String userId = serviceAPI.checkUserLogin(reqVO.getUsername(),reqVO.getPassword());

        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();

        String randomKey = jwtTokenUtil.getRandomKey();
        String token = jwtTokenUtil.generateToken(userId, randomKey);

        /*
            createTime
            过期时间
            randomkey - JWT数据签名： AES -> 源数据 + 盐 -> 在token中解析出randomkey -> 数据验签
            userid - 用户身份验证
         */

        // randomKey  token
        Map<String,String> result = new HashMap<>();
        result.put("randomKey",randomKey);
        result.put("token",token);

        return BaseResponseVO.success(result);
    }

}
