package com.example.myjavaproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    static public void main(String[] args) {
        Conference conference = new Conference();

        List<Meeting> meetingList = new ArrayList<>();

        Meeting meeting;

        LocalDate meetingStartDate = LocalDate.of(2023, 5, 10);

        meeting = new Meeting();
        meeting.fill(meetingStartDate, "JAVA PROGRAMMING MEETING 1", 20);
        meetingList.add(meeting);

        meeting = new Meeting();
        meeting.fill(meetingStartDate.plusDays(5), "JAVA PROGRAMMING MEETING 2", 14);
        meetingList.add(meeting);

        meeting = new Meeting();
        meeting.fill(meetingStartDate.plusDays(11), "JAVA PROGRAMMING MEETING 3", 3);
        meetingList.add(meeting);

        conference.setMeetingList(meetingList);
        conference.setName("Conference of downs");
        conference.setPlaceOfEvent("Jo Mama");

        System.out.println("Average participant count on meetings: " + conference.avgParticipantCount());
        System.out.println("Most visited meeting: " + conference.mostVisitedMeeting());
        System.out.println("Conference name length: " + conference.nameLength());
    }
}

