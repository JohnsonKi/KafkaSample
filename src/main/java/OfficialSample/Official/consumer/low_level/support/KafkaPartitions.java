/*
 * Copyright 2015-2020 uuzu.com All right reserved.
 */
package OfficialSample.Official.consumer.low_level.support;

import java.util.Map;

/**
 * @author zxc Mar 30, 2017 3:59:36 PM
 */
public class KafkaPartitions {

    private String             version;
    private Map<String, int[]> partitions;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, int[]> getPartitions() {
        return partitions;
    }

    public void setPartitions(Map<String, int[]> partitions) {
        this.partitions = partitions;
    }
}
