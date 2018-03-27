package es.momopocket.temperatureconverter;

/**
 * Created by ines.vico on 26/3/18.
 */

public class ConverterUtil {

    public static float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit-32)*5/9);
    }

    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius*9)/5)+32;
    }
}
