package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TravelCalculatePremiumServiceImplTest {

    @Test
    void TestTravelCalculatePremiumKonstResponse() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Ykov");
        request.setPersonFirstName("Roma");
        request.setAgreementDateFrom(new Date());
        request.setAgreementDateTo(new Date());

        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        assertEquals(request.getPersonLastName(), response.getPersonLastName());
        assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

}