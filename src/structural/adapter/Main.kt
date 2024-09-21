package structural.adapter

import structural.adapter.factory.PaymentFactory
import structural.adapter.request.PaymentRequest

fun main() {
    val paymentFactory = PaymentFactory()
    val paymentService = PaymentService(paymentFactory)

    val paymentByCard = PaymentRequest(amount = 100.0, paymentType = PaymentRequest.PaymentType.CARD)
    paymentService.pay(paymentByCard)

    val paymentByDigitalWallet = PaymentRequest(amount = 250.0, paymentType = PaymentRequest.PaymentType.DIGITAL_WALLET)
    paymentService.pay(paymentByDigitalWallet)

}