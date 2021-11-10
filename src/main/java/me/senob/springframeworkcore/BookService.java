package me.senob.springframeworkcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private TestBookRepository testBookRepository;

}
