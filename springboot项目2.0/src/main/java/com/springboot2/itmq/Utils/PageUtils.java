package com.springboot2.itmq.Utils;

import com.github.pagehelper.PageInfo;
import com.springboot2.itmq.entity.PageRequest;
import com.springboot2.itmq.entity.PageResult;

public class PageUtils {
    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
