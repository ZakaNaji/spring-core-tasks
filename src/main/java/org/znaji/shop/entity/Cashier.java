package org.znaji.shop.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Locale;


public class Cashier {
    private final String fileName;
    private final String path;
    private BufferedWriter writer;

    public Cashier(String fileName, String path) {
        this.fileName = fileName;
        this.path = path;
    }

    @PostConstruct
    public void openFile() throws IOException {
        Path checkoutPath = Path.of(path, fileName + ".txt");
        if (Files.notExists(checkoutPath.getParent())) {
            Files.createDirectories(checkoutPath.getParent());
        }
        this.writer = Files.newBufferedWriter(checkoutPath, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        System.out.println("File created: " + checkoutPath);
    }

    public void checkout(ShoppingCart cart) throws IOException {
        writer.write(LocalDateTime.now() + "\t" + cart.getItems() + "\r\n");
    }

    @PreDestroy
    public void closeFile() throws IOException {
        if (writer != null) {
            writer.close();
            System.out.println("File closed: " + Paths.get(path, fileName + ".txt"));
        }
    }
}
