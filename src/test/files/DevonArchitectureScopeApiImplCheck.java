/*
 * This is a header...
 */
package io.oasp.ide.sonarqube.common.api;

import io.oasp.ide.sonarqube.common.impl.Bar; // Noncompliant

class MyClass {

  private io.oasp.ide.sonarqube.common.impl.Foo foo; // Noncompliant

  private Bar bar;

  public io.oasp.ide.sonarqube.common.impl.Foo getFoo() { // Noncompliant
    return this.foo;
  }

  public void init() {

    this.foo = new io.oasp.ide.sonarqube.common.impl.Foo();// Noncompliant
  }

}