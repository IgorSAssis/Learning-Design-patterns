package org.Criational.Builder;

public class Director {

    private BuilderProtocol builder;

    public Director(BuilderProtocol builder) {
        this.builder = builder;
    }

    public void buildSmallHouse() {
        System.out.println("Building a small house");
        this.builder.buildDoors(3);
        this.builder.buildWindows(4);
        this.builder.buildRooms(4);
    }

    public void buildSmallHouseWithGarage() {
        System.out.println("Building a small house with garage");
        this.buildSmallHouse();
        this.builder.buildGarage();
    }

    public void buildMediumHouse() {
        System.out.println("Building a medium house with garage");
        this.builder.buildDoors(5);
        this.builder.buildWindows(8);
        this.builder.buildRooms(6);
        this.builder.buildGarage();
    }

    public void buildLargeHouse() {
        System.out.println("Building a large house with garage");
        this.builder.buildDoors(5);
        this.builder.buildWindows(8);
        this.builder.buildRooms(8);
        this.builder.buildGarage();
        this.builder.buildSwimPool();
        this.builder.buildStatues();
    }
}
