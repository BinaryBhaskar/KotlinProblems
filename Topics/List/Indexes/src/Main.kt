fun solution(products: List<String>, product: String) {
    var completeString = ""
    for (index in 0..products.size-1) if (products[index] == product) {
        completeString = "$completeString$index "
    }
    print(completeString.trim())
}