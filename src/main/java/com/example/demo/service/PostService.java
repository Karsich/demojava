package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post[] posts = {new Post("Продается телевизор, купили новый. Торг уместен"),
                        new Post("Стерилизация - единственное гуманное и эффективное решение проблемы бездомных животных."),
                        new Post("Линька – естественный процесс обновления шерстного покрова, характерный для большинства животных.")};

        return new ArrayList<Post>(Arrays.asList(posts));
    }
}
