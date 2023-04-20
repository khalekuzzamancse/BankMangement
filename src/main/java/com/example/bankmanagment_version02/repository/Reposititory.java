package com.example.bankmanagment_version02.repository;

import com.example.bankmanagment_version02.data.model.AddAccountModel;
import datastorage.TableName;
import datastorage.file.FileHandling;
import datastorage.file.FileIO;

import java.util.ArrayList;
import java.util.List;

public class Reposititory {
    public static void addAccount(AddAccountModel account) {
        //FileIO.write(TableName.ACCOUNTS_TABLE, account);
        FileHandling.write(TableName.ACCOUNTS_TABLE, account);
    }

    public static List<AddAccountModel> getAccounts() {
        List<AddAccountModel> customerList;
        //customerList = FileIO.read(TableName.ACCOUNTS_TABLE);
        customerList = FileHandling.read(TableName.ACCOUNTS_TABLE);
        return customerList;
    }


}
