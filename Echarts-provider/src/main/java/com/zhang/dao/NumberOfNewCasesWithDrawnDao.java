package com.zhang.dao;

import com.zhang.pojo.NumberOfNewCasesWithDrawn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NumberOfNewCasesWithDrawnDao {
    /**
     * 查询第一天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectOneDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第二天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectTwoDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第三天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectThreeDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第四天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectFourDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第五天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectFiveDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第六天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectSixDayNumberOfNewCasesWithDrawn();

    /**
     * 查询第七天的数据
     */
    List<NumberOfNewCasesWithDrawn> SelectSevenDayNumberOfNewCasesWithDrawn();
}
