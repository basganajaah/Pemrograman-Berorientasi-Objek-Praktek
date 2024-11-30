class TabletDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Tablet display: Suhu terkini adalah " + temperature + "°C");
    }
}