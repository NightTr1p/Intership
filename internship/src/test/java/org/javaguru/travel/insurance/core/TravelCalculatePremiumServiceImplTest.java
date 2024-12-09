package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TravelCalculatePremiumServiceImplTest {

    @Test
    void TestTravelCalculatePremiumResponseFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        String test = "roma";
        request.setPersonFirstName(test);
        response.setPersonFirstName(test);

        assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    void TestTravelCalculatePremiumResponseLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        String test = "ykov";
        request.setPersonLastName(test);
        response.setPersonLastName(test);

        assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    void TestTravelCalculatePremiumResponseDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        Date date = new Date(1212421424L);
        request.setAgreementDateFrom(date);
        response.setAgreementDateFrom(date);

        assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    void TestTravelCalculatePremiumResponseDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        Date date = new Date(1212421424L);
        request.setAgreementDateTo(date);
        response.setAgreementDateTo(date);

        assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

}