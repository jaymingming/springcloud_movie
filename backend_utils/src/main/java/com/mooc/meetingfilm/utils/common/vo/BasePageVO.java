package com.mooc.meetingfilm.utils.common.vo;

import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import lombok.Data;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.utils.common.vo
 * @description : 分页请求类
 **/
@Data
public class BasePageVO extends BaserRequestVO {

    private Integer nowPage = 1;
    private Integer pageSize = 10;

    @Override
    public void checkParam() throws CommonServiceException {

        // TODO nowpage和pageSize不能为空 balaba
        if(nowPage == null || pageSize == null){
            throw new CommonServiceException(404,"当前页和大小不能为空");
        }
    }
}
