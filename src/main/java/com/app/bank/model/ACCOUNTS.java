package com.app.bank.model;

public enum ACCOUNTS {
   DEBIT(0),
   CREDIT(1);

   private final int value;

   ACCOUNTS(int value) {
      this.value = value;
   }

   public static ACCOUNTS fromValue(int value) {
      for (ACCOUNTS account : ACCOUNTS.values()) {
         if (account.value == value) {
            return account;
         }
      }
      throw new IllegalArgumentException("Invalid integer value for ACCOUNTS enum");
   }

   public int getValue() {
      return value;
   }
}

