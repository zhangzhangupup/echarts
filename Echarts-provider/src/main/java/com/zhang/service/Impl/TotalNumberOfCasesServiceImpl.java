package com.zhang.service.Impl;

import com.zhang.dao.TotalNumberOfCasesDao;
import com.zhang.pojo.TotalNumberOfCases;
import com.zhang.service.TotalNumberOfCasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TotalNumberOfCasesServiceImpl implements TotalNumberOfCasesService {
    @Autowired
    private TotalNumberOfCasesDao totalNumberOfCasesDao;
    @Override
    public List<TotalNumberOfCases> SelectOneDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectOneDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectTwoDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectTwoDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectThreeDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectThreeDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectFourDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectFourDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectFiveDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectFiveDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectSixDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectSixDayTotalNumberOfCases();
    }

    @Override
    public List<TotalNumberOfCases> SelectSevenDayTotalNumberOfCases() {
        return totalNumberOfCasesDao.SelectSevenDayTotalNumberOfCases();
    }
}
