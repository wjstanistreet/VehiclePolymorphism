import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorvehicleTest{

    Motorvehicle car;

    @BeforeEach
    public void setUp(){
        car = new Motorvehicle(4, 5, 0.0, PowerType.ELECTRIC, false);
    }

    @Test
    public void canStartEngine() {
        car.startEngine();
        assertThat(car.isEngineOn()).isEqualTo(true);
    }

    @Test
    public void canStopEngine() {
        car.stopEngine();
        assertThat(car.isEngineOn()).isEqualTo(false);
    }

}
