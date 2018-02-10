package com.xdelvalle.haversine;

public class HaversineAlgorithm {
    private static HaversineAlgorithm instance = new HaversineAlgorithm();

    private final double EARTH_RADIUS = 6371;

    private HaversineAlgorithm() { }

    public double getDistanceInKm(double lat1, double lon1, double lat2, double lon2) {
        double latitud  = toRadians(lat2 - lat1);
        double longitud = toRadians(lon2 - lon1);

        double a = Math.pow(Math.sin(latitud / 2), 2) + Math.cos(toRadians(lat1)) * Math.cos(toRadians(lat2)) * Math.pow(Math.sin(longitud / 2) , 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }

    public double getDistanceInMeters(double lat1, double lon1, double lat2, double lon2) {
        return getDistanceInKm(lat1, lon1, lat2, lon2) * 1000;
    }

    private double toRadians(double input) {
        return input * (Math.PI / 180);
    }

    public static HaversineAlgorithm getInstance() {
        return instance;
    }
}
