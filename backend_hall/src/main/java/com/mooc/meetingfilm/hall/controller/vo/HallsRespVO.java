package com.mooc.meetingfilm.hall.controller.vo;

import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-21 11:42
 **/
@Data
public class HallsRespVO {
    private String cinemaName;
    private String hallName;
    private String filmName;
    private String hallTypeName;
    private String beginTime;
    private String endTime;
    private String filmPrice;
}
