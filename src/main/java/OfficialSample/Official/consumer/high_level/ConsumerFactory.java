package OfficialSample.Official.consumer.high_level;

import kafka.consumer.KafkaStream;

public interface ConsumerFactory {
    Consumer create(KafkaStream<byte[], byte[]> stream, int threadNumber);
}
