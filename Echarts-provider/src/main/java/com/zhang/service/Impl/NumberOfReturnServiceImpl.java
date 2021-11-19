package com.zhang.service.Impl;

import com.zhang.dao.NumberOfReturnDao;
import com.zhang.pojo.NumberOfReturn;
import com.zhang.service.NumberOfReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NumberOfReturnServiceImpl implements NumberOfReturnService {
    @Autowired
    private NumberOfReturnDao numberOfReturnDao;
    @Override
    public List<NumberOfReturn> SelectOneDayNumberOfReturn() {
        return numberOfReturnDao.SelectOneDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectTwoDayNumberOfReturn() {
        return numberOfReturnDao.SelectTwoDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectThreeDayNumberOfReturn() {
        return numberOfReturnDao.SelectThreeDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectFourDayNumberOfReturn() {
        return numberOfReturnDao.SelectFourDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectFiveDayNumberOfReturn() {
        return numberOfReturnDao.SelectFiveDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectSixDayNumberOfReturn() {
        return numberOfReturnDao.SelectSixDayNumberOfReturn();
    }

    @Override
    public List<NumberOfReturn> SelectSevenDayNumberOfReturn() {
        return numberOfReturnDao.SelectSevenDayNumberOfReturn();
    }
}
