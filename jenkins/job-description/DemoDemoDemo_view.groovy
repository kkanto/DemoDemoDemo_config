 
listView('DemoDemoDemo Jobs') {
    description('DemoDemoDemo Jobs')
    jobs {
        regex('DemoDemoDemo_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
