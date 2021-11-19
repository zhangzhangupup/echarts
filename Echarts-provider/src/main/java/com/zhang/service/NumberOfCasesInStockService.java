package com.zhang.service;

import com.zhang.pojo.NumberOfCasesInStock;

import java.util.List;

public interface NumberOfCasesInStockService {
    /**
     * 查询最近一周的NumberOfCasesInStockDao表数据（7条）
     *
     * @return
     */
    List<NumberOfCasesInStock> SelectWeekNumberOfCasesInStock();
}
