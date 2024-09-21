package structural.adapter

import structural.adapter.factory.PaymentFactory
import structural.adapter.request.PaymentRequest

class PaymentService(val paymentFactory: PaymentFactory) {

    fun pay(paymentRequest: PaymentRequest) {
        println("Starting payment ${paymentRequest.paymentType}")
        val paymentMethod = paymentFactory.getPaymentMethod(paymentRequest.paymentType)
        paymentMethod?.pay(paymentRequest.amount)
    }
}