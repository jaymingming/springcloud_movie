package com.mooc.meetingfilm.utils.common.vo;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * <h3>backend-parent</h3>
 * <p>公共请求对象</p>
 *
 * @author : java练习生
 **/
public abstract class BaserRequestVO {

    /**
     *公共数据验证
     */
    public abstract void checkParam() throws CommonServiceException;
}
