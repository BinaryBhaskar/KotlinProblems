fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    val myWishList = mutableMapOf<String, Int>()
    myWishList.putAll(wishList.filterValues { it <= limit })
    return myWishList
}