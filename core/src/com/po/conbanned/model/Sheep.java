package com.po.conbanned.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

import java.util.HashSet;

public class Sheep implements Runner {
    public static final float RADIUS = 2.2f;
    public static final float FLOCK_RADIUS = 10f;

    private static final float TURN_SPEED_DEG_PER_SEC = 360f;
    private static final float MOVE_SPEED_UNIT_PER_SEC = 16f;
    private static final float DESTINATION_ARRIVED_THRESHOLD = 0.3f;
    private static final float MOVE_SPEED_DECREASE_FROM_DISTANCE = 5f;
    private static final float ACCELERATION_SPEED_PER_SEC = 25f;

    private Vector2 orientation;
    private Vector2 velocity;
    private Vector2 desiredMovement;
    private Body body;
    private HashSet<Sheep> flock = new HashSet<Sheep>();

    public Sheep() {
        orientation = new Vector2();
        velocity = new Vector2();
        desiredMovement = new Vector2();
    }

    public HashSet<Sheep> getFlock() {
        return flock;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public Vector2 getPosition() {
        return body.getPosition();
    }

    public Vector2 getOrientation() {
        return orientation;
    }

    @Override
    public Vector2 getVelocity() {
        return velocity;
    }

    @Override
    public float getAccelerationSpeedPerSec() {
        return ACCELERATION_SPEED_PER_SEC;
    }

    @Override
    public float getTurnSpeedDegPerSec() {
        return TURN_SPEED_DEG_PER_SEC;
    }

    @Override
    public float getMoveSpeedUnitPerSec() {
        return MOVE_SPEED_UNIT_PER_SEC;
    }

    @Override
    public float getDestinationArrivedThreshold() {
        return DESTINATION_ARRIVED_THRESHOLD;
    }

    @Override
    public float getMoveSpeedDecreaseFromDistance() {
        return MOVE_SPEED_DECREASE_FROM_DISTANCE;
    }

    public Vector2 getDesiredMovement() {
        return desiredMovement;
    }
}
