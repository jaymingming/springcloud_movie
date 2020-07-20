package com.mooc.meetingfilm.film.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.film.controller.vo.DescribeActorRespVo;
import com.mooc.meetingfilm.film.dao.entity.MoocActorT;

/**
 * <p>
 * 演员表 Mapper 接口
 * </p>
 *
 * @author java练习生
 * @since 2020-07-19
 */
public interface MoocActorTMapper extends BaseMapper<MoocActorT> {
    IPage<DescribeActorRespVo> describeActors(Page<DescribeActorRespVo> page);
}
