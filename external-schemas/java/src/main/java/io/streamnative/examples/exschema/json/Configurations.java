/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.streamnative.examples.exschema.json;

import io.confluent.kafka.serializers.json.KafkaJsonSchemaSerializerConfig;

import java.util.HashMap;
import java.util.Map;

public class Configurations {

    protected static final String TOKEN = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImM4MjE4ZDUyLWViMjktNTY0Mi04YTc1LTRkNzkyMjY3MzVkYiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidXJuOnNuOnB1bHNhcjpvLTJoMDU2OnVuaWZpZWQtc2NoZW1hIl0sImV4cCI6MTc2MTQ0NzUxOCwiaHR0cHM6Ly9zdHJlYW1uYXRpdmUuaW8vc2NvcGUiOlsiYWRtaW4iLCJhY2Nlc3MiXSwiaHR0cHM6Ly9zdHJlYW1uYXRpdmUuaW8vdXNlcm5hbWUiOiJyZ2FvQG8tMmgwNTYuYXV0aC5zbmNsb3VkLXN0Zy5kZXYiLCJpYXQiOjE3NTg4NTU1MjIsImlzcyI6Imh0dHBzOi8vcGMtYzQxZDM3OGEuYXdzLXVzZTEtdGVzdC1pMjdwNS5hd3Muc24zLmRldi9hcGlrZXlzLyIsImp0aSI6ImEzOTY1ZTcwZTY1MzRiOTU5Nzg2ZTVlMzkyOTI3MThlIiwicGVybWlzc2lvbnMiOltdLCJzdWIiOiJzNFVUd21URDhDd2FyU0RPWDAzRVJMVXhNUHNOUFpvYkBjbGllbnRzIn0.Ip6G40R4DJdwJKAQt3Q4N163R_onDn_oWsGC1I58oLjwk6NzL5-GCMhhCXiA8FJGkHjnRSFidOwXeQ_iYOUSzGLfjCIJCdaHTNmBLTmjVm-tgAz4OZ4ru40-nEe4Gml638AAF3c_7ujwkJ4B4aVbuQhlSEORDUn_xOXh22xyH3VqX2phj20bI7LEx1CFauHIHdJFrydvMgH7tuiyqwIcp7MfuEGsnGFSO9JPQLA7kbwHcKGm2CjPHr1b8wMVDgK2wHA07vCsXZNKWoEcO6qR5bS93wiJhk1n3A2znCnMvzWethBo6D9v8x6j8GCgJTLb8WWaYOUOKWdckMi6enSC_Q";
    protected static final String PULSAR_SERVICE_URL = "pulsar+ssl://pc-c41d378a.aws-use1-test-i27p5.aws.sn3.dev:6651";
    private static final String SCHEMA_REGISTRY_URL = "https://pc-c41d378a.aws-use1-test-i27p5.aws.sn3.dev/kafka";

    public static Map<String, Object> getSchemaRegistryConfigs() {
        var map = new HashMap<String, Object>();
        map.put(KafkaJsonSchemaSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
        map.put(KafkaJsonSchemaSerializerConfig.BASIC_AUTH_CREDENTIALS_SOURCE, "USER_INFO");
        map.put(
                KafkaJsonSchemaSerializerConfig.USER_INFO_CONFIG,
                String.format("%s:%s", "public", TOKEN));
        return map;
    }

}
