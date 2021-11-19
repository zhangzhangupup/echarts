package com.zhang.service.Impl;

import com.zhang.dao.NumberOfNewlyAddedAcceptancesDao;
import com.zhang.pojo.NumberOfNewlyAddedAcceptances;
import com.zhang.service.NumberOfNewlyAddedAcceptancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NumberOfNewlyAddedAcceptancesServiceImpl implements NumberOfNewlyAddedAcceptancesService {
    @Autowired
    private NumberOfNewlyAddedAcceptancesDao numberOfNewlyAddedAcceptancesDao;

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectOneDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectOneDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectTwoDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectTwoDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectThreeDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectThreeDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectFourDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectFourDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectFiveDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectFiveDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectSixDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectSixDayNumberOfNewlyAddedAcceptances();
    }

    @Override
    public List<NumberOfNewlyAddedAcceptances> SelectSevenDayNumberOfNewlyAddedAcceptances() {
        return numberOfNewlyAddedAcceptancesDao.SelectSevenDayNumberOfNewlyAddedAcceptances();
    }
}
