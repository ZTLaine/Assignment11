//  6/16/24
//  Zack Laine
//  Assignment 11

package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//As it stands this class feels superfluous
//But I have a feeling direct calls on the repo should maybe be in their own class?
//For security reasons maybe?  Idk, it sounded like that was how it should be for files
//So I'm assuming repo is the same for now.
@Service
public class RepositoryService {
    private final TransactionRepository transactionRepository = new TransactionRepository();

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
}
