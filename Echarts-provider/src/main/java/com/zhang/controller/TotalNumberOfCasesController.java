package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;
import com.zhang.service.TotalNumberOfCasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/TotalNumberOfCases")
public class TotalNumberOfCasesController {
    @Autowired
    private TotalNumberOfCasesService totalNumberOfCasesService;
    @GetMapping("/SelectOneDayTotalNumberOfCases")
    public Result SelectOneDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectOneDayTotalNumberOfCases());
    }

    @GetMapping("/SelectTwoDayTotalNumberOfCases")
    public Result SelectTwoDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectTwoDayTotalNumberOfCases());
    }

    @GetMapping("/SelectThreeDayTotalNumberOfCases")
    public Result SelectThreeDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectThreeDayTotalNumberOfCases());

    }

    @GetMapping("/SelectFourDayTotalNumberOfCases")
    public Result SelectFourDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectFourDayTotalNumberOfCases());
    }

    @GetMapping("/SelectFiveDayTotalNumberOfCases")
    public Result SelectFiveDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectFiveDayTotalNumberOfCases());
    }

    @GetMapping("/SelectSixDayTotalNumberOfCases")
    public Result SelectSixDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectSixDayTotalNumberOfCases());
    }

    @GetMapping("/SelectSevenDayTotalNumberOfCases")
    public Result SelectSevenDayTotalNumberOfCases() {
        return new Result(true, StatusCode.OK, "查询成功", totalNumberOfCasesService.SelectSevenDayTotalNumberOfCases());
    }
}
