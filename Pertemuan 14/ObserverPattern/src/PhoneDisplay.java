class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display: Suhu terkini adalah " + temperature + "°C");
    }
}