package org.znaji.shop.banner;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class BannerLoader {

    @Value("classpath:banner.txt")
    private Resource banner;


    @PostConstruct
    public void showBanner() throws IOException {

        Path path = Path.of(banner.getURI());
        try (var lines = Files.lines(path)) {
            lines.forEachOrdered(System.out::println);
        }
    }
}
