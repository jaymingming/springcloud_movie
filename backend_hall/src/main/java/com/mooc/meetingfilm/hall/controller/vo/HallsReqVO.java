package com.mooc.meetingfilm.hall.controller.vo;

import com.mooc.meetingfilm.utils.common.vo.BasePageVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import lombok.Data;
/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-21 11:50
 **/
@Data
public class HallsReqVO extends BasePageVO {

    private String cinemaId;

    @Override
    public void checkParam() throws CommonServiceException {
        super.checkParam();
    }
}
