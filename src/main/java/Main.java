public class Main {
    public static void main(String[] args) {

        AvitoAd ad1 = new AvitoAd();
        AvitoAd ad2 = new AvitoAd();
        AvitoAd ad3 = new AvitoAd();

        ad1.id = 2049124397; // id, URL, image взяты с других объявлений
        ad1.URL = "https://www.avito.ru/kazan/kvartiry/1-k_kvartira_51.2_m_33_et._2049124397";
        ad1.image = "https://83.img.avito.st/image/1/1lfKFbayer78vLi76hrUNDe2erhqtHg";
        ad1.rooms = 1;
        ad1.metricArea = 31.2;
        ad1.floor = 9;
        ad1.floorsInTheHouse = 19;
        ad1.price = 4_046_000;
        ad1.housingComplex = "ЖК Станция Спортивная";
        ad1.address = "пр-д Детский, д. 1.2";
        ad1.district = "р-н Приволжский";
        ad1.seller = "Агентство";
        ad1.like = false;
        ad1.created = 4;

        ad2.id = 2081398926;
        ad2.URL = "https://www.avito.ru/kazan/kvartiry/1-k._kvartira_393_m110_et._2081398926";
        ad2.image = "https://68.img.avito.st/image/1/wfT-6baybR3IXu8Q8MaH2QZKbRteSG8";
        ad2.rooms = 1;
        ad2.metricArea = 33;
        ad2.floor = 17;
        ad2.floorsInTheHouse = 19;
        ad2.price = 4_350_000;
        ad2.housingComplex = "ЖК Казань XXI век";
        ad2.address = "пр-т Альберта Камалеева, д. 32Б";
        ad2.nameOfTheMetroStation = "Горки";
        ad2.distanceToTheMetroStation = 2.5;
        ad2.seller = "Агентство недвижимости Ключ";
        ad2.imageSeller = "https://57.img.avito.st/user/logo/300x200/74561257_4481209588.jpg";
        ad2.like = false;
        ad2.created = 28;

        ad3.id = 2084527967;
        ad3.URL = "https://www.avito.ru/kazan/kvartiry/2-k._kvartira_623_m618_et._2084527967";
        ad3.image = "https://77.img.avito.st/image/1/TATYj7ay4O3uJiLozLZ1EyMs4Ot4LuI";
        ad3.rooms = 3;
        ad3.metricArea = 132.1;
        ad3.floor = 4;
        ad3.floorsInTheHouse = 5;
        ad3.price = 21_150_000;
        ad3.verification = "Проверена в ЕГРН";
        ad3.address = "ул. Карла Маркса, д.39А";
        ad3.nameOfTheMetroStation = "Площадь Тукая";
        ad3.distanceToTheMetroStation = 1.1;
        ad3.seller = "Агентство недвижимости Ключ";
        ad3.imageSeller = "https://57.img.avito.st/user/logo/300x200/74561257_4481209588.jpg";
        ad3.like = false;
        ad3.created = 13;

        System.out.println(ad2.metricArea);


    }
}
