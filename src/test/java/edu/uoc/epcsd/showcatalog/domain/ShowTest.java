package edu.uoc.epcsd.showcatalog.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jasim
 */


class ShowTest {
    private Show show;


    @BeforeEach
    void setUp() {
        show = Show.builder().build();
    }

    @Test
    public void whenCreatedShowIsCancelled_thenStatusIsCancelled() {
        assertEquals(Status.CREATED, show.getStatus());
        show.cancel();
        assertEquals(Status.CANCELLED, show.getStatus());
    }



}