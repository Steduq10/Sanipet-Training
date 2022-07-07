package employees;

import employee.WorkingDay;

public class Day {
    WorkingDay workingDay;

    public Day(WorkingDay workingDay) {
        this.workingDay = workingDay;
    }

    public void Dayis(){
        switch (workingDay)
        {
            case MONDAY:
                System.out.println("Los lunes son feos.");
                break;
            case TUESDAY:
                System.out.println("Los viernes son mejores.");
                break;
            case WEDNESDAY:
                System.out.println();
                break;
            case THURSDAY:
                System.out.println("Los fines de semana son mejores.");
                break;
            case FRIDAY:
                System.out.println();
                break;
            case SATURDAY:
                System.out.println();
                break;
            default:
                System.out.println("Los días entre semana son regulares.");
                break;
        }

    }

    public static void main(String[] args) {
        String str = "LUNES";
        Day t1 = new Day(WorkingDay.valueOf(str));
        t1.Dayis();
    }
}
