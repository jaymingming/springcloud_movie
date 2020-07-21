package com.mooc.meetingfilm.cinema.dao.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.cinema.dao.entity.MoocCinemaT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 影院信息表 Mapper 接口
 * </p>
 *
 * @author java练习生
 * @since 2020-07-20
 */
public interface MoocCinemaTMapper extends BaseMapper<MoocCinemaT> {

    IPage<DescribeCinemasRespVO> DescribeCinemasRespVO(Page<DescribeCinemasRespVO> page);
}
