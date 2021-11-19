package com.zhang.dao;

import com.zhang.pojo.NumberOfCasesInStock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NumberOfCasesInStockDao {
    /**
     * 查询最近一周的NumberOfCasesInStockDao表数据（7条）
     *
     * @return
     */
    List<NumberOfCasesInStock> SelectWeekNumberOfCasesInStock();
}
