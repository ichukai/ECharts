package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.TextStyle;

import java.util.Arrays;
import java.util.List;

public class WordCloud extends Series {

    /*The shape of the "cloud" to draw. Can be any polar equation represented as a
     callback function, or a keyword present. Available presents are circle (default),
     cardioid (apple or heart shape curve, the most known polar equation), diamond (
     alias of square), triangle-forward, triangle, (alias of triangle-upright, pentagon, and star.
    */
    private String shape;
    private List<Integer> sizeRange;
    private Integer gridSize;
    private TextStyle textStyle;
    private List<Integer> rotationRange;
    private Integer rotationStep;


    public WordCloud() {
        this.setType(SeriesType.wordCloud);
    }

    public WordCloud shape(String shape) {
        this.shape = shape;
        return this;
    }

    public WordCloud textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public WordCloud gridSize(Integer gridSize) {
        this.gridSize = gridSize;
        return this;
    }

    // Text size range which the value in data will be mapped to.
    // Default to have minimum 12px and maximum 60px size.
    public WordCloud sizeRange(Integer min, Integer max) {
        this.sizeRange = Arrays.asList(min, max);
        return this;
    }


    public WordCloud rotationStep(Integer rotationStep) {
        this.rotationStep = rotationStep;
        return this;
    }

    //  // Text rotation range and step in degree. Text will be rotated randomly in range [-90, 90] by rotationStep 45
    public WordCloud rotationRange(Integer min, Integer max) {
        this.rotationRange = Arrays.asList(min, max);
        return this;
    }

}
