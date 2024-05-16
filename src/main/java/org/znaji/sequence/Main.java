package org.znaji.sequence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("org.znaji.shop.sequence")) {
            var sequenceDao = context.getBean("sequenceDao", SequenceDao.class);

            System.out.println(sequenceDao.getNextValue("IT"));
            System.out.println(sequenceDao.getNextValue("IT"));
        }
    }
}
