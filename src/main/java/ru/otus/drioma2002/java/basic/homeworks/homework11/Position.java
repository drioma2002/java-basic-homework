package ru.otus.drioma2002.java.basic.homeworks.homework11;

public enum Position {
    DIRECTOR (PositionType.MANAGER),
    BRANCH_DIRECTOR (PositionType.MANAGER),
    SENIOR_MANAGER (PositionType.MANAGER),
    MANAGER (PositionType.MANAGER),
    ENGINEER (PositionType.EMPLOYEE),
    DEVELOPER (PositionType.EMPLOYEE),
    JUNIOR_DEVELOPER (PositionType.EMPLOYEE),
    QA (PositionType.EMPLOYEE),
    DRIVER (PositionType.EMPLOYEE),
    PLUMBER (PositionType.EMPLOYEE),
    JANITOR (PositionType.EMPLOYEE);

    private final PositionType positionType;

    Position(PositionType positionType) {
        this.positionType = positionType;
    }

    public boolean isManager() {
        return this.positionType == PositionType.MANAGER;
    }
}
