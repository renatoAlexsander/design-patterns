package behaviors.observer

fun main() {
    val quotationService = QuotationService()
    quotationService.register(Quotation(currency = "$", 5.50))
}