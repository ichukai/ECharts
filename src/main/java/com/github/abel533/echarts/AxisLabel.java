package com.github.abel533.echarts;

public class AxisLabel extends Label {

    private Integer distance;//标签与刻度线的距离


    public AxisLabel distance(Integer distance) {
        this.distance = distance;
        return this;
    }

}
