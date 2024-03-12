package ru.netology;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {

        int flightTimeOne;
        int flightTimeTwo;

        if ((t1.getTimeTo() - t1.getTimeFrom()) < 0) {
            flightTimeOne = 24 - Math.abs(t1.getTimeTo() - t1.getTimeFrom());
        } else {
            flightTimeOne = t1.getTimeTo() - t1.getTimeFrom();
        }

        if ((t2.getTimeTo() - t2.getTimeFrom()) < 0) {
            flightTimeTwo = 24 - Math.abs(t2.getTimeTo() - t2.getTimeFrom());
        } else {
            flightTimeTwo = t2.getTimeTo() - t2.getTimeFrom();
        }

        if (flightTimeOne < flightTimeTwo) {
            return -1;
        } else if (flightTimeOne > flightTimeTwo) {
            return 1;
        } else {
            return 0;
        }
    }

}