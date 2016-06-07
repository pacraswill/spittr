package com.spittr.data;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

import com.sun.org.apache.xpath.internal.operations.Equals;
import javafx.scene.chart.PieChart;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
/**
 * Created by Allen on 2016/4/16.
 */

public class Spittle {
    private Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private  Double longitute;

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }
    public Spittle(
            String message, Date time, Double longitute, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitute = longitute;
        this.latitude = latitude;
    }
    public long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }
    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
