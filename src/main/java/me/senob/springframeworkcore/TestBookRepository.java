package me.senob.springframeworkcore;

import org.springframework.context.annotation.Profile;

@Profile("test")
public class TestBookRepository implements BookRepository{
}
