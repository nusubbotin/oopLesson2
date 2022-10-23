import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //createHuman();
        createCar();
        //createFlower();
    }

    private static void createFlower() {
        System.out.println("Создаем Цветник:");
        Flower roza = new Flower("Роза", "красный", "Голландия", 35.59f);
        System.out.println(roza);

        Flower hrizantema = new Flower("Хризантема", "", "", 15, 5);
        System.out.println(hrizantema);

        Flower pion = new Flower("Пион", "", "Англии", 69.9f,1);
        System.out.println(pion);

        Flower gipsofila = new Flower("Гипсофила", "", "Турция", 19.5f,10);
        System.out.println(gipsofila);

    }

    private static void createHuman() {
        System.out.println("Создаем базу данных сотрудников:");

        final int CURR_YEAR = LocalDate.now().getYear();

        Human vladimir = new Human(21, "Владимир", "Казани", null);
        System.out.println("Привет! Меня зовут " + vladimir.name
                + ". Я из города " + vladimir.getTown()
                + ". Я родился в " + (CURR_YEAR - vladimir.getYearOfBirth())
                + " году. Я работаю на должности " + vladimir.job
                + ". Будем знакомы!");

        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        System.out.println("Привет! Меня зовут " + maxim.name
                + ". Я из города " + maxim.getTown()
                + ". Я родился в " + (CURR_YEAR - maxim.getYearOfBirth())
                + " году. Я работаю на должности " + maxim.job
                + ". Будем знакомы!");

        Human any = new Human(29, "Аня", "Москва", "методист образовательных программ");
        System.out.println("Привет! Меня зовут " + any.name
                + ". Я из города " + any.getTown()
                + ". Я родилась в " + (CURR_YEAR - any.getYearOfBirth())
                + " году. Я работаю на должности " + any.job
                + ". Будем знакомы!");

        Human katy = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        System.out.println("Привет! Меня зовут " + katy.name
                + ". Я из города " + katy.getTown()
                + ". Я родилась в " + (CURR_YEAR - katy.getYearOfBirth())
                + " году. Я работаю на должности " + katy.job
                + ". Будем знакомы!");

        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + artem.name
                + ". Я из города " + artem.getTown()
                + ". Я родился в " + (CURR_YEAR - artem.getYearOfBirth())
                + " году. Я работаю на должности " + artem.job
                + ". Будем знакомы!");

        Human testInParam = new Human(-1, "Test", "Test", "test");
        System.out.println("Привет! Меня зовут " + testInParam.name
                + ". Я из города " + testInParam.getTown()
                + ". Я родился в " + (CURR_YEAR - testInParam.getYearOfBirth())
                + " году. Я работаю на должности " + testInParam.job
                + ". Будем знакомы!");

        Human testInParam2 = new Human(5, null, "", "");
        System.out.println("Привет! Меня зовут " + testInParam2.name
                + ". Я из города " + testInParam2.getTown()
                + ". Я родился в " + (CURR_YEAR - testInParam2.getYearOfBirth())
                + " году. Я работаю на должности " + testInParam2.job
                + ". Будем знакомы!");
    }
    private static void createCar() {
        System.out.println("Создаем автопарк:");

        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "России","механика", "внедорожник", "v123vv123", 4, Car.CAT_TIRES_SUMMER);
        Car.Insurance insurance = ladaGranta.new Insurance(2025, 5000, "123456789");
        ladaGranta.setInsurance(insurance);
        System.out.println(ladaGranta);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия","механика", "внедорожник", "n123nn123", 4, Car.CAT_TIRES_SUMMER);
        Car.Insurance audiInsurance = audi.new Insurance(2024, 10_000, "123456788");
        audi.setInsurance(audiInsurance);
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия","механика", "внедорожник", "t123tt123", 4, Car.CAT_TIRES_SUMMER);
        Car.Insurance bmwInsurance = bmw.new Insurance(2024, 10_000, "123456777");
        bmw.setInsurance(bmwInsurance);
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея","механика", "внедорожник", "5123fg123", 4, Car.CAT_TIRES_SUMMER);
        Car.Insurance kiaInsurance = kia.new Insurance(2023, 3000, "023456788");
        kia.setInsurance(kiaInsurance);
        System.out.println(kia);

        Car hyundai = new Car("", "", 0, "", 0, "","механика", "внедорожник", "q123er123", 4, Car.CAT_TIRES_SUMMER);
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2024, 2000, "123456666");
        hyundai.setInsurance(hyundaiInsurance);
        System.out.println(hyundai);

        hyundai.changeTires();
        System.out.println("hyundai.getCarTires() = " + hyundai.getCarTires());

        Car.Key key = hyundai.new Key(true, true);
        hyundai.setKey(key);

        //Car.Key key2 = hyundai.new Key(true, false);
        //hyundai.setKey(key2);
    }
}