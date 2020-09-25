package com.foresee.foreseeweather.gson;

/**
 * Created by 17987891 on 2020/9/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
