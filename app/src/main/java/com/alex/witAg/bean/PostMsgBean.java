package com.alex.witAg.bean;

/**
 * Created by Administrator on 2018-07-03.
 */

public class PostMsgBean {

    /**
     * batvol : string
     * createDate : 2018-07-03T08:11:38.098Z
     * error : string
     * highsta : string
     * imei : string
     * lastUpdateDate : 2018-07-03T08:11:38.098Z
     * sta : string
     * sunvol : string
     */

    private String batvol;
    private String createDate;
    private String error;
    private String highsta;
    private String imei;
    private String lastUpdateDate;
    private String sta;
    private String sunvol;
    private String latitude;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBatvol() {
        return batvol;
    }

    public void setBatvol(String batvol) {
        this.batvol = batvol;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getHighsta() {
        return highsta;
    }

    public void setHighsta(String highsta) {
        this.highsta = highsta;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getSunvol() {
        return sunvol;
    }

    public void setSunvol(String sunvol) {
        this.sunvol = sunvol;
    }
}
