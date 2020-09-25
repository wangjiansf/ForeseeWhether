package com.foresee.foreseeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 17987891 on 2020/9/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    class More {
        @SerializedName("txt")
        public String info;
    }
}
