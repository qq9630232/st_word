package com.study.st_word.api;


import com.study.st_word.biz.IBizDataService;
import com.study.st_word.bo.LoginBo;
import com.study.st_word.bo.ProgressBo;
import com.study.st_word.bo.Response;
import com.study.st_word.bo.WordBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author songdechuan
 * @date 2021-04-21 18:46
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/data")
public class DataController {

    @Autowired
    private IBizDataService dataService;

    /**
     * 视频资源列表
     * @return
     */
    @RequestMapping(value = "/video/list", method = RequestMethod.POST)
    public Response videoList() {
        return Response.success(dataService.videoList());
    }

    /**
     * 单词资源列表
     * @return
     */
    @RequestMapping(value = "/word/list", method = RequestMethod.POST)
    public Response wordList() {
        return Response.success(dataService.wordList());
    }

    /**
     * 图书资源列表
     * @return
     */
    @RequestMapping(value = "/book/list", method = RequestMethod.POST)
    public Response bookList() {
        return Response.success(dataService.bookList());
    }
    /**
     * 单词资源列表
     * @return
     */
    @RequestMapping(value = "/edit/progress", method = RequestMethod.POST)
    public Response editPro(@RequestBody ProgressBo progressBo) {
        return Response.success(dataService.editPro(progressBo));
    }
    /**
     * 认识单词
     * @return
     */
    @RequestMapping(value = "/word/know", method = RequestMethod.POST)
    public Response know(@RequestBody WordBo wordBo) {
        return Response.success(dataService.know(wordBo));
    }
    /**
     * 不认识单词
     * @return
     */
    @RequestMapping(value = "/word/unknow", method = RequestMethod.POST)
    public Response unknow(@RequestBody WordBo wordBo) {
        return Response.success(dataService.unknow(wordBo));
    }

    /**
     * 认识单词
     * @return
     */
    @RequestMapping(value = "/progress/get", method = RequestMethod.POST)
    public Response getProgress(@RequestBody WordBo wordBo) {
        return Response.success(dataService.getProgress(wordBo));
    }
}
