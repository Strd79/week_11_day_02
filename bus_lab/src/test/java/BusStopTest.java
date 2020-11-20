import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before() {
        busStop = new BusStop("Partick Cross");
        person = new Person();
    }

    @Test
    public void checkBusStopHasName() {
        assertEquals("Partick Cross", busStop.getName());
    }

    @Test
    public void checkBusStopQueueIsEmpty() {
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(1, busStop.countQueue());
    }

}
