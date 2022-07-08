package appointments;

import employee.Schedule;
import patient.Patient;

import java.util.Date;

public abstract class appointments {
    Patient patient;
    Status status;
    //Date date;

    Schedule schedule;

    Service service;
    //Schedule sc = new Schedule();


    public appointments() {
    }

    public appointments(Patient patient, Schedule schedule, Service service) {
        this.patient = patient;
        //this.date = date;
        this.status = Status.NOTSTARTED;
        this.schedule = schedule;
        this.service = service;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "appointments{" +
                "patient=" + patient +
                ", status=" + status +
                ", schedule=" + schedule +
                ", service=" + service +
                '}';
    }
}
