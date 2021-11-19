package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;

import com.zhang.service.NumberOfNewCasesWithDrawnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/NumberOfNewCasesWithDrawn")
public class NumberOfNewCasesWithDrawnController {
    @Autowired
    private NumberOfNewCasesWithDrawnService numberOfNewCasesWithDrawnService;

    @GetMapping("/SelectOneDayNumberOfNewCasesWithDrawn")
    public Result SelectOneDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectOneDayNumberOfNewCasesWithDrawn());
    }

    @GetMapping("/SelectTwoDayNumberOfNewCasesWithDrawn")
    public Result SelectTwoDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectTwoDayNumberOfNewCasesWithDrawn());
    }

    @GetMapping("/SelectThreeDayNumberOfNewCasesWithDrawn")
    public Result SelectThreeDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectThreeDayNumberOfNewCasesWithDrawn());

    }

    @GetMapping("/SelectFourDayNumberOfNewCasesWithDrawn")
    public Result SelectFourDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectFourDayNumberOfNewCasesWithDrawn());
    }

    @GetMapping("/SelectFiveDayNumberOfNewCasesWithDrawn")
    public Result SelectFiveDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectFiveDayNumberOfNewCasesWithDrawn());
    }

    @GetMapping("/SelectSixDayNumberOfNewCasesWithDrawn")
    public Result SelectSixDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectSixDayNumberOfNewCasesWithDrawn());
    }

    @GetMapping("/SelectSevenDayNumberOfNewCasesWithDrawn")
    public Result SelectSevenDayNumberOfNewCasesWithDrawn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfNewCasesWithDrawnService.SelectSevenDayNumberOfNewCasesWithDrawn());
    }
}
