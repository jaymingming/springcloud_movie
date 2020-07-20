package com.mooc.meetingfilm.film.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.common.collect.Maps;
import com.mooc.meetingfilm.film.controller.vo.DescribeActorRespVo;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmRespVO;
import com.mooc.meetingfilm.film.controller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.controller.vo.FilmSavedReqVO;
import com.mooc.meetingfilm.film.service.FilmServiceAPI;
import com.mooc.meetingfilm.utils.common.vo.BasePageVO;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

/**
 * <h3>backend-parent</h3>
 * <p>影片模块表现层</p>
 *
 * @author : java练习生
 * @date : 2020-07-19 22:10
 **/
@Slf4j
@RestController
@RequestMapping(value = "/films")
public class FilmController {

    @Autowired
    private FilmServiceAPI filmServiceAPI;

    // 获取演员列表
    @RequestMapping(value = "/actors",method = RequestMethod.GET)
    public BaseResponseVO describeActors(BasePageVO basePageVO) throws CommonServiceException {
        // 检查入参
        basePageVO.checkParam();

        // 调用逻辑层，获取返回参数
        IPage<DescribeActorRespVo> results = filmServiceAPI.describeActors(basePageVO.getNowPage(),basePageVO.getPageSize());

        Map<String, Object> actors = descrbePageResult(results, "actors");

        return BaseResponseVO.success(actors);
    }

    // 获取电影列表
    @RequestMapping(value = "",method = RequestMethod.GET)
    public BaseResponseVO describeFilms(HttpServletRequest request, BasePageVO basePageVO) throws CommonServiceException {
        // Header信息都打印一下
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String headName = headerNames.nextElement();
            log.error("describeFilms - headName:{}, headValue:{}", headName, request.getHeader(headName));
        }
        // 检查入参
        basePageVO.checkParam();

        // 调用逻辑层，获取返回参数
        IPage<DescribeFilmsRespVO> results = filmServiceAPI.describeFilms(basePageVO.getNowPage(),basePageVO.getPageSize());

        Map<String, Object> films = descrbePageResult(results, "films");

        return BaseResponseVO.success(films);
    }


    // 根据电影主键获取电影信息
    @RequestMapping(value = "/{filmId}",method = RequestMethod.GET)
    public BaseResponseVO describeFilmById(@PathVariable("filmId")String filmId) throws CommonServiceException {

        DescribeFilmRespVO describeFilmRespVO = filmServiceAPI.describeFilmById(filmId);
        if(describeFilmRespVO == null){
            return BaseResponseVO.success();
        }else{
            return BaseResponseVO.success(describeFilmRespVO);
        }

    }

    // 根据电影编号获取电影信息
    @RequestMapping(value = "/film:add",method = RequestMethod.POST)
    public BaseResponseVO saveFilmInfo(@RequestBody FilmSavedReqVO filmSavedReqVO) throws CommonServiceException {

        filmServiceAPI.saveFilm(filmSavedReqVO);

        return BaseResponseVO.success();
    }

    // 获取分页对象的公共接口
    private Map<String,Object> descrbePageResult(IPage page, String title){
        Map<String,Object> result = Maps.newHashMap();

        result.put("totalSize",page.getTotal());
        result.put("totalPages",page.getPages());
        result.put("pageSize",page.getSize());
        result.put("nowPage",page.getCurrent());

        result.put(title, page.getRecords());

        return result;
    }

}
