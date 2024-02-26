package Ejerciciosconfechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Main {
	public static void main(String[]args) {
		
	
    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	//1
    System.out.println("1-" + LocalDate.now());
    
    //2
    System.out.println("2-" + LocalDateTime.now());
    
    //3
    System.out.println("3-" + LocalDateTime.now(ZoneId.of("Europe/Paris")));
    
    //4
    LocalDate f5 = LocalDate.of(2022, 12, 10);
    System.out.println("4-" + f5.format(formato1));
    
    //5
    LocalDate f6 = LocalDate.of(2020, 12, 7);
    System.out.println("5-" + f6.getMonthValue() + "-"
            + f6.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
    
    //6
    System.out.println("6-" + Year.isLeap(2022));
    
    //7
    YearMonth mesa = YearMonth.of(2020, 2);
    System.out.println("7-" + mesa.isValidDay(29));
    
    //8
    LocalDate f9 = LocalDate.of(2010, 2, 20);
    System.out.println("8-" + f9.plusDays(30));
    
    //9
    LocalDate f10 = LocalDate.of(2009, 12, 15);
    System.out.println("9-" + f10.plusMonths(1));
    
    //10
    LocalDate f11 = LocalDate.of(2001, 10, 7);
    System.out.println("10-" + f11.until(LocalDate.of(2004, 5, 10), ChronoUnit.DAYS));
    //11
    System.out.println("11-" + f11.until(LocalDate.of(2004, 5, 10), ChronoUnit.MONTHS));

    //12
    LocalDate f12 = LocalDate.parse("07/10/2001", formato1);
    System.out.println("12-" + f12.until(LocalDate.parse("10/05/2004", formato1), ChronoUnit.YEARS));
    
	//13
    System.out.println("13-" + f12.until(LocalDate.parse("10/05/2004", formato1), ChronoUnit.DAYS) * 24);
    
    //14
    LocalDate f14 = LocalDate.parse("03/02/2020", formato1);
    System.out.println("14-" + f14.until(LocalDate.parse("05/07/2021", formato1)));
    
    //15
    LocalDate f15 = LocalDate.parse("12-11-2022", formato2);
    Period periodo = f15.until(LocalDate.parse("05/07/2021", formato1));
    System.out.println("15-" + f15.plus(periodo));
    
    //16
    LocalDate f16 = LocalDate.parse("22-04-2022", formato2);
    System.out.println("16-" + f16.getDayOfWeek());
    
    //17
    LocalDate hoy = LocalDate.now();
    LocalDate hace3 = hoy.minusDays(3);
    System.out.println("17-" + hace3.getDayOfWeek());
    
    //18
    Locale es = new Locale("es", "ES");
    System.out.println("18-" + hace3.getMonth().getDisplayName(TextStyle.FULL, es));
    
    //19
    LocalDate fecha = YearMonth.of(1940, Month.OCTOBER).atEndOfMonth();
    System.out.println("19-" + fecha.getDayOfWeek());
    
    //20
    System.out.println("20-" + LocalDate.ofYearDay(1989, 253));
    
    //21
    LocalTime inicio = LocalTime.of(10, 15);
    LocalTime fin = LocalTime.of(12, 30);
}
}
