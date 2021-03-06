package com.leeha.baseball.controller;

public class BaseballGameOption {

    private final int ballCount;
    private final int minimumBallNumber;
    private final int maximumBallNumber;

    public BaseballGameOption(int ballCount, int minimumBallNumber, int maximumBallNumber) {
        this.ballCount = ballCount;
        this.minimumBallNumber = minimumBallNumber;
        this.maximumBallNumber = maximumBallNumber;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getMinimumBallNumber() {
        return minimumBallNumber;
    }

    public int getMaximumBallNumber() {
        return maximumBallNumber;
    }
}
