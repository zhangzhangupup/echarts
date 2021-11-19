function totalseries(seriesdata, seriesname, seriescolor) {
    var series = [];
    for (var i = 0; i < seriesdata.length; i++) {
        series.push({
            name: seriesname[i],
            type: 'bar',
            data: seriesdata[i],
            itemStyle: {
                color: seriescolor[i]
            },
            //叠起来的
            // stack: 'total',
            // label: {
            //     show: true
            // },
            emphasis: {
                focus: 'series',
                blurScope: 'coordinateSystem'
            },
        })
    }
    return series;
}