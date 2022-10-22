public class Human {
    private int yearOfBirth;
    public String name;
    private String town;

    public String job;

    public Human(String name, String town, String job) {
        this(0, name, town, job);
    }
    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth <= 0) {
            //throw new IllegalArgumentException("Возраст не может быть отрицательным и нулевым");
            this.yearOfBirth = 0;
        } else
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
