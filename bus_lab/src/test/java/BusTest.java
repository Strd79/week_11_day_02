import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Partick", 10);
        person = new Person();
        busStop = new BusStop("Partick Cross");
    }

    @Test
    public void checkBusHasDestination() {
        assertEquals("Partick", bus.getDestination());
    }

    @Test
    public void checkBusCapacity() {
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void passengersStartsEmpty() {
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void cannotAddPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(10, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void canPickUpPersonFromQueue() {
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.countPassengers());
    }
}
