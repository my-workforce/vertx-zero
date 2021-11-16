package io.vertx.tp.fm.cv;

interface Prefix {

    String _EVENT = "Ἀτλαντὶς νῆσος://χρηματοδότηση/";
}

public interface Addr {

    interface BillItem {
        String FETCH_AGGR = Prefix._EVENT + "FETCH/AGGR";
        String FETCH_BOOK = Prefix._EVENT + "FETCH/BOOK";
        // Split
        String UP_SPLIT = Prefix._EVENT + "BILL-ITEM/SPLIT";
        String UP_REVERT = Prefix._EVENT + "BILL-ITEM/REVERT";
        // Cancel
        String UP_CANCEL = Prefix._EVENT + "BILL-ITEM/CANCEL";
    }

    interface Bill {
        // Pre + Authorize
        String IN_PRE = Prefix._EVENT + "BILL/PRE";
        // Common, Bill + Items
        String IN_COMMON = Prefix._EVENT + "BILL/COMMON";
        // Multi, Bill + n Items
        String IN_MULTI = Prefix._EVENT + "BILL/MULTI";
        // Transfer
        String UP_TRANSFER = Prefix._EVENT + "BILL/TRANSFER";
    }

    interface Settle {
        // Finish
        String UP_PAYMENT = Prefix._EVENT + "BILL/PAYMENT";
    }
}