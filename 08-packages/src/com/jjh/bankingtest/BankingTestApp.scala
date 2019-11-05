package com.jjh.bankingtest

import com.jjh.banking.Account
import com.jjh.banking.printAccount

object BankingTestApp extends App {
   val acc = Account("John", 123)
   printAccount(acc)
}
