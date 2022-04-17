package company.Automobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void stopAfterBeginningOfDrivingTestOfWorking() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.stop();
        //Assert
        Assertions.assertFalse(car.engine.isWorking());
    }
    @Test
    void stopAfterBeginningOfDrivingTestOfSpeedEquals() {
        //Arrange
        PassengerCar car = new PassengerCar("",new Engine(),1,2);
        //Act
        car.beginningOfDriving();
        car.stop();
        //Assert
        Assertions.assertEquals(0,car.getSpeed());
    }
}