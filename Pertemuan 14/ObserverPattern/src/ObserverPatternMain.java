public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TabletDisplay tabletDisplay = new TabletDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tabletDisplay);

        System.out.println("Mengubah suhu menjadi 25°C");
        weatherStation.setTemperature(25);

        weatherStation.removeObserver(phoneDisplay);

        System.out.println("\nMengubah suhu menjadi 30°C");
        weatherStation.setTemperature(30);


    }
}
