package com.example;

import com.example.thread.AnalyzerTextPool;
import com.example.thread.ResourceStrategy;

import java.nio.file.FileSystems;
import java.nio.file.Path;


public class TextAnalyzerApplication {
    public static void main(String[] args) throws InterruptedException {
        Path src = FileSystems.getDefault().getPath("src/main/resources");
        AnalyzerTextPool.AnalyzerTextPoolBuilder builder = AnalyzerTextPool.builder();
        ResourceStrategy.RECURSIVE.apply(src).forEach(builder::addThread);
        AnalyzerTextPool pool = builder.build();
        System.out.println(pool.execute());
        pool.shutdown();
    }
}