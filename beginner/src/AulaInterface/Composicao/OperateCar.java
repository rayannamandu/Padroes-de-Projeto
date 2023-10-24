package AulaInterface.Composicao;

import AulaInterface.Composicao.Direction;

public interface OperateCar {
    // Constantes, se houver

    public int turn(Direction direction, int radius, int startSpeed, int endSpeed);
    int changeLanes(Direction direction, int startSpeed, int endSpeed);
    int signalTurn(Direction direction, boolean signalOn);
    int getRadarFront(double distanceToCar, int speedOfCar);
    int getRadarRear(double distanceToCar, int speedOfCar);

}
