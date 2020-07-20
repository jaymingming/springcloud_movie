package com.mooc.meetingfilm.film.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.meetingfilm.film.controller.vo.DescribeActorRespVo;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmRespVO;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.controller.vo.FilmSavedReqVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;

public interface FilmServiceAPI {
    // 获取演员列表
    IPage<DescribeActorRespVo> describeActors(int nowPage, int pageSize) throws CommonServiceException;

    // 获取电影列表
    IPage<DescribeFilmsRespVO> describeFilms(int nowPage, int pageSize) throws CommonServiceException;

    // 根据主键获取电影信息
    DescribeFilmRespVO describeFilmById(String filmId) throws CommonServiceException;

    // 保存电影信息
    void saveFilm(FilmSavedReqVO filmSavedReqVO) throws CommonServiceException;
}
