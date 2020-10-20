package com.hugopaiva.app;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.ListIterator;

import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    private static final int CITY_ID_AVEIRO = 1010500;

    private static int CITY_ID_ARGS;
    /*
     * loggers provide a better alternative to System.out.println
     * https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = Logger.getLogger(WeatherStarter.class.getName());

    
    /** 
     * @param args
     */
    public static void  main(String[] args ) {
        Cities c = new Cities();

        if (args != null && args.length == 2) {
            if (args[0].equals("-c")){
                Integer cityId = c.getCityCode(args[1]);
                if(cityId != 0){
                    CITY_ID_ARGS = cityId;
                }else{
                    logger.info("City not found!");
                    System.exit(1);
                }
            }

        } else{
            logger.info("No Arguments passed");
            System.exit(1);
        }

        /*
        get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_ARGS);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {

                ListIterator<CityForecast> list = forecast.getData().listIterator();

                while(list.hasNext()){
                    CityForecast cityForecast = list.next();

                    logger.info("---- Forecast for "+ cityForecast.getForecastDate() +" ----");
                    logger.info("Max temp: " + cityForecast.getTMax());
                    logger.info("Min temp: " + cityForecast.getTMin());
                    logger.info("Weather Type: " + c.getIdWeatherType()); 
                    logger.info("Precip prob: " + cityForecast.getPrecipitaProb()); 
                    logger.info("Wind Direction: " + c.getPredWindDir()); 
                    logger.info("Classified wind speed: " + c.getClassWindSpeed());  
                    logger.info("Longitude: " + c.getLongitude());   
                    logger.info("Latitude: " + c.getLatitude());
                    
                }
            } else {
                logger.info( "No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
