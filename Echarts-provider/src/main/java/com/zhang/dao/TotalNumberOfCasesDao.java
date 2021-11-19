package com.zhang.dao;


import com.zhang.pojo.TotalNumberOfCases;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TotalNumberOfCasesDao {
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
