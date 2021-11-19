package com.zhang.service.Impl;

import com.zhang.dao.NumberOfNewCasesWithDrawnDao;
import com.zhang.pojo.NumberOfNewCasesWithDrawn;
import com.zhang.service.NumberOfNewCasesWithDrawnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NumberOfNewCasesWithDrawnServiceImpl implements NumberOfNewCasesWithDrawnService {
    @Autowired
    private NumberOfNewCasesWithDrawnDao numberOfNewCasesWithDrawnDao;

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectOneDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectOneDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectTwoDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectTwoDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectThreeDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectThreeDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectFourDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectFourDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectFiveDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectFiveDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectSixDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectSixDayNumberOfNewCasesWithDrawn();
    }

    @Override
    public List<NumberOfNewCasesWithDrawn> SelectSevenDayNumberOfNewCasesWithDrawn() {
        return numberOfNewCasesWithDrawnDao.SelectSevenDayNumberOfNewCasesWithDrawn();
    }
}
