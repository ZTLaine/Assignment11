package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void testFindAll() {
        TransactionService sut = new TransactionService();

        assertNotNull(sut.findAll());
        assertNotNull(sut.findAll().get(0));
        assertEquals(100, sut.findAll().size());
        assertTrue(sut.findAll().get(0).getDate().isBefore(sut.findAll().get(1).getDate()));
//        assertEquals("Amazon", sut.findAll().get(0).getRetailer());
//        assertEquals(38.5, sut.findAll().get(99).getAmount().doubleValue());

    }

    @Test
    void testFindById() {
        TransactionService sut = new TransactionService();
        Long id = 1L;
        Long id2 = 120L;

        Transaction foundTransaction = sut.findById(id);
        Transaction foundTransaction2 = sut.findById(id2);

        assertEquals("Amazon", foundTransaction.getRetailer());
        assertNull(foundTransaction2);
    }

//    @Test
//    void testSortAscendingDate() {
//        TransactionService sut = new TransactionService();
//
//        sut.sortTransactions();
//        List<Transaction> transactions = sut.findAll();
//
//        assertTrue(transactions.get(0).getDate().isBefore(transactions.get(1).getDate()));
//    }
}