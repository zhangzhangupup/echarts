package com.zhang.service;

import com.zhang.pojo.NumberOfNewCasesWithDrawn;

import java.util.List;

public interface NumberOfNewCasesWithDrawnService {
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
