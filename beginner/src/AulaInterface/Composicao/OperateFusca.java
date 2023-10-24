package AulaInterface.Composicao;

import AulaInterface.Composicao.Direction;
import AulaInterface.Composicao.OperateCar;

public class OperateFusca implements OperateCar {
    @Override //Reescreve por cima de algo que já existe
    public int turn(Direction direction, int radius, int startSpeed, int endSpeed) {
        return 0;
    }

    @Override
    public int changeLanes(Direction direction, int startSpeed, int endSpeed) {
        return 0;
    }

    @Override
    public int signalTurn(Direction direction, boolean signalOn) {
        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, int speedOfCar) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, int speedOfCar) {
        return 0;
    }
}
