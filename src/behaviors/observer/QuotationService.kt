package behaviors.observer

class QuotationService {

    fun register(quotation: Quotation) {
        listOf(Bank(), Investor())
            .forEach { it.notify(quotation) }
    }
}