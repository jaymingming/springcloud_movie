package com.mooc.meetingfilm.cinema.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.cinema.dao.entity.MoocCinemaT;
import com.mooc.meetingfilm.cinema.dao.mapper.MoocCinemaTMapper;
import com.mooc.meetingfilm.cinema.service.CinemaServiceAPI;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>backend-parent</h3>
 * <p>影院业务层接口</p>
 *
 * @author : java练习生
 * @date : 2020-07-20 17:34
 **/
@Service
public class CinemaServiceImpl implements CinemaServiceAPI {
    @Resource
    private MoocCinemaTMapper cinemaTMapper;

    @Override
    public void saveCinema(CinemaSavedReqVO reqVO) throws CommonServiceException {
        MoocCinemaT cinema = new MoocCinemaT();

        // TODO 填写具体参数
        cinema.setCinemaName(reqVO.getCinemaName());
        cinema.setCinemaPhone(reqVO.getCinemaTele());
        cinema.setBrandId(Integer.valueOf(reqVO.getBrandId()));
        cinema.setAreaId(Integer.valueOf(reqVO.getAreaId()));
        cinema.setHallIds(reqVO.getHallTypeIds());
        cinema.setImgAddress(reqVO.getCinemaImgAddress());
        cinema.setCinemaAddress(reqVO.getCinemaAddress());
        cinema.setMinimumPrice(Integer.valueOf(reqVO.getCinemaPrice()));

        // TODO 记得把实体对象进行保存

        cinemaTMapper.insert(cinema);
    }


    @Override
    public IPage<DescribeCinemasRespVO> describeCinemas(int nowPage, int pageSize) throws CommonServiceException {

        // 查询实体对象，然后与表现层对象进行交互
        // TODO 提示
//        Page<MoocCinemaT> page = new Page<>(nowPage,pageSize);
        IPage<DescribeCinemasRespVO> moocCinemaTIPage = cinemaTMapper.DescribeCinemasRespVO(new Page<>(nowPage,pageSize));

        return moocCinemaTIPage;
    }
}
