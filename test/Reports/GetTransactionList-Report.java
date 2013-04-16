import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

	public static void main(String[] args) {
	
		try {
	
			Report report = new Report();
            report.setEnvironment("TEST");
			
			RapiResponse response = report.GetTransactionDetailReport(
			"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
			"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
			"range", // 'period' - REQUIRED: Period of search ("today", "yesterday", "range") //
			"100", // 'pageSize' - Optional: Number of transactions per page. Max of 100 //
			"12/25/2012", // 'startDate' - REQUIRED if period=range: Start date for filter MM/DD/YYYY //
			"12/30/2012", // 'endDate' - REQUIRED if period=range: End date for filter MM/DD/YYYY //
			"00:00:00", // 'startTime' - REQUIRED if period=range - Start time for filter //
			"23:59:59", // 'endTime' - REQUIRED if period=range - End time for filter //
			null, // 'orderByName' - Optional: Field to order transactions by ("transactionDate", "status", etc) //
			null, // 'orderByDirection' - Optional: Direction of order ("asc" or "desc") //
			null, // 'startRecordNumber' - Optional: '1' by default //
			null // 'endRecordNumber' - Optional: null by default //
			);

			if (response.getHeader().getErrorCode().equals("0")) {

				if (response.getResult().getRequestToken() == null) {
					//  Success
				}
				else {
					//  If response.Result.RequestToken != null then must execute 'checkRequestStatus'
				}

			}
			else { 
				// Fail
			}

		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}