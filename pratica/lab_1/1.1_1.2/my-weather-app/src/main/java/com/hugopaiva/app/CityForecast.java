package com.hugopaiva.app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * the data point with the forecast for a city in a day
 */
public class CityForecast {

    @SerializedName("precipitaProb")
    @Expose
    private String precipitaProb;
    @SerializedName("tMin")
    @Expose
    private String tMin;
    @SerializedName("tMax")
    @Expose
    private String tMax;
    @SerializedName("predWindDir")
    @Expose
    private String predWindDir;
    @SerializedName("idWeatherType")
    @Expose
    private Integer idWeatherType;
    @SerializedName("classWindSpeed")
    @Expose
    private Integer classWindSpeed;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("forecastDate")
    @Expose
    private String forecastDate;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    
    /** 
     * @return String
     */
    public String getPrecipitaProb() {
        return precipitaProb;
    }

    
    /** 
     * @param precipitaProb
     */
    public void setPrecipitaProb(String precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    
    /** 
     * @return String
     */
    public String getTMin() {
        return tMin;
    }

    
    /** 
     * @param tMin
     */
    public void setTMin(String tMin) {
        this.tMin = tMin;
    }

    
    /** 
     * @return String
     */
    public String getTMax() {
        return tMax;
    }

    
    /** 
     * @param tMax
     */
    public void setTMax(String tMax) {
        this.tMax = tMax;
    }

    
    /** 
     * @return String
     */
    public String getPredWindDir() {
        return predWindDir;
    }

    
    /** 
     * @param predWindDir
     */
    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    
    /** 
     * @return Integer
     */
    public Integer getIdWeatherType() {
        return idWeatherType;
    }

    
    /** 
     * @param idWeatherType
     */
    public void setIdWeatherType(Integer idWeatherType) {
        this.idWeatherType = idWeatherType;
    }

    
    /** 
     * @return Integer
     */
    public Integer getClassWindSpeed() {
        return classWindSpeed;
    }

    
    /** 
     * @param classWindSpeed
     */
    public void setClassWindSpeed(Integer classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

    
    /** 
     * @return String
     */
    public String getLongitude() {
        return longitude;
    }

    
    /** 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    
    /** 
     * @return String
     */
    public String getForecastDate() {
        return forecastDate;
    }

    
    /** 
     * @param forecastDate
     */
    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    
    /** 
     * @return String
     */
    public String getLatitude() {
        return latitude;
    }

    
    /** 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}