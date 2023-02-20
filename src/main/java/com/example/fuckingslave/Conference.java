package com.example.fuckingslave;

import java.util.*;

public class Conference {
    Conference() {

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfEvent() {
        return placeOfEvent;
    }

    public void setPlaceOfEvent(String placeOfEvent) {
        this.placeOfEvent = placeOfEvent;
    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    private String placeOfEvent;

    private List<Meeting> meetingList;

    public int avgParticipantCount() {
        int meetingParticipantCount = 0;
        for (Meeting meet : meetingList) {
            meetingParticipantCount += meet.getParticipantCount();
        }
        return meetingParticipantCount / meetingList.size();
    }

    public String mostVisitedMeeting() {
        Meeting maxPartMeet = meetingList.stream()
                .max(Comparator.comparingInt(Meeting::getParticipantCount))
                .get();
        return maxPartMeet.getTheme();
    }
    
    public int nameLength() {
        return name.length();
    }
}
