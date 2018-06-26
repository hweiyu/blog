package com.hwy.blog.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:05
 **/
@RestController
@RequestMapping("${api.url.prefix}")
@Api(description = "图片接口")
public class ImageController extends BaseController {
}
