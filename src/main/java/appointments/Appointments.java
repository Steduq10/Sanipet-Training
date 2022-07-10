package appointments;

import employee.Schedule;
import patient.Patient;
import java.util.Scanner;
public class Appointments {
        Patient patient;
        String status;
        //Date date;
        Schedule schedule;
        public Appointments() {
        }
        public Appointments(Patient patient, Schedule schedule, String status) {
            this.patient = patient;
            this.status = status ;
            this.schedule = schedule;
        }
        public Patient getPatient() {
            return patient;
        }
        public void setPatient(Patient patient) {
            this.patient = patient;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public Schedule getSchedule() {
            return schedule;
        }
        public void setSchedule(Schedule schedule) {
            this.schedule = schedule;
        }
        public void StatusNotStarted() {
            Scanner sc = new Scanner(System.in);
            Appointments state = new Appointments();
            String status = "Not started";
            System.out.println("Which is the status of the appointment: \n" +
                    "1. Not started\n" +
                    "2. Cancelled\n" +
                    "3. Finished");
            int st = sc.nextInt();
            switch (st){
                case 1:
                    System.out.println("appointment not started");
                    state.setStatus("Not started");
                    break;
                case 2:
                    System.out.println("appointment cancelled");
                    state.setStatus("Cancelled");
                    break;
                case 3:
                    System.out.println("appointment finished");
                    state.setStatus("Finished");
                    Medicine medicine = new Medicine();
                    medicine.GlobalStock();
                    break;
            }
        }
        @Override
        public String toString() {
            return "appointments{" +
                    "patient=" + patient +
                    ", status=" + status +
                    ", schedule=" + schedule +
                    '}';
        }
    }


