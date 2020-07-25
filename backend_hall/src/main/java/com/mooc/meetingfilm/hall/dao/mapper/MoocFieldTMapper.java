package com.mooc.meetingfilm.hall.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.hall.controller.vo.HallsReqVO;
import com.mooc.meetingfilm.hall.controller.vo.HallsRespVO;
import com.mooc.meetingfilm.hall.dao.entity.MoocFieldT;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 放映场次表 Mapper 接口
 * </p>
 *
 * @author java练习生
 * @since 2020-07-21
 */
public interface MoocFieldTMapper extends BaseMapper<MoocFieldT> {

    IPage<HallsRespVO> describeHalls(Page<HallsReqVO> page, @Param("ew")QueryWrapper queryWrapper);
}
