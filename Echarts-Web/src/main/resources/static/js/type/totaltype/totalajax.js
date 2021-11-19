function ajaxEcharts(id, url, title, value) {
    var TotalCaseEcharts = echarts.init(document.getElementById(id));
    TotalCaseEcharts.showLoading();
    var TotalCaseDate = [];
    var project = [];
    var TotalCases = [];
    var Totalinventory = [];
    var YJS = [];
    var BaoJiProcessing = [];
    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (TotalCaseData) {
            var data = TotalCaseData.data;
            for (var i = 0; i < data.length; i++) {
                TotalCaseDate.push(data[i].date);
                project.push(data[i].project);
                TotalCases.push(data[i].totalcases);
                Totalinventory.push(data[i].inventory);
                YJS.push(data[i].ysjunderreview);
                BaoJiProcessing.push(data[i].baojiprocessing);
            }
            seriesdata = [TotalCases, Totalinventory, YJS, BaoJiProcessing];
            var seriesname = ['总案件数', '库存数', 'YSJ审核中', '保司处理中'];
            var seriescolor = ["#c6361d", "#a7c61d", "#1dc6a4", "#0f2ecb"]
            if (data.length == 0) {
                title = '今天没数据'
            }
            var series1 = totalseries(seriesdata, seriesname, seriescolor);
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
                },
                legend: {
                    data: seriesname
                },
                xAxis: {
                    data: project,
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',

                        },
                        interval: 0,
                        rotate: 40
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
                series: series1
            })
            var shift = TotalCaseDate.shift();
            Modifyname('TotalCasesul', value, shift)
        }
    })
}