function ReturnAjaxEcharts(id, url, title, value) {
    var TotalCaseEcharts = echarts.init(document.getElementById(id));

    TotalCaseEcharts.showLoading();

    var ReturnsDate = [];
    var Returnsproject = [];
    var newcomingreturn = [];
    var successfulreturn = [];
    var failedreturn = [];
    var totalreturn = [];
    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (ReturnCaseData) {
            var data = ReturnCaseData.data;
            for (var i = 0; i < data.length; i++) {
                ReturnsDate.push(data[i].date);
                Returnsproject.push(data[i].project);
                newcomingreturn.push(data[i].newcomingreturn);
                successfulreturn.push(data[i].successfulreturn);
                failedreturn.push(data[i].failedreturn);
                totalreturn.push(data[i].totalreturn);
            }
            var seriesdata = [newcomingreturn, successfulreturn, failedreturn, totalreturn];
            seriesname = ['新进回传数', '当天回传成功数', '当天回传失败数', '当天回传阶段总数'];
            var seriescolor = ["#c6361d", "#a7c61d", "#1dc6a4", "#0f2ecb"]
            if (data.length == 0) {
                title = '今天没数据'
            }
            var series1 = returnsseries(seriesdata, seriesname, seriescolor);
            TotalCaseEcharts.hideLoading();
            TotalCaseEcharts.setOption({
                title: {
                    text: title,
                    textStyle: {
                        color: '#2f2a3b',
                        fontSize: 20
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                }, grid: {
                left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
            },
                legend: {
                    data: seriesname
                },
                xAxis: {
                    data: Returnsproject,
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',

                        },
                        interval: 0,
                        rotate: 40
                    }
                }, toolbox: {
                    top: 20,
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        },
                        dataView: {readOnly: false,optionToContent: TableConversion},
                        magicType: {type: ['line', 'bar']},
                        restore: {},
                        saveAsImage: {}
                    }
                },
                yAxis: {
                    type: 'value',
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',
                        },
                        fontSize: 20,
                    }
                },
                series: series1
            })
            var shift = ReturnsDate.shift();
            Modifyname('middleul', value, shift)
        }
    })
}