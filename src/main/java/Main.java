public class Main {
    public static void main(String[] args) {

        AvitoAd ad1 = new AvitoAd();
        AvitoAd ad2 = new AvitoAd();
        AvitoAd ad3 = new AvitoAd();

        ad1.rooms = 1;
        ad1.metricArea = 31.2;
        ad1.floor = 9;
        ad1.price = 4_046_000;

        ad2.rooms = 1;
        ad2.metricArea = 33;
        ad2.floor = 17;
        ad2.price = 4_350_000;
        ad2.distanceToTheMetro = 2.5;

        ad3.rooms = 3;
        ad3.metricArea = 132.1;
        ad3.floor = 4;
        ad3.price = 21_150_000;
        ad3.distanceToTheMetro = 1.1;

        System.out.println(ad2.metricArea);

    }
}
