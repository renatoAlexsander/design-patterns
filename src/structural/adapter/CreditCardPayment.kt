package structural.adapter

class CreditCardPayment : CardPayment {

    override fun pay(amount: Double) {
        println("Paying $amount by Credit Card")
    }
}