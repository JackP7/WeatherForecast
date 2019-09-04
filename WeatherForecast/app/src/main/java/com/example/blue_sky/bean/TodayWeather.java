package com.example.blue_sky.bean;
/**
 * Created by blue-sky on 2019/1/4.
 */
public class TodayWeather {
    private String city;
    private String updatetime;
    private String wendu;
    private String shidu;
    private String pm25 ;
    private String quality = "暂无数据";
    private String fengxiang;
    private String fengli;
    private String date;
    private String high;
    private String low;
    private String type;
    private String zhisuName;
    private String zhisuValue;
    private String zhisuDetail;
    public void setZhisuDetail(String zhisuDetail) {
        this.zhisuDetail = zhisuDetail;
    }
    public void setZhisuName(String zhisuName) {
        this.zhisuName = zhisuName;
    }
    public void setZhisuValue(String zhisuValue) {
        this.zhisuValue = zhisuValue;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setFengli(String fengli) {
        this.fengli = fengli;
    }
    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }
    public void setHigh(String high) {
        this.high = high;
    }
    public void setLow(String low) {
        this.low = low;
    }
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public void setShidu(String shidu) {
        this.shidu = shidu;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
    public void setWendu(String wendu) {
        this.wendu = wendu;
    }
    public String getDate() {
        return date;
    }
    public String getFengli() {
        return fengli;
    }
    public String getFengxiang() {
        return fengxiang;
    }
    public String getHigh() {
        return high;
    }
    public String getLow() {
        return low;
    }
    public String getPm25() {
        return pm25;
    }
    public String getQuality() {
        return quality;
    }
    public String getShidu() {
        return shidu;
    }
    public String getType() {
        return type;
    }
    public String getUpdatetime() {
        return updatetime;
    }
    public String getWendu() {
        return wendu;
    }
    public String getZhisuDetail() {
        return zhisuDetail;
    }
    public String getZhisuName() {
        return zhisuName;
    }
    public String getZhisuValue() {
        return zhisuValue;
    }
    public String getCity() {
        return city;
    }

}
