package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;
import com.zhang.service.NumberOfReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/NumberOfReturn")
public class NumberOfReturnController {
    @Autowired
    private NumberOfReturnService numberOfReturnService;
    @GetMapping("/SelectOneDayNumberOfReturn")
    public Result SelectOneDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectOneDayNumberOfReturn());
    }

    @GetMapping("/SelectTwoDayNumberOfReturn")
    public Result SelectTwoDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectTwoDayNumberOfReturn());
    }

    @GetMapping("/SelectThreeDayNumberOfReturn")
    public Result SelectThreeDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectThreeDayNumberOfReturn());

    }

    @GetMapping("/SelectFourDayNumberOfReturn")
    public Result SelectFourDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectFourDayNumberOfReturn());
    }

    @GetMapping("/SelectFiveDayNumberOfReturn")
    public Result SelectFiveDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectFiveDayNumberOfReturn());
    }

    @GetMapping("/SelectSixDayNumberOfReturn")
    public Result SelectSixDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectSixDayNumberOfReturn());
    }

    @GetMapping("/SelectSevenDayNumberOfReturn")
    public Result SelectSevenDayNumberOfReturn() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfReturnService.SelectSevenDayNumberOfReturn());
    }
}
