package Design-Patterns;
// Fluent builder approach
/*
    The Builder Design Pattern is a creational design pattern in object-oriented
    programming. It is used when you want to construct a complex object step by
    step, separating the construction process from the representation of the object.
 */

// Product
class House {
    private String walls;
    private String roof;
    private String floor;

    // Private constructor
    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.floor = builder.floor;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", floor=" + floor + "]";
    }

    // Builder Class
    static class HouseBuilder {
        private String walls;
        private String roof;
        private String floor;

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

// Client
public class Builder {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setWalls("Brick Walls")
                .setRoof("Concrete Roof")
                .setFloor("Marble Floor")
                .build();

        System.out.println(house);
    }
}
