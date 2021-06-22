package com.yongforever;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import com.yongforever.util.JenkinsConnect;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class JenkinsapiApplicationTests {

    @Test
    public void connTest() throws IOException {
        JenkinsServer connection = JenkinsConnect.connection();
        JenkinsHttpClient client = JenkinsConnect.getClient();
        connection.createJob("test-job","aa");

    }

}
