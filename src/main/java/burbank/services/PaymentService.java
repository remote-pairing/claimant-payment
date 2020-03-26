package burbank.services;

import burbank.domain.PaymentServiceResponse;
import burbank.exception.BadAccountDetailsException;
import burbank.exception.BankCommunicationException;

public class PaymentService {

    public PaymentServiceResponse makePayment(String accountName,
                                              String accountCode,
                                              String sortCode,
                                              String referenceNumber)
            throws BankCommunicationException,BadAccountDetailsException {

        return null;
    }
}
