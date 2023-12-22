package com.poja.big-sum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.big-sum.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
