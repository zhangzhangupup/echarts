function stockseries(Title, YDat, color) {
    var series = [];
    for (let i = 0; i < Title.length; i++) {
        series.push({
            // 根据名字对应到相应的系列
            name: Title[i],
            type: 'bar',
            data: YDat[i],

            stack: 'total',
            label: {
                show: true
            },
            emphasis: {
                focus: 'series'
            },
            itemStyle: {
                color: color[i]
            }
        })
    }
    return series;
}
