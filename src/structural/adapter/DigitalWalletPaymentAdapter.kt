package structural.adapter

class DigitalWalletPaymentAdapter(val digitalWalletPayment: DigitalWalletPayment) : CardPayment {

    override fun pay(amount: Double) {
        println("Using adapter for digital wallet payment")
        digitalWalletPayment.pay(amount)
    }
}