package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class Axis {
    public Object position;
    public String name;
    public NameLocation nameLocation;
    public LineStyle nameTextStyle;
    public Boolean boundaryGap;

    public AxisLine axisLine;
    public AxisTick axisTick;
    public AxisLabel axisLabel;
    public SplitLine splitLine;
    public SplitArea splitArea;
}