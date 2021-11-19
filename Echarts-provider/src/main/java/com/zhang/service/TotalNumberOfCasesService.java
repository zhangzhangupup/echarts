package com.zhang.service;

import com.zhang.pojo.TotalNumberOfCases;

import java.util.List;

public interface TotalNumberOfCasesService {
    /**
     * 查询第一天的数据
     */
    List<TotalNumberOfCases> SelectOneDayTotalNumberOfCases();

    /**
     * 查询第二天的数据
     */
    List<TotalNumberOfCases> SelectTwoDayTotalNumberOfCases();

    /**
     * 查询第三天的数据
     */
    List<TotalNumberOfCases> SelectThreeDayTotalNumberOfCases();

    /**
     * 查询第四天的数据
     */
    List<TotalNumberOfCases> SelectFourDayTotalNumberOfCases();

    /**
     * 查询第五天的数据
     */
    List<TotalNumberOfCases> SelectFiveDayTotalNumberOfCases();

    /**
     * 查询第六天的数据
     */
    List<TotalNumberOfCases> SelectSixDayTotalNumberOfCases();

    /**
     * 查询第七天的数据
     */
    List<TotalNumberOfCases> SelectSevenDayTotalNumberOfCases();
}
