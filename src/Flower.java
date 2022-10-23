public class Flower {
    private String name;
    private String flowerColor = "белый";
    private String country = "Россия";
    private float cost = 1;
    int lifeSpan = 3;

    public Flower(String name, String flowerColor, String country, float cost) {
        this(name, flowerColor, country, cost, 3);
    }
    public Flower(String name, String flowerColor, String country, float cost, int lifeSpan) {
        this.name = name;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        }else
        {
            this.flowerColor = "белый";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty()) {
            this.country = country;
        }else
        {
            this.country = "Россия";
        }
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        }else
        {
            this.cost = 1;
        }
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan == 0){
            this.lifeSpan = 3;
        }else
        {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Название: " + name +
                ", цвет: " + flowerColor +
                ", страна: " + country +
                ", цена: " + cost +
                ", срок: " + lifeSpan;
    }
}
