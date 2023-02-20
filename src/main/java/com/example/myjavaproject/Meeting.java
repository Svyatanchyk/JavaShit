package com.example.myjavaproject;

import java.time.LocalDate;

public class Meeting {
    Meeting() {

    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;
    }

    private String theme;
    private int participantCount;

    public void fill(LocalDate date, String theme, int partCount) {
        this.date = date;
        this.theme = theme;
        this.participantCount = partCount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
