package com.easyweather.android.db;

/**
 * Created by 16535 on 2018/7/4.
 */

public class County {
    private int id;
    private String countyName;
    private String weaherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName=countyName;
    }

    public String getWeaherId(){
        return weaherId;
    }

    public void setWeaherId(String weaherId){
        this.weaherId=weaherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
