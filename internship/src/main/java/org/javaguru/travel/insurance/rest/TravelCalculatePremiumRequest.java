package org.javaguru.travel.insurance.rest;

import java.util.Date;

public class TravelCalculatePremiumRequest {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumRequest() {}

    public TravelCalculatePremiumRequest(String firstName,
                                                   String lastName,
                                                   Date from,
                                                   Date to) {
        personFirstName = firstName;
        personLastName = lastName;
        agreementDateFrom = from;
        agreementDateTo = to;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public Date getAgreementDateFrom() {
        return agreementDateFrom;
    }

    public void setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return agreementDateTo;
    }

    public void setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }
}
