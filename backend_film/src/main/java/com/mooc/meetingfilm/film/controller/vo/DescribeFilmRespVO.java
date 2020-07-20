package com.mooc.meetingfilm.film.controller.vo;

import lombok.Data;

/**
 * <h3>backend-parent</h3>
 * <p>根据主键获取影片信息对象</p>
 *
 * @author : java练习生
 * @date : 2020-07-19 22:42
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
