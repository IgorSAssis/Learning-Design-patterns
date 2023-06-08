package org.Criational.Builder;

public class House {

    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

    private House() {}

    public static class HouseBuilder implements BuilderProtocol {
        private House house;

        public HouseBuilder() {
            this.reset();
        }

        public void reset() {
            this.house = new House();
            this.house.hasGarage = false;
            this.house.hasStatues = false;
            this.house.hasGarden = false;
            this.house.hasSwimPool = false;
        }

        public HouseBuilder buildWindows(int windows) {
            this.house.windows = windows;
            return this;
        }

        public HouseBuilder buildDoors(int doors) {
            this.house.doors = doors;
            return this;
        }

        public HouseBuilder buildRooms(int rooms) {
            this.house.rooms = rooms;
            return this;
        }

        public HouseBuilder buildGarage() {
            this.house.hasGarage = true;
            return this;
        }

        public HouseBuilder buildGarden() {
            this.house.hasGarden = true;
            return this;
        }

        public HouseBuilder buildSwimPool() {
            this.house.hasSwimPool = true;
            return this;
        }

        public HouseBuilder buildStatues() {
            this.house.hasStatues = true;
            return this;
        }

        public House build() {
            return this.house;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimPool=" + hasSwimPool +
                ", hasStatues=" + hasStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
