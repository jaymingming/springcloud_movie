package com.mooc.meetingfilm.cinema.controller.vo;

import com.mooc.meetingfilm.utils.common.vo.BaserRequestVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-20 17:30
 **/
@Data
public class CinemaSavedReqVO extends BaserRequestVO {

    private String brandId;
    private String areaId;
    private String hallTypeIds;
    private String cinemaName;
    private String cinemaAddress;
    private String cinemaTele;
    private String cinemaImgAddress;
    private String cinemaPrice;

    @Override
    public void checkParam() throws CommonServiceException {

    }
}