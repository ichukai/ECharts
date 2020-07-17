package com.github.abel533.echarts;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DayLabel extends Label {

    private Integer firstDay;
    private List<String> nameMap;


    public DayLabel firstDay(Integer firstDay) {
        this.firstDay = firstDay;
        return this;
    }

    public DayLabel nameMap(String... nameMap) {
        this.nameMap = Arrays.asList(nameMap);
        return this;
    }
}
