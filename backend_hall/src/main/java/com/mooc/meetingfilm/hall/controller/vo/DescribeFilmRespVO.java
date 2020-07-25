package com.mooc.meetingfilm.hall.controller.vo;

import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-21 15:19
 **/
@Data
public class DescribeFilmRespVO {

    private String filmId;
    private String filmName;
    private String filmLength;
    private String filmCats;
    private String actors;
    private String imgAddress;
    private String subAddress;


}
