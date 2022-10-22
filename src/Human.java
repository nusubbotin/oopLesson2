public class Human {
    public int yearOfBirth;
    public String name;
    public String town;

    public String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            //throw new IllegalArgumentException("Возраст не может быть отрицательным");
            System.out.println("Возраст не может быть отрицательным");
            this.yearOfBirth = 1;
        }else
        {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }

        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }

        if (job == null || job.isEmpty()) {
            this.job = "Информация не указана";
        }else {
            this.job = job;
        }
    }
}
