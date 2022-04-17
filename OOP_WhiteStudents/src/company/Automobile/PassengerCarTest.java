package company.Automobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PassengerCarTest {

    @Test
    void speedBoostTestOfSpeedEquals() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.speedBoost(100);
        //Assert
        Assertions.assertEquals(160, car.getSpeed());
    }

    @Test
    void speedOverBoostTestOfEngineRight() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.speedBoost(500);
        //Assert
        Assertions.assertFalse(car.engine.isRight());
    }

    @Test
    void speedOverBoostTestOfEngineWorking() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.speedBoost(500);
        //Assert
        Assertions.assertFalse(car.engine.isWorking());
    }

    @Test
    void speedOverBoostTestOfSpeedEquals() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.speedBoost(500);
        //Assert
        Assertions.assertEquals(0,car.getSpeed());
    }

    @Test
    void beginningOfDrivingTestOfEngineWorking() {
        //Arrange
        PassengerCar car = new PassengerCar("", new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        //Assert
        Assertions.assertTrue(car.engine.isWorking());
    }

    @Test
    void beginningOfDrivingTestOfSpeedEquals(){
        //Arrange
        PassengerCar car = new PassengerCar("", new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        //Assert
        Assertions.assertEquals(60, car.getSpeed());
    }
}