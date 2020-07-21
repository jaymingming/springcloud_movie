package com.mooc.meetingfilm.film.controller.vo;

import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p>根据主键对象获取影片信息对象</p>
 *
 * @author : java练习生
 * @date : 2020-07-20 16:03
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
