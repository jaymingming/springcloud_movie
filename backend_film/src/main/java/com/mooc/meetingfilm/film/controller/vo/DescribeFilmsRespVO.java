package com.mooc.meetingfilm.film.controller.vo;

import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p>根据影片列表接口返回对象</p>
 *
 * @author : java练习生
 * @date : 202-19 22:34
 **/

@Data
public class DescribeFilmsRespVO {
    private String filmId;
    private String filmStatus;
    private String filmName;
    private String filmEnName;
    private String filmScore;
    private String preSaleNum;
    private String boxOffice;
    private String filmTime;
    private String filmLength;
    private String mainImg;
}
