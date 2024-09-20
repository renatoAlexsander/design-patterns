package behaviors.observer

class Investor : Observer {

    override fun notify(quotation: Quotation) {
        println("Investor notify new quotation $quotation");
    }
}