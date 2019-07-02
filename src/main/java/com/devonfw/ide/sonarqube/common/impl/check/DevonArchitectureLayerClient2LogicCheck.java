package com.devonfw.ide.sonarqube.common.impl.check;

import org.sonar.check.Priority;
import org.sonar.check.Rule;

import com.devonfw.ide.sonarqube.common.api.JavaType;

/**
 * {@link DevonArchitectureCheck} verifying that client layer does not depend on logic layer.
 */
@Rule(key = "Devon4j:L3", name = "Devon Layer Client-Logic Check", //
    description = "Verify that client layer does not depend on logic layer.", //
    priority = Priority.BLOCKER, tags = { "architecture-violation" })
public class DevonArchitectureLayerClient2LogicCheck extends DevonArchitectureCheck {

  @Override
  protected String checkDependency(JavaType source, JavaType target) {

    if (source.isLayerClient() && target.isLayerLogic()) {
      return "Code from client layer ('" + source.toString() + "') shall not depend on logic layer ('"
          + target.toString() + "').";
    }
    return null;
  }

}
