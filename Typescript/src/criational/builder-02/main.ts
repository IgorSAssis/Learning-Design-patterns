class House {
    public _windows: number | undefined;
    public _doors: number | undefined;
    public _rooms: number | undefined;
    public _hasGarage: boolean | undefined;
    public _hasSwimPool: boolean | undefined;
    public _hasStatues: boolean | undefined;
    public _hasGarden: boolean | undefined;
}

interface HouseBuilderProtocol {
    reset(): this;
    withWindows(windows: number): this;
    withDoors(doors: number): this;
    withRooms(rooms: number): this;
    withGarage(): this;
    withSwimPool(): this;
    withStatues(): this;
    withGarden(): this;
}

class HouseDirector {
    constructor(public _builder: HouseBuilderProtocol) {}

    setBuilder(builder: HouseBuilderProtocol): void {
        this._builder = builder;
    }

    buildSmallHouse(): void {
        this._builder.withDoors(4);
        this._builder.withWindows(8);
        this._builder.withRooms(6);
        this._builder.withGarage();
    }

    buildMediumHouse(): void {
        this._builder.withDoors(8);
        this._builder.withWindows(10);
        this._builder.withRooms(8);
        this._builder.withGarden();
        this._builder.withGarage();
    }

    buildLargeHouse(): void {
        this._builder.withDoors(8);
        this._builder.withWindows(10);
        this._builder.withRooms(8);
        this._builder.withGarden();
        this._builder.withSwimPool();
        this._builder.withStatues();
        this._builder.withGarage();
    }
}

class HouseBuilder implements HouseBuilderProtocol {
    private _house = {} as House;

    constructor() {
        this.reset();
    }

    reset(): this {
        this._house = new House();
        this._house._hasGarage = false;
        this._house._hasSwimPool = false;
        this._house._hasStatues = false;
        this._house._hasGarden = false;
        return this;
    }

    withWindows(windows: number): this {
        this._house._windows = 2;
        return this;
    }
    withDoors(doors: number): this {
        this._house._doors = doors;
        return this;
    }
    withRooms(rooms: number): this {
        this._house._rooms = rooms;
        return this;
    }
    withGarage(): this {
        this._house._hasGarage = true;
        return this;
    }
    withSwimPool(): this {
        this._house._hasSwimPool = true;
        return this;
    }
    withStatues(): this {
        this._house._hasStatues = true;
        return this;
    }
    withGarden(): this {
        this._house._hasGarden = true;
        return this;
    }
    build(): House {
        return this._house;
    }
}

// Without builder
// const house1 = new House(4, 2, 4, true, false, false, false);
// const house2 = new House(4, 2, 4, true, true, true, true);

const houseBuilder = new HouseBuilder();

// const simpleHouse = houseBuilder
//     .withRooms(4)
//     .withWindows(6)
//     .withDoors(4)
//     .build();
// console.log(simpleHouse);

// const houseWithSwimPool = houseBuilder
//     .withRooms(4)
//     .withWindows(6)
//     .withDoors(4)
//     .withSwimPool()
//     .build();
// console.log(houseWithSwimPool);

const director = new HouseDirector(houseBuilder);

director.buildSmallHouse();
const simpleHouse = houseBuilder.build();
console.log(simpleHouse);

director.buildMediumHouse()
const mediumHouse = houseBuilder.build();
console.log(mediumHouse);

director.buildLargeHouse();
const largeHouse = houseBuilder.build();
console.log(largeHouse);
