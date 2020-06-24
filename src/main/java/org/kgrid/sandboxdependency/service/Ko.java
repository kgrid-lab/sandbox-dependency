package org.kgrid.sampledependency.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Ko {
  static Map<String,String> rules = new HashMap<>();

  static {
    rules.put("foo","bar");
    rules.put("apple","banana");
    rules.put("up","down");
    rules.put("left","right");
  }

  public String id() { return UUID.randomUUID().toString(); }

  public String apply(String key) {
    return rules.get(key);
  }

}
