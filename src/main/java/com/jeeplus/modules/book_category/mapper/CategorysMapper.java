/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.book_category.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.book_category.entity.Category;

import java.util.List;

/**
 * 管理类别MAPPER接口
 *
 * @author 高龙
 * @version 2019-01-07
 */
@MyBatisMapper
public interface CategorysMapper extends BaseMapper<Category> {

    public List<Category> selectAllCategory();

}