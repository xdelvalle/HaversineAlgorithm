package com.xdelvalle.haversine;

public class TestHaversine {

    private double lat1 = 41.426898;
    private double lon1 = 2.217234;

    private double lat2 = 41.375072;
    private double lon2 = 2.149072;

    public static void main(String[] args) {
        new TestHaversine().start();
    }

    private void start() {
        double distancia = HaversineAlgorithm.getInstance().getDistanceInMeters(lat1, lon1, lat2, lon2);

        System.out.println("Distancia = " + distancia + " metros!");
    }
}
