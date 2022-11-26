import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle(4, 5, 0.0, PowerType.ELECTRIC);
    }

    @Test
    public void canAccelerate(){
        vehicle.accelerate();
        assertThat(vehicle.getVelocity()).isEqualTo(15);
    }

    @Test
    public void canDecelerate(){
        vehicle.setVelocity(30.0);
        vehicle.decelerate();
        assertThat(vehicle.getVelocity()).isEqualTo(15);
    }
}
