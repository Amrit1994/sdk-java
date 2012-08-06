import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.Sale(
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
				"chargeInterest", // Optional - Charge interest lfag (Y/N) for installment purchase ("com" e "sem" juros) //
				"ipAddress", // Optional //
				"customerToken", // REQUIRED - Customer ID replied by maxiPago! after creating a customer profile //
				"onFileEndDate", // Optional - Date the credit card token will no longer be available for use //
				"onFilePermission", // Optional - Sets period of use of token: 'ongoing' or 'use_once' //
				"onFileComment", // Optional //
				"onFileMaxChargeAmount", // Optional - Maximum amount this card can be charged //
				"billingName", // RECOMMENDED - Customer name //
				"billingAddress", // Optional - Customer address //
				"billingAddress2", // Optional - Customer address //
				"billingCity", // Optional - Customer city //
				"billingState", // Optional - Customer state with 2 characters //
				"billingPostalCode", // Optional - Customer zip code //
				"billingCountry", // Optional - Customer country per ISO 3166-2 //
				"billingPhone", // Optional - Customer phone number //
				"billingEmail", // Optional - Customer email address //
				"currencyCode" // Optional - Currency code. Valid only for ChasePaymentech. Please see full documentation for more info //
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
                // Fail
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}