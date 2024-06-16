//  6/16/24
//  Zack Laine
//  Assignment 11

package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void testFindAll() {
        TransactionService sut = new TransactionService();

        assertNotNull(sut.findAll());
        assertNotNull(sut.findAll().get(0));
        assertEquals(100, sut.findAll().size());
        assertTrue(sut.findAll().get(0).getDate().isBefore(sut.findAll().get(1).getDate()));
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
}