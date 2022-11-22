import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorvehicleTest{

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle(4, 5, 0.0, PowerType.ELECTRIC);
    }

    @Test
    public void canStartVehicle() {
        vehicle.ignition();
        assertThat(vehicle.isEngineOn()).isEqualTo(true);
    }

}
