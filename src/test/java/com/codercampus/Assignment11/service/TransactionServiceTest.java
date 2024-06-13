package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void find_all() {
        TransactionService sut = new TransactionService();

        assertNotNull(sut.findAll());
        assertEquals(100, sut.findAll().size());
        assertEquals("Amazon", sut.findAll().get(0).getRetailer());
        assertEquals(38.5, sut.findAll().get(99).getAmount().doubleValue());

    }

    @Test
    void sort_ascending_date() {
        TransactionService sut = new TransactionService();

        sut.sortTransactions();
        List<Transaction> transactions = sut.findAll();

        assertTrue(transactions.get(0).getDate().isBefore(transactions.get(1).getDate()));
    }
}