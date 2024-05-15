package org.znaji.sequence;

public interface SequenceDao {

    int getNextValue(String sequenceId);
    Sequence getSequence(String sequenceId);
}
