package structural.adapter.factory

import structural.adapter.CardPayment
import structural.adapter.CreditCardPayment
import structural.adapter.DigitalWalletPayment
import structural.adapter.DigitalWalletPaymentAdapter
import structural.adapter.request.PaymentRequest

class PaymentFactory {

    private val paymentMethods: Map<PaymentRequest.PaymentType, CardPayment> = mapOf(
        PaymentRequest.PaymentType.DIGITAL_WALLET to DigitalWalletPaymentAdapter(DigitalWalletPayment()),
        PaymentRequest.PaymentType.CARD to CreditCardPayment(),
    )

    fun getPaymentMethod(paymentType: PaymentRequest.PaymentType): CardPayment? {
        return paymentMethods[paymentType]
    }

}