package com.shangpin.mybatis.mapper

import com.shangpin.mybatis.model.Person

/**
 * Created by Administrator on 14-12-13.
 */
public interface PersonMapper {
    public List<Person> selectAll();
}