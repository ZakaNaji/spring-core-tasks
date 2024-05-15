package org.znaji.sequence;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository("sequenceDao")
public class SimpleSequenceImpl implements SequenceDao{

    private final Map<String, Sequence> sequences = new ConcurrentHashMap<>();
    private final Map<String, AtomicInteger> values = new ConcurrentHashMap<>();

    public SimpleSequenceImpl() {
        sequences.put("IT", new Sequence("IT", "30", "A"));
        values.put("IT", new AtomicInteger(100));
    }

    @Override
    public int getNextValue(String sequenceId) {
        return values.get(sequenceId).getAndIncrement();
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get(sequenceId);
    }

}
