package org.Criational.Builder;

public interface BuilderProtocol {
    void reset();
    BuilderProtocol buildWindows(int windows);
    BuilderProtocol buildDoors(int doors);
    BuilderProtocol buildRooms(int rooms);
    BuilderProtocol buildGarage();
    BuilderProtocol buildGarden();
    BuilderProtocol buildSwimPool();
    BuilderProtocol buildStatues();
}
