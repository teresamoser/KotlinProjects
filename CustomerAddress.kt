
data class Customer(val name: String, val address: String, val email: String)

fun main(args: Array<String>) {
    val cust1 = Customer("Lois Lane", "159 Planet Ave", "laneLo@PlanJ.com")
    val name1 = cust1.component1()
    val address1 = cust1.component2()
    val email1 = cust1.component3()
    println("Customer 1: $name1")
    println("Address: $address1")
    println("Email: $email1")
    println()

    val cust2 = Customer("Jack B. Nimble", "2646 Mother Goose ", "nimbleJ@MothGoo.com")
    val name2 = cust2.component1()
    val address2 = cust2.component2()
    val email2 = cust2.component3()
    println("Customer 2: $name2")
    println("Address: $address2")
    println("Email: $email2")
    println()

    val cust3 = Customer("Frank N. Stein", "6996 Castle Road", "steinFr@Monster.com")
    val name3 = cust3.component1()
    val address3 = cust3.component2()
    val email3 = cust3.component3()
    println("Customer 3: $name3")
    println("Address: $address3")
    println("Email: $email3")

}