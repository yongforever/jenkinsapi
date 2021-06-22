package com.yongforever.controller;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import com.yongforever.api.JobApi;
import com.yongforever.util.JenkinsConnect;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JenkinsController {

    private JobApi jobApi = new JobApi();

    // 创建job
    @RequestMapping("/createJob")
    public void createJob(){
        this.jobApi.ceateJob();
    }
}
