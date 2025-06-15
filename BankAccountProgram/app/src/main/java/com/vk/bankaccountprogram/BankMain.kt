package com.vk.bankaccountprogram

fun main() {
    val vaibhavBankAccount = BankAccount("Vaibhav", 123.7)
    vaibhavBankAccount.deposit(100.0)
    vaibhavBankAccount.displayTransactionHistory()
    vaibhavBankAccount.deposit(204.0)
    vaibhavBankAccount.displayTransactionHistory()
    vaibhavBankAccount.withdraw(50.0)
    vaibhavBankAccount.displayTransactionHistory()
}