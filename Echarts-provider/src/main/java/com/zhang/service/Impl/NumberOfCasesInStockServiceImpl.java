package com.zhang.service.Impl;

import com.zhang.dao.NumberOfCasesInStockDao;
import com.zhang.pojo.NumberOfCasesInStock;
import com.zhang.service.NumberOfCasesInStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试创建新的分支
 */
@Service
public class NumberOfCasesInStockServiceImpl implements NumberOfCasesInStockService {
    @Autowired
    private NumberOfCasesInStockDao numberOfCasesInStockDao;
    @Override
    public List<NumberOfCasesInStock> SelectWeekNumberOfCasesInStock() {
        return numberOfCasesInStockDao.SelectWeekNumberOfCasesInStock();
    }
}
