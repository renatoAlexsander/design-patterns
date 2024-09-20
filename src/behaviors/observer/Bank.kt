package behaviors.observer

class Bank : Observer {

    override fun notify(quotation: Quotation) {
        println("Bank notify new quotation $quotation");
    }
}