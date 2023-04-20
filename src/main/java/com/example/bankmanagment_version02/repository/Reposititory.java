package com.example.bankmanagment_version02.repository;

import com.example.bankmanagment_version02.data.model.AddAccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.AddLeaseModel;
import com.example.bankmanagment_version02.data.model.VisitationModel;
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

    public static void addBox(AddBoxModel instance) {
        FileHandling.write(TableName.BOXES_TABLE, instance);
    }

    public static List<AddBoxModel>getBoxes() {
        List<AddBoxModel> list;
        list = FileHandling.read(TableName.BOXES_TABLE);
        return list;
    }
    public static void addLease(AddLeaseModel instance) {
        FileHandling.write(TableName.LEASE_TABLE, instance);
    }

    public static List<AddLeaseModel> getLeases() {
        List<AddLeaseModel> list;
        list = FileHandling.read(TableName.LEASE_TABLE);
        return list;
    }
    public static void addVisitation(VisitationModel instance) {
        FileHandling.write(TableName.VISITATION_CARD_TABLE, instance);
    }

    public static List<VisitationModel> getVisitations() {
        List<VisitationModel> list;
        list = FileHandling.read(TableName.VISITATION_CARD_TABLE);
        return list;
    }




}
