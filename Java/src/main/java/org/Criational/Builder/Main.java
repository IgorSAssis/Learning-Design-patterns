package org.Criational.Builder;

public class Main {

    public static void main(String[] args) {

        House.HouseBuilder houseBuilder = new House.HouseBuilder();
        Director houseDirector = new Director(houseBuilder);

        houseDirector.buildSmallHouse();
        House h1 = houseBuilder.build();
        System.out.println(h1);

        houseBuilder.reset();
        houseDirector.buildMediumHouse();
        House h2 = houseBuilder.build();
        System.out.println(h2);

        houseBuilder.reset();
        houseDirector.buildLargeHouse();
        House h3 = houseBuilder.build();
        System.out.println(h3);
    }

}
