package appointments;

import employee.Schedule;
import patient.Patient;

import java.util.Date;

public abstract class appointments {
    Patient patient;
    String status = "Not started";
    Date date;
    Schedule sc = new Schedule();

    public void doctorAppointment(){

    }
}
