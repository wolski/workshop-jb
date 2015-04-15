package v_collections

import java.util.HashSet

fun example9() {
    val product = listOf(1, 2, 3, 4).fold(1, { partProduct, element -> element * partProduct })
    product == 24
}

// The same as
fun whatFoldDoes(): Int {
    var product = 1
    listOf(1, 2, 3, 4).forEach { element -> product = element * product}
    return product
}

fun Shop.getProductsOrderedByAllCustomers(): Set<Product> {
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        // Return the set of products ordered by all customers
        orderedByAll.intersect(customer.orderedProducts)
    })
}
