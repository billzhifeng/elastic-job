/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.job.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleJobConfig {
    
//    @Resource
//    private ZookeeperRegistryCenter regCenter;
//    
//    @Resource
//    private JobEventConfiguration jobEventConfiguration;
//    
//    @Bean(name="simpleJob")
//    public SimpleJob simpleJob() {
//        return new SpringSimpleJob(); 
//    }
//    
//    @Bean(initMethod = "init")
//    public JobScheduler simpleJobScheduler(@Qualifier("simpleJob") final SimpleJob simpleJob, @Value("${simpleJob.cron}") final String cron, @Value("${simpleJob.shardingTotalCount}") final int shardingTotalCount,
//                                           @Value("${simpleJob.shardingItemParameters}") final String shardingItemParameters) {
//        return new SpringJobScheduler(simpleJob, regCenter, getLiteJobConfiguration(simpleJob.getClass(), cron, shardingTotalCount, shardingItemParameters), jobEventConfiguration);
//    }
//    
//    private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass, final String cron, final int shardingTotalCount, final String shardingItemParameters) {
//        return LiteJobConfiguration.newBuilder(new SimpleJobConfiguration(JobCoreConfiguration.newBuilder(
//                jobClass.getName(), cron, shardingTotalCount).shardingItemParameters(shardingItemParameters).build(), jobClass.getCanonicalName())).overwrite(true).build();
//    }
}
