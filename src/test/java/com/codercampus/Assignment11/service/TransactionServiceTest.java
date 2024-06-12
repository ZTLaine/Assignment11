package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void find_all() {
        TransactionService service = new TransactionService();
        List<Transaction> transactions = service.findAll();

        assertNotNull(transactions);
        assertEquals(100, transactions.size());
        assertEquals("Amazon", transactions.get(0).getRetailer());
        assertEquals(38.5, transactions.get(99).getAmount().doubleValue());

    }

    @Test
    void sort_ascending_date() {
        TransactionService service = new TransactionService();
        List<Transaction> transactions = service.findAll();
    }
}