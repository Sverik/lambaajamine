package com.po.conbanned.model;

import com.badlogic.gdx.math.Vector2;

public interface Runner {
    Vector2 getPosition();

    Vector2 getOrientation();

    Vector2 getVelocity();

    float getAccelerationSpeedPerSec();

    float getTurnSpeedDegPerSec();

    float getMoveSpeedUnitPerSec();

    float getDestinationArrivedThreshold();

    float getMoveSpeedDecreaseFromDistance();
}