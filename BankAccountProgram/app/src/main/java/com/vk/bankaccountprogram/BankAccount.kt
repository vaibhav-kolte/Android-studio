package com.vk.bankaccountprogram

class BankAccount(
    private val accountHolder: String,
    private var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited Rs. $amount")
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            transactionHistory.add("$accountHolder withdraw Rs. $amount")
        } else {
            println("Insufficient balance to withdraw.")
        }
    }

    fun displayTransactionHistory() {
        transactionHistory.forEach { v ->
            println(v)
        }
    }
}