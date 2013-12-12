package maxiPago.DataContract.Reports;

public class Record {

	private String referenceNumber;
	String taxAmount;
	String shippingAmount;
	String userId;
	String bankRoutingNumber;
	String achAccountNumber;
	private String customerId1;
	
	/*
	 * C�digo de autoriza��o da Adquirente
	 */
    private String approvalCode;

    /*
     * Coment�rios
     */
    private String comments;

    /*
     * Nome da empresa
     */
    private String companyName;

    /*
     * C�digo de meio de pagamento
     */
    private String creditCardType;

    /*
     * ID do cliente
     */
    private String customerId;

    /*
     * ID do Pedido
     */
    private String orderId;
    
    /*
     * Id da Processadora
     */
    private String processorID;

    /*
     * Meio de pagamento utilizado
     */
    private String paymentType;

    /*
     * Flag de pagamento recorrente
     */
    private String recurringPaymentFlag;

    /*
     * C�digo de resposta da maxiPago!
     */
    private String responseCode;

    /*
     * Valor do pedido, em centavos
     */
    private String transactionAmount;

    /*
     * ID da transa��o
     */
    private String transactionId;

    /*
     * Status da transa��o
     */
    private String transactionStatus;
    
    /*
     * Status da transa��o
     */
    private String transactionState;

    /*
     * Opera��o realizada
     */
    private String transactionType;

    /*
     * Data da transa��o
     */
    private String transactionDate;
    private String avsResponseCode;
    private String billingAddress1;
    private String billingAddress2;
    private String billingCity;
    private String billingCountry;
    private String billingEmail;
    private String billingName;
    private String billingPhone;
    private String billingState;
    private String billingZip;

    /*
     * N�mero identificador do boleto ("Nosso N�mero").
     */
    private String boletoNumber;

    /*
     * Data de vencimento do boleto. Formato mm/dd/aaaa.
     */
    private String expirationDate;

    /*
     * Data de pagamento do boleto, se o banco a informou. Formato mm/dd/aaaa.
     */
    private String dateOfPayment;

    /*
     * Data de liquida��o do valor, se o banco a informou. Formato mm/dd/aaaa.
     */
    private String dateOfFunding;

    /*
     * C�digo FEBRABAN do banco onde foi feito o pagamento.
     */
    private String bankOfPayment;

    /*
     * Ag�ncia onde foi feito o pagamento.
     */
    private String branchOfPayment;

    /*
     * Valor pago pelo cliente.
     */
    private String paidAmount;

    /*
     * Taxa de cobran�a do boleto, se o banco a informou.
     */
    private String bankFee;

    /*
     * Valor l�quido a receber (valor pago - taxa)
     */
    private String netAmount;

    /*
     * C�digo de pagamento do boleto no banco.
     */
    private String returnCode;

    /*
     * C�digo de liquida��o do banco, se informado.
     */
    private String clearingCode;

    public String getReferenceNumber() {
		return referenceNumber;
	}
    
	public String getApprovalCode() {
		return approvalCode;
	}

	public String getComments() {
		return comments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public String getRecurringPaymentFlag() {
		return recurringPaymentFlag;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}
	
	public String getTransactionState() {
		return transactionState;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public String getAvsResponseCode() {
		return avsResponseCode;
	}

	public String getBillingAddress1() {
		return billingAddress1;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public String getBillingEmail() {
		return billingEmail;
	}

	public String getBillingName() {
		return billingName;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public String getBillingState() {
		return billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public String getBoletoNumber() {
		return boletoNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public String getDateOfPayment() {
		return dateOfPayment;
	}

	public String getDateOfFunding() {
		return dateOfFunding;
	}

	public String getBankOfPayment() {
		return bankOfPayment;
	}

	public String getBranchOfPayment() {
		return branchOfPayment;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public String getBankFee() {
		return bankFee;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public String getClearingCode() {
		return clearingCode;
	}

	public String getProcessorID() {
		return processorID;
	}
	
	private String customField1;
    private String customField2;
    private String customField3;
    private String customField4;
    private String customField5;
    private String boletoUrl;
    private String numberOfInstallment;
    private String chargeInterest;

	public String getCustomField1() {
		return customField1;
	}

	public String getCustomField2() {
		return customField2;
	}

	public String getCustomField3() {
		return customField3;
	}

	public String getCustomField4() {
		return customField4;
	}

	public String getCustomField5() {
		return customField5;
	}

	public String getBoletoUrl() {
		return boletoUrl;
	}

	public String getNumberOfInstallment() {
		return numberOfInstallment;
	}

	public String getChargeInterest() {
		return chargeInterest;
	}
	
	
	
	
	
}
