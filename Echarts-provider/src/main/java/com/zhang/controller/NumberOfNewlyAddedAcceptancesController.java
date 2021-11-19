package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;
import com.zhang.service.NumberOfNewlyAddedAcceptancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/NumberOfNewlyAddedAcceptances")
public class NumberOfNewlyAddedAcceptancesController {
    @Autowired
    private NumberOfNewlyAddedAcceptancesService numberOfNewlyAddedAcceptancesService;

    @GetMapping("/SelectOneDayNumberOfNewlyAddedAcceptances")
    public Result SelectOneDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectOneDayNumberOfNewlyAddedAcceptances());
    }

    @GetMapping("/SelectTwoDayNumberOfNewlyAddedAcceptances")
    public Result SelectTwoDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectTwoDayNumberOfNewlyAddedAcceptances());
    }

    @GetMapping("/SelectThreeDayNumberOfNewlyAddedAcceptances")
    public Result SelectThreeDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectThreeDayNumberOfNewlyAddedAcceptances());

    }

    @GetMapping("/SelectFourDayNumberOfNewlyAddedAcceptances")
    public Result SelectFourDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectFourDayNumberOfNewlyAddedAcceptances());
    }

    @GetMapping("/SelectFiveDayNumberOfNewlyAddedAcceptances")
    public Result SelectFiveDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectFiveDayNumberOfNewlyAddedAcceptances());
    }

    @GetMapping("/SelectSixDayNumberOfNewlyAddedAcceptances")
    public Result SelectSixDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectSixDayNumberOfNewlyAddedAcceptances());
    }

    @GetMapping("/SelectSevenDayNumberOfNewlyAddedAcceptances")
    public Result SelectSevenDayNumberOfNewlyAddedAcceptances() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewlyAddedAcceptancesService.SelectSevenDayNumberOfNewlyAddedAcceptances());
    }
}
