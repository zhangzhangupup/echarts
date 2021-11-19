package com.zhang.service;

import com.zhang.pojo.NumberOfNewlyAddedAcceptances;

import java.util.List;

public interface NumberOfNewlyAddedAcceptancesService {
    /**
     * 查询第一天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectOneDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第二天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectTwoDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第三天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectThreeDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第四天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectFourDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第五天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectFiveDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第六天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectSixDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第七天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectSevenDayNumberOfNewlyAddedAcceptances();
}
