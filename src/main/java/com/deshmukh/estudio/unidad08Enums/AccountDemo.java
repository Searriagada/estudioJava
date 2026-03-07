package com.deshmukh.estudio.unidad08Enums;

/**
 *
 * @author Usuario
 */

enum AccountType{
    CHECKING, SAVINGS, FIXED_DEPOSIT;
}

class Account{
    String acctId;
    AccountType acctType;
    
    public Account(String acctId, AccountType acctType){
        this.acctId = acctId;
        this.acctType = acctType;   
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        
        //Uso directo de una constante enum
        Account a1 = new Account("001", AccountType.CHECKING);
        Account a2 = new Account("002", AccountType.SAVINGS);
        Account a3 = new Account("003", AccountType.FIXED_DEPOSIT);
        
        // imprimir valor de enum
        
        System.out.println(a1.acctId + " -> "+a1.acctType);
        
        //comparar con == (los enums son singleton)
        if(a1.acctType == AccountType.CHECKING){
            System.out.println("la cuenta 001 es una cuenta corriente");
        }
        
        // switch con enum
        switch(a2.acctType){
            case CHECKING:
                System.out.println("Cuenta corriente");
            case FIXED_DEPOSIT:
                System.out.println("Depósito a plazo");
            case SAVINGS:
                System.out.println("Cuenta de ahorro");
        }
        
        //Iterar los valores
        System.out.println("\nTipos de cuenta");
        for(AccountType tipo : AccountType.values()){
            System.out.println("  - " + tipo);
        }
        
        //Obtener enum desde un string con valueOf();
        AccountType tipo = AccountType.valueOf("SAVINGS");
        System.out.println("\nEnum desde String: "+tipo);
        
        // ordinal() name()
        System.out.println("\nOrdinal de FIXED_DEPOSIT: "+AccountType.FIXED_DEPOSIT.ordinal());
        System.out.println("Name de FIXED_DEPOSIT: "+AccountType.FIXED_DEPOSIT.name());
        
    }
}
