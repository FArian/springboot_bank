package com.app.bank.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class AccountTypeConverter implements AttributeConverter<ACCOUNTS, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ACCOUNTS accountType) {
        return accountType.getValue(); // Hier verwenden Sie die entsprechende Methode, um den Integer-Wert des Enums zu erhalten.
    }

    @Override
    public ACCOUNTS convertToEntityAttribute(Integer value) {
        return ACCOUNTS.fromValue(value); // Hier verwenden Sie die entsprechende Methode, um das Enum-Objekt aus dem Integer-Wert wiederherzustellen.
    }
}
