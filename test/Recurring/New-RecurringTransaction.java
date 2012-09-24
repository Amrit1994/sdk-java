import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.Recurring(
                "merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
                "merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
                "referenceNum", // REQUIRED - Merchant internal order number //
                "chargeTotal", // REQUIRED - Transaction amount in US format //
                "creditCardNumber", // REQUIRED - Full credit card number //
                "expMonth", // REQUIRED - Credit card expiration month //
                "expYear", // REQUIRED - Credit card expiration year //
                "cvvInd", // Optional - Indicator of absense of CVV code  //
                "cvvNumber", // RECOMMENDED - Credit card verification number //
                "processorId", // REQUIRED - Use '1' for testing. Contact our team for production values //
                "numberOfInstallment", // Optional - Number of installments for credit card purchases ("parcelas") //
                "chargeInterest", // Optional - Charge interest flag (Y/N) for installment purchase ("com" e "sem" juros) //
                "ipAddress", // Optional //
                "customerIdExt" // Optional, Merchant internal customer number // 
				"action", // REQUIRED for this command - Always 'new' //
				"startDate", // REQUIRED for this command - Date of the 1st purchase (YYYY-MM-DD format) //
				"frequency", // REQUIRED for this command - Billing frequency ("1", "3", "6", ...) //
				"period", // REQUIRED for this command - Period of billing ("daily", "weekly" or "monthly") //
				"installments", // REQUIRED for this command - Number of payments to be executed //
				"failureThreshold" // REQUIRED for this command - Number of retries if transaction failed //
			);


            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode().equals("0")) {
                    //  APPROVED.
                }
                else {
                    //  DECLINED
                }
            }
            else if(response.IsErrorResponse()) {
                //  ERROR
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}