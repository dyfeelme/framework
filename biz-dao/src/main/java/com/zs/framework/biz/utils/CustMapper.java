package com.zs.framework.biz.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CustMapper<T> extends Mapper<T>, MySqlMapper<T> {

}