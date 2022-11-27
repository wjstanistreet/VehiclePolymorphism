import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GarageTest {

    Garage garage;
    Motorvehicle car;
    Motorvehicle motorvehicle;

    @BeforeEach
    public void setUp(){
        garage = new Garage();
        car = new Motorvehicle(4, 5, 0, PowerType.GASOLINE, false);
        motorvehicle = new Motorvehicle(4, 5, 0, PowerType.DIESEL, false);
    }

    @Test
    public void canAddCarToBacklog(){
        garage.addCarToBacklog(car);
        assertThat(garage.getBacklog().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveCarFromBacklog(){
        garage.addCarToBacklog(car);
        garage.addCarToBacklog(motorvehicle);

        garage.removeCarFromBacklog(car);
        assertThat(garage.getBacklog().size()).isEqualTo(1);
    }

    @Test
    public void canCalculateBacklogHours(){
        garage.addCarToBacklog(car);
        garage.addCarToBacklog(motorvehicle);

        assertThat(garage.calculateBacklogHours()).isEqualTo(6);
    }

}
