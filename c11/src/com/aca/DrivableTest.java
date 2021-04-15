package com.aca;

public class DrivableTest {
    public interface Drivable {
        public void drive();
    }

    public interface Parkable {
        public void park();
    }

    public interface Steerable {
        public void steer();
    }

    public interface Flyable {
        public void fly();
    }

    public class Car implements Drivable, Parkable, Steerable {
        public void drive() {
            // do driving stuff
        }

        public void park() {
            // do parking stuff
        }

        public void steer() {
            // do steering stuff
        }
    }

    public class Boat implements Steerable {
        public void steer() {
            // do steering stuff
        }
    }

    public class Plane implements Flyable {
        public void fly() {
            // do flying stuff
        }
    }
}
