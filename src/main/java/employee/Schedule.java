package employee;

import java.time.DayOfWeek;


public class Schedule {

    protected String startTime;
    protected String endTime;
    protected DayOfWeek day;


    public Schedule() {

    }

    public Schedule(String startTime, String endTime, int day) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = DayOfWeek.of(day);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }
}
