import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");
	
            ResponseBase response = transaction.Sale(
				"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
				"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
				"ORD937393483", // 'referenceNum' - REQUIRED: Merchant internal order number //
				"133.45", // 'chargeTotal' - REQUIRED: Transaction amount in US format //
				"4111111111111111", // 'creditCardNumber' - REQUIRED: Full credit card number //
				"03", // 'expMonth' - REQUIRED: Credit card expiration month with 2 digits //
				"2015", // 'expYear' - REQUIRED: Credit card expiration year with 4 digits //
				null, // 'cvvInd' - Optional: Indicator of absense of CVV code  //
				"123", // 'cvvNumber' - RECOMMENDED: Credit card verification number //
				null, // 'authentication' - Optional: Valid only for Cielo. Please see full documentation for more info //
				"1", // 'processorId' - REQUIRED: Acquirer code for transaction routing Use '1' for testing. //
				"2", // 'numberOfInstallments' - Optional: Number of installments for credit card purchases ("parcelas") //
				   // Send 'null' if no installments are used //
				"N", // 'chargeInterest' - Optional: Charge interest flag (Y/N) for installment purchase ("com" e "sem" juros) //
				"1270.0.1", // 'ipAddress' - Optional //
				null // 'customerIdExt' - Optional: Merchant internal customer number //
				"John Smith", // 'billingName' - RECOMMENDED: Customer name //
				"Rua de Teste, 123", // 'billingAddress' - Optional: Customer address //
				null, // 'billingAddress2' - Optional: Customer address //
				"Rio de Janeiro", // 'billingCity' - Optional: Customer city //
				"RJ", // 'billingState' - Optional: Customer state with 2 characters //
				"20030000", // 'billingPostalCode' - Optional: Customer zip code //
				"BR", // 'billingCountry' - Optional: Customer country per ISO 3166-2 //
				null, // 'billingPhone' - Optional: Customer phone number //
				"support@maxipago.com", // 'billingEmail' - Optional: Customer email addres //
				"Jane Smith", // 'shippingName' - Optional: Shipping name //
				null, // 'shippingAddress' - Optional: Shipping address //
				null, // 'shippingAddress2' - Optional: Shipping address //
				null, // 'shippingCity' - Optional: Shipping city //
				null, // 'shippingState' - Optional: Shipping state with 2 characters //
				null, // 'shippingPostalCode' - Optional: Shipping zip code //
				null, // 'shippingCountry' - Optional: Shipping country per ISO 3166-2 //
				null, // 'shippingPhone' - Optional: Shipping phone number //
				null, // 'shippingEmail' - Optional: Shipping email address //
				null // 'currencyCode' - Optional: Currency code. Valid only for ChasePaymentech. Please see full documentation for more info //
			);
            
            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode().equals("0")) {
                    //  APPROVED
                }
                else {
                    //  DECLINED
                }
            }
            else if(response.IsErrorResponse()) {
                //  Fail.
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}