package structural.adapter.request

data class PaymentRequest(val amount: Double, val paymentType: PaymentType) {

    enum class PaymentType {
        CARD, DIGITAL_WALLET
    }
}
