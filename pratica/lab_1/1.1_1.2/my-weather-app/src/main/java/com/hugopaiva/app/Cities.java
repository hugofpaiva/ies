package com.hugopaiva.app;

import java.util.HashMap;

public class Cities {
    private HashMap<String, Integer> citiesCode = new HashMap<String, Integer>();

    public Cities(){
        citiesCode.put("Aveiro", 1010500);
        citiesCode.put("Beja", 1020500);
        citiesCode.put("Braga", 1030300);
        citiesCode.put("Bragança", 1040200);
        citiesCode.put("Castelo Branco", 1050200);
        citiesCode.put("Coimbra", 1060300);
        citiesCode.put("Évora", 1070500);
        citiesCode.put("Guarda", 1090700);
        citiesCode.put("Leiria", 1100900);
        citiesCode.put("Lisboa", 1110600);
        citiesCode.put("Portalegre", 1121400);
        citiesCode.put("Porto", 1131200);
        citiesCode.put("Santarém", 1141600);
        citiesCode.put("Setúbal", 1151200);
        citiesCode.put("Viana do Castelo", 1160900);
        citiesCode.put("Vila Real", 1171400);
        citiesCode.put("Viseu", 1182300);
        citiesCode.put("Funchal", 2310300);
        citiesCode.put("Porto Santo", 2320100);
        citiesCode.put("Vila do Porto", 3410100);
        citiesCode.put("Ponta Delgada", 3420300);
        citiesCode.put("Angra do Heroísmo", 3430100);
        citiesCode.put("Santa Cruz da Graciosa", 3440100);
        citiesCode.put("Velas", 3450200);
        citiesCode.put("Madalena", 3460200);
        citiesCode.put("Horta", 3470100);
        citiesCode.put("Santa Cruz das Flores", 3480200);
        citiesCode.put("Vila do Corvo", 3490100);
    }
    

    public Integer getCityCode(String city) {
        System.out.println(city);
        if(citiesCode.containsKey(city)){
            return citiesCode.get(city);
        } else{
            return 0;
        }
    }


    
}
