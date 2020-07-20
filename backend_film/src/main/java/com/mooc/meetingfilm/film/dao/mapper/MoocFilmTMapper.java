package com.mooc.meetingfilm.film.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmRespVO;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.dao.entity.MoocFilmT;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 影片主表 Mapper 接口
 * </p>
 *
 * @author java练习生
 * @since 2020-07-19
 */
public interface MoocFilmTMapper extends BaseMapper<MoocFilmT> {
    IPage<DescribeFilmsRespVO> describeFilms(Page<DescribeFilmsRespVO> page);

    DescribeFilmRespVO descrbeFilmById(@Param("filmId") String filmId);
}
