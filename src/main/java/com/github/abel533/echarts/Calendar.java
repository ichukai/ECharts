package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.Position;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public class Calendar {

    private String top;

    private Position left;

    /**
     * 布局方式，默认为垂直布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Orient
     */
    private Orient orient;
    private List<Integer> cellSize;
    private Label yearLabel;
    private Label dayLabel;
    private Label monthLabel;
    private List<String> range;

    public Calendar top(String top) {
        this.top = top;
        return this;
    }

    public Calendar left(Position left) {
        this.left = left;
        return this;
    }

    public Calendar orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Calendar cellSize(Integer... cellSize) {
        this.cellSize = Arrays.asList(cellSize);
        return this;
    }

    public Calendar yearLabel(Label yearLabel) {
        this.yearLabel = yearLabel;
        return this;
    }

    public Calendar dayLabel(Label dayLabel) {
        this.dayLabel = dayLabel;
        return this;
    }

    public Calendar monthLabel(Label monthLabel) {
        this.monthLabel = monthLabel;
        return this;
    }

    public Calendar range(String... range) {
        this.range = Arrays.asList(range);
        return this;
    }


}
