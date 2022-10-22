import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //createHuman();
        //createCar();
        createFlower();
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

        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "России");
        System.out.println("Бренд: "+ ladaGranta.brand
                + "; Модель: " + ladaGranta.model
                + "; Объем двигателя: " + ladaGranta.engineVolume
                + "; Цвет кузова: " + ladaGranta.color
                + "; Год производства: " + ladaGranta.productionYear
                + "; Страна сборки: " + ladaGranta.productionCountry);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        System.out.println("Бренд: "+ audi.brand
                + "; Модель: " + audi.model
                + "; Объем двигателя: " + audi.engineVolume
                + "; Цвет кузова: " + audi.color
                + "; Год производства: " + audi.productionYear
                + "; Страна сборки: " + audi.productionCountry);

        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        System.out.println("Бренд: "+ bmw.brand
                + "; Модель: " + bmw.model
                + "; Объем двигателя: " + bmw.engineVolume
                + "; Цвет кузова: " + bmw.color
                + "; Год производства: " + bmw.productionYear
                + "; Страна сборки: " + bmw.productionCountry);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        System.out.println("Бренд: "+ kia.brand
                + "; Модель: " + kia.model
                + "; Объем двигателя: " + kia.engineVolume
                + "; Цвет кузова: " + kia.color
                + "; Год производства: " + kia.productionYear
                + "; Страна сборки: " + kia.productionCountry);

        Car hyundai = new Car("", "", 0, "", 0, "");
        System.out.println("Бренд: "+ hyundai.brand
                + "; Модель: " + hyundai.model
                + "; Объем двигателя: " + hyundai.engineVolume
                + "; Цвет кузова: " + hyundai.color
                + "; Год производства: " + hyundai.productionYear
                + "; Страна сборки: " + hyundai.productionCountry);
    }
}