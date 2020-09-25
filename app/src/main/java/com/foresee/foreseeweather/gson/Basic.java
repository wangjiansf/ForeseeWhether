package com.foresee.foreseeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 17987891 on 2020/9/24.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
