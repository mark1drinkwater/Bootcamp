package com.example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.Month.*;

public class DepartArrive {

  public static void main(String[] args) {
    // Using the following information:
    //   * Use America/New_York as the time zone for Boston Logan Airport(BOS).
    //   * Use America/Los_Angeles as the time zone for San Francisco Airport (SFO).
    //   * Use Asia/Calcutta as the time zone for Bangalore's Bengaluru International Airport (BLR)
    ZoneId bos = ZoneId.of("America/New_York");
    ZoneId sfo = ZoneId.of("America/Los_Angeles");
    ZoneId blr = ZoneId.of("Asia/Calcutta");
    

    // Flight 123, San Francisco to  Boston, leaves SFO at 10:30 PM June 13, 2014
    // The flight is 5 hours 30 minutes
    //   What is the local time in Boston when the flight takes off?
    //   What is the local time at Boston Logan airport when the flight arrives?
    //   What is the local time in San Francisco when the flight arrives?
    LocalDateTime departure = LocalDateTime.of(2014, JUNE, 13, 22, 30);
    ZonedDateTime departSFO = ZonedDateTime.of(departure, sfo);
    
    System.out.println("Flight 123 departs SFO at:   " + departSFO );
    ZonedDateTime departTimeAtBOS = departSFO.toOffsetDateTime().atZoneSameInstant(bos);
    System.out.println("Local time BOS at departure: " + departTimeAtBOS );
    System.out.println("Flight time: 5 hours 30 minutes");
    
    ZonedDateTime arriveBOS =
            departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(bos);
      System.out.println("Flight 123 arrives BOS:     " + arriveBOS );
    
    ZonedDateTime arriveTimeAtSFO = 
        arriveBOS.toOffsetDateTime().atZoneSameInstant(sfo);
    System.out.println("Local time SFO at arrival:   " + arriveTimeAtSFO);
    System.out.println("");  

      
    // Flight 456, San Francisco to Bangalore, India, leaves SFO at Saturday, 10:30 PM June 28, 2014
    // The flight time is 22 hours
    //   Will the traveler make a meeting in Bangalore Monday at 9 AM local time?
    //   Can the traveler call her husband at a reasonable time when she arrives?
    departure = LocalDateTime.of(2014, JUNE, 28, 22, 30);
    departSFO = ZonedDateTime.of(departure, sfo);
    System.out.println("Flight 456 leaves SFO at:    " + departSFO);
      System.out.println("");
      
    ZonedDateTime departTimeAtBLR = departSFO.toOffsetDateTime().atZoneSameInstant(blr);
    System.out.println("Local time BLR at departure: " + departTimeAtBLR);
    System.out.println("Flight time: 22 hours");
    
    ZonedDateTime arriveBLR = departSFO.plusHours(22).toOffsetDateTime().atZoneSameInstant(blr);
    System.out.println("Flight 456 arrives BLR:    " + arriveBLR);
    
    arriveTimeAtSFO =
            arriveBLR.toOffsetDateTime().atZoneSameInstant(sfo);
    System.out.println("Local time SFO at arrival:   " + arriveTimeAtSFO);
      System.out.println("");

    // Flight 123, San Francisco to Boston, leaves SFO at 10:30 PM Saturday, November 1st, 2014
    // Flight time is 5 hours 30 minutes.
    //   What day and time does the flight arrive in Boston?
    //   What happened?
    departure = LocalDateTime.of(2014, NOVEMBER, 1, 10, 30);
    departSFO = ZonedDateTime.of(departure, sfo);
    
    System.out.println("Flight 123 departs SFO at: " + departSFO);
    
    departTimeAtBOS = departSFO.toOffsetDateTime().atZoneSameInstant(bos);
    System.out.println("Local time BOS at departure: " + departTimeAtBOS);
    System.out.println("Flight time: 5 hours 30 minutes");
    
    // Add 5 hours 30 minutes to depart time & convert it to boston time
    arriveBOS = departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(bos);
    System.out.println("Flight 123 arrives BOS:    " + arriveBOS);
    arriveTimeAtSFO = arriveBOS.toOffsetDateTime().atZoneSameInstant(sfo);
    System.out.println("Local time SFO at arrival:    " + arriveTimeAtSFO);
    System.out.println("");
  }

}
