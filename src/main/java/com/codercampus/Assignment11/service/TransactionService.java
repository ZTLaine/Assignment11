//  6/16/24
//  Zack Laine
//  Assignment 11

package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TransactionService {
    private final RepositoryService repositoryService;
    private List<Transaction> transactions;

    public TransactionService() {
        repositoryService = new RepositoryService();
        transactions = repositoryService.findAll();
        this.sortTransactions();
    }

    public List<Transaction> findAll() {
        return transactions;
    }

    public void sortTransactions() {
        transactions.sort(Comparator.comparing(Transaction::getDate));
    }

    public Transaction findById(Long transactionId) {
        return transactions.stream()
                .filter(transaction -> transaction.getId().equals(transactionId))
                .findFirst()
                .orElse(null);
    }
}
