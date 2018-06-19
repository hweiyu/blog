package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.ImageDao;
import com.hwy.blog.core.model.Image;
import com.hwy.blog.core.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:00
 **/
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;

    @Override
    public int insert(Image model) {
        return 0;
    }

    @Override
    public int delete(Image model) {
        return 0;
    }

    @Override
    public int update(Image model) {
        return 0;
    }

    @Override
    public Optional<List<Image>> select(Image model) {
        return Optional.empty();
    }

    @Override
    public Optional<Image> get(Image model) {
        return Optional.empty();
    }
}
